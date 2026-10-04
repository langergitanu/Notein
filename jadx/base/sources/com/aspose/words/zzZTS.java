package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZTS extends zzZT7 {
    private int zzYKj;

    public zzZTS() {
        super(61457, 0);
    }

    @Override // com.aspose.words.zzZT7
    public final void zzD(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYKj = zzzox.zzXc();
    }

    @Override // com.aspose.words.zzZT7
    public final void zzZ(zzZSP zzzsp) throws Exception {
        zzzsp.write(this.zzYKj);
    }

    public final void zzZiH() {
        this.zzYKj = 1;
    }
}
