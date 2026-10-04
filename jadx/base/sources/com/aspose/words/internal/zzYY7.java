package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYY7 extends zzYT2 {
    private final byte[] data;

    public zzYY7(byte[] bArr) {
        super(false);
        byte[] bArr2 = new byte[57];
        this.data = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 57);
    }

    public final byte[] getEncoded() {
        return zzYGU.zzVI(this.data);
    }

    public final void zzWE(byte[] bArr) {
        System.arraycopy(this.data, 0, bArr, 0, 57);
    }
}
