package com.aspose.words;

import android.os.Bundle;
import com.aspose.slides.OooOOOO;
import com.aspose.slides.Oooo0;

/* JADX INFO: loaded from: classes6.dex */
final class zzH7 extends zzDL {
    private long zzZgE;
    private long[] zzZgF;
    private com.aspose.words.internal.zzD3<zzGJ> zzZgG;
    private float zzZgH;
    private zzH8 zzZgI;

    public zzH7(zzGK zzgk) {
        super(zzgk);
        this.zzZgG = new com.aspose.words.internal.zzD3<>();
        this.zzZgE = 0L;
        this.zzZgI = (zzH8) zzgk;
        if (zzZQg()) {
            if (!this.zzZgI.zzZPt().zz40()) {
                zzH8 zzh8 = this.zzZgI;
                zzh8.zzS(zzh8.zzZPt().zz47());
                this.zzZgI.zzZPt().zzOc(1);
                zzGA.zzP(this.zzZgI.zzZPt());
            }
            if (this.zzZgI.zzZPs().zz40()) {
                zzH8 zzh82 = this.zzZgI;
                zzh82.zzR(zzh82.zzZPs().zz47());
                this.zzZgI.zzZPs().zzOc(0);
                zzGA.zzP(this.zzZgI.zzZPs());
            }
        }
    }

