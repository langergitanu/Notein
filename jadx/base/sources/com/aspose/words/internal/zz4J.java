package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz4J extends zz21 {
    private String zzZR;
    private byte[] zzZT;

    public zz4J(zz4W zz4w, zzK zzk) throws Exception {
        super(zz4w);
        this.zzZT = zzk.zzZX();
        this.zzZR = zzk.getContentType();
    }

    @Override // com.aspose.words.internal.zz21
    public final void zzN(zzFY zzfy) throws Exception {
        zzfy.zzH("/Type", "/EmbeddedFile");
        zzfy.zzE("/Subtype", this.zzZR);
        zzfy.zzYY("/Params");
        zzfy.zzFd();
        zzfy.zzM("/Size", this.zzZT.length);
        zzfy.zzFc();
    }

    @Override // com.aspose.words.internal.zz21
    public final void zzuE() throws Exception {
        zzZOP zzzopZzq = zzq();
        byte[] bArr = this.zzZT;
        zzzopZzq.write(bArr, 0, bArr.length);
    }
}
