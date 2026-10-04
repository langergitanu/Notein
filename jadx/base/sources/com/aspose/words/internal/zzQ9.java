package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzQ9 extends zzQI implements Cloneable {
    private double zzKE;
    private double zzXw;
    private double zzXx;

    public zzQ9() {
        this.zzXx = 0.0d;
        this.zzXw = 0.0d;
        this.zzKE = 0.0d;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zz9(double d) {
        this.zzKE = d;
    }

    public final double zzQa() {
        return this.zzKE;
    }

    public final double zzQb() {
        return this.zzXx;
    }

    public final zzQI zzQc() {
        return (zzQI) memberwiseClone();
    }

    public final void zzV(double d) {
        this.zzXw = d;
    }

    public final void zzW(double d) {
        this.zzXx = d;
    }

    public final double zzYm() {
        return this.zzXw;
    }

    @Override // com.aspose.words.internal.zzQI
    public final void zzZ(zzQA zzqa) throws Exception {
        zzqa.zzX(this);
    }

    public zzQ9(double d, double d2, double d3) {
        this.zzXx = d;
        this.zzXw = d2;
        this.zzKE = d3;
    }
}
