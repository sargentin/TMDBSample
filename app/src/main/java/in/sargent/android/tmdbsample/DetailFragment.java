package in.sargent.android.tmdbsample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;

import in.sargent.android.tmdbsample.api.ApiClient;
import in.sargent.android.tmdbsample.api.model.Movie;
import in.sargent.android.tmdbsample.api.model.MovieDetail;
import in.sargent.android.tmdbsample.data.DataManager;
import io.realm.Realm;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link MainActivity}
 * in two-pane mode (on tablets) or a {@link DetailActivity}
 * on handsets.
 */
public class DetailFragment extends Fragment {
    private static final String TAG = "DetailFragment";
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_MOVIE_ID = "movie_id";
    public static final String ARG_TITLE = "title";

    /**
     * The dummy content this fragment is presenting.
     */
    private int movieId;
    private String movieTitle;
    private Movie movie;

    private Realm realm;

    private TextView mReleaseDate;
    private TextView mOverview;
    private ImageView mPoster;
    private Button mButton;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public DetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

        realm = Realm.getDefaultInstance();

        if (getArguments().containsKey(ARG_MOVIE_ID)) {
            movieId = getArguments().getInt(ARG_MOVIE_ID);
            movieTitle = getArguments().getString(ARG_TITLE);
            movie = DataManager.getInstance(realm).getMovie(movieId);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_detail, container, false);

        mReleaseDate = rootView.findViewById(R.id.tv_detail_release_date);
        mOverview = rootView.findViewById(R.id.tv_detail_overview);
        mPoster = rootView.findViewById(R.id.iv_detail_poster);
        mButton = rootView.findViewById(R.id.bt_more_info);

        if (movie != null) {
            mReleaseDate.setText(getString(R.string.release_date, movie.getReleaseDate().substring(0, 4)));
            mOverview.setText(movie.getOverview());
            TMDBApp.getInstance().getImageLoader().load(ApiClient.IMAGE_ENDPOINT + movie.getPosterPath()).into(mPoster);
            mPoster.setContentDescription(movie.getTitle());

            TextView title = rootView.findViewById(R.id.tv_detail_title);
            if (title != null) {
                title.setText(movie.getTitle());
            }
        }

        checkDetail();
        initListeners();

        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        // Reinitialize after screen rotation
        if (realm != null) {
            realm = Realm.getDefaultInstance();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        realm.close();
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.movie_actions, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_share:
                String subject = "[TMDB Sample] " + movie.getTitle();
                String message = movie.getTitle() + "\n\n"
                        + movie.getOverview();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.putExtra(Intent.EXTRA_TEXT, message);
                intent.setType("text/plain");
                startActivity(Intent.createChooser(intent, getString(R.string.action_share)));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private void checkDetail() {
        // Update IMDB path
        if (movie.getImdbPath() == null) {
            Response.Listener<String> listener = new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Gson gson = new Gson();
                    MovieDetail movieDetail = gson.fromJson(response, MovieDetail.class);
                    DataManager.getInstance(realm).updateFromDetail(movie, movieDetail);
                }
            };
            StringRequest request = ApiClient.getInstance().getMovieDetail(listener, "" + movieId);
            TMDBApp.getInstance().addToRequestQueue(request);
        }
    }

    private void initListeners() {
        // Send IMDB Url into browser to see more movie detail
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(movie.getImdbPath()));
                startActivity(intent);
            }
        });
    }
}
