package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzL {
    private int zzZU;
    private zzZQ4 zzZV;

    public zzL(zzZQ4 zzzq4) {
        zzZQ4 zzzq42 = zzZQ4.zz2T;
        this.zzZV = zzzq4;
    }

    public abstract int getType();

    public abstract zzL zz0();

    public final void zzO(int i) {
        this.zzZU = i;
    }

    public final void zzZ(zzZQ4 zzzq4) {
        this.zzZV = zzzq4;
    }

    public final int zzZY() {
        return this.zzZU;
    }

    public final zzZQ4 zzZZ() {
        return this.zzZV;
    }
}
