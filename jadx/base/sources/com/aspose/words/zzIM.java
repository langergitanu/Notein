package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzIM {
    public static double zzY(com.aspose.words.internal.zzZYT<String> zzzyt, String str) {
        return zzZ(zzzyt, str, 0.0d, -1.7976931348623157E308d, Double.MAX_VALUE);
    }

    public static double zzZ(com.aspose.words.internal.zzZYT<String> zzzyt, String str, double d, double d2, double d3) {
        if (zzzyt.containsKey(str)) {
            double d4 = com.aspose.words.internal.zzJB.parseDouble(zzzyt.get(str));
            if (d4 <= d3 && d4 >= d2) {
                return d4;
            }
        }
        return d;
    }

    public static int zzZ(com.aspose.words.internal.zzZYT<String> zzzyt, String str, int i) {
        int i2;
        if (zzzyt.containsKey(str) && (i2 = com.aspose.words.internal.zzJB.parseInt(zzzyt.get(str))) > 0 && i2 <= i) {
            return i2;
        }
        return 2;
    }
}
