package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzYV5 {
    protected byte[] buf;
    protected boolean zzVZA;
    protected boolean zzVZz;
    protected zzYV8 zzW67;
    protected int zzW6m;
    protected boolean zzWkw;

    public zzYV5() {
    }

    public final int getBlockSize() {
        return this.zzW67.getBlockSize();
    }

    public int getOutputSize(int i) {
        return i + this.zzW6m;
    }

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

    public final zzYV8 zzXCK() {
        return this.zzW67;
    }

    public int zzY(byte[] bArr, int i, int i2, byte[] bArr2) throws IllegalStateException, zzYV0 {
        int iZzY;
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
        if (i2 > i4) {
            System.arraycopy(bArr, i, bArr3, i3, i4);
            iZzY = this.zzW67.zzY(this.buf, 0, bArr2, 0);
            this.zzW6m = 0;
            i2 -= i4;
            i += i4;
            while (i2 > this.buf.length) {
                iZzY += this.zzW67.zzY(bArr, i, bArr2, iZzY);
                i2 -= blockSize;
                i += blockSize;
            }
        } else {
            iZzY = 0;
        }
        System.arraycopy(bArr, i, this.buf, this.zzW6m, i2);
        int i5 = this.zzW6m + i2;
        this.zzW6m = i5;
        byte[] bArr4 = this.buf;
        if (i5 != bArr4.length) {
            return iZzY;
        }
        int iZzY2 = this.zzW67.zzY(bArr4, 0, bArr2, iZzY) + iZzY;
        this.zzW6m = 0;
        return iZzY2;
    }

    public void zzZ(boolean z, zzYV3 zzyv3) throws IllegalArgumentException {
        this.zzWkw = z;
        reset();
        this.zzW67.zzZ(z, zzyv3);
    }

    public int zzfY(int i) {
        int i2 = i + this.zzW6m;
        int length = (this.zzVZz && this.zzWkw) ? (i2 % this.buf.length) - (this.zzW67.getBlockSize() + 2) : i2 % this.buf.length;
        return i2 - length;
    }

    public int zzo(byte[] bArr) throws IllegalStateException, zzYV0, zzYUT {
        try {
            int i = this.zzW6m;
            if (i > bArr.length) {
                throw new zzYUO("output buffer too short for doFinal()");
            }
            int i2 = 0;
            if (i != 0) {
                if (!this.zzVZA) {
                    throw new zzYV0("data not block size aligned");
                }
                zzYV8 zzyv8 = this.zzW67;
                byte[] bArr2 = this.buf;
                zzyv8.zzY(bArr2, 0, bArr2, 0);
                int i3 = this.zzW6m;
                this.zzW6m = 0;
                System.arraycopy(this.buf, 0, bArr, 0, i3);
                i2 = i3;
            }
            reset();
            return i2;
        } catch (Throwable th) {
            reset();
            throw th;
        }
    }

    public zzYV5(zzYV8 zzyv8) {
        this.zzW67 = zzyv8;
        this.buf = new byte[zzyv8.getBlockSize()];
        boolean z = false;
        this.zzW6m = 0;
        String strZzXGi = zzyv8.zzXGi();
        int iIndexOf = strZzXGi.indexOf(47) + 1;
        boolean z2 = iIndexOf > 0 && strZzXGi.startsWith("PGP", iIndexOf);
        this.zzVZz = z2;
        if (z2 || (zzyv8 instanceof zzYUE) || (iIndexOf > 0 && strZzXGi.startsWith("OpenPGP", iIndexOf))) {
            z = true;
        }
        this.zzVZA = z;
    }
}
