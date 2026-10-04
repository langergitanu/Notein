package com.google.android.gms.internal.p624firebaseauthapi;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes7.dex */
final class zzc extends zza {
    @Override // com.google.android.gms.internal.p624firebaseauthapi.zza
    public final URLConnection zza(URL url, String str) throws IOException {
        return url.openConnection();
    }

    private zzc() {
    }
}
