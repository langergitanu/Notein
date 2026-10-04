package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYXS {
    private byte[] zzXXx;
    private byte[] zzXXy;

    public zzYXS(byte[] bArr, byte[] bArr2) {
        this.zzXXy = bArr;
        this.zzXXx = bArr2;
    }

    public final void zzX(com.aspose.words.internal.zzXZ zzxz) throws Exception {
        zzxz.writeBytes(this.zzXXy);
        zzxz.writeBytes(this.zzXXx);
        zzxz.writeByte((byte) this.zzXXx.length);
    }
}
