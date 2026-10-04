package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZW implements Cloneable {
    private double zzYWU;
    private double zzYWV;
    private String zzYWW;

    public zzZZW() {
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zzOf(String str) {
        this.zzYWW = str;
    }

    public final void zzXc(double d) {
        this.zzYWU = d;
    }

    public final void zzXd(double d) {
        this.zzYWV = d;
    }

    public final double zzZrZ() {
        return this.zzYWU;
    }

    public final double zzZs0() {
        return this.zzYWV;
    }

    public final String zzZs1() {
        return this.zzYWW;
    }

    public final zzZZW zzZs2() {
        return (zzZZW) memberwiseClone();
    }

    public zzZZW(String str) {
        this.zzYWW = str;
        this.zzYWV = 640.0d;
        this.zzYWU = 390.0d;
    }
}
