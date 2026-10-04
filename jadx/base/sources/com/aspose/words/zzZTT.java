package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZTT extends zzZT7 {
    private int zzYKj;

    public zzZTT() {
        super(61456, 0);
    }

    @Override // com.aspose.words.zzZT7
    public final void zzD(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYKj = zzzox.zzXc();
    }

    @Override // com.aspose.words.zzZT7
    public final void zzZ(zzZSP zzzsp) throws Exception {
        zzzsp.write(this.zzYKj);
    }

    public final void zzZiI() {
        this.zzYKj = Integer.MIN_VALUE;
    }
}
