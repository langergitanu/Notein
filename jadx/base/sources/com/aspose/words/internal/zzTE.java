package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzTE {
    private int zzQt;
    private zzZYV<Integer> zzQu;
    private int zzQx;
    private int zzTJ;

    public zzTE(int i, int i2, int i3, zzZYV<Integer> zzzyv) {
        this.zzQx = i;
        this.zzTJ = i2;
        this.zzQu = zzzyv;
        this.zzQt = i3;
    }

    public final zzZYV<Integer> zzTt() {
        return this.zzQu;
    }

    public final int zzTu() {
        return this.zzQt;
    }

    public final int zzTv() {
        return this.zzTJ;
    }

    public final int zzTw() {
        return this.zzQx;
    }

    public final byte[] zzVf() throws Exception {
        zzZOR zzzor = new zzZOR();
        try {
            zzX(new zzXZ(zzzor));
            return zzzor.zzWy();
        } finally {
            zzzor.close();
        }
    }

    public abstract void zzX(zzXZ zzxz) throws Exception;
}
