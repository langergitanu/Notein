package com.aspose.words;

import OooOoO.C20509OooO0oo;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzJ7 {
    private zzIZ zzZi9;
    private zz7H zzZjg;
    private zz07 zzZji;

    public static class zzY {
        private double zzKu;
        private boolean zzZi4;
        private double zzZi5;
        private float zzZi6;
        private long zzZi7;

        public zzY(zzJ4 zzj4, float f, boolean z, boolean z2) {
            this.zzZi7 = 0L;
            this.zzZi6 = f;
            this.zzZi4 = z2;
            long jZzG = com.aspose.words.internal.zzZPY.zzG((Float.intBitsToFloat((int) zzj4.zzZS6()) + Float.intBitsToFloat((int) zzj4.zz1y())) / 2.0f, (com.aspose.words.internal.zzZPY.zzYC(zzj4.zzZS6()) + com.aspose.words.internal.zzZPY.zzYC(zzj4.zz1y())) / 2.0f);
            double dSqrt = Math.sqrt((f * f) - (zzj4.zzZSd() * zzj4.zzZSd())) / 2.0d;
            double dZzZRR = ((z ? 1.0d : -1.0d) * 1.5707963267948966d) + zzj4.zzZRR();
            this.zzZi7 = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzG) + ((float) (Math.cos(dZzZRR) * dSqrt)), com.aspose.words.internal.zzZPY.zzYC(jZzG) + ((float) (Math.sin(dZzZRR) * dSqrt)));
            this.zzKu = com.aspose.words.internal.zzAN.zzZI(Math.atan2(com.aspose.words.internal.zzZPY.zzYC(zzj4.zz1y()) - com.aspose.words.internal.zzZPY.zzYC(this.zzZi7), Float.intBitsToFloat((int) zzj4.zz1y()) - Float.intBitsToFloat((int) this.zzZi7)));
            this.zzZi5 = com.aspose.words.internal.zzAN.zzZI(Math.atan2(com.aspose.words.internal.zzZPY.zzYC(zzj4.zzZS6()) - com.aspose.words.internal.zzZPY.zzYC(this.zzZi7), Float.intBitsToFloat((int) zzj4.zzZS6()) - Float.intBitsToFloat((int) this.zzZi7)));
        }

        public final long zzPT() {
            return this.zzZi7;
        }

        public final boolean zzZS0() {
            return this.zzZi4;
        }

        public final double zzZS1() {
            return com.aspose.words.internal.zzAN.zzZI(this.zzZi5 - this.zzKu);
        }

        public final double zzZS2() {
            return this.zzZi5;
        }

        public final double zzZS3() {
            return this.zzKu;
        }

        public final float zzZS4() {
            return this.zzZi6;
        }
    }

    public static class zzZ {
        private long zzDK;
        private long zzDL;
        private long[] zzZi8;

        public zzZ(long j, long j2, long... jArr) {
            this.zzDL = j;
            this.zzDK = j2;
            this.zzZi8 = jArr;
        }

        public final long zz1y() {
            return this.zzDL;
        }

        public final long[] zzZS5() {
            return this.zzZi8;
        }

        public final long zzZS6() {
            return this.zzDK;
        }
    }

    private zzJ7(zz7H zz7h, zz07 zz07Var, zzIZ zziz) {
        this.zzZjg = zz7h;
        this.zzZji = zz07Var;
        this.zzZi9 = zziz;
    }

    private static boolean zzLH(int i) {
        if (i == 0 || i == 1) {
            return true;
        }
        if (i == 2 || i == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    private static void zzX(zz7H zz7h, String str, double d) {
        zzZ(zz7h, str, zz3W.zzXy(d));
    }

    private static void zzY(zz7H zz7h, String str, double d) {
        zzZ(zz7h, str, com.aspose.words.internal.zzSA.zzj(d));
    }

    private static boolean zzYb(int i, int i2) {
        if (i == 0) {
            return i2 == 1;
        }
        if (i == 1) {
            return i2 == 0;
        }
        if (i == 2) {
            return i2 == 3;
        }
        if (i == 3) {
            return i2 == 2;
        }
        throw new IllegalStateException();
    }

    public static zzJ7 zzZ(zzJ4 zzj4, zzJ8 zzj8, zzJ6 zzj6, zz8X zz8x) {
        if (!"conn".equals(zz8x.getType())) {
            return zzZ(zzj4, zzj8, zz8x);
        }
        int iZzZRV = zzj6.zzZRV();
        if (iZzZRV == 0) {
            return zzZ(zzj4, zzj8);
        }
        if (iZzZRV == 1) {
            return zzj6.zzZRS() ? zzZ(zzj4, zzj8, false) : zzZ(zzj4, zzj8, false, zzj6);
        }
        if (iZzZRV == 2) {
            return zzj6.zzZRS() ? zzZ(zzj4, zzj8, true) : zzZ(zzj4, zzj8, true, zzj6);
        }
        if (iZzZRV == 3) {
            return zzj6.zzZRS() ? zzY(zzj4, zzj8) : zzZ(zzj4, zzj8, zzj6);
        }
        throw new IllegalStateException("Unexpected connector routing.");
    }

    public final boolean isEmpty() {
        return com.aspose.words.internal.zzAN.zzZD(this.zzZji.getWidth());
    }

    public final zzIZ zzZS7() {
        return this.zzZi9;
    }

    public final zz7H zzZTf() {
        return this.zzZjg;
    }

    public final zz07 zzZTh() {
        return this.zzZji;
    }

    private static zz07 zzX(zzJ4 zzj4, zzJ8 zzj8) {
        return zzZ(zzj4, zzj8, zzj8.getHeight());
    }

    private static zzJ7 zzY(zzJ4 zzj4, zzJ8 zzj8) {
        zz07 zz07VarZzX = zzX(zzj4, zzj8);
        zz7H zz7h = new zz7H();
        zz45 zz45Var = new zz45();
        zz7h.zzZAN().add(zz45Var);
        zz45Var.zzZ(new zz57(new zzJH(0.0d, zz07VarZzX.getHeight() / 2.0d)));
        zz45Var.zzZ(new zz5T(new zzJH(zz07VarZzX.getWidth(), zz07VarZzX.getHeight() / 2.0d)));
        return new zzJ7(zz7h, zz07VarZzX, new zzIY(com.aspose.words.internal.zzZPY.zzG(((float) ((zz07VarZzX.getWidth() / 2.0d) + zz07VarZzX.zzQb())) / 36000.0f, ((float) ((zz07VarZzX.getHeight() / 2.0d) + zz07VarZzX.zzYm())) / 36000.0f), zzHK.zzYQ(zzj4.zzZRR())));
    }

    private static zzJ7 zzZ(zzJ4 zzj4, zzJ8 zzj8) {
        zzZ zzZ2 = zzZ(zzj4);
        if (zzZ2 == null) {
            return zzY(zzj4, zzj8);
        }
        zz07 zz07Var = new zz07();
        zz07Var.zzW(com.aspose.words.internal.zzSA.zzo(Math.min(Float.intBitsToFloat((int) zzZ2.zz1y()), Float.intBitsToFloat((int) zzZ2.zzZS6()))));
        zz07Var.zzV(com.aspose.words.internal.zzSA.zzo(Math.min(com.aspose.words.internal.zzZPY.zzYC(zzZ2.zz1y()), com.aspose.words.internal.zzZPY.zzYC(zzZ2.zzZS6()))));
        zz07Var.setWidth(((double) com.aspose.words.internal.zzSA.zzo(Math.max(Float.intBitsToFloat((int) zzZ2.zz1y()), Float.intBitsToFloat((int) zzZ2.zzZS6())))) - zz07Var.zzQb());
        zz07Var.setHeight(((double) com.aspose.words.internal.zzSA.zzo(Math.max(com.aspose.words.internal.zzZPY.zzYC(zzZ2.zz1y()), com.aspose.words.internal.zzZPY.zzYC(zzZ2.zzZS6())))) - zz07Var.zzYm());
        zz07Var.setWidth(Math.max(91440.0d, zz07Var.getWidth()));
        zz07Var.setHeight(Math.max(91440.0d, zz07Var.getHeight()));
        zz7H zz7h = new zz7H();
        zz45 zz45Var = new zz45();
        zz7h.zzZAN().add(zz45Var);
        zz45Var.zzZ(new zz57(zzZ(zzZ2.zz1y(), zz07Var)));
        for (long j : zzZ2.zzZS5()) {
            zz45Var.zzZ(new zz5T(zzZ(j, zz07Var)));
        }
        zz45Var.zzZ(new zz5T(zzZ(zzZ2.zzZS6(), zz07Var)));
        return new zzJ7(zz7h, zz07Var, new zzIY(com.aspose.words.internal.zzZPY.zzG((Float.intBitsToFloat((int) zzj4.zzZS6()) + Float.intBitsToFloat((int) zzj4.zz1y())) / 2.0f, (com.aspose.words.internal.zzZPY.zzYC(zzj4.zzZS6()) + com.aspose.words.internal.zzZPY.zzYC(zzj4.zz1y())) / 2.0f), new zzHK()));
    }

    private static zzZ zzZ(zzJ4 zzj4) {
        Iterator<Integer> it = zzj4.zzZRQ().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            Iterator<Integer> it2 = zzj4.zzZRP().iterator();
            while (it2.hasNext()) {
                zzZ zzZ2 = zzZ(zzj4.zz1y(), zzj4.zzZS6(), iIntValue, it2.next().intValue());
                if (zzZ2 != null) {
                    return zzZ2;
                }
            }
        }
        return null;
    }

    private static zzJH zzZ(long j, zz07 zz07Var) {
        return new zzJH(((double) com.aspose.words.internal.zzSA.zzo(Float.intBitsToFloat((int) j))) - zz07Var.zzQb(), ((double) com.aspose.words.internal.zzSA.zzo(com.aspose.words.internal.zzZPY.zzYC(j))) - zz07Var.zzYm());
    }

    private static zzZ zzZ(long j, long j2, int i, int i2) {
        if (!zzZ(j, i, j2) || !zzZ(j2, i2, j)) {
            return null;
        }
        int i3 = (int) j;
        int i4 = (int) j2;
        if (!com.aspose.words.internal.zzAN.zzS(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)) && !com.aspose.words.internal.zzAN.zzS(com.aspose.words.internal.zzZPY.zzYC(j), com.aspose.words.internal.zzZPY.zzYC(j2))) {
            if (!zzYb(i, i2)) {
                if (zzLH(i)) {
                    return new zzZ(j, j2, com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i4), com.aspose.words.internal.zzZPY.zzYC(j)));
                }
                return new zzZ(j, j2, com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i3), com.aspose.words.internal.zzZPY.zzYC(j2)));
            }
            if (zzLH(i)) {
                return new zzZ(j, j2, com.aspose.words.internal.zzZPY.zzG((Float.intBitsToFloat(i4) + Float.intBitsToFloat(i3)) / 2.0f, com.aspose.words.internal.zzZPY.zzYC(j)), com.aspose.words.internal.zzZPY.zzG((Float.intBitsToFloat(i4) + Float.intBitsToFloat(i3)) / 2.0f, com.aspose.words.internal.zzZPY.zzYC(j2)));
            }
            return new zzZ(j, j2, com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i3), (com.aspose.words.internal.zzZPY.zzYC(j2) + com.aspose.words.internal.zzZPY.zzYC(j)) / 2.0f), com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i4), (com.aspose.words.internal.zzZPY.zzYC(j2) + com.aspose.words.internal.zzZPY.zzYC(j)) / 2.0f));
        }
        return new zzZ(j, j2, new long[0]);
    }

    private static boolean zzZ(long j, int i, long j2) {
        if (i == 0) {
            return Float.intBitsToFloat((int) j) > Float.intBitsToFloat((int) j2);
        }
        if (i == 1) {
            return Float.intBitsToFloat((int) j) < Float.intBitsToFloat((int) j2);
        }
        if (i == 2) {
            return com.aspose.words.internal.zzZPY.zzYC(j) > com.aspose.words.internal.zzZPY.zzYC(j2);
        }
        if (i == 3) {
            return com.aspose.words.internal.zzZPY.zzYC(j) < com.aspose.words.internal.zzZPY.zzYC(j2);
        }
        throw new IllegalStateException();
    }

    private static zzJ7 zzZ(zzJ4 zzj4, zzJ8 zzj8, boolean z, zzJ6 zzj6) {
        double dZzZS3;
        double dZzZS2;
        double dZzZS32;
        double dZzZS22;
        double d;
        String str;
        double dZzZS23;
        double dZzZS33;
        zzY zzyZzZ = zzZ(zzj4, zzj8.zzZSa(), z);
        if (!zzj6.zzZRU() && !zzj6.zzZRT()) {
            return zzZ(zzyZzZ, zzj8.getHeight());
        }
        float height = (zzj8.getHeight() * 0.3f) + zzyZzZ.zzZS4() + zzj8.zzZS8();
        double dAsin = Math.asin(zzj8.zzZS9() / zzyZzZ.zzZS4()) * 2.0d;
        zz07 zz07Var = new zz07();
        float f = height / 2.0f;
        zz07Var.zzW(com.aspose.words.internal.zzSA.zzo(Float.intBitsToFloat((int) zzyZzZ.zzPT()) - f));
        zz07Var.zzV(com.aspose.words.internal.zzSA.zzo(com.aspose.words.internal.zzZPY.zzYC(zzyZzZ.zzPT()) - f));
        double d2 = height;
        zz07Var.setWidth(com.aspose.words.internal.zzSA.zzo(d2));
        zz07Var.setHeight(com.aspose.words.internal.zzSA.zzo(d2));
        if (zzj6.zzZRU() && zzj6.zzZRT()) {
            if (zzyZzZ.zzZS0()) {
                dZzZS23 = zzyZzZ.zzZS3();
                dZzZS33 = zzyZzZ.zzZS2();
            } else {
                dZzZS23 = zzyZzZ.zzZS2();
                dZzZS33 = zzyZzZ.zzZS3();
            }
            str = "leftRightCircularArrow";
            if (z) {
                dZzZS32 = dZzZS23 - dAsin;
                d = dZzZS33 + dAsin;
            } else {
                dZzZS32 = dZzZS23 + dAsin;
                d = dZzZS33 - dAsin;
            }
        } else if (zzj6.zzZRU()) {
            if (zzyZzZ.zzZS0()) {
                dZzZS3 = zzyZzZ.zzZS2();
                dZzZS2 = zzyZzZ.zzZS3();
                d = dZzZS2 + dAsin;
                str = "leftCircularArrow";
                dZzZS32 = dZzZS3;
            } else {
                dZzZS32 = zzyZzZ.zzZS2();
                dZzZS22 = zzyZzZ.zzZS3();
                d = dZzZS22 - dAsin;
                str = "circularArrow";
            }
        } else if (zzyZzZ.zzZS0()) {
            dZzZS32 = zzyZzZ.zzZS3();
            dZzZS22 = zzyZzZ.zzZS2();
            d = dZzZS22 - dAsin;
            str = "circularArrow";
        } else {
            dZzZS3 = zzyZzZ.zzZS3();
            dZzZS2 = zzyZzZ.zzZS2();
            d = dZzZS2 + dAsin;
            str = "leftCircularArrow";
            dZzZS32 = dZzZS3;
        }
        double dZzZI = com.aspose.words.internal.zzAN.zzZI(dZzZS32);
        double dZzZI2 = com.aspose.words.internal.zzAN.zzZI(d);
        zz7H zz7hZzOA = zz7G.zzOA(str);
        zzX(zz7hZzOA, "adj1", (zzj8.getHeight() / height) * 0.6f);
        zzY(zz7hZzOA, "adj2", dAsin);
        zzY(zz7hZzOA, "adj3", dZzZI2);
        zzY(zz7hZzOA, "adj4", dZzZI);
        zzX(zz7hZzOA, "adj5", C20509OooO0oo.OooO0O0(zzj8.getHeight(), 0.3f, zzj8.zzZS8(), height));
        return new zzJ7(zz7hZzOA, zz07Var, new zzIX(zz7hZzOA, zz07Var));
    }

    private static zzJ7 zzZ(zzY zzy, float f) {
        double dZzZS2;
        double dZzZS3;
        float fZzZS4 = (0.3f * f) + zzy.zzZS4();
        zz07 zz07Var = new zz07();
        float f2 = fZzZS4 / 2.0f;
        zz07Var.zzW(com.aspose.words.internal.zzSA.zzo(Float.intBitsToFloat((int) zzy.zzPT()) - f2));
        zz07Var.zzV(com.aspose.words.internal.zzSA.zzo(com.aspose.words.internal.zzZPY.zzYC(zzy.zzPT()) - f2));
        double d = fZzZS4;
        zz07Var.setWidth(com.aspose.words.internal.zzSA.zzo(d));
        zz07Var.setHeight(com.aspose.words.internal.zzSA.zzo(d));
        zz7H zz7hZzOA = zz7G.zzOA("blockArc");
        if (zzy.zzZS0()) {
            dZzZS2 = zzy.zzZS3();
        } else {
            dZzZS2 = zzy.zzZS2();
        }
        zzY(zz7hZzOA, "adj1", dZzZS2);
        if (zzy.zzZS0()) {
            dZzZS3 = zzy.zzZS2();
        } else {
            dZzZS3 = zzy.zzZS3();
        }
        zzY(zz7hZzOA, "adj2", dZzZS3);
        zzX(zz7hZzOA, "adj3", (f / fZzZS4) * 0.6f);
        return new zzJ7(zz7hZzOA, zz07Var, new zzIX(zz7hZzOA, zz07Var));
    }

    private static void zzZ(zz7H zz7h, String str, double d) {
        zz7h.zzZAP().zzS(str, d);
    }

    private static zzJ7 zzZ(zzJ4 zzj4, zzJ8 zzj8, boolean z) {
        zzY zzyZzZ = zzZ(zzj4, zzj8.zzZSa(), z);
        zz07 zz07Var = new zz07();
        zz07Var.zzW(com.aspose.words.internal.zzSA.zzo(Float.intBitsToFloat((int) zzyZzZ.zzPT()) - (zzyZzZ.zzZS4() / 2.0f)));
        zz07Var.zzV(com.aspose.words.internal.zzSA.zzo(com.aspose.words.internal.zzZPY.zzYC(zzyZzZ.zzPT()) - (zzyZzZ.zzZS4() / 2.0f)));
        zz07Var.setWidth(com.aspose.words.internal.zzSA.zzo(zzyZzZ.zzZS4()));
        zz07Var.setHeight(com.aspose.words.internal.zzSA.zzo(zzyZzZ.zzZS4()));
        zz7H zz7h = new zz7H();
        zz45 zz45Var = new zz45();
        zz7h.zzZAN().add(zz45Var);
        zz45Var.zzZ(new zz57(new zzJH(((double) com.aspose.words.internal.zzSA.zzo(Float.intBitsToFloat((int) zzj4.zz1y()))) - zz07Var.zzQb(), ((double) com.aspose.words.internal.zzSA.zzo(com.aspose.words.internal.zzZPY.zzYC(zzj4.zz1y()))) - zz07Var.zzYm())));
        zzHJ zzhj = new zzHJ();
        zzhj.zzY(new zzJI(com.aspose.words.internal.zzSA.zzo(((double) zzyZzZ.zzZS4()) / 2.0d)));
        zzhj.zzZ(new zzJI(com.aspose.words.internal.zzSA.zzo(((double) zzyZzZ.zzZS4()) / 2.0d)));
        zzhj.zzZ(new zzJJ(com.aspose.words.internal.zzSA.zzj(zzyZzZ.zzZS3())));
        double dZzZS1 = zzyZzZ.zzZS1();
        if (!zzyZzZ.zzZS0()) {
            dZzZS1 -= 6.283185307179586d;
        }
        zzhj.zzY(new zzJJ(com.aspose.words.internal.zzSA.zzj(dZzZS1)));
        zz45Var.zzZ(zzhj);
        return new zzJ7(zz7h, zz07Var, new zzIY(zzyZzZ.zzPT(), zzHK.zzYQ((zzyZzZ.zzZS3() + zzyZzZ.zzZS2()) / 2.0d)));
    }

    private static zzY zzZ(zzJ4 zzj4, float f, boolean z) {
        float fZzZSd;
        boolean z2 = z ? f < 0.0f : f > 0.0f;
        if (zzj4.zzZSd() < Math.abs(f)) {
            fZzZSd = Math.abs(f);
        } else {
            fZzZSd = zzj4.zzZSd();
        }
        zzY zzy = new zzY(zzj4, fZzZSd, true, z2);
        return ((z ^ true) ^ z2) ^ (zzy.zzZS1() < 3.141592653589793d) ? zzy : new zzY(zzj4, fZzZSd, false, z2);
    }

    private static zzJ7 zzZ(zzJ4 zzj4, zzJ8 zzj8, zz8X zz8x) {
        zz07 zz07VarZzX = zzX(zzj4, zzj8);
        zz07 zz07VarZzZ = zz8W.zzZ(zz07VarZzX.zzZv(), zz8x.zzZCC());
        zz07VarZzZ.zzX(new zzHK(zz07VarZzZ.zzZCC().getValue() + zz07VarZzX.zzZCC().getValue()));
        zz7H zz7hZzY = zz8W.zzY(zz8x);
        return new zzJ7(zz7hZzY, zz07VarZzZ, new zzIX(zz7hZzY, zz07VarZzZ));
    }

    private static zzJ7 zzZ(zzJ4 zzj4, zzJ8 zzj8, zzJ6 zzj6) {
        String str;
        float height = zzj8.getHeight();
        if (!zzj6.zzZRU() && !zzj6.zzZRT()) {
            height = zzj8.getHeight() * 0.6f;
        }
        zz07 zz07VarZzZ = zzZ(zzj4, zzj8, height);
        if (zzj6.zzZRU() && zzj6.zzZRT()) {
            str = "leftRightArrow";
        } else if (zzj6.zzZRU()) {
            str = "leftArrow";
        } else if (zzj6.zzZRT()) {
            str = "rightArrow";
        } else {
            str = DrawToolFactory.LASSO_TYPE_RECT;
        }
        zz7H zz7hZzOA = zz7G.zzOA(str);
        if (zzj6.zzZRU() || zzj6.zzZRT()) {
            zzZ(zz7hZzOA, "adj1", 60000.0d);
            zzZ(zz7hZzOA, "adj2", 50000.0d);
        }
        return new zzJ7(zz7hZzOA, zz07VarZzZ, new zzIX(zz7hZzOA, zz07VarZzZ));
    }

    private static zz07 zzZ(zzJ4 zzj4, zzJ8 zzj8, float f) {
        return zzZ(zzj4, zzj8.zzZSd(), zzj8.zzZSc(), zzj8.zzZSb(), f);
    }

    private static zz07 zzZ(zzJ4 zzj4, float f, float f2, float f3, float f4) {
        float fZzZSd = (zzj4.zzZSd() - f) / 2.0f;
        float f5 = f2 + fZzZSd;
        float f6 = f3 + fZzZSd;
        long jZzV = com.aspose.words.internal.zzJ6.zzV(zzj4.zz1y(), zzj4.zzZS6(), f5);
        long jZzV2 = com.aspose.words.internal.zzJ6.zzV(zzj4.zz1y(), zzj4.zzZS6(), zzj4.zzZSd() - f6);
        float fZzZSd2 = (zzj4.zzZSd() - f5) - f6;
        zz07 zz07Var = new zz07();
        zz07Var.zzW(com.aspose.words.internal.zzSA.zzo(((Float.intBitsToFloat((int) jZzV2) + Float.intBitsToFloat((int) jZzV)) / 2.0f) - (fZzZSd2 / 2.0f)));
        zz07Var.zzV(com.aspose.words.internal.zzSA.zzo(((com.aspose.words.internal.zzZPY.zzYC(jZzV2) + com.aspose.words.internal.zzZPY.zzYC(jZzV)) / 2.0f) - (f4 / 2.0f)));
        zz07Var.setWidth(com.aspose.words.internal.zzSA.zzo(fZzZSd2));
        zz07Var.setHeight(com.aspose.words.internal.zzSA.zzo(f4));
        zz07Var.zzX(zzHK.zzYS(com.aspose.words.internal.zzSA.zzj(zzj4.zzZRR())));
        return zz07Var;
    }
}
