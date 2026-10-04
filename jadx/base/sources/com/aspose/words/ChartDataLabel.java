package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class ChartDataLabel implements zzZ9V, zzZD1, zzZD3, Cloneable {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("CELLRANGE", "VALUE", "YVALUE", "CATEGORYNAME", "XVALUE", "SERIESNAME", "PERCENTAGE", "BUBBLESIZE");
    private Font zzZEt;
    private zzEH zzZyA;
    private int zzZyB;
    private zzCL zzZyC;
    private ChartFormat zzZyE;
    private ChartNumberFormat zzZyG;
    private ChartSeries zzZyw;
    private zzD9 zzZyx;
    private zzCM zzZyy;
    private zzFT zzZyz;

    public ChartDataLabel(zzFT zzft, ChartSeries chartSeries) {
        this.zzZyz = new zzFT(zzft, chartSeries != null ? chartSeries.zz3I() : null);
        this.zzZyw = chartSeries;
    }

    private zzEH zz3A() {
        zzEH zzeh = (zzEH) this.zzZyz.zzLj(4);
        zzEH zzeh2 = (zzEH) this.zzZyz.zzLu(4);
        if (zzeh == null || zzeh2 == null) {
            return (zzEH) this.zzZyz.zzLv(4);
        }
        zzEH zzehZzZLr = zzeh.zzZLr();
        zzehZzZLr.setTop(zzeh2.getTop());
        zzehZzZLr.setLeft(zzeh2.getLeft());
        return zzehZzZLr;
    }

    private boolean zz3m() {
        return (zz4d() == null || zz4d().zzZLb()) ? false : true;
    }

    private boolean zz3s() {
        return this.zzZyz.zzLv(17) != null && zz3t();
    }

    private zzE8 zz4d() {
        return (zzE8) this.zzZyz.zzLv(5);
    }

    private void zzJ(StringBuilder sb) {
        if (sb.length() != 0) {
            com.aspose.words.internal.zzZNH.zzU(sb, getSeparator());
            com.aspose.words.internal.zzZNH.zzU(sb, " ");
        }
    }

    private void zzT(StringBuilder sb, String str) {
        zzJ(sb);
        com.aspose.words.internal.zzZNH.zzU(sb, str);
    }

    private String zzU(ChartSeries chartSeries) {
        zzCF zzcfZzKv = chartSeries.zz2y().zzZMv().zzKv(this.zzZyB);
        zzZ(chartSeries.zz2y().zzZN4().getFormatCode(), zzcfZzKv);
        return zzZ(zzcfZzKv);
    }

    private String zzV(ChartSeries chartSeries) {
        zzFD zzfdZz2z = chartSeries.zz2z();
        if (!zzfdZz2z.isEmpty() && !com.aspose.words.internal.zzAN.zzVb(zzfdZz2z.zzZN4().getValueCount())) {
            zzCF zzcfZzKg = zzfdZz2z.zzZN4().zzKg(this.zzZyB);
            if (!zzCF.zzR(zzcfZzKg) && !"#N/A".equals(zzcfZzKg.getStringValue())) {
                zzE7 zze7 = (zzE7) com.aspose.words.internal.zzZKW.zzZ(zzcfZzKg, zzE7.class);
                String formatCode = zz3m() ? zz4d().getFormatCode() : (zze7 == null || zze7.getFormatCode() == null) ? chartSeries.zz2z().zzZMv().getFormatCode() : zze7.getFormatCode();
                return zze7 == null ? zzcfZzKg.getStringValue() : zzcfZzKg.isDate() ? zzDG.zzY(zzY(zzcfZzKg), formatCode) : zzZ(zzcfZzKg, formatCode);
            }
        }
        return "";
    }

    private String zzW(ChartSeries chartSeries) {
        String formatCode = (zz4d() == null || zzEW.zzRu(zz4d().getFormatCode())) ? "0%" : zz4d().getFormatCode();
        return com.aspose.words.internal.zzJB.zzX(chartSeries.zz2y().zzZMv().zzF(this.zzZyB, formatCode), formatCode);
    }

    private String zzX(ChartSeries chartSeries) {
        StringBuilder sb = new StringBuilder();
        if (getShowDataLabelsRange()) {
            zzT(sb, chartSeries.zz2q().zzL0(this.zzZyB).getStringValue());
        }
        if (getShowSeriesName()) {
            zzT(sb, chartSeries.getName());
        }
        boolean z = zz3I().zzZP9() || zz3I().zzZP8();
        if (getShowCategoryName()) {
            zzT(sb, zzV(z ? chartSeries : zz3I().zzZPk()));
        }
        if (getShowValue()) {
            zzT(sb, zzU(chartSeries));
        }
        if (getShowPercentage() && zz3I().zzZP9()) {
            zzT(sb, zzW(chartSeries));
        }
        if (getShowBubbleSize() && zz3I().zzZP5()) {
            zzT(sb, zzZ(chartSeries.zz2x().zzL0(this.zzZyB)));
        }
        return sb.toString();
    }

    public void clearFormat() {
        int index = getIndex();
        this.zzZyz.clear();
        setIndex(index);
    }

    @Override // com.aspose.words.zzZD1
    @ReservedForInternalUse
    @Deprecated
    public Object fetchSpecialDefaultRunPropertyValue(int i) {
        return null;
    }

    @Override // com.aspose.words.zzZD1
    @ReservedForInternalUse
    @Deprecated
    public String generateItemText() {
        if (zz3I().zzZQO() == 16) {
            return null;
        }
        this.zzZyB = getIndex();
        return zzX(this.zzZyw);
    }

    @Override // com.aspose.words.zzZD1
    @ReservedForInternalUse
    @Deprecated
    public zzCL getCollectionTxPr() {
        ChartSeries chartSeries = this.zzZyw;
        if (chartSeries != null) {
            return chartSeries.getDataLabels().zzaR();
        }
        return null;
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public zz7X getFill() {
        return zzaQ().getFill();
    }

    public Font getFont() {
        if (this.zzZEt == null) {
            this.zzZEt = Font.zzZ(new zzW3(this, zz3I().getChartSpace()), zz3I().getDocument());
        }
        return this.zzZEt;
    }

    public ChartFormat getFormat() {
        if (this.zzZyE == null) {
            this.zzZyE = new ChartFormat(this);
        }
        return this.zzZyE;
    }

    public int getIndex() {
        return ((Integer) this.zzZyz.zzLv(3)).intValue();
    }

    @Override // com.aspose.words.zzZD1
    @ReservedForInternalUse
    @Deprecated
    public zzD9 getItemSpPr() {
        return (zzD9) this.zzZyz.zzLu(15);
    }

    @Override // com.aspose.words.zzZD1
    @ReservedForInternalUse
    @Deprecated
    public zzCM getItemTx() {
        return (zzCM) this.zzZyz.zzLu(16);
    }

    @Override // com.aspose.words.zzZD1
    @ReservedForInternalUse
    @Deprecated
    public zzCL getItemTxPr() {
        return (zzCL) this.zzZyz.zzLu(17);
    }

    @Override // com.aspose.words.zzZ9V
    @ReservedForInternalUse
    @Deprecated
    public zzE8 getNumFmt_INumberFormatProvider() {
        return zz4d();
    }

    public ChartNumberFormat getNumberFormat() {
        if (this.zzZyG == null) {
            this.zzZyG = new ChartNumberFormat(this, zz3I());
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
        return this.zzZyz.zzXY(zz3I().zzZP9());
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
        return zz3I().getDocument().zzZqI();
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

    public void isHidden(boolean z) {
        this.zzZyz.zzL(1, Boolean.valueOf(z));
    }

    @Override // com.aspose.words.zzZ9V
    @ReservedForInternalUse
    @Deprecated
    public boolean isInherited() {
        return this.zzZyz.zzLu(5) == null;
    }

    public boolean isVisible() {
        return getShowBubbleSize() || getShowCategoryName() || getShowLegendKey() || getShowPercentage() || getShowSeriesName() || getShowValue() || getShowDataLabelsRange();
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public void materializeSpPr() {
        if (this.zzZyz.zzLh(15)) {
            return;
        }
        zzD9 zzd9 = (zzD9) this.zzZyz.zzLv(15);
        this.zzZyz.zzL(15, zzd9 != null ? zzd9.zzZI4() : zzaQ());
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public void setFill(zz7X zz7x) {
        zzaQ().setFill(zz7x);
    }

    public final void setIndex(int i) {
        this.zzZyz.zzL(3, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZD1
    @ReservedForInternalUse
    @Deprecated
    public void setItemTxPr(zzCL zzcl) {
        this.zzZyC = zzcl;
        this.zzZyz.zzL(17, zzcl);
    }

    @Override // com.aspose.words.zzZ9V
    @ReservedForInternalUse
    @Deprecated
    public void setNumFmt_INumberFormatProvider(zzE8 zze8) {
        zzZ(zze8);
    }

    @ReservedForInternalUse
    @Deprecated
    public void setOutline(zz4G zz4g) {
        zzaQ().setOutline(zz4g);
    }

    public void setSeparator(String str) {
        this.zzZyz.zzL(6, str);
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public void setShapeType(int i) {
        if (getShapeType() == i) {
            return;
        }
        if (this.zzZyw.getDataLabels().getShapeType() == i) {
            this.zzZyz.zzLi(21);
            return;
        }
        zzDB zzdb = (zzDB) this.zzZyz.zzLj(21);
        if (zzdb == null) {
            zzdb = new zzDB();
            this.zzZyz.zzI(21, zzdb);
        }
        if (i == 0) {
            zzdb.zzZ((zz7H) null);
            return;
        }
        if (zzdb.zzZTf() == null) {
            zzdb.zzZ(new zz7H());
        }
        zzdb.zzZTf().zzOB(zzVZ.zzNx(i));
    }

    public void setShowBubbleSize(boolean z) {
        if (zz3I().zzZP5()) {
            this.zzZyz.zzL(7, Boolean.valueOf(z));
        } else {
            zz3I().zzT(65536, "ShowBubbleSize is not supported by this type of chart, value will not be set.");
        }
    }

    public void setShowCategoryName(boolean z) {
        this.zzZyz.zzL(8, Boolean.valueOf(z));
    }

    public void setShowDataLabelsRange(boolean z) {
        this.zzZyz.zzI(14, Boolean.valueOf(z));
        this.zzZyz.zzZNF();
    }

    public void setShowLeaderLines(boolean z) {
        this.zzZyz.zzL(13, Boolean.valueOf(z));
    }

    public void setShowLegendKey(boolean z) {
        this.zzZyz.zzL(9, Boolean.valueOf(z));
    }

    public void setShowPercentage(boolean z) {
        this.zzZyz.zzL(10, Boolean.valueOf(z));
    }

    public void setShowSeriesName(boolean z) {
        this.zzZyz.zzL(11, Boolean.valueOf(z));
    }

    public void setShowValue(boolean z) {
        this.zzZyz.zzL(12, Boolean.valueOf(z));
    }

    public final ChartDataLabel zz3B() {
        ChartDataLabel chartDataLabel = (ChartDataLabel) memberwiseClone();
        zzFT zzft = this.zzZyz;
        if (zzft != null) {
            chartDataLabel.zzZyz = zzft.zzZNH();
        }
        zzCM zzcm = this.zzZyy;
        if (zzcm != null) {
            chartDataLabel.zzZyy = zzcm.zzZGB();
        }
        return chartDataLabel;
    }

    public final zzGK zz3I() {
        ChartSeries chartSeries = this.zzZyw;
        if (chartSeries != null) {
            return chartSeries.zz3I();
        }
        return null;
    }

    public final boolean zz3n() {
        return this.zzZyz.zz3n();
    }

    public final int zz3o() {
        return this.zzZyB;
    }

    public final boolean zz3p() {
        Object objZzLj = this.zzZyz.zzLj(20);
        return (objZzLj instanceof Boolean) && ((Boolean) objZzLj).booleanValue();
    }

    public final zzFT zz3q() {
        return this.zzZyz;
    }

    public final zzD9 zz3r() {
        if (this.zzZyz.zzLv(18) == null) {
            this.zzZyz.zzL(18, new zzD9());
        }
        return (zzD9) this.zzZyz.zzLv(18);
    }

    public final boolean zz3t() {
        return (this.zzZyz.zzLh(15) && !zzaQ().isEmpty() && this.zzZyz.zzLh(16) && zz3u().zzZGy() == null) ? false : true;
    }

    public final zzCM zz3u() {
        if (this.zzZyy == null) {
            this.zzZyy = (zzCM) this.zzZyz.zzLv(16);
        }
        return this.zzZyy;
    }

    public final boolean zz3v() {
        if (zz3x()) {
            return zz3y().zzZLj() || zz3y().zzZLi();
        }
        return false;
    }

    public final boolean zz3w() {
        if (zz3x()) {
            return zz3y().zzZLl() || zz3y().zzZLk();
        }
        return false;
    }

    public final boolean zz3x() {
        return zz3y() != null;
    }

    public final zzEH zz3y() {
        if (this.zzZyA == null) {
            this.zzZyA = zz3A();
        }
        return this.zzZyA;
    }

    public final int zz3z() {
        return ((Integer) this.zzZyz.zzLv(2)).intValue();
    }

    public final void zzO7(int i) {
        this.zzZyB = i;
    }

    public final void zzY(ChartSeries chartSeries) {
        if (zz3u() == null) {
            this.zzZyy = zzDG.zzRk(zzX(chartSeries));
        } else {
            zzZ(zz3u(), chartSeries);
        }
    }

    public final void zzZ(ChartSeries chartSeries) {
        this.zzZyw = chartSeries;
    }

    public final zzD9 zzaQ() {
        zzD9 zzd9 = (zzD9) this.zzZyz.zzLv(15);
        if (zzd9 != null) {
            return zzd9;
        }
        if (this.zzZyx == null) {
            this.zzZyx = new zzD9();
        }
        return this.zzZyx;
    }

    public final zzCL zzaR() {
        if (this.zzZyC == null) {
            this.zzZyC = zz3s() ? (zzCL) this.zzZyz.zzLv(17) : new zzCL();
        }
        return this.zzZyC;
    }

    private void zzZ(zzCM zzcm, ChartSeries chartSeries) {
        if (zzcm == null || zzcm.zzZGw() == null) {
            return;
        }
        Iterator<zz4A> it = zzcm.zzZGw().zzMi().iterator();
        while (it.hasNext()) {
            Iterator<zz47> it2 = it.next().zzMf().iterator();
            while (it2.hasNext()) {
                zz0P zz0p = (zz0P) com.aspose.words.internal.zzZKW.zzZ(it2.next(), zz0P.class);
                if (zz0p != null) {
                    switch (zzUR.zzTP(zz0p.getType())) {
                        case 0:
                            zz0p.setText(chartSeries.zz2q().zzL0(this.zzZyB).getStringValue());
                            break;
                        case 1:
                        case 2:
                            zz0p.setText(zzU(chartSeries));
                            break;
                        case 3:
                        case 4:
                            zz0p.setText(zzV(chartSeries));
                            break;
                        case 5:
                            zz0p.setText(chartSeries.getName());
                            break;
                        case 6:
                            zz0p.setText(zzW(chartSeries));
                            break;
                        case 7:
                            zz0p.setText(zzZ(chartSeries.zz2x().zzL0(this.zzZyB)));
                            break;
                    }
                }
            }
        }
    }

    public boolean isHidden() {
        if (!this.zzZyz.zz3n()) {
            return ((Boolean) this.zzZyz.zzLv(1)).booleanValue();
        }
        Object objZzLu = this.zzZyz.zzLu(1);
        return objZzLu != null && ((Boolean) objZzLu).booleanValue();
    }

    private com.aspose.words.internal.zzZQ9 zzY(zzCF zzcf) {
        com.aspose.words.internal.zzZQ9 zzzq9ZzY3 = zzCG.zzY3(zzcf.getValue());
        zzZCR zzzcr = (zzZCR) com.aspose.words.internal.zzZKW.zzZ(zz3I(), zzZCR.class);
        return zzzcr == null ? zzzq9ZzY3 : zzDG.zzV(zzzq9ZzY3, zzzcr.zzZPt().zz41().getBaseTimeUnit());
    }

    private void zzZ(String str, zzCF zzcf) {
        zzE7 zze7 = (zzE7) com.aspose.words.internal.zzZKW.zzZ(zzcf, zzE7.class);
        if (zze7 == null) {
            return;
        }
        if (zz3m()) {
            str = zz4d().zzZLa();
        } else if (zze7.zzZLa() != null) {
            str = zze7.getFormatCode();
        }
        if (zzEW.zzRu(str)) {
            return;
        }
        com.aspose.words.internal.zzPV zzpvZzU = zzEX.zzU(zzcf.getValue(), str);
        if (zzpvZzU.isEmpty()) {
            return;
        }
        if (zz3s()) {
            this.zzZyC = zzaR().zzZGr();
        }
        zzaR().zzZHj().setFill(new zz1C(zzBW.zzj(zzpvZzU)));
    }

    private static double zzX(zzCF zzcf) {
        if (zzcf == null) {
            return 0.0d;
        }
        zzE7 zze7 = (zzE7) com.aspose.words.internal.zzZKW.zzZ(zzcf, zzE7.class);
        return zze7 != null ? zze7.zzZL9() : zzcf.getValue();
    }

    private String zzZ(zzCF zzcf) {
        if (zzCF.zzR(zzcf)) {
            return Double.isNaN(zzcf.getValue()) ? zzcf.getStringValue() : "";
        }
        String formatCode = zz3m() ? zz4d().getFormatCode() : "";
        if (getShowPercentage()) {
            formatCode = null;
        }
        return zzZ(zzcf, formatCode);
    }

    private static String zzZ(zzCF zzcf, String str) {
        String strZzR;
        if (zzEW.zzRu(str)) {
            strZzR = zzcf == null ? "" : zzcf.getStringValue();
        } else {
            strZzR = zzDG.zzR(zzX(zzcf), str);
        }
        return com.aspose.words.internal.zzZKN.zzTX(strZzR);
    }

    private void zzZ(zzE8 zze8) {
        this.zzZyz.zzL(5, zze8);
    }
}
