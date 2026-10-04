package com.google.android.gms.internal.measurement;

import OooOo.OooO00o;
import android.net.Uri;

/* JADX INFO: loaded from: classes7.dex */
public final class zzkb {
    public static final /* synthetic */ int zza = 0;
    private static final OooO00o zzb = new OooO00o();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized Uri zza(String str) {
        OooO00o oooO00o = zzb;
        Uri uri = (Uri) oooO00o.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        oooO00o.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
