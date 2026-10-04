package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class Cell extends CompositeNode<Node> implements zzZ8X, zzZD5 {
    private TableCollection zzZAd;
    private ParagraphCollection zzZAe;
    private CellFormat zzZAf;
    private zzWP zzZAg;

    public Cell(DocumentBase documentBase) {
        this(documentBase, new zzWP());
    }

    private Object zzOE(int i) {
        TableStyle tableStyle;
        if (getParentRow() == null || getParentRow().getParentTable() == null || (tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(getParentRow().getParentTable().getStyle(), TableStyle.class)) == null) {
            return null;
        }
        return tableStyle.zzZ(i, this);
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return acceptCore(documentVisitor);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptEnd(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitCellEnd(this);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptStart(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitCellStart(this);
    }

    @Override // com.aspose.words.zzZD5
    @ReservedForInternalUse
    @Deprecated
    public void clearCellAttrs() {
        this.zzZAg.clear();
    }

    public void ensureMinimum() {
        zzY0C.zzE(this);
    }

    @Override // com.aspose.words.zzZD5
    @ReservedForInternalUse
    @Deprecated
    public Object fetchCellAttr(int i) {
        Object objZzPk = this.zzZAg.zzPk(i);
        if (objZzPk == null) {
            return fetchInheritedCellAttr(i);
        }
        zzZCY zzzcy = (zzZCY) com.aspose.words.internal.zzZKW.zzZ(objZzPk, zzZCY.class);
        return (zzzcy == null || !zzzcy.isInheritedComplexAttr()) ? objZzPk : fetchInheritedCellAttr(i);
    }

    @Override // com.aspose.words.zzZD5
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedCellAttr(int i) {
        Object objZzOE = zzOE(i);
        if (objZzOE != null) {
            return objZzOE;
        }
        if (getParentRow() != null) {
            Row parentRow = getParentRow();
            if (i == 3070) {
                return parentRow.fetchRowAttr(4300);
            }
            if (i == 3080) {
                return parentRow.fetchRowAttr(4310);
            }
            if (i == 3090) {
                return parentRow.fetchRowAttr(4020);
            }
            if (i == 3100) {
                return parentRow.fetchRowAttr(4320);
            }
            if (i == 3110) {
                return parentRow.fetchRowAttr(getParentRow().isFirstRow() ? 4050 : 4090);
            }
            int i2 = EditingLanguage.CHINESE_SINGAPORE;
            if (i == 3120) {
                if (isFirstCell()) {
                    i2 = 4060;
                }
                return parentRow.fetchRowAttr(i2);
            }
            if (i == 3130) {
                return parentRow.fetchRowAttr(getParentRow().isLastRow() ? 4070 : 4090);
            }
            if (i == 3140) {
                if (isLastCell()) {
                    i2 = 4080;
                }
                return parentRow.fetchRowAttr(i2);
            }
        }
        return zzWP.zzOt(i);
    }

    public CellFormat getCellFormat() {
        if (this.zzZAf == null) {
            this.zzZAf = new CellFormat(this);
        }
        return this.zzZAf;
    }

    public final int getColumnIndex() {
        Row parentRow = getParentRow();
        if (parentRow != null) {
            return parentRow.zzz(this);
        }
        return -1;
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public zzZV8 getDeleteRevision() {
        return this.zzZAg.getDeleteRevision();
    }

    @Override // com.aspose.words.zzZD5
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectCellAttr(int i) {
        return this.zzZAg.zzPk(i);
    }

    public Paragraph getFirstParagraph() {
        return (Paragraph) getChild(8, 0, false);
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public zzZV8 getInsertRevision() {
        return this.zzZAg.getInsertRevision();
    }

    public Paragraph getLastParagraph() {
        return (Paragraph) getChild(8, -1, false);
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public zzYX5 getMoveFromRevision() {
        return this.zzZAg.getMoveFromRevision();
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public zzYX5 getMoveToRevision() {
        return this.zzZAg.getMoveToRevision();
    }

    public Cell getNextCell() {
        return (Cell) zzYB5();
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 7;
    }

    public ParagraphCollection getParagraphs() {
        if (this.zzZAe == null) {
            this.zzZAe = new ParagraphCollection(this);
        }
        return this.zzZAe;
    }

    public Row getParentRow() {
        return (Row) zzYBd();
    }

    public Cell getPreviousCell() {
        return (Cell) zzYB6();
    }

    public final int getRowIndex() {
        if (getParentRow() != null) {
            return getParentRow().getRowIndex();
        }
        return -1;
    }

    public TableCollection getTables() {
        if (this.zzZAd == null) {
            this.zzZAd = new TableCollection(this);
        }
        return this.zzZAd;
    }

    public boolean isFirstCell() {
        return getParentRow() != null && this == getParentRow().getFirstCell();
    }

    public boolean isLastCell() {
        return getParentRow() != null && this == getParentRow().getLastCell();
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public void removeMoveRevisions() {
        this.zzZAg.remove(13);
        this.zzZAg.remove(15);
    }

    @Override // com.aspose.words.zzZD5
    @ReservedForInternalUse
    @Deprecated
    public void setCellAttr(int i, Object obj) {
        this.zzZAg.zzQ(i, obj);
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public void setDeleteRevision(zzZV8 zzzv8) {
        this.zzZAg.zzQ(12, zzzv8);
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public void setInsertRevision(zzZV8 zzzv8) {
        this.zzZAg.zzQ(14, zzzv8);
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public void setMoveFromRevision(zzYX5 zzyx5) {
        this.zzZAg.zzQ(13, zzyx5);
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public void setMoveToRevision(zzYX5 zzyx5) {
        this.zzZAg.zzQ(15, zzyx5);
    }

    public final int zz6F() {
        Row parentRow = getParentRow();
        if (parentRow == null) {
            return -1;
        }
        int i = -1;
        for (Cell firstCell = parentRow.getFirstCell(); firstCell != null; firstCell = firstCell.getNextCell()) {
            if (firstCell.getCellFormat().getHorizontalMerge() != 2) {
                i++;
            }
            if (firstCell == this) {
                return i;
            }
        }
        return -1;
    }

    public final zzWP zz6G() {
        return this.zzZAg;
    }

    @Override // com.aspose.words.CompositeNode
    public final boolean zzT(Node node) {
        return zzYVU.zzXR(node);
    }

    public final zzWP zzYI(boolean z) {
        TableStyle tableStyle;
        zzWP zzwp = new zzWP();
        zzZ(3120, zzwp);
        zzZ(3140, zzwp);
        zzZ(3110, zzwp);
        zzZ(3130, zzwp);
        zzZ(3090, zzwp);
        zzZ(3100, zzwp);
        zzZ(3070, zzwp);
        zzZ(3080, zzwp);
        if (z && (tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(getParentRow().getParentTable().getStyle(), TableStyle.class)) != null) {
            tableStyle.zzY(this, zzwp);
        }
        this.zzZAg.zzY((zzZS) zzwp);
        return zzwp;
    }

    public final void zzZ(zzWP zzwp) {
        this.zzZAg = zzwp;
    }

    public Cell(DocumentBase documentBase, zzWP zzwp) {
        super(documentBase);
        this.zzZAg = zzwp;
    }

    @Override // com.aspose.words.CompositeNode, com.aspose.words.Node
    public final Node zzZ(boolean z, zzZA5 zzza5) {
        Cell cell = (Cell) super.zzZ(z, zzza5);
        cell.zzZAg = (zzWP) this.zzZAg.zzbn();
        cell.zzZAf = null;
        cell.zzZAe = null;
        cell.zzZAd = null;
        return cell;
    }

    private void zzZ(int i, zzWP zzwp) {
        zzwp.zzQ(i, fetchInheritedCellAttr(i));
    }
}
