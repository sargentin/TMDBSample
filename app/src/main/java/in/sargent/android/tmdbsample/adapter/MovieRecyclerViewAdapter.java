package in.sargent.android.tmdbsample.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import in.sargent.android.tmdbsample.R;
import in.sargent.android.tmdbsample.TMDBApp;
import in.sargent.android.tmdbsample.api.ApiClient;
import in.sargent.android.tmdbsample.api.model.Movie;
import in.sargent.android.tmdbsample.impl.OnRecyclerViewClickListener;

/**
 * Created by sargentin on 08/11/2017.
 */

public class MovieRecyclerViewAdapter extends RecyclerView.Adapter<MovieRecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "MovieRecycler";

    private List<Movie> movies = new ArrayList<>();
    private OnRecyclerViewClickListener listener;
    private boolean isTwoPane;

    public MovieRecyclerViewAdapter(List<Movie> movies, OnRecyclerViewClickListener listener, boolean twoPane) {
        this.movies = movies;
        this.listener = listener;
        this.isTwoPane = twoPane;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_content, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final Movie movie = movies.get(position);
        if (listener != null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.OnRecyclerViewItemClick(holder.itemView, holder.getAdapterPosition());
                }
            });
        }
        holder.bind(movie);
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public void updateData(List<Movie> results) {
        if (results != null) {
            movies = results;
            notifyDataSetChanged();
        }
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        final TextView mTitleView;
        final ImageView mPosterView;

        ViewHolder(View view) {
            super(view);
            mTitleView = (TextView) view.findViewById(R.id.tv_list_title);
            mPosterView = (ImageView) view.findViewById(R.id.iv_list_poster);
        }

        public void bind(Movie item) {
            if (!isTwoPane) {
                mTitleView.setText(item.getTitle());
            }
            TMDBApp.getInstance().getImageLoader().load(ApiClient.IMAGE_ENDPOINT + item.getPosterPath()).into(mPosterView);
            mPosterView.setContentDescription(item.getTitle());
            itemView.setTag(item);
        }
    }
}
