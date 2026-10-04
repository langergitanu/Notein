package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYTU {
    private byte[] zzVZ2;
    private byte[] zzVZ3;
    private zzYV8 zzW67;
    private byte[] zzWg5;
    private int zzZNm = 1;

    public zzYTU(zzYV8 zzyv8, int i) {
        this.zzW67 = zzyv8;
        this.zzWg5 = new byte[zzyv8.getBlockSize()];
        this.zzVZ3 = new byte[zzyv8.getBlockSize()];
        this.zzVZ2 = new byte[zzyv8.getBlockSize()];
    }

    public final int getBlockSize() {
        return this.zzZNm;
    }

    public final void reset() {
        byte[] bArr = this.zzWg5;
        System.arraycopy(bArr, 0, this.zzVZ3, 0, bArr.length);
        this.zzW67.reset();
    }

    public final int zzW(byte[] bArr, int i, byte[] bArr2) throws IllegalStateException, zzYV0 {
        int i2 = this.zzZNm;
        if (i + i2 > bArr.length) {
            throw new zzYV0("input buffer too short");
        }
        if (i2 > bArr2.length) {
            throw new zzYV0("output buffer too short");
        }
        this.zzW67.zzY(this.zzVZ3, 0, this.zzVZ2, 0);
        int i3 = 0;
        while (true) {
            int i4 = this.zzZNm;
            if (i3 >= i4) {
                byte[] bArr3 = this.zzVZ3;
                System.arraycopy(bArr3, i4, bArr3, 0, bArr3.length - i4);
                byte[] bArr4 = this.zzVZ3;
                int length = bArr4.length;
                int i5 = this.zzZNm;
                System.arraycopy(bArr2, 0, bArr4, length - i5, i5);
                return this.zzZNm;
            }
            bArr2[i3] = (byte) (this.zzVZ2[i3] ^ bArr[i + i3]);
            i3++;
        }
    }

    public final void zzWc(byte[] bArr) {
        this.zzW67.zzY(this.zzVZ3, 0, bArr, 0);
    }

    public final String zzXGi() {
        return this.zzW67.zzXGi() + "/CFB" + (this.zzZNm * 8);
    }

    public final void zzZ(zzYV3 zzyv3) throws IllegalArgumentException {
        if (!(zzyv3 instanceof zzYS4)) {
            reset();
            this.zzW67.zzZ(true, zzyv3);
            return;
        }
        zzYS4 zzys4 = (zzYS4) zzyv3;
        byte[] iv = zzys4.getIV();
        int length = iv.length;
        byte[] bArr = this.zzWg5;
        if (length < bArr.length) {
            System.arraycopy(iv, 0, bArr, bArr.length - iv.length, iv.length);
        } else {
            System.arraycopy(iv, 0, bArr, 0, bArr.length);
        }
        reset();
        this.zzW67.zzZ(true, zzys4.zzXC6());
    }
}
