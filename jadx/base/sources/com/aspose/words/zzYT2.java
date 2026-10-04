package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYT2 extends zzYSZ {
    private zzYT4 zzXRm;
    private int zzXRn;
    private zzYT1 zzXRo;

    public zzYT2(zzYPO zzypo) {
        super(zzypo);
        this.zzXRn = 1;
    }

    public final zzYT1 zzYxs() {
        if (this.zzXRo == null) {
            this.zzXRo = new zzYT1(zzYxl().zzYx1());
        }
        return this.zzXRo;
    }

    public final zzYT4 zzYxt() {
        return this.zzXRm;
    }

    public final int zzYxu() {
        return this.zzXRn;
    }

    public final void zzZ(zzYT4 zzyt4) {
        this.zzXRm = zzyt4;
    }

    public final void zzsP(int i) {
        this.zzXRn = i;
    }
}
