package com.aspose.words.internal;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZPW {
    public static long zzG(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
    }

    public static PointF zzYB(long j) {
        return new PointF(Float.intBitsToFloat((int) j), zzYz(j));
    }

    public static boolean zzYF(long j) {
        return j == 0;
    }

    public static boolean zzYy(long j) {
        return j == 0;
    }

    public static float zzYz(long j) {
        return Float.intBitsToFloat((int) (j >>> 32));
    }
}
