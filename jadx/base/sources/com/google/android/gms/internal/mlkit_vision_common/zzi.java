package com.google.android.gms.internal.mlkit_vision_common;

import OooOo.C20485OooOoO;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzi {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            Objects.toString(obj2);
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(C20485OooOoO.OooO0O0("null value in entry: ", obj, "=null"));
        }
    }
}
