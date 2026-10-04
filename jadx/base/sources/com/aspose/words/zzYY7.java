package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYY7 extends zzYY6 {
    private int zzZEe;

    public zzYY7(int i) {
        this.zzZEe = i;
    }

    @Override // com.aspose.words.zzYY6
    public final String getNewValue() {
        return "filepos=" + com.aspose.words.internal.zzJB.zzWA(zzYCD() + zzYCC());
    }

    @Override // com.aspose.words.zzYY6
    public final String zzaH() {
        return "href=\"" + com.aspose.words.internal.zzJB.zzWB(this.zzZEe) + "\"";
    }

    @Override // com.aspose.words.zzYY6
    public final String zzaI() {
        return com.aspose.words.internal.zzJB.zzWB(this.zzZEe);
    }
}
