package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: loaded from: classes5.dex */
final class zzZJS {
    private static final int[] zzZLR = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 4};

    public static int zzQ5(int i) {
        if (i <= 0 || i > 13) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "dataType out of range! "));
        }
        return zzZLR[i];
    }
}
