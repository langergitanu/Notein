package com.google.firebase.inappmessaging.internal;

import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public class DataCollectionHelper {
    static final String AUTO_INIT_PREFERENCES = "auto_init";
    static final String MANIFEST_METADATA_AUTO_INIT_ENABLED = "firebase_inapp_messaging_auto_data_collection_enabled";
    private AtomicBoolean isGlobalAutomaticDataCollectionEnabled;
    private SharedPreferencesUtils sharedPreferencesUtils;

    public DataCollectionHelper(FirebaseApp firebaseApp, SharedPreferencesUtils sharedPreferencesUtils, Subscriber subscriber) {
        this.sharedPreferencesUtils = sharedPreferencesUtils;
        this.isGlobalAutomaticDataCollectionEnabled = new AtomicBoolean(firebaseApp.isDataCollectionDefaultEnabled());
        subscriber.subscribe(DataCollectionDefaultChange.class, new EventHandler() { // from class: com.google.firebase.inappmessaging.internal.OooO0OO
            @Override // com.google.firebase.events.EventHandler
            public final void handle(Event event) {
                this.f68475OooO00o.lambda$new$0(event);
            }
        });
    }

    private boolean isProductManifestSet() {
        return this.sharedPreferencesUtils.isManifestSet(MANIFEST_METADATA_AUTO_INIT_ENABLED);
    }

    private boolean isProductManuallySet() {
        return this.sharedPreferencesUtils.isPreferenceSet(AUTO_INIT_PREFERENCES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Event event) {
        this.isGlobalAutomaticDataCollectionEnabled.set(((DataCollectionDefaultChange) event.getPayload()).enabled);
    }

    private boolean readAutomaticDataCollectionEnabledFromPreferences() {
        return this.sharedPreferencesUtils.getBooleanPreference(AUTO_INIT_PREFERENCES, true);
    }

    public boolean isAutomaticDataCollectionEnabled() {
        return isProductManuallySet() ? this.sharedPreferencesUtils.getBooleanPreference(AUTO_INIT_PREFERENCES, true) : isProductManifestSet() ? this.sharedPreferencesUtils.getBooleanManifestValue(MANIFEST_METADATA_AUTO_INIT_ENABLED, true) : this.isGlobalAutomaticDataCollectionEnabled.get();
    }

    public void setAutomaticDataCollectionEnabled(boolean z) {
        this.sharedPreferencesUtils.setBooleanPreference(AUTO_INIT_PREFERENCES, z);
    }

    public void setAutomaticDataCollectionEnabled(Boolean bool) {
        if (bool == null) {
            this.sharedPreferencesUtils.clearPreference(AUTO_INIT_PREFERENCES);
        } else {
            this.sharedPreferencesUtils.setBooleanPreference(AUTO_INIT_PREFERENCES, Boolean.TRUE.equals(bool));
        }
    }
}
