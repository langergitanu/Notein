package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYU0 implements zzYUR {
    private final zzYTS zzVZh;
    private final int zzWiH;

    public zzYU0(zzYTS zzyts, int i) {
        this.zzVZh = zzyts;
        this.zzWiH = i;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final int doFinal(byte[] bArr, int i) throws IllegalStateException, zzYV0 {
        try {
            return this.zzVZh.doFinal(bArr, 0);
        } catch (zzYUT e) {
            throw new IllegalStateException("Unable to create MAC tag:" + e.getMessage(), e);
        }
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void reset() {
        this.zzVZh.reset();
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void update(byte b) throws IllegalStateException {
        this.zzVZh.zzc(b);
    }

    @Override // com.aspose.words.internal.zzYUR
    public final int zzXDn() {
        return (this.zzWiH + 7) / 8;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final String zzXGi() {
        return this.zzVZh.zzXGi() + "MAC";
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void zzZ(zzYV3 zzyv3) throws IllegalArgumentException {
        if (!(zzyv3 instanceof zzYS4)) {
            throw new IllegalArgumentException("AEAD cipher based MAC needs nonce/IV");
        }
        zzYS4 zzys4 = (zzYS4) zzyv3;
        this.zzVZh.zzZ(true, new zzYT3((zzYS8) zzys4.zzXC6(), this.zzWiH, zzys4.getIV()));
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void update(byte[] bArr, int i, int i2) throws IllegalStateException, zzYV0 {
        this.zzVZh.zzq(bArr, i, i2);
    }
}
