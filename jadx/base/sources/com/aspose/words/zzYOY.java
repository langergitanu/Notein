package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYOY extends zzYPQ {
    private boolean zzXKH;
    private int zzXKI;
    private zzYEF zzZsP;
    private zzYMX zzZsQ = new zzYMX();
    private double zzXKJ = 0.0d;

    public final int getTextOrientation() {
        return this.zzXKI;
    }

    public final void setTextOrientation(int i) {
        this.zzXKI = i;
    }

    public final zzYEF zzD(zzYEF zzyef) {
        zzYEF zzyef2 = zzyef != null ? (zzYEF) zzyef.zzbn() : null;
        zzYEF zzyef3 = this.zzZsP;
        if (zzyef3 != null) {
            if (zzyef2 == null) {
                zzyef2 = (zzYEF) zzyef3.zzbn();
            } else {
                zzyef3.zzY(zzyef2);
            }
        }
        return zzyef2 != null ? zzyef2 : new zzYEF();
    }

    public final void zzS0(boolean z) {
        this.zzXKH = z;
    }

    public final void zzWy(double d) {
        this.zzXKJ = d;
    }

    public final boolean zzYsZ() {
        return this.zzXKH;
    }

    public final double zzYt0() {
        return this.zzXKJ;
    }

    public final void zzZ(zzYEF zzyef) {
        this.zzZsP = zzyef;
    }

    public final zzYEF zzZYh() {
        return this.zzZsP;
    }

    public final zzYMX zzZYj() {
        return this.zzZsQ;
    }

    public final void zzZ(zzYMX zzymx) {
        this.zzZsQ = zzymx;
    }
}
