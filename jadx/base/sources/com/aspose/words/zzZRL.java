package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZRL extends zzZRM {
    public zzZRL(Document document, String str) {
        super(document, str);
    }

    @Override // com.aspose.words.zzZRK
    public final void zzMr(String str) {
        StructuredDocumentTag structuredDocumentTagZzZh6 = zzZh6();
        if (com.aspose.words.internal.zzZKN.equals(structuredDocumentTagZzZh6.getTag(), structuredDocumentTagZzZh6.getTitle())) {
            structuredDocumentTagZzZh6.setTag(str);
        }
        structuredDocumentTagZzZh6.setTitle(str);
    }

    @Override // com.aspose.words.zzZRS
    public final int zzZhe() {
        return 5;
    }
}
