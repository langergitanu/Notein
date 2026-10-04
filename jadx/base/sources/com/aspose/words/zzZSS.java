package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZSS extends zzZTQ {
    private String mValue;

    public zzZSS(int i, int i2) {
        super(i, i2);
    }

    public final String getValue() {
        return this.mValue;
    }

    @Override // com.aspose.words.zzZTQ
    public final void zzC(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.mValue = zzZZR.zzR(zzzox, zzZiF());
    }

    @Override // com.aspose.words.zzZTQ
    public final void zzS(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzZZQ.zzZ(this.mValue, zzzow);
    }

    public zzZSS(int i, String str) {
        super(i, zzZZ7.zzOe(str));
        this.mValue = str;
    }
}
