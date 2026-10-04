package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZTU implements zzG7 {
    private zzZUN zz6H;
    private zzZV1 zz6S;
    private int zzDe;
    private long zzDf;
    private long zzEr;
    private int zzL4;

    public zzZTU(zzZV1 zzzv1) {
        this.zz6S = zzzv1;
    }

    private long zzmX() {
        return this.zzEr + this.zzDf;
    }

    public final int getDataSize() {
        return (int) (this.zzDf - 6);
    }

    public final int getType() {
        return this.zzL4;
    }

    @Override // com.aspose.words.internal.zzG7
    public final int zzJn() {
        return 6;
    }

    @Override // com.aspose.words.internal.zzG7
    public final boolean zzJo() {
        return this.zzL4 == 0;
    }

    public final int zzJp() {
        return this.zzDe;
    }

    @Override // com.aspose.words.internal.zzG7
    public final long zzJq() {
        return this.zzDf;
    }

    public final long zzJr() {
        return this.zzEr;
    }

    @Override // com.aspose.words.internal.zzG7
    public final void zzJs() throws Exception {
        this.zzEr = this.zz6S.zzq().getPosition();
        this.zzDf = this.zz6S.zzXc() * 2;
        this.zzL4 = this.zz6S.zzXa() & 65535;
        this.zzDe++;
        this.zz6H = null;
    }

    @Override // com.aspose.words.internal.zzG7
    public final void zzLn() throws Exception {
        this.zz6S.zzq().zzH(zzmX());
    }

    public final zzZUN zzmM() throws Exception {
        if (this.zz6H == null) {
            this.zz6H = zzZUN.zzZ(this.zzL4, this.zz6S, this.zzEr, (int) this.zzDf);
        }
        return this.zz6H;
    }
}
