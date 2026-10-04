package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ConvertUtil {
    private ConvertUtil() {
    }

    public static double inchToPoint(double d) {
        return d * 72.0d;
    }

    public static double millimeterToPoint(double d) {
        return d * 2.834645669291339d;
    }

    public static int pixelToNewDpi(double d, double d2, double d3) {
        return com.aspose.words.internal.zzSA.pixelToNewDpi(d, d2, d3);
    }

    public static double pixelToPoint(double d, double d2) {
        return (d / d2) * 72.0d;
    }

    public static double pointToInch(double d) {
        return d / 72.0d;
    }

    public static double pointToPixel(double d, double d2) {
        return (d / 72.0d) * d2;
    }

    public static double pixelToPoint(double d) {
        return com.aspose.words.internal.zzSA.pixelToPoint(d);
    }

    public static double pointToPixel(double d) {
        return com.aspose.words.internal.zzSA.pointToPixel(d);
    }
}
