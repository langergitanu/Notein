package com.aspose.words.internal;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZPX {
    public static boolean zzD(long j, long j2) {
        return j == j2;
    }

    public static long zzY(PointF pointF) {
        return zzZm((int) pointF.x, (int) pointF.y);
    }

    public static long zzYA(long j) {
        return zzZPW.zzG((int) j, (int) (j >>> 32));
    }

    public static PointF zzYB(long j) {
        return new PointF((int) j, (int) (j >>> 32));
    }

    public static boolean zzYF(long j) {
        return j == 0;
    }

    public static long zzZm(int i, int i2) {
        return (((long) i2) << 32) | (((long) i) & 4294967295L);
    }
}
