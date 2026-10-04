package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class CommentRangeStart extends Node implements zzZA1, zzZCT {
    private int zzYG;
    private int zzZCI;

    public CommentRangeStart(DocumentBase documentBase, int i) {
        super(documentBase);
        this.zzZCI = 2;
        this.zzYG = i;
    }

    @Override // com.aspose.words.Node
    public final boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return Node.visitorActionToBool(documentVisitor.visitCommentRangeStart(this));
    }

    @Override // com.aspose.words.zzZCT
    @ReservedForInternalUse
    @Deprecated
    public final int getDisplacedByCustomXml() {
        return this.zzZCI;
    }

    public final int getId() {
        return this.zzYG;
    }

    @Override // com.aspose.words.zzZA1
    @ReservedForInternalUse
    @Deprecated
    public final int getIdInternal() {
        return getId();
    }

    @Override // com.aspose.words.Node
    public final int getNodeType() {
        return 33;
    }

    @Override // com.aspose.words.zzZA1
    @ReservedForInternalUse
    @Deprecated
    public final int getParentIdInternal() {
        return -1;
    }

    @Override // com.aspose.words.zzZCT
    @ReservedForInternalUse
    @Deprecated
    public final void setDisplacedByCustomXml(int i) {
        this.zzZCI = i;
    }

    public final void setId(int i) {
        this.zzYG = i;
    }

    @Override // com.aspose.words.zzZA1
    @ReservedForInternalUse
    @Deprecated
    public final void setIdInternal(int i) {
        this.zzYG = i;
    }

    @Override // com.aspose.words.zzZA1
    @ReservedForInternalUse
    @Deprecated
    public final void setParentIdInternal(int i) {
    }

    public final void zzOY(int i) {
        this.zzZCI = i;
    }
}
