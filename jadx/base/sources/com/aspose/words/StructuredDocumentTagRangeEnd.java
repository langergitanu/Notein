package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class StructuredDocumentTagRangeEnd extends Node {
    private int zzYG;

    public StructuredDocumentTagRangeEnd(DocumentBase documentBase, int i) {
        super(documentBase);
        this.zzYG = i;
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return Node.visitorActionToBool(documentVisitor.visitStructuredDocumentTagRangeEnd(this));
    }

    public int getId() {
        return this.zzYG;
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 30;
    }

    public final void setIdInternal(int i) {
        this.zzYG = i;
    }
}
