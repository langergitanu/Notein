package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZG5 implements zzZAR {
    private int zzYnN;

    public zzZG5(int i) {
        this.zzYnN = i;
    }

    @Override // com.aspose.words.zzZAR
    public final void zzY(zzZGA zzzga) {
        if (zzzga.zzZ0r()) {
            return;
        }
        zzzga.zzze(this.zzYnN);
    }

    @Override // com.aspose.words.zzZAR
    public final boolean zzZ(zzZGA zzzga) {
        return !zzzga.zzZ0r() || this.zzYnN == zzzga.zzZ0s() + 1;
    }
}
