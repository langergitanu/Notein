package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ChartLegend implements zzZCH, Cloneable {
    private Font zzZEt;
    private com.aspose.words.internal.zzZYG<zz82> zzZEy;
    private zzEY zzZy4;
    private ChartLegendEntryCollection zzZy7;
    private boolean zzZy8;
    private zzEH zzZyA;
    private zzCL zzZyC;
    private zzD9 zzZyx;
    private int zzZy9 = 3;
    private int zzZy6 = 2;
    private int zzZy5 = 1;

    public ChartLegend() {
    }

    @Override // com.aspose.words.zzZCH
    @ReservedForInternalUse
    @Deprecated
    public com.aspose.words.internal.zzZYG<zz82> getExtensions() {
        return this.zzZEy;
    }

    public Font getFont() {
        if (this.zzZEt == null) {
            this.zzZEt = Font.zzZ(new zzW8(zzaR(), this.zzZy4.zzZLZ()), this.zzZy4.getDocument());
        }
        return this.zzZEt;
    }

    public ChartLegendEntryCollection getLegendEntries() {
        return this.zzZy7;
    }

    public boolean getOverlay() {
        return this.zzZy8;
    }

    public int getPosition() {
        return this.zzZy9;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zzZCH
    @ReservedForInternalUse
    @Deprecated
    public void setExtensions(com.aspose.words.internal.zzZYG<zz82> zzzyg) {
        this.zzZEy = zzzyg;
    }

    public void setOverlay(boolean z) {
        this.zzZy8 = z;
    }

    public void setPosition(int i) {
        this.zzZy9 = i;
    }

    public final int zz2V() {
        return this.zzZy5;
    }

    public final int zz2W() {
        return this.zzZy6;
    }

    public final zzEH zz3y() {
        return this.zzZyA;
    }

    public final void zzNQ(int i) {
        this.zzZy5 = i;
    }

    public final void zzNR(int i) {
        this.zzZy6 = i;
    }

    public final ChartLegendEntry zzNS(int i) {
        return this.zzZy7.zzNS(i);
    }

    public final void zzZ(ChartLegendEntry chartLegendEntry) {
        this.zzZy7.zzZ(chartLegendEntry);
    }

    public final zzD9 zzaQ() {
        if (this.zzZyx == null) {
            this.zzZyx = new zzD9();
        }
        return this.zzZyx;
    }

    public final zzCL zzaR() {
        if (this.zzZyC == null) {
            this.zzZyC = new zzCL();
        }
        return this.zzZyC;
    }

    public final ChartLegend zzZ(zzEY zzey) {
        ChartLegend chartLegend = (ChartLegend) memberwiseClone();
        chartLegend.zzZy4 = zzey;
        zzEH zzeh = this.zzZyA;
        if (zzeh != null) {
            chartLegend.zzZyA = zzeh.zzZLr();
        }
        zzD9 zzd9 = this.zzZyx;
        if (zzd9 != null) {
            chartLegend.zzZyx = zzd9.zzZI4();
        }
        zzCL zzcl = this.zzZyC;
        if (zzcl != null) {
            chartLegend.zzZyC = zzcl.zzZGr();
        }
        chartLegend.zzZy7 = this.zzZy7.zzX(zzey);
        com.aspose.words.internal.zzZYG<zz82> zzzyg = this.zzZEy;
        if (zzzyg != null) {
            chartLegend.zzZEy = zz80.zzN(zzzyg);
        }
        chartLegend.zzZEt = null;
        return chartLegend;
    }

    public ChartLegend(zzEY zzey) {
        this.zzZy4 = zzey;
        this.zzZy7 = new ChartLegendEntryCollection(zzey);
    }

    public final void zzZ(zzEH zzeh) {
        this.zzZyA = zzeh;
    }
}
