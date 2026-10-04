package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZU2 extends zzZT7 {
    int zzYKD;
    int zzYKE;

    public zzZU2() {
        super(61460, 0);
    }

    @Override // com.aspose.words.zzZT7
    public final void zzD(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYKE = zzzox.zzXc();
        this.zzYKD = zzzox.zzXc();
    }

    @Override // com.aspose.words.zzZT7
    public final void zzZ(zzZSP zzzsp) throws Exception {
        zzzsp.write(this.zzYKE);
        zzzsp.write(this.zzYKD);
    }
}
