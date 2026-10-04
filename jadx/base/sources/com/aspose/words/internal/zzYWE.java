package com.aspose.words.internal;

import com.aspose.slides.PatternStyle;
import com.aspose.words.internal.zzZ0P;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYWE implements zzYUC {
    private static final byte[] zzW8h = {74, -35, -94, PatternStyle.Weave, 121, -24, 33, 5};

    /* JADX INFO: renamed from: iv */
    private byte[] f51271iv;
    private SecureRandom zzW3P;
    private zzYV3 zzW3Q;
    private boolean zzW8i;
    private zzYS4 zzW8j;
    private zzYTR zzW8l;
    zzYUX zzW8g = zzYW6.zzZ(zzZ0P.zzZ.zzWdL);
    byte[] zzWqQ = new byte[20];

    private byte[] zzWG(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.zzW8g.update(bArr, 0, bArr.length);
        this.zzW8g.doFinal(this.zzWqQ, 0);
        System.arraycopy(this.zzWqQ, 0, bArr2, 0, 8);
        return bArr2;
    }

    private boolean zzz(byte[] bArr, byte[] bArr2) {
        return zzYGU.zzo(zzWG(bArr), bArr2);
    }

    @Override // com.aspose.words.internal.zzYUC
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        this.zzW8i = z;
        this.zzW8l = new zzYTR(new zzYWG());
        if (zzyv3 instanceof zzYS3) {
            zzYS3 zzys3 = (zzYS3) zzyv3;
            this.zzW3P = zzys3.zzXCJ();
            zzyv3 = zzys3.zzXC6();
        } else if (z) {
            throw new IllegalArgumentException("No random provided where one required.");
        }
        if (zzyv3 instanceof zzYS4) {
            zzYS4 zzys4 = (zzYS4) zzyv3;
            this.zzW8j = zzys4;
            this.f51271iv = zzys4.getIV();
            this.zzW3Q = this.zzW8j.zzXC6();
            if (!this.zzW8i) {
                throw new IllegalArgumentException("You should not supply an IV for unwrapping");
            }
            byte[] bArr = this.f51271iv;
            if (bArr == null || bArr.length != 8) {
                throw new IllegalArgumentException("IV is not 8 octets");
            }
            return;
        }
        this.zzW3Q = zzyv3;
        if (this.zzW8i) {
            byte[] bArr2 = new byte[8];
            this.f51271iv = bArr2;
            SecureRandom secureRandom = this.zzW3P;
            if (secureRandom == null) {
                throw new IllegalArgumentException("No SecureRandom provided when one required");
            }
            secureRandom.nextBytes(bArr2);
            this.zzW8j = new zzYS4(this.zzW3Q, this.f51271iv);
        }
    }

    @Override // com.aspose.words.internal.zzYUC
    public final byte[] zzu(byte[] bArr, int i, int i2) throws zzYUT {
        if (this.zzW8i) {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (bArr == null) {
            throw new zzYUT("Null pointer as ciphertext");
        }
        if (i2 % this.zzW8l.getBlockSize() != 0) {
            throw new zzYUT("Ciphertext not multiple of " + this.zzW8l.getBlockSize());
        }
        this.zzW8l.zzZ(false, new zzYS4(this.zzW3Q, zzW8h));
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        for (int i3 = 0; i3 < i2 / this.zzW8l.getBlockSize(); i3++) {
            int blockSize = this.zzW8l.getBlockSize() * i3;
            this.zzW8l.zzY(bArr2, blockSize, bArr2, blockSize);
        }
        byte[] bArr3 = new byte[i2];
        int i4 = 0;
        while (i4 < i2) {
            int i5 = i4 + 1;
            bArr3[i4] = bArr2[i2 - i5];
            i4 = i5;
        }
        byte[] bArr4 = new byte[8];
        this.f51271iv = bArr4;
        int i6 = i2 - 8;
        byte[] bArr5 = new byte[i6];
        System.arraycopy(bArr3, 0, bArr4, 0, 8);
        System.arraycopy(bArr3, 8, bArr5, 0, i6);
        zzYS4 zzys4 = new zzYS4(this.zzW3Q, this.f51271iv);
        this.zzW8j = zzys4;
        this.zzW8l.zzZ(false, zzys4);
        byte[] bArr6 = new byte[i6];
        System.arraycopy(bArr5, 0, bArr6, 0, i6);
        for (int i7 = 0; i7 < i6 / this.zzW8l.getBlockSize(); i7++) {
            int blockSize2 = this.zzW8l.getBlockSize() * i7;
            this.zzW8l.zzY(bArr6, blockSize2, bArr6, blockSize2);
        }
        int i8 = i2 - 16;
        byte[] bArr7 = new byte[i8];
        byte[] bArr8 = new byte[8];
        System.arraycopy(bArr6, 0, bArr7, 0, i8);
        System.arraycopy(bArr6, i8, bArr8, 0, 8);
        if (!zzz(bArr7, bArr8)) {
            throw new zzYUT("Checksum inside ciphertext is corrupted");
        }
        int i9 = bArr7[0];
        if (i8 - ((i9 & 255) + 1) <= 7) {
            byte[] bArr9 = new byte[i9];
            System.arraycopy(bArr7, 1, bArr9, 0, i9);
            return bArr9;
        }
        throw new zzYUT("too many pad bytes (" + (i8 - ((bArr7[0] & 255) + 1)) + ")");
    }

    @Override // com.aspose.words.internal.zzYUC
    public final byte[] zzv(byte[] bArr, int i, int i2) {
        if (!this.zzW8i) {
            throw new IllegalStateException("Not initialized for wrapping");
        }
        int i3 = i2 + 1;
        int i4 = i3 % 8;
        int i5 = i4 != 0 ? (8 - i4) + i3 : i3;
        byte[] bArr2 = new byte[i5];
        bArr2[0] = (byte) i2;
        System.arraycopy(bArr, 0, bArr2, 1, i2);
        int i6 = (i5 - i2) - 1;
        byte[] bArr3 = new byte[i6];
        if (i6 > 0) {
            this.zzW3P.nextBytes(bArr3);
            System.arraycopy(bArr3, 0, bArr2, i3, i6);
        }
        byte[] bArrZzWG = zzWG(bArr2);
        int i7 = i5 + 8;
        byte[] bArr4 = new byte[i7];
        System.arraycopy(bArr2, 0, bArr4, 0, i5);
        System.arraycopy(bArrZzWG, 0, bArr4, i5, 8);
        byte[] bArr5 = new byte[i7];
        System.arraycopy(bArr4, 0, bArr5, 0, i7);
        int blockSize = i7 / this.zzW8l.getBlockSize();
        if (i7 % this.zzW8l.getBlockSize() != 0) {
            throw new IllegalStateException("Not multiple of block length");
        }
        this.zzW8l.zzZ(true, this.zzW8j);
        for (int i8 = 0; i8 < blockSize; i8++) {
            int blockSize2 = this.zzW8l.getBlockSize() * i8;
            this.zzW8l.zzY(bArr5, blockSize2, bArr5, blockSize2);
        }
        byte[] bArr6 = this.f51271iv;
        int length = bArr6.length + i7;
        byte[] bArr7 = new byte[length];
        System.arraycopy(bArr6, 0, bArr7, 0, bArr6.length);
        System.arraycopy(bArr5, 0, bArr7, this.f51271iv.length, i7);
        byte[] bArr8 = new byte[length];
        int i9 = 0;
        while (i9 < length) {
            int i10 = i9 + 1;
            bArr8[i9] = bArr7[length - i10];
            i9 = i10;
        }
        this.zzW8l.zzZ(true, new zzYS4(this.zzW3Q, zzW8h));
        for (int i11 = 0; i11 < blockSize + 1; i11++) {
            int blockSize3 = this.zzW8l.getBlockSize() * i11;
            this.zzW8l.zzY(bArr8, blockSize3, bArr8, blockSize3);
        }
        return bArr8;
    }
}
