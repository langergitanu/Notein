package com.aspose.words.internal;

import androidx.datastore.preferences.protobuf.C21825OoooOO0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZIU {
    public static int zzW(double[] dArr, double[] dArr2) {
        double d = dArr[2];
        double d2 = dArr[1];
        double d3 = dArr[0];
        if (d == 0.0d) {
            if (d2 == 0.0d) {
                return -1;
            }
            dArr2[0] = (-d3) / d2;
            return 1;
        }
        double dOooO00o = C21825OoooOO0.OooO00o(d, 4.0d, d3, d2 * d2);
        if (dOooO00o < 0.0d) {
            return 0;
        }
        double dSqrt = Math.sqrt(dOooO00o);
        if (d2 < 0.0d) {
            dSqrt = -dSqrt;
        }
        double d4 = (d2 + dSqrt) / (-2.0d);
        dArr2[0] = d4 / d;
        if (d4 == 0.0d) {
            return 1;
        }
        dArr2[1] = d3 / d4;
        return 2;
    }
}
