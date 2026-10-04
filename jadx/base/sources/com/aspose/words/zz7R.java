package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz7R implements Cloneable {
    private double zzZ3T;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zzXU(double d) {
        this.zzZ3T = d;
    }

    public final double zzZB2() {
        return this.zzZ3T;
    }

    public final zz7R zzZB3() {
        return (zz7R) memberwiseClone();
    }
}
