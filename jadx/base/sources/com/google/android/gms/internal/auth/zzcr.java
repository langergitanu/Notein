package com.google.android.gms.internal.auth;

import OooOo.OooO00o;
import android.net.Uri;

/* JADX INFO: loaded from: classes7.dex */
public final class zzcr {
    private static final OooO00o zza = new OooO00o();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized Uri zza(String str) {
        OooO00o oooO00o = zza;
        Uri uri = (Uri) oooO00o.get("com.google.android.gms.auth_account");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        oooO00o.put("com.google.android.gms.auth_account", uri2);
        return uri2;
    }
}
