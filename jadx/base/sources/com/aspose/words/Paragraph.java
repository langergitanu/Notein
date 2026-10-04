package com.aspose.words;

import com.aspose.words.ref.RefBoolean;
import com.aspose.words.ref.RefDouble;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class Paragraph extends CompositeNode<Node> implements zzZ8X, zzZ9G, zzZ9Q {
    private RunCollection zzXGG;
    private ListLabel zzXGH;
    private FrameFormat zzXGI;
    private zzYEF zzXGJ;
    private int zzXGK;
    private ParagraphFormat zzYS5;
    private ListFormat zzYoh;
    private zzYMX zzZsQ;
    private int zzZva;

    public Paragraph(DocumentBase documentBase) {
        this(documentBase, new zzYMX(), new zzYEF());
    }

    private void zzYoP() {
        if (getDocument() == null || getParentSection() == null || getDocument().getNodeType() != 1) {
            return;
        }
        zzY40 zzy40 = new zzY40();
        zzy40.visitDocumentStart((Document) getDocument());
        if (getParentStory().getNodeType() == 3) {
            zzy40.visitBodyStart((Body) getParentStory());
        } else {
            zzy40.visitHeaderFooterStart((HeaderFooter) getParentStory());
        }
        zzy40.visitParagraphStart(this);
    }

    private boolean zzYoZ() {
        Row parentRow;
        TableStyle tableStyle;
        Cell cellZzZex = zzZex();
        return (cellZzZex == null || (parentRow = cellZzZex.getParentRow()) == null || parentRow.getParentTable() == null || (tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(getDocument().getStyles().zzZ8(getParentTable().zzZ7j(), false), TableStyle.class)) == null || tableStyle.getStyleIdentifier() == 105) ? false : true;
    }

    private Style zzYp6() {
        return getDocument().getStyles().zzVp(this.zzXGJ.zzZ7j(), 10);
    }

    private boolean zzYw(Paragraph paragraph) {
        return this.zzZsQ.zzO(paragraph.zzZsQ);
    }

    private zzYEF zzs(Node node) {
        if (node == null) {
            if (getRuns().getCount() > 0) {
                return getRuns().get(getRuns().getCount() - 1).zzZYh();
            }
        } else if ((node instanceof Run) && node.getParentNode() == this) {
            return ((Run) node).zzZYh();
        }
        return this.zzXGJ;
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return acceptCore(documentVisitor);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptEnd(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitParagraphEnd(this);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptStart(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitParagraphStart(this);
    }

    public Field appendField(int i, boolean z) throws Exception {
        return insertField(i, z, (Node) null, true);
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public void clearParaAttrs() {
        this.zzZsQ.clear();
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void clearRunAttrs() {
        this.zzXGJ.clear();
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedParaAttr(int i) {
        return zzWn(i, 0);
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedRunAttr(int i) {
        Object objZzZa = zzYp6().zzZa(i, false);
        return objZzZa != null ? objZzZa : zzqy(0).zzZa(i, true);
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public Object fetchParaAttr(int i) {
        return zzWm(i, 0);
    }

    public boolean getBreakIsStyleSeparator() {
        return zzZ7R.zzW(this.zzXGJ, 130) && zzZ7R.zzW(this.zzXGJ, 10);
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public zzZV8 getDeleteRevision() {
        return this.zzXGJ.getDeleteRevision();
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectParaAttr(int i) {
        return this.zzZsQ.zzPk(i);
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectRunAttr(int i) {
        return getDirectRunAttr(i, 0);
    }

    public TabStop[] getEffectiveTabStops() {
        zzYMX zzymxZzqw = zzqw(0);
        int count = zzymxZzqw.contains(EditingLanguage.GUARANI) ? zzymxZzqw.getTabStops().getCount() : 0;
        TabStop[] tabStopArr = new TabStop[count];
        for (int i = 0; i < count; i++) {
            tabStopArr[i] = zzymxZzqw.getTabStops().get(i).zzY0F();
        }
        return tabStopArr;
    }

    public FrameFormat getFrameFormat() {
        if (this.zzXGI == null) {
            this.zzXGI = new FrameFormat(this);
        }
        return this.zzXGI;
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public zzZV8 getInsertRevision() {
        return this.zzXGJ.getInsertRevision();
    }

    public ListFormat getListFormat() {
        if (this.zzYoh == null) {
            this.zzYoh = new ListFormat(this, this, getDocument().getLists());
        }
        return this.zzYoh;
    }

    public ListLabel getListLabel() {
        if (this.zzXGH == null) {
            this.zzXGH = new ListLabel(this);
        }
        return this.zzXGH;
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public zzYX5 getMoveFromRevision() {
        return this.zzXGJ.getMoveFromRevision();
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public zzYX5 getMoveToRevision() {
        return this.zzXGJ.getMoveToRevision();
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 8;
    }

    public Font getParagraphBreakFont() {
        return new Font(this, getDocument());
    }

    public ParagraphFormat getParagraphFormat() {
        if (this.zzYS5 == null) {
            this.zzYS5 = new ParagraphFormat(this, getDocument().getStyles());
        }
        return this.zzYS5;
    }

    public final Row getParentRow() {
        if (zzZex() != null) {
            return zzZex().getParentRow();
        }
        return null;
    }

    public Section getParentSection() {
        return (Section) getAncestor(2);
    }

    public Story getParentStory() {
        return (Story) getAncestor(Story.class);
    }

    public final Table getParentTable() {
        if (getParentRow() != null) {
            return getParentRow().getParentTable();
        }
        return null;
    }

    public RunCollection getRuns() {
        if (this.zzXGG == null) {
            this.zzXGG = new RunCollection(this);
        }
        return this.zzXGG;
    }

    @Override // com.aspose.words.CompositeNode, com.aspose.words.Node
    public String getText() {
        return super.getText();
    }

    public final boolean hasRevisions() {
        return this.zzXGJ.hasRevisions() || this.zzZsQ.hasRevisions() || this.zzZsQ.zzYpJ();
    }

    public Field insertField(int i, boolean z, Node node, boolean z2) throws Exception {
        return zzZR9.zzZ(i, z, zzs(node), this, node, z2);
    }

    public boolean isDeleteRevision() {
        return this.zzXGJ.zzYrW();
    }

    public boolean isEndOfCell() {
        CompositeNode compositeNodeZzYBd = zzYBd();
        return (compositeNodeZzYBd instanceof Cell) && compositeNodeZzYBd.zzZYs() == this;
    }

    public boolean isEndOfDocument() {
        if (!isEndOfSection()) {
            return false;
        }
        Node lastChild = getDocument().getLastChild();
        while (lastChild != null) {
            if (lastChild instanceof Section) {
                return lastChild == getParentSection();
            }
            lastChild = lastChild.getPreviousSibling();
        }
        return true;
    }

    public boolean isEndOfHeaderFooter() {
        Story parentStory = getParentStory();
        return (parentStory instanceof HeaderFooter) && parentStory.zzZYs() == this;
    }

    public boolean isEndOfSection() {
        Story parentStory = getParentStory();
        return parentStory != null && parentStory.getStoryType() == 1 && this == parentStory.zzZYs();
    }

    public boolean isFormatRevision() {
        return this.zzZsQ.zz6D();
    }

    public boolean isInCell() {
        return zzYBd() instanceof Cell;
    }

    public boolean isInsertRevision() {
        return this.zzXGJ.zzYrV();
    }

    public boolean isListItem() {
        return zzYoU();
    }

    public boolean isMoveFromRevision() {
        return this.zzXGJ.zzXS4();
    }

    public boolean isMoveToRevision() {
        return this.zzXGJ.zzXS3();
    }

    public int joinRunsWithSameFormatting() {
        return zzZ(this, new StringBuilder());
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public void removeMoveRevisions() {
        this.zzXGJ.remove(13);
        this.zzXGJ.remove(15);
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public void removeParaAttr(int i) {
        this.zzZsQ.remove(i);
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void removeRunAttr(int i) {
        this.zzXGJ.remove(i);
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public void setDeleteRevision(zzZV8 zzzv8) {
        this.zzXGJ.zzQ(12, zzzv8);
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public void setInsertRevision(zzZV8 zzzv8) {
        this.zzXGJ.zzQ(14, zzzv8);
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public void setMoveFromRevision(zzYX5 zzyx5) {
        this.zzXGJ.zzQ(13, zzyx5);
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public void setMoveToRevision(zzYX5 zzyx5) {
        this.zzXGJ.zzQ(15, zzyx5);
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public void setParaAttr(int i, Object obj) {
        this.zzZsQ.zzQ(i, obj);
        if (i == 1155 || i == 1165 || i == 1175 || i == 1205 || i == 1225) {
            zzYoP();
        }
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void setRunAttr(int i, Object obj) {
        this.zzXGJ.zzQ(i, obj);
    }

    public final void zzC(zzYEF zzyef) {
        this.zzXGJ = zzyef;
    }

    public final ListLevel zzRB(boolean z) {
        int iIntValue = ((Integer) zzWm(EditingLanguage.KASHMIRI_ARABIC, z ? 1 : 0)).intValue();
        if (iIntValue == 0) {
            return null;
        }
        return getDocument().getLists().zzxv(iIntValue).zzxw(((Integer) zzWm(EditingLanguage.GALICIAN, z ? 1 : 0)).intValue());
    }

    public final List zzRC(boolean z) {
        int iIntValue = ((Integer) zzWm(EditingLanguage.KASHMIRI_ARABIC, z ? 1 : 0)).intValue();
        if (iIntValue == 0) {
            return null;
        }
        return getDocument().getLists().zzxv(iIntValue);
    }

    public final Run zzRD(boolean z) {
        Run run = null;
        for (Node nodeZzZYv = zzZYv(); nodeZzZYv != null; nodeZzZYv = nodeZzZYv.zzYB7()) {
            if (nodeZzZYv.getNodeType() == 21 && (!z || !com.aspose.words.internal.zzZKN.zzU3(nodeZzZYv.getText()))) {
                run = (Run) nodeZzZYv;
            }
        }
        return run;
    }

    @Override // com.aspose.words.CompositeNode
    public final boolean zzT(Node node) {
        Shape shape;
        Shape shape2 = (Shape) com.aspose.words.internal.zzZKW.zzZ(node, Shape.class);
        if (shape2 == null || !((shape2.zzY9P() || shape2.getShapeType() == 20) && (shape = (Shape) getAncestor(18)) != null && shape.zzY9P())) {
            return zzYVU.zzXO(node);
        }
        return false;
    }

    public final Object zzWm(int i, int i2) {
        Object objZzVQ = this.zzZsQ.zzVQ(i, i2);
        return objZzVQ != null ? objZzVQ : zzWn(i, i2);
    }

    public final Object zzWn(int i, int i2) {
        Object objZzX;
        ListLevel listLevelZzZ = getDocument().getLists().zzZ(this.zzZsQ, i2);
        if (listLevelZzZ != null) {
            Object objZzPk = listLevelZzZ.zzZYj().zzPk(i);
            if (objZzPk != null) {
                return objZzPk;
            }
        } else {
            Object objZzVQ = this.zzZsQ.zzVQ(EditingLanguage.KASHMIRI_ARABIC, i2);
            if (objZzVQ != null && ((Integer) objZzVQ).intValue() == 0 && zzYMX.zzqC(i)) {
                return 0;
            }
        }
        Object objZzVv = zzqy(i2).zzVv(i, i2);
        return objZzVv != null ? objZzVv : (!zzYoZ() || (objZzX = ((TableStyle) getParentTable().getStyle()).zzX(i, zzZex())) == null) ? getDocument().getStyles().zzY36().zzPj(i) : objZzX;
    }

    public final void zzY(zzYMX zzymx, int i) {
        zzYMX zzymx2;
        Cell cellZzZex;
        Table parentTable;
        TableStyle tableStyle;
        boolean z = (i & 64) != 0;
        boolean z2 = (i & 1) != 0;
        boolean z3 = (i & 128) == 0;
        int i2 = i & (-129);
        if (z2) {
            getDocument().getStyles().zzY36().zzZ(zzymx, z);
        }
        if ((i & 4) != 0 && (cellZzZex = zzZex()) != null && (parentTable = cellZzZex.getParentRow().getParentTable()) != null && (tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(parentTable.getStyle(), TableStyle.class)) != null) {
            tableStyle.zzZ(cellZzZex, zzymx);
        }
        zzYMX zzymxZzqD = this.zzZsQ.zzqD(i2);
        if ((i & 16) != 0 && this.zzZsQ.zz6D()) {
            zzymx.zzZ((zzZMK) this.zzZsQ.zzYsN().deepCloneComplexAttr());
        }
        Style styleZzVp = getDocument().getStyles().zzVp(zzymxZzqD.zzZ7j(), 0);
        if (z2) {
            i2 = i & (-130);
        }
        if (z) {
            i2 &= -65;
        }
        styleZzVp.zzY(zzymx, i2);
        if (zzymx.getListId() != zzymxZzqD.getListId() || zzymx.zzZ0C() != zzymxZzqD.zzZ0C()) {
            if (zzymxZzqD.contains(EditingLanguage.GALICIAN) || !zzymx.contains(EditingLanguage.GALICIAN)) {
                zzymx2 = zzymxZzqD;
            } else {
                zzymx2 = (zzYMX) zzymxZzqD.zzbn();
                zzymx2.zzQ(EditingLanguage.GALICIAN, zzymx.get(EditingLanguage.GALICIAN));
            }
            getDocument().getLists().zzZ(zzymx2, zzymx);
        }
        if ((i & 8) != 0 && this.zzZsQ.contains(1585)) {
            getDocument().zzZq2().zzZ(this.zzZsQ, zzymx, getParentTable() == null);
        }
        if (z3) {
            zzymxZzqD.zzY(zzymx);
        }
        zzymxZzqD.zzN(zzymx);
        if (zzymxZzqD.zzYpL()) {
            if (!zzymxZzqD.contains(EditingLanguage.CENTRAL_KURDISH_IRAQ)) {
                zzymx.zzwb(0);
            }
            if (!zzymxZzqD.contains(1160)) {
                zzymx.zzwa(0);
            }
            if (!zzymxZzqD.contains(1165)) {
                if (z) {
                    zzymx.set(1165, 0);
                } else {
                    zzymx.remove(1165);
                }
            }
            if (!zzymxZzqD.contains(1175)) {
                if (z) {
                    zzymx.set(1175, 0);
                } else {
                    zzymx.remove(1175);
                }
            }
        }
        if (zzYBd() instanceof Shape) {
            zzymx.zzYpk();
        }
        if ((i & 2) != 0) {
            zzymx.zzYpj();
        }
    }

    public final Run zzYVe() {
        return (Run) getChild(21, 0, false);
    }

    public final int zzYoQ() {
        return this.zzXGK;
    }

    public final int zzYoR() {
        return this.zzZva;
    }

    public final int zzYoS() {
        zzZK1 zzzk1ZzA8 = getDocument().zzZq2().zzA8(this.zzZsQ.zzYps());
        int i = 0;
        while (zzzk1ZzA8 != null) {
            if (zzzk1ZzA8.zzZ4j() == 1) {
                i++;
            }
            zzzk1ZzA8 = getDocument().zzZq2().zzA8(zzzk1ZzA8.getParentId());
        }
        return i;
    }

    public final boolean zzYoT() {
        return ((Integer) zzWm(EditingLanguage.KASHMIRI_ARABIC, 1)).intValue() != 0;
    }

    public final boolean zzYoU() {
        return ((Integer) zzWm(EditingLanguage.KASHMIRI_ARABIC, 0)).intValue() != 0;
    }

    public final boolean zzYoV() {
        Iterator<T> it = getChildNodes(0, false).iterator();
        while (it.hasNext()) {
            if (!zzYVU.zztq(((Node) it.next()).getNodeType())) {
                return false;
            }
        }
        return true;
    }

    public final boolean zzYoW() {
        for (Node firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (zzYVU.zzXV(firstChild)) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzYoX() {
        return zzYoT() && getListLabel().zzYOB();
    }

    public final boolean zzYoY() throws Exception {
        CompositeNode compositeNodeZzYB5 = zzYB5();
        if (!(compositeNodeZzYB5 instanceof Paragraph)) {
            return false;
        }
        Paragraph paragraph = (Paragraph) compositeNodeZzYB5;
        ParagraphFormat paragraphFormat = getParagraphFormat();
        ParagraphFormat paragraphFormat2 = paragraph.getParagraphFormat();
        if (!paragraphFormat2.getPageBreakBefore() && paragraph.zzZsQ.zzYps() == this.zzZsQ.zzYps()) {
            return Math.min(paragraphFormat.getFirstLineIndent(), 0.0d) + paragraphFormat.getLeftIndent() == Math.min(paragraphFormat2.getFirstLineIndent(), 0.0d) + paragraphFormat2.getLeftIndent() && paragraphFormat.getRightIndent() == paragraphFormat2.getRightIndent() && paragraphFormat.getBorders().getByBorderType(1).equals(paragraphFormat2.getBorders().getByBorderType(1)) && paragraphFormat.getBorders().getByBorderType(2).equals(paragraphFormat2.getBorders().getByBorderType(2)) && paragraphFormat.getBorders().getByBorderType(3).equals(paragraphFormat2.getBorders().getByBorderType(3)) && paragraphFormat.getBorders().getByBorderType(0).equals(paragraphFormat2.getBorders().getByBorderType(0)) && zzYw(paragraph);
        }
        return false;
    }

    public final boolean zzYp0() {
        CompositeNode compositeNodeZzYBd = zzYBd();
        return (compositeNodeZzYBd instanceof Shape) && compositeNodeZzYBd.zzZYs() == this;
    }

    public final boolean zzYp1() {
        CompositeNode compositeNodeZzYBd = zzYBd();
        return (compositeNodeZzYBd instanceof zzZMS) && this == compositeNodeZzYBd.zzZYs();
    }

    public final boolean zzYp2() {
        CompositeNode compositeNodeZzYBd = zzYBd();
        return (compositeNodeZzYBd instanceof Footnote) && this == compositeNodeZzYBd.zzZYs();
    }

    public final boolean zzYp3() {
        CompositeNode compositeNodeZzYBd = zzYBd();
        return (compositeNodeZzYBd instanceof Comment) && this == compositeNodeZzYBd.zzZYs();
    }

    public final void zzYp4() {
        for (int count = this.zzZsQ.getCount() - 1; count >= 0; count--) {
            int iZzT3 = this.zzZsQ.zzT3(count);
            if (iZzT3 != 1000 && iZzT3 != 1120 && iZzT3 != 1110 && this.zzZsQ.zzVQ(iZzT3, 0).equals(zzWn(iZzT3, 0))) {
                this.zzZsQ.removeAt(count);
            }
        }
    }

    public final zzYEF zzYp5() {
        return this.zzXGJ;
    }

    public final Style zzYp7() {
        return zzqy(0);
    }

    public final boolean zzYp8() {
        return zzYB4() == null && getParentNode().getNodeType() == 3 && !getParentSection().zzYB3();
    }

    public final boolean zzYp9() {
        return isEndOfCell() && zzZex().isLastCell();
    }

    public final boolean zzYpa() {
        CompositeNode parentNode = getParentNode();
        if (parentNode == null) {
            return false;
        }
        return zzYVU.zzXM(parentNode) ? isInCell() && zzYF(zzYBd().getFirstChild()) : isInCell() && this == parentNode.zzZYt();
    }

    public final void zzYx(Paragraph paragraph) {
        if (paragraph.getListLabel().zzYOA() != null && paragraph.getListLabel().zzYOD() != null) {
            getListLabel().zzZ(paragraph.getListLabel().zzYOA(), paragraph.getListLabel().zzZ0Q(), paragraph.getListLabel().zzYOD().zzYO2(), 0);
        }
        if (paragraph.getListLabel().zzYOy() == null || paragraph.getListLabel().zzYOC() == null) {
            return;
        }
        getListLabel().zzZ(paragraph.getListLabel().zzYOy(), paragraph.getListLabel().zzYOw(), paragraph.getListLabel().zzYOC().zzYO2(), 1);
    }

    public final void zzZ(zzYMX zzymx) {
        this.zzZsQ = zzymx;
    }

    public final boolean zzZ0R() {
        return zzYoU() && getListLabel().zzR2();
    }

    public final boolean zzZ7D() {
        Story parentStory = getParentStory();
        return parentStory != null && parentStory.getStoryType() == 1;
    }

    public final zzYMX zzZYj() {
        return this.zzZsQ;
    }

    @Override // com.aspose.words.CompositeNode
    public final String zzZYp() {
        return isEndOfCell() ? ControlChar.CELL : isEndOfSection() ? ControlChar.SECTION_BREAK : ControlChar.PARAGRAPH_BREAK;
    }

    public final Cell zzZex() {
        return (Cell) com.aspose.words.internal.zzZKW.zzZ(zzYBd(), Cell.class);
    }

    public final void zzqt(int i) {
        this.zzXGK = i;
    }

    public final void zzqu(int i) {
        this.zzZva = i;
    }

    public final zzYEF zzqv(int i) {
        zzYEF zzyef = new zzYEF();
        zzZ7R.zzZ(this, zzyef, i);
        return zzyef;
    }

    public final zzYMX zzqw(int i) {
        TabStop tabStopZzZB;
        zzYMX zzymx = new zzYMX();
        zzY(zzymx, i);
        if ((i & 256) != 0 && (tabStopZzZB = zzZ5Y.zzZB(this)) != null) {
            if (!zzymx.zzVE(EditingLanguage.GUARANI)) {
                zzymx.zzQ(EditingLanguage.GUARANI, new TabStopCollection());
            }
            zzymx.getTabStops().add(tabStopZzZB);
        }
        return zzymx;
    }

    public final void zzqx(int i) {
        ListLabel listLabel = this.zzXGH;
        if (listLabel != null) {
            listLabel.zzZ(null, null, null, i);
        }
    }

    public final Style zzqy(int i) {
        Object objZzVQ = this.zzZsQ.zzVQ(1000, i);
        return getDocument().getStyles().zzVp(objZzVQ != null ? ((Integer) objZzVQ).intValue() : 0, 0);
    }

    public final int zzw(StringBuilder sb) {
        return zzZ(this, sb);
    }

    public Paragraph(DocumentBase documentBase, zzYMX zzymx, zzYEF zzyef) {
        super(documentBase);
        this.zzZsQ = zzymx;
        this.zzXGJ = zzyef;
    }

    public Field appendField(String str) throws Exception {
        return insertField(str, null, true);
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectParaAttr(int i, int i2) {
        return this.zzZsQ.zzVQ(i, i2);
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectRunAttr(int i, int i2) {
        return this.zzXGJ.zzVQ(i, i2);
    }

    public Field insertField(String str, Node node, boolean z) throws Exception {
        return zzZR9.zzZ(str, zzs(node), this, node, z);
    }

    @Override // com.aspose.words.CompositeNode, com.aspose.words.Node
    public final Node zzZ(boolean z, zzZA5 zzza5) {
        Paragraph paragraph = (Paragraph) super.zzZ(z, zzza5);
        paragraph.zzZsQ = (zzYMX) this.zzZsQ.zzbn();
        paragraph.zzXGJ = (zzYEF) this.zzXGJ.zzbn();
        paragraph.zzYS5 = null;
        paragraph.zzXGI = null;
        paragraph.zzYoh = null;
        paragraph.zzXGH = null;
        paragraph.zzXGG = null;
        return paragraph;
    }

    public Field appendField(String str, String str2) {
        return insertField(str, str2, (Node) null, true);
    }

    public Field insertField(String str, String str2, Node node, boolean z) {
        return zzZR9.zzZ(str, str2, zzs(node), this, node, z);
    }

    public final void zzZ(RefDouble refDouble, RefDouble refDouble2, RefBoolean refBoolean) {
        refDouble.set(2.147483647E9d);
        refDouble2.set(0.0d);
        refBoolean.set(false);
        for (Node nodeZzZYv = zzZYv(); nodeZzZYv != null; nodeZzZYv = nodeZzZYv.zzYB7()) {
            if (nodeZzZYv instanceof Inline) {
                zzZ((Inline) nodeZzZYv, refDouble, refDouble2, refBoolean);
            }
        }
        if (refDouble2.get() == 0.0d) {
            zzZ(this, refDouble, refDouble2, refBoolean);
        }
    }

    private static void zzZ(zzZ9G zzz9g, RefDouble refDouble, RefDouble refDouble2, RefBoolean refBoolean) {
        Object directRunAttr = zzz9g.getDirectRunAttr(190);
        double dIntValue = ((double) ((Integer) (directRunAttr != null ? directRunAttr : zzz9g.fetchInheritedRunAttr(190))).intValue()) / 2.0d;
        refDouble.set(Math.min(dIntValue, refDouble.get()));
        refDouble2.set(Math.max(dIntValue, refDouble2.get()));
        if (refBoolean.get()) {
            return;
        }
        boolean z = false;
        refBoolean.set(directRunAttr != null);
        if (refBoolean.get()) {
            return;
        }
        Object directRunAttr2 = zzz9g.getDirectRunAttr(50);
        if (directRunAttr2 != null && ((Integer) directRunAttr2).intValue() != 10) {
            z = true;
        }
        refBoolean.set(z);
    }

    private static int zzZ(CompositeNode compositeNode, StringBuilder sb) {
        int i = 0;
        Run run = null;
        zzYEF zzyefZzZ = null;
        for (Node firstChild = compositeNode.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() == 21) {
                Run run2 = (Run) firstChild;
                if (run != null) {
                    zzYEF zzyefZzZ2 = zzZ7R.zzZ(run2, 33);
                    if (zzyefZzZ == null) {
                        zzyefZzZ = zzZ7R.zzZ(run, 33);
                    }
                    if (zzYEF.zzW(zzyefZzZ2, zzyefZzZ)) {
                        if (sb.length() == 0) {
                            com.aspose.words.internal.zzZNH.zzU(sb, run.getText());
                        }
                        com.aspose.words.internal.zzZNH.zzU(sb, run2.getText());
                        i++;
                        compositeNode.removeChild(run);
                    } else {
                        zzZ(run, sb);
                        zzyefZzZ = null;
                    }
                }
                run = run2;
            } else {
                zzZ(run, sb);
                run = null;
                zzyefZzZ = null;
            }
            if (firstChild.getNodeType() == 28) {
                zzZ((StructuredDocumentTag) firstChild, sb);
            }
        }
        zzZ(run, sb);
        return i;
    }

    private static void zzZ(Run run, StringBuilder sb) {
        if (run == null || sb.length() == 0) {
            return;
        }
        run.setText(sb.toString());
        sb.setLength(0);
    }
}
