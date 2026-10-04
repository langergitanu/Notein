package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZMA extends zzZMB {
    private zzVY zzYvQ;

    public zzZMA(DocumentBase documentBase, zzVY zzvy) {
        super(documentBase, zzvy);
        this.zzYvQ = zzvy;
    }

    private void zzZ5Z() {
        float fZzZn = ((zzZ67().zzZn() + zzZ67().zzZo()) / 2.0f) - 4.5f;
        this.zzYvS.zzX(zzZMC.zzY(this.zzYvQ.zzZ6r() ? new com.aspose.words.internal.zzZQ4((zzZ67().zzkw() - 1.0f) - 9.0f, fZzZn, 9.0f, 9.0f) : new com.aspose.words.internal.zzZQ4(zzZ67().zzZm() + 1.0f, fZzZn, 9.0f, 9.0f), this.zzYvQ.zzZ6f() != 0, zzYO6.zzD4(this.zzYvQ.getValue())));
    }

    private com.aspose.words.internal.zzZQ4 zzZ60() {
        return this.zzYvQ.zzZ6r() ? com.aspose.words.internal.zzZQ4.zzX(zzZ67().zzZm() + 2.0f, zzZ67().zzZo(), ((zzZ67().zzkw() - 9.0f) - 1.0f) - 2.0f, zzZ67().zzZn()) : com.aspose.words.internal.zzZQ4.zzX(zzZ67().zzZm() + 1.0f + 9.0f + 2.0f, zzZ67().zzZo(), zzZ67().zzkw() - 2.0f, zzZ67().zzZn());
    }

    private void zzZ61() throws Exception {
        this.zzYvS.zzX(zzZLV.zzZ(this.zzYvQ, this.zzYKc).zzZc(zzZ60()));
    }

    @Override // com.aspose.words.zzZMB
    public final void zzZ68() throws Exception {
        zzZ66();
        zzZ5Z();
        zzZ61();
    }
}
