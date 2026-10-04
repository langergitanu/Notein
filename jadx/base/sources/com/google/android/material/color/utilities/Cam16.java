package com.google.android.material.color.utilities;

import OooO0O0.C20394OooO0Oo;
import OooO0O0.C20395OooO0o0;

/* JADX INFO: loaded from: classes7.dex */
public final class Cam16 {
    private final double astar;
    private final double bstar;
    private final double chroma;
    private final double hue;

    /* JADX INFO: renamed from: j */
    private final double f51364j;
    private final double jstar;

    /* JADX INFO: renamed from: m */
    private final double f51365m;

    /* JADX INFO: renamed from: q */
    private final double f51366q;

    /* JADX INFO: renamed from: s */
    private final double f51367s;
    private final double[] tempArray = {0.0d, 0.0d, 0.0d};
    static final double[][] XYZ_TO_CAM16RGB = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};
    static final double[][] CAM16RGB_TO_XYZ = {new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};

    private Cam16(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.hue = d;
        this.chroma = d2;
        this.f51364j = d3;
        this.f51366q = d4;
        this.f51365m = d5;
        this.f51367s = d6;
        this.jstar = d7;
        this.astar = d8;
        this.bstar = d9;
    }

    public static Cam16 fromInt(int i) {
        return fromIntInViewingConditions(i, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromIntInViewingConditions(int i, ViewingConditions viewingConditions) {
        double dLinearized = ColorUtils.linearized((16711680 & i) >> 16);
        double dLinearized2 = ColorUtils.linearized((65280 & i) >> 8);
        double dLinearized3 = ColorUtils.linearized(i & 255);
        return fromXyzInViewingConditions((0.18051042d * dLinearized3) + (0.35762064d * dLinearized2) + (0.41233895d * dLinearized), (0.0722d * dLinearized3) + (0.7152d * dLinearized2) + (0.2126d * dLinearized), (dLinearized3 * 0.95034478d) + (dLinearized2 * 0.11916382d) + (dLinearized * 0.01932141d), viewingConditions);
    }

    public static Cam16 fromJch(double d, double d2, double d3) {
        return fromJchInViewingConditions(d, d2, d3, ViewingConditions.DEFAULT);
    }

    private static Cam16 fromJchInViewingConditions(double d, double d2, double d3, ViewingConditions viewingConditions) {
        double d4 = d / 100.0d;
        double flRoot = viewingConditions.getFlRoot() * (viewingConditions.getAw() + 4.0d) * Math.sqrt(d4) * (4.0d / viewingConditions.getC());
        double flRoot2 = viewingConditions.getFlRoot() * d2;
        double dSqrt = Math.sqrt((viewingConditions.getC() * (d2 / Math.sqrt(d4))) / (viewingConditions.getAw() + 4.0d)) * 50.0d;
        double radians = Math.toRadians(d3);
        double d5 = (1.7000000000000002d * d) / ((0.007d * d) + 1.0d);
        double dLog1p = Math.log1p(0.0228d * flRoot2) * 43.859649122807014d;
        return new Cam16(d3, d2, d, flRoot, flRoot2, dSqrt, d5, Math.cos(radians) * dLog1p, Math.sin(radians) * dLog1p);
    }

    public static Cam16 fromUcs(double d, double d2, double d3) {
        return fromUcsInViewingConditions(d, d2, d3, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromUcsInViewingConditions(double d, double d2, double d3, ViewingConditions viewingConditions) {
        double dExpm1 = (Math.expm1(Math.hypot(d2, d3) * 0.0228d) / 0.0228d) / viewingConditions.getFlRoot();
        double dAtan2 = Math.atan2(d3, d2) * 57.29577951308232d;
        if (dAtan2 < 0.0d) {
            dAtan2 += 360.0d;
        }
        return fromJchInViewingConditions(d / (1.0d - ((d - 100.0d) * 0.007d)), dExpm1, dAtan2, viewingConditions);
    }

    public static Cam16 fromXyzInViewingConditions(double d, double d2, double d3, ViewingConditions viewingConditions) {
        double[][] dArr = XYZ_TO_CAM16RGB;
        double[] dArr2 = dArr[0];
        double d4 = (dArr2[2] * d3) + (dArr2[1] * d2) + (dArr2[0] * d);
        double[] dArr3 = dArr[1];
        double d5 = (dArr3[2] * d3) + (dArr3[1] * d2) + (dArr3[0] * d);
        double[] dArr4 = dArr[2];
        double d6 = (dArr4[2] * d3) + (dArr4[1] * d2) + (dArr4[0] * d);
        double d7 = viewingConditions.getRgbD()[0] * d4;
        double d8 = viewingConditions.getRgbD()[1] * d5;
        double d9 = viewingConditions.getRgbD()[2] * d6;
        double dPow = Math.pow((Math.abs(d7) * viewingConditions.getFl()) / 100.0d, 0.42d);
        double dPow2 = Math.pow((Math.abs(d8) * viewingConditions.getFl()) / 100.0d, 0.42d);
        double dPow3 = Math.pow((Math.abs(d9) * viewingConditions.getFl()) / 100.0d, 0.42d);
        double dSignum = ((Math.signum(d7) * 400.0d) * dPow) / (dPow + 27.13d);
        double dSignum2 = ((Math.signum(d8) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double dSignum3 = ((Math.signum(d9) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d10 = ((((-12.0d) * dSignum2) + (dSignum * 11.0d)) + dSignum3) / 11.0d;
        double dOooO00o = C20394OooO0Oo.OooO00o(dSignum3, 2.0d, dSignum + dSignum2, 9.0d);
        double d11 = dSignum2 * 20.0d;
        double dOooO00o2 = OooO0O0.OooO0OO.OooO00o(dSignum3, 21.0d, (dSignum * 20.0d) + d11, 20.0d);
        double d12 = (((dSignum * 40.0d) + d11) + dSignum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(dOooO00o, d10));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d13 = degrees;
        double radians = Math.toRadians(d13);
        double dPow4 = Math.pow((viewingConditions.getNbb() * d12) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ()) * 100.0d;
        double d14 = dPow4 / 100.0d;
        double flRoot = viewingConditions.getFlRoot() * (viewingConditions.getAw() + 4.0d) * Math.sqrt(d14) * (4.0d / viewingConditions.getC());
        double dPow5 = Math.pow((Math.hypot(d10, dOooO00o) * (viewingConditions.getNcb() * (viewingConditions.getNc() * (((Math.cos(Math.toRadians(d13 < 20.14d ? d13 + 360.0d : d13) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d)))) / (dOooO00o2 + 0.305d), 0.9d) * Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d);
        double dSqrt = Math.sqrt(d14) * dPow5;
        double flRoot2 = viewingConditions.getFlRoot() * dSqrt;
        double dSqrt2 = Math.sqrt((viewingConditions.getC() * dPow5) / (viewingConditions.getAw() + 4.0d)) * 50.0d;
        double d15 = (1.7000000000000002d * dPow4) / ((0.007d * dPow4) + 1.0d);
        double dLog1p = Math.log1p(0.0228d * flRoot2) * 43.859649122807014d;
        return new Cam16(d13, dSqrt, dPow4, flRoot, flRoot2, dSqrt2, d15, Math.cos(radians) * dLog1p, Math.sin(radians) * dLog1p);
    }

    public double distance(Cam16 cam16) {
        double jstar = getJstar() - cam16.getJstar();
        double astar = getAstar() - cam16.getAstar();
        double bstar = getBstar() - cam16.getBstar();
        return Math.pow(Math.sqrt((bstar * bstar) + (astar * astar) + (jstar * jstar)), 0.63d) * 1.41d;
    }

    public double getAstar() {
        return this.astar;
    }

    public double getBstar() {
        return this.bstar;
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getHue() {
        return this.hue;
    }

    public double getJ() {
        return this.f51364j;
    }

    public double getJstar() {
        return this.jstar;
    }

    public double getM() {
        return this.f51365m;
    }

    public double getQ() {
        return this.f51366q;
    }

    public double getS() {
        return this.f51367s;
    }

    public int toInt() {
        return viewed(ViewingConditions.DEFAULT);
    }

    public int viewed(ViewingConditions viewingConditions) {
        double[] dArrXyzInViewingConditions = xyzInViewingConditions(viewingConditions, this.tempArray);
        return ColorUtils.argbFromXyz(dArrXyzInViewingConditions[0], dArrXyzInViewingConditions[1], dArrXyzInViewingConditions[2]);
    }

    public double[] xyzInViewingConditions(ViewingConditions viewingConditions, double[] dArr) {
        double dPow = Math.pow(((getChroma() == 0.0d || getJ() == 0.0d) ? 0.0d : getChroma() / Math.sqrt(getJ() / 100.0d)) / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double radians = Math.toRadians(getHue());
        double dCos = (Math.cos(2.0d + radians) + 3.8d) * 0.25d;
        double dPow2 = Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.getC()) / viewingConditions.getZ()) * viewingConditions.getAw();
        double ncb = viewingConditions.getNcb() * viewingConditions.getNc() * dCos * 3846.153846153846d;
        double nbb = dPow2 / viewingConditions.getNbb();
        double dSin = Math.sin(radians);
        double dCos2 = Math.cos(radians);
        double dOooO00o = (((0.305d + nbb) * 23.0d) * dPow) / (((dPow * 108.0d) * dSin) + C20395OooO0o0.OooO00o(dPow, 11.0d, dCos2, 23.0d * ncb));
        double d = dCos2 * dOooO00o;
        double d2 = dOooO00o * dSin;
        double d3 = nbb * 460.0d;
        double dOooO00o2 = OooO0O0.OooO0OO.OooO00o(d2, 288.0d, (451.0d * d) + d3, 1403.0d);
        double dOooO00o3 = C20394OooO0Oo.OooO00o(d2, 261.0d, d3 - (891.0d * d), 1403.0d);
        double dOooO00o4 = C20394OooO0Oo.OooO00o(d2, 6300.0d, d3 - (d * 220.0d), 1403.0d);
        double dPow3 = Math.pow(Math.max(0.0d, (Math.abs(dOooO00o2) * 27.13d) / (400.0d - Math.abs(dOooO00o2))), 2.380952380952381d) * (100.0d / viewingConditions.getFl()) * Math.signum(dOooO00o2);
        double dPow4 = Math.pow(Math.max(0.0d, (Math.abs(dOooO00o3) * 27.13d) / (400.0d - Math.abs(dOooO00o3))), 2.380952380952381d) * (100.0d / viewingConditions.getFl()) * Math.signum(dOooO00o3);
        double dPow5 = Math.pow(Math.max(0.0d, (Math.abs(dOooO00o4) * 27.13d) / (400.0d - Math.abs(dOooO00o4))), 2.380952380952381d) * (100.0d / viewingConditions.getFl()) * Math.signum(dOooO00o4);
        double d4 = dPow3 / viewingConditions.getRgbD()[0];
        double d5 = dPow4 / viewingConditions.getRgbD()[1];
        double d6 = dPow5 / viewingConditions.getRgbD()[2];
        double[][] dArr2 = CAM16RGB_TO_XYZ;
        double[] dArr3 = dArr2[0];
        double d7 = (dArr3[2] * d6) + (dArr3[1] * d5) + (dArr3[0] * d4);
        double[] dArr4 = dArr2[1];
        double d8 = (dArr4[2] * d6) + (dArr4[1] * d5) + (dArr4[0] * d4);
        double[] dArr5 = dArr2[2];
        double d9 = (d6 * dArr5[2]) + (d5 * dArr5[1]) + (d4 * dArr5[0]);
        if (dArr == null) {
            return new double[]{d7, d8, d9};
        }
        dArr[0] = d7;
        dArr[1] = d8;
        dArr[2] = d9;
        return dArr;
    }
}
