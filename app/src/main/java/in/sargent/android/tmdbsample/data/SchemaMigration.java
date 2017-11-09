package in.sargent.android.tmdbsample.data;

import io.realm.DynamicRealm;
import io.realm.RealmMigration;
import io.realm.RealmSchema;

/**
 * Created by sargentin on 09/11/2017.
 */

public class SchemaMigration implements RealmMigration {
    private static final String TAG = "SchemaMigration";

    @Override
    public void migrate(DynamicRealm realm, long oldVersion, long newVersion) {
        RealmSchema schema = realm.getSchema();
    }
}
