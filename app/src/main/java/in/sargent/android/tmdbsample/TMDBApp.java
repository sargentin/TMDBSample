package in.sargent.android.tmdbsample;

import android.app.Application;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

import in.sargent.android.tmdbsample.data.SchemaMigration;
import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by sargentin on 07/11/2017.
 */

public class TMDBApp extends Application {
    private static final String TAG = "TMDBApp";

    public static final int REALM_SCHEMA_VERSION_1 = 1;
    public static final int REALM_CURRENT_SCHEMA_VERSION = REALM_SCHEMA_VERSION_1;

    private static TMDBApp instance;
    private Picasso picasso;
    private RequestQueue requestQueue;

    public TMDBApp() {
        super();
        instance = this;
    }

    public static TMDBApp getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        picasso = Picasso.with(this);
        requestQueue = Volley.newRequestQueue(getApplicationContext());

        Realm.init(this);

        RealmConfiguration config = new RealmConfiguration.Builder()
                .schemaVersion(REALM_CURRENT_SCHEMA_VERSION)
                .migration(new SchemaMigration())
                .build();
        Realm.setDefaultConfiguration(config);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();

        picasso.shutdown();
        requestQueue.stop();
    }

    public RequestQueue getRequestQueue() {
        return requestQueue;
    }

    public <T> void addToRequestQueue(Request<T> request) {
        getRequestQueue().add(request);
    }

    public Picasso getImageLoader() {
        return picasso;
    }
}
