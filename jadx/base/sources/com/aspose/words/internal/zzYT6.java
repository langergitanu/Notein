package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYT6 extends zzYV5 {
    zzYTA zzW5i;

    public zzYT6(zzYV8 zzyv8, zzYTA zzyta) {
        this.zzW67 = zzyv8;
        this.zzW5i = zzyta;
        this.buf = new byte[zzyv8.getBlockSize()];
        this.zzW6m = 0;
    }

    @Override // com.aspose.words.internal.zzYV5
    public final int getOutputSize(int i) {
        int length;
        int i2 = i + this.zzW6m;
        byte[] bArr = this.buf;
        int length2 = i2 % bArr.length;
        if (length2 != 0) {
            i2 -= length2;
            length = bArr.length;
        } else {
            if (!this.zzWkw) {
                return i2;
            }
            length = bArr.length;
        }
        return i2 + length;
    }

    @Override // com.aspose.words.internal.zzYV5
    public final int zzY(byte[] bArr, int i, int i2, byte[] bArr2) throws IllegalStateException, zzYV0 {
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = getBlockSize();
        int iZzfY = zzfY(i2);
        if (iZzfY > 0 && iZzfY > bArr2.length) {
            throw new zzYUO("output buffer too short");
        }
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i3 = this.zzW6m;
        int i4 = length - i3;
        int iZzY = 0;
        if (i2 > i4) {
            System.arraycopy(bArr, i, bArr3, i3, i4);
            int iZzY2 = this.zzW67.zzY(this.buf, 0, bArr2, 0);
            this.zzW6m = 0;
            i2 -= i4;
            i += i4;
            iZzY = iZzY2;
            while (i2 > this.buf.length) {
                iZzY += this.zzW67.zzY(bArr, i, bArr2, iZzY);
                i2 -= blockSize;
                i += blockSize;
            }
        }
        System.arraycopy(bArr, i, this.buf, this.zzW6m, i2);
        this.zzW6m += i2;
        return iZzY;
    }

    @Override // com.aspose.words.internal.zzYV5
    public final void zzZ(boolean z, zzYV3 zzyv3) throws IllegalArgumentException {
        this.zzWkw = z;
        reset();
        if (zzyv3 instanceof zzYS3) {
            zzYS3 zzys3 = (zzYS3) zzyv3;
            this.zzW5i.init(zzys3.zzXCJ());
            this.zzW67.zzZ(z, zzys3.zzXC6());
        } else {
            if (z) {
                this.zzW5i.init(null);
            }
            this.zzW67.zzZ(z, zzyv3);
        }
    }

    @Override // com.aspose.words.internal.zzYV5
    public final int zzfY(int i) {
        int i2 = i + this.zzW6m;
        byte[] bArr = this.buf;
        int length = i2 % bArr.length;
        return length == 0 ? Math.max(0, i2 - bArr.length) : i2 - length;
    }

    @Override // com.aspose.words.internal.zzYV5
    public final int zzo(byte[] bArr) throws IllegalStateException, zzYV0, zzYUT {
        int iZzY;
        int blockSize = this.zzW67.getBlockSize();
        if (this.zzWkw) {
            if (this.zzW6m != blockSize) {
                iZzY = 0;
            } else {
                if (blockSize * 2 > bArr.length) {
                    reset();
                    throw new zzYUO("output buffer too short");
                }
                iZzY = this.zzW67.zzY(this.buf, 0, bArr, 0);
                this.zzW6m = 0;
            }
            this.zzW5i.zzZV(this.buf, this.zzW6m);
            return this.zzW67.zzY(this.buf, 0, bArr, iZzY) + iZzY;
        }
        if (this.zzW6m != blockSize) {
            reset();
            throw new zzYV0("last block incomplete in decryption");
        }
        zzYV8 zzyv8 = this.zzW67;
        byte[] bArr2 = this.buf;
        int iZzY2 = zzyv8.zzY(bArr2, 0, bArr2, 0);
        this.zzW6m = 0;
        try {
            int iZzW5 = iZzY2 - this.zzW5i.zzW5(this.buf);
            System.arraycopy(this.buf, 0, bArr, 0, iZzW5);
            return iZzW5;
        } finally {
            reset();
        }
    }
}
