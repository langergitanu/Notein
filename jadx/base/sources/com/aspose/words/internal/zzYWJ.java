package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYWJ extends zzYZ0 {
    private static byte[] zzWl(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        bArr[3] = (byte) (bArr[3] & 15);
        bArr[7] = (byte) (bArr[7] & 15);
        bArr[11] = (byte) (bArr[11] & 15);
        bArr[15] = (byte) (bArr[15] & 15);
        bArr[4] = (byte) (bArr[4] & (-4));
        bArr[8] = (byte) (bArr[8] & (-4));
        bArr[12] = (byte) (bArr[12] & (-4));
        return bArr;
    }

    @Override // com.aspose.words.internal.zzYZ0
    public final byte[] zzXG8() {
        byte[] bArrZzXG8 = super.zzXG8();
        zzWl(bArrZzXG8);
        return bArrZzXG8;
    }

    @Override // com.aspose.words.internal.zzYZ0
    public final void zzZ(zzYUS zzyus) {
        super.zzZ(new zzYUS(zzyus.zzXCJ(), 256));
    }
}
