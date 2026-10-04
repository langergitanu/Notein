package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ2N implements zzZ2M {
    private byte[] zzWjY;
    private final zzZ2M zzWk0;
    private byte[] zzZNn = new byte[0];
    private byte[] zzWjZ = new byte[0];

    public zzZ2N(zzZ2M zzz2m, byte[] bArr) {
        this.zzWk0 = zzz2m;
        this.zzWjY = bArr;
    }

    private static boolean zzE(byte[] bArr, byte[] bArr2) {
        if (bArr.length > bArr2.length) {
            return false;
        }
        for (int i = 0; i != bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    private static int zzfR(int i) {
        if (i < 8) {
            return 8;
        }
        return i;
    }

    @Override // com.aspose.words.internal.zzZ2M
    public final int zzXGf() {
        return this.zzWk0.zzXGf();
    }

    @Override // com.aspose.words.internal.zzZ2M
    public final void zzXa(byte[] bArr) {
        zzZ0L.isReady();
        synchronized (this) {
            this.zzZNn = new byte[0];
            this.zzWjZ = new byte[0];
            this.zzWk0.zzXa(bArr);
        }
    }

    @Override // com.aspose.words.internal.zzZ2M
    public final int zzY(byte[] bArr, byte[] bArr2, boolean z) {
        int iZzY;
        if (zzZ0L.zzXEf()) {
            throw new zzZ14(zzZ0L.zzXEg());
        }
        synchronized (this) {
            try {
                byte[] bArr3 = this.zzZNn;
                if (bArr3.length != bArr.length) {
                    if (bArr3.length < bArr.length) {
                        this.zzZNn = new byte[zzfR(bArr.length)];
                        this.zzWjZ = new byte[zzfR(bArr.length)];
                        byte[] bArr4 = this.zzWjY;
                        if (bArr4 != null) {
                            iZzY = this.zzWk0.zzY(this.zzZNn, bArr4, z);
                            this.zzWjY = null;
                        } else {
                            iZzY = this.zzWk0.zzY(this.zzZNn, null, z);
                        }
                        if (iZzY < 0) {
                            zzZ0L.zzwE("DRBG unable to initialise");
                        }
                    } else if (bArr3.length != 8) {
                        int iZzfR = zzfR(bArr.length);
                        byte[] bArr5 = new byte[iZzfR];
                        byte[] bArr6 = this.zzZNn;
                        System.arraycopy(bArr6, bArr6.length - iZzfR, bArr5, 0, iZzfR);
                        this.zzZNn = bArr5;
                        this.zzWjZ = new byte[zzfR(bArr.length)];
                    }
                }
                int iZzY2 = this.zzWk0.zzY(this.zzWjZ, bArr2, z);
                if (iZzY2 < 0) {
                    return iZzY2;
                }
                if (zzE(this.zzZNn, this.zzWjZ)) {
                    zzZ0L.zzwE("Duplicate block detected in DRBG output");
                }
                System.arraycopy(this.zzWjZ, 0, bArr, 0, bArr.length);
                byte[] bArr7 = this.zzWjZ;
                byte[] bArr8 = this.zzZNn;
                System.arraycopy(bArr7, 0, bArr8, 0, bArr8.length);
                if (zzZ0L.zzXEf()) {
                    throw new zzZ14(zzZ0L.zzXEg());
                }
                return bArr.length;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.aspose.words.internal.zzZ2M
    public final zzYZE zzZ(zzZ1P zzz1p) {
        return this.zzWk0.zzZ(zzz1p);
    }

    @Override // com.aspose.words.internal.zzZ2M
    public final zzYZE zzY(zzZ1P zzz1p) {
        return this.zzWk0.zzY(zzz1p);
    }
}
