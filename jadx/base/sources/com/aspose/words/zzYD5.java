package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYD5 extends Node implements zzZ8X {
    private zzZV8 zzXo6;
    private StructuredDocumentTag zzXo7;
    private zzZV8 zzXsF;

    public zzYD5(DocumentBase documentBase, StructuredDocumentTag structuredDocumentTag) {
        super(documentBase);
        this.zzXo7 = structuredDocumentTag;
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) {
        return true;
    }

    @Override // com.aspose.words.zzZ8X
    public zzZV8 getDeleteRevision() {
        return this.zzXsF;
    }

    @Override // com.aspose.words.zzZ8X
    public zzZV8 getInsertRevision() {
        return this.zzXo6;
    }

    @Override // com.aspose.words.zzZA6
    public zzYX5 getMoveFromRevision() {
        throw new UnsupportedOperationException("Should not be called.");
    }

    @Override // com.aspose.words.zzZA6
    public zzYX5 getMoveToRevision() {
        throw new UnsupportedOperationException("Should not be called.");
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 37;
    }

    @Override // com.aspose.words.zzZA6
    public void removeMoveRevisions() {
        throw new UnsupportedOperationException("Should not be called.");
    }

    @Override // com.aspose.words.zzZ8X
    public void setDeleteRevision(zzZV8 zzzv8) {
        this.zzXsF = zzzv8;
    }

    @Override // com.aspose.words.zzZ8X
    public void setInsertRevision(zzZV8 zzzv8) {
        this.zzXo6 = zzzv8;
    }

    @Override // com.aspose.words.zzZA6
    public void setMoveFromRevision(zzYX5 zzyx5) {
        throw new UnsupportedOperationException("Should not be called.");
    }

    @Override // com.aspose.words.zzZA6
    public void setMoveToRevision(zzYX5 zzyx5) {
        throw new UnsupportedOperationException("Should not be called.");
    }

    public final StructuredDocumentTag zzYcK() {
        StructuredDocumentTag structuredDocumentTag = this.zzXo7;
        if (structuredDocumentTag != null) {
            structuredDocumentTag.zzY(getDocument());
        }
        return this.zzXo7;
    }

    @Override // com.aspose.words.Node
    public final Node zzZ(boolean z, zzZA5 zzza5) {
        zzYD5 zzyd5 = (zzYD5) super.zzZ(z, zzza5);
        zzyd5.zzXo7 = (StructuredDocumentTag) zzYcK().zzZ(z, zzza5);
        zzyd5.zzYcK().zzle(zzYcK().getId());
        return zzyd5;
    }
}
