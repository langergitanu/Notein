package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzHX {
    public long zzx1;
    public int zzx2;
    public zzHX zzx3;
    public zzHX zzx4;
    public zzHX zzx5;
    public int zzx6;

    public final boolean zzFN() {
        return this.zzx4 == null || this.zzx3 == null;
    }

    public final void zzFO() {
        if (zzFN()) {
            return;
        }
        this.zzx4.zzFO();
        this.zzx3.zzFO();
        this.zzx1 = this.zzx4.zzx1 + this.zzx3.zzx1;
    }

    public final void zzY(zzHX zzhx) {
        this.zzx3 = zzhx;
        zzhx.zzx5 = this;
    }

    public final void zzZ(zzHX zzhx) {
        this.zzx4 = zzhx;
        zzhx.zzx5 = this;
    }
}
