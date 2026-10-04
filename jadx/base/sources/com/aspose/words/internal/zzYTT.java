package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYTT implements zzYUR {
    private final zzYUR zzVZk;
    private final int zzWdl;

    public zzYTT(zzYUR zzyur, int i) {
        this.zzVZk = zzyur;
        this.zzWdl = i;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final int doFinal(byte[] bArr, int i) throws IllegalStateException, zzYV0 {
        byte[] bArr2 = new byte[this.zzVZk.zzXDn()];
        this.zzVZk.doFinal(bArr2, 0);
        System.arraycopy(bArr2, 0, bArr, 0, this.zzWdl / 8);
        return this.zzWdl / 8;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void reset() {
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void update(byte b) throws IllegalStateException {
        this.zzVZk.update(b);
    }

    @Override // com.aspose.words.internal.zzYUR
    public final int zzXDn() {
        return this.zzWdl / 8;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final String zzXGi() {
        return this.zzVZk.zzXGi();
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void zzZ(zzYV3 zzyv3) throws IllegalArgumentException {
        this.zzVZk.zzZ(zzyv3);
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void update(byte[] bArr, int i, int i2) throws IllegalStateException, zzYV0 {
        this.zzVZk.update(bArr, i, i2);
    }
}
