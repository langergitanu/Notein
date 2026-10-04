package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ2B implements INodeChangingCallback {
    private Document zzYTQ;

    public zzZ2B(Document document) {
        this.zzYTQ = document;
    }

    private void zzP(StructuredDocumentTag structuredDocumentTag) throws Exception {
        if (structuredDocumentTag.getXmlMapping().isMapped()) {
            try {
                if (!zzKM.zzm(structuredDocumentTag.getXmlMapping().zzY(new zzXYV())).contains("<pkg:package")) {
                    String text = structuredDocumentTag.getText();
                    if (com.aspose.words.internal.zzZYD.zzXk(text) && structuredDocumentTag.getLevel() == 4) {
                        com.aspose.words.internal.zzZKN.zzW(text, ControlChar.CELL, com.aspose.words.internal.zzZOF.INVARIANT_CULTURE$4894b8c8);
                        text = text.substring(0, text.length() - 1);
                    }
                    structuredDocumentTag.getXmlMapping().setValue(text);
                    return;
                }
                zzY82 zzy82 = new zzY82(this.zzYTQ);
                try {
                    OoxmlSaveOptions ooxmlSaveOptions = new OoxmlSaveOptions(24);
                    ooxmlSaveOptions.zzXoJ = false;
                    structuredDocumentTag.getXmlMapping().setValue(new zzYO1(ooxmlSaveOptions).zzZ8(structuredDocumentTag));
                } finally {
                    zzy82.dispose();
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    private void zzYQ(Node node) throws Exception {
        for (StructuredDocumentTag structuredDocumentTag = node.getNodeType() == 28 ? (StructuredDocumentTag) node : (StructuredDocumentTag) com.aspose.words.internal.zzZKW.zzZ(node.getAncestor(28), StructuredDocumentTag.class); structuredDocumentTag != null; structuredDocumentTag = (StructuredDocumentTag) com.aspose.words.internal.zzZKW.zzZ(structuredDocumentTag.getAncestor(28), StructuredDocumentTag.class)) {
            zzP(structuredDocumentTag);
        }
    }

    @Override // com.aspose.words.INodeChangingCallback
    public final void nodeInserted(NodeChangingArgs nodeChangingArgs) throws Exception {
        if (this.zzYTQ.zzZq5()) {
            return;
        }
        zzYQ(nodeChangingArgs.getNewParent());
    }

    @Override // com.aspose.words.INodeChangingCallback
    public final void nodeInserting(NodeChangingArgs nodeChangingArgs) {
    }

    @Override // com.aspose.words.INodeChangingCallback
    public final void nodeRemoved(NodeChangingArgs nodeChangingArgs) throws Exception {
        if (this.zzYTQ.zzZq5()) {
            return;
        }
        zzYQ(nodeChangingArgs.getOldParent());
    }

    @Override // com.aspose.words.INodeChangingCallback
    public final void nodeRemoving(NodeChangingArgs nodeChangingArgs) {
    }
}
