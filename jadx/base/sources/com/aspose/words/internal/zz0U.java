package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz0U {
    private zzZQE<zzZZR> zzeA;
    private zzX0 zzeB;
    private zzZQE<Object> zzeC;
    private zzZZ9 zzoc;

    public zz0U(zzFS zzfs, zzZZ9 zzzz9) {
        this.zzeC = zzfs.zzEO() ? new zzZQE<>() : null;
        this.zzeB = new zzX0(zzfs);
        this.zzoc = zzzz9;
        this.zzeA = new zzZQE<>();
    }

    public final zzZQE<zzZZR> zzsu() {
        return this.zzeA;
    }

    public final zzX0 zzsv() {
        return this.zzeB;
    }

    public final zzZQE<Object> zzsw() {
        return this.zzeC;
    }

    public final zzZZ9 zzxP() {
        return this.zzoc;
    }
}
