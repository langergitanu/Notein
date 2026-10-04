package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZTR extends zzZT7 {
    private int zzYKi;

    public zzZTR() {
        super(61453, 0);
    }

    @Override // com.aspose.words.zzZT7
    public final void zzD(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYKi = zzzox.zzXc();
    }

    public final void zzEk(int i) {
        this.zzYKi = i;
    }

    @Override // com.aspose.words.zzZT7
    public final void zzZ(zzZSP zzzsp) throws Exception {
        zzzsp.write(this.zzYKi);
    }
}
