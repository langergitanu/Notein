package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYTW implements zzYUR {
    private final int zzVZb;
    private final zzYTS zzWiJ;

    public zzYTW(zzYTS zzyts) {
        this.zzWiJ = zzyts;
        this.zzVZb = 128;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final int doFinal(byte[] bArr, int i) throws IllegalStateException, zzYV0 {
        try {
            return this.zzWiJ.doFinal(bArr, 0);
        } catch (zzYUT e) {
            throw new IllegalStateException(e.toString());
        }
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void reset() {
        this.zzWiJ.reset();
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void update(byte b) throws IllegalStateException {
        this.zzWiJ.zzc(b);
    }

    @Override // com.aspose.words.internal.zzYUR
    public final int zzXDn() {
        return this.zzVZb / 8;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final String zzXGi() {
        return this.zzWiJ.zzXCK().zzXGi() + "-GMAC";
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void zzZ(zzYV3 zzyv3) throws IllegalArgumentException {
        if (!(zzyv3 instanceof zzYS4)) {
            throw new IllegalArgumentException("GMAC requires ParametersWithIV");
        }
        zzYS4 zzys4 = (zzYS4) zzyv3;
        byte[] iv = zzys4.getIV();
        this.zzWiJ.zzZ(true, new zzYT3((zzYS8) zzys4.zzXC6(), this.zzVZb, iv));
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void update(byte[] bArr, int i, int i2) throws IllegalStateException, zzYV0 {
        this.zzWiJ.zzq(bArr, i, i2);
    }

    public zzYTW(zzYTS zzyts, int i) {
        this.zzWiJ = zzyts;
        this.zzVZb = i;
    }
}
