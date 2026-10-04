package com.aspose.words.internal;

import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes5.dex */
public final class zzKB {
    public static int zzY(int i, long[] jArr) {
        return zzZ(i, jArr, true);
    }

    public static int zzZ(int i, long[] jArr) {
        return zzZ(i, jArr, false);
    }

    public static long zzh(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    private static int zzZ(int i, long[] jArr, boolean z) {
        char c = ControlChar.SPACE_CHAR;
        char c2 = z ? (char) 0 : ' ';
        if (!z) {
            c = 0;
        }
        int i2 = 0;
        for (long j : jArr) {
            int i3 = (int) (j >> c2);
            if ((i & i3) == i3) {
                i2 |= (int) (j >> c);
            }
        }
        return i2;
    }
}
