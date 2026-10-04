package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZRT {
    private static char[] zz5m = {30002, 20057, 19993, 19969, 25098, 24049, 24218, 36763, 22764, 30328};
    private static char[] zz5l = {23376, 19985, 23493, 21359, 36784, 24051, 21320, 26410, 30003, 37193, 25101, 20133};

    public static String zzYP(long j) {
        if (j < 1) {
            return zzJB.zz7(j);
        }
        int i = (int) (j % 60);
        if (i == 0) {
            i = 60;
        }
        int i2 = i % 10;
        if (i2 == 0) {
            i2 = 10;
        }
        return zzZKN.format("{0}{1}", Character.valueOf(zz5m[i2 - 1]), Character.valueOf(zz5l[(i % 12 != 0 ? r2 : 12) - 1]));
    }

    public static String zzYQ(long j) {
        return (j <= 0 || j >= 13) ? zzJB.zz7(j) : Character.toString(zz5l[((int) j) - 1]);
    }

    public static String zzYR(long j) {
        return (j <= 0 || j >= 11) ? zzJB.zz7(j) : Character.toString(zz5m[((int) j) - 1]);
    }
}
