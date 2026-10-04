package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZT1 {
    private static double[] zz6u = {0.4360747d, 0.3850649d, 0.1430804d, 0.2225045d, 0.7168786d, 0.0606169d, 0.0139322d, 0.0971045d, 0.7141733d};
    private static double[] zz6t = {3.1338561d, -1.6168667d, -0.4906146d, -0.9787684d, 1.9161415d, 0.033454d, 0.0719453d, -0.2289914d, 1.4052427d};

    private static zzPV zzV(double[] dArr) {
        return zzZZ7.zzW(zzAN.zzY(zz6t, dArr));
    }

    public static zzPV zzZ(zzPV zzpv, zzPV zzpv2, double d) {
        if (d == 0.0d) {
            return zzpv2;
        }
        if (d == 1.0d) {
            return zzpv;
        }
        double[] dArrZzq = zzq(zzpv);
        double[] dArrZzq2 = zzq(zzpv2);
        int i = 0;
        while (i < 3) {
            double d2 = d;
            dArrZzq2[i] = C21532OooOOo.OooO0O0(1.0d, d2, dArrZzq2[i], dArrZzq[i] * d);
            i++;
            d = d2;
        }
        return zzV(dArrZzq2);
    }

    private static double[] zzq(zzPV zzpv) {
        return zzAN.zzY(zz6u, zzZZ7.zzs(zzpv));
    }
}
