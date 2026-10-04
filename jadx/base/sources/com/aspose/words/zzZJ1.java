package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJ1 implements zzZAR {
    private int zzYrG;

    public zzZJ1(int i) {
        this.zzYrG = i;
    }

    @Override // com.aspose.words.zzZAR
    public final void zzY(zzZGA zzzga) {
        if (zzzga.zzZ0r()) {
            return;
        }
        zzzga.zzze(this.zzYrG);
    }

    @Override // com.aspose.words.zzZAR
    public final boolean zzZ(zzZGA zzzga) {
        return !zzzga.zzZ0r() || this.zzYrG == zzzga.zzZ0s();
    }
}
