package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz3U extends zz3W {
    private boolean zzia;
    private byte[] zzib;
    private zzXL zzic;

    public zz3U(zzZOP zzzop, zzXL zzxl, byte[] bArr) throws Exception {
        super(zzzop);
        this.zzib = new byte[1];
        this.zzic = zzxl;
        zzV(bArr, 0, bArr.length);
    }

    private void zzV(byte[] bArr, int i, int i2) throws Exception {
        this.zzic.zzY(bArr, i, i2);
    }

    @Override // com.aspose.words.internal.zz3W, com.aspose.words.internal.zzZOP
    public final void flush() throws Exception {
        if (this.zzia) {
            return;
        }
        byte[] bArrDoFinal = this.zzic.doFinal();
        zzuy().write(bArrDoFinal, 0, bArrDoFinal.length);
        this.zzia = true;
    }

    @Override // com.aspose.words.internal.zz3W, com.aspose.words.internal.zzZOP
    public final void write(byte[] bArr, int i, int i2) throws Exception {
        zzV(bArr, i, i2);
    }

    @Override // com.aspose.words.internal.zz3W, com.aspose.words.internal.zzZOP
    public final void writeByte(byte b) throws Exception {
        byte[] bArr = this.zzib;
        bArr[0] = b;
        zzV(bArr, 0, 1);
    }
}
