package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ2K implements zzZ2M {
    private final zzZ2L zzWjW;
    private final zzZ1P zzWjX;
    private zzZ2M zzWk0;
    private final zzZ5G zzWk1;

    public zzZ2K(zzZ1P zzz1p, zzZ5G zzz5g, zzZ2L zzz2l) {
        this.zzWjX = zzz1p;
        this.zzWk1 = new zzZ2O(zzz5g);
        this.zzWjW = zzz2l;
    }

    private void zzXG7() {
        if (this.zzWk0 == null) {
            zzZ2M zzz2mZzZ = this.zzWjW.zzZ(this.zzWk1);
            this.zzWk0 = zzz2mZzZ;
            zzZ1P zzz1p = this.zzWjX;
            zzYZG.zzZ(zzz1p, zzz2mZzZ.zzZ(zzz1p));
        }
    }

    @Override // com.aspose.words.internal.zzZ2M
    public final int zzXGf() {
        int iZzXGf;
        synchronized (this) {
            zzXG7();
            iZzXGf = this.zzWk0.zzXGf();
        }
        return iZzXGf;
    }

    @Override // com.aspose.words.internal.zzZ2M
    public final void zzXa(byte[] bArr) {
        synchronized (this) {
            zzXG7();
            zzZ1P zzz1p = this.zzWjX;
            zzYZG.zzZ(zzz1p, this.zzWk0.zzY(zzz1p));
            this.zzWk0.zzXa(bArr);
        }
    }

    @Override // com.aspose.words.internal.zzZ2M
    public final int zzY(byte[] bArr, byte[] bArr2, boolean z) {
        synchronized (this) {
            try {
                zzXG7();
                if (z) {
                    zzZ1P zzz1p = this.zzWjX;
                    zzYZG.zzZ(zzz1p, this.zzWk0.zzY(zzz1p));
                }
                if (this.zzWk0.zzY(bArr, bArr2, z) >= 0) {
                    return bArr.length;
                }
                zzZ1P zzz1p2 = this.zzWjX;
                zzYZG.zzZ(zzz1p2, this.zzWk0.zzY(zzz1p2));
                this.zzWk0.zzXa(null);
                return this.zzWk0.zzY(bArr, bArr2, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.aspose.words.internal.zzZ2M
    public final zzYZE zzZ(zzZ1P zzz1p) {
        zzYZE zzyzeZzZ;
        synchronized (this) {
            zzXG7();
            zzyzeZzZ = this.zzWk0.zzZ(zzz1p);
        }
        return zzyzeZzZ;
    }

    @Override // com.aspose.words.internal.zzZ2M
    public final zzYZE zzY(zzZ1P zzz1p) {
        zzYZE zzyzeZzY;
        synchronized (this) {
            zzXG7();
            zzyzeZzY = this.zzWk0.zzY(zzz1p);
        }
        return zzyzeZzY;
    }
}
