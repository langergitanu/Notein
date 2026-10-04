package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzDL {
    private zzF6 zzZaO;
    protected ArrayList<zzFR> zzZaP = new ArrayList<>();
    private zzFS zzZaQ;
    private ChartSeries zzZaR;
    private ChartSeries zzZaS;
    private zzGK zzZyX;

    public zzDL(zzGK zzgk) {
        this.zzZyX = zzgk;
    }

    public static String[] zzG(ChartSeries chartSeries) {
        String[] strArr = new String[chartSeries.getValueCount()];
        for (int i = 0; i < chartSeries.getValueCount(); i++) {
            zzCF zzcfZzL0 = chartSeries.zz2z().zzL0(i);
            strArr[i] = zzcfZzL0 != null ? zzcfZzL0.getStringValue() : "";
        }
        return strArr;
    }

    private boolean zzKz(int i) {
        boolean z = i == 2 || i == 3 || i == 5;
        if (!this.zzZyX.zzZPc()) {
            return false;
        }
        ChartAxis chartAxisZzZPt = ((zzZCR) this.zzZyX).zzZPt();
        return (chartAxisZzZPt.zz40() && !chartAxisZzZPt.getReverseOrder() && !this.zzZyX.zzZQj()) || (!chartAxisZzZPt.zz40() && this.zzZyX.zzZQj() && z);
    }

    private void zzT(zzCF zzcf) {
        if (zzCF.zzR(zzcf)) {
            return;
        }
        this.zzZaS.zz2z().zzZMv().zzU(zzcf);
        this.zzZaR.zz2z().zzZMv().zzU(zzcf);
    }

    private ChartSeries zzZIF() {
        if (this.zzZaR == null) {
            zzZIH();
        }
        return this.zzZaR;
    }

    private ChartSeries zzZIG() {
        if (this.zzZaS == null) {
            zzZIH();
        }
        return this.zzZaS;
    }

    private void zzZIH() {
        ChartSeries chartSeries = this.zzZyX.zzZPj().get(0);
        ChartSeries chartSeries2 = new ChartSeries(this.zzZyX);
        this.zzZaS = chartSeries2;
        chartSeries2.zz2z().zzV(new zzCE(chartSeries.zz2z().getValueType()));
        this.zzZaS.zz2y().zzV(new zzCE(chartSeries.zz2y().getValueType()));
        ChartSeries chartSeries3 = new ChartSeries(this.zzZyX);
        this.zzZaR = chartSeries3;
        chartSeries3.zz2z().zzV(new zzCE(chartSeries.zz2z().getValueType()));
        this.zzZaR.zz2y().zzV(new zzCE(chartSeries.zz2y().getValueType()));
        for (ChartSeries chartSeries4 : this.zzZyX.zzZPj()) {
            for (int i = 0; i < this.zzZyX.zzZPb(); i++) {
                zzT(chartSeries4.zz2z().zzL0(i));
                zzCF zzcfZzL0 = chartSeries4.zz2y().zzL0(i);
                if (!zzCF.zzR(zzcfZzL0)) {
                    zzZ(zzcfZzL0, i);
                }
            }
        }
    }

    public void zzU(zzEM zzem, zzDI zzdi) throws Exception {
        if (!zzKz(zzem.getPosition())) {
            for (ChartSeries chartSeries : this.zzZyX.zzZPj()) {
                if (chartSeries.zz2s()) {
                    zzZ(zzem, zzdi, chartSeries.getIndex(), chartSeries.zz2H(), chartSeries.getName(), this.zzZyX);
                }
            }
            return;
        }
        for (int count = this.zzZyX.zzZPj().getCount() - 1; count >= 0; count--) {
            ChartSeries chartSeries2 = this.zzZyX.zzZPj().get(count);
            if (chartSeries2.zz2s()) {
                zzZ(zzem, zzdi, chartSeries2.getIndex(), chartSeries2.zz2H(), chartSeries2.getName());
            }
        }
    }

    public void zzV(zzEM zzem, zzDI zzdi) throws Exception {
        ChartSeries chartSeries = this.zzZyX.zzZPj().get(0);
        String[] strArrZzG = zzG(chartSeries);
        for (int i = 0; i < strArrZzG.length; i++) {
            zzZ(zzem, zzdi, chartSeries.getIndex(), chartSeries.zzNM(i), strArrZzG[i]);
        }
    }

    public final void zzW(zzZCP zzzcp, zzDI zzdi) throws Exception {
        this.zzZaQ = new zzFS(zzdi, this.zzZyX, zzzcp.zz44());
        zzdi.zzW(zzdi.zzKy(15));
        zzZ(zzzcp, zzdi);
        zzdi.zzZI();
    }

    public final void zzX(zzEM zzem, zzDI zzdi) throws Exception {
        if (zzem.zzZLB()) {
            zzV(zzem, zzdi);
        } else {
            zzU(zzem, zzdi);
        }
    }

    public final void zzZ(zzEM zzem, zzDI zzdi, int i, ChartDataPoint chartDataPoint, String str) throws Exception {
        zzZ(zzem, zzdi, i, chartDataPoint, str, null);
    }

    public abstract void zzZ(zzZCP zzzcp, zzDI zzdi) throws Exception;

    public final zzFS zzZIE() {
        return this.zzZaQ;
    }

    public final zzF6 zzZII() {
        if (this.zzZaO == null) {
            this.zzZaO = new zzF6(this.zzZyX);
        }
        return this.zzZaO;
    }

    public final void zzZPo() throws Exception {
        Iterator<zzFR> it = this.zzZaP.iterator();
        while (it.hasNext()) {
            it.next().zzZNs();
        }
        Iterator<zzFR> it2 = this.zzZaP.iterator();
        while (it2.hasNext()) {
            it2.next().zzZNw();
        }
    }

    private void zzZ(zzEM zzem, zzDI zzdi, int i, ChartDataPoint chartDataPoint, String str, zzGK zzgk) throws Exception {
        zzem.zzZ(zzZ(i, chartDataPoint, zzem, zzdi), str, zzgk);
    }

    public zzEO zzZ(int i, ChartDataPoint chartDataPoint, zzEM zzem, zzDI zzdi) throws Exception {
        return zzEN.zzZ(i, chartDataPoint, zzem.zzZLC(), zzem.zzZLz(), zzdi);
    }

    public final void zzV(zzZCP zzzcp, zzDI zzdi) throws Exception {
        if (this.zzZyX.zzZQO() == 0 || this.zzZyX.zzZQO() == 2 || this.zzZyX.zzZQO() == 4) {
            zzZ(zzzcp, zzdi, true);
        }
    }

    public final void zzW(zzEM zzem, zzDI zzdi) throws Exception {
        zzCN.zzZ(this.zzZyX, zzem, zzdi);
    }

    public final void zzW(zzFR zzfr) {
        if (zzfr != null) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzZaP, zzfr);
        }
    }

    public final void zzZ(long[] jArr, long j, zzDI zzdi, com.aspose.words.internal.zzG zzg) throws Exception {
        if (this.zzZyX.zzZQO() == 1 || this.zzZyX.zzZQO() == 3) {
            zzD9 zzd9 = (zzD9) this.zzZyX.zzZPg().zzLv(4);
            for (long j2 : jArr) {
                zzZ(j2, com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) j2), com.aspose.words.internal.zzZPY.zzYC(j)), zzd9, zzdi, zzg);
            }
        }
    }

    public final void zzU(zzZCP zzzcp, zzDI zzdi) throws Exception {
        if (this.zzZyX.zzZQO() == 2 || this.zzZyX.zzZQO() == 4) {
            zzZ(zzzcp, zzdi, false);
        }
    }

    private void zzZ(zzZCP zzzcp, zzDI zzdi, boolean z) throws Exception {
        zzD9 zzd9;
        zzDI zzdi2 = zzdi;
        long jZzZKr = zzzcp.zzZKr();
        if (z) {
            zzd9 = (zzD9) this.zzZyX.zzZPg().zzLv(4);
        } else {
            zzd9 = (zzD9) this.zzZyX.zzZPg().zzLv(6);
        }
        zzD9 zzd92 = zzd9;
        int i = 0;
        while (i < this.zzZyX.zzZPb()) {
            zzCF zzcfZzL0 = zzZIG().zz2z().zzL0(i);
            zzCF zzcfZzL02 = zzZIG().zz2y().zzL0(i);
            zzCF zzcfZzL03 = zzZIF().zz2y().zzL0(i);
            if (!zzCF.zzR(zzcfZzL0) && !zzCF.zzR(zzcfZzL02) && !zzCF.zzR(zzcfZzL03)) {
                long jZzt = zzzcp.zzt(zzcfZzL0.getValue(), zzcfZzL02.getValue());
                long jZzt2 = zzzcp.zzt(zzcfZzL0.getValue(), zzcfZzL03.getValue());
                if (z) {
                    com.aspose.words.internal.zzG zzgZzKy = zzdi2.zzKy(17);
                    long jZzG = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzt), com.aspose.words.internal.zzZPY.zzYC(jZzZKr));
                    zzZ(jZzt, jZzG, zzd92, zzdi2, zzgZzKy);
                    zzZ(jZzt2, jZzG, zzd92, zzdi2, zzgZzKy);
                } else {
                    zzZ(jZzt, jZzt2, zzd92, zzdi2, zzdi2.zzKy(18));
                }
            }
            i++;
            zzdi2 = zzdi;
        }
    }

    private static void zzZ(long j, long j2, zzD9 zzd9, zzDI zzdi, com.aspose.words.internal.zzG zzg) throws Exception {
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(j, j2);
        zzzgZzZ.zzX(zzDG.zzZ(zzd9, zzdi.zzZIC().zzZMC(), 0));
        zzg.zzX(zzzgZzZ);
    }

    public final void zzZ(zzFR[] zzfrArr) {
        for (zzFR zzfr : zzfrArr) {
            zzW(zzfr);
        }
    }

    private void zzZ(zzCF zzcf, int i) {
        zzCF zzcfZzL0 = this.zzZaR.zz2y().zzL0(i);
        if (zzCF.zzR(zzcfZzL0) || zzcfZzL0.getValue() > zzcf.getValue()) {
            this.zzZaR.zz2y().zzZMv().zzU(zzcf);
        }
        zzCF zzcfZzL02 = this.zzZaS.zz2y().zzL0(i);
        if (zzCF.zzR(zzcfZzL02) || zzcfZzL02.getValue() < zzcf.getValue()) {
            this.zzZaS.zz2y().zzZMv().zzU(zzcf);
        }
    }
}
