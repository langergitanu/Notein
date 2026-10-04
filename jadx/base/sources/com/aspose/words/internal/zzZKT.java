package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZKT {
    public static int zzF(double d, double d2) {
        if (d < d2) {
            return -1;
        }
        if (d > d2) {
            return 1;
        }
        if (d == d2) {
            return 0;
        }
        if (Double.isNaN(d)) {
            return Double.isNaN(d2) ? 0 : -1;
        }
        return 1;
    }
}
