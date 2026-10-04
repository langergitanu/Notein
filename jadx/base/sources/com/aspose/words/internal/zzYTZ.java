package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYTZ implements zzYUR {
    private byte[] buf;
    private zzYTA zzW5i;
    private zzYV8 zzW67;
    private byte[] zzW6l;
    private int zzW6m;
    private int zzW6n;

    public zzYTZ(zzYV8 zzyv8, int i) {
        this(zzyv8, i, null);
    }

    @Override // com.aspose.words.internal.zzYUR
    public final int doFinal(byte[] bArr, int i) {
        int blockSize = this.zzW67.getBlockSize();
        if (this.zzW5i == null) {
            while (true) {
                int i2 = this.zzW6m;
                if (i2 >= blockSize) {
                    break;
                }
                this.buf[i2] = 0;
                this.zzW6m = i2 + 1;
            }
        } else {
            if (this.zzW6m == blockSize) {
                this.zzW67.zzY(this.buf, 0, this.zzW6l, 0);
                this.zzW6m = 0;
            }
            this.zzW5i.zzZV(this.buf, this.zzW6m);
        }
        this.zzW67.zzY(this.buf, 0, this.zzW6l, 0);
        System.arraycopy(this.zzW6l, 0, bArr, 0, this.zzW6n);
        reset();
        return this.zzW6n;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i >= bArr.length) {
                this.zzW6m = 0;
                this.zzW67.reset();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void update(byte b) {
        int i = this.zzW6m;
        byte[] bArr = this.buf;
        if (i == bArr.length) {
            this.zzW67.zzY(bArr, 0, this.zzW6l, 0);
            this.zzW6m = 0;
        }
        byte[] bArr2 = this.buf;
        int i2 = this.zzW6m;
        this.zzW6m = i2 + 1;
        bArr2[i2] = b;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final int zzXDn() {
        return this.zzW6n;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final String zzXGi() {
        return this.zzW67.zzXGi();
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void zzZ(zzYV3 zzyv3) {
        reset();
        this.zzW67.zzZ(true, zzyv3);
    }

    public zzYTZ(zzYV8 zzyv8, int i, zzYTA zzyta) {
        if (i % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        this.zzW67 = new zzYTR(zzyv8);
        this.zzW5i = zzyta;
        this.zzW6n = i / 8;
        this.zzW6l = new byte[zzyv8.getBlockSize()];
        this.buf = new byte[zzyv8.getBlockSize()];
        this.zzW6m = 0;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void update(byte[] bArr, int i, int i2) {
        if (i2 >= 0) {
            int blockSize = this.zzW67.getBlockSize();
            int i3 = this.zzW6m;
            int i4 = blockSize - i3;
            if (i2 > i4) {
                System.arraycopy(bArr, i, this.buf, i3, i4);
                this.zzW67.zzY(this.buf, 0, this.zzW6l, 0);
                this.zzW6m = 0;
                i2 -= i4;
                i += i4;
                while (i2 > blockSize) {
                    this.zzW67.zzY(bArr, i, this.zzW6l, 0);
                    i2 -= blockSize;
                    i += blockSize;
                }
            }
            System.arraycopy(bArr, i, this.buf, this.zzW6m, i2);
            this.zzW6m += i2;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
