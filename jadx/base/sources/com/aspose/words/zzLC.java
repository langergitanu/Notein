package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzLC extends zzLG {
    private boolean zzZnw;
    private zzLE zzZnx;

    public zzLC(String str) {
        this.zzZnx = new zzLE(str);
    }

    @Override // com.aspose.words.zzLG
    public final void zzZVT() {
        this.zzZnw = true;
    }

    @Override // com.aspose.words.zzLG
    public final zzLH zzZVU() {
        if (!this.zzZnw) {
            this.zzZnx.moveNext();
        }
        this.zzZnw = false;
        return this.zzZnx.zzZU8();
    }
}
