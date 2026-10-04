package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class AxisScaling implements zzZCH, Cloneable {
    private AxisBound zzZEv;
    private AxisBound zzZEw;
    private com.aspose.words.internal.zzZYG<zz82> zzZEy;
    private int zzL4 = 0;
    private double zzZEx = 10.0d;
    private zzZVY zzZEu = zzZVY.zzXb(0.0d);
    private int zzvP = 1;

    @Override // com.aspose.words.zzZCH
    @ReservedForInternalUse
    @Deprecated
    public com.aspose.words.internal.zzZYG<zz82> getExtensions() {
        return this.zzZEy;
    }

    public double getLogBase() {
        return this.zzZEx;
    }

    public AxisBound getMaximum() {
        AxisBound axisBound = this.zzZEv;
        return axisBound != null ? axisBound : AxisBound.zzZED;
    }

    public AxisBound getMinimum() {
        AxisBound axisBound = this.zzZEw;
        return axisBound != null ? axisBound : AxisBound.zzZED;
    }

    public final int getOrientation() {
        return this.zzvP;
    }

    public int getType() {
        return this.zzL4;
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

    public void setLogBase(double d) {
        com.aspose.words.internal.zzZ4.zzZ(d, 2.0d, 1000.0d, "value");
        this.zzZEx = d;
        this.zzL4 = 1;
    }

    public void setMaximum(AxisBound axisBound) {
        com.aspose.words.internal.zzZ4.zzY((Object) axisBound, "value");
        this.zzZEv = axisBound;
    }

    public void setMinimum(AxisBound axisBound) {
        com.aspose.words.internal.zzZ4.zzY((Object) axisBound, "value");
        this.zzZEw = axisBound;
    }

    public final void setOrientation(int i) {
        this.zzvP = i;
    }

    public void setType(int i) {
        this.zzL4 = i;
    }

    public final void zzZ6(double d) {
        this.zzZEx = d;
        this.zzL4 = 1;
    }

    public final zzZVY zzaT() {
        return this.zzZEu;
    }

    public final boolean zzaU() {
        return this.zzZEv != null;
    }

    public final boolean zzaV() {
        return this.zzZEw != null;
    }

    public final AxisScaling zzaW() {
        AxisScaling axisScaling = (AxisScaling) memberwiseClone();
        axisScaling.zzZEu = this.zzZEu.zzZk3();
        axisScaling.zzZEy = zz80.zzN(this.zzZEy);
        return axisScaling;
    }
}
