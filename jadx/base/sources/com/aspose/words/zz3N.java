package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zz3N {
    private int zzZ02;
    private int zzZ03;
    private int zzZ04;
    private zzDI zzZyQ;
    private ChartSeries zzZyw;

    public zz3N(ChartSeries chartSeries, zzDI zzdi) {
        this.zzZyw = chartSeries;
        this.zzZyQ = zzdi;
    }

    public static com.aspose.words.internal.zzZQ4 zzX(com.aspose.words.internal.zzZQ4 zzzq4, double d) {
        if (d >= 0.0d && !com.aspose.words.internal.zzAN.zzJ(d, 180.0d)) {
            return zzzq4;
        }
        float height = (zzzq4.getHeight() * (1.0f - (zzzq4.getHeight() / zzzq4.getWidth()))) / 6.0f;
        return new com.aspose.words.internal.zzZQ4(zzzq4.getX(), zzzq4.getY() + height, zzzq4.getWidth(), zzzq4.getHeight() - (height * 2.0f));
    }

    private com.aspose.words.internal.zzZG zzY(long[] jArr, int i, float f) throws Exception {
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(jArr, false, true);
        zzDG.zzZ(zzzgZzZ, this.zzZyw.zzNM(i), zzZP2(), i);
        zzzgZzZ.zzY(zzGJ.zzZ(zzzgZzZ.zzZ1(), f));
        zzDG.zzB(zzzgZzZ);
        return zzzgZzZ;
    }

    private zzF2 zzZP2() {
        return this.zzZyQ.zzZIC().zzZMJ();
    }

    private zzF2 zzZwp() {
        return this.zzZyQ.zzZIC().zzZMK();
    }

    public static double zzv(long j, long j2) {
        long jZzG = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) j) - Float.intBitsToFloat((int) j2), com.aspose.words.internal.zzZPY.zzYC(j) - com.aspose.words.internal.zzZPY.zzYC(j2));
        return com.aspose.words.internal.zzAN.zzZJ(com.aspose.words.internal.zzAN.zzZK(Math.atan2(com.aspose.words.internal.zzZPY.zzYC(jZzG), Float.intBitsToFloat((int) jZzG))));
    }

    public final void zzZ(double d, double d2, com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42, int i) throws Exception {
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
        com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
        com.aspose.words.internal.zzQ5 zzq5 = new com.aspose.words.internal.zzQ5(zzzq4, d, d2);
        zzp5.zzZ(zzq5);
        if (zzzq42.isEmpty()) {
            zzp5.zzZ(new long[]{zzq5.zzPW(), zzq5.zzPT(), zzq5.zzPX()}, false);
        } else {
            com.aspose.words.internal.zzQ5 zzq52 = new com.aspose.words.internal.zzQ5(zzzq42, d + d2, -d2);
            zzp5.zzR(zzq5.zzPW(), zzq52.zzPX());
            zzp5.zzZ(zzq52);
            zzp5.zzR(zzq52.zzPW(), zzq5.zzPX());
        }
        zzp5.zze(true);
        com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzp5);
        zzDG.zzZ(zzzg, this.zzZyQ.zzsD(), this.zzZyw.zzNM(i), zzZwp(), i);
    }

    private static zzYB4[] zzY(zzYB4 zzyb4) {
        double d = zzyb4.zzXe9 % 360.0d;
        double d2 = zzyb4.zzXe8 + d;
        int iFloor = (int) Math.floor(d / 90.0d);
        int iFloor2 = (int) Math.floor(d2 / 90.0d);
        if (iFloor == iFloor2) {
            return new zzYB4[]{new zzYB4(d, zzyb4.zzXe8)};
        }
        zzYB4[] zzyb4Arr = new zzYB4[(iFloor2 - iFloor) + 1];
        int i = iFloor;
        while (i <= iFloor2) {
            int i2 = i + 1;
            double d3 = i2 * 90;
            if (d3 > d2) {
                d3 = d2;
            }
            zzyb4Arr[i - iFloor] = new zzYB4(d, (d3 - d) % 360.0d);
            d = d3 % 360.0d;
            i = i2;
        }
        return zzyb4Arr;
    }

    public static double zzY(double d, double d2, com.aspose.words.internal.zzZQ4 zzzq4) {
        if (com.aspose.words.internal.zzAN.zzY(zzzq4.getWidth(), zzzq4.getHeight(), 1.0f)) {
            return com.aspose.words.internal.zzAN.zzZJ((d2 / 2.0d) + d);
        }
        double[] dArrZzZ = zzZ(d, d2, zzzq4);
        int i = 0;
        double d3 = 0.0d;
        double d4 = 0.0d;
        for (double d5 : dArrZzZ) {
            d4 += d5;
        }
        double d6 = d4 / 2.0d;
        while (i < dArrZzZ.length) {
            d3 += dArrZzZ[i];
            if (com.aspose.words.internal.zzAN.zzJ(d3, d6)) {
                break;
            }
            i++;
        }
        return com.aspose.words.internal.zzAN.zzZJ(((d2 / ((double) dArrZzZ.length)) * ((double) (i + 1))) + d);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e A[PHI: r12
      0x007e: PHI (r12v2 double) = (r12v1 double), (r12v1 double), (r12v4 double) binds: [B:6:0x0065, B:8:0x0070, B:10:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzZ(float f, double d, double d2, com.aspose.words.internal.zzZQ4 zzzq4, int i) throws Exception {
        zzYB4[] zzyb4ArrZzY = zzY(new zzYB4(d, d2));
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        int i2 = 0;
        zzp9.zzY(0.0f, f, 0);
        com.aspose.words.internal.zzQ5[] zzq5Arr = new com.aspose.words.internal.zzQ5[zzyb4ArrZzY.length];
        double d3 = Double.NaN;
        double d4 = 0.0d;
        while (i2 < zzyb4ArrZzY.length) {
            zzYB4 zzyb4 = zzyb4ArrZzY[i2];
            com.aspose.words.internal.zzZQ4 zzzq4ZzX = zzX(zzzq4, zzyb4.zzXe9);
            com.aspose.words.internal.zzZQ4 zzzq4ZzO = zzp9.zzO(zzzq4ZzX);
            int i3 = i2;
            double d5 = d3;
            com.aspose.words.internal.zzQ5 zzq5 = new com.aspose.words.internal.zzQ5(zzzq4ZzX, zzyb4.zzXe9, zzyb4.zzXe8);
            double d6 = zzyb4.zzXe9;
            double d7 = zzyb4.zzXe8;
            zzZ(zzyb4, zzq5, new com.aspose.words.internal.zzQ5(zzzq4ZzO, d6 + d7, -d7), i);
            if (!com.aspose.words.internal.zzAN.zzJ(zzyb4.zzXe9, 0.0d) || zzyb4.zzXe9 >= 180.0d) {
                d3 = d5;
            } else {
                d4 += zzyb4.zzXe8;
                if (Double.isNaN(d5)) {
                    d3 = zzyb4.zzXe9;
                }
            }
            zzq5Arr[i3] = zzq5;
            i2 = i3 + 1;
        }
        zzZ(zzzq4, zzp9, i, d3, d4);
        zzZ(zzq5Arr, i);
    }

    private void zzZ(zzYB4 zzyb4, com.aspose.words.internal.zzQ5 zzq5, com.aspose.words.internal.zzQ5 zzq52, int i) throws Exception {
        ArrayList arrayList = new ArrayList(2);
        com.aspose.words.internal.zzZG zzzgZzY = zzY(new long[]{zzq5.zzPX(), zzq5.zzPT(), zzq52.zzPT(), zzq52.zzPW()}, i, 50.0f);
        com.aspose.words.internal.zzZG zzzgZzY2 = zzY(new long[]{zzq5.zzPW(), zzq5.zzPT(), zzq52.zzPT(), zzq52.zzPX()}, i, 75.0f);
        if (com.aspose.words.internal.zzAN.zzJ(zzyb4.zzXe9, 90.0d) && zzyb4.zzXe9 < 270.0d) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZG>) arrayList, zzzgZzY2);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZG>) arrayList, zzzgZzY);
        } else {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZG>) arrayList, zzzgZzY);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZG>) arrayList, zzzgZzY2);
        }
        if (com.aspose.words.internal.zzAN.zzZD(zzyb4.zzXe8)) {
            return;
        }
        this.zzZyQ.zzsD().zzZ(zzZ(zzyb4), arrayList);
    }

    private int zzZ(zzYB4 zzyb4) {
        int i;
        if (com.aspose.words.internal.zzAN.zzJ(zzyb4.zzXe9, -90.0d) && zzyb4.zzXe9 < 90.0d) {
            i = this.zzZ02;
            this.zzZ04 += 2;
        } else if (com.aspose.words.internal.zzAN.zzJ(zzyb4.zzXe9, 90.0d) && zzyb4.zzXe9 < 270.0d) {
            int i2 = this.zzZ02;
            int i3 = this.zzZ04;
            int i4 = this.zzZ03;
            i = i2 - (i3 + i4);
            this.zzZ03 = i4 + 2;
        } else {
            i = com.aspose.words.internal.zzAN.zzJ(zzyb4.zzXe9, 270.0d) ? this.zzZ02 - this.zzZ04 : 0;
        }
        this.zzZ02 += 2;
        return i;
    }

    private void zzZ(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzP9 zzp9, int i, double d, double d2) throws Exception {
        if (Double.isNaN(d)) {
            return;
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzO = zzp9.zzO(zzzq4);
        com.aspose.words.internal.zzZG zzzgZzZ = zzZ(zzzq4, zzzq4ZzO, d, d2);
        zzDG.zzZ(zzzgZzZ, this.zzZyw.zzNM(i), zzZP2(), i);
        zzzgZzZ.zzY(zzGJ.zzX(zzzgZzZ.zzZ1(), true, com.aspose.words.internal.zzZQ4.zzT(zzzq4, zzzq4ZzO)));
        this.zzZyQ.zzsD().zzX(zzzgZzZ);
    }

    private static com.aspose.words.internal.zzZG zzZ(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42, double d, double d2) {
        com.aspose.words.internal.zzQ5 zzq5 = new com.aspose.words.internal.zzQ5(zzzq4, d, d2);
        com.aspose.words.internal.zzQ5 zzq52 = new com.aspose.words.internal.zzQ5(zzzq42, d + d2, -d2);
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
        com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
        zzp5.zzZ(zzq5);
        zzp5.zzR(zzq5.zzPW(), zzq52.zzPX());
        zzp5.zzZ(zzq52);
        zzp5.zzR(zzq52.zzPW(), zzq5.zzPX());
        zzp5.zze(true);
        com.aspose.words.internal.OooO00o.OooO00o(zzzg, zzp5);
        return zzzg;
    }

    private void zzZ(com.aspose.words.internal.zzQ5[] zzq5Arr, int i) throws Exception {
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
        com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
        zzp5.zze(true);
        com.aspose.words.internal.OooO00o.OooO00o(zzzg, zzp5);
        for (com.aspose.words.internal.zzQ5 zzq5 : zzq5Arr) {
            zzp5.zzZ(zzq5);
        }
        zzp5.zzZ(new long[]{zzq5Arr[zzq5Arr.length - 1].zzPW(), zzq5Arr[0].zzPT(), zzq5Arr[0].zzPX()}, false);
        zzDG.zzZ(zzzg, this.zzZyw.zzNM(i), zzZP2(), i);
        zzDG.zzB(zzzg);
        zzzg.zzZ2().zzXW(1);
        this.zzZyQ.zzsD().zzX(zzzg);
    }

    public static double[] zzZ(double d, com.aspose.words.internal.zzZQ4 zzzq4) {
        double[] dArr = new double[StyleIdentifier.LIST_TABLE_4_ACCENT_5];
        int i = 0;
        double d2 = d;
        for (int i2 = StyleIdentifier.LIST_TABLE_4_ACCENT_5; i < i2; i2 = StyleIdentifier.LIST_TABLE_4_ACCENT_5) {
            com.aspose.words.internal.zzQ5 zzq5 = new com.aspose.words.internal.zzQ5(zzzq4, d2, 1.0d);
            long jZzPX = zzq5.zzPX();
            long jZzPW = zzq5.zzPW();
            long jZzPT = zzq5.zzPT();
            int i3 = (int) jZzPW;
            int i4 = (int) jZzPX;
            double[] dArr2 = dArr;
            double d3 = d2;
            double dSqrt = Math.sqrt(Math.pow(com.aspose.words.internal.zzZPY.zzYC(jZzPW) - com.aspose.words.internal.zzZPY.zzYC(jZzPX), 2.0d) + Math.pow(Float.intBitsToFloat(i3) - Float.intBitsToFloat(i4), 2.0d));
            int i5 = (int) jZzPT;
            double dSqrt2 = Math.sqrt(Math.pow(com.aspose.words.internal.zzZPY.zzYC(jZzPW) - com.aspose.words.internal.zzZPY.zzYC(jZzPT), 2.0d) + Math.pow(Float.intBitsToFloat(i3) - Float.intBitsToFloat(i5), 2.0d));
            double dSqrt3 = Math.sqrt(Math.pow(com.aspose.words.internal.zzZPY.zzYC(jZzPT) - com.aspose.words.internal.zzZPY.zzYC(jZzPX), 2.0d) + Math.pow(Float.intBitsToFloat(i5) - Float.intBitsToFloat(i4), 2.0d));
            double d4 = ((dSqrt + dSqrt2) + dSqrt3) / 2.0d;
            dArr2[i] = Math.sqrt((d4 - dSqrt3) * (d4 - dSqrt2) * (d4 - dSqrt) * d4);
            d2 = d3 + 1.0d;
            i++;
            dArr = dArr2;
        }
        return dArr;
    }

    private static double[] zzZ(double d, double d2, com.aspose.words.internal.zzZQ4 zzzq4) {
        double d3;
        int iCeil;
        int i = 0;
        boolean z = true;
        if (com.aspose.words.internal.zzAN.zzZD(d2)) {
            return new double[]{0.0d};
        }
        if (com.aspose.words.internal.zzAN.zzJ(d2, 10.0d)) {
            iCeil = (int) Math.ceil(d2);
            d3 = 1.0d;
        } else {
            d3 = d2 / 10.0d;
            iCeil = 10;
        }
        double d4 = d3;
        double[] dArr = new double[iCeil];
        double d5 = d;
        while (i < iCeil) {
            com.aspose.words.internal.zzQ5 zzq5 = new com.aspose.words.internal.zzQ5(zzzq4, d5, d4);
            long jZzPX = zzq5.zzPX();
            long jZzPW = zzq5.zzPW();
            long jZzPT = zzq5.zzPT();
            int i2 = (int) jZzPW;
            boolean z2 = z;
            int i3 = (int) jZzPX;
            int i4 = iCeil;
            double[] dArr2 = dArr;
            int i5 = i;
            double dSqrt = Math.sqrt(Math.pow(com.aspose.words.internal.zzZPY.zzYC(jZzPW) - com.aspose.words.internal.zzZPY.zzYC(jZzPX), 2.0d) + Math.pow(Float.intBitsToFloat(i2) - Float.intBitsToFloat(i3), 2.0d));
            int i6 = (int) jZzPT;
            double dSqrt2 = Math.sqrt(Math.pow(com.aspose.words.internal.zzZPY.zzYC(jZzPW) - com.aspose.words.internal.zzZPY.zzYC(jZzPT), 2.0d) + Math.pow(Float.intBitsToFloat(i2) - Float.intBitsToFloat(i6), 2.0d));
            double dSqrt3 = Math.sqrt(Math.pow(com.aspose.words.internal.zzZPY.zzYC(jZzPT) - com.aspose.words.internal.zzZPY.zzYC(jZzPX), 2.0d) + Math.pow(Float.intBitsToFloat(i6) - Float.intBitsToFloat(i3), 2.0d));
            double d6 = ((dSqrt + dSqrt2) + dSqrt3) / 2.0d;
            dArr2[i5] = Math.sqrt((d6 - dSqrt3) * (d6 - dSqrt2) * (d6 - dSqrt) * d6);
            d5 += d4;
            i = i5 + 1;
            dArr = dArr2;
            z = z2;
            iCeil = i4;
        }
        return dArr;
    }

    public static boolean zzZ(long j, long j2, double d, double d2, float f, float f2, float f3) {
        return zzZ(j, j2, d, d2, f, f2, f3, f3);
    }

    public static boolean zzZ(long j, long j2, double d, double d2, float f, float f2, float f3, float f4) {
        double d3;
        double dAbs;
        if (!zzZ(j, j2, f, f2)) {
            return false;
        }
        if (!com.aspose.words.internal.zzAN.zzf(f3) && !com.aspose.words.internal.zzAN.zzf(f4) && zzZ(j, j2, f3, f4)) {
            return false;
        }
        double dZzv = zzv(j, j2);
        if (d2 < 0.0d) {
            d3 = d + d2;
            dAbs = Math.abs(d2);
        } else {
            d3 = d;
            dAbs = d2;
        }
        double dZzZJ = com.aspose.words.internal.zzAN.zzZJ(d3);
        double dZzZJ2 = com.aspose.words.internal.zzAN.zzZJ(dAbs + dZzZJ);
        return dZzZJ > dZzZJ2 ? (com.aspose.words.internal.zzAN.zzJ(dZzv, dZzZJ) && com.aspose.words.internal.zzAN.zzK(dZzv, 360.0d)) || com.aspose.words.internal.zzAN.zzK(dZzv, dZzZJ2) : com.aspose.words.internal.zzAN.zzO(dZzv, dZzZJ, 0.01d) && com.aspose.words.internal.zzAN.zzP(dZzv, dZzZJ2, 0.01d);
    }

    private static boolean zzZ(long j, long j2, float f, float f2) {
        long jZzG = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) j) - Float.intBitsToFloat((int) j2), com.aspose.words.internal.zzZPY.zzYC(j) - com.aspose.words.internal.zzZPY.zzYC(j2));
        int i = (int) jZzG;
        return com.aspose.words.internal.zzAN.zzR(((com.aspose.words.internal.zzZPY.zzYC(jZzG) * com.aspose.words.internal.zzZPY.zzYC(jZzG)) / (f2 * f2)) + ((Float.intBitsToFloat(i) * Float.intBitsToFloat(i)) / (f * f)), 1.0f);
    }
}
