package in.sargent.android.tmdbsample.data;

import java.util.List;

import in.sargent.android.tmdbsample.api.ApiClient;
import in.sargent.android.tmdbsample.api.model.Movie;
import in.sargent.android.tmdbsample.api.model.MovieDetail;
import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by sargentin on 09/11/2017.
 */

public class DatabaseHelper {
    private static final String TAG = "DatabaseHelper";
    private static DatabaseHelper instance;

    private Realm realm;

    private DatabaseHelper(Realm realm) {
        this.realm = realm;
    }

    public static DatabaseHelper getInstance(Realm realm) {
        if (instance == null) {
            instance = new DatabaseHelper(realm);
        }
        return instance;
    }

    public RealmResults<Movie> getMovies() {
        return realm.where(Movie.class).findAll();
    }

    public void createMovies(final List<Movie> movies) {
        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.insert(movies);
            }
        });
    }

    public Movie getMovie(int movieId) {
        return realm.where(Movie.class).equalTo("id", movieId).findFirst();
    }

    public void updateImdbPathMovie(final Movie movie, final String path) {
        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                Movie existingMovie = realm.where(Movie.class).equalTo("id", movie.getId()).findFirst();
                existingMovie.setImdbPath(path);
            }
        });
    }

    public void updateFromDetail(final Movie movie, final MovieDetail movieDetail) {
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                movie.setImdbPath(ApiClient.getImdbUrl(movieDetail.getImdbId()));
                realm.copyToRealmOrUpdate(movie);
            }
        });
    }
}
