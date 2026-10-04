package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZC {
    private int mLength;
    private int zzZEl;

    public zzZC(zzYYL zzyyl) throws Exception {
        this.zzZEl = zzyyl.zzYD0();
        int iZzYD0 = zzyyl.zzYD0() - this.zzZEl;
        this.mLength = iZzYD0;
        if (iZzYD0 < 0) {
            throw new IllegalStateException("Invalid FDST chunk size.");
        }
    }

    public final byte[] zzYH(byte[] bArr) {
        int i = this.mLength;
        byte[] bArr2 = new byte[i];
        com.aspose.words.internal.zzZKV.zzZ(bArr, this.zzZEl, bArr2, 0, i);
        return bArr2;
    }
}
