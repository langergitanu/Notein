package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYMY implements zzZ97 {
    private zzYMT zzXH0;
    private zzY6F zzXH1;
    private zzY9J zzXH2;
    private zzYMV zzYbB;
    private zzY6G zzZsO;
    private zzYMX zzZsQ;

    public zzYMY(zzZZB zzzzb) throws Exception {
        zzY9J zzy9j = new zzY9J(this, zzzzb.zzYUt, zzzzb.zzYUr);
        this.zzXH2 = zzy9j;
        zzy9j.zzQm(zzzzb.zzYUr >= 257);
        this.zzYbB = new zzYMV(zzzzb);
        this.zzXH1 = new zzY6F(zzzzb);
    }

    public final zzYMT zzYpO() {
        return this.zzXH0;
    }

    public final void zzZ(zzYNJ zzynj, byte[] bArr) throws Exception {
        this.zzZsQ = new zzYMX();
        zzYMT zzymt = new zzYMT();
        this.zzXH0 = zzymt;
        this.zzZsO = null;
        this.zzYbB.zzZ(this.zzZsQ, zzymt);
        this.zzZsQ.zzQ(1000, Integer.valueOf(zzynj.zzZ7j()));
        this.zzXH2.zzXK(zzynj.getData());
        this.zzXH2.zzXK(bArr);
        if (this.zzZsO != null) {
            this.zzXH1.zzYpf();
        }
        zzYMV.zzYpf();
    }

    public final zzY6G zzZYf() {
        return this.zzZsO;
    }

    public final zzYMX zzZYj() {
        return this.zzZsQ;
    }

    @Override // com.aspose.words.zzZ97
    public final boolean zzZ(int i, int i2, int i3, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        if (i2 == 1) {
            return this.zzYbB.zzZ(i, i2, i3, zzzox);
        }
        if (i2 != 5) {
            return true;
        }
        if (this.zzZsO == null) {
            zzY6G zzy6g = new zzY6G();
            this.zzZsO = zzy6g;
            this.zzXH1.zzD(zzy6g);
        }
        return this.zzXH1.zzZ(i, i2, i3, zzzox);
    }
}
