package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public abstract class InlineStory extends CompositeNode<Node> implements zzZ96, zzZAM {
    private TableCollection zzZAd;
    private ParagraphCollection zzZAe;
    private Font zzZEt;
    private zzYEF zzZsP;

    public InlineStory(DocumentBase documentBase, zzYEF zzyef) {
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

    public void ensureMinimum() {
        zzY0C.zzE(this);
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedRunAttr(int i) {
        return zzZ7R.zzY(this, i);
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectRunAttr(int i) {
        return this.zzZsP.zzPk(i);
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

    public Paragraph getFirstParagraph() {
        return (Paragraph) getChild(8, 0, false);
    }

    public Font getFont() {
        Font font = this.zzZEt;
        if (font != null) {
            return font;
        }
        Font font2 = new Font(this, getDocument());
        this.zzZEt = font2;
        return font2;
    }

    public Paragraph getLastParagraph() {
        return (Paragraph) getChild(8, -1, false);
    }

    public ParagraphCollection getParagraphs() {
        ParagraphCollection paragraphCollection = this.zzZAe;
        if (paragraphCollection != null) {
            return paragraphCollection;
        }
        ParagraphCollection paragraphCollection2 = new ParagraphCollection(this);
        this.zzZAe = paragraphCollection2;
        return paragraphCollection2;
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

    public abstract int getStoryType();

    public TableCollection getTables() {
        TableCollection tableCollection = this.zzZAd;
        if (tableCollection != null) {
            return tableCollection;
        }
        TableCollection tableCollection2 = new TableCollection(this);
        this.zzZAd = tableCollection2;
        return tableCollection2;
    }

    public boolean isDeleteRevision() {
        return zzZ7R.zzV(this);
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

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void removeRunAttr(int i) {
        this.zzZsP.remove(i);
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void setRunAttr(int i, Object obj) {
        this.zzZsP.zzQ(i, obj);
    }

    @Override // com.aspose.words.zzZAM
    @ReservedForInternalUse
    @Deprecated
    public void setRunPr_IInline(zzYEF zzyef) {
        this.zzZsP = zzyef;
    }

    public final void zzL(zzYEF zzyef) {
        this.zzZsP = zzyef;
    }

    @Override // com.aspose.words.CompositeNode
    public final boolean zzT(Node node) {
        return zzYVU.zzXR(node);
    }

    @Override // com.aspose.words.CompositeNode, com.aspose.words.Node
    public final Node zzZ(boolean z, zzZA5 zzza5) {
        InlineStory inlineStory = (InlineStory) super.zzZ(z, zzza5);
        inlineStory.zzZsP = (zzYEF) this.zzZsP.zzbn();
        inlineStory.zzZEt = null;
        inlineStory.zzZAe = null;
        inlineStory.zzZAd = null;
        return inlineStory;
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
}
