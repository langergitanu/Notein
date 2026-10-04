package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZPF implements zzZAY {
    private zzZPE zzYC0;
    private zzYD zzZCJ;
    private Document zzZEY;

    public zzZPF(zzZOQ zzzoq) {
        this.zzZCJ = zzzoq.zzZau();
        this.zzZEY = zzzoq.getDocument();
    }

    private void zzZck() {
        if (this.zzYC0 != null) {
            return;
        }
        this.zzYC0 = new zzZPE(this.zzZEY, this.zzZCJ);
    }

    public final void invalidate() {
        this.zzYC0 = null;
    }

    @Override // com.aspose.words.zzZAY
    public final Object zzA(Field field) {
        return null;
    }

    public final void zzLM(String str) throws Exception {
        zzZPE zzzpe = this.zzYC0;
        if (zzzpe == null) {
            return;
        }
        zzzpe.zzLM(str);
    }

    @Override // com.aspose.words.zzZAY
    public final zzTL zzz(Field field) throws Exception {
        if (field.getType() != 12) {
            return null;
        }
        zzZck();
        return this.zzYC0.zzZ((FieldSeq) field);
    }

    public zzZPF(Document document) {
        this.zzZCJ = new zzYD(document);
        this.zzZEY = document;
    }
}
