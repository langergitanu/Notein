package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzW1 implements zzZ9D {
    private zzW5 zzZxm;
    private ChartSeries zzZyw;

    public zzW1(ChartSeries chartSeries) {
        this.zzZyw = chartSeries;
    }

    private void dataChanged() {
        if (zz2e() && this.zzZyw.zz6y() == 0) {
            this.zzZyw.zz2A().zzZNV();
        }
        zzYEF zzyefZzZYh = this.zzZyw.zz3I().getChartSpace().zzZyb().zzZYh();
        if (zzyefZzZYh.zzYdB() != null) {
            if (zz2e()) {
                zzyefZzZYh.remove(790);
            } else {
                zzyefZzZYh.zzYdB().zzZ(null);
            }
        }
        if (zz24() && this.zzZyw.zz2z().zzZMu().zzZN3() != null) {
            this.zzZyw.zz2z().zzZMu().zzZN3().zzZG1();
        }
        if (zz23() && this.zzZyw.zz2y().zzZMu().zzZN3() != null) {
            this.zzZyw.zz2y().zzZMu().zzZN3().zzZG1();
        }
        if (zz22() && this.zzZyw.zz2x().zzZMu().zzZN3() != null) {
            this.zzZyw.zz2x().zzZMu().zzZN3().zzZG1();
        }
        if (this.zzZyw.zz3u() != null && this.zzZyw.zz3u().zzZGy() != null) {
            this.zzZyw.zz3u().zzZGy().zzZG1();
        }
        if (this.zzZyw.zz3I().getChartSpace().zzZHT()) {
            this.zzZyw.zz3I().getChartSpace().zzZHZ();
            this.zzZyw.zz3I().getDocument().zzG(2, "The embedded Excel workbook is regenerated after updating chart data. Any additional data not used for the chart and formatting contained in the workbook will be lost.");
        }
    }

    private zzW5 zz1T() {
        if (this.zzZxm == null) {
            this.zzZxm = new zzW5(this.zzZyw, true);
        }
        return this.zzZxm;
    }

    private boolean zz1U() {
        return this.zzZyw.getDataLabels().zzYG() || this.zzZyw.getDataPoints().zzYG();
    }

    private boolean zz1V() {
        return zz2e() && this.zzZyw.zz6y() == 1 && !this.zzZyw.zz2k().zzZI8();
    }

    private boolean zz1W() {
        return zz2e() && this.zzZyw.zz6y() == 0;
    }

    private boolean zz1X() {
        if (!zz2e()) {
            return false;
        }
        int iZz6y = this.zzZyw.zz6y();
        if (iZz6y != 0) {
            if (iZz6y == 1) {
                return this.zzZyw.zz2k().zzZI8();
            }
            if (iZz6y != 5 && iZz6y != 6) {
                return false;
            }
        }
        return true;
    }

    private boolean zz1Y() {
        if (!zz2e()) {
            return false;
        }
        int iZz6y = this.zzZyw.zz6y();
        return iZz6y == 5 || iZz6y == 6;
    }

    private zzCE zz1Z() {
        return this.zzZyw.zz2x().zzZN4();
    }

    private zzCE zz20() {
        return this.zzZyw.zz2y().zzZN4();
    }

    private zzCE zz21() {
        return this.zzZyw.zz2z().zzZN4();
    }

    private boolean zz2e() {
        return this.zzZyw.zz3I().zzZQO() == 16;
    }

    private void zzNC(int i) {
        zzZCR zzzcr = (zzZCR) com.aspose.words.internal.zzZKW.zzZ(this.zzZyw.zz3I(), zzZCR.class);
        ChartAxis chartAxisZzZPs = zzzcr != null ? zzzcr.zzZPs() : null;
        if (i == 0) {
            if (zzEW.zzRs(zz20().getFormatCode())) {
                zz20().setFormatCode("General");
            }
            if (this.zzZyw.hasDataLabels() && this.zzZyw.getDataLabels().getShowValue() && zzEW.zzRs(this.zzZyw.getDataLabels().getNumberFormat().getFormatCode())) {
                this.zzZyw.getDataLabels().getNumberFormat().setFormatCode("General");
            }
            if (chartAxisZzZPs != null) {
                zzX(chartAxisZzZPs);
                if (zzEW.zzRs(chartAxisZzZPs.getNumberFormat().getFormatCode())) {
                    chartAxisZzZPs.getNumberFormat().setFormatCode("General");
                    return;
                }
                return;
            }
            return;
        }
        if (i == 1) {
            if (!zzT5(zz20().getFormatCode())) {
                zz20().setFormatCode("m/d/yyyy");
            }
            if (this.zzZyw.hasDataLabels() && this.zzZyw.getDataLabels().getShowValue() && !zzT5(this.zzZyw.getDataLabels().getNumberFormat().getFormatCode())) {
                this.zzZyw.getDataLabels().getNumberFormat().setFormatCode("m/d/yyyy");
            }
            if (chartAxisZzZPs == null || this.zzZyw.zz3I().zz3S()) {
                return;
            }
            chartAxisZzZPs.setCategoryType(2);
            if (zzT5(chartAxisZzZPs.getNumberFormat().getFormatCode())) {
                return;
            }
            chartAxisZzZPs.getNumberFormat().setFormatCode("m/d/yyyy");
            return;
        }
        if (i != 2) {
            return;
        }
        if (!zzEW.zzRr(zz20().getFormatCode())) {
            zz20().setFormatCode("h:mm");
        }
        if (this.zzZyw.hasDataLabels() && this.zzZyw.getDataLabels().getShowValue() && !zzEW.zzRr(this.zzZyw.getDataLabels().getNumberFormat().getFormatCode())) {
            this.zzZyw.getDataLabels().getNumberFormat().setFormatCode("h:mm");
        }
        if (chartAxisZzZPs == null || this.zzZyw.zz3I().zz3S()) {
            return;
        }
        chartAxisZzZPs.setCategoryType(0);
        if (zzEW.zzRr(chartAxisZzZPs.getNumberFormat().getFormatCode())) {
            return;
        }
        chartAxisZzZPs.getNumberFormat().setFormatCode("h:mm");
    }

    private void zzND(int i) {
        zzZCR zzzcr = (zzZCR) com.aspose.words.internal.zzZKW.zzZ(this.zzZyw.zz3I(), zzZCR.class);
        ChartAxis chartAxisZzZPt = zzzcr != null ? zzzcr.zzZPt() : null;
        if (i != 0) {
            if (i == 1) {
                if (!zzT4(zz21().getFormatCode())) {
                    zz21().setFormatCode("General");
                }
                if (chartAxisZzZPt != null) {
                    zzX(chartAxisZzZPt);
                    if (zzT4(chartAxisZzZPt.getNumberFormat().getFormatCode())) {
                        return;
                    }
                    chartAxisZzZPt.getNumberFormat().setFormatCode("General");
                    return;
                }
                return;
            }
            if (i == 2) {
                if (!zzT5(zz21().getFormatCode())) {
                    zz21().setFormatCode("m/d/yyyy");
                }
                if (chartAxisZzZPt != null) {
                    chartAxisZzZPt.setCategoryType(2);
                    if (zzT5(chartAxisZzZPt.getNumberFormat().getFormatCode())) {
                        return;
                    }
                    chartAxisZzZPt.getNumberFormat().setFormatCode("m/d/yyyy");
                    return;
                }
                return;
            }
            if (i == 3) {
                if (!zzEW.zzRr(zz21().getFormatCode())) {
                    zz21().setFormatCode("h:mm");
                }
                if (chartAxisZzZPt != null) {
                    chartAxisZzZPt.setCategoryType(0);
                    if (zzEW.zzRr(chartAxisZzZPt.getNumberFormat().getFormatCode())) {
                        return;
                    }
                    chartAxisZzZPt.getNumberFormat().setFormatCode("h:mm");
                    return;
                }
                return;
            }
            if (i != 4) {
                return;
            }
        }
        zz21().setFormatCode(null);
        if (chartAxisZzZPt != null) {
            zzX(chartAxisZzZPt);
            chartAxisZzZPt.getNumberFormat().setFormatCode("General");
            chartAxisZzZPt.getNumberFormat().isLinkedToSource(true);
        }
    }

    private boolean zzNE(int i) {
        if (!zz2e()) {
            return true;
        }
        int iZz6y = this.zzZyw.zz6y();
        if (iZz6y != 0) {
            if (iZz6y == 1) {
                return this.zzZyw.zz2k().zzZI8() ? i == 0 : (i == 0 || i == 4) ? false : true;
            }
            if (iZz6y != 2 && iZz6y != 4) {
                if (iZz6y == 5 || iZz6y == 6) {
                    return i == 4;
                }
                if (iZz6y != 7) {
                    return false;
                }
            }
        }
        return i == 0;
    }

    private void zzNy(int i) {
        if (zz24()) {
            zz21().zzNy(i);
        }
        if (zz23()) {
            zz20().zzNy(i);
        }
        if (zz22()) {
            zz1Z().zzNy(i);
        }
    }

    private zzCF zzQ(double d, int i) {
        if (Double.isNaN(d)) {
            return null;
        }
        return new zzE7(i, d, zz1Z().getFormatCode());
    }

    private static boolean zzT4(String str) {
        return com.aspose.words.internal.zzZYD.zzXk(str) && !zzEW.zzRs(str);
    }

    private static boolean zzT5(String str) {
        return zzEW.zzRs(str) && !zzEW.zzRr(str);
    }

    private static void zzX(ChartAxis chartAxis) {
        chartAxis.zz4p().zzL(1, Boolean.TRUE);
        chartAxis.zz4p().zzL(2, Boolean.FALSE);
    }

    @Override // com.aspose.words.zzZ9D
    public final int getValueCount() {
        int valueCount = (!zz24() || zz21() == null) ? 0 : zz21().getValueCount();
        if (zz23() && zz20() != null) {
            valueCount = Math.max(valueCount, zz20().getValueCount());
        }
        return (!zz22() || zz1Z() == null) ? valueCount : Math.max(valueCount, zz1Z().getValueCount());
    }

    @Override // com.aspose.words.zzZ9D
    public final boolean zz22() {
        return this.zzZyw.zz3I().zzZQO() == 15;
    }

    @Override // com.aspose.words.zzZ9D
    public final boolean zz23() {
        if (zz2e()) {
            return (this.zzZyw.zz6y() != 1 || this.zzZyw.zz2k().zzZI8()) && this.zzZyw.zz6y() != 3;
        }
        return true;
    }

    @Override // com.aspose.words.zzZ9D
    public final boolean zz24() {
        return (zz2e() && this.zzZyw.zz6y() == 3) ? false : true;
    }

    public final void zz25() {
        if (this.zzZyw.zz2A() != null) {
            Iterator<zzFK> it = this.zzZyw.zz2A().zzZNU().iterator();
            while (it.hasNext()) {
                it.next().zzZN4().clear();
            }
        }
        if (zz24()) {
            this.zzZyw.getXValues().clear();
        }
        if (zz21() != null) {
            zz21().clear();
        }
        if (zz23()) {
            this.zzZyw.getYValues().clear();
        }
        if (zz20() != null) {
            zz20().clear();
        }
        if (zz22()) {
            this.zzZyw.getBubbleSizes().clear();
        }
        if (zz1Z() != null) {
            zz1Z().clear();
        }
        dataChanged();
    }

    @Override // com.aspose.words.zzZ9D
    public final int zz28() {
        if (zz20() == null) {
            return 0;
        }
        int valueType = zz20().getValueType();
        if (valueType != 2 && valueType != 4) {
            return 0;
        }
        String strZzY = zzY(this.zzZyw.zz2y());
        if (com.aspose.words.internal.zzZYD.zzXk(strZzY) && zzEW.zzRs(strZzY)) {
            return zzEW.zzRr(strZzY) ? 2 : 1;
        }
        return 0;
    }

    @Override // com.aspose.words.zzZ9D
    public final int zz29() {
        if (zz21() == null) {
            return 1;
        }
        int valueType = zz21().getValueType();
        if (valueType == 1) {
            return 0;
        }
        if (valueType != 2) {
            if (valueType == 3) {
                return (!zz2e() || this.zzZyw.zz6y() == 6 || this.zzZyw.zz6y() == 5) ? 4 : 0;
            }
            if (valueType != 4) {
                return 1;
            }
        }
        if (valueType == 4) {
            zz21().zzZG8().size();
        }
        String strZzY = zzY(this.zzZyw.zz2z());
        if (com.aspose.words.internal.zzZYD.zzXk(strZzY) && zzEW.zzRs(strZzY)) {
            return zzEW.zzRr(strZzY) ? 3 : 2;
        }
        return 1;
    }

    @Override // com.aspose.words.zzZ9D
    public final void zzNA(int i) {
        if (zz29() == i) {
            return;
        }
        if (!zz24()) {
            throw new IllegalStateException("X values are not supported by this series type.");
        }
        if (!zzNE(i)) {
            throw new IllegalStateException("The series cannot contain an X value of this type.");
        }
        zz21();
        if (zz21().zzZIg()) {
            throw new IllegalStateException("The value must be of the same type as the existing items in the collection.");
        }
        if (i == 0 || i == 4) {
            zz21().zzKe((zz2e() || i == 4) ? 3 : 1);
        } else {
            zz21().zzKe(zz2e() ? 4 : 2);
        }
        zzND(i);
    }

    @Override // com.aspose.words.zzZ9D
    public final double zzNB(int i) {
        zzCF zzcfZzKg = zz1Z().zzKg(i);
        if (zzCF.zzQ(zzcfZzKg)) {
            return Double.NaN;
        }
        return zzcfZzKg.getValue();
    }

    public final void zzNF(int i) {
        zzKJ[] zzkjArrZzs;
        int count;
        if (!zz1U() || zz1V()) {
            zzkjArrZzs = null;
            count = 0;
        } else if (zz1X()) {
            zzkjArrZzs = zz1T().zzs(i, true);
            count = this.zzZyw.getDataPoints().getCount();
        } else {
            this.zzZyw.getDataPoints().remove(i);
            this.zzZyw.getDataLabels().remove(i);
            zzkjArrZzs = null;
            count = 0;
        }
        if (zz24()) {
            this.zzZyw.getXValues().remove(i);
            zz21().remove(i);
        }
        if (zz23()) {
            this.zzZyw.getYValues().remove(i);
            zz20().remove(i);
        }
        if (zz22()) {
            this.zzZyw.getBubbleSizes().remove(i);
            zz1Z().remove(i);
        }
        if (zz1U() && zz1X()) {
            zzKJ[] zzkjArrZzs2 = zz1Y() ? zz1T().zzs(i, false) : new zzKJ[0];
            int count2 = this.zzZyw.getDataPoints().getCount();
            for (int i2 = 0; i2 < Math.min(zzkjArrZzs.length, zzkjArrZzs2.length) && zzkjArrZzs[(zzkjArrZzs.length - i2) - 1].zzZTC() == i + 1; i2++) {
                zzKJ zzkj = zzkjArrZzs2[(zzkjArrZzs2.length - i2) - 1];
                zzkj.setValueIndex(zzkj.zzZTC() + 1);
            }
            zzZ(zzkjArrZzs, count, zzkjArrZzs2, count2);
        }
        dataChanged();
    }

    @Override // com.aspose.words.zzZ9D
    public final void zzNz(int i) {
        if (zz28() == i) {
            return;
        }
        if (!zz23()) {
            throw new IllegalStateException("Y values are not supported by this series type.");
        }
        zz20();
        if (zz20().zzZIg()) {
            throw new IllegalStateException("The value must be of the same type as the existing items in the collection.");
        }
        zz20().zzKe(zz2e() ? 4 : 2);
        zzNC(i);
    }

    @Override // com.aspose.words.zzZ9D
    public final void zzP(double d, int i) {
        zz1Z().zzX(zzQ(d, i), i);
        dataChanged();
    }

    public final void zzY(int i, ChartXValue chartXValue, ChartYValue chartYValue, double d) {
        zzKJ[] zzkjArrZzs;
        int count;
        if (i >= 0) {
            getValueCount();
        }
        if (zz1U() && zz1X()) {
            zzkjArrZzs = zz1Y() ? zz1T().zzs(i, false) : new zzKJ[0];
            count = this.zzZyw.getDataPoints().getCount();
        } else {
            zzkjArrZzs = null;
            count = 0;
        }
        if (zz24()) {
            this.zzZyw.getXValues().insert(i, chartXValue);
            zz21().zzZ(i, zzZ(chartXValue, i));
        }
        if (zz23()) {
            this.zzZyw.getYValues().zzZ(i, chartYValue);
            zz20().zzZ(i, zzZ(chartYValue, i));
        }
        if (zz22()) {
            this.zzZyw.getBubbleSizes().zzY(i, d);
            zz1Z().zzZ(i, zzQ(d, i));
        }
        if (zz1U() && !zz1V()) {
            if (zz1X()) {
                zzKJ[] zzkjArrZzs2 = zz1T().zzs(i, true);
                int count2 = this.zzZyw.getDataPoints().getCount();
                for (int i2 = 0; i2 < Math.min(zzkjArrZzs.length, zzkjArrZzs2.length) && zzkjArrZzs2[(zzkjArrZzs2.length - i2) - 1].zzZTC() == i + 1; i2++) {
                    zzKJ zzkj = zzkjArrZzs[(zzkjArrZzs.length - i2) - 1];
                    zzkj.setValueIndex(zzkj.zzZTC() + 1);
                }
                zzZ(zzkjArrZzs, count, zzkjArrZzs2, count2);
            } else {
                this.zzZyw.getDataPoints().zzO6(i);
                this.zzZyw.getDataLabels().zzO6(i);
            }
        }
        dataChanged();
    }

    @Override // com.aspose.words.zzZ9D
    public final ChartYValue zzYn(int i, int i2) {
        zzCF zzcfZzKg = zz20().zzKg(i);
        if (zzCF.zzQ(zzcfZzKg)) {
            return null;
        }
        if (zzcfZzKg.getValueType() != 2 && zzcfZzKg.getValueType() == 4) {
            zzcfZzKg.zzZLd();
        }
        if (i2 == 0) {
            return ChartYValue.fromDouble(zzcfZzKg.getValue());
        }
        if (i2 == 1) {
            if (!zzEW.zzRs(zz20().getFormatCode())) {
                zzcfZzKg.isDate();
            }
            return ChartYValue.zzx(zzCG.zzY3(zzcfZzKg.getValue()));
        }
        if (i2 != 2) {
            return null;
        }
        if (!zzEW.zzRs(zz20().getFormatCode())) {
            zzcfZzKg.isDate();
        }
        return ChartYValue.zzT(com.aspose.words.internal.zzZNF.zzZe(zzcfZzKg.getValue()));
    }

    @Override // com.aspose.words.zzZ9D
    public final ChartXValue zzYo(int i, int i2) {
        zzCF zzcfZzKg = zz21().zzKg(i);
        if (zzCF.zzQ(zzcfZzKg)) {
            return null;
        }
        if (i2 == 0) {
            int valueType = zzcfZzKg.getValueType();
            if (valueType == 1) {
                return ChartXValue.fromString(zzcfZzKg.getStringValue());
            }
            if (valueType != 3) {
                return null;
            }
            zzEA zzea = (zzEA) zzcfZzKg;
            zzea.zzZLe().size();
            return ChartXValue.fromString((String) zzea.zzZLe().get(0));
        }
        if (i2 == 1) {
            return ChartXValue.fromDouble(zzcfZzKg.getValue());
        }
        if (i2 == 2) {
            if (zzcfZzKg.getValueType() == 2) {
                zzcfZzKg.isDate();
            }
            return ChartXValue.zzy(zzCG.zzY3(zzcfZzKg.getValue()));
        }
        if (i2 == 3) {
            if (zzcfZzKg.getValueType() == 2) {
                zzcfZzKg.isDate();
            }
            return ChartXValue.zzU(com.aspose.words.internal.zzZNF.zzZe(zzcfZzKg.getValue()));
        }
        if (i2 != 4) {
            return null;
        }
        zzEA zzea2 = (zzEA) zzcfZzKg;
        return ChartXValue.fromMultilevelValue(new ChartMultilevelValue(zzea2.zzKI(0), zzea2.zzKI(1), zzea2.zzKI(2)));
    }

    public final void zzZ(ChartXValue chartXValue, ChartYValue chartYValue, double d) {
        int valueCount = getValueCount();
        zzNy(valueCount + 1);
        if (zz24()) {
            this.zzZyw.getXValues().zzZ(valueCount, chartXValue);
            zz21().zzX(zzZ(chartXValue, valueCount), valueCount);
        }
        if (zz23()) {
            this.zzZyw.getYValues().zzY(valueCount, chartYValue);
            zz20().zzX(zzZ(chartYValue, valueCount), valueCount);
        }
        if (zz22()) {
            this.zzZyw.getBubbleSizes().set(valueCount, d);
            zz1Z().zzX(zzQ(d, valueCount), valueCount);
        }
    }

    private zzCF zzZ(ChartXValue chartXValue, int i) {
        if (chartXValue == null) {
            return null;
        }
        int valueType = chartXValue.getValueType();
        int i2 = 0;
        if (valueType == 0) {
            int valueType2 = zz21().getValueType();
            if (valueType2 == 1) {
                return new zzD4(i, chartXValue.getStringValue());
            }
            if (valueType2 != 3) {
                return null;
            }
            zzEA zzea = new zzEA(i);
            zzea.zzK(chartXValue.getStringValue(), 0);
            return zzea;
        }
        if (valueType == 1) {
            return zzZ(i, chartXValue.getDoubleValue(), zz21());
        }
        if (valueType == 2) {
            return zzZ(i, zzCG.zzp(chartXValue.zz1K()), zz21());
        }
        if (valueType == 3) {
            return zzZ(i, chartXValue.zz1J().zzhB(), zz21());
        }
        if (valueType != 4) {
            return null;
        }
        zz21();
        zzEA zzea2 = new zzEA(i);
        ChartMultilevelValue multilevelValue = chartXValue.getMultilevelValue();
        if (multilevelValue.getLevel3() != null) {
            zzea2.zzK(multilevelValue.getLevel3(), 0);
            i2 = 1;
        }
        if (multilevelValue.getLevel2() != null || i2 > 0) {
            zzea2.zzK(multilevelValue.getLevel2(), i2);
            i2++;
        }
        zzea2.zzK(multilevelValue.getLevel1(), i2);
        return zzea2;
    }

    private static zzCF zzZ(int i, double d, zzCE zzce) {
        int valueType = zzce.getValueType();
        if (valueType == 2) {
            return new zzE7(i, d, zzce.getFormatCode());
        }
        if (valueType != 4) {
            return null;
        }
        zzEB zzeb = new zzEB(i, zzce.zzZG8());
        zzeb.zzK(Double.valueOf(d), 0);
        return zzeb;
    }

    private static String zzY(zzFD zzfd) {
        String formatCode = zzfd.zzZN4().getFormatCode();
        if (com.aspose.words.internal.zzZYD.zzXk(formatCode)) {
            return formatCode;
        }
        zzCF zzcfZzZIn = zzfd.zzZN4().zzZIn();
        zzE7 zze7 = (zzE7) com.aspose.words.internal.zzZKW.zzZ(zzcfZzZIn, zzE7.class);
        if (zze7 != null) {
            return zze7.getFormatCode();
        }
        zzEB zzeb = (zzEB) com.aspose.words.internal.zzZKW.zzZ(zzcfZzZIn, zzEB.class);
        if (zzeb != null) {
            return zzeb.zzKJ(0);
        }
        return null;
    }

    private zzCF zzZ(ChartYValue chartYValue, int i) {
        double doubleValue;
        if (chartYValue == null) {
            return null;
        }
        int valueType = chartYValue.getValueType();
        if (valueType == 0) {
            doubleValue = chartYValue.getDoubleValue();
        } else if (valueType == 1) {
            doubleValue = zzCG.zzp(chartYValue.zz1K());
        } else {
            if (valueType != 2) {
                return null;
            }
            doubleValue = chartYValue.zz1J().zzhB();
        }
        return zzZ(i, doubleValue, zz20());
    }

    private void zzZ(zzKJ[] zzkjArr, int i, zzKJ[] zzkjArr2, int i2) {
        for (int i3 = 0; i3 < Math.min(zzkjArr.length, zzkjArr2.length); i3++) {
            int length = (zzkjArr.length - i3) - 1;
            zzKJ zzkj = zzkjArr[length];
            int length2 = (zzkjArr2.length - i3) - 1;
            zzKJ zzkj2 = zzkjArr2[length2];
            if (zzkj.zzZTC() != zzkj2.zzZTC() || zzkj.zzZTB() != zzkj2.zzZTB() || (i - zzkj.getIndex()) - 1 != (i2 - zzkj2.getIndex()) - 1) {
                break;
            }
            zzkjArr[length] = null;
            zzkjArr2[length2] = null;
        }
        for (int i4 = 0; i4 < Math.min(zzkjArr.length, zzkjArr2.length); i4++) {
            zzKJ zzkj3 = zzkjArr[i4];
            zzKJ zzkj4 = zzkjArr2[i4];
            if (zzkj3 == null || zzkj4 == null || zzkj3.getIndex() != zzkj4.getIndex() || zzkj3.zzZTC() != zzkj4.zzZTC() || zzkj3.zzZTB() != zzkj4.zzZTB()) {
                break;
            }
            zzkjArr[i4] = null;
            zzkjArr2[i4] = null;
        }
        for (int length3 = zzkjArr.length - 1; length3 >= 0; length3--) {
            zzKJ zzkj5 = zzkjArr[length3];
            if (zzkj5 != null && !zzkj5.zzZTA()) {
                this.zzZyw.getDataPoints().remove(zzkj5.getIndex());
                this.zzZyw.getDataLabels().remove(zzkj5.getIndex());
            }
        }
        for (zzKJ zzkj6 : zzkjArr2) {
            if (zzkj6 != null && !zzkj6.zzZTA()) {
                this.zzZyw.getDataPoints().zzO6(zzkj6.getIndex());
                this.zzZyw.getDataLabels().zzO6(zzkj6.getIndex());
            }
        }
    }

    @Override // com.aspose.words.zzZ9D
    public final void zzY(ChartXValue chartXValue, int i) {
        zzKJ[] zzkjArrZzs;
        int count;
        if (zz1U() && zz1X()) {
            zzkjArrZzs = zz1T().zzs(i, true);
            count = this.zzZyw.getDataPoints().getCount();
        } else {
            zzkjArrZzs = null;
            count = 0;
        }
        zz21().zzX(zzZ(chartXValue, i), i);
        if (zz1U() && zz1X()) {
            zzZ(zzkjArrZzs, count, zz1T().zzs(i, true), this.zzZyw.getDataPoints().getCount());
        }
        dataChanged();
    }

    @Override // com.aspose.words.zzZ9D
    public final void zzY(ChartYValue chartYValue, int i) {
        zzKJ[] zzkjArrZzs;
        int count;
        if (zz1U() && zz1W()) {
            zzkjArrZzs = zz1T().zzs(i, true);
            count = this.zzZyw.getDataPoints().getCount();
        } else {
            zzkjArrZzs = null;
            count = 0;
        }
        zz20().zzX(zzZ(chartYValue, i), i);
        if (zz1U() && zz1W()) {
            zzZ(zzkjArrZzs, count, zz1T().zzs(i, true), this.zzZyw.getDataPoints().getCount());
        }
        dataChanged();
    }
}
