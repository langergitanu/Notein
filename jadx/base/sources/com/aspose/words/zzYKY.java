package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYKY extends zzYL0 {
    private int zzVL;
    private int zzVN;
    private byte[] zzXDq;

    public zzYKY(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzVL = zzzox.zzXc();
        this.zzVN = zzzox.zzXc();
        int iZzXc = zzzox.zzXc() - 8;
        com.aspose.words.internal.zzZYQ.zzT(zzzox, iZzXc);
        this.zzXDq = zzzox.zzn(iZzXc);
    }

    @Override // com.aspose.words.zzYL0
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzl(1281);
        zzzow.zzl(5);
        zzYO6.zzV(zzzow, "METAFILEPICT");
        zzzow.zzl(0);
        zzzow.zzl(0);
        zzzow.zzl(this.zzXDq.length + 8);
        zzzow.zzl(0);
        zzzow.zzl(0);
        zzzow.writeBytes(this.zzXDq);
    }

    public zzYKY(byte[] bArr) {
        this.zzXDq = bArr;
    }
}
