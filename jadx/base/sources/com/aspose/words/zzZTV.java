package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZTV extends zzZT7 {
    int zzYKE;
    int zzYKk;

    public zzZTV() {
        super(61463, 0);
    }

    @Override // com.aspose.words.zzZT7
    public final void zzD(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYKE = zzzox.zzXc();
        this.zzYKk = zzzox.zzXc();
    }

    @Override // com.aspose.words.zzZT7
    public final void zzZ(zzZSP zzzsp) throws Exception {
        zzzsp.write(this.zzYKE);
        zzzsp.write(this.zzYKk);
    }
}
