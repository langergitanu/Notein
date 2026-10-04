package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzHG extends zzDL {
    private zzHH zzZgU;

    public zzHG(zzGK zzgk) {
        super(zzgk);
        this.zzZgU = (zzHH) zzgk;
    }

    private void zzX(zzZCP zzzcp, zzDI zzdi) throws Exception {
        zzHG zzhg = this;
        zzZCP zzzcp2 = zzzcp;
        double crossesAt = zzhg.zzZgU.zzZPs().getCrossesAt();
        zzCF[] zzcfArrZzZQK = zzhg.zzZQK();
        long[] jArr = new long[zzcfArrZzZQK.length];
        for (ChartSeries chartSeries : zzhg.zzZgU.zzZPj()) {
            if (chartSeries.zz2y().zzZMv().getValueType() == 2 && chartSeries.zz2y().zzZMv().getValueCount() != 0) {
                int length = zzcfArrZzZQK.length;
                long[] jArr2 = new long[length];
                long[] jArr3 = new long[zzcfArrZzZQK.length];
                zzCF[] zzcfArr = new zzCF[zzcfArrZzZQK.length];
                int i = 0;
                while (i < zzcfArrZzZQK.length) {
                    zzCF zzcf = zzcfArrZzZQK[i];
                    int i2 = i;
                    long[] jArr4 = jArr2;
                    if (com.aspose.words.internal.zzZPY.zzD(jArr[i], 0L)) {
                        jArr[i2] = zzzcp2.zzt(zzcf.getValue(), crossesAt);
                    }
                    zzCF zzcfZzL0 = chartSeries.zz2y().zzL0(zzcf.getIndex());
                    zzcfArr[i2] = zzcfZzL0;
                    jArr4[i2] = zzzcp2.zzt(zzcf.getValue(), zzCF.zzR(zzcfZzL0) ? crossesAt : zzcfZzL0.getValue());
                    jArr3[i2] = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jArr[i2]), (com.aspose.words.internal.zzZPY.zzYC(jArr[i2]) + com.aspose.words.internal.zzZPY.zzYC(jArr4[i2])) / 2.0f);
                    i = i2 + 1;
                    jArr2 = jArr4;
                }
                zzhg.zzZ(zzzcp2, zzdi, jArr2, jArr, chartSeries, jArr3, zzcfArrZzZQK, zzcfArr);
                System.arraycopy(jArr2, 0, jArr, 0, length);
            }
            zzhg = this;
            zzzcp2 = zzzcp;
        }
    }

    private void zzY(zzZCP zzzcp, zzDI zzdi) throws Exception {
        zzZCP zzzcp2;
        zzDI zzdi2;
        int i = 0;
        while (i < this.zzZgU.zzZPi().size()) {
            ChartSeries chartSeries = this.zzZgU.zzZPi().get(this.zzZgU.zzLy(i));
            long[] jArrZzK = zzzcp.zzK(chartSeries);
            if (this.zzZgU.zz3R()) {
                zzzcp2 = zzzcp;
                zzdi2 = zzdi;
                zzZ(zzzcp2, chartSeries, jArrZzK, zzdi2, i);
            } else {
                zzzcp2 = zzzcp;
                zzdi2 = zzdi;
                zzZ(zzzcp2, chartSeries, jArrZzK, zzzcp2.zzJ(chartSeries), zzdi2);
            }
            i++;
            zzzcp = zzzcp2;
            zzdi = zzdi2;
        }
    }

    private int zzZQJ() {
        return ((Integer) this.zzZgU.zzZPg().zzLv(10)).intValue();
    }

    private zzCF[] zzZQK() {
        ChartSeries chartSeries = this.zzZgU.zzZPj().get(0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < chartSeries.getValueCount(); i++) {
            zzCF zzcfZzL0 = chartSeries.zz2z().zzL0(i);
            if (!zzCF.zzR(zzcfZzL0)) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzCF>) arrayList, zzcfZzL0);
            }
        }
        return (zzCF[]) arrayList.toArray(new zzCF[0]);
    }

    @Override // com.aspose.words.zzDL
    public final void zzZ(zzZCP zzzcp, zzDI zzdi) throws Exception {
        zzdi.zzW(zzdi.zzKy(5));
        int iZzZIT = this.zzZgU.zzZPg().zzZIT();
        if (iZzZIT == 1 || iZzZIT == 2) {
            zzX(zzzcp, zzdi);
        } else {
            zzY(zzzcp, zzdi);
        }
        zzdi.zzZI();
        if (this.zzZgU.zzZQL()) {
            zzV(zzzcp, zzdi);
        }
        zzZII().zzW(zzzcp, zzdi);
        zzCN.zzZ(this.zzZgU, zzzcp, zzdi);
    }

    private void zzZ(zzZCP zzzcp, ChartSeries chartSeries, long[] jArr, int[] iArr, zzDI zzdi) throws Exception {
        Iterator<long[]> it = zzDG.zzZ(jArr, iArr).iterator();
        while (it.hasNext()) {
            zzdi.zzsD().zzX(zzZ(it.next(), (long[]) null, zzzcp, zzdi, chartSeries));
        }
        zzZ(zzFR.zzZ(zzZIE(), chartSeries, zzZ(zzzcp, jArr), jArr));
    }

    private void zzZ(zzZCP zzzcp, ChartSeries chartSeries, long[] jArr, zzDI zzdi, int i) throws Exception {
        long jZzZKr = zzzcp.zzZKr();
        int length = jArr.length == 0 ? 0 : (jArr.length * 2) - 1;
        com.aspose.words.internal.zz0Q zz0q = new com.aspose.words.internal.zz0Q(length);
        com.aspose.words.internal.zz0Q zz0q2 = new com.aspose.words.internal.zz0Q(length);
        for (int i2 = 0; i2 < jArr.length; i2++) {
            long j = jArr[i2];
            long jZzG = com.aspose.words.internal.zzZPY.zzYC(j) > com.aspose.words.internal.zzZPY.zzYC(jZzZKr) ? com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) j), com.aspose.words.internal.zzZPY.zzYC(jZzZKr)) : j;
            long jZzG2 = com.aspose.words.internal.zzZPY.zzYC(j) < com.aspose.words.internal.zzZPY.zzYC(jZzZKr) ? com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) j), com.aspose.words.internal.zzZPY.zzYC(jZzZKr)) : j;
            zz0q.add(jZzG);
            zz0q2.add(jZzG2);
            if (i2 < jArr.length - 1) {
                long j2 = jArr[i2 + 1];
                if ((com.aspose.words.internal.zzZPY.zzYC(j) > com.aspose.words.internal.zzZPY.zzYC(jZzZKr) && com.aspose.words.internal.zzZPY.zzYC(j2) < com.aspose.words.internal.zzZPY.zzYC(jZzZKr)) || (com.aspose.words.internal.zzZPY.zzYC(j) < com.aspose.words.internal.zzZPY.zzYC(jZzZKr) && com.aspose.words.internal.zzZPY.zzYC(j2) > com.aspose.words.internal.zzZPY.zzYC(jZzZKr))) {
                    int i3 = (int) j;
                    int i4 = (int) j2;
                    long jZzG3 = com.aspose.words.internal.zzZPY.zzG((((com.aspose.words.internal.zzZPY.zzYC(j2) * Float.intBitsToFloat(i3)) - (Float.intBitsToFloat(i4) * com.aspose.words.internal.zzZPY.zzYC(j))) - ((Float.intBitsToFloat(i3) - Float.intBitsToFloat(i4)) * com.aspose.words.internal.zzZPY.zzYC(jZzZKr))) / (-(com.aspose.words.internal.zzZPY.zzYC(j) - com.aspose.words.internal.zzZPY.zzYC(j2))), com.aspose.words.internal.zzZPY.zzYC(jZzZKr));
                    zz0q.add(jZzG3);
                    zz0q2.add(jZzG3);
                }
            }
        }
        zzdi.zzsD().zzZ(0, zzZ(zzzcp, zz0q.toArray(), zz0q2.toArray(), i, zzdi, chartSeries));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r28v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r32v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r32v4 */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.aspose.words.zzGJ] */
    private com.aspose.words.internal.zzG zzZ(zzZCP zzzcp, long[] jArr, long[] jArr2, int i, zzDI zzdi, ChartSeries chartSeries) throws Exception {
        long[] jArr3;
        com.aspose.words.internal.zzG zzg;
        long[] jArr4 = jArr;
        int i2 = 4;
        ?? zzgj = new zzGJ(zzzcp, chartSeries, zzdi, i, zzZQJ());
        long[] jArrZzJ = zzgj.zzJ(jArr4);
        long[] jArrZzI = zzgj.zzI(jArrZzJ);
        long[] jArrZzJ2 = zzgj.zzJ(jArr2);
        long[] jArrZzI2 = zzgj.zzI(jArrZzJ2);
        float[] fArrZzH = zzGJ.zzH(jArr4);
        float[] fArrZzH2 = zzGJ.zzH(jArrZzJ2);
        com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
        ?? r14 = 0;
        int i3 = 0;
        for (int i4 = 1; i3 < jArr4.length - i4; i4 = 1) {
            int i5 = i3 + 1;
            zzE4 zze4 = new zzE4(jArrZzI[i3], jArrZzJ[i3], jArrZzJ[i5], jArrZzI[i5]);
            zzE4 zze42 = new zzE4(jArrZzI2[i3], jArrZzJ2[i3], jArrZzJ2[i5], jArrZzI2[i5]);
            long[] jArr5 = new long[i2];
            jArr5[r14] = zze4.zzZL6();
            jArr5[i4] = zze4.zzZL7();
            jArr5[2] = zze42.zzZL7();
            jArr5[3] = zze42.zzZL6();
            ?? r32 = r14;
            long[] jArr6 = new long[i2];
            jArr6[r32 == true ? 1 : 0] = zze4.zzZL5();
            jArr6[i4] = zze4.zzZL4();
            jArr6[2] = zze42.zzZL4();
            jArr6[3] = zze42.zzZL5();
            long jZzZL5 = zze4.zzZL5();
            long jZzZL6 = zze4.zzZL6();
            long jZzZL62 = zze42.zzZL6();
            long jZzZL52 = zze42.zzZL5();
            ?? r28 = i4;
            long[] jArr7 = new long[i2];
            jArr7[r32 == true ? 1 : 0] = jZzZL5;
            jArr7[r28 == true ? 1 : 0] = jZzZL6;
            jArr7[2] = jZzZL62;
            jArr7[3] = jZzZL52;
            zzg2.zzX(zzgj.zzZ(zze42.zzZL3(), r28, chartSeries.getIndex(), fArrZzH2[i3]));
            zzg2.zzX(zzgj.zzZ(zze4.zzZL3(), r28, chartSeries.getIndex(), fArrZzH[i3]));
            zzg2.zzX(zzgj.zzZ(Float.intBitsToFloat((int) zze42.zzZL7()) < Float.intBitsToFloat((int) zze42.zzZL6()) ? jArr5 : jArr6, r32, chartSeries.getIndex(), 25.0f));
            zzg2.zzX(zzgj.zzZ(jArr7, r32, chartSeries.getIndex(), 100.0f));
            jArr4 = jArr;
            i3 = i5;
            r14 = r32 == true ? 1 : 0;
            i2 = 4;
        }
        if (this.zzZgU.zzZQL()) {
            jArr3 = jArrZzJ;
            zzg = zzg2;
            zzZ(jArr3, zzgj.zzY3(zzzcp.zzZKr()), zzdi, zzg);
        } else {
            jArr3 = jArrZzJ;
            zzg = zzg2;
        }
        zzZ(zzFR.zzZ(zzZIE(), chartSeries, zzZ(zzzcp, jArr3), jArr3));
        return zzg;
    }

    private static long[] zzZ(zzZCP zzzcp, long[] jArr) throws Exception {
        long jZzZKr = zzzcp.zzZKr();
        long[] jArr2 = new long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            jArr2[i] = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jArr[i]), (com.aspose.words.internal.zzZPY.zzYC(jArr[i]) + com.aspose.words.internal.zzZPY.zzYC(jZzZKr)) / 2.0f);
        }
        return jArr2;
    }

    private void zzZ(zzZCP zzzcp, zzDI zzdi, long[] jArr, long[] jArr2, ChartSeries chartSeries, long[] jArr3, zzCF[] zzcfArr, zzCF[] zzcfArr2) throws Exception {
        if (this.zzZgU.zz3R()) {
            com.aspose.words.internal.zzG zzgZzZ = zzZ(zzzcp, jArr, jArr2, 0, zzdi, chartSeries);
            if (com.aspose.words.internal.zzZPY.zzYC(jArr[0]) < com.aspose.words.internal.zzZPY.zzYC(jArr2[0])) {
                zzdi.zzsD().zzX((com.aspose.words.internal.zzZL) zzgZzZ);
                return;
            } else {
                zzdi.zzsD().zzZ(0, zzgZzZ);
                return;
            }
        }
        zzdi.zzsD().zzX(zzZ(jArr, jArr2, zzzcp, zzdi, chartSeries));
        zzZ(zzFR.zzZ(zzZIE(), chartSeries, jArr3, jArr, zzcfArr, zzcfArr2));
    }

    private static com.aspose.words.internal.zzZL zzZ(long[] jArr, long[] jArr2, zzZCP zzzcp, zzDI zzdi, ChartSeries chartSeries) throws Exception {
        long[] jArr3;
        if (jArr2 != null) {
            jArr3 = new long[jArr.length + jArr2.length];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            int length = jArr.length;
            for (int length2 = jArr2.length - 1; length2 >= 0; length2--) {
                jArr3[length] = jArr2[length2];
                length++;
            }
        } else {
            int length3 = jArr.length;
            long[] jArr4 = new long[length3 + 2];
            System.arraycopy(jArr, 0, jArr4, 1, jArr.length);
            long jZzZKr = zzzcp.zzZKr();
            jArr4[0] = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jArr[0]), com.aspose.words.internal.zzZPY.zzYC(jZzZKr));
            jArr4[length3 + 1] = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jArr[jArr.length - 1]), com.aspose.words.internal.zzZPY.zzYC(jZzZKr));
            jArr3 = jArr4;
        }
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzDG.zzZ(com.aspose.words.internal.zzZG.zzZ(jArr3, false, true), zzg, chartSeries.zzNM(0), zzdi.zzZIC().zzZMK(), chartSeries.getIndex());
        return zzg;
    }
}
