package com.aspose.words;

import com.aspose.words.internal.C22244OooO0o0;
import com.aspose.words.ref.Ref;
import com.aspose.words.ref.RefPointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zz4K extends zz3O {
    private zz4L zzZ0Y;
    private zzCF[] zzZ0Z;
    private zzCF[] zzZ10;

    public zz4K(zzGK zzgk) {
        super(zzgk);
        this.zzZ0Y = (zz4L) zzgk;
    }

    private static double zzF(zzCF[] zzcfArr) {
        double value = 0.0d;
        for (zzCF zzcf : zzcfArr) {
            if (!zzCF.zzR(zzcf)) {
                zzE7 zze7 = (zzE7) com.aspose.words.internal.zzZKW.zzZ(zzcf, zzE7.class);
                value += zze7 != null ? zze7.getValue() : zzcf.getValue();
            }
        }
        return value;
    }

    private ChartSeries zzG(zzCF[] zzcfArr) {
        ChartSeries chartSeriesZz2J = zzZPk().zz2J();
        chartSeriesZz2J.zz2y().zzV(new zzCE(zzZPk().zz2y().getValueType()));
        int iMax = 0;
        for (zzCF zzcf : zzcfArr) {
            chartSeriesZz2J.zz2y().zzZN4().zzP(zzcf);
            iMax = Math.max(iMax, zzcf.getIndex());
            if (chartSeriesZz2J.zz2z().zzL0(zzcf.getIndex()).getValueType() == 0) {
                chartSeriesZz2J.zz2z().zzZN4().zzP(new zzD4(zzcf.getIndex(), "Other"));
            }
        }
        chartSeriesZz2J.zz2y().zzZN4().zzNy(iMax + 1);
        return chartSeriesZz2J;
    }

    private int zzHr(int i) {
        return Double.isNaN(this.zzZ0Y.zzZxT()) ? i > 3 ? 2 : 1 : (int) this.zzZ0Y.zzZxT();
    }

    private boolean zzZxP() {
        return this.zzZ0Y.zzZPg().zzZIS() == 1;
    }

    @Override // com.aspose.words.zz3O, com.aspose.words.zzDL
    public final void zzZ(zzZCP zzzcp, zzDI zzdi) throws Exception {
        zzdi.zzW(zzdi.zzKy(4));
        if (zzZPk() == null) {
            return;
        }
        zzZ(zzZPk().zz2y().zzZMv().zzZIo(), zzZPk().zz2y().zzZN4().getFormatCode());
        Ref<com.aspose.words.internal.zzZQ4> ref = new Ref<>(null);
        Ref<com.aspose.words.internal.zzZQ4> ref2 = new Ref<>(null);
        zzZ(zzzcp, ref, ref2);
        com.aspose.words.internal.zzZQ4 zzzq4 = ref.get();
        com.aspose.words.internal.zzZQ4 zzzq42 = ref2.get();
        long jZzZIz = zzdi.zzZIz();
        zz3N zz3n = new zz3N(zzZPk(), zzdi);
        double dZzZ = zzZ(this.zzZ10, zzzq4);
        zzZ(this.zzZ10, zzzq4, dZzZ, jZzZIz, zz3n, zzzcp.zz44());
        if (zzZxP()) {
            zzZ(this.zzZ0Z, zzzq42, dZzZ, jZzZIz, zz3n, zzzcp.zz44());
        } else {
            zzZ(this.zzZ0Z, zzzq42, zzdi);
        }
        zzZ(dZzZ, zzzq4, zzzq42, zzdi);
        zzdi.zzZI();
    }

    private void zzZ(double d, com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42, zzDI zzdi) throws Exception {
        long jZzG;
        zz4K zz4k;
        zzDI zzdi2;
        long jZzG2;
        long j;
        long jZzG3;
        long jZzG4;
        if (d < 90.0d) {
            com.aspose.words.internal.zzQ5 zzq5 = new com.aspose.words.internal.zzQ5(zzzq4, -d, 2.0d * d);
            long jZzPX = zzq5.zzPX();
            long jZzPW = zzq5.zzPW();
            if (zzZxP()) {
                RefPointF refPointF = new RefPointF(0L);
                RefPointF refPointF2 = new RefPointF(0L);
                zzZ(zzzq42, jZzPX, jZzPW, refPointF, refPointF2);
                jZzG4 = refPointF.get();
                jZzG3 = refPointF2.get();
            } else {
                jZzG4 = com.aspose.words.internal.zzZPY.zzG(zzzq42.zzZm(), zzzq42.zzZo());
                jZzG3 = com.aspose.words.internal.zzZPY.zzG(zzzq42.zzZm(), zzzq42.zzZn());
            }
            zz4k = this;
            j = jZzPX;
            jZzG = jZzPW;
        } else if (zzZxP()) {
            com.aspose.words.internal.zzZQ4 zzzq43 = zzzq4.getHeight() > zzzq42.getHeight() ? zzzq42 : zzzq4;
            com.aspose.words.internal.zzZQ4 zzzq44 = zzzq4.getHeight() > zzzq42.getHeight() ? zzzq4 : zzzq42;
            long jZzG5 = com.aspose.words.internal.zzZPY.zzG((zzzq43.zzkw() + zzzq43.zzZm()) / 2.0f, zzzq43.zzZo());
            long jZzG6 = com.aspose.words.internal.zzZPY.zzG((zzzq43.zzkw() + zzzq43.zzZm()) / 2.0f, zzzq43.zzZn());
            RefPointF refPointF3 = new RefPointF(0L);
            RefPointF refPointF4 = new RefPointF(0L);
            zzZ(zzzq44, jZzG5, jZzG6, refPointF3, refPointF4);
            jZzG4 = refPointF3.get();
            jZzG3 = refPointF4.get();
            zz4k = this;
            j = jZzG5;
            jZzG = jZzG6;
        } else {
            long jZzG7 = com.aspose.words.internal.zzZPY.zzG(zzzq42.zzZm(), zzzq42.zzZo());
            jZzG = com.aspose.words.internal.zzZPY.zzG(zzzq42.zzZm(), zzzq42.zzZn());
            if (zzzq4.getHeight() > zzzq42.getHeight()) {
                RefPointF refPointF5 = new RefPointF(0L);
                RefPointF refPointF6 = new RefPointF(0L);
                zzZ(zzzq4, jZzG7, jZzG, refPointF5, refPointF6);
                long j2 = refPointF5.get();
                jZzG3 = refPointF6.get();
                zz4k = this;
                zzdi2 = zzdi;
                jZzG2 = j2;
                j = jZzG7;
            } else {
                zz4k = this;
                zzdi2 = zzdi;
                jZzG2 = com.aspose.words.internal.zzZPY.zzG((zzzq4.zzkw() + zzzq4.zzZm()) / 2.0f, zzzq4.zzZo());
                j = jZzG7;
                jZzG3 = com.aspose.words.internal.zzZPY.zzG((zzzq4.zzkw() + zzzq4.zzZm()) / 2.0f, zzzq4.zzZn());
            }
            zz4k.zzZ(j, jZzG2, zzdi2);
            zz4k.zzZ(jZzG, jZzG3, zzdi2);
        }
        zzdi2 = zzdi;
        jZzG2 = jZzG4;
        zz4k.zzZ(j, jZzG2, zzdi2);
        zz4k.zzZ(jZzG, jZzG3, zzdi2);
    }

    private static void zzZ(com.aspose.words.internal.zzZQ4 zzzq4, long j, long j2, RefPointF refPointF, RefPointF refPointF2) {
        long jZzG = com.aspose.words.internal.zzZPY.zzG((zzzq4.zzkw() + zzzq4.zzZm()) / 2.0f, (zzzq4.zzZn() + zzzq4.zzZo()) / 2.0f);
        double dSqrt = Math.sqrt(Math.pow(Math.sqrt(Math.pow(com.aspose.words.internal.zzZPY.zzYC(j) - com.aspose.words.internal.zzZPY.zzYC(jZzG), 2.0d) + Math.pow(Float.intBitsToFloat((int) j) - Float.intBitsToFloat((int) jZzG), 2.0d)), 2.0d) - Math.pow(zzzq4.getWidth() / 2.0f, 2.0d));
        long[] jArrZzZ = zzZ(j, dSqrt, jZzG, zzzq4.getWidth() / 2.0f);
        long[] jArrZzZ2 = zzZ(j2, dSqrt, jZzG, zzzq4.getWidth() / 2.0f);
        refPointF.set(com.aspose.words.internal.zzZPY.zzYC(jArrZzZ[0]) < com.aspose.words.internal.zzZPY.zzYC(jArrZzZ[1]) ? jArrZzZ[0] : jArrZzZ[1]);
        refPointF2.set(com.aspose.words.internal.zzZPY.zzYC(jArrZzZ2[0]) > com.aspose.words.internal.zzZPY.zzYC(jArrZzZ2[1]) ? jArrZzZ2[0] : jArrZzZ2[1]);
    }

    private void zzZ(long j, long j2, zzDI zzdi) throws Exception {
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(j, j2);
        zzDG.zzZ(zzzgZzZ, this.zzZ0Y.zzZxQ(), (zzE3) null, zzdi.zzZIC().zzZMC(), 0);
        zzdi.zzsD().zzX(zzzgZzZ);
    }

    private void zzZ(zzZCP zzzcp, Ref<com.aspose.words.internal.zzZQ4> ref, Ref<com.aspose.words.internal.zzZQ4> ref2) throws Exception {
        float fZzYP = zzYP(zzzcp.zzZKu());
        float fZzZxR = (this.zzZ0Y.zzZxR() / 100.0f) * fZzYP;
        float gapWidth = (this.zzZ0Y.getGapWidth() / 100.0f) * fZzYP;
        if (!zzZxP()) {
            fZzZxR /= 2.0f;
        }
        float fOooO00o = OooOO0.OooO0O0.OooO00o(fZzZxR, 2.0f, fZzYP * 2.0f, gapWidth);
        float fZzZKC = zzzcp.zzZKC() / fOooO00o;
        if (!zzZxP()) {
            fZzZKC = Math.min(fZzZKC, zzzcp.zzZKB() / (4.0f * fZzZxR));
        }
        if (fZzZKC < 1.0f) {
            fZzYP *= fZzZKC;
            fZzZxR *= fZzZKC;
            fOooO00o *= fZzZKC;
        }
        long jZzZKr = zzzcp.zzZKr();
        float f = zzZxP() ? fZzZxR : fZzZxR * 2.0f;
        long jZzG = com.aspose.words.internal.zzZPY.zzG(((zzzcp.zz44().getWidth() - fOooO00o) / 2.0f) + fZzYP, com.aspose.words.internal.zzZPY.zzYC(jZzZKr));
        long jZzG2 = com.aspose.words.internal.zzZPY.zzG(((zzzcp.zz44().getWidth() + fOooO00o) / 2.0f) - f, com.aspose.words.internal.zzZPY.zzYC(jZzZKr));
        ref.set(zz3O.zzT(jZzG, fZzYP));
        ref2.set(zz3O.zzV(jZzG2, f, fZzZxR));
    }

    private void zzZ(zzCF[] zzcfArr, String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        double dZzF = zzF(zzcfArr);
        double value = 0.0d;
        for (int i = 0; i < zzcfArr.length; i++) {
            boolean zZzZ = zzZ(zzcfArr, i, dZzF);
            ArrayList arrayList3 = zZzZ ? arrayList : arrayList2;
            value += zZzZ ? zzcfArr[i].getValue() : 0.0d;
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzCF>) arrayList3, zzcfArr[i]);
        }
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzE7>) (arrayList.size() == 0 ? arrayList : arrayList2), new zzE7(zzcfArr.length, value, str));
        this.zzZ10 = (zzCF[]) arrayList2.toArray(new zzCF[0]);
        this.zzZ0Z = (zzCF[]) arrayList.toArray(new zzCF[0]);
    }

    private boolean zzZ(zzCF[] zzcfArr, int i, double d) {
        int iZzZxU = this.zzZ0Y.zzZxU();
        if (iZzZxU != 1) {
            return iZzZxU != 2 ? iZzZxU != 4 ? i >= zzcfArr.length - zzHr(zzcfArr.length) : zzcfArr[i].getValue() < this.zzZ0Y.zzZxT() : (zzcfArr[i].getValue() / d) * 100.0d < this.zzZ0Y.zzZxT();
        }
        return com.aspose.words.internal.zzZ1.zzZ(this.zzZ0Y.zzZxS(), zzcfArr[i].getIndex());
    }

    private void zzZ(zzCF[] zzcfArr, com.aspose.words.internal.zzZQ4 zzzq4, double d, long j, zz3N zz3n, com.aspose.words.internal.zzZQ4 zzzq42) throws Exception {
        int i;
        double d2;
        int i2;
        if (zzcfArr.length != 0) {
            float width = zzzq4.getWidth() / 2.0f;
            double dZzF = zzF(zzcfArr);
            ChartSeries chartSeriesZzG = zzG(zzcfArr);
            double[] dArrZzZ = zz3O.zzZ(d, zzcfArr, dZzF, zzzq4);
            double d3 = d;
            int i3 = 0;
            while (i3 < dArrZzZ.length) {
                int index = zzcfArr[i3].getIndex();
                double d4 = d3;
                float f = width;
                com.aspose.words.internal.zzZQ4 zzzq4ZzO = zz3O.zzZ(d4, dArrZzZ[i3], f, zzZPk().zzNM(index).getExplosion(), zzzq4, j, zzzq42).zzO(zzzq4);
                if (com.aspose.words.internal.zzAN.zzZD(dArrZzZ[i3])) {
                    i = index;
                    d2 = d4;
                    i2 = i3;
                } else {
                    i = index;
                    d2 = d4;
                    i2 = i3;
                    zz3n.zzZ(d2, dArrZzZ[i3], zzzq4ZzO, com.aspose.words.internal.zzZQ4.zz2T, i);
                    zzzq4ZzO = zzzq4ZzO;
                }
                double d5 = d2;
                zzW(zzFR.zzZ(zzZIE(), i, zzzq42.getWidth() / 2.0f < C22244OooO0o0.OooO00o(zzzq4, 2.0f, zzzq4.getX()) ? zzZPk() : chartSeriesZzG, zzzq4ZzO, new com.aspose.words.internal.zzZQ4(com.aspose.words.internal.zzJ6.zzB(zzzq4ZzO), 0L), 0.0f, d5, dArrZzZ[i2]));
                d3 = d5 + dArrZzZ[i2];
                i3 = i2 + 1;
                width = f;
            }
        }
    }

    private void zzZ(zzCF[] zzcfArr, com.aspose.words.internal.zzZQ4 zzzq4, zzDI zzdi) throws Exception {
        double dZzF = zzF(zzcfArr);
        int length = zzcfArr.length;
        float[] fArr = new float[length];
        double height = ((double) zzzq4.getHeight()) / dZzF;
        for (int i = 0; i < zzcfArr.length; i++) {
            fArr[i] = (float) ((zzCF.zzR(zzcfArr[i]) ? 0.0d : zzcfArr[i].getValue()) * height);
        }
        float fZzZo = zzzq4.zzZo();
        for (int i2 = 0; i2 < length; i2++) {
            int index = zzcfArr[i2].getIndex();
            ChartDataPoint chartDataPointZzNM = zzZPk().zzNM(index);
            com.aspose.words.internal.zzZQ4 zzzq4ZzX = com.aspose.words.internal.zzZQ4.zzX(zzzq4.zzZm(), fArr[i2] + fZzZo, zzzq4.zzkw(), fZzZo);
            zzDG.zzZ(com.aspose.words.internal.zzZG.zzW(zzzq4ZzX), zzdi.zzsD(), chartDataPointZzNM, zzdi.zzZIC().zzZMK(), index);
            long jZzB = com.aspose.words.internal.zzJ6.zzB(zzzq4ZzX);
            int i3 = (int) jZzB;
            zzW(zzFR.zzZ(zzZIE(), index, zzZPk(), zzzq4ZzX, com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i3), zzzq4ZzX.zzZn()), com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i3), zzzq4ZzX.zzZo()), jZzB));
            fZzZo += fArr[i2];
        }
    }

    private static double zzZ(zzCF[] zzcfArr, com.aspose.words.internal.zzZQ4 zzzq4) {
        return zz3O.zzZ(0.0d, zzcfArr, (float) zzF(zzcfArr), zzzq4)[r7.length - 1] / 2.0d;
    }

    private static long[] zzZ(long j, double d, long j2, double d2) {
        int i = (int) j;
        double dIntBitsToFloat = Float.intBitsToFloat((int) j2) - Float.intBitsToFloat(i);
        double dZzYC = com.aspose.words.internal.zzZPY.zzYC(j2) - com.aspose.words.internal.zzZPY.zzYC(j);
        double dSqrt = Math.sqrt((dIntBitsToFloat * dIntBitsToFloat) + (dZzYC * dZzYC));
        if (dSqrt > d + d2) {
            return new long[0];
        }
        if (dSqrt < Math.abs(d - d2)) {
            return new long[0];
        }
        double d3 = d * d;
        double d4 = ((dSqrt * dSqrt) + (d3 - (d2 * d2))) / (2.0d * dSqrt);
        double dIntBitsToFloat2 = ((dIntBitsToFloat * d4) / dSqrt) + ((double) Float.intBitsToFloat(i));
        double dZzYC2 = ((dZzYC * d4) / dSqrt) + ((double) com.aspose.words.internal.zzZPY.zzYC(j));
        double dSqrt2 = Math.sqrt(d3 - (d4 * d4)) / dSqrt;
        double d5 = (-dZzYC) * dSqrt2;
        double d6 = dIntBitsToFloat * dSqrt2;
        return new long[]{com.aspose.words.internal.zzZPY.zzG((float) (dIntBitsToFloat2 + d5), (float) (dZzYC2 + d6)), com.aspose.words.internal.zzZPY.zzG((float) (dIntBitsToFloat2 - d5), (float) (dZzYC2 - d6))};
    }
}
