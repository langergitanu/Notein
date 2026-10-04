package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class Row extends CompositeNode<Cell> implements zzZ8X, zzZ9J {
    private int zzXGK;
    private CellCollection zzXxk;
    private RowFormat zzYS6;
    private zzY6G zzZsO;
    private int zzZva;

    public Row(DocumentBase documentBase) {
        this(documentBase, zzY6G.zzXXu());
    }

    private PreferredWidth zzYkf() {
        PreferredWidth preferredWidth = (PreferredWidth) getDirectRowAttr(4290);
        if (preferredWidth == null) {
            for (TableStyle tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(getParentTable().getStyle(), TableStyle.class); tableStyle != null; tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(tableStyle.zzY3j(), TableStyle.class)) {
                preferredWidth = (PreferredWidth) tableStyle.getDirectRowAttr(4290);
                if (preferredWidth != null) {
                    break;
                }
            }
        }
        return preferredWidth;
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return acceptCore(documentVisitor);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptEnd(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitRowEnd(this);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptStart(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitRowStart(this);
    }

    @Override // com.aspose.words.zzZ9J
    @ReservedForInternalUse
    @Deprecated
    public void clearRowAttrs() {
        this.zzZsO.clear();
    }

    public void ensureMinimum() {
        Cell firstCell = getFirstCell();
        if (firstCell == null) {
            firstCell = (Cell) appendChild(new Cell(getDocument()));
        }
        firstCell.ensureMinimum();
    }

    @Override // com.aspose.words.zzZ9J
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedRowAttr(int i) {
        TableStyle tableStyle;
        return (getParentTable() == null || (tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(getParentTable().getStyle(), TableStyle.class)) == null) ? zzY6G.zzOt(i) : tableStyle.fetchRowAttr(i);
    }

    @Override // com.aspose.words.zzZ9J
    @ReservedForInternalUse
    @Deprecated
    public Object fetchRowAttr(int i) {
        Object obj = this.zzZsO.get(i);
        return obj != null ? obj : fetchInheritedRowAttr(i);
    }

    public CellCollection getCells() {
        if (this.zzXxk == null) {
            this.zzXxk = new CellCollection(this);
        }
        return this.zzXxk;
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public zzZV8 getDeleteRevision() {
        return this.zzZsO.getDeleteRevision();
    }

    @Override // com.aspose.words.zzZ9J
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectRowAttr(int i) {
        return this.zzZsO.zzPk(i);
    }

    public Cell getFirstCell() {
        return (Cell) zzZYt();
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public zzZV8 getInsertRevision() {
        return this.zzZsO.getInsertRevision();
    }

    public Cell getLastCell() {
        return (Cell) zzZYs();
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public zzYX5 getMoveFromRevision() {
        return this.zzZsO.getMoveFromRevision();
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public zzYX5 getMoveToRevision() {
        return this.zzZsO.getMoveToRevision();
    }

    public Row getNextRow() {
        return (Row) zzYB5();
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 6;
    }

    public Table getParentTable() {
        return (Table) zzYBd();
    }

    public Row getPreviousRow() {
        return (Row) zzYB6();
    }

    public RowFormat getRowFormat() {
        if (this.zzYS6 == null) {
            this.zzYS6 = new RowFormat(this);
        }
        return this.zzYS6;
    }

    public final int getRowIndex() {
        Table parentTable = getParentTable();
        if (parentTable != null) {
            return parentTable.zzz(this);
        }
        return -1;
    }

    @Override // com.aspose.words.CompositeNode, com.aspose.words.Node
    public String getText() {
        return super.getText();
    }

    public boolean isFirstRow() {
        return this == getParentTable().getFirstRow();
    }

    public boolean isLastRow() {
        return this == getParentTable().getLastRow();
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public void removeMoveRevisions() {
        this.zzZsO.remove(13);
        this.zzZsO.remove(15);
    }

    @Override // com.aspose.words.zzZ9J
    @ReservedForInternalUse
    @Deprecated
    public void resetToDefaultAttrs() throws Exception {
        this.zzZsO.resetToDefaultAttrs();
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public void setDeleteRevision(zzZV8 zzzv8) {
        this.zzZsO.zzQ(12, zzzv8);
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public void setInsertRevision(zzZV8 zzzv8) {
        this.zzZsO.zzQ(14, zzzv8);
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public void setMoveFromRevision(zzYX5 zzyx5) {
        this.zzZsO.zzQ(13, zzyx5);
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public void setMoveToRevision(zzYX5 zzyx5) {
        this.zzZsO.zzQ(15, zzyx5);
    }

    @Override // com.aspose.words.zzZ9J
    @ReservedForInternalUse
    @Deprecated
    public void setRowAttr(int i, Object obj) {
        this.zzZsO.zzQ(i, obj);
    }

    @Override // com.aspose.words.CompositeNode
    public final boolean zzT(Node node) {
        return zzYVU.zzXP(node);
    }

    public final void zzYkc() {
        Iterator<T> it = getChildNodes(8, true).iterator();
        while (it.hasNext()) {
            ((Paragraph) it.next()).zzZYj().zzYpk();
        }
    }

    public final void zzYkd() {
        Table parentTable = getParentTable();
        Table table = new Table(parentTable.getDocument());
        parentTable.zzYD(table);
        Node node = this;
        while (node != null) {
            Node nextSibling = node.getNextSibling();
            node.remove();
            table.zzA(node);
            node = nextSibling;
        }
    }

    public final void zzYke() {
        if (this.zzZsO.contains(4005)) {
            Style styleZzZ8 = getDocument().getStyles().zzZ8(this.zzZsO.zzZ7j(), false);
            if (styleZzZ8 == null || styleZzZ8.getType() != 3) {
                this.zzZsO.zzBl(11);
            }
        }
    }

    public final int zzYkg() {
        if (zzYkh()) {
            return Math.max(zzYkf().zzYmD(), 0);
        }
        return 0;
    }

    public final boolean zzYkh() {
        PreferredWidth preferredWidthZzYkf = zzYkf();
        return preferredWidthZzYkf != null && preferredWidthZzYkf.isFixed();
    }

    public final boolean zzYki() {
        if (getRowFormat().getHeadingFormat()) {
            return isFirstRow() || getPreviousRow().zzYki();
        }
        return false;
    }

    public final int zzYoQ() {
        return this.zzXGK;
    }

    public final int zzYoR() {
        return this.zzZva;
    }

    public final void zzZ(zzY6G zzy6g) {
        this.zzZsO = zzy6g;
    }

    public final zzY6G zzZYf() {
        return this.zzZsO;
    }

    @Override // com.aspose.words.CompositeNode
    public final String zzZYp() {
        return ControlChar.CELL;
    }

    public final void zzqt(int i) {
        this.zzXGK = i;
    }

    public final void zzqu(int i) {
        this.zzZva = i;
    }

    public final boolean zzz(Row row) {
        if (!this.zzZsO.zzE(row.zzZsO)) {
            return false;
        }
        if (!this.zzZsO.isFloating() && !getParentTable().zzhk()) {
            Cell firstCell = getFirstCell();
            Cell firstCell2 = row.getFirstCell();
            if (com.aspose.words.internal.zzZ4.zzY(firstCell, firstCell2)) {
                Paragraph paragraph = (Paragraph) firstCell.getChild(8, 0, true);
                Paragraph paragraph2 = (Paragraph) firstCell2.getChild(8, 0, true);
                if (com.aspose.words.internal.zzZ4.zzY(paragraph, paragraph2)) {
                    return paragraph.zzqw(StyleIdentifier.BIBLIOGRAPHY).zzO(paragraph2.zzqw(StyleIdentifier.BIBLIOGRAPHY));
                }
            }
        }
        return true;
    }

    @Override // com.aspose.words.CompositeNode, com.aspose.words.Node
    public final Node zzZ(boolean z, zzZA5 zzza5) {
        Row row = (Row) super.zzZ(z, zzza5);
        row.zzZsO = (zzY6G) this.zzZsO.zzbn();
        row.zzYS6 = null;
        row.zzXxk = null;
        return row;
    }

    public Row(DocumentBase documentBase, zzY6G zzy6g) {
        super(documentBase);
        this.zzZsO = zzy6g;
    }

    public final void zzZ(CellCollection cellCollection) {
        getCells().getCount();
        cellCollection.getCount();
        for (int i = 0; i < cellCollection.getCount(); i++) {
            zzWP zzwpZz6G = getCells().get(i).zz6G();
            if (zzwpZz6G != null) {
                cellCollection.get(i).zzZ((zzWP) zzwpZz6G.zzbn());
            }
        }
    }
}
