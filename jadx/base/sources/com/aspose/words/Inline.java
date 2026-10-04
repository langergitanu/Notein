package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Inline extends Node implements zzZ8X, zzZAM {
    private Font zzZEt;
    private zzYEF zzZsP;

    public Inline(DocumentBase documentBase, zzYEF zzyef) {
        super(documentBase);
        if (zzyef == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: runPr");
        }
        this.zzZsP = zzyef;
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void clearRunAttrs() {
        this.zzZsP.clear();
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedRunAttr(int i) {
        return zzZ7R.zzY(this, i);
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public zzZV8 getDeleteRevision() {
        return this.zzZsP.getDeleteRevision();
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectRunAttr(int i) {
        return this.zzZsP.zzVQ(i, 0);
    }

    @Override // com.aspose.words.zzZAM
    @ReservedForInternalUse
    @Deprecated
    public DocumentBase getDocument_IInline() {
        return getDocument();
    }

    @Override // com.aspose.words.zzZAM
    @ReservedForInternalUse
    @Deprecated
    public zzYEF getExpandedRunPr_IInline(int i) {
        return zzZ7R.zzZ(this, i);
    }

    public Font getFont() {
        if (this.zzZEt == null) {
            this.zzZEt = new Font(this, getDocument());
        }
        return this.zzZEt;
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public zzZV8 getInsertRevision() {
        return this.zzZsP.getInsertRevision();
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public zzYX5 getMoveFromRevision() {
        return this.zzZsP.getMoveFromRevision();
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public zzYX5 getMoveToRevision() {
        return this.zzZsP.getMoveToRevision();
    }

    public Paragraph getParentParagraph() {
        return (Paragraph) getAncestor(8);
    }

    @Override // com.aspose.words.zzZAM
    @ReservedForInternalUse
    @Deprecated
    public Paragraph getParentParagraph_IInline() {
        return getParentParagraph();
    }

    @Override // com.aspose.words.zzZAM
    @ReservedForInternalUse
    @Deprecated
    public zzYEF getRunPr_IInline() {
        return this.zzZsP;
    }

    public boolean isDeleteRevision() {
        return zzZ7R.zzV(this);
    }

    public boolean isFormatRevision() {
        return zzZ7R.zzS(this);
    }

    public boolean isInsertRevision() {
        return zzZ7R.zzW(this);
    }

    public boolean isMoveFromRevision() {
        return zzZ7R.zzU(this);
    }

    public boolean isMoveToRevision() {
        return zzZ7R.zzT(this);
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public void removeMoveRevisions() {
        this.zzZsP.remove(13);
        this.zzZsP.remove(15);
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void removeRunAttr(int i) {
        this.zzZsP.remove(i);
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public void setDeleteRevision(zzZV8 zzzv8) {
        this.zzZsP.zzQ(12, zzzv8);
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public void setInsertRevision(zzZV8 zzzv8) {
        this.zzZsP.zzQ(14, zzzv8);
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public void setMoveFromRevision(zzYX5 zzyx5) {
        this.zzZsP.zzQ(13, zzyx5);
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public void setMoveToRevision(zzYX5 zzyx5) {
        this.zzZsP.zzQ(15, zzyx5);
    }

    @ReservedForInternalUse
    @Deprecated
    public void setRunAttr(int i, Object obj) {
        if (i != 70 || getAncestor(35) == null) {
            this.zzZsP.zzQ(i, obj);
        } else {
            this.zzZsP.zzQ(730, Integer.valueOf(((zzZU) obj).toBool() ? 2 : 0));
        }
    }

    @Override // com.aspose.words.zzZAM
    @ReservedForInternalUse
    @Deprecated
    public void setRunPr_IInline(zzYEF zzyef) {
        this.zzZsP = zzyef;
    }

    public final boolean zzYUT() {
        StructuredDocumentTag structuredDocumentTag;
        String text = getText();
        String strZzZ = this.zzZsP.zzYdQ().zzZYI() ? zzU1.zzZ(this.zzZsP.zzYdQ(), getDocument().getNodeType() == 1 ? ((Document) getDocument()).zzZqI() : null) : this.zzZsP.getNameOther();
        if (getParentNode() != null && (structuredDocumentTag = (StructuredDocumentTag) com.aspose.words.internal.zzZKW.zzZ(getParentNode().getParentNode(), StructuredDocumentTag.class)) != null && structuredDocumentTag.getSdtType() == 13 && com.aspose.words.internal.zzJF.zzZK(strZzZ)) {
            return true;
        }
        if (text.length() > 0 && text.charAt(0) == 160 && com.aspose.words.internal.zzJF.zzZK(strZzZ)) {
            return true;
        }
        return Run.zzBq(text) && com.aspose.words.internal.zzJF.zzZK(strZzZ) && !this.zzZsP.contains(400) && this.zzZsP.contains(240) && com.aspose.words.internal.zzZKO.equals(this.zzZsP.zzYdS(), this.zzZsP.zzYdQ());
    }

    public final boolean zzYUU() {
        return isDeleteRevision() || getFont().getHidden();
    }

    public final boolean zzZ(DocumentVisitor documentVisitor) {
        return !isDeleteRevision() || documentVisitor.zzZn9();
    }

    public final zzYEF zzZYh() {
        return this.zzZsP;
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectRunAttr(int i, int i2) {
        return this.zzZsP.zzVQ(i, i2);
    }

    public final void zzZ(zzYEF zzyef) {
        this.zzZsP = zzyef;
    }

    @Override // com.aspose.words.Node
    public Node zzZ(boolean z, zzZA5 zzza5) {
        Inline inline = (Inline) super.zzZ(z, zzza5);
        inline.zzZsP = (zzYEF) this.zzZsP.zzbn();
        inline.zzZEt = null;
        return inline;
    }
}
