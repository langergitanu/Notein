package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZZU {
    private int zzdo;
    private int zzdp;
    private byte[] zzdq = new byte[256];

    private void zzX(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = (this.zzdp + 1) & 255;
            this.zzdp = i5;
            byte[] bArr3 = this.zzdq;
            byte b = bArr3[i5];
            int i6 = ((b & 255) + this.zzdo) & 255;
            this.zzdo = i6;
            bArr3[i5] = bArr3[i6];
            bArr3[i6] = b;
            bArr2[i4] = (byte) ((bArr3[((bArr3[i5] & 255) + (b & 255)) & 255] & 255) ^ (bArr[i4] & 255));
        }
    }

    public final void zzG(byte[] bArr, int i) {
        for (int i2 = 0; i2 < 256; i2++) {
            this.zzdq[i2] = (byte) i2;
        }
        this.zzdp = 0;
        this.zzdo = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < 256; i5++) {
            int i6 = bArr[i3] & 255;
            byte[] bArr2 = this.zzdq;
            byte b = bArr2[i5];
            i4 = (i6 + (b & 255) + i4) & 255;
            bArr2[i5] = bArr2[i4];
            bArr2[i4] = b;
            i3 = (i3 + 1) % i;
        }
    }

    public final void zzH(byte[] bArr, int i) {
        zzX(bArr, 0, i, bArr, 0);
    }

    public final void zzT(byte[] bArr, byte[] bArr2) {
        zzX(bArr, 0, bArr.length, bArr2, 0);
    }

    public final void zzZ9(byte[] bArr) {
        zzX(bArr, 0, bArr.length, bArr, 0);
    }
}
