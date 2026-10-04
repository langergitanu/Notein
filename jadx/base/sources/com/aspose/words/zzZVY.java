package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZVY implements Cloneable {
    private double zzE0;
    private boolean zzYMZ;
    private boolean zzZEG;

    private zzZVY() {
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public static zzZVY zzXb(double d) {
        zzZVY zzzvy = new zzZVY();
        zzzvy.zzE0 = d;
        zzzvy.zzZk1();
        return zzzvy;
    }

    private void zzZk1() {
        this.zzYMZ = true;
        this.zzZEG = false;
    }

    public final double getValue() {
        return this.zzE0;
    }

    public final boolean isAuto() {
        return this.zzZEG;
    }

    public final void setValue(double d) {
        this.zzE0 = d;
        this.zzZEG = false;
        this.zzYMZ = false;
    }

    public final boolean zzZk0() {
        return this.zzYMZ || this.zzZEG;
    }

    public final boolean zzZk2() {
        return this.zzYMZ;
    }

    public final zzZVY zzZk3() {
        return (zzZVY) memberwiseClone();
    }

    public final void isAuto(boolean z) {
        this.zzZEG = z;
        if (z) {
            this.zzYMZ = false;
        }
    }
}