    private zzE4 zzM(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42) {
        return zzZQg() ? new zzE4(com.aspose.words.internal.zzZPY.zzG(zzzq42.zzZm(), zzzq42.zzZo()), com.aspose.words.internal.zzZPY.zzG(zzzq42.zzZm(), zzzq42.zzZn()), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZn()), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZo())) : new zzE4(com.aspose.words.internal.zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZn()), com.aspose.words.internal.zzZPY.zzG(zzzq42.zzZm(), zzzq42.zzZn()), com.aspose.words.internal.zzZPY.zzG(zzzq42.zzkw(), zzzq42.zzZn()), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn()));
    }

    private zzE4 zzN(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42) {
        return zzZQg() ? new zzE4(com.aspose.words.internal.zzZPY.zzG(zzzq42.zzkw(), zzzq42.zzZo()), com.aspose.words.internal.zzZPY.zzG(zzzq42.zzkw(), zzzq42.zzZn()), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn()), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZo())) : new zzE4(com.aspose.words.internal.zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZo()), com.aspose.words.internal.zzZPY.zzG(zzzq42.zzZm(), zzzq42.zzZo()), com.aspose.words.internal.zzZPY.zzG(zzzq42.zzkw(), zzzq42.zzZo()), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZo()));
    }

    private void zzX(zzZCP zzzcp, zzDI zzdi) throws Exception {
        zzH7 zzh7 = this;
        zzZCP zzzcp2 = zzzcp;
        int count = zzh7.zzZgI.zz3R() ? 1 : zzh7.zzZgI.zzZPj().getCount();
        zzh7.zzZgH = zzzcp2.zzl(count, zzh7.zzZgI.getGapWidth(), zzh7.zzZgI.zzZQk());
        long[] jArrZzZ = zzZ(zzh7.zzZgI, zzzcp2);
        long[] jArrZzZ2 = zzZ(zzh7.zzZgI, zzzcp2);
        zzzcp2.zzZKD();
        int i = 0;
        while (i < zzh7.zzZgI.zzZPj().getCount()) {
            ChartSeries chartSeries = zzh7.zzZgI.zzZPj().get(i);
            int i2 = 0;
            while (i2 < chartSeries.getValueCount()) {
                zzCF zzcfZzL0 = chartSeries.zz2z().zzL0(i2);
                zzCF zzcfZzL02 = chartSeries.zz2y().zzL0(i2);
                if (!zzh7.zzZ(zzcfZzL0, chartSeries.zz2y().zzZMv().zzKv(i2))) {
                    long jZzt = zzzcp2.zzt(zzcfZzL0.getValue(), zzh7.zzZgI.zz3R() ? Math.min(zzh7.zzZgI.zzZPs().zz41().zzZOS(), zzcfZzL02.getValue()) : zzcfZzL02.getValue());
                    long[] jArr = zzcfZzL02.getValue() < 0.0d ? jArrZzZ2 : jArrZzZ;
                    zzh7.zzZ(zzzcp2, zzdi, count, i2, jArr, jZzt, chartSeries);
                    jArr[i2] = jZzt;
                }
                i2++;
                zzh7 = this;
                zzzcp2 = zzzcp;
            }
            i++;
            zzh7 = this;
            zzzcp2 = zzzcp;
        }
    }

    private void zzY(zzZCP zzzcp, zzDI zzdi) throws Exception {
        zzZCP zzzcp2;
        zzDI zzdi2;
        this.zzZgH = zzzcp.zzl((this.zzZgI.zz3R() && this.zzZgI.zzZPg().zzZIT() == 3) ? 1 : this.zzZgI.zzZPi().size(), this.zzZgI.getGapWidth(), this.zzZgI.zzZQk());
        long jZzZKr = zzzcp.zzZKr();
        zzzcp.zzZKD();
        for (int i = 0; i < this.zzZgI.zzZPi().size(); i++) {
            ChartSeries chartSeries = this.zzZgI.zzZPi().get(this.zzZgI.zzLy(i));
            int i2 = 0;
            while (i2 < chartSeries.getValueCount()) {
                zzCF zzcfZzL0 = chartSeries.zz2E().zzL0(i2);
                zzCF zzcfZzL02 = chartSeries.zz2y().zzL0(i2);
                if (!this.zzZgI.zz3R() && zzcfZzL02 != null && zzDG.zzZ(this.zzZgI.zzZPs(), zzcfZzL02.getValue())) {
                    zzcfZzL02 = null;
                }
                if (this.zzZgI.zz3R() && zzcfZzL02 == null) {
                    zzzcp2 = zzzcp;
                    zzdi2 = zzdi;
                } else {
                    long jZzZ = zzZ(zzcfZzL0, zzcfZzL02, jZzZKr, zzzcp);
                    zzzcp2 = zzzcp;
                    zzdi2 = zzdi;
                    zzZ(zzzcp2, zzdi2, i2, i, jZzZKr, jZzZ, chartSeries);
                }
                i2++;
                zzzcp = zzzcp2;
                zzdi = zzdi2;
            }
        }
    }

    private int zzZQJ() {
        return ((Integer) this.zzZgI.zzZPg().zzLv(10)).intValue();
    }

    private int zzZQf() {
        return ((Integer) this.zzZgI.zzZPg().zzLv(16)).intValue();
    }

    private boolean zzZQg() {
        return this.zzZgI.zzZQl() == 0;
    }

    private boolean zzZQh() {
        return this.zzZgI.zzZPg().zzZIT() == 3;
    }

    private boolean zzZQi() {
        return this.zzZgI.zzZPg().zzZIT() == 0;
    }

    private boolean zzZQj() {
        return this.zzZgI.zzZPg().zzZIT() == 1 || this.zzZgI.zzZPg().zzZIT() == 2;
    }

    @Override // com.aspose.words.zzDL
    public final void zzZ(zzZCP zzzcp, zzDI zzdi) throws Exception {
        zzdi.zzW(zzdi.zzKy(6));
        int iZzZIT = this.zzZgI.zzZPg().zzZIT();
        if (iZzZIT == 1 || iZzZIT == 2) {
            zzX(zzzcp, zzdi);
        } else {
            zzY(zzzcp, zzdi);
        }
        zzdi.zzZI();
        zzZII().zzW(zzzcp, zzdi);
        zzCN.zzZ(this.zzZgI, zzzcp, zzdi);
    }

    public static float zzZ(float f, int i, int i2, int i3, boolean z) {
        return OooOOOO.OooO00o(i3, 100.0f, (i2 - ((i - 1) / 2.0f)) * (z ? 1 : -1) * f, z ? (i * f) - ((i2 + 1) * f) : i2 * f);
    }

    private static long zzZ(zzCF zzcf, zzCF zzcf2, long j, zzZCP zzzcp) throws Exception {
        return (zzcf == null || zzcf2 == null) ? j : zzzcp.zzt(zzcf.getValue(), zzcf2.getValue());
    }

    private void zzZ(zzZCP zzzcp, zzDI zzdi, int i, int i2, long j, long j2, ChartSeries chartSeries) throws Exception {
        int size = this.zzZgI.zzZPi().size();
        if (this.zzZgI.zz3R()) {
            zzZ(size, i, i2, j, j2, chartSeries, zzzcp, zzdi);
        } else {
            zzZ(size, i, j, j2, chartSeries, zzdi);
        }
    }

    private boolean zzZ(zzCF zzcf, zzCF zzcf2) throws Exception {
        return zzCF.zzR(zzcf) || zzCF.zzR(zzcf2) || this.zzZgI.zzZPt().zz41().zzZOR() > zzcf.getValue();
    }

    private void zzY(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42, zzGJ zzgj, int i) throws Exception {
        zzY(zzN(zzzq42, zzzq4), zzM(zzzq42, zzzq4), zzgj, i);
    }

    private void zzZ(zzZCP zzzcp, zzDI zzdi, int i, int i2, long[] jArr, long j, ChartSeries chartSeries) throws Exception {
        if (this.zzZgI.zz3R()) {
            zzZ(i, i2, 0, jArr[i2], j, chartSeries, zzzcp, zzdi);
        } else {
            zzZ(i, i2, jArr[i2], j, chartSeries, zzdi);
        }
    }

    private long zzX(int i, int i2, long j) {
        float fIntBitsToFloat;
        float fZzYC;
        float fZzZ = zzZ(this.zzZgH, i, i2, this.zzZgI.zzZQk(), this.zzZgI.zzZPt().getReverseOrder());
        if (zzZQg()) {
            fIntBitsToFloat = Float.intBitsToFloat((int) j);
        } else {
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) j);
            float f = this.zzZgH;
            fIntBitsToFloat = (fIntBitsToFloat2 - ((i * f) / 2.0f)) + fZzZ + (f / 2.0f);
        }
        if (zzZQg()) {
            float fZzYC2 = com.aspose.words.internal.zzZPY.zzYC(j);
            float f2 = this.zzZgH;
            fZzYC = (f2 / 2.0f) + (((((i * f2) / 2.0f) + fZzYC2) - f2) - fZzZ);
        } else {
            fZzYC = com.aspose.words.internal.zzZPY.zzYC(j);
        }
        return com.aspose.words.internal.zzZPY.zzG(fIntBitsToFloat, fZzYC);
    }

    private void zzY(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42, zzGJ zzgj, int i, boolean z) throws Exception {
        zzE4 zze4ZzN = zzN(zzzq42, zzzq4);
        zzE4 zze4ZzM = zzM(zzzq42, zzzq4);
        zzZ(i, z, zze4ZzN, zze4ZzM);
        zzY(zze4ZzN, zze4ZzM, zzgj, i);
    }

    private static long[] zzZ(zzH8 zzh8, zzZCP zzzcp) throws Exception {
        int iZzZPb = zzh8.zzZPb();
        long[] jArr = new long[iZzZPb];
        double dZzZOS = zzh8.zzZPs().zz41().zzZOS();
        double dZzZOR = zzh8.zzZPs().zz41().zzZOR();
        if (dZzZOR >= 0.0d) {
            dZzZOS = dZzZOR;
        } else if (dZzZOS > 0.0d) {
            dZzZOS = 0.0d;
        }
        long jZzt = zzzcp.zzt(zzh8.zzZPt().zz41().zzZOR(), dZzZOS);
        for (int i = 0; i < iZzZPb; i++) {
            jArr[i] = jZzt;
        }
        return jArr;
    }

    private void zzY(zzE4 zze4, zzE4 zze42, zzGJ zzgj, int i) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZL8 = zze4.zzZL8();
        com.aspose.words.internal.zzZQ4 zzzq4ZzZL82 = zze42.zzZL8();
        zzgj.zzZ(zzzq4ZzZL8, zzzq4ZzZL82, i, zzZQg());
        if (!zzZQg() ? !(com.aspose.words.internal.zzZPY.zzYC(zze4.zzZL7()) < com.aspose.words.internal.zzZPY.zzYC(zze4.zzZL6()) || com.aspose.words.internal.zzZPY.zzYC(zze42.zzZL7()) < com.aspose.words.internal.zzZPY.zzYC(zze42.zzZL6())) : !(Float.intBitsToFloat((int) zze4.zzZL7()) < Float.intBitsToFloat((int) zze4.zzZL4()) || Float.intBitsToFloat((int) zze42.zzZL7()) < Float.intBitsToFloat((int) zze42.zzZL4()))) {
            zzzq4ZzZL8 = zzzq4ZzZL82;
        }
        zzgj.zzR(zzzq4ZzZL8, i);
    }

    private void zzZ(int i, int i2, long j, long j2, ChartSeries chartSeries, zzDI zzdi) throws Exception {
        int iIndexOf = this.zzZgI.zzZPi().indexOf(chartSeries);
        com.aspose.words.internal.zzZQ4 zzzq4ZzY = zzY(i, iIndexOf, j, j2);
        if (!zzZQg() ? !com.aspose.words.internal.zzAN.zzS(com.aspose.words.internal.zzZPY.zzYC(j), com.aspose.words.internal.zzZPY.zzYC(j2)) : !com.aspose.words.internal.zzAN.zzS(Float.intBitsToFloat((int) j), Float.intBitsToFloat((int) j2))) {
            zzDG.zzZ(com.aspose.words.internal.zzZG.zzW(zzzq4ZzY), zzdi.zzsD(), chartSeries.zzNM(i2), zzdi.zzZIC().zzZMK(), chartSeries.getIndex());
        }
        zzW(zzFR.zzZ(zzZIE(), i2, chartSeries, zzzq4ZzY, j, j2, zzX(i, iIndexOf, j2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v0, types: [float, java.lang.String] */
    private com.aspose.words.internal.zzZQ4 zzY(int i, int i2, long j, long j2) {
        float fPutString;
        float fZzYC;
        float fIntBitsToFloat;
        float fZzZ = zzZ(this.zzZgH, i, i2, this.zzZgI.zzZQk(), this.zzZgI.zzZPt().getReverseOrder());
        if (zzZQg()) {
            fPutString = Float.intBitsToFloat((int) j);
        } else {
            Float.intBitsToFloat((int) j2);
            fPutString = Bundle.putString(this.zzZgH, i);
        }
        if (zzZQg()) {
            float fZzYC2 = com.aspose.words.internal.zzZPY.zzYC(j2);
            float f = this.zzZgH;
            fZzYC = (((i * f) / 2.0f) + fZzYC2) - f;
        } else {
            fZzYC = com.aspose.words.internal.zzZPY.zzYC(j);
        }
        float f2 = fPutString;
        if (!zzZQg()) {
            f2 = fPutString + fZzZ;
        }
        float fZzYC3 = zzZQg() ? fZzYC - fZzZ : com.aspose.words.internal.zzZPY.zzYC(j2);
        if (zzZQg()) {
            fIntBitsToFloat = Float.intBitsToFloat((int) j2) - Float.intBitsToFloat((int) j);
        } else {
            fIntBitsToFloat = this.zzZgH;
        }
        return new com.aspose.words.internal.zzZQ4(f2, fZzYC3, fIntBitsToFloat, zzZQg() ? this.zzZgH : com.aspose.words.internal.zzZPY.zzYC(j) - com.aspose.words.internal.zzZPY.zzYC(j2));
    }

    private void zzZ(int i, int i2, int i3, long j, long j2, ChartSeries chartSeries, zzZCP zzzcp, zzDI zzdi) throws Exception {
        long j3;
        zzGJ zzgj;
        int i4 = zzZQi() ? 0 : i3;
        int i5 = zzZQi() ? i : 1;
        int iIndexOf = zzZQi() ? this.zzZgI.zzZPi().indexOf(chartSeries) : 0;
        zzGJ zzgjZzZ = zzZ(zzzcp, chartSeries, zzdi, i4);
        int i6 = i5;
        int i7 = iIndexOf;
        com.aspose.words.internal.zzZQ4 zzzq4ZzY = zzY(i6, i7, j, j2);
        com.aspose.words.internal.zzZQ4 zzzq4ZzZJ = zzgjZzZ.zzZJ(zzzq4ZzY);
        com.aspose.words.internal.zzZQ4 zzzq4ZzZI = zzgjZzZ.zzZI(zzzq4ZzZJ);
        boolean z = !zzZQg() ? zzzq4ZzY.getHeight() >= 0.0f : zzzq4ZzY.getWidth() >= 0.0f;
        if (zzZQj() && !z) {
            zzdi.zzA(new com.aspose.words.internal.zzG());
        } else if (!zzZQh() && (!z || zzZQi())) {
            zzdi.zzZ(Oooo0.OooO00o(i2, 1, i7, i2), new com.aspose.words.internal.zzG());
        } else {
            zzdi.zzZ(0, new com.aspose.words.internal.zzG());
        }
        if (zzZQj()) {
            zzZ(zzzcp, zzgjZzZ);
            zzY(zzzcp, zzgjZzZ);
        }
        int iZzZQf = chartSeries.getShape() == 6 ? zzZQf() : chartSeries.getShape();
        if (iZzZQf == 1 || iZzZQf == 2) {
            j3 = j2;
            zzgj = zzgjZzZ;
            zzY(zzzq4ZzZJ, zzzq4ZzZI, zzgj, i2, z);
        } else if (iZzZQf == 3) {
            j3 = j2;
            zzgj = zzgjZzZ;
            zzY(zzzq4ZzZJ, zzzq4ZzZI, zzgj, i2);
        } else if (iZzZQf != 4 && iZzZQf != 5) {
            zzZ(zzzq4ZzZJ, zzzq4ZzZI, zzgjZzZ, i2);
            j3 = j2;
            zzgj = zzgjZzZ;
        } else {
            j3 = j2;
            zzgj = zzgjZzZ;
            zzZ(zzzq4ZzZJ, zzzq4ZzZI, zzgj, i2, z);
        }
        zzdi.zzZI();
        zzW(zzFR.zzZ(zzZIE(), i2, chartSeries, zzzq4ZzZJ, zzgj.zzY3(j), zzgj.zzY3(j3), zzgj.zzY3(zzX(i6, i7, j3))));
    }

    private void zzY(zzZCP zzzcp, zzGJ zzgj) throws Exception {
        long jZzY3 = zzgj.zzY3(zzzcp.zzZKr());
        long jZzY2 = zzgj.zzY2(jZzY3);
        this.zzZgE = com.aspose.words.internal.zzZPY.zzG((Float.intBitsToFloat((int) jZzY2) + Float.intBitsToFloat((int) jZzY3)) / 2.0f, (com.aspose.words.internal.zzZPY.zzYC(jZzY2) + com.aspose.words.internal.zzZPY.zzYC(jZzY3)) / 2.0f);
    }

    private void zzZ(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42, zzGJ zzgj, int i) throws Exception {
        zzZ(zzN(zzzq42, zzzq4), zzM(zzzq42, zzzq4), zzgj, i);
    }

    private void zzZ(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42, zzGJ zzgj, int i, boolean z) throws Exception {
        zzE4 zze4ZzN = zzN(zzzq42, zzzq4);
        zzE4 zze4ZzM = zzM(zzzq42, zzzq4);
        zzZ(i, z, zze4ZzN, zze4ZzM);
        zzZ(zze4ZzN, zze4ZzM, zzgj, i);
    }

    private void zzZ(int i, boolean z, zzE4 zze4, zzE4 zze42) {
        float fZzYC;
        float fZzYC2;
        long jZzPT = zzZQj() ? this.zzZgF[i] : z ? zze42.zzPT() : zze4.zzPT();
        long jZzPT2 = zzZQj() ? this.zzZgE : z ? zze4.zzPT() : zze42.zzPT();
        if (zzZQg()) {
            int i2 = (int) jZzPT2;
            fZzYC = (Float.intBitsToFloat((int) zze42.zzPT()) - Float.intBitsToFloat(i2)) / (Float.intBitsToFloat((int) jZzPT) - Float.intBitsToFloat(i2));
        } else {
            fZzYC = (com.aspose.words.internal.zzZPY.zzYC(zze42.zzPT()) - com.aspose.words.internal.zzZPY.zzYC(jZzPT2)) / (com.aspose.words.internal.zzZPY.zzYC(jZzPT) - com.aspose.words.internal.zzZPY.zzYC(jZzPT2));
        }
        if (zzZQg()) {
            int i3 = (int) jZzPT2;
            fZzYC2 = (Float.intBitsToFloat((int) zze4.zzPT()) - Float.intBitsToFloat(i3)) / (Float.intBitsToFloat((int) jZzPT) - Float.intBitsToFloat(i3));
        } else {
            fZzYC2 = (com.aspose.words.internal.zzZPY.zzYC(zze4.zzPT()) - com.aspose.words.internal.zzZPY.zzYC(jZzPT2)) / (com.aspose.words.internal.zzZPY.zzYC(jZzPT) - com.aspose.words.internal.zzZPY.zzYC(jZzPT2));
        }
        zze42.zzR(fZzYC);
        zze4.zzR(fZzYC2);
    }

    private void zzZ(zzE4 zze4, zzE4 zze42, zzGJ zzgj, int i) throws Exception {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        if (zzZQg()) {
            jArr = new long[]{zze4.zzZL4(), zze4.zzZL7(), zze42.zzZL7(), zze42.zzZL4()};
        } else {
            jArr = new long[]{zze4.zzZL6(), zze4.zzZL7(), zze42.zzZL7(), zze42.zzZL6()};
        }
        if (zzZQg()) {
            jArr2 = new long[]{zze4.zzZL5(), zze4.zzZL6(), zze42.zzZL6(), zze42.zzZL5()};
        } else {
            jArr2 = new long[]{zze4.zzZL5(), zze4.zzZL4(), zze42.zzZL4(), zze42.zzZL5()};
        }
        if (zzZQg()) {
            jArr3 = new long[]{zze4.zzZL6(), zze4.zzZL7(), zze42.zzZL7(), zze42.zzZL6()};
        } else {
            jArr3 = new long[]{zze4.zzZL5(), zze4.zzZL6(), zze42.zzZL6(), zze42.zzZL5()};
        }
        zzgj.zzY((!zzZQg() ? !(com.aspose.words.internal.zzZPY.zzYC(zze4.zzZL7()) < com.aspose.words.internal.zzZPY.zzYC(zze4.zzZL6()) || com.aspose.words.internal.zzZPY.zzYC(zze42.zzZL7()) < com.aspose.words.internal.zzZPY.zzYC(zze42.zzZL6())) : !(Float.intBitsToFloat((int) zze4.zzZL7()) < Float.intBitsToFloat((int) zze4.zzZL4()) || Float.intBitsToFloat((int) zze42.zzZL7()) < Float.intBitsToFloat((int) zze42.zzZL4()))) ? zze4.zzZL3() : zze42.zzZL3(), true, i, 50.0f);
        if (!zzZQg() ? !(Float.intBitsToFloat((int) zze4.zzZL7()) < Float.intBitsToFloat((int) zze4.zzZL6()) || Float.intBitsToFloat((int) zze42.zzZL7()) < Float.intBitsToFloat((int) zze42.zzZL6())) : !(com.aspose.words.internal.zzZPY.zzYC(zze4.zzZL7()) > com.aspose.words.internal.zzZPY.zzYC(zze4.zzZL4()) || com.aspose.words.internal.zzZPY.zzYC(zze42.zzZL7()) > com.aspose.words.internal.zzZPY.zzYC(zze42.zzZL4()))) {
            jArr = jArr2;
        }
        zzgj.zzY(jArr, false, i, 25.0f);
        zzgj.zzY(jArr3, false, i, 100.0f);
    }

    private void zzZ(zzZCP zzzcp, zzGJ zzgj) throws Exception {
        if (this.zzZgF != null) {
            return;
        }
        double[] dArrZzN = zzDG.zzN(this.zzZgI);
        this.zzZgF = new long[dArrZzN.length];
        ChartSeries chartSeries = this.zzZgI.zzZPj().get(0);
        for (int i = 0; i < dArrZzN.length; i++) {
            zzCF zzcfZzL0 = chartSeries.zz2z().zzL0(i);
            if (!zzCF.zzR(zzcfZzL0)) {
                long jZzY3 = zzgj.zzY3(zzzcp.zzt(zzcfZzL0.getValue(), this.zzZgI.zzZPg().zzZIT() == 1 ? 1.0d : dArrZzN[i]));
                long jZzY2 = zzgj.zzY2(jZzY3);
                this.zzZgF[i] = com.aspose.words.internal.zzZPY.zzG((Float.intBitsToFloat((int) jZzY2) + Float.intBitsToFloat((int) jZzY3)) / 2.0f, (com.aspose.words.internal.zzZPY.zzYC(jZzY2) + com.aspose.words.internal.zzZPY.zzYC(jZzY3)) / 2.0f);
            }
        }
    }

    private zzGJ zzZ(zzZCP zzzcp, ChartSeries chartSeries, zzDI zzdi, int i) {
        zzGJ zzgj = this.zzZgG.get(chartSeries.getIndex());
        if (zzgj != null) {
            return zzgj;
        }
        zzGJ zzgj2 = new zzGJ(zzzcp, chartSeries, zzdi, i, zzZQJ());
        this.zzZgG.set(chartSeries.getIndex(), zzgj2);
        return zzgj2;
    }
}
