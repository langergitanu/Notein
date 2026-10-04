package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYRQ implements zzYUC {

    /* JADX INFO: renamed from: iv */
    protected final byte[] f51256iv;
    protected final int zzVXs;
    protected final boolean zzVXt;
    protected final zzYV8 zzW4F;
    protected boolean zzW8i;
    protected zzYS8 zzW8k;
    protected static final byte[] zzVXv = {-90, -90, -90, -90, -90, -90, -90, -90};
    protected static final byte[] zzVXu = {-90, 89, 89, -90};

    public zzYRQ(zzYV8 zzyv8, byte[] bArr, boolean z) {
        this.zzW4F = zzyv8;
        this.zzVXt = !z;
        int blockSize = zzyv8.getBlockSize() / 2;
        this.zzVXs = blockSize;
        byte[] bArr2 = new byte[bArr.length <= blockSize ? bArr.length : blockSize];
        this.f51256iv = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
    }

    public final byte[] zzS(int i, byte[] bArr) {
        byte[] bArr2 = new byte[this.zzW4F.getBlockSize()];
        this.zzW4F.zzZ(this.zzVXt, this.zzW8k);
        for (int i2 = 0; i2 != 6; i2++) {
            for (int i3 = 1; i3 <= i; i3++) {
                System.arraycopy(bArr, 0, bArr2, 0, this.zzVXs);
                int i4 = this.zzVXs;
                System.arraycopy(bArr, i4 * i3, bArr2, i4, i4);
                this.zzW4F.zzY(bArr2, 0, bArr2, 0);
                int i5 = (i * i2) + i3;
                int i6 = 1;
                while (i5 != 0) {
                    int i7 = this.zzVXs - i6;
                    bArr2[i7] = (byte) (((byte) i5) ^ bArr2[i7]);
                    i5 >>>= 8;
                    i6++;
                }
                System.arraycopy(bArr2, 0, bArr, 0, this.zzVXs);
                int i8 = this.zzVXs;
                System.arraycopy(bArr2, i8, bArr, i8 * i3, i8);
            }
        }
        return bArr;
    }

    @Override // com.aspose.words.internal.zzYUC
    public void zzZ(boolean z, zzYV3 zzyv3) {
        this.zzW8i = z;
        if (zzyv3 instanceof zzYS8) {
            this.zzW8k = (zzYS8) zzyv3;
            return;
        }
        if (zzyv3 instanceof zzYS4) {
            zzYS4 zzys4 = (zzYS4) zzyv3;
            byte[] iv = zzys4.getIV();
            if (iv.length != this.f51256iv.length) {
                throw new IllegalArgumentException("IV not equal to " + zzVXu.length);
            }
            this.zzW8k = (zzYS8) zzys4.zzXC6();
            byte[] bArr = this.f51256iv;
            System.arraycopy(iv, 0, bArr, 0, bArr.length);
        }
    }

    public final void zzZ(int i, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[this.zzW4F.getBlockSize()];
        this.zzW4F.zzZ(!this.zzVXt, this.zzW8k);
        int i2 = i - 1;
        for (int i3 = 5; i3 >= 0; i3--) {
            for (int i4 = i2; i4 > 0; i4--) {
                System.arraycopy(bArr2, 0, bArr3, 0, this.zzVXs);
                int i5 = this.zzVXs;
                int i6 = i4 - 1;
                System.arraycopy(bArr, i5 * i6, bArr3, i5, i5);
                int i7 = (i2 * i3) + i4;
                int i8 = 1;
                while (i7 != 0) {
                    int i9 = this.zzVXs - i8;
                    bArr3[i9] = (byte) (((byte) i7) ^ bArr3[i9]);
                    i7 >>>= 8;
                    i8++;
                }
                this.zzW4F.zzY(bArr3, 0, bArr3, 0);
                System.arraycopy(bArr3, 0, bArr2, 0, this.zzVXs);
                int i10 = this.zzVXs;
                System.arraycopy(bArr3, i10, bArr, i6 * i10, i10);
            }
        }
    }
}
