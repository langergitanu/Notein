package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz0R {
    private int zzTL;
    private zz0S zzev;
    private int zzp8;

    public zz0R(zz0S zz0s, int i, int i2) {
        this.zzev = zz0s;
        this.zzTL = i;
        this.zzp8 = i2;
    }

    public final int getIndex() {
        return this.zzTL;
    }

    public final int getPosition() {
        return this.zzp8;
    }

    public final boolean zzYC() {
        return this.zzev.getItemCount() <= this.zzTL;
    }

    public final void zzsj() {
        int i = this.zzTL + 1;
        this.zzTL = i;
        this.zzp8 = this.zzev.zzTe(i);
    }
}
