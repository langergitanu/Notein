package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYTR implements zzYV8 {
    private byte[] zzVZ0;
    private byte[] zzVZ1;
    private zzYV8 zzW67;
    private boolean zzWap;
    private byte[] zzWg5;
    private int zzZNm;

    public zzYTR(zzYV8 zzyv8) {
        this.zzW67 = zzyv8;
        int blockSize = zzyv8.getBlockSize();
        this.zzZNm = blockSize;
        this.zzWg5 = new byte[blockSize];
        this.zzVZ1 = new byte[blockSize];
        this.zzVZ0 = new byte[blockSize];
    }

    private int zzT(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, zzYV0 {
        int i3 = this.zzZNm;
        if (i + i3 > bArr.length) {
            throw new zzYV0("input buffer too short");
        }
        System.arraycopy(bArr, i, this.zzVZ0, 0, i3);
        int iZzY = this.zzW67.zzY(bArr, i, bArr2, i2);
        for (int i4 = 0; i4 < this.zzZNm; i4++) {
            int i5 = i2 + i4;
            bArr2[i5] = (byte) (bArr2[i5] ^ this.zzVZ1[i4]);
        }
        byte[] bArr3 = this.zzVZ1;
        this.zzVZ1 = this.zzVZ0;
        this.zzVZ0 = bArr3;
        return iZzY;
    }

    private int zzU(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, zzYV0 {
        if (this.zzZNm + i > bArr.length) {
            throw new zzYV0("input buffer too short");
        }
        for (int i3 = 0; i3 < this.zzZNm; i3++) {
            byte[] bArr3 = this.zzVZ1;
            bArr3[i3] = (byte) (bArr3[i3] ^ bArr[i + i3]);
        }
        int iZzY = this.zzW67.zzY(this.zzVZ1, 0, bArr2, i2);
        byte[] bArr4 = this.zzVZ1;
        System.arraycopy(bArr2, i2, bArr4, 0, bArr4.length);
        return iZzY;
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int getBlockSize() {
        return this.zzW67.getBlockSize();
    }

    @Override // com.aspose.words.internal.zzYV8
    public final void reset() {
        byte[] bArr = this.zzWg5;
        System.arraycopy(bArr, 0, this.zzVZ1, 0, bArr.length);
        zzYGU.fill(this.zzVZ0, (byte) 0);
        this.zzW67.reset();
    }

    public final zzYV8 zzXCK() {
        return this.zzW67;
    }

    @Override // com.aspose.words.internal.zzYV8
    public final String zzXGi() {
        return this.zzW67.zzXGi() + "/CBC";
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int zzY(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, zzYV0 {
        return this.zzWap ? zzU(bArr, i, bArr2, i2) : zzT(bArr, i, bArr2, i2);
    }

    @Override // com.aspose.words.internal.zzYV8
    public final void zzZ(boolean z, zzYV3 zzyv3) throws IllegalArgumentException {
        boolean z2 = this.zzWap;
        this.zzWap = z;
        if (!(zzyv3 instanceof zzYS4)) {
            reset();
            if (zzyv3 != null) {
                this.zzW67.zzZ(z, zzyv3);
                return;
            } else {
                if (z2 != z) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                }
                return;
            }
        }
        zzYS4 zzys4 = (zzYS4) zzyv3;
        byte[] iv = zzys4.getIV();
        if (iv.length != this.zzZNm) {
            throw new IllegalArgumentException("initialisation vector must be the same length as block size");
        }
        System.arraycopy(iv, 0, this.zzWg5, 0, iv.length);
        reset();
        if (zzys4.zzXC6() != null) {
            this.zzW67.zzZ(z, zzys4.zzXC6());
        } else if (z2 != z) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
    }
}
