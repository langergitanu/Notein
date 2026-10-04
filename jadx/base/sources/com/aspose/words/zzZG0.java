package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZG0 implements zzZAR {
    private int zzPm;

    public zzZG0(int i) {
        this.zzPm = i;
    }

    @Override // com.aspose.words.zzZAR
    public final void zzY(zzZGA zzzga) {
        if (zzzga.zzZ0q()) {
            return;
        }
        zzzga.setNumberStyle(this.zzPm);
    }

    @Override // com.aspose.words.zzZAR
    public final boolean zzZ(zzZGA zzzga) {
        return !zzzga.zzZ0q() || this.zzPm == zzzga.getNumberStyle();
    }
}
