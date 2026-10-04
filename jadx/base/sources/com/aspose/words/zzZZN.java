package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZN implements zzZA5 {
    private boolean zzYWK;
    private boolean zzYWL;
    private com.aspose.words.internal.zzIM<StructuredDocumentTag> zzYWM = new com.aspose.words.internal.zzIM<>();

    @Override // com.aspose.words.zzZA5
    public final void zzW(Node node, Node node2) {
        int nodeType = node2.getNodeType();
        if (nodeType == 20) {
            this.zzYWL = true;
            return;
        }
        if (nodeType == 25) {
            this.zzYWK = true;
            return;
        }
        if (nodeType != 28) {
            return;
        }
        StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) node2;
        if (structuredDocumentTag.getXmlMapping() == null || !structuredDocumentTag.getXmlMapping().zzXQE()) {
            return;
        }
        this.zzYWM.add(structuredDocumentTag);
    }

    public final boolean zzZrR() {
        return this.zzYWK;
    }

    public final boolean zzZrS() {
        return this.zzYWL;
    }

    public final com.aspose.words.internal.zzIM<StructuredDocumentTag> zzZrT() {
        return this.zzYWM;
    }
}
