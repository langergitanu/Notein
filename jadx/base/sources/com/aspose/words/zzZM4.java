package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZM4 extends zzZMB {
    private zzYNN zzYvK;

    public zzZM4(DocumentBase documentBase, zzYNN zzynn) {
        super(documentBase, zzynn);
        this.zzYvK = zzynn;
    }

    private void zzZ5Y() {
        float fZzZn = ((zzZ67().zzZn() + zzZ67().zzZo()) / 2.0f) - 4.5f;
        this.zzYvS.zzX(zzZMC.zzZ(this.zzYvK.zzZ6r() ? new com.aspose.words.internal.zzZQ4((zzZ67().zzkw() - 1.0f) - 9.0f, fZzZn, 9.0f, 9.0f) : new com.aspose.words.internal.zzZQ4(zzZ67().zzZm() + 1.0f, fZzZn, 9.0f, 9.0f), this.zzYvK.zzZ6f() != 0, zzYO6.zzD4(this.zzYvK.getValue())));
    }

    private void zzZ61() throws Exception {
        this.zzYvS.zzX(zzZLV.zzZ(this.zzYvK, this.zzYKc).zzZc(this.zzYvK.zzZ6r() ? com.aspose.words.internal.zzZQ4.zzX(zzZ67().zzZm() + 2.0f, zzZ67().zzZo(), ((zzZ67().zzkw() - 9.0f) - 1.0f) - 2.0f, zzZ67().zzZn()) : com.aspose.words.internal.zzZQ4.zzX(zzZ67().zzZm() + 1.0f + 9.0f + 2.0f, zzZ67().zzZo(), zzZ67().zzkw() - 2.0f, zzZ67().zzZn())));
    }

    @Override // com.aspose.words.zzZMB
    public final void zzZ68() throws Exception {
        zzZ66();
        zzZ5Y();
        zzZ61();
    }
}
