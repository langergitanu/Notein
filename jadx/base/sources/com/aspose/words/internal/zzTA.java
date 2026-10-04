package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzTA extends zzTG {
    private int zzQx;
    private int zzTJ;

    public zzTA(zzZYV<Integer> zzzyv, int i, int i2, int i3) {
        super(zzzyv, i);
        this.zzQx = i2;
        this.zzTJ = i3;
    }

    @Override // com.aspose.words.internal.zzTG
    public final boolean zzTx() {
        return this.zzQx == 3 && this.zzTJ == 0;
    }

    @Override // com.aspose.words.internal.zzTG
    public final zzTE[] zzTy() {
        return new zzTE[]{new zzTB(this.zzQx, this.zzTJ, this.zzQz, this.zzQy)};
    }
}
