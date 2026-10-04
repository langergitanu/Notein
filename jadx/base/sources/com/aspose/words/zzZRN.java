package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZRN extends zzZRS {
    private StructuredDocumentTag zzYHQ;

    public zzZRN(Document document, StructuredDocumentTag structuredDocumentTag) {
        super(document);
        this.zzYHQ = structuredDocumentTag;
        zzz(document);
    }

    private void zzz(Document document) {
        appendChild(new zzZRL(document, this.zzYHQ.getTitle()));
    }

    @Override // com.aspose.words.CompositeNode
    public final boolean zzT(Node node) {
        return node instanceof zzZRM;
    }

    @Override // com.aspose.words.zzZRS
    public final int zzZhe() {
        return 4;
    }

    @Override // com.aspose.words.zzZRS
    public final Node zzZhf() {
        return this.zzYHQ;
    }

    @Override // com.aspose.words.zzZRS
    public final void zzf(Node node) {
        this.zzYHQ = (StructuredDocumentTag) node;
    }
}
