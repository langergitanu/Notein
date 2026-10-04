package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYOH extends zzYOF {
    private zzYL0 zzXJm;
    private byte[] zzXJn;

    public zzYOH(zzYTQ zzytq, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzZqL = zzytq.getClassName();
        this.zzXJn = zzzox.zzn((int) (((long) com.aspose.words.internal.zzZKQ.zzZ6(zzzox.zzXb(), (int) (zzzox.zzq().getLength() - zzzox.zzq().getPosition()))) & 4294967295L));
        this.zzXJm = zzYL0.zzc(zzzox);
    }

    @Override // com.aspose.words.zzYOF
    public final int zzYrF() {
        return 1;
    }

    public final byte[] zzYrG() {
        return this.zzXJn;
    }

    @Override // com.aspose.words.zzYOF
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        new zzYTQ(1, this.zzZqL, "", "").zzZ(zzzow);
        zzzow.zzl(this.zzXJn.length);
        zzzow.writeBytes(this.zzXJn);
        this.zzXJm.zzZ(zzzow);
    }

    public zzYOH(String str, com.aspose.words.internal.zzAA zzaa, byte[] bArr) throws Exception {
        zzYL0 zzykz;
        this.zzZqL = str;
        com.aspose.words.internal.zzKD zzkd = new com.aspose.words.internal.zzKD(zzaa);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzkd.zzL(zzzor);
        this.zzXJn = zzzor.zzWy();
        if (bArr != null) {
            zzykz = new zzYKY(bArr);
        } else {
            zzykz = new zzYKZ();
        }
        this.zzXJm = zzykz;
    }
}
