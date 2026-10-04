package com.google.android.gms.internal.mlkit_common;

import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: loaded from: classes7.dex */
public final class zzak {
    public static Object[] zza(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(C21532OooOOo.OooO0OO(i2, "at index "));
            }
        }
        return objArr;
    }
}
