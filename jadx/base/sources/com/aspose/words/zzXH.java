package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzXH implements zzZ8R {
    int zzZAU;

    public zzXH(com.aspose.words.internal.zzZOX zzzox, int i) throws Exception {
        int i2 = zzZRA.zzDL(i) ? 6 : 12;
        this.zzZAU = zzzox.readByte() & 255;
        zzzox.zzq().zzU(i2, 1);
    }

    @Override // com.aspose.words.zzZ8R
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.writeByte((byte) this.zzZAU);
        zzzow.zzq().zzU(12L, 1);
    }

    public zzXH(int i) {
        this.zzZAU = i;
    }
}
