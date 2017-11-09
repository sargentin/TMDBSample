package in.sargent.android.tmdbsample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import javax.annotation.Nullable;

import in.sargent.android.tmdbsample.adapter.MovieRecyclerViewAdapter;
import in.sargent.android.tmdbsample.api.model.Movie;
import in.sargent.android.tmdbsample.data.DataManager;
import in.sargent.android.tmdbsample.impl.OnRecyclerViewClickListener;
import io.realm.OrderedCollectionChangeSet;
import io.realm.OrderedRealmCollectionChangeListener;
import io.realm.Realm;
import io.realm.RealmResults;

/**
 * An activity representing a list of Items. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@link DetailActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private RealmResults<Movie> movies;
    private Realm realm;

    private OnRecyclerViewClickListener mRecyclerViewClickListener;

    private MovieRecyclerViewAdapter mAdapter;

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());

        // The detail container view will be present only in the
        // large-screen layouts (res/values-w900dp).
        // If this view is present, then the
        // activity should be in two-pane mode.
        if (findViewById(R.id.item_detail_container) != null) {
            mTwoPane = true;
        }

        realm = Realm.getDefaultInstance();

        initData();
        initListeners();

        mAdapter = new MovieRecyclerViewAdapter(movies, mRecyclerViewClickListener, mTwoPane);

        RecyclerView recyclerView = findViewById(R.id.item_list);
        assert recyclerView != null;
        recyclerView.setAdapter(mAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Reinitialize after screen rotation
        if (realm != null) {
            realm = Realm.getDefaultInstance();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        mRecyclerViewClickListener = null;
        movies.removeAllChangeListeners();
        realm.close();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    /**
     * Initialize movie list
     */
    private void initData() {
        movies = DataManager.getInstance(realm).getMovies();
    }

    /**
     * Initialize listeners
     */
    private void initListeners() {
        // Initialize click listener on list item
        mRecyclerViewClickListener = new OnRecyclerViewClickListener() {
            @Override
            public void OnRecyclerViewItemClick(View view, int position) {
                Movie item = (Movie) view.getTag();
                if (mTwoPane) {
                    DetailFragment fragment = new DetailFragment();
                    Bundle arguments = new Bundle();
                    arguments.putInt(DetailFragment.ARG_MOVIE_ID, item.getId());
                    fragment.setArguments(arguments);
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.item_detail_container, fragment)
                            .commit();
                } else {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, DetailActivity.class);
                    intent.putExtra(DetailFragment.ARG_MOVIE_ID, item.getId());
                    context.startActivity(intent);
                }
            }
        };

        // Initialize change listener when db changes
        movies.addChangeListener(new OrderedRealmCollectionChangeListener<RealmResults<Movie>>() {
            @Override
            public void onChange(RealmResults<Movie> movies, @Nullable OrderedCollectionChangeSet changeSet) {
                mAdapter.updateData(movies);
            }
        });
    }
}
