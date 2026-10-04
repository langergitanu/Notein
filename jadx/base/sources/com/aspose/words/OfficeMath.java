package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class OfficeMath extends CompositeNode<Node> implements zzZ8X, zzZAM {
    private boolean zzXJC;
    private boolean zzXJD;
    private com.aspose.words.internal.zzZO0 zzXJE;
    private zzZ0J zzYXu;
    private zzYEF zzZsP;

    public OfficeMath(DocumentBase documentBase, zzZ0J zzz0j, zzYEF zzyef) {
        super(documentBase);
        this.zzYXu = zzz0j;
        if (zzyef == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: runPr");
        }
        this.zzZsP = zzyef;
    }

    private boolean zzYrR() {
        return (getMathObjectType() == 1 || getMathObjectType() == 0 || getMathObjectType() == 8 || getMathObjectType() == 24 || getMathObjectType() == 25 || getMathObjectType() == 12 || getMathObjectType() == 11 || getMathObjectType() == 14 || getMathObjectType() == 7) ? false : true;
    }

    private boolean zzYrS() {
        if (zzYrR() && !this.zzZsP.zzYrV()) {
            return false;
        }
        for (Node firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            OfficeMath officeMath = (OfficeMath) com.aspose.words.internal.zzZKW.zzZ(firstChild, OfficeMath.class);
            if (officeMath != null && !officeMath.zzYrS()) {
                return false;
            }
        }
        return true;
    }

    private boolean zzYrT() {
        if (zzYrR() && !this.zzZsP.zzYrW()) {
            return false;
        }
        for (Node firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            OfficeMath officeMath = (OfficeMath) com.aspose.words.internal.zzZKW.zzZ(firstChild, OfficeMath.class);
            if (officeMath != null && !officeMath.zzYrT()) {
                return false;
            }
        }
        return true;
    }

    private boolean zzYrU() {
        if (zzYrR()) {
            return true;
        }
        for (Node firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            OfficeMath officeMath = (OfficeMath) com.aspose.words.internal.zzZKW.zzZ(firstChild, OfficeMath.class);
            if (officeMath != null && officeMath.zzYrU()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return acceptCore(documentVisitor);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptEnd(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitOfficeMathEnd(this);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptStart(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitOfficeMathStart(this);
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
        return this.zzZsP.zzPk(i);
    }

    public int getDisplayType() {
        return this.zzYXu.getMathObjectType() == 1 ? 0 : 1;
    }

    @Override // com.aspose.words.zzZAM
    @ReservedForInternalUse
    @Deprecated
    public DocumentBase getDocument_IInline() {
        return super.getDocument();
    }

    @Override // com.aspose.words.zzZAM
    @ReservedForInternalUse
    @Deprecated
    public zzYEF getExpandedRunPr_IInline(int i) {
        return zzZ7R.zzZ(this, i);
    }

    public final String getId() {
        StringBuilder sb = new StringBuilder(Node.nodeTypeToString(getNodeType()));
        sb.append(ControlChar.SPACE_CHAR);
        Node parentNode = this;
        while (parentNode != null && parentNode.getParentNode() != null) {
            int i = 0;
            for (Node firstChild = parentNode.getParentNode().getFirstChild(); firstChild != null && firstChild != parentNode; firstChild = firstChild.getNextSibling()) {
                i++;
            }
            com.aspose.words.internal.zzZNH.zzZ(sb, "{0}{1}", parentNode == this ? "" : ".", Integer.valueOf(i));
            parentNode = parentNode.getParentNode();
        }
        return sb.toString();
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public zzZV8 getInsertRevision() {
        return this.zzZsP.getInsertRevision();
    }

    public int getJustification() {
        if (getDisplayType() == 0) {
            return ((zzZ02) this.zzYXu).getJustification();
        }
        return 7;
    }

    public int getMathObjectType() {
        return this.zzYXu.getMathObjectType();
    }

    public OfficeMathRenderer getMathRenderer() throws Exception {
        return new OfficeMathRenderer(this);
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

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 35;
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

    public final boolean isTopLevel() {
        return (getParentNode() == null || getParentNode().getNodeType() == 35) ? false : true;
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

    public void setDisplayType(int i) {
        if (!isTopLevel()) {
            throw new IllegalArgumentException("DisplayType cannot be changed for the nested Office Math. Please, check the parent node type to make sure it is top level Office Math.");
        }
        if (i == 0) {
            zzYOL.zzj(this);
        } else {
            if (i != 1) {
                return;
            }
            zzYOL.zzk(this);
        }
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public void setInsertRevision(zzZV8 zzzv8) {
        this.zzZsP.zzQ(14, zzzv8);
    }

    public void setJustification(int i) {
        int displayType = getDisplayType();
        if (displayType != 0) {
            if (displayType == 1 && i != 7) {
                throw new IllegalArgumentException("Justification cannot be set to the Office Math displayed inline with text. Please, use OfficeMath.DisplayType property to change OfficeMathDisplayType.");
            }
        } else {
            if (i == 7) {
                throw new IllegalArgumentException("Inline justification cannot be set to the Office Math displayed on its own line. Please, use OfficeMath.DisplayType property to change OfficeMathDisplayType.");
            }
            ((zzZ02) this.zzYXu).setJustification(i);
        }
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

    public final void zzK(com.aspose.words.internal.zzZO0 zzzo0) {
        this.zzXJE = zzzo0;
    }

    @Override // com.aspose.words.CompositeNode
    public final boolean zzT(Node node) {
        return this.zzYXu.zzT(node);
    }

    public final void zzX(zzZ0J zzz0j) {
        this.zzYXu = zzz0j;
    }

    public final boolean zzYGa() {
        return this.zzXJD;
    }

    public final boolean zzYGb() {
        return this.zzXJC;
    }

    public final com.aspose.words.internal.zzZO0 zzYrO() {
        return this.zzXJE;
    }

    public final void zzYrP() {
        this.zzXJC = true;
    }

    public final void zzYrQ() {
        this.zzXJD = true;
    }

    public final boolean zzYrV() {
        return zzYrU() && zzYrS();
    }

    public final boolean zzYrW() {
        return zzYrU() && zzYrT();
    }

    public final OfficeMath zzYrX() {
        OfficeMath officeMath = this;
        while (true) {
            OfficeMath officeMath2 = (OfficeMath) com.aspose.words.internal.zzZKW.zzZ(officeMath.getParentNode(), OfficeMath.class);
            if (officeMath2 == null) {
                return officeMath;
            }
            officeMath = officeMath2;
        }
    }

    @Override // com.aspose.words.CompositeNode, com.aspose.words.Node
    public final Node zzZ(boolean z, zzZA5 zzza5) {
        OfficeMath officeMath = (OfficeMath) super.zzZ(z, zzza5);
        officeMath.zzZsP = (zzYEF) this.zzZsP.zzbn();
        officeMath.zzYXu = (zzZ0J) this.zzYXu.zzbn();
        return officeMath;
    }

    public final zzYEF zzZYh() {
        return this.zzZsP;
    }

    public final zzZ0J zzZsL() {
        return this.zzYXu;
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectRunAttr(int i, int i2) {
        return this.zzZsP.zzVQ(i, i2);
    }

    public OfficeMath(DocumentBase documentBase, zzZ0J zzz0j) {
        this(documentBase, zzz0j, new zzYEF());
    }
}
