package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY82 implements com.aspose.words.internal.zzZOY {
    private DocumentBase zzZCL;

    public zzY82(DocumentBase documentBase) {
        this.zzZCL = documentBase;
        documentBase.zzZq7();
    }

    @Override // com.aspose.words.internal.zzZOY
    public final void dispose() {
        this.zzZCL.zzZq6();
    }
}
