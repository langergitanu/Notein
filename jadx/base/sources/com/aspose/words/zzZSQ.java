package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZSQ extends zzZT7 {
    private byte[] zzTZ;

    @Override // com.aspose.words.zzZT7
    public final void zzD(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzTZ = zzzox.zzn(zzZii().getLength());
    }

    @Override // com.aspose.words.zzZT7
    public final void zzZ(zzZSP zzzsp) throws Exception {
        zzzsp.write(this.zzTZ);
    }
}
