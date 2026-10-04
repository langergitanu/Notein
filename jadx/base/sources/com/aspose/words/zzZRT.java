package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZRT extends zzZRU {
    private zzCU zzYHX;

    public zzZRT(Document document, zzCU zzcu) {
        super(document, zzcu.getText());
        this.zzYHX = zzcu;
    }

    @Override // com.aspose.words.zzZRK
    public final void zzMr(String str) {
        this.zzYHX.setText(str);
    }

    public final void zzX(zzCU zzcu) {
        this.zzYHX = zzcu;
    }

    public final zzCU zzZhc() {
        return this.zzYHX;
    }

    @Override // com.aspose.words.zzZRS
    public int zzZhe() {
        return 1;
    }
}
