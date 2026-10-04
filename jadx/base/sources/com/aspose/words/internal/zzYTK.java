package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYTK extends zzYV5 {
    private final int type;
    private final int zzZNm;

    public zzYTK(int i, zzYV8 zzyv8) {
        this.type = i;
        this.zzW67 = new zzYTR(zzyv8);
        int blockSize = zzyv8.getBlockSize();
        this.zzZNm = blockSize;
        this.buf = new byte[blockSize * 2];
        this.zzW6m = 0;
    }

    @Override // com.aspose.words.internal.zzYV5
    public final int getOutputSize(int i) {
        return i + this.zzW6m;
    }

    @Override // com.aspose.words.internal.zzYV5
    public final int zzY(byte[] bArr, int i, int i2, byte[] bArr2) throws IllegalStateException, zzYV0 {
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = getBlockSize();
        int iZzfY = zzfY(i2);
        if (iZzfY > 0 && iZzfY > bArr2.length) {
            throw new zzYV0("output buffer too short");
        }
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i3 = this.zzW6m;
        int i4 = length - i3;
        int i5 = 0;
        if (i2 > i4) {
            System.arraycopy(bArr, i, bArr3, i3, i4);
            int iZzY = this.zzW67.zzY(this.buf, 0, bArr2, 0);
            byte[] bArr4 = this.buf;
            System.arraycopy(bArr4, blockSize, bArr4, 0, blockSize);
            this.zzW6m = blockSize;
            i2 -= i4;
            i += i4;
            while (i2 > blockSize) {
                System.arraycopy(bArr, i, this.buf, this.zzW6m, blockSize);
                iZzY += this.zzW67.zzY(this.buf, 0, bArr2, iZzY);
                byte[] bArr5 = this.buf;
                System.arraycopy(bArr5, blockSize, bArr5, 0, blockSize);
                i2 -= blockSize;
                i += blockSize;
            }
            i5 = iZzY;
        }
        System.arraycopy(bArr, i, this.buf, this.zzW6m, i2);
        this.zzW6m += i2;
        return i5;
    }

    @Override // com.aspose.words.internal.zzYV5
    public final int zzfY(int i) {
        int i2 = i + this.zzW6m;
        byte[] bArr = this.buf;
        int length = i2 % bArr.length;
        return length == 0 ? i2 - bArr.length : i2 - length;
    }

    @Override // com.aspose.words.internal.zzYV5
    public final int zzo(byte[] bArr) throws IllegalStateException, zzYV0 {
        if (this.zzW6m > bArr.length) {
            throw new zzYV0("output buffer to small in doFinal");
        }
        int blockSize = this.zzW67.getBlockSize();
        int i = this.zzW6m;
        int i2 = i - blockSize;
        byte[] bArr2 = new byte[blockSize];
        if (this.zzWkw) {
            if (i < blockSize) {
                throw new zzYV0("need at least one block of input for NISTCTS");
            }
            if (i > blockSize) {
                byte[] bArr3 = new byte[blockSize];
                int i3 = this.type;
                if (i3 == 2 || i3 == 3) {
                    this.zzW67.zzY(this.buf, 0, bArr2, 0);
                    System.arraycopy(this.buf, blockSize, bArr3, 0, i2);
                    this.zzW67.zzY(bArr3, 0, bArr3, 0);
                    if (this.type == 2 && i2 == blockSize) {
                        System.arraycopy(bArr2, 0, bArr, 0, blockSize);
                        System.arraycopy(bArr3, 0, bArr, blockSize, i2);
                    } else {
                        System.arraycopy(bArr3, 0, bArr, 0, blockSize);
                        System.arraycopy(bArr2, 0, bArr, blockSize, i2);
                    }
                } else {
                    System.arraycopy(this.buf, 0, bArr2, 0, blockSize);
                    this.zzW67.zzY(bArr2, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, 0, i2);
                    System.arraycopy(this.buf, this.zzW6m - i2, bArr3, 0, i2);
                    this.zzW67.zzY(bArr3, 0, bArr3, 0);
                    System.arraycopy(bArr3, 0, bArr, i2, blockSize);
                }
            } else {
                this.zzW67.zzY(this.buf, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, 0, blockSize);
            }
        } else {
            if (i < blockSize) {
                throw new zzYV0("need at least one block of input for CTS");
            }
            byte[] bArr4 = new byte[blockSize];
            if (i > blockSize) {
                int i4 = this.type;
                if (i4 == 3 || (i4 == 2 && (this.buf.length - i) % blockSize != 0)) {
                    zzYV8 zzyv8 = this.zzW67;
                    if (zzyv8 instanceof zzYTR) {
                        ((zzYTR) zzyv8).zzXCK().zzY(this.buf, 0, bArr2, 0);
                    } else {
                        zzyv8.zzY(this.buf, 0, bArr2, 0);
                    }
                    for (int i5 = blockSize; i5 != this.zzW6m; i5++) {
                        int i6 = i5 - blockSize;
                        bArr4[i6] = (byte) (bArr2[i6] ^ this.buf[i5]);
                    }
                    System.arraycopy(this.buf, blockSize, bArr2, 0, i2);
                    this.zzW67.zzY(bArr2, 0, bArr, 0);
                    System.arraycopy(bArr4, 0, bArr, blockSize, i2);
                } else {
                    ((zzYTR) this.zzW67).zzXCK().zzY(this.buf, this.zzW6m - blockSize, bArr4, 0);
                    System.arraycopy(this.buf, 0, bArr2, 0, blockSize);
                    if (i2 != blockSize) {
                        System.arraycopy(bArr4, i2, bArr2, i2, blockSize - i2);
                    }
                    this.zzW67.zzY(bArr2, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, 0, blockSize);
                    for (int i7 = 0; i7 != i2; i7++) {
                        bArr4[i7] = (byte) (bArr4[i7] ^ this.buf[i7]);
                    }
                    System.arraycopy(bArr4, 0, bArr, blockSize, i2);
                }
            } else {
                this.zzW67.zzY(this.buf, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, 0, blockSize);
            }
        }
        int i8 = this.zzW6m;
        reset();
        return i8;
    }
}
