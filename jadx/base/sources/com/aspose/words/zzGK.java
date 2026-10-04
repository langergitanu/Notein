package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzGK implements Cloneable {
    private DocumentBase zzZCL;
    private ChartAxis zzZfL;
    private ChartAxis zzZfM;
    private ChartAxis zzZfN;
    private boolean zzZfO;
    private zzDL zzZfP;
    private int zzZfQ = -1;
    private int zzZfR;
    private zzDO zzZfS;
    private ChartSeries zzZfT;
    private zzDF zzZfU;
    private ArrayList<ChartSeries> zzZfV;
    private zzDT zzZyT;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private static com.aspose.words.internal.zzZYV<zzCF> zzL(ChartSeries chartSeries) {
        com.aspose.words.internal.zzZYV<zzCF> zzzyv = new com.aspose.words.internal.zzZYV<>();
        for (int i = 0; i < chartSeries.getValueCount(); i++) {
            zzCF zzcfZzL0 = chartSeries.zz2y().zzL0(i);
            if (zzcfZzL0 != null) {
                zzzyv.add(i, zzcfZzL0);
            }
        }
        return zzzyv;
    }

    private boolean zzZPf() {
        return zz3R() && getAxisZ() != null && getAxisZ().getReverseOrder();
    }

    private boolean zzZPh() {
        return ((Boolean) zzZPg().zzLv(14)).booleanValue();
    }

    private void zzZPp() {
        for (ChartSeries chartSeries : zzZPj()) {
            zzFD zzfdZz2y = chartSeries.zz2y();
            for (int i = 0; i < chartSeries.getValueCount(); i++) {
                if (zzfdZz2y.zzL0(i) == null) {
                    zzfdZz2y.zzZMv().zzU(new zzFA(i, 0.0d, false));
                }
            }
        }
    }

    private void zzZPq() {
        ChartSeries chartSeries;
        int iZzZLS = this.zzZyT.zzZJc().zzZLS();
        int i = 1;
        if (iZzZLS != 1) {
            if (iZzZLS != 2) {
                return;
            }
            zzZPp();
            return;
        }
        Iterator<ChartSeries> it = zzZPj().iterator();
        while (it.hasNext()) {
            ChartSeries next = it.next();
            zzFD zzfdZz2y = next.zz2y();
            zzFD zzfdZz2z = next.zz2z();
            com.aspose.words.internal.zzZYV<zzCF> zzzyvZzL = zzL(next);
            int i2 = 0;
            while (i2 < zzzyvZzL.getCount() - i) {
                int i3 = i2;
                int iZzT3 = zzzyvZzL.zzT3(i3);
                int i4 = i3 + 1;
                int iZzT32 = zzzyvZzL.zzT3(i4);
                zzCF zzcfZzL0 = zzfdZz2z.zzL0(iZzT3);
                zzCF zzcfZzL02 = zzfdZz2y.zzL0(iZzT3);
                zzCF zzcfZzL03 = zzfdZz2z.zzL0(iZzT32);
                zzCF zzcfZzL04 = zzfdZz2y.zzL0(iZzT32);
                if (zzCF.zzR(zzcfZzL0) || zzCF.zzR(zzcfZzL02) || zzCF.zzR(zzcfZzL03) || zzCF.zzR(zzcfZzL04)) {
                    chartSeries = next;
                } else {
                    chartSeries = next;
                    zzZ(iZzT3, iZzT32, zzfdZz2z, com.aspose.words.internal.zzZPY.zzG((float) zzcfZzL0.getValue(), (float) zzcfZzL02.getValue()), com.aspose.words.internal.zzZPY.zzG((float) zzcfZzL03.getValue(), (float) zzcfZzL04.getValue()), chartSeries.zz2y());
                }
                i2 = i4;
                next = chartSeries;
                i = 1;
            }
        }
    }

    private void zzZPr() {
        if (isEmpty()) {
            return;
        }
        zzZPq();
        if (zzZQj()) {
            this.zzZfQ = -1;
            double[] dArrZzN = zzDG.zzN(this);
            double[] dArr = new double[zzZPb()];
            double[] dArr2 = new double[zzZPb()];
            for (ChartSeries chartSeries : zzZPj()) {
                if (chartSeries.zz2y().getValueType() == 2) {
                    zzZ(chartSeries, dArr2, dArr, dArrZzN);
                    chartSeries.zz2y().zzZMv().zzNy(zzZPb());
                }
            }
        }
    }

    private boolean zzhN() {
        switch (zzZQO()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            default:
                return false;
        }
    }

    public final ChartAxis getAxisX() {
        zzZCR zzzcr;
        if (this.zzZfN == null && zzZPc() && (zzzcr = (zzZCR) com.aspose.words.internal.zzZKW.zzZ(this, zzZCR.class)) != null) {
            this.zzZfN = zzzcr.zzZPt();
        }
        return this.zzZfN;
    }

    public final ChartAxis getAxisY() {
        zzZCR zzzcr;
        if (this.zzZfM == null && zzZPc() && (zzzcr = (zzZCR) com.aspose.words.internal.zzZKW.zzZ(this, zzZCR.class)) != null) {
            this.zzZfM = zzzcr.zzZPs();
        }
        return this.zzZfM;
    }

    public final ChartAxis getAxisZ() {
        zzZCQ zzzcq;
        if (this.zzZfL == null && zzZPc() && (zzzcq = (zzZCQ) com.aspose.words.internal.zzZKW.zzZ(this, zzZCQ.class)) != null) {
            this.zzZfL = zzzcq.zzZQM();
        }
        return this.zzZfL;
    }

    public final zzD8 getChartSpace() {
        return this.zzZyT.zzZJc().zzZLZ();
    }

    public final ChartDataLabelCollection getDataLabels() {
        Object objZzLv = zzZPg().zzLv(3);
        return objZzLv != null ? (ChartDataLabelCollection) objZzLv : new ChartDataLabelCollection(this, null);
    }

    public final DocumentBase getDocument() {
        if (this.zzZCL == null) {
            this.zzZCL = (this.zzZyT == null || getChartSpace() == null) ? null : getChartSpace().zzZyb().getDocument();
        }
        return this.zzZCL;
    }

    public final boolean isEmpty() {
        return !zzhN() || zzZPi().size() == 0;
    }

    public final boolean zz2e() {
        return zzZQO() == 16;
    }

    public final boolean zz3R() {
        int iZzZQO = zzZQO();
        return iZzZQO == 1 || iZzZQO == 3 || iZzZQO == 8 || iZzZQO == 11 || iZzZQO == 13 || iZzZQO == 14;
    }

    public final boolean zz3S() {
        return zzZPg().zzZIT() == 1;
    }

    public final zzDT zz45() {
        return this.zzZyT;
    }

    public final int zzLy(int i) {
        return zzZPf() ? (zzZPi().size() - i) - 1 : i;
    }

    public final void zzLz(int i) {
        int i2 = this.zzZfR;
        if (i2 == 0) {
            zzZPg().zzL(0, Integer.valueOf(i));
        } else if (i2 == 1) {
            zzZPg().zzL(1, Integer.valueOf(i));
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException("there cannot be more than 3 axis.");
            }
            zzZPg().zzL(2, Integer.valueOf(i));
        }
        this.zzZfR++;
    }

    public final void zzT(int i, String str) {
        zzDT zzdt = this.zzZyT;
        if (zzdt != null) {
            zzdt.zzT(i, str);
        }
    }

    public final void zzW(zzZCP zzzcp, zzDI zzdi) throws Exception {
        this.zzZfP.zzW(zzzcp, zzdi);
    }

    public final void zzY(zzEM zzem, zzDI zzdi) throws Exception {
        this.zzZfP.zzW(zzem, zzdi);
    }

    public final void zzY3(boolean z) {
        if (getAxisX() == null || !getAxisX().zz3Z()) {
            return;
        }
        getAxisX().zz4p().zzL(2, Boolean.valueOf(z));
    }

    public final void zzZ(zzDT zzdt) {
        this.zzZyT = zzdt;
    }

    public final boolean zzZP3() {
        int iZzZQO = zzZQO();
        return iZzZQO == 10 || iZzZQO == 11;
    }

    public final boolean zzZP4() {
        return zzZQO() == 2;
    }

    public final boolean zzZP5() {
        return zzZQO() == 15;
    }

    public final boolean zzZP6() {
        return zzZQO() == 14;
    }

    public final boolean zzZP7() {
        return zzZQO() == 13;
    }

    public final boolean zzZP8() {
        int iZzZQO = zzZQO();
        return iZzZQO == 6 || iZzZQO == 15;
    }

    public final boolean zzZP9() {
        int iZzZQO = zzZQO();
        return iZzZQO == 7 || iZzZQO == 8 || iZzZQO == 9 || iZzZQO == 12;
    }

    public final boolean zzZPa() {
        return zzZQO() == 5;
    }

    public final int zzZPb() {
        if (this.zzZfQ < 0) {
            Iterator<ChartSeries> it = zzZPj().iterator();
            while (it.hasNext()) {
                this.zzZfQ = Math.max(this.zzZfQ, it.next().getValueCount());
            }
        }
        return this.zzZfQ;
    }

    public final boolean zzZPc() {
        switch (zzZQO()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
                return true;
            case 7:
            case 8:
            case 9:
            case 12:
            default:
                return false;
            case 16:
                for (ChartSeries chartSeries : zzZPj()) {
                    if (chartSeries.zz6y() != 5 && chartSeries.zz6y() != 6 && chartSeries.zz6y() != 4) {
                        return true;
                    }
                }
                return false;
        }
    }

    public final void zzZPd() {
        this.zzZfO = true;
    }

    public final boolean zzZPe() {
        return this.zzZfO;
    }

    public final zzDO zzZPg() {
        if (this.zzZfS == null) {
            this.zzZfS = new zzDO(getDocument());
        }
        return this.zzZfS;
    }

    public final ArrayList<ChartSeries> zzZPi() {
        if (this.zzZfV == null) {
            this.zzZfV = new ArrayList<>();
            for (ChartSeries chartSeries : zzZPj()) {
                if (chartSeries.zz2s()) {
                    com.aspose.words.internal.zzZQG.zzZ(this.zzZfV, chartSeries);
                }
            }
        }
        return this.zzZfV;
    }

    public final zzDF zzZPj() {
        if (this.zzZfU == null) {
            this.zzZfU = new zzDF(this);
        }
        return this.zzZfU;
    }

    public final ChartSeries zzZPk() {
        if (this.zzZfT == null) {
            int i = 0;
            this.zzZfT = zzZPi().size() == 0 ? null : zzZPi().get(0);
            while (true) {
                if (i >= zzZPi().size()) {
                    break;
                }
                if (!zzZPi().get(i).zz2z().isEmpty()) {
                    this.zzZfT = zzZPi().get(i);
                    break;
                }
                i++;
            }
        }
        return this.zzZfT;
    }

    public boolean zzZPl() {
        if (zzZPj().getCount() != 1 || zzZPk() == null) {
            return false;
        }
        return zzZPk().getDataPoints().zz3b() || zzZPh();
    }

    public final zzGK zzZPm() {
        zzGK zzgk = (zzGK) memberwiseClone();
        zzgk.zzZyT = null;
        zzgk.zzZfV = null;
        zzDO zzdo = this.zzZfS;
        if (zzdo != null) {
            zzgk.zzZfS = zzdo.zzZIW();
        }
        zzgk.zzZfU = new zzDF(zzgk);
        Iterator<ChartSeries> it = zzgk.zzZPj().iterator();
        while (it.hasNext()) {
            it.next().zzZ(zzgk);
        }
        ChartDataLabelCollection chartDataLabelCollection = (ChartDataLabelCollection) zzgk.zzZPg().zzLu(3);
        if (chartDataLabelCollection != null) {
            chartDataLabelCollection.zzZ(zzgk, null);
        }
        zzgk.zzZfN = null;
        zzgk.zzZfM = null;
        zzgk.zzZfL = null;
        return zzgk;
    }

    public final void zzZPn() {
        zzZPr();
        this.zzZfP = zzDK.zzP(this);
    }

    public final void zzZPo() throws Exception {
        this.zzZfP.zzZPo();
    }

    public abstract int zzZQO();

    public final boolean zzZQj() {
        int iZzZIT = zzZPg().zzZIT();
        return iZzZIT == 1 || iZzZIT == 2;
    }

    private void zzZ(ChartSeries chartSeries, double[] dArr, double[] dArr2, double[] dArr3) {
        zzFD zzfdZz2y = chartSeries.zz2y();
        for (int i = 0; i < zzZPb(); i++) {
            zzCF zzcfZzKv = zzfdZz2y.zzZMv().zzKv(i);
            boolean z = zzcfZzKv != null && zzcfZzKv.getValueType() == 2;
            String formatCode = z ? ((zzE7) zzcfZzKv).getFormatCode() : null;
            double value = (!z || Double.isNaN(zzcfZzKv.getValue())) ? 0.0d : zzcfZzKv.getValue();
            double[] dArr4 = (value >= 0.0d || !zzZP3()) ? dArr2 : dArr;
            dArr4[i] = dArr4[i] + value;
            zzfdZz2y.zzZMv().zzU(new zzE7(i, zz3S() ? dArr4[i] / dArr3[i] : dArr4[i], formatCode));
        }
    }

    public final void zzY(DocumentBase documentBase) {
        this.zzZCL = documentBase;
    }

    private static void zzZ(int i, int i2, zzFD zzfd, long j, long j2, zzFD zzfd2) {
        long j3;
        long j4;
        int i3 = i + 1;
        while (i3 < i2) {
            if (zzfd.zzL0(i3) != null) {
                j3 = j;
                j4 = j2;
                zzfd2.zzZMv().zzU(new zzFA(i3, com.aspose.words.internal.zzZPY.zzYC(zzDG.zzY(j3, j4, r0.getValue())), false));
            } else {
                j3 = j;
                j4 = j2;
            }
            i3++;
            j = j3;
            j2 = j4;
        }
    }

    public final void zzZ(zzEM zzem, zzDI zzdi) throws Exception {
        this.zzZfP.zzX(zzem, zzdi);
    }
}
