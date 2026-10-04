package com.aspose.words;

import com.aspose.words.zzW0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class ChartDataLabelCollection implements zzZ9V, zzZD3, Iterable<ChartDataLabel> {
    private Font zzZEt;
    private ChartFormat zzZyE;
    private ChartNumberFormat zzZyG;
    private zzGK zzZyX;
    private com.aspose.words.internal.zzZQH<Integer, ChartDataLabel> zzZyv = new com.aspose.words.internal.zzZQH<>();
    private ChartSeries zzZyw;
    private zzD9 zzZyx;
    private zzFT zzZyz;
    private static int[] zzZyu = {11, 7, 8, 9, 10, 12, 2};
    private static int[] zzZyt = {11, 7, 8, 9, 10, 12};

    public static final class zzZ implements Iterator<ChartDataLabel> {
        private int zzXn = -1;
        private int zzZyq;
        private com.aspose.words.internal.zzDB zzZyr;
        private ChartDataLabelCollection zzZys;

        public zzZ(ChartDataLabelCollection chartDataLabelCollection) {
            zzW0 zzw0 = new zzW0(chartDataLabelCollection.zzZyw);
            this.zzZys = chartDataLabelCollection;
            com.aspose.words.internal.zzDB zzdbZz1S = zzw0.zz1S();
            this.zzZyr = zzdbZz1S;
            this.zzZyq = zzdbZz1S != null ? zzdbZz1S.get(zzdbZz1S.getCount() - 1) : zzw0.zz1R().getCount() - 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: zz3h, reason: merged with bridge method [inline-methods] */
        public ChartDataLabel next() {
            return this.zzZys.get(this.zzXn);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.zzZys.zzZyw == null || !this.zzZys.zzZyw.hasDataLabels()) {
                return false;
            }
            this.zzXn++;
            if (this.zzZyr != null) {
                while (true) {
                    int i = this.zzXn;
                    if (i > this.zzZyq || this.zzZyr.zzVJ(i) >= 0 || this.zzZys.zzO5(this.zzXn)) {
                        break;
                    }
                    this.zzXn++;
                }
            }
            if (this.zzXn <= this.zzZyq) {
                return true;
            }
            com.aspose.words.internal.zzZQH zzzqh = this.zzZys.zzZyv;
            int iIntValue = zzzqh.getCount() > 0 ? ((Integer) zzzqh.getKeys().get(zzzqh.getCount() - 1)).intValue() : -1;
            while (true) {
                int i2 = this.zzXn;
                if (i2 > iIntValue) {
                    return false;
                }
                if (this.zzZys.zzO5(i2)) {
                    return true;
                }
                this.zzXn++;
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public ChartDataLabelCollection(zzGK zzgk, ChartSeries chartSeries) {
        this.zzZyX = zzgk;
        this.zzZyw = chartSeries;
        this.zzZyz = new zzFT(zzgk);
    }

    private zzE8 zz4d() {
        return (zzE8) this.zzZyz.zzLv(5);
    }

    private void zzL(int i, Object obj) {
        this.zzZyz.zzL(i, obj);
        ChartSeries chartSeries = this.zzZyw;
        if (chartSeries != null) {
            chartSeries.hasDataLabels(true);
        }
    }

    private int zzO3(int i) {
        int i2 = 0;
        for (int count = this.zzZyv.getCount() - 1; count >= 0 && this.zzZyv.getKeys().get(count).intValue() >= i; count--) {
            if (this.zzZyv.zzl9().get(count).zz3n()) {
                i2++;
            }
        }
        return i2;
    }

    private ChartDataLabel zzO4(int i) {
        ChartSeries chartSeries;
        if (i < 0 || !((chartSeries = this.zzZyw) == null || chartSeries.hasDataLabels())) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        ChartDataLabel chartDataLabel = (ChartDataLabel) com.aspose.words.internal.zzQW.zzZ((com.aspose.words.internal.zzZQH<Integer, TValue>) this.zzZyv, Integer.valueOf(i));
        if (chartDataLabel != null) {
            return chartDataLabel;
        }
        ChartDataLabel chartDataLabel2 = new ChartDataLabel(this.zzZyz, this.zzZyw);
        chartDataLabel2.setIndex(i);
        zzZ(chartDataLabel2);
        return chartDataLabel2;
    }

    private void zzX(ChartDataLabel chartDataLabel) {
        if (chartDataLabel.zz3n()) {
            if (getShowDataLabelsRange() || chartDataLabel.getShowDataLabelsRange()) {
                chartDataLabel.zz3q().zzA(zzZyu);
                if (chartDataLabel.getShowDataLabelsRange() == getShowDataLabelsRange()) {
                    chartDataLabel.zz3q().zzLi(14);
                }
            }
        }
    }

    private zzD9 zzaQ() {
        if (this.zzZyx == null) {
            zzD9 zzd9 = (zzD9) this.zzZyz.zzLv(15);
            this.zzZyx = zzd9;
            if (zzd9 == null) {
                zzD9 zzd92 = new zzD9();
                this.zzZyx = zzd92;
                this.zzZyz.zzL(15, zzd92);
            }
        }
        return this.zzZyx;
    }

    public void clearFormat() {
        Iterator<T> it = this.zzZyv.zzl9().iterator();
        while (it.hasNext()) {
            ((ChartDataLabel) it.next()).clearFormat();
        }
    }

    public ChartDataLabel get(int i) {
        return zzO4(i);
    }

    public int getCount() {
        zzW0.zzZ zzzZz1R = new zzW0(this.zzZyw).zz1R();
        return zzzZz1R.getCount() + zzO3(zzzZz1R.zz1L() + 1);
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public zz7X getFill() {
        return zzaQ().getFill();
    }

    public Font getFont() {
        if (this.zzZEt == null) {
            this.zzZEt = Font.zzZ(new zzW8(zzaR(), this.zzZyX.getChartSpace()), this.zzZyX.getDocument());
        }
        return this.zzZEt;
    }

    public ChartFormat getFormat() {
        if (this.zzZyE == null) {
            this.zzZyE = new ChartFormat(this);
        }
        return this.zzZyE;
    }

    @Override // com.aspose.words.zzZ9V
    @ReservedForInternalUse
    @Deprecated
    public zzE8 getNumFmt_INumberFormatProvider() {
        return zz4d();
    }

    public ChartNumberFormat getNumberFormat() {
        if (this.zzZyG == null) {
            this.zzZyG = new ChartNumberFormat(this, this.zzZyX);
        }
        return this.zzZyG;
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public zz4G getOutline() {
        return zzaQ().getOutline();
    }

    public String getSeparator() {
        return this.zzZyz.zzXY(this.zzZyX.zzZP9());
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public int getShapeType() {
        zzDB zzdb = (zzDB) this.zzZyz.zzLv(21);
        if (zzdb == null || zzdb.zzZTf() == null) {
            return 0;
        }
        return zzVZ.zzT3(zzdb.zzZTf().zzZAO());
    }

    public boolean getShowBubbleSize() {
        return ((Boolean) this.zzZyz.zzLv(7)).booleanValue();
    }

    public boolean getShowCategoryName() {
        return ((Boolean) this.zzZyz.zzLv(8)).booleanValue();
    }

    public boolean getShowDataLabelsRange() {
        return ((Boolean) this.zzZyz.zzLv(14)).booleanValue();
    }

    public boolean getShowLeaderLines() {
        return ((Boolean) this.zzZyz.zzLv(13)).booleanValue();
    }

    public boolean getShowLegendKey() {
        return ((Boolean) this.zzZyz.zzLv(9)).booleanValue();
    }

    public boolean getShowPercentage() {
        return ((Boolean) this.zzZyz.zzLv(10)).booleanValue();
    }

    public boolean getShowSeriesName() {
        return ((Boolean) this.zzZyz.zzLv(11)).booleanValue();
    }

    public boolean getShowValue() {
        return ((Boolean) this.zzZyz.zzLv(12)).booleanValue();
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public zzZ90 getThemeProvider() {
        return this.zzZyX.getDocument().zzZqI();
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public boolean isFillSupported() {
        return true;
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public boolean isFormatDefined() {
        return this.zzZyz.zzLh(15) && !zzaQ().isEmpty();
    }

    @Override // com.aspose.words.zzZ9V
    @ReservedForInternalUse
    @Deprecated
    public boolean isInherited() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<ChartDataLabel> iterator() {
        return new zzZ(this);
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public void materializeSpPr() {
    }

    public final void remove(int i) {
        if (this.zzZyv.getCount() == 0) {
            return;
        }
        com.aspose.words.internal.zzZQH<Integer, ChartDataLabel> zzzqh = new com.aspose.words.internal.zzZQH<>(this.zzZyv.getCount());
        for (ChartDataLabel chartDataLabel : this.zzZyv.zzl9()) {
            if (chartDataLabel.getIndex() != i) {
                if (chartDataLabel.getIndex() > i) {
                    chartDataLabel.setIndex(chartDataLabel.getIndex() - 1);
                }
                zzzqh.zzB(Integer.valueOf(chartDataLabel.getIndex()), chartDataLabel);
            }
        }
        this.zzZyv = zzzqh;
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public void setFill(zz7X zz7x) {
        zzaQ().setFill(zz7x);
    }

    @Override // com.aspose.words.zzZ9V
    @ReservedForInternalUse
    @Deprecated
    public void setNumFmt_INumberFormatProvider(zzE8 zze8) {
        zzL(5, zze8);
    }

    @ReservedForInternalUse
    @Deprecated
    public void setOutline(zz4G zz4g) {
        zzaQ().setOutline(zz4g);
    }

    public void setSeparator(String str) {
        zzL(6, str);
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public void setShapeType(int i) {
        if (getShapeType() == i) {
            return;
        }
        if (i == 0) {
            this.zzZyz.zzLi(21);
            return;
        }
        zzDB zzdb = (zzDB) this.zzZyz.zzLj(21);
        if (zzdb == null) {
            zzdb = new zzDB();
            this.zzZyz.zzI(21, zzdb);
        }
        if (zzdb.zzZTf() == null) {
            zzdb.zzZ(new zz7H());
        }
        zzdb.zzZTf().zzOB(zzVZ.zzNx(i));
    }

    public void setShowBubbleSize(boolean z) {
        if (this.zzZyX.zzZP5()) {
            zzL(7, Boolean.valueOf(z));
        } else {
            this.zzZyX.zzT(65536, "ShowBubbleSize is not supported by this type of chart, value will not be set.");
        }
    }

    public void setShowCategoryName(boolean z) {
        zzL(8, Boolean.valueOf(z));
    }

    public void setShowDataLabelsRange(boolean z) {
        this.zzZyz.zzI(14, Boolean.valueOf(z));
    }

    public void setShowLeaderLines(boolean z) {
        zzL(13, Boolean.valueOf(z));
    }

    public void setShowLegendKey(boolean z) {
        zzL(9, Boolean.valueOf(z));
    }

    public void setShowPercentage(boolean z) {
        zzL(10, Boolean.valueOf(z));
    }

    public void setShowSeriesName(boolean z) {
        zzL(11, Boolean.valueOf(z));
    }

    public void setShowValue(boolean z) {
        zzL(12, Boolean.valueOf(z));
    }

    public final Iterable<ChartDataLabel> zz3i() {
        return this.zzZyv.zzl9();
    }

    public final void zz3j() {
        for (ChartDataLabel chartDataLabel : this.zzZyv.zzl9()) {
            if (chartDataLabel.zz3p()) {
                chartDataLabel.clearFormat();
            } else {
                zzY(chartDataLabel.zz3q());
                zzX(chartDataLabel);
            }
        }
    }

    public final ArrayList<ChartDataLabel> zz3k() {
        ArrayList<ChartDataLabel> arrayList = new ArrayList<>();
        boolean showDataLabelsRange = getShowDataLabelsRange();
        this.zzZyz.zzC(zzZyt);
        if (showDataLabelsRange) {
            for (ChartDataLabel chartDataLabel : this) {
                ChartDataLabel chartDataLabelZz3B = chartDataLabel.zz3B();
                if (chartDataLabelZz3B.getShowDataLabelsRange()) {
                    chartDataLabelZz3B.setShowDataLabelsRange(true);
                    if (this.zzZyw.zz2r()) {
                        zzY(chartDataLabelZz3B);
                    }
                }
                zzZ(chartDataLabelZz3B.zz3q());
                if (!chartDataLabel.zz3n()) {
                    chartDataLabelZz3B.zz3q().zzI(20, Boolean.TRUE);
                }
                com.aspose.words.internal.zzZQG.zzZ(arrayList, chartDataLabelZz3B);
            }
        } else {
            for (ChartDataLabel chartDataLabel2 : this.zzZyv.zzl9()) {
                if (chartDataLabel2.zz3n()) {
                    ChartDataLabel chartDataLabelZz3B2 = chartDataLabel2.zz3B();
                    if (this.zzZyw.zz2r()) {
                        zzY(chartDataLabelZz3B2);
                    }
                    zzZ(chartDataLabelZz3B2.zz3q());
                    com.aspose.words.internal.zzZQG.zzZ(arrayList, chartDataLabelZz3B2);
                }
            }
        }
        return arrayList;
    }

    public final ChartDataLabelCollection zz3l() {
        ChartDataLabelCollection chartDataLabelCollection = new ChartDataLabelCollection(this.zzZyX, this.zzZyw);
        zzFT zzft = this.zzZyz;
        if (zzft != null) {
            chartDataLabelCollection.zzZyz = zzft.zzZNH();
        }
        for (ChartDataLabel chartDataLabel : this.zzZyv.zzl9()) {
            if (chartDataLabel.zz3n()) {
                chartDataLabelCollection.zzZ(chartDataLabel.zz3B());
            }
        }
        return chartDataLabelCollection;
    }

    public final boolean zz3n() {
        zzGK zzgk;
        if (this.zzZyz.zz3n()) {
            return true;
        }
        ChartSeries chartSeries = this.zzZyw;
        if (chartSeries == null || !chartSeries.hasDataLabels()) {
            return this.zzZyw == null && (zzgk = this.zzZyX) != null && zzgk.zzZPg().zzLh(3);
        }
        return true;
    }

    public final zzFT zz3q() {
        return this.zzZyz;
    }

    public final boolean zzO5(int i) {
        ChartDataLabel chartDataLabel = (ChartDataLabel) com.aspose.words.internal.zzQW.zzZ((com.aspose.words.internal.zzZQH<Integer, TValue>) this.zzZyv, Integer.valueOf(i));
        return chartDataLabel != null && chartDataLabel.zz3n();
    }

    public final void zzO6(int i) {
        if (this.zzZyv.getCount() == 0) {
            return;
        }
        com.aspose.words.internal.zzZQH<Integer, ChartDataLabel> zzzqh = new com.aspose.words.internal.zzZQH<>(this.zzZyv.getCount());
        for (ChartDataLabel chartDataLabel : this.zzZyv.zzl9()) {
            if (chartDataLabel.getIndex() >= i) {
                chartDataLabel.setIndex(chartDataLabel.getIndex() + 1);
            }
            zzzqh.zzB(Integer.valueOf(chartDataLabel.getIndex()), chartDataLabel);
        }
        this.zzZyv = zzzqh;
    }

    public final boolean zzYG() {
        return this.zzZyv.getCount() > 0;
    }

    public final zzCL zzaR() {
        zzCL zzcl = (zzCL) this.zzZyz.zzLv(17);
        if (zzcl != null) {
            return zzcl;
        }
        zzCL zzcl2 = new zzCL();
        this.zzZyz.zzL(17, zzcl2);
        return zzcl2;
    }

    private void zzY(ChartDataLabel chartDataLabel) {
        int valueType = this.zzZyw.zz2z().getValueType();
        boolean z = true;
        if (valueType != 1 && valueType != 3) {
            z = false;
        }
        chartDataLabel.zz3q().zzXX(z);
    }

    public final void zzZ(zzGK zzgk, ChartSeries chartSeries) {
        this.zzZyX = zzgk;
        this.zzZyw = chartSeries;
        Iterator<T> it = this.zzZyv.zzl9().iterator();
        while (it.hasNext()) {
            ((ChartDataLabel) it.next()).zzZ(chartSeries);
        }
    }

    private void zzY(zzFT zzft) {
        Object objZzLu = zzft.zzLu(17);
        Object objZzLu2 = zzft.zzLu(15);
        Object objZzLu3 = zzft.zzLu(5);
        if (objZzLu == null && objZzLu2 == null && objZzLu3 == null) {
            zzft.zzLi(21);
            return;
        }
        if (objZzLu == null && this.zzZyz.zzLu(17) != null) {
            zzft.zzL(17, new zzCL());
        }
        if (objZzLu2 == null && this.zzZyz.zzLu(15) != null) {
            zzft.zzL(15, new zzD9());
        }
        if (objZzLu3 == null && this.zzZyz.zzLu(5) != null) {
            zzE8 zze8 = new zzE8();
            zze8.zzXR(true);
            zzft.zzL(5, zze8);
        }
        if (getShapeType() == 0 || zzft.zzLj(21) != null) {
            return;
        }
        zzft.zzI(21, new zzDB());
    }

    public final void zzZ(ChartDataLabel chartDataLabel) {
        this.zzZyv.zzB(Integer.valueOf(chartDataLabel.getIndex()), chartDataLabel);
    }

    private void zzZ(zzFT zzft) {
        zzft.zzC(zzZyu);
        zzE8 zze8 = (zzE8) zzft.zzLu(5);
        Object objZzLu = zzft.zzLu(17);
        Object objZzLu2 = zzft.zzLu(15);
        zzDB zzdb = (zzDB) zzft.zzLj(21);
        if (zze8 == null && objZzLu == null && objZzLu2 == null && zzdb == null) {
            return;
        }
        zzft.zzC(new int[]{5, 17, 15});
        zzft.zzB(new int[]{21});
        if (zze8 != null) {
            boolean z = (objZzLu == null && objZzLu2 == null) ? false : true;
            if (!(z && zze8.zzZLb()) && (z || !zze8.equals(zz4d()))) {
                return;
            }
            zzft.zzZNG();
        }
    }
}
