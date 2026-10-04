package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ChartDataPoint implements IChartDataPoint, zzZD3, Cloneable {
    private ChartFormat zzZyE;
    private zzGK zzZyX;
    private ChartMarker zzZyo;
    private zzFN zzZyp;
    private zzD9 zzZyx;

    public ChartDataPoint(zzGK zzgk) {
        this.zzZyX = zzgk;
        this.zzZyp = new zzFN(zzgk != null ? zzgk.getDocument() : null);
    }

    public void clearFormat() {
        int index = getIndex();
        this.zzZyp.clear();
        setIndex(index);
        ChartMarker chartMarker = this.zzZyo;
        if (chartMarker != null) {
            chartMarker.zz2O().clear();
            this.zzZyp.zzL(4, this.zzZyo);
        }
    }

    @Override // com.aspose.words.IChartDataPoint
    public boolean getBubble3D() {
        return ((Boolean) this.zzZyp.zzLv(3)).booleanValue();
    }

    @Override // com.aspose.words.IChartDataPoint
    public int getExplosion() {
        return ((Integer) this.zzZyp.zzLv(1)).intValue();
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public zz7X getFill() {
        return zzaQ().getFill();
    }

    public ChartFormat getFormat() {
        if (this.zzZyE == null) {
            this.zzZyE = new ChartFormat(this);
        }
        return this.zzZyE;
    }

    public int getIndex() {
        return ((Integer) this.zzZyp.zzLv(0)).intValue();
    }

    @Override // com.aspose.words.IChartDataPoint
    public boolean getInvertIfNegative() {
        return ((Boolean) this.zzZyp.zzLv(2)).booleanValue();
    }

    @Override // com.aspose.words.IChartDataPoint
    public ChartMarker getMarker() {
        if (this.zzZyo == null) {
            this.zzZyo = (ChartMarker) this.zzZyp.zzLu(4);
        }
        if (this.zzZyo == null) {
            zzZ(new ChartMarker(this.zzZyX));
        }
        return this.zzZyo;
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public zz4G getOutline() {
        return zzaQ().getOutline();
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public int getShapeType() {
        return 0;
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
        return this.zzZyp.zzLh(5) && !zzaQ().isEmpty();
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public void materializeSpPr() {
        if (this.zzZyp.zzLh(5)) {
            return;
        }
        zzD9 zzd9 = (zzD9) this.zzZyp.zzLv(5);
        zzZ(zzd9 != null ? zzd9.zzZI4() : new zzD9());
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.IChartDataPoint
    public void setBubble3D(boolean z) {
        if (this.zzZyX.zzZQO() == 15) {
            this.zzZyp.zzL(3, Boolean.valueOf(z));
        } else {
            this.zzZyX.zzT(65536, "Bubble3D is not supported by this type of chart, value will not be set.");
        }
    }

    @Override // com.aspose.words.IChartDataPoint
    public void setExplosion(int i) {
        if (this.zzZyX.zzZP9()) {
            this.zzZyp.zzL(1, Integer.valueOf(i));
        } else {
            this.zzZyX.zzT(65536, "Explosion is not supported by this type of chart, value will not be set.");
        }
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public void setFill(zz7X zz7x) {
        zzaQ().setFill(zz7x);
    }

    public final void setIndex(int i) {
        this.zzZyp.zzL(0, Integer.valueOf(i));
    }

    @Override // com.aspose.words.IChartDataPoint
    public void setInvertIfNegative(boolean z) {
        this.zzZyp.zzL(2, Boolean.valueOf(z));
    }

    @ReservedForInternalUse
    @Deprecated
    public void setOutline(zz4G zz4g) {
        zzaQ().setOutline(zz4g);
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public void setShapeType(int i) {
        if (i != 0) {
            throw new IllegalStateException("Cannot change the shape type of this chart element.");
        }
    }

    public final zzGK zz3I() {
        return this.zzZyX;
    }

    public final zzFN zz3d() {
        return this.zzZyp;
    }

    public final zzE3 zz3e() {
        return (zzE3) this.zzZyp.zzLv(6);
    }

    public final boolean zz3f() {
        return this.zzZyp.zzLh(4);
    }

    public final ChartDataPoint zz3g() {
        ChartDataPoint chartDataPoint = (ChartDataPoint) memberwiseClone();
        zzFN zzfn = this.zzZyp;
        if (zzfn != null) {
            chartDataPoint.zzZyp = zzfn.zzZNa();
        }
        if (this.zzZyx != null) {
            chartDataPoint.zzZyx = (zzD9) chartDataPoint.zzZyp.zzLv(5);
        }
        if (this.zzZyo != null) {
            chartDataPoint.zzZyo = (ChartMarker) chartDataPoint.zzZyp.zzLv(4);
        }
        chartDataPoint.zzZyE = null;
        return chartDataPoint;
    }

    public final boolean zz3n() {
        return this.zzZyp.zz3n();
    }

    public final void zzX(ChartDataPoint chartDataPoint) {
        this.zzZyp.zzZ(chartDataPoint.zzZyp);
    }

    public final void zzY(ChartDataPoint chartDataPoint) {
        this.zzZyp.zzY(chartDataPoint.zzZyp);
        this.zzZyx = (zzD9) this.zzZyp.zzLu(5);
        this.zzZyo = (ChartMarker) this.zzZyp.zzLu(4);
    }

    public final void zzZ(ChartDataPoint chartDataPoint) {
        if (this == chartDataPoint) {
            return;
        }
        int index = getIndex();
        this.zzZyp = chartDataPoint.zzZyp.zzZNa();
        setIndex(index);
        this.zzZyx = (zzD9) this.zzZyp.zzLu(5);
        this.zzZyo = (ChartMarker) this.zzZyp.zzLu(4);
        this.zzZyE = null;
    }

    public final zzD9 zzaQ() {
        if (this.zzZyx == null) {
            this.zzZyx = (zzD9) this.zzZyp.zzLv(5);
        }
        if (this.zzZyx == null) {
            zzZ(new zzD9());
        }
        return this.zzZyx;
    }

    public final void zzZ(zzGK zzgk) {
        this.zzZyX = zzgk;
    }

    public final void zzZ(zzD9 zzd9) {
        this.zzZyx = zzd9;
        this.zzZyp.zzL(5, zzd9);
    }

    private void zzZ(ChartMarker chartMarker) {
        this.zzZyo = chartMarker;
        this.zzZyp.zzL(4, chartMarker);
    }
}
