package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYZM extends zzZ07 {
    public zzYZM() {
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
        zzYGN.zzW(this.zzWbT, bArr, i + 48);
        zzYGN.zzW(this.zzWbS, bArr, i + 56);
        reset();
        return 64;
    }

    @Override // com.aspose.words.internal.zzZ07, com.aspose.words.internal.zzYUX
    public final void reset() {
        super.reset();
        this.zzWbZ = 7640891576956012808L;
        this.zzWbY = -4942790177534073029L;
        this.zzWbX = 4354685564936845355L;
        this.zzWbW = -6534734903238641935L;
        this.zzWbV = 5840696475078001361L;
        this.zzWbU = -7276294671716946913L;
        this.zzWbT = 2270897969802886507L;
        this.zzWbS = 6620516959819538809L;
    }

    @Override // com.aspose.words.internal.zzYUX
    public final int zzQI() {
        return 64;
    }

    @Override // com.aspose.words.internal.zzYGP
    public final zzYGP zzXE2() {
        return new zzYZM(this);
    }

    @Override // com.aspose.words.internal.zzYUX
    public final String zzXGi() {
        return "SHA-512";
    }

    @Override // com.aspose.words.internal.zzYGP
    public final void zzZ(zzYGP zzygp) {
        zzZ((zzZ07) zzygp);
    }

    public zzYZM(zzYZM zzyzm) {
        super(zzyzm);
    }
}
