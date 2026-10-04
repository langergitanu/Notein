package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYYC {
    private int mLength;
    private int zzL4;
    private byte[] zzTZ;

    public zzYYC(int i, byte[] bArr) {
        this.zzL4 = i;
        this.zzTZ = bArr;
        this.mLength = bArr.length + 8;
    }

    public final int getLength() {
        return this.mLength;
    }

    public final void zzX(com.aspose.words.internal.zzXZ zzxz) throws Exception {
        zzxz.zzk(this.zzL4);
        zzxz.zzk(this.mLength);
        zzxz.writeBytes(this.zzTZ);
    }
}
