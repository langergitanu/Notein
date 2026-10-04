package com.aspose.words.internal;

import Oooo0oO.C21036OooOOo0;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYRR extends zzYRQ {
    public zzYRR(zzYV8 zzyv8, boolean z) {
        super(zzyv8, zzYRQ.zzVXu, z);
    }

    @Override // com.aspose.words.internal.zzYRQ, com.aspose.words.internal.zzYUC
    public final /* bridge */ /* synthetic */ void zzZ(boolean z, zzYV3 zzyv3) {
        super.zzZ(z, zzyv3);
    }

    @Override // com.aspose.words.internal.zzYUC
    public final byte[] zzu(byte[] bArr, int i, int i2) throws zzYUT {
        if (this.zzW8i) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int i3 = i2 / 8;
        if (i3 * 8 != i2) {
            throw new zzYUT("unwrap data must be a multiple of 8 bytes");
        }
        int length = this.f51256iv.length + 4;
        byte[] bArr2 = new byte[length];
        int i4 = i2 - length;
        byte[] bArr3 = new byte[i4];
        boolean z = false;
        if (i3 == 2) {
            byte[] bArr4 = new byte[this.zzW4F.getBlockSize()];
            this.zzW4F.zzZ(!this.zzVXt, this.zzW8k);
            this.zzW4F.zzY(bArr, 0, bArr4, 0);
            System.arraycopy(bArr4, 0, bArr2, 0, length);
            System.arraycopy(bArr4, length, bArr3, 0, i4);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, length);
            System.arraycopy(bArr, length, bArr3, 0, i4);
            zzZ(i3, bArr3, bArr2);
        }
        int length2 = this.f51256iv.length;
        byte[] bArr5 = new byte[length2];
        System.arraycopy(bArr2, 0, bArr5, 0, length2);
        int iZzZN = zzYGN.zzZN(bArr2, 4);
        int i5 = ((i3 - 1) * 8) - iZzZN;
        if (!zzYGU.zzo(bArr5, this.f51256iv)) {
            throw new zzYUT("checksum failed");
        }
        if (i5 < 0 || i5 > 7) {
            throw new zzYUT("unwrap data has incorrect padding length");
        }
        byte[] bArr6 = new byte[iZzZN];
        System.arraycopy(bArr3, 0, bArr6, 0, iZzZN);
        for (int i6 = 1; i6 <= i5; i6++) {
            if (bArr3[i4 - i6] != 0) {
                z = true;
            }
        }
        if (z) {
            throw new zzYUT("unwrap data has incorrect padding");
        }
        return bArr6;
    }

    @Override // com.aspose.words.internal.zzYUC
    public final byte[] zzv(byte[] bArr, int i, int i2) {
        if (!this.zzW8i) {
            throw new IllegalStateException("not set for wrapping");
        }
        int i3 = (i2 + 7) / 8;
        byte[] bArr2 = new byte[C21036OooOOo0.OooO00o(i2, this.f51256iv.length, 4, (i3 * 8) - i2)];
        byte[] bArrZzeB = zzYGN.zzeB(i2);
        byte[] bArr3 = this.f51256iv;
        System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        System.arraycopy(bArrZzeB, 0, bArr2, this.f51256iv.length, 4);
        System.arraycopy(bArr, 0, bArr2, this.f51256iv.length + 4, i2);
        if (i3 != 1) {
            return zzS(i3, bArr2);
        }
        this.zzW4F.zzZ(this.zzVXt, this.zzW8k);
        this.zzW4F.zzY(bArr2, 0, bArr2, 0);
        return bArr2;
    }
}
