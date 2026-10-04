package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZGM implements zzZAR {
    private int zzYoN;

    public zzZGM(int i) {
        this.zzYoN = i;
    }

    @Override // com.aspose.words.zzZAR
    public final void zzY(zzZGA zzzga) {
        if (zzzga.zzZ0u()) {
            return;
        }
        zzzga.zzzq(this.zzYoN);
    }

    @Override // com.aspose.words.zzZAR
    public final boolean zzZ(zzZGA zzzga) {
        return !zzzga.zzZ0u() || this.zzYoN == zzzga.zzZ0v();
    }
}
