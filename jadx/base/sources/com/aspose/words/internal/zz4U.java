package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz4U {
    private zzZYV<zz4T> zzjw;

    public zz4U() {
        zzZYV<zz4T> zzzyv = new zzZYV<>();
        this.zzjw = zzzyv;
        zzzyv.add(0, new zz4T(0, 0, 65535));
    }

    public final void zzI(int i, int i2, int i3) {
        this.zzjw.add(i, new zz4T(2, i2, i3));
    }

    public final void zzZT(int i, int i2) {
        this.zzjw.add(i, new zz4T(1, i2, 0));
    }

    public final zzZYV<zz4T> zzv0() {
        return this.zzjw;
    }
}
