package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZFJ extends zzZDK {
    private boolean zzYni;
    private String zzZi;

    public zzZFJ(String str, boolean z) {
        this.zzZi = str;
        this.zzYni = z;
    }

    public final String getText() {
        return this.zzZi;
    }

    @Override // com.aspose.words.zzZDK
    public final void zzZ(zzZI0 zzzi0) {
        zzzi0.zzY(this.zzZi, this.zzYni);
    }
}
