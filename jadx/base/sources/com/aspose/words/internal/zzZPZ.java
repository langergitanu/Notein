package com.aspose.words.internal;

import android.graphics.Point;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZPZ {
    public static boolean zzD(long j, long j2) {
        return j == j2;
    }

    public static long zzX(long j, int i, int i2) {
        return zzZm(((int) j) + i, ((int) (j >> 32)) + i2);
    }

    public static Point zzYD(long j) {
        return new Point((int) j, (int) (j >> 32));
    }

    public static long zzYE(long j) {
        return zzZPY.zzG((int) j, (int) (j >> 32));
    }

    public static boolean zzYF(long j) {
        return j == 0;
    }

    public static long zzZ(Point point) {
        return zzZm(point.x, point.y);
    }

    public static long zzZm(int i, int i2) {
        return (((long) i2) << 32) | (((long) i) & 4294967295L);
    }
}
