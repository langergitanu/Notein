package com.google.android.gms.internal.auth;

import OooOo.C20493Oooo00o;
import android.net.Uri;

/* JADX INFO: loaded from: classes7.dex */
public final class zzci {
    private final C20493Oooo00o zza;

    public zzci(C20493Oooo00o c20493Oooo00o) {
        this.zza = c20493Oooo00o;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        C20493Oooo00o c20493Oooo00o;
        if (uri != null) {
            c20493Oooo00o = (C20493Oooo00o) this.zza.get(uri.toString());
        } else {
            c20493Oooo00o = null;
        }
        if (c20493Oooo00o == null) {
            return null;
        }
        return (String) c20493Oooo00o.get("".concat(str3));
    }
}
