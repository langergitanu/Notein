package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ2F extends zzZ2G implements zzYV8 {
    private static final zzYS8 zzWkE = new zzYS7(new byte[24]);
    private int zzWjy;
    private boolean zzWjz;
    private boolean zzWkw;
    private int[] zzWjC = null;
    private int[] zzWjB = null;
    private int[] zzWjA = null;

    public final void finalize() throws Throwable {
        zzZ(true, (zzYV3) zzWkE);
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int getBlockSize() {
        return 8;
    }

    @Override // com.aspose.words.internal.zzYV8
    public final void reset() {
    }

    @Override // com.aspose.words.internal.zzYV8
    public final String zzXGi() {
        return "DESede";
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int zzY(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.zzWjC;
        if (iArr == null) {
            throw new IllegalStateException("DESede engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new zzYV0("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new zzYUO("output buffer too short");
        }
        byte[] bArr3 = new byte[8];
        if (this.zzWkw) {
            if (iArr == this.zzWjA) {
                if (this.zzWjy >= 1048576) {
                    throw new IllegalStateException("attempt to process more than 1048576 blocks with 2-Key TripleDES");
                }
            } else {
                if (this.zzWjy == 0 && !this.zzWjz) {
                    throw new IllegalStateException("attempt to process too many blocks with 3-Key TripleDES");
                }
                this.zzWjz = false;
            }
            zzZ2G.zzZ(iArr, bArr, i, bArr3, 0);
            zzZ2G.zzZ(this.zzWjB, bArr3, 0, bArr3, 0);
            zzZ2G.zzZ(this.zzWjA, bArr3, 0, bArr2, i2);
        } else {
            zzZ2G.zzZ(this.zzWjA, bArr, i, bArr3, 0);
            zzZ2G.zzZ(this.zzWjB, bArr3, 0, bArr3, 0);
            zzZ2G.zzZ(this.zzWjC, bArr3, 0, bArr2, i2);
        }
        this.zzWjy++;
        return 8;
    }

    @Override // com.aspose.words.internal.zzYV8
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        if (!(zzyv3 instanceof zzYS8)) {
            throw new IllegalArgumentException("invalid parameter passed to DESede init - ".concat(zzyv3.getClass().getName()));
        }
        byte[] key = ((zzYS8) zzyv3).getKey();
        if (key.length != 24 && key.length != 16) {
            throw new IllegalArgumentException("key size must be 16 or 24 bytes.");
        }
        this.zzWkw = z;
        byte[] bArr = new byte[8];
        System.arraycopy(key, 0, bArr, 0, 8);
        this.zzWjC = zzZ2G.zzZ(z, bArr);
        byte[] bArr2 = new byte[8];
        System.arraycopy(key, 8, bArr2, 0, 8);
        this.zzWjB = zzZ2G.zzZ(!z, bArr2);
        if (key.length == 24) {
            byte[] bArr3 = new byte[8];
            System.arraycopy(key, 16, bArr3, 0, 8);
            this.zzWjA = zzZ2G.zzZ(z, bArr3);
        } else {
            this.zzWjA = this.zzWjC;
        }
        this.zzWjy = 0;
        this.zzWjz = true;
    }
}
