package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYWD implements zzYUC {
    private SecureRandom zzW3N;
    private zzYS4 zzW3O;
    private boolean zzW8i;
    private zzYTR zzW8l;

    public zzYWD(zzYV8 zzyv8) {
        this.zzW8l = new zzYTR(zzyv8);
    }

    @Override // com.aspose.words.internal.zzYUC
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        this.zzW8i = z;
        if (zzyv3 instanceof zzYS3) {
            zzYS3 zzys3 = (zzYS3) zzyv3;
            this.zzW3N = zzys3.zzXCJ();
            this.zzW3O = (zzYS4) zzys3.zzXC6();
        } else {
            if (z) {
                throw new IllegalArgumentException("No random provided where one required.");
            }
            if (!(zzyv3 instanceof zzYS4)) {
                throw new IllegalArgumentException("RFC3211Wrap requires an IV");
            }
            this.zzW3O = (zzYS4) zzyv3;
        }
    }

    @Override // com.aspose.words.internal.zzYUC
    public final byte[] zzu(byte[] bArr, int i, int i2) throws zzYUT {
        if (this.zzW8i) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int blockSize = this.zzW8l.getBlockSize();
        if (i2 < blockSize * 2) {
            throw new zzYUT("input too short");
        }
        byte[] bArr2 = new byte[i2];
        byte[] bArr3 = new byte[blockSize];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        System.arraycopy(bArr, 0, bArr3, 0, blockSize);
        this.zzW8l.zzZ(false, new zzYS4(this.zzW3O.zzXC6(), bArr3));
        for (int i3 = blockSize; i3 < i2; i3 += blockSize) {
            this.zzW8l.zzY(bArr2, i3, bArr2, i3);
        }
        System.arraycopy(bArr2, i2 - blockSize, bArr3, 0, blockSize);
        this.zzW8l.zzZ(false, new zzYS4(this.zzW3O.zzXC6(), bArr3));
        this.zzW8l.zzY(bArr2, 0, bArr2, 0);
        this.zzW8l.zzZ(false, this.zzW3O);
        for (int i4 = 0; i4 < i2; i4 += blockSize) {
            this.zzW8l.zzY(bArr2, i4, bArr2, i4);
        }
        int i5 = bArr2[0];
        int i6 = i2 - 4;
        boolean z = (i5 & 255) > i6;
        byte[] bArr4 = z ? new byte[i6] : new byte[i5 & 255];
        System.arraycopy(bArr2, 4, bArr4, 0, bArr4.length);
        int i7 = 0;
        int i8 = 0;
        while (i7 != 3) {
            int i9 = i7 + 1;
            i8 |= bArr2[i7 + 4] ^ ((byte) (~bArr2[i9]));
            i7 = i9;
        }
        zzYGU.zzWa(bArr2);
        if (!z && !(i8 != 0)) {
            return bArr4;
        }
        throw new zzYUT("wrapped key corrupted");
    }

    @Override // com.aspose.words.internal.zzYUC
    public final byte[] zzv(byte[] bArr, int i, int i2) {
        if (!this.zzW8i) {
            throw new IllegalStateException("not set for wrapping");
        }
        if (i2 > 255 || i2 < 0) {
            throw new IllegalArgumentException("input must be from 0 to 255 bytes");
        }
        this.zzW8l.zzZ(true, this.zzW3O);
        int blockSize = this.zzW8l.getBlockSize();
        int i3 = i2 + 4;
        int i4 = blockSize * 2;
        if (i3 >= i4) {
            i4 = i3 % blockSize == 0 ? i3 : ((i3 / blockSize) + 1) * blockSize;
        }
        byte[] bArr2 = new byte[i4];
        bArr2[0] = (byte) i2;
        System.arraycopy(bArr, 0, bArr2, 4, i2);
        int i5 = i4 - i3;
        byte[] bArr3 = new byte[i5];
        this.zzW3N.nextBytes(bArr3);
        System.arraycopy(bArr3, 0, bArr2, i3, i5);
        bArr2[1] = (byte) (~bArr2[4]);
        bArr2[2] = (byte) (~bArr2[5]);
        bArr2[3] = (byte) (~bArr2[6]);
        for (int i6 = 0; i6 < i4; i6 += blockSize) {
            this.zzW8l.zzY(bArr2, i6, bArr2, i6);
        }
        for (int i7 = 0; i7 < i4; i7 += blockSize) {
            this.zzW8l.zzY(bArr2, i7, bArr2, i7);
        }
        return bArr2;
    }
}
