package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYTH implements zzYV8 {
    private int count;
    private byte[] zzVYb;
    private byte[] zzVYc;
    private zzYV8 zzW67;
    private byte[] zzWg5;
    private boolean zzWkw;
    private int zzZNm;

    public zzYTH(zzYV8 zzyv8) {
        this.zzW67 = zzyv8;
        int blockSize = zzyv8.getBlockSize();
        this.zzZNm = blockSize;
        this.zzWg5 = new byte[blockSize];
        this.zzVYc = new byte[blockSize];
        this.zzVYb = new byte[blockSize];
    }

    private byte zzT(byte b, int i) {
        return (byte) (b ^ this.zzVYb[i]);
    }

    private int zzU(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, zzYV0 {
        int i3;
        int i4;
        int i5 = this.zzZNm;
        if (i + i5 > bArr.length) {
            throw new zzYV0("input buffer too short");
        }
        if (i2 + i5 > bArr2.length) {
            throw new zzYV0("output buffer too short");
        }
        int i6 = this.count;
        int i7 = 2;
        int i8 = 0;
        if (i6 > i5) {
            byte[] bArr3 = this.zzVYc;
            int i9 = i5 - 2;
            byte bZzT = zzT(bArr[i], i5 - 2);
            bArr2[i2] = bZzT;
            bArr3[i9] = bZzT;
            byte[] bArr4 = this.zzVYc;
            int i10 = this.zzZNm;
            int i11 = i10 - 1;
            byte bZzT2 = zzT(bArr[i + 1], i10 - 1);
            bArr2[i2 + 1] = bZzT2;
            bArr4[i11] = bZzT2;
            this.zzW67.zzY(this.zzVYc, 0, this.zzVYb, 0);
            while (i7 < this.zzZNm) {
                byte[] bArr5 = this.zzVYc;
                int i12 = i7 - 2;
                byte bZzT3 = zzT(bArr[i + i7], i12);
                bArr2[i2 + i7] = bZzT3;
                bArr5[i12] = bZzT3;
                i7++;
            }
        } else if (i6 == 0) {
            this.zzW67.zzY(this.zzVYc, 0, this.zzVYb, 0);
            while (true) {
                i4 = this.zzZNm;
                if (i8 >= i4) {
                    break;
                }
                byte[] bArr6 = this.zzVYc;
                byte bZzT4 = zzT(bArr[i + i8], i8);
                bArr2[i2 + i8] = bZzT4;
                bArr6[i8] = bZzT4;
                i8++;
            }
            this.count += i4;
        } else if (i6 == i5) {
            this.zzW67.zzY(this.zzVYc, 0, this.zzVYb, 0);
            bArr2[i2] = zzT(bArr[i], 0);
            bArr2[i2 + 1] = zzT(bArr[i + 1], 1);
            byte[] bArr7 = this.zzVYc;
            System.arraycopy(bArr7, 2, bArr7, 0, this.zzZNm - 2);
            System.arraycopy(bArr2, i2, this.zzVYc, this.zzZNm - 2, 2);
            this.zzW67.zzY(this.zzVYc, 0, this.zzVYb, 0);
            while (true) {
                i3 = this.zzZNm;
                if (i7 >= i3) {
                    break;
                }
                byte[] bArr8 = this.zzVYc;
                int i13 = i7 - 2;
                byte bZzT5 = zzT(bArr[i + i7], i13);
                bArr2[i2 + i7] = bZzT5;
                bArr8[i13] = bZzT5;
                i7++;
            }
            this.count += i3;
        }
        return this.zzZNm;
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int getBlockSize() {
        return this.zzW67.getBlockSize();
    }

    @Override // com.aspose.words.internal.zzYV8
    public final void reset() {
        this.count = 0;
        byte[] bArr = this.zzWg5;
        byte[] bArr2 = this.zzVYc;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.zzW67.reset();
    }

    @Override // com.aspose.words.internal.zzYV8
    public final String zzXGi() {
        return this.zzW67.zzXGi() + "/OpenPGPCFB";
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int zzY(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, zzYV0 {
        return this.zzWkw ? zzU(bArr, i, bArr2, i2) : zzT(bArr, i, bArr2, i2);
    }

    @Override // com.aspose.words.internal.zzYV8
    public final void zzZ(boolean z, zzYV3 zzyv3) throws IllegalArgumentException {
        this.zzWkw = z;
        reset();
        this.zzW67.zzZ(true, zzyv3);
    }

    private int zzT(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, zzYV0 {
        int i3;
        int i4;
        int i5 = this.zzZNm;
        if (i + i5 > bArr.length) {
            throw new zzYV0("input buffer too short");
        }
        if (i2 + i5 > bArr2.length) {
            throw new zzYV0("output buffer too short");
        }
        int i6 = this.count;
        int i7 = 2;
        int i8 = 0;
        if (i6 > i5) {
            byte b = bArr[i];
            this.zzVYc[i5 - 2] = b;
            bArr2[i2] = zzT(b, i5 - 2);
            byte b2 = bArr[i + 1];
            byte[] bArr3 = this.zzVYc;
            int i9 = this.zzZNm;
            bArr3[i9 - 1] = b2;
            bArr2[i2 + 1] = zzT(b2, i9 - 1);
            this.zzW67.zzY(this.zzVYc, 0, this.zzVYb, 0);
            while (i7 < this.zzZNm) {
                byte b3 = bArr[i + i7];
                int i10 = i7 - 2;
                this.zzVYc[i10] = b3;
                bArr2[i2 + i7] = zzT(b3, i10);
                i7++;
            }
        } else if (i6 == 0) {
            this.zzW67.zzY(this.zzVYc, 0, this.zzVYb, 0);
            while (true) {
                i4 = this.zzZNm;
                if (i8 >= i4) {
                    break;
                }
                int i11 = i + i8;
                this.zzVYc[i8] = bArr[i11];
                bArr2[i8] = zzT(bArr[i11], i8);
                i8++;
            }
            this.count += i4;
        } else if (i6 == i5) {
            this.zzW67.zzY(this.zzVYc, 0, this.zzVYb, 0);
            byte b4 = bArr[i];
            byte b5 = bArr[i + 1];
            bArr2[i2] = zzT(b4, 0);
            bArr2[i2 + 1] = zzT(b5, 1);
            byte[] bArr4 = this.zzVYc;
            System.arraycopy(bArr4, 2, bArr4, 0, this.zzZNm - 2);
            byte[] bArr5 = this.zzVYc;
            int i12 = this.zzZNm;
            bArr5[i12 - 2] = b4;
            bArr5[i12 - 1] = b5;
            this.zzW67.zzY(bArr5, 0, this.zzVYb, 0);
            while (true) {
                i3 = this.zzZNm;
                if (i7 >= i3) {
                    break;
                }
                byte b6 = bArr[i + i7];
                int i13 = i7 - 2;
                this.zzVYc[i13] = b6;
                bArr2[i2 + i7] = zzT(b6, i13);
                i7++;
            }
            this.count += i3;
        }
        return this.zzZNm;
    }
}
