package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZDI extends zzZDK {
    private String zzZi;

    public zzZDI(String str) {
        this.zzZi = str;
    }

    public final String getText() {
        return this.zzZi;
    }

    @Override // com.aspose.words.zzZDK
    public final void zzZ(zzZI0 zzzi0) {
        zzzi0.writeString(this.zzZi);
    }
}
