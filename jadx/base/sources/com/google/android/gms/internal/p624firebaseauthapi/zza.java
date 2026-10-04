package com.google.android.gms.internal.p624firebaseauthapi;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zza {
    private static zza zza = new zzc();

    public static synchronized zza zza() {
        return zza;
    }

    public abstract URLConnection zza(URL url, String str) throws IOException;
}
