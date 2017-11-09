package in.sargent.android.tmdbsample.api;

import android.net.Uri;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

/**
 * Created by sargentin on 07/11/2017.
 */

public class ApiClient {
    private static final String TAG = "ApiRequest";

    private static ApiClient instance;

    // Base URI parameters
    private static final String SCHEME = "https";
    private static final String AUHTORITY = "api.themoviedb.org";
    private static final String API_VERSION = "3";

    // Endpoints
    private static final String POPULAR_MOVIES_ENDPOINT = "movie/popular";
    private static final String MOVIE_ENDPOINT = "movie";

    // Query parameters
    private static final String PARAM_API_KEY = "api_key";
    private static final String PARAM_LANGUAGE = "language";

    public static final String IMAGE_ENDPOINT = "https://image.tmdb.org/t/p/w500";
    private static final String API_KEY = "44767493a7cc518b72b65476d2f7cdf9";
    private static final String LANGUAGE = "fr";

    private static final String IMDB_ENPOINT = "http://www.imdb.com/title/";

    private Response.ErrorListener errorListener;

    private ApiClient() {
        errorListener = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                logError(error);
            }
        };
    }

    public static ApiClient getInstance() {
        if (instance == null) {
            instance = new ApiClient();
        }
        return instance;
    }

    public StringRequest getPopularMovies(Response.Listener<String> listener) {
        Uri uri = new Uri.Builder()
                .scheme(SCHEME)
                .authority(AUHTORITY)
                .path(API_VERSION)
                .appendEncodedPath(POPULAR_MOVIES_ENDPOINT)
                .appendQueryParameter(PARAM_API_KEY, API_KEY)
                .appendQueryParameter(PARAM_LANGUAGE, "fr")
                .build();

        StringRequest request = new StringRequest(Request.Method.GET,
                uri.toString(),
                listener,
                errorListener);
        return request;
    }

    public StringRequest getMovieDetail(Response.Listener<String> listener, String id) {
        Uri uri = new Uri.Builder()
                .scheme(SCHEME)
                .authority(AUHTORITY)
                .path(API_VERSION)
                .appendEncodedPath(MOVIE_ENDPOINT)
                .appendEncodedPath(String.valueOf(id))
                .appendQueryParameter(PARAM_API_KEY, API_KEY)
                .appendQueryParameter(PARAM_LANGUAGE, LANGUAGE)
                .build();

        StringRequest request = new StringRequest(Request.Method.GET,
                uri.toString(),
                listener,
                errorListener);
        return request;
    }

    private void logError(VolleyError error) {
        String msg = new String(error.networkResponse.data);
        Log.d(TAG, "onErrorResponse: msg = [" + msg + "]");
    }

    public static String getImdbUrl(String imdbId) {
        return IMDB_ENPOINT + imdbId;
    }
}
