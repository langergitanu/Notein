package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzE3 implements Cloneable {
    private double zzZbD;
    private int zzZbE;
    private boolean zzZbF;
    private boolean zzZbG;
    private boolean zzZbH;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int getPictureFormat() {
        return this.zzZbE;
    }

    public final void setPictureFormat(int i) {
        this.zzZbE = i;
    }

    public final void zzXO(boolean z) {
        this.zzZbF = z;
    }

    public final void zzXP(boolean z) {
        this.zzZbG = z;
    }

    public final void zzXQ(boolean z) {
        this.zzZbH = z;
    }

    public final void zzYk(double d) {
        if (this.zzZbD > 0.0d) {
            this.zzZbD = d;
        }
    }

    public final double zzZKY() {
        return this.zzZbD;
    }

    public final boolean zzZKZ() {
        return this.zzZbF;
    }

    public final boolean zzZL0() {
        return this.zzZbG;
    }

    public final boolean zzZL1() {
        return this.zzZbH;
    }

    public final zzE3 zzZL2() {
        return (zzE3) memberwiseClone();
    }
}
