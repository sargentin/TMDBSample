package in.sargent.android.tmdbsample.data;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;

import in.sargent.android.tmdbsample.TMDBApp;
import in.sargent.android.tmdbsample.api.ApiClient;
import in.sargent.android.tmdbsample.api.model.Movie;
import in.sargent.android.tmdbsample.api.model.MovieDetail;
import in.sargent.android.tmdbsample.api.model.PopularMovies;
import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by sargentin on 09/11/2017.
 */

public class DataManager {
    private static final String TAG = "DataManager";

    private static DataManager instance;

    private Realm realm;

    private DataManager(Realm realm) {
        this.realm = realm;
    }

    public static DataManager getInstance(Realm realm) {
        if (instance == null) {
            instance = new DataManager(realm);
        }
        return instance;
    }

    public RealmResults<Movie> getMovies() {
        RealmResults<Movie> movies = DatabaseHelper.getInstance(realm).getMovies();

        if (movies.size() == 0) {
            StringRequest request = ApiClient.getInstance().getPopularMovies(new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Gson gson = new Gson();
                    PopularMovies pm = gson.fromJson(response, PopularMovies.class);
                    DatabaseHelper.getInstance(realm).createMovies(pm.getMovies());
                }
            });
            TMDBApp.getInstance().addToRequestQueue(request);
        }
        return movies;
    }

    public Movie getMovie(int movieId) {
        return DatabaseHelper.getInstance(realm).getMovie(movieId);
    }

    public void updateFromDetail(Movie movie, MovieDetail movieDetail) {
        DatabaseHelper.getInstance(realm).updateFromDetail(movie, movieDetail);
    }
}
