package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYZO extends zzZ07 {
    public zzYZO() {
    }

    @Override // com.aspose.words.internal.zzYUX
    public final int doFinal(byte[] bArr, int i) {
        finish();
        zzYGN.zzW(this.zzWbZ, bArr, i);
        zzYGN.zzW(this.zzWbY, bArr, i + 8);
        zzYGN.zzW(this.zzWbX, bArr, i + 16);
        zzYGN.zzW(this.zzWbW, bArr, i + 24);
        zzYGN.zzW(this.zzWbV, bArr, i + 32);
        zzYGN.zzW(this.zzWbU, bArr, i + 40);
        reset();
        return 48;
    }

    @Override // com.aspose.words.internal.zzZ07, com.aspose.words.internal.zzYUX
    public final void reset() {
        super.reset();
        this.zzWbZ = -3766243637369397544L;
        this.zzWbY = 7105036623409894663L;
        this.zzWbX = -7973340178411365097L;
        this.zzWbW = 1526699215303891257L;
        this.zzWbV = 7436329637833083697L;
        this.zzWbU = -8163818279084223215L;
        this.zzWbT = -2662702644619276377L;
        this.zzWbS = 5167115440072839076L;
    }

    @Override // com.aspose.words.internal.zzYUX
    public final int zzQI() {
        return 48;
    }

    @Override // com.aspose.words.internal.zzYGP
    public final zzYGP zzXE2() {
        return new zzYZO(this);
    }

    @Override // com.aspose.words.internal.zzYUX
    public final String zzXGi() {
        return "SHA-384";
    }

    @Override // com.aspose.words.internal.zzYGP
    public final void zzZ(zzYGP zzygp) {
        zzZ((zzZ07) zzygp);
    }

    public zzYZO(zzYZO zzyzo) {
        super(zzyzo);
    }
}
