package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz3W {
    private static com.aspose.words.internal.zzZNR zzZ0d = new com.aspose.words.internal.zzZNR("-?[0-9]+(\\.[0-9]+)?%", 0);

    private static boolean zzOp(String str) {
        return com.aspose.words.internal.zzZYD.zzXk(str) && zzZ0d.zzUV(str);
    }

    private static double zzQ(String str, double d) {
        double dZzZs = com.aspose.words.internal.zzJB.zzZs(str);
        return !Double.isNaN(dZzZs) ? dZzZs / 100000.0d : d;
    }

    private static double zzR(String str, double d) {
        return !zzOp(str) ? d : com.aspose.words.internal.zzJB.parseDouble(str.substring(0, str.length() - 1)) / 100.0d;
    }

    public static String zzS(double d, boolean z) {
        return z ? zzXA(d) : com.aspose.words.internal.zzJB.zzX(d * 100000.0d, 0);
    }

    private static String zzXA(double d) {
        return com.aspose.words.internal.zzJB.zzZT(d * 100.0d) + "%";
    }

    public static double zzXv(double d) {
        return com.aspose.words.internal.zzZKQ.zzR(d, 5);
    }

    public static double zzXw(double d) {
        return (d * 1000.0d) / 10.0d;
    }

    public static int zzXx(double d) {
        return com.aspose.words.internal.zzAN.zzZG((d * 10.0d) / 1000.0d);
    }

    public static double zzXy(double d) {
        return d * 100000.0d;
    }

    public static double zzXz(double d) {
        return d / 100000.0d;
    }

    public static double zzZ(String str, double d, zzYO3 zzyo3) {
        if (!zzOp(str)) {
            return zzQ(str, d);
        }
        if (zzyo3 != null) {
            zzyo3.zzYrc();
        }
        return zzR(str, d);
    }

    public static double zzZ(String str, zzYO3 zzyo3) {
        return zzZ(str, 0.0d, zzyo3);
    }
}
