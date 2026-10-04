package com.google.android.gms.internal.p624firebaseauthapi;

import OooOoo.C20593OooO0Oo;

/* JADX INFO: loaded from: classes7.dex */
final class zzae {
    public static int zza(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(C20593OooO0Oo.OooO0O0("null value in entry: ", String.valueOf(obj), "=null"));
        }
    }
}
