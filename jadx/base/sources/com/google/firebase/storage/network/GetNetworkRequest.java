package com.google.firebase.storage.network;

import com.aspose.slides.C22200OooO0o0;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class GetNetworkRequest extends NetworkRequest {
    private static final String TAG = "GetNetworkRequest";

    public GetNetworkRequest(StorageReferenceUri storageReferenceUri, FirebaseApp firebaseApp, long j) {
        super(storageReferenceUri, firebaseApp);
        if (j != 0) {
            super.setCustomHeader("Range", C22200OooO0o0.OooO0O0(j, "bytes=", CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR));
        }
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public String getAction() {
        return "GET";
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public Map<String, String> getQueryParameters() {
        return Collections.singletonMap("alt", "media");
    }
}
