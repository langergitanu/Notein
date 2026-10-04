package com.google.android.gms.internal.mlkit_common;

import OooOoo.C20593OooO0Oo;

/* JADX INFO: loaded from: classes7.dex */
final class zzw {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(C20593OooO0Oo.OooO0O0("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
