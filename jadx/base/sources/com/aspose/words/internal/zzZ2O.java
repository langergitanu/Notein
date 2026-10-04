package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ2O implements zzZ5G {
    private byte[] buf;
    private final zzZ5G zzWk1;

    public zzZ2O(zzZ5G zzz5g) {
        this.zzWk1 = zzz5g;
    }

    @Override // com.aspose.words.internal.zzZ5G
    public final int zzXGW() {
        return this.zzWk1.zzXGW();
    }

    @Override // com.aspose.words.internal.zzZ5G
    public final byte[] zzXGX() {
        byte[] bArrZzXGX;
        synchronized (this) {
            try {
                if (this.buf == null) {
                    this.buf = this.zzWk1.zzXGX();
                }
                bArrZzXGX = this.zzWk1.zzXGX();
                if (zzYGU.zzp(bArrZzXGX, this.buf)) {
                    zzZ0L.zzwE("Duplicate block detected in EntropySource output");
                }
                byte[] bArr = this.buf;
                System.arraycopy(bArrZzXGX, 0, bArr, 0, bArr.length);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrZzXGX;
    }
}
