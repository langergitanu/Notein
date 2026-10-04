package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzHE {
    private com.aspose.words.internal.zzZQ4 zzZgT;
    private zzDI zzZyQ;

    public zzHE(com.aspose.words.internal.zzZQ4 zzzq4, zzDI zzdi) {
        this.zzZgT = zzzq4;
        this.zzZyQ = zzdi;
    }

    private zzDT zz45() {
        return this.zzZyQ.getChartSpace().zzZHX().zz45();
    }

    private static boolean zzT(ChartAxis chartAxis) {
        if (!chartAxis.zz41().zzZOQ() || chartAxis.zz41().zzZEz.getType() != 2) {
            return false;
        }
        return com.aspose.words.internal.zzAN.zzZD(chartAxis.zz41().zzZOL().get(1).getValue()) ^ com.aspose.words.internal.zzAN.zzZD(chartAxis.zz41().zzZOL().get(0).getValue());
    }

    private static boolean zzU(ChartAxis chartAxis) {
        Iterator<ChartSeries> it = chartAxis.zz3H().iterator();
        while (it.hasNext()) {
            if (!it.next().zz2z().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private static void zzV(ChartAxis chartAxis) {
        chartAxis.zzZ(new zzGH(chartAxis));
        if (!chartAxis.getMajorUnitIsAuto()) {
            chartAxis.getTickLabels().setSpacing(Math.max(1, (int) chartAxis.getMajorUnit()));
        }
        if (chartAxis.getMinorUnitIsAuto()) {
            return;
        }
        chartAxis.setTickMarkSpacing(Math.max(1, (int) chartAxis.getMinorUnit()));
    }

    private ChartAxis zzW(ChartAxis chartAxis) {
        if (!chartAxis.getHidden() || chartAxis.zz3I().zz3R()) {
            return chartAxis;
        }
        ChartAxis chartAxis2 = null;
        for (ChartAxis chartAxis3 : zz45().zz3G()) {
            if (chartAxis3.zz40() == chartAxis.zz40() && (!chartAxis.zz3Z() || !chartAxis.zz40() || chartAxis3.zz3Z())) {
                if (!chartAxis.zz40() || chartAxis2 == null) {
                    chartAxis2 = chartAxis3;
                }
                if (!chartAxis3.getHidden() && !chartAxis3.zz3I().zzZPa() && (chartAxis.zz3I().zzZQO() != 6 || !chartAxis.zz40())) {
                    return chartAxis3;
                }
            }
        }
        return chartAxis2;
    }

    private static boolean zzX(zzFD zzfd) {
        Iterator<zzCF> it = zzfd.zzZN4().iterator();
        while (it.hasNext()) {
            if (!zzCG.zzY1(it.next().getValue())) {
                return false;
            }
        }
        return true;
    }

    private static int zzY(zzGK zzgk) {
        int iMax = 0;
        for (ChartSeries chartSeries : zzgk.zzZPj()) {
            int valueCount = chartSeries.getValueCount();
            if (chartSeries.zz2z().isDate() && !chartSeries.zz2z().isEmpty() && chartSeries.zz2z().zzZN4().zzZIg() && !chartSeries.zz2y().isEmpty() && chartSeries.zz2y().zzZN4().zzZIg()) {
                valueCount = Math.min(chartSeries.zz2z().zzZN4().zz2w(), chartSeries.zz2y().zzZN4().zz2w()) + 1;
            }
            iMax = Math.max(iMax, valueCount);
        }
        return iMax;
    }

    private void zzY7(boolean z) {
        ArrayList<ChartAxis> arrayList = new ArrayList();
        for (ChartAxis chartAxis : zz45().zz3G()) {
            if (chartAxis.zz40() == z && chartAxis.getHidden()) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<ChartAxis>) arrayList, chartAxis);
            }
        }
        for (ChartAxis chartAxis2 : arrayList) {
            ChartAxis chartAxisZzW = zzW(chartAxis2);
            if (chartAxisZzW != chartAxis2) {
                zzZ(chartAxisZzW, chartAxis2);
            }
        }
    }

    private void zzY8(boolean z) {
        if (zz45().zzZJf().size() >= 2 && zz45().zz3G().size() != 0) {
            zzY7(z);
        }
    }

    private com.aspose.words.internal.zzZQ4 zzZ(zzGK zzgk, ChartAxis chartAxis, ChartAxis chartAxis2) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzDG.zzZ(this.zzZgT, zz45().zz3y(), this.zzZyQ);
        com.aspose.words.internal.zzZQ4 zzzq4ZzX = (!zzZQD() || zzgk.zz3R()) ? zz45().zzZJb() ? com.aspose.words.internal.zzZQ4.zzX(zzzq4ZzZ, 0.0f, -zzDU.zzu(zzzq4ZzZ.getWidth(), zzzq4ZzZ.getHeight())) : zzzq4ZzZ : new com.aspose.words.internal.zzZQ4(zzzq4ZzZ.getX(), zzzq4ZzZ.getY(), zzzq4ZzZ.getWidth(), this.zzZgT.getHeight());
        if (zzZQD() && zzgk.zzZP3() && ((zzH8) zzgk).zzZQl() == 0) {
            if (!chartAxis.zz40()) {
                chartAxis2 = chartAxis;
            }
            chartAxis2.zz3Y().zz0(zzzq4ZzX);
            float fZzPf = chartAxis2.zzZr().zzPf() + chartAxis2.zz3N();
            if (!chartAxis2.zz3V() || !chartAxis2.zz3W()) {
                fZzPf = 0.0f;
            }
            if (((com.aspose.words.internal.zzZPW.zzYz(this.zzZyQ.zzZIz()) - zzzq4ZzZ.zzZn()) - fZzPf) - 30000.0f < 0.0f) {
                com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(com.aspose.words.internal.zzZPY.zzG(0.0f, 0.0f), this.zzZyQ.zzZIz());
                zzzq4.zzH(-this.zzZyQ.zzZIC().zzZdM, -this.zzZyQ.zzZIC().zzZdM);
                zzzq4ZzX = new com.aspose.words.internal.zzZQ4(zzzq4.getX(), zzzq4.getY(), zzzq4.getWidth(), zzzq4ZzX.getHeight());
            }
        }
        return zz45().zzZ(zzgk, zzzq4ZzX, this.zzZyQ, chartAxis.zz40());
    }

    private boolean zzZQD() {
        return zz45().zz3y() != null && zz45().zz3y().zzZLp() == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void zzZQE() {
        for (zzGK zzgk : zz45().zzZJf()) {
            if (zzgk.zzZPc()) {
                zz5X zz5x = (zz5X) com.aspose.words.internal.zzZKW.zzZ(zzgk, zz5X.class);
                zzZCR zzzcr = (zzZCR) zzgk;
                ChartAxis chartAxisZzW = zzW(zzzcr.zzZPt());
                ChartAxis chartAxisZzW2 = zzW(zzzcr.zzZPs());
                for (ChartSeries chartSeries : zzgk.zzZPj()) {
                    if ((zz5x != null && zz5x.getSmooth()) || chartSeries.getSmooth()) {
                        zzZ(chartAxisZzW, chartSeries.zz2z(), true);
                        zzZ(chartAxisZzW2, chartSeries.zz2y(), true);
                        zzZ(chartAxisZzW, chartSeries.zz2z(), false);
                        zzZ(chartAxisZzW2, chartSeries.zz2y(), false);
                    }
                }
            }
        }
    }

    private void zzZQF() {
        for (ChartAxis chartAxis : zz45().zz3G()) {
            if (!chartAxis.getHidden() && !chartAxis.zz41().zzZOQ() && chartAxis.zz4q() && zzU(chartAxis)) {
                zzV(chartAxis);
            }
        }
    }

    private void zzZQG() {
        Iterator<ChartAxis> it = zz45().zz3G().iterator();
        while (it.hasNext()) {
            it.next().zzZ(this.zzZyQ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void zzZQH() {
        for (zzGK zzgk : zz45().zzZJf()) {
            if (zzgk.zzZPc()) {
                zzZCR zzzcr = (zzZCR) zzgk;
                zzzcr.zzZPt().zzZ(zzgk);
                zzzcr.zzZPs().zzZ(zzgk);
                zzzcr.zzZPt().zzZ(this.zzZyQ);
                zzzcr.zzZPs().zzZ(this.zzZyQ);
            }
        }
    }

    private com.aspose.words.internal.zzZQ4 zzZW(com.aspose.words.internal.zzZQ4 zzzq4) {
        float x;
        float x2;
        float x3 = zzzq4.getX();
        float width = zzzq4.getWidth();
        float fZzYB = com.aspose.words.internal.zzSA.zzYB(11);
        if (x3 < fZzYB) {
            x2 = width - (fZzYB - zzzq4.getX());
            x = fZzYB;
        } else {
            x = zzzq4.getX() + fZzYB;
            x2 = width - fZzYB;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) this.zzZyQ.zzZIz()) - zzzq4.zzkw();
        if (fIntBitsToFloat >= fZzYB) {
            fIntBitsToFloat = 0.0f;
        }
        return new com.aspose.words.internal.zzZQ4(x, zzzq4.getY(), x2 - (fZzYB - fIntBitsToFloat), zzzq4.getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzra() throws Exception {
        zzZQG();
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = com.aspose.words.internal.zzZQ4.zz2T;
        zzZQH();
        zzZQF();
        Iterator<zzGK> it = zz45().zzZJf().iterator();
        boolean z = false;
        while (true) {
            if (!it.hasNext()) {
                zzY8(true);
                zzZQE();
                zzZ(z, zzzq4ZzZ);
                zzY8(false);
                return;
            }
            zzGK next = it.next();
            if (next.zzZPc()) {
                zzZCR zzzcr = (zzZCR) next;
                ChartAxis chartAxisZzW = zzW(zzzcr.zzZPt());
                ChartAxis chartAxisZzW2 = zzW(zzzcr.zzZPs());
                if (zzzcr.zzZPt() != chartAxisZzW && !next.zz3R() && zz45().zzZJf().size() > 1) {
                    zzY(chartAxisZzW, zzzcr.zzZPt());
                }
                if (!z && !chartAxisZzW.zz40() && chartAxisZzW.zz4q()) {
                    z = true;
                }
                zzZ(next, chartAxisZzW, chartAxisZzW2, zzY(next));
                if (zzzq4ZzZ.isEmpty()) {
                    zzzq4ZzZ = zzZ(next, chartAxisZzW2, chartAxisZzW);
                }
                chartAxisZzW2.zz0(zzzq4ZzZ);
                if (next.zzZP5()) {
                    chartAxisZzW.zz41().zzZP1();
                    chartAxisZzW2.zz41().zzZP1();
                }
                chartAxisZzW2.zzYs(next.zz3S());
                chartAxisZzW2.zzYp(next.zzZQj() && !next.zz3S());
                chartAxisZzW2.zzYr(chartAxisZzW2.zz3R() | next.zz3R());
                chartAxisZzW2.zzYq(next.zzZP7() | chartAxisZzW2.zz3Q());
            }
        }
    }

    private static void zzY(ChartAxis chartAxis, ChartSeries chartSeries) {
        if (chartAxis.getDisplayUnit().isDefined()) {
            for (int i = 0; i < chartSeries.getValueCount(); i++) {
                zzE7 zze7 = (zzE7) com.aspose.words.internal.zzZKW.zzZ(chartSeries.zz2y().zzZMv().zzKv(i), zzE7.class);
                if (!zzCF.zzR(zze7)) {
                    zze7.zzYl(chartAxis.getDisplayUnit().zzaX());
                }
            }
        }
    }

    private static void zzY(ChartAxis chartAxis, ChartAxis chartAxis2) {
        zzFD zzfdZz2E = chartAxis.zz3I().zzZPi().size() > 0 ? chartAxis.zz3I().zzZPk().zz2E() : null;
        for (ChartSeries chartSeries : chartAxis2.zz3H()) {
            if (zzfdZz2E == null) {
                zzZ(chartSeries.zz2z(), chartAxis);
            } else {
                chartSeries.zz2z().zzW(zzfdZz2E);
            }
        }
    }

    private void zzZ(zzGK zzgk, ChartAxis chartAxis, ChartAxis chartAxis2, int i) {
        for (ChartSeries chartSeries : zzgk.zzZPj()) {
            if (chartSeries.zz2s()) {
                zzZ(chartSeries, chartAxis, chartAxis2, i);
            }
        }
    }

    private void zzZ(ChartSeries chartSeries, ChartAxis chartAxis, ChartAxis chartAxis2, int i) {
        zzZ(chartSeries.zz2E(), chartAxis);
        zzZ(chartSeries.zz2z(), chartAxis);
        if (!chartSeries.zz2z().isEmpty() || !chartAxis.zz41().zzZOQ()) {
            zzZ(chartAxis, chartSeries);
            if (!chartAxis.zz41().zzZOQ() || chartSeries.getIndex() == 0 || (chartSeries.zz2j() && chartSeries.zz2z().getValueType() == 2)) {
                chartAxis.zz41().zzZ(chartSeries.zz2E(), chartSeries.zz2v(), i);
            }
        }
        if (zz45().zzZJe().size() != 1 || chartSeries.getSmooth()) {
            i = chartSeries.getValueCount();
        }
        chartAxis2.zz41().zzZ(chartSeries.zz2y(), chartSeries.zz2u(), i);
        zzY(chartAxis2, chartSeries);
        zzZ(chartAxis, chartAxis2, chartSeries);
    }

    private static void zzZ(zzFD zzfd, ChartAxis chartAxis) {
        if (chartAxis.zz3Z()) {
            if (chartAxis.zz4q() && zzfd.isDate()) {
                return;
            }
            if ((chartAxis.getCategoryType() == 2 && !zzfd.isEmpty() && zzfd.getValueType() == 2 && zzX(zzfd)) || zzfd.isEmpty() || zzfd.zzZMv().getValueType() != 2) {
                return;
            }
            if (chartAxis.getCategoryType() != 0 || !zzfd.isDate() || chartAxis.zz3I().zzZPa() || chartAxis.zz4d() == null || zzEW.zzRr(chartAxis.zz4d().zzZLa()) || !chartAxis.zz4d().zzZLb()) {
                zzfd.zzZMv().zzC(chartAxis.getFormatCode(), chartAxis.zz4d() == null || chartAxis.zz4d().zzZLb());
            }
        }
    }

    private static void zzZ(ChartAxis chartAxis, ChartSeries chartSeries) {
        if (!chartAxis.zz4q() || chartAxis.zz41().zzZOQ() || chartSeries.zz2z().isEmpty() || chartSeries.zz2z().isDate() || chartSeries.zz2z().getValueType() != 1) {
            return;
        }
        zzV(chartAxis);
    }

    private static void zzZ(ChartAxis chartAxis, ChartAxis chartAxis2, ChartSeries chartSeries) {
        for (zzCR zzcr : chartSeries.zz2t()) {
            if (zzcr.isValid()) {
                chartAxis.zz41().zzZ(zzcr.zzZGN(), (zzF7) null, zzcr.zzZGN().zzZMv().getValueCount());
                chartAxis2.zz41().zzZ(zzcr.zzZGM(), (zzF7) null, zzcr.zzZGM().zzZMv().getValueCount());
            }
        }
    }

    private static void zzZ(ChartAxis chartAxis, zzFD zzfd, boolean z) {
        boolean z2 = z;
        if (zzT(chartAxis)) {
            com.aspose.words.internal.zzD3<zzCF> zzd3ZzZOL = chartAxis.zz41().zzZOL();
            double value = (z2 ? zzd3ZzZOL.get(1) : zzd3ZzZOL.get(0)).getValue();
            if (com.aspose.words.internal.zzAN.zzZD(value) && zzfd.zzZMv() != null) {
                int i = 0;
                double d = Double.NaN;
                while (i < zzfd.zzZMv().getValueCount() - 1) {
                    zzE7 zze7 = (zzE7) com.aspose.words.internal.zzZKW.zzZ(zzfd.zzL0(i), zzE7.class);
                    if (!zzCF.zzR(zze7)) {
                        double value2 = zze7.getValue();
                        zzCF zzcfZzL0 = zzfd.zzL0(i + 1);
                        if (Double.isNaN(d) || zzCF.zzR(zzcfZzL0) || !com.aspose.words.internal.zzAN.zzL(value2, value) || (com.aspose.words.internal.zzAN.zzL(value2, d) && com.aspose.words.internal.zzAN.zzL(value2, zzcfZzL0.getValue()))) {
                            d = value2;
                        } else {
                            double value3 = value2 - zzcfZzL0.getValue();
                            double d2 = value2 - d;
                            if (zzZ(z2, value3, d2)) {
                                zzZ(z2, value3, d2, chartAxis, zze7);
                                return;
                            }
                        }
                    }
                    i++;
                    z2 = z;
                }
            }
        }
    }

    private static boolean zzZ(boolean z, double d, double d2) {
        double d3 = z ? 1.0d : -1.0d;
        return com.aspose.words.internal.zzAN.zzJ(d * d3, 0.0d) && com.aspose.words.internal.zzAN.zzJ(d3 * d2, 0.0d);
    }

    private static void zzZ(boolean z, double d, double d2, ChartAxis chartAxis, zzE7 zze7) {
        if (com.aspose.words.internal.zzAN.zzZD(d)) {
            d = d2;
        }
        if (com.aspose.words.internal.zzAN.zzZD(d2)) {
            d2 = d;
        }
        chartAxis.zz41().zzU(new zzE7(zze7.getIndex(), (z ? Math.min(d, d2) : Math.max(d, d2)) / 10.0d, zze7.getFormatCode()));
    }

    private void zzZ(ChartAxis chartAxis, ChartAxis chartAxis2) {
        ChartAxis chartAxisZz47 = chartAxis.zz47();
        chartAxisZz47.zzOd(chartAxis2.zz4n());
        chartAxisZz47.zzOb(chartAxis2.zz4l());
        ChartAxis chartAxisZz472 = null;
        chartAxisZz47.zzZ((zzET) null);
        chartAxisZz47.zzY((zzET) null);
        chartAxisZz47.setHidden(true);
        chartAxisZz47.zzZ(chartAxis2.zz43());
        if (chartAxis.zz3Y().zz4k() != chartAxis2.zz3Y().zz4k()) {
            chartAxisZz472 = chartAxis2.zz3Y().zz47();
            chartAxisZz472.zzOa(chartAxis.zz3Y().zz4k());
            chartAxisZz472.zzZ(chartAxis2.zz3Y().zz43());
            chartAxisZz47.zzY(chartAxisZz472);
        }
        Iterator<zzGK> it = zz45().zzZJf().iterator();
        while (it.hasNext()) {
            zzZ(it.next(), chartAxis2, chartAxisZz47, chartAxisZz472);
        }
    }

    private static void zzZ(zzGK zzgk, ChartAxis chartAxis, ChartAxis chartAxis2, ChartAxis chartAxis3) {
        zzZCR zzzcr = (zzZCR) com.aspose.words.internal.zzZKW.zzZ(zzgk, zzZCR.class);
        if (zzzcr.zzZPt() == chartAxis) {
            if (chartAxis3 != null) {
                zzzcr.zzR(chartAxis3);
            }
            zzzcr.zzS(chartAxis2);
        }
        if (zzzcr.zzZPs() == chartAxis) {
            if (chartAxis3 != null) {
                zzzcr.zzS(chartAxis3);
            }
            zzzcr.zzR(chartAxis2);
        }
    }

    private void zzZ(boolean z, com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = com.aspose.words.internal.zzZQ4.zz2T;
        for (ChartAxis chartAxis : zz45().zz3G()) {
            if (zzzq4ZzZ.isEmpty()) {
                zzzq4ZzZ = (zzZQD() || z || chartAxis.zz3I().zz3R()) ? zzzq4 : zzZW(zzzq4);
            }
            if (chartAxis.zz40() && !chartAxis.getHidden() && z) {
                zzzq4ZzZ = zzZ(zzzq4ZzZ, zzzq4, chartAxis.zz3I(), this.zzZyQ);
            }
        }
        Iterator<ChartAxis> it = zz45().zz3G().iterator();
        while (it.hasNext()) {
            it.next().zz0(zzzq4ZzZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.aspose.words.internal.zzZQ4 zzZ(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42, zzGK zzgk, zzDI zzdi) throws Exception {
        zzZCR zzzcr = (zzZCR) zzgk;
        if (zzZQD() || zzgk.zzZPa() || zzgk.zz3R() || zzzcr.zzZPs().getHidden() || !zzzcr.zzZPs().zz40()) {
            return zzzq4;
        }
        float fZz3N = zzzcr.zzZPs().zz3N() + Float.intBitsToFloat((int) new zzHC(zzdi, zzZQD(), zzzcr.zzZPt(), zzzcr.zzZPs().zz41().zzZOR(), zzgk, zzzq42).zzZ(zzdi.zzZIy(), false, zzzcr.zzZPs(), zzzq42.getWidth()));
        return new com.aspose.words.internal.zzZQ4(zzzcr.zzZPs().zz3U() == 1 ? zzzq4.getX() + fZz3N : zzzq4.getX(), zzzq4.getY(), zzzq4.getWidth() - fZz3N, zzzq4.getHeight());
    }
}
