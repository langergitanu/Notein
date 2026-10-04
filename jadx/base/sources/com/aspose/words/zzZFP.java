package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZFP implements zzZAR {
    private int zzYnm;

    public zzZFP(int i) {
        this.zzYnm = i;
    }

    @Override // com.aspose.words.zzZAR
    public final void zzY(zzZGA zzzga) {
        if (zzzga.zzZ0o()) {
            return;
        }
        zzzga.zzzp(this.zzYnm);
    }

    @Override // com.aspose.words.zzZAR
    public final boolean zzZ(zzZGA zzzga) {
        return !zzzga.zzZ0o() || this.zzYnm == zzzga.zzZ0p();
    }
}
