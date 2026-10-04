package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz4V implements Cloneable {
    private double zzE0 = Double.NaN;
    private double zzZ7V = Double.NaN;
    private double zzvQ = Double.MAX_VALUE;
    private zzBE zzZ7U = new zzBE();

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final double getMax() {
        return this.zzvQ;
    }

    public final double getValue() {
        return this.zzE0;
    }

    public final void setValue(double d) {
        this.zzE0 = d;
    }

    public final void zzXZ(double d) {
        this.zzZ7V = d;
    }

    public final void zzZ(zzBE zzbe) {
        this.zzZ7U = zzbe;
    }

    public final zzBE zzZF9() {
        return this.zzZ7U;
    }

    public final double zzZFa() {
        return this.zzZ7V;
    }

    public final void zzZN(double d) {
        this.zzvQ = d;
    }

    public final zz4V zzZy2() {
        return (zz4V) memberwiseClone();
    }
}
