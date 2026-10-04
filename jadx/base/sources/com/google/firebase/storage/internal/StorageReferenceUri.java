package com.google.firebase.storage.internal;

import android.net.Uri;
import com.google.firebase.emulators.EmulatedServiceSettings;
import com.google.firebase.storage.network.NetworkRequest;
import com.huawei.hms.network.base.util.HttpUtils;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: loaded from: classes8.dex */
public class StorageReferenceUri {
    private final Uri gsUri;
    private final Uri httpBaseUri;
    private final Uri httpUri;

    public StorageReferenceUri(Uri uri) {
        this(uri, null);
    }

    public Uri getGsUri() {
        return this.gsUri;
    }

    public Uri getHttpBaseUri() {
        return this.httpBaseUri;
    }

    public Uri getHttpUri() {
        return this.httpUri;
    }

    public StorageReferenceUri(Uri uri, EmulatedServiceSettings emulatedServiceSettings) {
        Uri uri2;
        this.gsUri = uri;
        if (emulatedServiceSettings == null) {
            uri2 = NetworkRequest.PROD_BASE_URL;
        } else {
            uri2 = Uri.parse(HttpUtils.HTTP_PREFIX + emulatedServiceSettings.getHost() + C18241k5.f55433h + emulatedServiceSettings.getPort() + "/v0");
        }
        this.httpBaseUri = uri2;
        Uri.Builder builderAppendEncodedPath = uri2.buildUpon().appendPath("b").appendEncodedPath(uri.getAuthority());
        String strNormalizeSlashes = Slashes.normalizeSlashes(uri.getPath());
        if (strNormalizeSlashes.length() > 0 && !"/".equals(strNormalizeSlashes)) {
            builderAppendEncodedPath = builderAppendEncodedPath.appendPath("o").appendPath(strNormalizeSlashes);
        }
        this.httpUri = builderAppendEncodedPath.build();
    }
}
