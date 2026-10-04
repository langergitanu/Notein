package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZG2 implements zzZAR {
    private String zzYuN;

    public zzZG2(String str) {
        this.zzYuN = str;
    }

    @Override // com.aspose.words.zzZAR
    public final void zzY(zzZGA zzzga) {
        if (zzzga.zzZ0t()) {
            return;
        }
        zzzga.setNumberFormat(this.zzYuN);
    }

    @Override // com.aspose.words.zzZAR
    public final boolean zzZ(zzZGA zzzga) {
        return !zzzga.zzZ0t() || com.aspose.words.internal.zzZKN.equals(this.zzYuN, zzzga.getNumberFormat());
    }
}
