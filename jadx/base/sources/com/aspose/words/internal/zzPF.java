package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzPF {
    private float zzHi;
    private int zzHj;
    private zzPD zzHk;
    private zzPD zzHl;

    public zzPF() {
        this(new zzPD(), new zzPD(), 1, 0.75f);
    }

    public final float getWidth() {
        return this.zzHi;
    }

    public final void setWidth(float f) {
        this.zzHi = f;
    }

    public final zzPD zzOA() {
        return this.zzHk;
    }

    public final zzPD zzOB() {
        return this.zzHl;
    }

    public final zzPF zzOC() {
        return new zzPF(this.zzHl.zzOy(), this.zzHk.zzOy(), this.zzHj, this.zzHi);
    }

    public final int zzOz() {
        return this.zzHj;
    }

    public final void zzY(zzPD zzpd) {
        this.zzHk = zzpd;
    }

    public final void zzY2(int i) {
        this.zzHj = i;
    }

    public final void zzZ(zzPD zzpd) {
        this.zzHl = zzpd;
    }

    public zzPF(zzPD zzpd, zzPD zzpd2, int i, float f) {
        this.zzHl = zzpd;
        this.zzHk = zzpd2;
        this.zzHj = i;
        this.zzHi = f;
    }
}
