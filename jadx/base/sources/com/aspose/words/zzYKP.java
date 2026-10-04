package com.aspose.words;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
class zzYKP {
    protected Map<Integer, Double> zzXDi = new HashMap();
    protected int[] zzXDj;

    public final double zzZ(zzY9G zzy9g) {
        double d = 0.0d;
        int i = 0;
        while (true) {
            int[] iArr = this.zzXDj;
            if (i >= iArr.length) {
                return d;
            }
            int i2 = iArr[i];
            double dDoubleValue = this.zzXDi.get(Integer.valueOf(i2)).doubleValue();
            if (i2 == zzy9g.zzY4B()) {
                return ((zzy9g.getEstimatedProgress() * dDoubleValue) / 100.0d) + d;
            }
            d += dDoubleValue;
            i++;
        }
    }

    public final int zzpI(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Progress stage has not previous stages.");
        }
        int[] iArr = this.zzXDj;
        if (i <= iArr.length - 1) {
            return iArr[i - 1];
        }
        throw new IllegalArgumentException("There is not a progress stage with specified index.");
    }

    public final int zzpJ(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.zzXDj;
            if (i2 >= iArr.length) {
                return -1;
            }
            if (i == iArr[i2]) {
                return i2;
            }
            i2++;
        }
    }
}
