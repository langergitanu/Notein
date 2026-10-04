package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz0W implements Cloneable {
    private String zzYXT;
    private zzH1 zzYXU;
    private int zzYXV = 0;
    private int zzYXS = 1;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int getStartAt() {
        return this.zzYXS;
    }

    public final void setStartAt(int i) {
        this.zzYXS = i;
    }

    public final void zzGG(int i) {
        this.zzYXV = i;
    }

    public final void zzOj(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.zzYXT = str;
            this.zzYXV = 2;
        }
    }

    public final void zzW(zzH1 zzh1) {
        if (zzh1 == null) {
            return;
        }
        this.zzYXU = zzh1;
        this.zzYXV = 1;
    }

    public final String zzZtf() {
        return this.zzYXT;
    }

    public final zzH1 zzZtg() {
        return this.zzYXU;
    }

    public final int zzZth() {
        return this.zzYXV;
    }

    public final boolean zzZti() {
        return (!zzZxa() || zzZtk() || zzZtj()) ? false : true;
    }

    public final boolean zzZtj() {
        return this.zzYXV == 2;
    }

    public final boolean zzZtk() {
        return this.zzYXV == 1;
    }

    public final zz0W zzZtl() {
        zz0W zz0w = (zz0W) memberwiseClone();
        zzH1 zzh1 = this.zzYXU;
        if (zzh1 != null) {
            zz0w.zzYXU = zzh1.zzZQc();
        }
        return zz0w;
    }

    public final boolean zzZxa() {
        return this.zzYXV != 0;
    }
}
