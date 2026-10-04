package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYTY implements zzYUR {
    private byte[] buf;
    private zzYTU zzVZg;
    private zzYTA zzW5i;
    private byte[] zzW6l;
    private int zzW6m;
    private int zzW6n;

    public zzYTY(zzYV8 zzyv8) {
        this(zzyv8, (zzyv8.getBlockSize() * 8) / 2);
    }

    @Override // com.aspose.words.internal.zzYUR
    public final int doFinal(byte[] bArr, int i) {
        int blockSize = this.zzVZg.getBlockSize();
        zzYTA zzyta = this.zzW5i;
        if (zzyta == null) {
            while (true) {
                int i2 = this.zzW6m;
                if (i2 >= blockSize) {
                    break;
                }
                this.buf[i2] = 0;
                this.zzW6m = i2 + 1;
            }
        } else {
            zzyta.zzZV(this.buf, this.zzW6m);
        }
        this.zzVZg.zzW(this.buf, 0, this.zzW6l);
        this.zzVZg.zzWc(this.zzW6l);
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
                this.zzVZg.reset();
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
            this.zzVZg.zzW(bArr, 0, this.zzW6l);
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
        return this.zzVZg.zzXGi();
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void zzZ(zzYV3 zzyv3) {
        reset();
        this.zzVZg.zzZ(zzyv3);
    }

    private zzYTY(zzYV8 zzyv8, int i) {
        this.zzW5i = null;
        if (i % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        this.zzW6l = new byte[zzyv8.getBlockSize()];
        zzYTU zzytu = new zzYTU(zzyv8, 8);
        this.zzVZg = zzytu;
        this.zzW5i = null;
        this.zzW6n = i / 8;
        this.buf = new byte[zzytu.getBlockSize()];
        this.zzW6m = 0;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void update(byte[] bArr, int i, int i2) {
        if (i2 >= 0) {
            int blockSize = this.zzVZg.getBlockSize();
            int i3 = this.zzW6m;
            int i4 = blockSize - i3;
            if (i2 > i4) {
                System.arraycopy(bArr, i, this.buf, i3, i4);
                this.zzVZg.zzW(this.buf, 0, this.zzW6l);
                this.zzW6m = 0;
                i2 -= i4;
                i += i4;
                while (i2 > blockSize) {
                    this.zzVZg.zzW(bArr, i, this.zzW6l);
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
