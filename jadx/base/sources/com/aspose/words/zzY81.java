package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY81 implements com.aspose.words.internal.zzZOY {
    private int zzX8H;
    private DocumentBase zzZCL;

    public zzY81(DocumentBase documentBase) {
        this(documentBase, 0);
    }

    @Override // com.aspose.words.internal.zzZOY
    public final void dispose() {
        this.zzZCL.zzG0(this.zzX8H);
    }

    public zzY81(DocumentBase documentBase, int i) {
        this.zzZCL = documentBase;
        documentBase.zzG1(i);
        this.zzX8H = i;
    }
}
