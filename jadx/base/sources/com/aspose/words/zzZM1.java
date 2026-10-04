package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZM1 extends zzZMB {
    private TextBoxControl zzYvE;

    public zzZM1(DocumentBase documentBase, TextBoxControl textBoxControl) {
        super(documentBase, textBoxControl);
        this.zzYvE = textBoxControl;
    }

    private com.aspose.words.internal.zzZQ4 zzZso() {
        return com.aspose.words.internal.zzZQ4.zzX(zzZ67().zzZm() + 9.0f, zzZ67().zzZo() + 4.0f, zzZ67().zzkw() - 3.0f, zzZ67().zzZn() - 2.0f);
    }

    @Override // com.aspose.words.zzZMB
    public final void zzZ68() throws Exception {
        zzZ66();
        zzZ64();
        this.zzYvS.zzX(zzZLV.zzZ(this.zzYvE, this.zzYKc).zzZc(zzZso()));
    }
}
