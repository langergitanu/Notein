package com.orion.notein.data.p602db.entity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007J\u0014\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/NotePlaceholderConverter;", "", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "extraToString", "", "extra", "Landroid/os/Bundle;", "stringToExtra", "json", "uriToString", "uri", "Landroid/net/Uri;", "stringToUri", "uriString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NotePlaceholderConverter {
    private static final String TAG = "NotePlaceholderConverter";
    private final Gson gson;

    public NotePlaceholderConverter() {
        Gson gsonCreate = new GsonBuilder().registerTypeAdapterFactory(new BundleTypeAdapterFactory()).create();
        OooOOO0.OooO0o(gsonCreate, "create(...)");
        this.gson = gsonCreate;
    }

    public final String extraToString(Bundle extra) {
        OooOOO0.OooO0oO(extra, "extra");
        Log.d(TAG, "extraStr: " + this.gson.toJson(extra));
        String json = this.gson.toJson(extra);
        OooOOO0.OooO0o(json, "toJson(...)");
        return json;
    }

    public final Bundle stringToExtra(String json) {
        OooOOO0.OooO0oO(json, "json");
        Bundle bundle = (Bundle) this.gson.fromJson(json, Bundle.class);
        Log.d(TAG, "bundle: " + bundle);
        OooOOO0.OooO0Oo(bundle);
        return bundle;
    }

    public final Uri stringToUri(String uriString) {
        if (uriString != null) {
            return Uri.parse(uriString);
        }
        return null;
    }

    public final String uriToString(Uri uri) {
        if (uri != null) {
            return uri.toString();
        }
        return null;
    }
}
