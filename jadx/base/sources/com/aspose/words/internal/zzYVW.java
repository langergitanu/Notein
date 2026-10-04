package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYVW implements zzYV8 {
    protected int zzW17;
    protected int zzW18;
    protected int zzW19;
    protected int zzW1a;
    protected int[] zzW2K;
    protected boolean zzWap;

    public static int rotateLeft(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    private static int rotateRight(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int getBlockSize() {
        return 16;
    }

    @Override // com.aspose.words.internal.zzYV8
    public final void reset() {
    }

    public abstract void zzV(byte[] bArr, int i, byte[] bArr2, int i2);

    public abstract void zzW(byte[] bArr, int i, byte[] bArr2, int i2);

    public abstract int[] zzWf(byte[] bArr);

    public final void zzXCZ() {
        int iRotateRight = (rotateRight(this.zzW18, 22) ^ this.zzW17) ^ (this.zzW19 << 7);
        int iRotateRight2 = rotateRight(this.zzW1a, 5) ^ this.zzW19;
        int i = this.zzW17;
        int i2 = iRotateRight2 ^ i;
        int iRotateRight3 = rotateRight(i, 7);
        int iRotateRight4 = rotateRight(this.zzW19, 1);
        this.zzW17 = (iRotateRight3 ^ iRotateRight) ^ (i2 << 3);
        this.zzW19 = (iRotateRight4 ^ i2) ^ iRotateRight;
        this.zzW18 = rotateRight(iRotateRight, 3);
        this.zzW1a = rotateRight(i2, 13);
    }

    public final void zzXD0() {
        int iRotateLeft = rotateLeft(this.zzW1a, 13);
        int iRotateLeft2 = rotateLeft(this.zzW18, 3);
        int i = (this.zzW19 ^ iRotateLeft) ^ iRotateLeft2;
        int i2 = (this.zzW17 ^ iRotateLeft2) ^ (iRotateLeft << 3);
        this.zzW19 = rotateLeft(i, 1);
        int iRotateLeft3 = rotateLeft(i2, 7);
        this.zzW17 = iRotateLeft3;
        this.zzW1a = rotateLeft((iRotateLeft ^ this.zzW19) ^ iRotateLeft3, 5);
        this.zzW18 = rotateLeft((this.zzW17 ^ iRotateLeft2) ^ (this.zzW19 << 7), 22);
    }

    @Override // com.aspose.words.internal.zzYV8
    public final String zzXGi() {
        return "Serpent";
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int zzY(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.zzW2K == null) {
            throw new IllegalStateException("Serpent not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new zzYV0("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new zzYUO("output buffer too short");
        }
        if (this.zzWap) {
            zzW(bArr, i, bArr2, i2);
            return 16;
        }
        zzV(bArr, i, bArr2, i2);
        return 16;
    }

    @Override // com.aspose.words.internal.zzYV8
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        if (!(zzyv3 instanceof zzYS8)) {
            throw new IllegalArgumentException("invalid parameter passed to Serpent init - ".concat(zzyv3.getClass().getName()));
        }
        this.zzWap = z;
        this.zzW2K = zzWf(((zzYS8) zzyv3).getKey());
    }

    public final void zze(int i, int i2, int i3, int i4) {
        int i5 = (i & i2) | i3;
        int i6 = (i | i2) & i4;
        int i7 = i5 ^ i6;
        this.zzW17 = i7;
        int i8 = i2 ^ i6;
        int i9 = ((i7 ^ (~i4)) | i8) ^ i;
        this.zzW19 = i9;
        int i10 = (i8 ^ i3) ^ (i4 | i9);
        this.zzW1a = i10;
        this.zzW18 = ((i & i7) ^ i10) ^ (i5 ^ i9);
    }

    public final void zzf(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ i3;
        int i6 = (i3 & i5) ^ i4;
        int i7 = i ^ i6;
        int i8 = i2 ^ ((i4 | i5) & i7);
        this.zzW19 = i8;
        int i9 = (i & i7) ^ i5;
        this.zzW17 = i9;
        int i10 = (i8 | i6) ^ i7;
        int i11 = i6 ^ (i9 & i10);
        this.zzW18 = i11;
        this.zzW1a = (i9 & i11) ^ (~i10);
    }

    public final void zzg(int i, int i2, int i3, int i4) {
        int i5 = ~i;
        int i6 = i ^ i2;
        int i7 = i3 ^ i6;
        int i8 = (i3 | i5) ^ i4;
        this.zzW19 = i7 ^ i8;
        int i9 = i6 ^ (i7 & i8);
        int i10 = i8 ^ (i2 | i9);
        this.zzW17 = i10;
        int i11 = i2 | i10;
        this.zzW1a = i9 ^ i11;
        this.zzW18 = (i4 & i5) ^ (i11 ^ i7);
    }

    public final void zzh(int i, int i2, int i3, int i4) {
        int i5 = ~i;
        int i6 = i ^ i4;
        int i7 = i2 ^ i6;
        int i8 = i3 ^ (i5 | i6);
        int i9 = i2 ^ i8;
        this.zzW19 = i9;
        int i10 = (i6 | i9) ^ i4;
        int i11 = (i8 & i10) ^ i7;
        this.zzW18 = i11;
        int i12 = i10 ^ i8;
        this.zzW1a = i11 ^ i12;
        this.zzW17 = (i12 & i7) ^ (~i8);
    }

    public final void zzi(int i, int i2, int i3, int i4) {
        int i5 = ~i3;
        int i6 = (i2 & i5) ^ i4;
        int i7 = i & i6;
        int i8 = (i2 ^ i5) ^ i7;
        this.zzW17 = i8;
        int i9 = i8 | i2;
        this.zzW19 = i6 ^ (i & i9);
        int i10 = i4 | i;
        this.zzW1a = (i5 ^ i9) ^ i10;
        this.zzW18 = ((i ^ i3) | i7) ^ (i2 & i10);
    }

    public final void zzj(int i, int i2, int i3, int i4) {
        int i5 = ~i;
        int i6 = i ^ i2;
        int i7 = i ^ i4;
        int i8 = (i3 ^ i5) ^ (i6 | i7);
        this.zzW1a = i8;
        int i9 = i4 & i8;
        int i10 = (i6 ^ i8) ^ i9;
        this.zzW19 = i10;
        int i11 = i7 ^ (i8 | i5);
        this.zzW18 = (i6 | i9) ^ i11;
        this.zzW17 = (i11 & i10) ^ (i2 ^ i9);
    }

    public final void zzk(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ ((i3 | i4) & i);
        int i6 = i3 ^ (i & i5);
        int i7 = i4 ^ i6;
        this.zzW19 = i7;
        int i8 = ~i;
        int i9 = (i6 & i7) ^ i5;
        this.zzW17 = i9;
        int i10 = i4 ^ (i7 | i8);
        this.zzW1a = i9 ^ i10;
        this.zzW18 = (i8 ^ i7) ^ (i5 & i10);
    }

    public final void zzl(int i, int i2, int i3, int i4) {
        int i5 = i ^ i4;
        int i6 = i3 ^ (i4 & i5);
        int i7 = i2 | i6;
        this.zzW17 = i5 ^ i7;
        int i8 = ~i2;
        int i9 = (i5 | i8) ^ i6;
        this.zzW1a = i9;
        int i10 = i8 ^ i5;
        int i11 = (i7 & i10) ^ (i9 & i);
        this.zzW18 = i11;
        this.zzW19 = (i ^ i6) ^ (i10 & i11);
    }

    public final void zzm(int i, int i2, int i3, int i4) {
        int i5 = i | i2;
        int i6 = i2 ^ i3;
        int i7 = i ^ (i2 & i6);
        int i8 = i3 ^ i7;
        int i9 = i4 | i7;
        int i10 = i6 ^ i9;
        this.zzW1a = i10;
        int i11 = (i9 | i6) ^ i4;
        this.zzW18 = i8 ^ i11;
        int i12 = i5 ^ i11;
        int i13 = i7 ^ (i10 & i12);
        this.zzW17 = i13;
        this.zzW19 = i13 ^ (i12 ^ i10);
    }

    public final void zzn(int i, int i2, int i3, int i4) {
        int i5 = i ^ i2;
        int i6 = i & i3;
        int i7 = i | i4;
        int i8 = i3 ^ i4;
        int i9 = i6 | (i5 & i7);
        int i10 = i8 ^ i9;
        this.zzW18 = i10;
        int i11 = (i7 ^ i2) ^ i9;
        int i12 = i5 ^ (i8 & i11);
        this.zzW1a = i12;
        int i13 = i12 & i10;
        this.zzW19 = i11 ^ i13;
        this.zzW17 = (i2 | i4) ^ (i8 ^ i13);
    }

    public final void zzo(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ i4;
        int i6 = ~i5;
        int i7 = i ^ i3;
        int i8 = i3 ^ i5;
        int i9 = (i2 & i8) ^ i7;
        this.zzW1a = i9;
        int i10 = (((i | i6) ^ i4) | i7) ^ i5;
        this.zzW17 = i10;
        int i11 = ~i8;
        int i12 = i10 | i9;
        this.zzW19 = i11 ^ i12;
        this.zzW18 = (i12 ^ i7) ^ (i4 & i11);
    }

    public final void zzp(int i, int i2, int i3, int i4) {
        int i5 = ~i;
        int i6 = i2 ^ i4;
        int i7 = (i3 & i5) ^ i6;
        this.zzW1a = i7;
        int i8 = i3 ^ i5;
        int i9 = i2 & (i3 ^ i7);
        int i10 = i8 ^ i9;
        this.zzW17 = i10;
        int i11 = i ^ ((i9 | i4) & (i7 | i8));
        this.zzW18 = i11;
        this.zzW19 = (i11 ^ (i4 | i5)) ^ (i6 ^ i10);
    }

    public final void zzq(int i, int i2, int i3, int i4) {
        int i5 = i4 ^ i2;
        int i6 = i ^ (i2 & i5);
        int i7 = i5 ^ i6;
        int i8 = i3 ^ i7;
        this.zzW17 = i8;
        int i9 = i2 ^ (i5 & i6);
        int i10 = i6 ^ (i8 | i9);
        this.zzW19 = i10;
        int i11 = ~i10;
        int i12 = i9 ^ i8;
        this.zzW1a = i11 ^ i12;
        this.zzW18 = (i11 | i12) ^ i7;
    }

    public final void zzr(int i, int i2, int i3, int i4) {
        int i5 = (~i) ^ i2;
        int i6 = (i | i5) ^ i3;
        int i7 = i4 ^ i6;
        this.zzW18 = i7;
        int i8 = i2 ^ (i4 | i5);
        int i9 = i7 ^ i5;
        int i10 = (i6 & i8) ^ i9;
        this.zzW17 = i10;
        int i11 = i8 ^ i6;
        this.zzW19 = i10 ^ i11;
        this.zzW1a = i6 ^ (i11 & i9);
    }

    public final void zzs(int i, int i2, int i3, int i4) {
        int i5 = ~i;
        int i6 = i2 ^ i;
        int i7 = (i5 | i6) ^ i4;
        int i8 = i3 ^ i7;
        int i9 = i6 ^ i8;
        this.zzW18 = i9;
        int i10 = (i6 & i4) ^ i5;
        int i11 = (i9 & i10) ^ i7;
        this.zzW19 = i11;
        int i12 = (i & i7) ^ (i11 | i8);
        this.zzW17 = i12;
        this.zzW1a = i12 ^ (i10 ^ i8);
    }

    public final void zzt(int i, int i2, int i3, int i4) {
        int i5 = i ^ i4;
        int i6 = i3 ^ i5;
        int i7 = i2 ^ i6;
        int i8 = (i4 & i) ^ i7;
        this.zzW17 = i8;
        int i9 = i ^ (i2 & i5);
        this.zzW18 = (i3 | i9) ^ i7;
        int i10 = (i6 ^ i9) & i8;
        this.zzW19 = (~i6) ^ i10;
        this.zzW1a = (~i9) ^ i10;
    }
}
