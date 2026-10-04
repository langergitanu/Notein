package com.aspose.words.internal;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZPY {
    public static long zzC(long j, long j2) {
        return zzG(Float.intBitsToFloat((int) j2) + Float.intBitsToFloat((int) j), zzZPW.zzYz(j2) + zzYC(j));
    }

    public static boolean zzD(long j, long j2) {
        return j == j2;
    }

    public static long zzG(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
    }

    public static long zzY(PointF pointF) {
        return zzG(pointF.x, pointF.y);
    }

    public static PointF zzYB(long j) {
        return new PointF(Float.intBitsToFloat((int) j), zzYC(j));
    }

    public static float zzYC(long j) {
        return Float.intBitsToFloat((int) (j >>> 32));
    }

    public static boolean zzYF(long j) {
        return j == 0;
    }
}
