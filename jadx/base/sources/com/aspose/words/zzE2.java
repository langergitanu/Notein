package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzE2 extends zz80 implements Cloneable {
    private int zzTL;
    private ChartDataLabel zzZbC;
    private zzZ90 zzZxX;
    private zzCL zzZyC;
    private ChartMarker zzZyo;
    private zzD9 zzZyx;

    public zzE2(zzZ90 zzz90) {
        this.zzZxX = zzz90;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int getIndex() {
        return this.zzTL;
    }

    public final ChartMarker getMarker() {
        if (this.zzZyo == null) {
            this.zzZyo = new ChartMarker(this.zzZxX);
        }
        return this.zzZyo;
    }

    public final void setIndex(int i) {
        this.zzTL = i;
    }

    public final void zzU(ChartDataLabel chartDataLabel) {
        this.zzZbC = chartDataLabel;
    }

    public final ChartDataLabel zzZKW() {
        return this.zzZbC;
    }

    public final zzE2 zzZKX() {
        zzE2 zze2 = (zzE2) memberwiseClone();
        zzD9 zzd9 = this.zzZyx;
        if (zzd9 != null) {
            zze2.zzZyx = zzd9.zzZI4();
        }
        ChartDataLabel chartDataLabel = this.zzZbC;
        if (chartDataLabel != null) {
            zze2.zzZbC = chartDataLabel.zz3B();
        }
        ChartMarker chartMarker = this.zzZyo;
        if (chartMarker != null) {
            zze2.zzZyo = chartMarker.zz2P();
        }
        zzCL zzcl = this.zzZyC;
        if (zzcl != null) {
            zze2.zzZyC = zzcl.zzZGr();
        }
        zze2.setExtensions(zzZBz());
        return zze2;
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
}
