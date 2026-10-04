package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzC9 extends zz80 implements Cloneable {
    private boolean zzZ8Z;
    private boolean zzZ90;
    private int zzZ95 = 100;
    private int zzZ94 = 100;
    private int zzZ93 = 30;
    private int zzZ92 = 15;
    private int zzZ91 = 20;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zzK8(int i) {
        this.zzZ8Z = true;
        if (i < 0 || i > 360) {
            return;
        }
        this.zzZ91 = i;
    }

    public final void zzK9(int i) {
        if (i < -90 || i > 90) {
            return;
        }
        this.zzZ92 = i;
    }

    public final void zzKa(int i) {
        if (i < 0 || i > 100) {
            return;
        }
        this.zzZ93 = i;
    }

    public final void zzKb(int i) {
        if (i < 5 || i > 500) {
            return;
        }
        this.zzZ94 = i;
    }

    public final void zzKc(int i) {
        if (i < 20 || i > 2000) {
            return;
        }
        this.zzZ95 = i;
    }

    public final void zzXw(boolean z) {
        this.zzZ90 = z;
    }

    public final boolean zzZFR() {
        return this.zzZ8Z;
    }

    public final int zzZFS() {
        return this.zzZ91;
    }

    public final boolean zzZFT() {
        return this.zzZ90;
    }

    public final int zzZFU() {
        return this.zzZ93;
    }

    public final int zzZFV() {
        return this.zzZ94;
    }

    public final int zzZFW() {
        return this.zzZ95;
    }

    public final zzC9 zzZFX() {
        zzC9 zzc9 = (zzC9) memberwiseClone();
        zzc9.setExtensions(zzZBz());
        return zzc9;
    }

    public final int zzZJF() {
        return this.zzZ92;
    }
}
