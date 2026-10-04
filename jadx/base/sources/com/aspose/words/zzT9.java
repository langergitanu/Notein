package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzT9 {
    public static int zzK(int i, int i2, int i3, int i4) {
        return zzn(zzYf(i, i3), i2, i4);
    }

    public static int zzMF(int i) {
        if (i % 5 == 0) {
            i /= 5;
        }
        if (i % 2 == 0) {
            i /= 2;
        }
        if (i % 5 == 0) {
            i /= 5;
        }
        return i % 2 == 0 ? i / 2 : i;
    }

    public static int zzS(int i, float f) {
        return (int) ((i * f) / 100.0f);
    }

    public static int zzYf(int i, int i2) {
        int iZzMF = zzMF(i2);
        return (i * iZzMF) / (100 / (i2 / iZzMF));
    }

    public static int zzZ(int i, int i2, float f, int i3) {
        return zzn(zzS(i, f), i2, i3);
    }

    private static int zzn(int i, int i2, int i3) {
        return Math.max(0, (i3 * i2) + i);
    }
}
