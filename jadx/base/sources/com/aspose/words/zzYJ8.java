package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYJ8 extends zzYWD {
    private Node zzXVV;

    @Override // com.aspose.words.zzYWD
    public final boolean zzJ(Node node) {
        Node node2 = this.zzXVV;
        if (node2 != null && node2 != node && !node.zzYF(node2)) {
            return false;
        }
        WordAttrCollection wordAttrCollectionZzWP = zzYJ3.zzWP(node);
        boolean zZzY3m = wordAttrCollectionZzWP != null && (wordAttrCollectionZzWP.hasRevisions() || wordAttrCollectionZzWP.zzY3m());
        if (!zZzY3m && (node instanceof Paragraph)) {
            Paragraph paragraph = (Paragraph) node;
            zZzY3m = paragraph.zzYp5().zzY3m() | paragraph.hasRevisions();
        }
        if (zZzY3m || !(node instanceof StructuredDocumentTag)) {
            return zZzY3m;
        }
        StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) node;
        return structuredDocumentTag.zzY3I().zzY3m() | (structuredDocumentTag.zzY3J().hasRevisions() || structuredDocumentTag.zzY3I().hasRevisions());
    }

    public final void zzWX(Node node) {
        this.zzXVV = node;
    }

    @Override // com.aspose.words.zzYWD
    public final boolean zzZZP() {
        return false;
    }
}
