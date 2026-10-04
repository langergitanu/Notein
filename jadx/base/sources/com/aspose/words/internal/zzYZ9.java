package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYZ9 implements zzYUE {
    private byte[] zzWaZ = null;

    /* JADX INFO: renamed from: x */
    private int f51284x = 0;

    /* JADX INFO: renamed from: y */
    private int f51285y = 0;
    private byte[] zzWaY = null;

    private void zzWK(byte[] bArr) {
        this.zzWaY = bArr;
        this.f51284x = 0;
        this.f51285y = 0;
        if (this.zzWaZ == null) {
            this.zzWaZ = new byte[256];
        }
        for (int i = 0; i < 256; i++) {
            this.zzWaZ[i] = (byte) i;
        }
        int length = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            int i4 = bArr[length] & 255;
            byte[] bArr2 = this.zzWaZ;
            byte b = bArr2[i3];
            i2 = (i4 + b + i2) & 255;
            bArr2[i3] = bArr2[i2];
            bArr2[i2] = b;
            length = (length + 1) % bArr.length;
        }
    }

    @Override // com.aspose.words.internal.zzYUE, com.aspose.words.internal.zzYV8
    public final void reset() {
        zzWK(this.zzWaY);
    }

    @Override // com.aspose.words.internal.zzYUE, com.aspose.words.internal.zzYV8
    public final String zzXGi() {
        return "RC4";
    }

    @Override // com.aspose.words.internal.zzYUE
    public final int zzY(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i + i2 > bArr.length) {
            throw new zzYV0("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new zzYUO("output buffer too short");
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = (this.f51284x + 1) & 255;
            this.f51284x = i5;
            byte[] bArr3 = this.zzWaZ;
            byte b = bArr3[i5];
            int i6 = (this.f51285y + b) & 255;
            this.f51285y = i6;
            bArr3[i5] = bArr3[i6];
            bArr3[i6] = b;
            bArr2[i4 + i3] = (byte) (bArr3[(bArr3[i5] + b) & 255] ^ bArr[i4 + i]);
        }
        return i2;
    }

    @Override // com.aspose.words.internal.zzYUE, com.aspose.words.internal.zzYV8
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        if (!(zzyv3 instanceof zzYS8)) {
            throw new IllegalArgumentException("invalid parameter passed to RC4 init - ".concat(zzyv3.getClass().getName()));
        }
        byte[] key = ((zzYS8) zzyv3).getKey();
        this.zzWaY = key;
        zzWK(key);
    }

    @Override // com.aspose.words.internal.zzYUE
    public final byte zze(byte b) {
        int i = (this.f51284x + 1) & 255;
        this.f51284x = i;
        byte[] bArr = this.zzWaZ;
        byte b2 = bArr[i];
        int i2 = (this.f51285y + b2) & 255;
        this.f51285y = i2;
        bArr[i] = bArr[i2];
        bArr[i2] = b2;
        return (byte) (b ^ bArr[(bArr[i] + b2) & 255]);
    }
}
