package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYYO extends zzYZ0 {
    @Override // com.aspose.words.internal.zzYZ0
    public final byte[] zzXG8() {
        byte[] bArr = new byte[8];
        do {
            this.zzWk5.nextBytes(bArr);
            zzYT0.zzW0(bArr);
        } while (zzYT0.zzZT(bArr, 0));
        return bArr;
    }

    @Override // com.aspose.words.internal.zzYZ0
    public final void zzZ(zzYUS zzyus) {
        super.zzZ(zzyus);
        int i = this.zzWk4;
        if (i == 0 || i == 7) {
            this.zzWk4 = 8;
        } else if (i != 8) {
            throw new IllegalArgumentException("DES key must be 64 bits long.");
        }
    }
}
