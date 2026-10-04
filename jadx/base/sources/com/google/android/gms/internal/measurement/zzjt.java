package com.google.android.gms.internal.measurement;

import OooOo.C20493Oooo00o;
import android.net.Uri;

/* JADX INFO: loaded from: classes7.dex */
public final class zzjt {
    private final C20493Oooo00o zza;

    public zzjt(C20493Oooo00o c20493Oooo00o) {
        this.zza = c20493Oooo00o;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        C20493Oooo00o c20493Oooo00o = uri != null ? (C20493Oooo00o) this.zza.get(uri.toString()) : null;
        if (c20493Oooo00o == null) {
            return null;
        }
        return (String) c20493Oooo00o.get("".concat(str3));
    }
}
