package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz5W extends zzDL {
    private zz5X zzZ1M;

    public zz5W(zzGK zzgk) {
        super(zzgk);
        this.zzZ1M = (zz5X) zzgk;
    }

    private static long[] zzN(com.aspose.words.internal.zzZYV<Long> zzzyv) {
        long[] jArr = new long[zzzyv.getCount()];
        for (int i = 0; i < zzzyv.getCount(); i++) {
            jArr[i] = zzzyv.zzVY(i).longValue();
        }
        return jArr;
    }

    private void zzT(zzZCP zzzcp, zzDI zzdi) throws Exception {
        if (this.zzZ1M.zzZPj().getCount() <= 1) {
            return;
        }
        ChartSeries chartSeries = this.zzZ1M.zzZPj().get(0);
        ChartSeries chartSeries2 = this.zzZ1M.zzZPj().get(this.zzZ1M.zzZPj().getCount() - 1);
        float fZzl = zzzcp.zzl(1, this.zzZ1M.zzZyK().getGapWidth(), 0);
        for (int i = 0; i < chartSeries.getValueCount(); i++) {
            zzCF zzcfZzL0 = chartSeries.zz2z().zzL0(i);
            zzCF zzcfZzL02 = chartSeries.zz2y().zzL0(i);
            zzCF zzcfZzL03 = chartSeries2.zz2z().zzL0(i);
            zzCF zzcfZzL04 = chartSeries2.zz2y().zzL0(i);
            if (!zzCF.zzR(zzcfZzL0) && !zzCF.zzR(zzcfZzL02) && !zzCF.zzR(zzcfZzL03) && !zzCF.zzR(zzcfZzL04)) {
                zz1A.zzZ(zzzcp.zzt(zzcfZzL0.getValue(), zzcfZzL02.getValue()), zzzcp.zzt(zzcfZzL03.getValue(), zzcfZzL04.getValue()), fZzl, this.zzZ1M.zzZyK(), zzdi);
            }
        }
    }

    private static int zzX(int i, com.aspose.words.internal.zzZYV<Long> zzzyv) {
        if (i > zzzyv.getCount() - 1) {
            return -1;
        }
        int iZzT3 = zzzyv.zzT3(i);
        return i == zzzyv.getCount() + (-1) ? iZzT3 : Math.max(iZzT3, zzzyv.zzT3(i + 1));
    }

    private static com.aspose.words.internal.zzG zzY(long[] jArr, boolean z, zzDI zzdi, ChartSeries chartSeries, boolean z2, boolean z3) throws Exception {
        return z2 ? zzZ(jArr, z, zzdi, chartSeries, z3) : zzZ(jArr, zzdi, chartSeries, z3);
    }

    private int zzZQJ() {
        return ((Integer) this.zzZ1M.zzZPg().zzLv(10)).intValue();
    }

    @Override // com.aspose.words.zzDL
    public final void zzZ(zzZCP zzzcp, zzDI zzdi) throws Exception {
        zzZCP zzzcp2;
        zzDI zzdi2;
        zzZII().zzW(zzzcp, zzdi);
        int i = 0;
        while (i < this.zzZ1M.zzZPi().size()) {
            ChartSeries chartSeries = this.zzZ1M.zzZPi().get(this.zzZ1M.zzLy(i));
            long[] jArrZzK = zzzcp.zzK(chartSeries);
            if (this.zzZ1M.zz3R()) {
                zzzcp2 = zzzcp;
                zzdi2 = zzdi;
                zzZ(zzzcp2, chartSeries, jArrZzK, i, zzdi2);
            } else {
                zzzcp2 = zzzcp;
                zzdi2 = zzdi;
                zzdi2.zzW(zzdi2.zzKy(16));
                zzZ(chartSeries, jArrZzK, zzzcp2.zzJ(chartSeries), zzdi2);
                zzdi2.zzZI();
            }
            i++;
            zzzcp = zzzcp2;
            zzdi = zzdi2;
        }
        zzZCP zzzcp3 = zzzcp;
        zzDI zzdi3 = zzdi;
        if (this.zzZ1M.zzZQL()) {
            zzV(zzzcp3, zzdi3);
        }
        if (this.zzZ1M.zzZyM()) {
            zzU(zzzcp3, zzdi3);
        }
        if (this.zzZ1M.zzZyK() != null && this.zzZ1M.zzZyK().isVisible() && !this.zzZ1M.zz3R()) {
            zzT(zzzcp3, zzdi3);
        }
        zzCN.zzZ(this.zzZ1M, zzzcp3, zzdi3);
    }

    private static void zzY(ChartSeries chartSeries, com.aspose.words.internal.zzZYV<Long> zzzyv, com.aspose.words.internal.zzG zzg, zzDI zzdi) throws Exception {
        char c = 2;
        long[] jArrZzX = zzEK.zzX(zzN(zzzyv), false);
        com.aspose.words.internal.zz0Q zz0q = new com.aspose.words.internal.zz0Q();
        zzEJ zzejZzZMG = zzdi.zzZIC().zzZMG();
        int i = 0;
        int i2 = 0;
        while (i < jArrZzX.length - 3) {
            long j = jArrZzX[i];
            long j2 = jArrZzX[i + 1];
            long j3 = jArrZzX[i + 2];
            int i3 = i + 3;
            long j4 = jArrZzX[i3];
            char c2 = c;
            long[] jArr = new long[4];
            jArr[0] = j;
            jArr[1] = j2;
            jArr[c2] = j3;
            jArr[3] = j4;
            if (zz0q.getCount() > 0) {
                zz0q.removeAt(zz0q.getCount() - 1);
            }
            zz0q.zzR(jArr);
            int iZzX = zzX(i2, zzzyv);
            boolean zHasDefaultFormat = chartSeries.getDataPoints().hasDefaultFormat(iZzX);
            i2++;
            int iZzX2 = zzX(i2, zzzyv);
            boolean z = iZzX2 > 0 && !chartSeries.getDataPoints().hasDefaultFormat(iZzX2);
            if (!zHasDefaultFormat || z || i == jArrZzX.length - 4) {
                com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
                ChartDataPoint chartDataPointZzNM = chartSeries.zzNM(iZzX);
                com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), com.aspose.words.internal.zzP5.zzW(zz0q));
                zzDG.zzZ(zzzg, zzg, chartDataPointZzNM, zzejZzZMG, chartSeries.getIndex());
                zz0q.clear();
            }
            i = i3;
            c = c2;
        }
    }

    @Override // com.aspose.words.zzDL
    public final zzEO zzZ(int i, ChartDataPoint chartDataPoint, zzEM zzem, zzDI zzdi) throws Exception {
        if (this.zzZ1M.zz3R()) {
            return zzEN.zzZ(i, chartDataPoint, zzem.zzZLC(), zzem.zzZLz(), zzdi);
        }
        return zzEN.zzZ(true, this.zzZ1M.zzZyL(), i, chartDataPoint, zzem.zzZLC(), zzem.zzZLz(), zzdi);
    }

    private void zzZ(zzZCP zzzcp, ChartSeries chartSeries, long[] jArr, int i, zzDI zzdi) throws Exception {
        zzGJ zzgj = new zzGJ(zzzcp, chartSeries, zzdi, i, zzZQJ());
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzdi.zzKy(8).zzZ(0, zzg);
        zzZ(zzgj, jArr, zzg);
        if (this.zzZ1M.zzZQL()) {
            zzZ(zzgj.zzJ(jArr), zzgj.zzY3(zzzcp.zzZKr()), zzdi, zzg);
        }
        zzZ(zzFR.zzZ(zzZIE(), chartSeries, zzgj.zzJ(jArr)));
    }

    private static void zzZ(zzGJ zzgj, long[] jArr, com.aspose.words.internal.zzG zzg) throws Exception {
        int i = 1;
        long[] jArrZzJ = zzgj.zzJ(jArr);
        zzGJ zzgj2 = zzgj;
        long[] jArrZzI = zzgj2.zzI(jArrZzJ);
        float[] fArrZzH = zzGJ.zzH(jArr);
        int i2 = 0;
        while (i2 < jArr.length - i) {
            long j = jArrZzI[i2];
            long j2 = jArrZzJ[i2];
            int i3 = i2 + 1;
            long j3 = jArrZzJ[i3];
            long j4 = jArrZzI[i3];
            int i4 = i;
            long[] jArr2 = new long[4];
            jArr2[0] = j;
            jArr2[i4] = j2;
            jArr2[2] = j3;
            jArr2[3] = j4;
            zzgj2.zzZ(jArr2, false, i2, fArrZzH[i2], zzg);
            zzgj2 = zzgj;
            i2 = i3;
            i = i4;
        }
    }

    private void zzZ(ChartSeries chartSeries, long[] jArr, int[] iArr, zzDI zzdi) throws Exception {
        boolean z = this.zzZ1M.getSmooth() || chartSeries.getSmooth();
        Iterator<long[]> it = zzDG.zzZ(jArr, iArr).iterator();
        while (it.hasNext()) {
            zzZ(it.next(), false, zzdi, chartSeries, false, z);
        }
        zzZ(chartSeries, jArr, zzdi);
        zzZ(zzFR.zzZ(zzZIE(), chartSeries, jArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZ(ChartSeries chartSeries, long[] jArr, zzDI zzdi) throws Exception {
        zzDI zzdi2;
        double width;
        com.aspose.words.internal.zz7 zz7VarZzZ = zzDG.zzZ(zzdi, chartSeries);
        boolean zZz2N = chartSeries.getMarker().zz2N();
        if (zZz2N) {
            zz4G outline = chartSeries.zz2H().zzaQ().getOutline();
            if (outline != null && outline.zzLh(0)) {
                width = outline.getWeight();
            } else {
                width = ((double) zzdi.zzZIC().zzZMG().zzLe(chartSeries.getIndex()).getWidth()) / 12700.0d;
            }
            chartSeries.getMarker().setSize((int) ((width * 2.0d) + 3.0d));
        }
        int i = 0;
        while (i < jArr.length) {
            zzCF zzcfZzNN = chartSeries.zzNN(i);
            if (!zzCF.zzR(zzcfZzNN)) {
                zzCF zzcfZzL0 = chartSeries.zz2y().zzL0(zzcfZzNN.getIndex());
                if (zzCF.zzR(zzcfZzL0) || zzDG.zzZ(this.zzZ1M.zzZPt(), zzcfZzNN.getValue()) || zzDG.zzZ(this.zzZ1M.zzZPs(), zzcfZzL0.getValue()) || !zzcfZzL0.isVisible()) {
                    zzdi2 = zzdi;
                } else {
                    zzdi2 = zzdi;
                    zzEE.zzZ(jArr[i], chartSeries.zzNM(chartSeries.zzW(zzcfZzNN)).getMarker(), chartSeries.getIndex(), zzdi2, zz7VarZzZ);
                }
            }
            i++;
            zzdi = zzdi2;
        }
        if (zZz2N) {
            chartSeries.getMarker().zz2O().zzZNG();
        }
    }

    public static void zzZ(long[] jArr, boolean z, zzDI zzdi, ChartSeries chartSeries, boolean z2, boolean z3) throws Exception {
        if (jArr.length <= 1) {
            return;
        }
        com.aspose.words.internal.zzG zzgZzY = zzY(jArr, z, zzdi, chartSeries, z2, z3);
        if (!zzdi.zzZIu().isEmpty()) {
            zzgZzY.zzZ(com.aspose.words.internal.zzP8.zzM(zzdi.zzZIu()));
        }
        zzdi.zzsD().zzX((com.aspose.words.internal.zzZL) zzgZzY);
    }

    private static com.aspose.words.internal.zzG zzZ(long[] jArr, zzDI zzdi, ChartSeries chartSeries, boolean z) throws Exception {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        com.aspose.words.internal.zzZYV<Long> zzzyvZzZ = zzZ(jArr, chartSeries);
        if (!z && !chartSeries.getSmooth()) {
            zzZ(chartSeries, zzzyvZzZ, zzg, zzdi);
            return zzg;
        }
        zzY(chartSeries, zzzyvZzZ, zzg, zzdi);
        return zzg;
    }

    private static com.aspose.words.internal.zzZYV<Long> zzZ(long[] jArr, ChartSeries chartSeries) {
        com.aspose.words.internal.zzZYV<Long> zzzyv = new com.aspose.words.internal.zzZYV<>();
        ChartDataPoint chartDataPointZzNM = chartSeries.zzNM(0);
        long j = jArr[0];
        long j2 = jArr[jArr.length - 1];
        zzzyv.set(0, Long.valueOf(j));
        zzzyv.set(jArr.length - 1, Long.valueOf(j2));
        for (int i = 1; i < jArr.length; i++) {
            float fZzO = com.aspose.words.internal.zzJ6.zzO(j, jArr[i]);
            ChartDataPoint chartDataPointZzNM2 = chartSeries.zzNM(i);
            if (chartDataPointZzNM2 != chartDataPointZzNM || fZzO > 12700.0f) {
                zzzyv.set(i, Long.valueOf(jArr[i]));
                j = jArr[i];
                chartDataPointZzNM = chartDataPointZzNM2;
            }
        }
        return zzzyv;
    }

    private static void zzZ(ChartSeries chartSeries, com.aspose.words.internal.zzZYV<Long> zzzyv, com.aspose.words.internal.zzG zzg, zzDI zzdi) throws Exception {
        com.aspose.words.internal.zz0Q zz0q = new com.aspose.words.internal.zz0Q();
        ChartDataPoint chartDataPoint = null;
        int i = 0;
        while (i < zzzyv.getCount()) {
            ChartDataPoint chartDataPointZzNM = chartSeries.zzNM(zzX(i, zzzyv));
            if (i == 0) {
                chartDataPoint = chartDataPointZzNM;
            }
            long jLongValue = zzzyv.zzVY(i).longValue();
            zz0q.add(jLongValue);
            if ((chartDataPointZzNM != chartDataPoint || i == zzzyv.getCount() - 1) && i > 0) {
                zzZ(zzg, chartSeries, chartDataPoint, zzdi, zz0q);
                zz0q.clear();
                zz0q.add(jLongValue);
            }
            i++;
            chartDataPoint = chartDataPointZzNM;
        }
    }

    private static void zzZ(com.aspose.words.internal.zzG zzg, ChartSeries chartSeries, ChartDataPoint chartDataPoint, zzDI zzdi, com.aspose.words.internal.zz0Q zz0q) throws Exception {
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(zz0q, true, false);
        zzDG.zzZ(zzzgZzZ, zzg, chartDataPoint, zzdi.zzZIC().zzZMG(), chartSeries.getIndex());
        if (zzzgZzZ.zzZ2() != null) {
            zzzgZzZ.zzZ2().zzXW(1);
        }
    }

    private static com.aspose.words.internal.zzG zzZ(long[] jArr, boolean z, zzDI zzdi, ChartSeries chartSeries, boolean z2) throws Exception {
        com.aspose.words.internal.zzP5 zzp5ZzY;
        long[] jArrZzN = zzN(zzZ(jArr, chartSeries));
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
        if (!z2 && !chartSeries.getSmooth()) {
            zzp5ZzY = com.aspose.words.internal.zzP5.zzX(jArrZzN, z, false);
        } else {
            zzp5ZzY = com.aspose.words.internal.zzP5.zzY(zzEK.zzX(jArrZzN, false));
        }
        com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzp5ZzY);
        zzDG.zzZ(zzzg, zzg, chartSeries.zz2H(), zzdi.zzZIC().zzZMK(), chartSeries.getIndex());
        return zzg;
    }
}
