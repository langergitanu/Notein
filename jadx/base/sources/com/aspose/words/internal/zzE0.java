package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzE0 {
    public static double zzY(double d, int i, int i2) {
        if (i != 0) {
            if (i != 1) {
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: fromUnits");
            }
            if (i2 == 0) {
                return d * 2.54d;
            }
            if (i2 != 1) {
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: toUnits");
            }
        } else if (i2 != 0) {
            if (i2 == 1) {
                return d / 2.54d;
            }
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: toUnits");
        }
        return d;
    }

    public static double zzZ(double d, int i, int i2) {
        double d2;
        if (i == 0) {
            d2 = 28.34645669291339d;
        } else {
            if (i != 1) {
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: srcUnits");
            }
            d2 = 72.0d;
        }
        double d3 = d * d2;
        return i2 == 1 ? d3 : d3 * ((double) i2);
    }
}
