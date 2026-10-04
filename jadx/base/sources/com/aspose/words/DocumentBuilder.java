package com.aspose.words;

import android.graphics.Bitmap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.penkit.tools.DrawToolFactory;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class DocumentBuilder implements zzZ9G, zzZ9J, zzZ9Q, zzZD5 {
    private boolean zzYS0;
    private int zzYS1;
    private com.aspose.words.internal.zzZQC<zzY70> zzYS4;
    private ParagraphFormat zzYS5;
    private RowFormat zzYS6;
    private com.aspose.words.internal.zzZQC<zzZ> zzYS7;
    private com.aspose.words.internal.zzZQC<zzYMX> zzYS8;
    private com.aspose.words.internal.zzZQC<zzYEF> zzYS9;
    private Node zzYSa;
    private Node zzYSb;
    private Document zzYTQ;
    private CellFormat zzZAf;
    private Font zzZEt;
    private zzYEF zzZsP;
    private zzYMX zzZsQ;
    private zzY6G zzZsO = zzY6G.zzXXu();
    private zzWP zzZAg = new zzWP();
    private int zzYS3 = 0;
    private int zzYS2 = -1;

    public static class zzZ {
        private zzYEF zzYRZ;
        private zzYEF zzZsP;

        public zzZ(zzYEF zzyef, zzYEF zzyef2) {
            this.zzZsP = zzyef;
            this.zzYRZ = zzyef2;
        }

        public final zzYEF zzZYh() {
            return this.zzZsP;
        }

        public final zzYEF zzZpq() {
            return this.zzYRZ;
        }
    }

    public DocumentBuilder() throws Exception {
        setDocument(new Document());
    }

    private zzWP zz6G() {
        return (zzZpy() == null || zzZpy().zzXZS() == 3) ? (getCurrentParagraph() == null || !getCurrentParagraph().isInCell()) ? this.zzZAg : getCurrentParagraph().zzZex().zz6G() : this.zzZAg;
    }

    private void zzA(String str, boolean z) {
        int level;
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: text");
        }
        int i = 0;
        if (isAtEndOfStructuredDocumentTag() && (level = ((StructuredDocumentTag) zzZpr()).getLevel()) != 1) {
            if (level != 2) {
                throw new IllegalStateException("Cannot insert text at this cursor position.");
            }
            insertParagraph();
            z = false;
        }
        String strZzyv = zzY0C.zzyv(str);
        while (i <= strZzyv.length()) {
            int iIndexOf = strZzyv.indexOf(13, i);
            if (iIndexOf == -1) {
                int length = strZzyv.length() - i;
                if (length > 0) {
                    zzO8(strZzyv.substring(i, length + i));
                }
                if (z) {
                    insertParagraph();
                    return;
                }
                return;
            }
            int i2 = iIndexOf - i;
            if (i2 > 0) {
                zzO8(strZzyv.substring(i, i2 + i));
            }
            int i3 = this.zzYS3;
            if (i3 == 0) {
                insertParagraph();
            } else {
                if (i3 != 1) {
                    throw new IllegalArgumentException();
                }
                zzO6(ControlChar.PARAGRAPH_BREAK);
            }
            i = iIndexOf + 1;
        }
    }

    private void zzFT(int i) {
        insertParagraph();
        zzY81 zzy81 = new zzY81(getDocument());
        try {
            Section section = new Section(this.zzYTQ, (zzYCZ) getCurrentSection().zzYvR().zzbn());
            section.getPageSetup().setSectionStart(i);
            section.appendChild(new Body(this.zzYTQ));
            this.zzYTQ.insertAfter(section, getCurrentSection());
            section.getBody().zzY(getCurrentParagraph(), null, section.getBody().getLastChild());
        } finally {
            zzy81.dispose();
        }
    }

    private Run zzO6(String str) {
        Run run = new Run(this.zzYTQ, str, zzZpG());
        insertNode(run);
        return run;
    }

    private boolean zzO7(String str) {
        boolean bidi = getFont().getBidi();
        for (int i = 0; i < str.length(); i++) {
            int iZzc = com.aspose.words.internal.zzZVU.zzc(str.charAt(i));
            boolean z = iZzc == 0;
            boolean z2 = iZzc == 1 || iZzc == 2;
            if ((bidi && z) || (!bidi && z2)) {
                return true;
            }
        }
        return false;
    }

    private void zzO8(String str) {
        if (!zzO7(str)) {
            zzO6(str);
            return;
        }
        for (com.aspose.words.internal.zzY3 zzy3 : new com.aspose.words.internal.zzY4(str, getParagraphFormat().getBidi() ? 1 : 0, null).zzK(getParagraphFormat().getBidi())) {
            zzZU zzzuZzYW = zzZU.zzYW(zzy3.zzXn());
            zzYEF zzyefZzZpG = zzZpG();
            zzyefZzZpG.zzQ(StyleIdentifier.BIBLIOGRAPHY, zzzuZzYW);
            if (zzy3.zzXj()) {
                zzyefZzZpG.setLocaleIdBi(EditingLanguage.HEBREW);
            }
            insertNode(new Run(this.zzYTQ, zzy3.getText(), zzyefZzZpG));
        }
    }

    private static String zzOa(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != 11 && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != '\f') {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    private boolean zzWy(boolean z) {
        boolean z2 = getCurrentStory().getStoryType() != 1;
        boolean z3 = zzZpy() != null;
        if (z) {
            if (z2) {
                throw new IllegalStateException("Cannot insert the requested break outside of the main story.");
            }
            if (z3) {
                throw new IllegalStateException("Cannot insert the requested break inside a table.");
            }
        }
        return z || !(z2 || z3);
    }

    private void zzX(CompositeNode compositeNode, int i) {
        zzZYT zzzytZzp = zzZYT.zzp(compositeNode);
        while (true) {
            if (zzzytZzp.getNode() == compositeNode && zzzytZzp.zzZou()) {
                throw new IllegalStateException("The character index is too small.");
            }
            Node node = zzzytZzp.getNode();
            i += node.isComposite() ? ((CompositeNode) node).zzZYp().length() : node.zz0R();
            if (i >= 0) {
                zzZ((CompositeNode) null, node);
                this.zzYS1 = i;
                return;
            } else {
                while (zzzytZzp.zzZ(null, false, true, true, false, true) && zzzytZzp.zzZou() && zzzytZzp.getNode() != compositeNode) {
                }
            }
        }
    }

    private Row zzXU(int i, int i2) {
        Table table = (Table) getCurrentStory().getChildNodes(5, true).get(i);
        if (table == null) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: tableIndex");
        }
        Row row = (Row) table.getChild(6, i2, false);
        if (row != null) {
            return row;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: rowIndex");
    }

    private Shape zzY(com.aspose.words.internal.zzZOP zzzop, String str, String str2, String str3) throws Exception {
        zzYOA zzyoaZzD9 = zzYOA.zzD9(str);
        return zzZ((String) null, false, zzZ(str2, str3, zzyoaZzD9), zzyoaZzD9.zzXJ9, zzYO6.zzZ(zzzop, str, true));
    }

    private Shape zzYo(byte[] bArr) throws Exception {
        if (bArr == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: imageBytes");
        }
        Shape shape = new Shape((DocumentBase) this.zzYTQ, (byte) 1);
        shape.setShapeType(75);
        shape.zzZ(zzZpG());
        shape.getImageData().setImageBytes(bArr);
        shape.setRelativeHorizontalPosition(2);
        shape.setLeft(0.0d);
        shape.setRelativeVerticalPosition(2);
        shape.setTop(0.0d);
        shape.setWrapType(0);
        insertNode(shape);
        ImageSize imageSize = shape.getImageData().getImageSize();
        shape.zze(imageSize.getWidthPoints(), imageSize.getHeightPoints());
        return shape;
    }

    private void zzZ(Section section, int i, int i2, int i3) {
        Story body;
        section.ensureMinimum();
        if (i == 1) {
            body = section.getBody();
        } else {
            int iZzhB = zzY0C.zzhB(i);
            HeaderFooter byHeaderFooterType = section.getHeadersFooters().getByHeaderFooterType(iZzhB);
            body = byHeaderFooterType == null ? (Story) section.appendChild(new HeaderFooter(this.zzYTQ, iZzhB)) : byHeaderFooterType;
            if (body.getFirstParagraph() == null) {
                body.appendChild(new Paragraph(this.zzYTQ));
            }
        }
        zzZ(body, i2, i3);
    }

    private zzY6G zzZYf() {
        return (zzZpy() == null || zzZpy().zzXZS() != 1) ? (getCurrentParagraph() == null || !getCurrentParagraph().isInCell()) ? this.zzZsO : getCurrentParagraph().getParentRow().zzZYf() : this.zzZsO;
    }

    private zzYMX zzZYj() {
        if (getCurrentParagraph() != null) {
            return getCurrentParagraph().zzZYj();
        }
        if (this.zzZsQ == null) {
            this.zzZsQ = new zzYMX();
        }
        return this.zzZsQ;
    }

    private Shape zzZk(String str, String str2) throws Exception {
        return zzYo(new com.aspose.words.internal.zzEU(str, str2, getDocument().zzZqy()).zzEc());
    }

    private void zzZpA() {
        int i = this.zzYS1;
        if (i == 0) {
            return;
        }
        this.zzYS1 = 0;
        Run run = (Run) com.aspose.words.internal.zzZKW.zzZ(getCurrentNode(), Run.class);
        if (run != null) {
            run.zzng(i);
        }
    }

    private boolean zzZpM() {
        if (zzZpr().getParentNode().getNodeType() != 28) {
            return false;
        }
        int sdtType = ((StructuredDocumentTag) zzZpr().getParentNode()).getSdtType();
        if (sdtType != 4) {
            if (sdtType == 5 || sdtType == 6 || sdtType == 12) {
                return true;
            }
            if (sdtType != 13) {
                return false;
            }
        }
        throw new IllegalStateException("Can not insert text into this StructuredDocumentTag.");
    }

    private void zzZpO() {
        zzZ(getCurrentParagraph().zzYp5(), true);
    }

    private boolean zzZpP() {
        Node nodeZzZpr = zzZpr();
        if (!(nodeZzZpr instanceof Inline)) {
            while (nodeZzZpr != null && !(nodeZzZpr instanceof Inline)) {
                nodeZzZpr = nodeZzZpr.getPreviousSibling();
            }
            if (nodeZzZpr == null && zzZpr().getParentNode().getNodeType() == 28) {
                zzZ(((StructuredDocumentTag) zzZpr().getParentNode()).zzY3J(), true);
                return true;
            }
        }
        if (nodeZzZpr == null) {
            nodeZzZpr = zzZpr();
            while (nodeZzZpr != null && !(nodeZzZpr instanceof Inline)) {
                nodeZzZpr = nodeZzZpr.getNextSibling();
            }
        }
        if (nodeZzZpr == null) {
            return false;
        }
        zzZ(((Inline) nodeZzZpr).zzZYh(), true);
        return true;
    }

    private Node zzZpr() {
        Node node = this.zzYSb;
        Node firstParagraph = (node == null || node.getParentNode() != null) ? this.zzYSb : this.zzYSa;
        if (firstParagraph != null && firstParagraph.zzYAY() == 2) {
            Paragraph firstParagraph2 = ((Story) firstParagraph).getFirstParagraph();
            firstParagraph = firstParagraph2 == null ? ((Section) firstParagraph.getAncestor(2)).getBody().getFirstParagraph() : firstParagraph2;
        }
        if (firstParagraph == null) {
            firstParagraph = getDocument().getFirstSection().getBody().getFirstParagraph();
        }
        this.zzYS0 = this.zzYS0 && firstParagraph != null && firstParagraph.getNodeType() == 28;
        return firstParagraph;
    }

    private com.aspose.words.internal.zzZQC<zzZ> zzZps() {
        if (this.zzYS7 == null) {
            this.zzYS7 = new com.aspose.words.internal.zzZQC<>();
        }
        return this.zzYS7;
    }

    private com.aspose.words.internal.zzZQC<zzYMX> zzZpt() {
        if (this.zzYS8 == null) {
            this.zzYS8 = new com.aspose.words.internal.zzZQC<>();
        }
        return this.zzYS8;
    }

    private com.aspose.words.internal.zzZQC<zzYEF> zzZpu() {
        if (this.zzYS9 == null) {
            this.zzYS9 = new com.aspose.words.internal.zzZQC<>();
        }
        return this.zzYS9;
    }

    private Node zzZpv() {
        if (isAtEndOfParagraph() || isAtEndOfStructuredDocumentTag()) {
            return null;
        }
        return zzZpr();
    }

    private CompositeNode zzZpw() {
        return (isAtEndOfParagraph() || isAtEndOfStructuredDocumentTag()) ? (CompositeNode) zzZpr() : zzZpr().getParentNode();
    }

    private Cell zzZpx() {
        if (getCurrentParagraph() == null) {
            return null;
        }
        return getCurrentParagraph().zzZex();
    }

    private zzY70 zzZpy() {
        if (this.zzYS4.size() > 0) {
            return this.zzYS4.peek();
        }
        return null;
    }

    private Shape zzZs(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        return zzYo(com.aspose.words.internal.zzZYQ.zzZX(zzzop));
    }

    private void zzj(int i, int i2, int i3) {
        this.zzYTQ.ensureMinimum();
        Section section = (Section) this.zzYTQ.getChild(2, i, false);
        if (section == null) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: sectionIdx");
        }
        zzZ(section, 1, i2, i3);
    }

    private void zzt(Node node) {
        this.zzYSb = node;
        if (node != null) {
            this.zzYSa = node.getParentNode();
        }
        this.zzYS0 = false;
    }

    private FormField zzu(Node node) {
        FormField formField = new FormField(this.zzYTQ, new zzZMM(), zzZpG());
        (node == null ? zzZpw() : node.getParentNode()).insertBefore(formField, node);
        return formField;
    }

    @Override // com.aspose.words.zzZD5
    @ReservedForInternalUse
    @Deprecated
    public void clearCellAttrs() {
        zz6G().clear();
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public void clearParaAttrs() {
        zzZYj().clear();
    }

    @Override // com.aspose.words.zzZ9J
    @ReservedForInternalUse
    @Deprecated
    public void clearRowAttrs() {
        zzZYf().clearRowAttrs();
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void clearRunAttrs() {
        this.zzZsP.clear();
        if (getCurrentParagraph() == null) {
            return;
        }
        if (isAtEndOfParagraph() || getCurrentParagraph().zzYoV()) {
            getCurrentParagraph().zzYp5().clear();
        }
    }

    public Row deleteRow(int i, int i2) {
        Row rowZzXU = zzXU(i, i2);
        Table parentTable = rowZzXU.getParentTable();
        if (zzZpy() != null) {
            throw new IllegalStateException("Cannot delete a table row while building a table.");
        }
        if (zzZpr().zzYF(rowZzXU)) {
            if (rowZzXU == parentTable.getLastRow()) {
                zzZ(parentTable.zzYB5(), 0);
            } else {
                moveToCell(i, i2 + 1, 0, 0);
            }
        }
        rowZzXU.remove();
        if (parentTable.getFirstRow() == null) {
            parentTable.remove();
        }
        return rowZzXU;
    }

    public BookmarkEnd endBookmark(String str) {
        BookmarkEnd bookmarkEnd = new BookmarkEnd(this.zzYTQ, str);
        insertNode(bookmarkEnd);
        return bookmarkEnd;
    }

    public BookmarkEnd endColumnBookmark(String str) {
        Cell cellZzZpx = zzZpx();
        if (cellZzZpx == null) {
            throw new IllegalStateException("A column bookmark can only be ended in a table cell.");
        }
        Bookmark bookmark = cellZzZpx.getParentRow().getParentTable().getRange().getBookmarks().get(str);
        if (bookmark == null) {
            throw new IllegalStateException("The corresponding bookmark start must be in the same table.");
        }
        int iZz6F = cellZzZpx.zz6F();
        if (bookmark.getBookmarkStart().getFirstColumn() > iZz6F) {
            throw new IllegalStateException("The end column index must be greater than or equal to the start column index.");
        }
        BookmarkEnd bookmarkEnd = new BookmarkEnd(this.zzYTQ, str);
        cellZzZpx.getParentRow().getParentTable().insertAfter(bookmarkEnd, cellZzZpx.getParentRow());
        bookmark.getBookmarkStart().zzOW(iZz6F);
        return bookmarkEnd;
    }

    public EditableRangeEnd endEditableRange() {
        int i = this.zzYS2;
        if (i == -1) {
            throw new IllegalStateException("EndEditableRange can not be called before StartEditableRange.");
        }
        EditableRangeEnd editableRangeEnd = new EditableRangeEnd(this.zzYTQ, i);
        insertNode(editableRangeEnd);
        return editableRangeEnd;
    }

    public Row endRow() {
        if (zzZpy() == null) {
            throw new IllegalStateException("Cannot end a row while not building a table.");
        }
        Row rowEndRow = zzZpy().endRow();
        Font font = this.zzZEt;
        if (font != null && font.getHidden()) {
            rowEndRow.zzZYf().zzXXd();
        }
        return rowEndRow;
    }

    public Table endTable() {
        if (zzZpy() == null) {
            throw new IllegalStateException("Cannot end a table while not building a table.");
        }
        Table tableEndTable = zzZpy().endTable();
        this.zzYS4.pop();
        return tableEndTable;
    }

    @Override // com.aspose.words.zzZD5
    @ReservedForInternalUse
    @Deprecated
    public Object fetchCellAttr(int i) {
        return zz6G().zzPj(i);
    }

    @Override // com.aspose.words.zzZD5
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedCellAttr(int i) {
        return zz6G().zzPi(i);
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedParaAttr(int i) {
        return getCurrentParagraph() != null ? getCurrentParagraph().zzWn(i, 0) : getDocument().getStyles().zzY36().zzPj(i);
    }

    @Override // com.aspose.words.zzZ9J
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedRowAttr(int i) {
        return zzZYf().zzPi(i);
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedRunAttr(int i) {
        Object objZzZa = getFont().getStyle().zzZa(i, false);
        return objZzZa != null ? objZzZa : getParagraphFormat().getStyle().zzZa(i, true);
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public Object fetchParaAttr(int i) {
        Object directParaAttr = getDirectParaAttr(i);
        return directParaAttr != null ? directParaAttr : fetchInheritedParaAttr(i);
    }

    @Override // com.aspose.words.zzZ9J
    @ReservedForInternalUse
    @Deprecated
    public Object fetchRowAttr(int i) {
        return zzZYf().zzPj(i);
    }

    public boolean getBold() {
        return getFont().getBold();
    }

    public CellFormat getCellFormat() {
        if (this.zzZAf == null) {
            this.zzZAf = new CellFormat(this);
        }
        return this.zzZAf;
    }

    public Node getCurrentNode() {
        if (isAtEndOfParagraph() || isAtEndOfStructuredDocumentTag()) {
            return null;
        }
        return zzZpr();
    }

    public Paragraph getCurrentParagraph() {
        return isAtEndOfParagraph() ? (Paragraph) zzZpr() : (Paragraph) zzZpr().getAncestor(8);
    }

    public Section getCurrentSection() {
        return (Section) getCurrentStory().getParentNode();
    }

    public Story getCurrentStory() {
        return (Story) zzZpr().getAncestor(Story.class);
    }

    public StructuredDocumentTag getCurrentStructuredDocumentTag() {
        return isAtEndOfStructuredDocumentTag() ? (StructuredDocumentTag) zzZpr() : (StructuredDocumentTag) zzZpr().getAncestor(28);
    }

    @Override // com.aspose.words.zzZD5
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectCellAttr(int i) {
        return zz6G().zzPk(i);
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectParaAttr(int i) {
        return zzZYj().zzPk(i);
    }

    @Override // com.aspose.words.zzZ9J
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectRowAttr(int i) {
        return zzZYf().zzPk(i);
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectRunAttr(int i) {
        return this.zzZsP.zzPk(i);
    }

    public Document getDocument() {
        return this.zzYTQ;
    }

    public Font getFont() {
        if (this.zzZEt == null) {
            this.zzZEt = new Font(this, getDocument());
        }
        return this.zzZEt;
    }

    public boolean getItalic() {
        return getFont().getItalic();
    }

    public ListFormat getListFormat() {
        if (getCurrentParagraph() != null) {
            return getCurrentParagraph().getListFormat();
        }
        return null;
    }

    public PageSetup getPageSetup() {
        return getCurrentSection().getPageSetup();
    }

    public ParagraphFormat getParagraphFormat() {
        if (this.zzYS5 == null) {
            this.zzYS5 = new ParagraphFormat(this, getDocument().getStyles());
        }
        return this.zzYS5;
    }

    public RowFormat getRowFormat() {
        if (this.zzYS6 == null) {
            this.zzYS6 = new RowFormat(this);
        }
        return this.zzYS6;
    }

    public int getUnderline() {
        return getFont().getUnderline();
    }

    public void insertBreak(int i) {
        zz7(i, true);
    }

    public Cell insertCell() {
        zzZpA();
        if (zzZpy() == null) {
            startTable();
        }
        if (zzZpy().zzXZS() == 1) {
            zzZpy().zzXZV();
        }
        if (zzZpy().zzXZS() == 3) {
            zzZpy().zzXZT();
        }
        return zzZpy().zzXZU();
    }

    public Shape insertChart(int i, double d, double d2) throws Exception {
        return insertChart(i, 2, 0.0d, 2, 0.0d, d, d2, 0);
    }

    public FormField insertCheckBox(String str, boolean z, int i) throws Exception {
        return insertCheckBox(str, z, z, i);
    }

    public FormField insertComboBox(String str, String[] strArr, int i) throws Exception {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: name");
        }
        if (strArr == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: items");
        }
        if (strArr.length > 25) {
            throw new IllegalArgumentException(FirebaseAnalytics.Param.ITEMS);
        }
        if (i < 0 || i >= strArr.length) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: selectedIndex");
        }
        zzFS(83);
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            startBookmark(str);
        }
        zzO9(" FORMDROPDOWN ");
        FieldEnd fieldEndZz6 = zz6(83, false);
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            endBookmark(str);
        }
        FormField formFieldZzu = zzu(fieldEndZz6);
        formFieldZzu.setName(str);
        formFieldZzu.setDropDownSelectedIndex(i);
        for (String str2 : strArr) {
            formFieldZzu.getDropDownItems().add(str2);
        }
        return formFieldZzu;
    }

    public Node insertDocument(Document document, int i) {
        return insertDocument(document, i, new ImportFormatOptions());
    }

    public Node insertDocumentInline(Document document, int i, ImportFormatOptions importFormatOptions) {
        com.aspose.words.internal.zzZ4.zzY((Object) importFormatOptions, "ImportFormatOptions");
        zzZpA();
        importFormatOptions.zzV7(true);
        Node nodeZzZ = zzZYX.zzZ(this, document, i, importFormatOptions);
        importFormatOptions.zzV7(false);
        return nodeZzZ;
    }

    public Field insertField(int i, boolean z) throws Exception {
        zzZpA();
        return zzZR9.zzZ(i, z, zzZpG(), zzZpw(), zzZpv(), zzZpv() == null);
    }

    public Footnote insertFootnote(int i, String str) {
        return insertFootnote(i, str, null);
    }

    public Shape insertHorizontalRule() throws Exception {
        Shape shapeZzZY = Shape.zzZY(this.zzYTQ);
        insertNode(shapeZzZY);
        return shapeZzZY;
    }

    public void insertHtml(String str) throws Exception {
        insertHtml(str, 0);
    }

    public Field insertHyperlink(String str, String str2, boolean z) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "displayText");
        com.aspose.words.internal.zzZ4.zzY((Object) str2, "hrefOrBookmark");
        zzZR4 zzzr4ZzY = zzY(str2, z, "", "");
        write(str);
        zzzr4ZzY.zzX(zz6(88, true));
        return zzZQB.zzX(zzzr4ZzY.getStart(), zzzr4ZzY.getSeparator(), zzzr4ZzY.getEnd());
    }

    public Shape insertImage(Bitmap bitmap) throws Exception {
        return insertImage(bitmap, -1.0d, -1.0d);
    }

    public void insertNode(Node node) {
        zzZpA();
        if (zzZpy() != null && zzZpy().zzXZS() == 1) {
            endTable();
        }
        if (isAtEndOfParagraph()) {
            getCurrentParagraph().appendChild(node);
        } else if (isAtEndOfStructuredDocumentTag()) {
            getCurrentStructuredDocumentTag().appendChild(node);
        } else {
            zzZpr().zzYC(node);
        }
    }

    public Shape insertOleObject(InputStream inputStream, String str, boolean z, InputStream inputStream2) throws Exception {
        return zzZ(com.aspose.words.internal.zzZOP.zzY(inputStream), str, z, com.aspose.words.internal.zzZOP.zzY(inputStream2));
    }

    public Shape insertOleObjectAsIcon(String str, boolean z, String str2, String str3) throws Exception {
        return zzZ(str, z, str2, str3, zzYOA.zzD8(com.aspose.words.internal.zzZOQ.zzVe(str)));
    }

    public Shape insertOnlineVideo(String str, double d, double d2) throws Exception {
        return insertOnlineVideo(str, 2, 0.0d, 2, 0.0d, d, d2, 0);
    }

    public Paragraph insertParagraph() {
        if (zzZpr() != null && zzZpr().zzYAY() == 6 && (isAtEndOfStructuredDocumentTag() || (zzZpr().getParentNode() instanceof StructuredDocumentTag))) {
            throw new IllegalStateException("Cannot insert a node of this type at this location.");
        }
        zzZpA();
        Paragraph currentParagraph = getCurrentParagraph();
        zzY81 zzy81 = new zzY81(getDocument());
        try {
            Paragraph paragraph = new Paragraph(this.zzYTQ, zzZpF(), zzZpG());
            if (currentParagraph == null && isAtEndOfStructuredDocumentTag()) {
                getCurrentStructuredDocumentTag().appendChild(paragraph);
            } else {
                getCurrentParagraph().zzYD(paragraph);
            }
            if (isAtEndOfParagraph() || currentParagraph == null) {
                moveTo(paragraph);
            } else {
                paragraph.zzY(zzZpr(), null, paragraph.getLastChild());
            }
            zzy81.dispose();
            if (getDocument().zzZqp()) {
                if (currentParagraph == null) {
                    currentParagraph = paragraph;
                }
                zzYJ4.zzX(currentParagraph, getDocument().zzZqs());
            }
            return getCurrentParagraph();
        } catch (Throwable th) {
            zzy81.dispose();
            throw th;
        }
    }

    public Shape insertShape(int i, double d, double d2) throws Exception {
        zzZpA();
        return zz22.zzZ(this, i, d, d2);
    }

    public Shape insertSignatureLine(SignatureLineOptions signatureLineOptions) throws Exception {
        return insertSignatureLine(signatureLineOptions, 2, 0.0d, 2, 0.0d, 0);
    }

    public void insertStyleSeparator() {
        zzY8H.zzR(this);
    }

    public Field insertTableOfContents(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            return insertField(com.aspose.words.internal.zzZKN.format("TOC {0}", str), "");
        }
        throw new IllegalArgumentException("switches is required.");
    }

    public FormField insertTextInput(String str, int i, String str2, String str3, int i2) throws Exception {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: name");
        }
        if (str2 == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: format");
        }
        if (str3 == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: fieldValue");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: maxLength");
        }
        zzFS(70);
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            startBookmark(str);
        }
        zzO9(" FORMTEXT ");
        FieldSeparator fieldSeparatorZzFR = zzFR(70);
        insertNode(new Run(this.zzYTQ, com.aspose.words.internal.zzZYD.zzXk(str3) ? str3 : FormField.zzYwj, zzZpG()));
        Node nodeZz6 = zz6(70, true);
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            nodeZz6 = endBookmark(str);
        }
        FormField formFieldZzu = zzu(fieldSeparatorZzFR);
        formFieldZzu.setName(str);
        formFieldZzu.setTextInputType(i);
        formFieldZzu.setTextInputFormat(str2);
        formFieldZzu.setResult(str3);
        formFieldZzu.setMaxLength(i2);
        zzZ((Paragraph) nodeZz6.zzYBd(), nodeZz6.getNextSibling());
        return formFieldZzu;
    }

    public boolean isAtEndOfParagraph() {
        return zzZpr().getNodeType() == 8;
    }

    public boolean isAtEndOfStructuredDocumentTag() {
        return this.zzYS0 && zzZpr().getNodeType() == 28;
    }

    public boolean isAtStartOfParagraph() {
        if (getCurrentParagraph() == null) {
            return false;
        }
        for (Node firstChild = getCurrentParagraph().getFirstChild(); firstChild != null && firstChild != zzZpr(); firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() != 9 && firstChild.getNodeType() != 10) {
                return false;
            }
        }
        return true;
    }

    public void moveTo(Node node) {
        if (node == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: node");
        }
        if (node.getDocument() != getDocument()) {
            throw new IllegalArgumentException("The node belongs to a different document.");
        }
        if (node.getParentNode() == null) {
            throw new IllegalArgumentException("Parent cannot be null.");
        }
        if (node.getNodeType() == 8 || node.zzYAY() == 6) {
            zzt(node);
        } else if (zzYVU.zztq(node.getNodeType())) {
            Paragraph paragraphZzXF = zzYVU.zzXF(node);
            if (paragraphZzXF == null) {
                throw new IllegalStateException("There is no paragraph next to the specified node.");
            }
            boolean zHasChildNodes = paragraphZzXF.hasChildNodes();
            Node firstChild = paragraphZzXF;
            if (zHasChildNodes) {
                firstChild = paragraphZzXF.getFirstChild();
            }
            zzt(firstChild);
        } else {
            if (!node.isComposite() || node.zzYAY() != 3) {
                throw new IllegalStateException("The node must be a block or an inline.");
            }
            Node child = ((CompositeNode) node).getChild(8, 0, true);
            if (child == null) {
                throw new IllegalStateException("The block level node doesn't contain paragraph.");
            }
            zzt(child);
        }
        this.zzYS1 = 0;
        if (isAtEndOfParagraph()) {
            zzZpO();
        } else {
            if (zzZpP()) {
                return;
            }
            zzZpO();
        }
    }

    public boolean moveToBookmark(String str) throws Exception {
        return moveToBookmark(str, true, true);
    }

    public void moveToCell(int i, int i2, int i3, int i4) {
        Cell cell = (Cell) zzXU(i, i2).getChild(7, i3, false);
        if (cell == null) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: columnIndex");
        }
        cell.ensureMinimum();
        zzZ(cell, i4);
    }

    public void moveToDocumentEnd() {
        zzj(-1, -1, -1);
        Footnote footnote = (Footnote) getCurrentParagraph().getAncestor(20);
        if (footnote != null) {
            moveTo(footnote.getParentParagraph());
        }
    }

    public void moveToDocumentStart() {
        zzj(0, 0, 0);
    }

    public void moveToField(Field field, boolean z) throws Exception {
        zzZ(field, z, false);
    }

    public void moveToHeaderFooter(int i) {
        zzZ(getCurrentSection(), zzY0C.zzhC(i), 0, 0);
    }

    public boolean moveToMergeField(String str) throws Exception {
        return moveToMergeField(str, true, true);
    }

    public void moveToParagraph(int i, int i2) {
        zzZ(getCurrentStory(), i, i2);
    }

    public void moveToSection(int i) {
        zzj(i, 0, 0);
    }

    public void moveToStructuredDocumentTag(int i, int i2) {
        StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) getCurrentStory().getChild(28, i, true);
        if (structuredDocumentTag == null) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: structuredDocumentTagIndex");
        }
        moveToStructuredDocumentTag(structuredDocumentTag, i2);
    }

    public void popFont() {
        if (zzZps().size() > 0) {
            zzZ zzzPop = zzZps().pop();
            zzZ(zzzPop.zzZYh(), false);
            if (getCurrentParagraph() != null) {
                getCurrentParagraph().zzC(zzzPop.zzZpq());
            }
        }
    }

    public void pushFont() {
        zzZps().push(new zzZ(zzZpG(), getCurrentParagraph() != null ? (zzYEF) getCurrentParagraph().zzYp5().zzbn() : zzZpG()));
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public void removeParaAttr(int i) {
        zzZYj().remove(i);
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void removeRunAttr(int i) {
        this.zzZsP.remove(i);
    }

    @Override // com.aspose.words.zzZ9J
    @ReservedForInternalUse
    @Deprecated
    public void resetToDefaultAttrs() {
        zzZYf().clear();
        zzY6G.zzXXu().zzY(zzZYf());
    }

    public void setBold(boolean z) {
        getFont().setBold(z);
    }

    @Override // com.aspose.words.zzZD5
    @ReservedForInternalUse
    @Deprecated
    public void setCellAttr(int i, Object obj) {
        Border border = (Border) com.aspose.words.internal.zzZKW.zzZ(obj, Border.class);
        if (border != null) {
            border.zzZ(zzZpx() != null ? zzZpx().getCellFormat() : getCellFormat());
        }
        zz6G().zzQ(i, obj);
    }

    public void setDocument(Document document) {
        document.getClass();
        if (document == this.zzYTQ) {
            return;
        }
        this.zzYTQ = document;
        zzt(null);
        this.zzZsP = new zzYEF();
        this.zzYS9 = null;
        this.zzYS8 = null;
        this.zzZEt = null;
        this.zzYS4 = new com.aspose.words.internal.zzZQC<>();
        moveToDocumentStart();
    }

    public void setItalic(boolean z) {
        getFont().setItalic(z);
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public void setParaAttr(int i, Object obj) {
        if (getCurrentParagraph() != null) {
            getCurrentParagraph().setParaAttr(i, obj);
        } else {
            zzZYj().zzQ(i, obj);
        }
    }

    @Override // com.aspose.words.zzZ9J
    @ReservedForInternalUse
    @Deprecated
    public void setRowAttr(int i, Object obj) {
        zzZYf().zzQ(i, obj);
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void setRunAttr(int i, Object obj) {
        this.zzZsP.zzQ(i, obj);
        if (getCurrentParagraph() == null) {
            return;
        }
        if (isAtEndOfParagraph() || getCurrentParagraph().zzYoV()) {
            getCurrentParagraph().zzYp5().zzQ(i, obj);
        }
    }

    public void setUnderline(int i) {
        getFont().setUnderline(i);
    }

    public BookmarkStart startBookmark(String str) {
        BookmarkStart bookmarkStart = new BookmarkStart(this.zzYTQ, str, 0);
        insertNode(bookmarkStart);
        return bookmarkStart;
    }

    public BookmarkStart startColumnBookmark(String str) {
        Cell cellZzZpx = zzZpx();
        if (cellZzZpx == null) {
            throw new IllegalStateException("A column bookmark can only be started in a table cell.");
        }
        Cell firstCell = cellZzZpx.getParentRow().getFirstCell();
        firstCell.ensureMinimum();
        BookmarkStart bookmarkStart = new BookmarkStart(this.zzYTQ, str);
        firstCell.getFirstParagraph().insertAfter(bookmarkStart, null);
        bookmarkStart.zzOX(cellZzZpx.zz6F());
        return bookmarkStart;
    }

    public EditableRangeStart startEditableRange() {
        EditableRangeStart editableRangeStart = new EditableRangeStart(this.zzYTQ);
        this.zzYS2 = editableRangeStart.getId();
        insertNode(editableRangeStart);
        return editableRangeStart;
    }

    public Table startTable() {
        this.zzYS4.push(new zzY70(this));
        return zzZpy().startTable();
    }

    public void write(String str) {
        zzA(str, false);
    }

    public void writeln(String str) {
        zzA(str, true);
    }

    public final FieldEnd zz6(int i, boolean z) {
        return zzZR9.zzY(i, z, zzZpG(), zzZpw(), zzZpv(), zzZpv() == null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void zz7(int r3, boolean r4) {
        /*
            r2 = this;
        L0:
            r0 = 1
            r1 = 0
            switch(r3) {
                case 0: goto L8c;
                case 1: goto L58;
                case 2: goto L4c;
                case 3: goto L42;
                case 4: goto L38;
                case 5: goto L2d;
                case 6: goto L22;
                case 7: goto L17;
                case 8: goto L11;
                default: goto L5;
            }
        L5:
            if (r4 != 0) goto L9
            goto L8b
        L9:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Unknown break type."
            r3.<init>(r4)
            throw r3
        L11:
            java.lang.String r3 = com.aspose.words.ControlChar.LINE_BREAK
            r2.zzO6(r3)
            return
        L17:
            boolean r3 = r2.zzWy(r4)
            if (r3 == 0) goto L8b
            r3 = 4
            r2.zzFT(r3)
            return
        L22:
            boolean r3 = r2.zzWy(r4)
            if (r3 == 0) goto L8b
            r3 = 3
            r2.zzFT(r3)
            return
        L2d:
            boolean r3 = r2.zzWy(r4)
            if (r3 == 0) goto L8b
            r3 = 2
            r2.zzFT(r3)
            return
        L38:
            boolean r3 = r2.zzWy(r4)
            if (r3 == 0) goto L8b
            r2.zzFT(r0)
            return
        L42:
            boolean r3 = r2.zzWy(r4)
            if (r3 == 0) goto L8b
            r2.zzFT(r1)
            return
        L4c:
            boolean r3 = r2.zzWy(r4)
            if (r3 == 0) goto L8b
            java.lang.String r3 = com.aspose.words.ControlChar.COLUMN_BREAK
            r2.zzO6(r3)
            return
        L58:
            boolean r3 = r2.zzWy(r4)
            if (r3 != 0) goto L5f
            goto L8b
        L5f:
            boolean r3 = r2.isAtStartOfParagraph()
            if (r3 == 0) goto L6c
            boolean r3 = r2.isAtEndOfParagraph()
            if (r3 != 0) goto L6c
            goto L6d
        L6c:
            r0 = r1
        L6d:
            java.lang.String r3 = com.aspose.words.ControlChar.PAGE_BREAK
            r2.zzO6(r3)
            com.aspose.words.Document r3 = r2.getDocument()
            com.aspose.words.CompatibilityOptions r3 = r3.getCompatibilityOptions()
            if (r0 == 0) goto L8b
            boolean r0 = r3.getSplitPgBreakAndParaMark()
            if (r0 == 0) goto L88
            boolean r3 = r3.zzZYM()
            if (r3 == 0) goto L8b
        L88:
            r3 = r1
            goto L0
        L8b:
            return
        L8c:
            r2.insertParagraph()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aspose.words.DocumentBuilder.zz7(int, boolean):void");
    }

    public final void zzFQ(int i) {
        this.zzYS3 = i;
    }

    public final FieldSeparator zzFR(int i) {
        return zzZR9.zzY(i, zzZpG(), zzZpw(), zzZpv(), zzZpv() == null);
    }

    public final FieldStart zzFS(int i) {
        zzZpA();
        return zzZR9.zzZ(i, zzZpG(), zzZpw(), zzZpv(), zzZpv() == null);
    }

    public final void zzFU(int i) {
        zzWy(true);
        zzFT(i);
    }

    public final zzZR4 zzL(String str, String str2, String str3) {
        boolean zZzWw = com.aspose.words.internal.zzZVR.zzWw(str);
        if (zZzWw) {
            str = com.aspose.words.internal.zzZVR.zzWG(str);
        }
        return zzY(str, zZzWw, str2, str3);
    }

    public final Run zzO9(String str) {
        return zzZR9.zzY(str, zzZpG(), zzZpw(), zzZpv(), zzZpv() == null);
    }

    public final void zzZpB() {
        if (zzZpx() != null) {
            zzWP zzwpZz6G = zzZpx().zz6G();
            zzWP zzwp = (zzWP) zzwpZz6G.zzbn();
            this.zzZAg = zzwp;
            zzwpZz6G.zzY(zzwp);
        }
    }

    public final void zzZpC() {
        this.zzZsP.clear();
    }

    public final zzWP zzZpD() {
        return (zzWP) zz6G().zzbn();
    }

    public final zzY6G zzZpE() {
        return (zzY6G) zzZYf().zzbn();
    }

    public final zzYMX zzZpF() {
        return (zzYMX) zzZYj().zzbn();
    }

    public final zzYEF zzZpG() {
        return (zzYEF) this.zzZsP.zzbn();
    }

    public final FieldEnd zzZpH() {
        return zz6(88, true);
    }

    public final void zzZpI() {
        if (zzZpt().size() > 0) {
            zzYMX zzymxPop = zzZpt().pop();
            if (getCurrentParagraph() != null) {
                getCurrentParagraph().zzZ(zzymxPop);
            }
        }
    }

    public final void zzZpJ() {
        zzZpt().push(zzZpF());
    }

    public final void zzZpK() {
        if (zzZpu().size() > 0) {
            zzZ(zzZpu().pop(), false);
        }
    }

    public final void zzZpL() {
        zzZpu().push(zzZpG());
    }

    public final Paragraph zzZpN() {
        zzZpA();
        Node nodeZzZpr = zzZpr();
        Paragraph currentParagraph = getCurrentParagraph();
        Run runZzRD = isAtEndOfParagraph() ? currentParagraph.zzRD(false) : (Run) nodeZzZpr.zztC(21);
        if (runZzRD == null && com.aspose.words.internal.zzZKO.zzA(nodeZzZpr, currentParagraph.zzYVe())) {
            runZzRD = currentParagraph.zzYVe();
        }
        Paragraph paragraph = new Paragraph(this.zzYTQ, zzZpF(), (zzYEF) (runZzRD != null ? runZzRD.zzZYh().zzbn() : currentParagraph.zzYp5().zzbn()));
        currentParagraph.zzYC(paragraph);
        zzY81 zzy81 = new zzY81(this.zzYTQ);
        try {
            if (isAtEndOfParagraph()) {
                nodeZzZpr = null;
            }
            paragraph.zzY(currentParagraph.getFirstChild(), nodeZzZpr, paragraph.getLastChild());
            return paragraph;
        } finally {
            zzy81.dispose();
        }
    }

    public final int zzZpz() {
        return this.zzYS3;
    }

    public final Shape zzZt(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        return zzZ(zzzop, -1.0d, -1.0d);
    }

    public final boolean zzZzM() {
        return !isAtEndOfParagraph() && getCurrentNode().getParentNode().getNodeType() == 17;
    }

    public final void zzv(Node node) {
        getCurrentParagraph().zzYC(node);
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectParaAttr(int i, int i2) {
        return zzZYj().zzVQ(i, i2);
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectRunAttr(int i, int i2) {
        return this.zzZsP.zzVQ(i, i2);
    }

    public Shape insertChart(int i, int i2, double d, int i3, double d2, double d3, double d4, int i4) throws Exception {
        return new zzW4().zzZ(i, i2, d, i3, d2, d3, d4, i4, this);
    }

    public FormField insertCheckBox(String str, boolean z, boolean z2, int i) throws Exception {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: name");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: size");
        }
        zzFS(71);
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            startBookmark(str);
        }
        zzO9(" FORMCHECKBOX ");
        FieldEnd fieldEndZz6 = zz6(71, false);
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            endBookmark(str);
        }
        FormField formFieldZzu = zzu(fieldEndZz6);
        formFieldZzu.setName(str);
        formFieldZzu.setDefault(z);
        formFieldZzu.setChecked(z2);
        if (i != 0) {
            formFieldZzu.isCheckBoxExactSize(true);
            formFieldZzu.setCheckBoxSize(i);
            return formFieldZzu;
        }
        formFieldZzu.isCheckBoxExactSize(false);
        formFieldZzu.setCheckBoxSize(10.0d);
        return formFieldZzu;
    }

    public Node insertDocument(Document document, int i, ImportFormatOptions importFormatOptions) {
        com.aspose.words.internal.zzZ4.zzY((Object) importFormatOptions, "ImportFormatOptions");
        zzZpA();
        return zzZYX.zzZ(this, document, i, importFormatOptions);
    }

    public Footnote insertFootnote(int i, String str, String str2) {
        Footnote footnote = new Footnote(this.zzYTQ, i, !com.aspose.words.internal.zzZYD.zzXk(str2), str2, zzZpG());
        Style styleZzkW = getDocument().getStyles().zzkW(zzZMP.zzB0(i));
        footnote.zzZYh().set(50, Integer.valueOf(styleZzkW.zzZ7j()));
        insertNode(footnote);
        Paragraph paragraph = new Paragraph(this.zzYTQ);
        paragraph.zzZYj().set(1000, Integer.valueOf(getDocument().getStyles().zzkW(zzZMP.zzAZ(i)).zzZ7j()));
        footnote.getParagraphs().add(paragraph);
        Inline specialChar = footnote.isAuto() ? new SpecialChar(this.zzYTQ, (char) 2, new zzYEF()) : new Run(this.zzYTQ, footnote.getReferenceMark(), new zzYEF());
        specialChar.zzZYh().set(50, Integer.valueOf(styleZzkW.zzZ7j()));
        paragraph.appendChild(specialChar);
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            Node nodeZzZpr = zzZpr();
            moveTo(paragraph);
            write(" ");
            write(str);
            zzt(nodeZzZpr);
        }
        return footnote;
    }

    public void insertHtml(String str, boolean z) throws Exception {
        insertHtml(str, z ? 1 : 0);
    }

    public Shape insertImage(String str) throws Exception {
        return insertImage(str, -1.0d, -1.0d);
    }

    public Shape insertOleObject(String str, boolean z, boolean z2, InputStream inputStream) throws Exception {
        return zzZ(str, z, z2, com.aspose.words.internal.zzZOP.zzY(inputStream));
    }

    public Shape insertOnlineVideo(String str, int i, double d, int i2, double d2, double d3, double d4, int i3) throws Exception {
        return new zzY3A(this).zzZ(str, i, d, i2, d2, d3, d4, i3);
    }

    public Shape insertSignatureLine(SignatureLineOptions signatureLineOptions, int i, double d, int i2, double d2, int i3) throws Exception {
        if (signatureLineOptions == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: signatureLineOptions");
        }
        Shape shape = new Shape(this.zzYTQ, 75);
        shape.zzZ(zzZpG());
        shape.zzY9X();
        shape.getSignatureLine().zzZ(signatureLineOptions);
        shape.setRelativeHorizontalPosition(i);
        shape.setLeft(d);
        shape.setRelativeVerticalPosition(i2);
        shape.setTop(d2);
        shape.setWrapType(i3);
        insertNode(shape);
        ImageSize imageSize = shape.getImageData().getImageSize();
        shape.zze(ConvertUtil.pixelToPoint(imageSize.getWidthPixels(), 96.0d), ConvertUtil.pixelToPoint(imageSize.getHeightPixels(), 96.0d));
        return shape;
    }

    public boolean moveToBookmark(String str, boolean z, boolean z2) throws Exception {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: bookmarkName");
        }
        Node nodeZzZ = z ? zzY9.zzZ(this.zzYTQ, str) : zzY9.zzY(this.zzYTQ, str);
        if (nodeZzZ == null) {
            return false;
        }
        if (nodeZzZ.zzYAY() == 6) {
            CompositeNode compositeNodeZzYBd = nodeZzZ.zzYBd();
            if (z2) {
                nodeZzZ = nodeZzZ.getNextSibling();
            }
            zzZ(compositeNodeZzYBd, nodeZzZ);
            return true;
        }
        Paragraph paragraphZzXF = zzYVU.zzXF(nodeZzZ);
        if (paragraphZzXF == null) {
            return false;
        }
        zzZ(paragraphZzXF, paragraphZzXF.getFirstChild());
        return true;
    }

    public boolean moveToMergeField(String str, boolean z, boolean z2) throws Exception {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: fieldName");
        }
        FieldMergeField fieldMergeFieldZzS = zzZpr().isRemoved() ? zzYZI.zzS(this.zzYTQ, str) : zzYZI.zzR(zzZpr(), str);
        if (fieldMergeFieldZzS == null) {
            return false;
        }
        return zzZ(fieldMergeFieldZzS, z, z2);
    }

    public void writeln() {
        insertParagraph();
    }

    public void insertHtml(String str, int i) throws Exception {
        zzZpA();
        if (zzZpM()) {
            DocumentBuilder documentBuilder = new DocumentBuilder();
            documentBuilder.insertHtml(str);
            write(zzOa(documentBuilder.getDocument().toString(70)));
            return;
        }
        zzYK4.zzZ(str, i, this).zzIh();
    }

    public Shape insertImage(InputStream inputStream) throws Exception {
        return zzZt(com.aspose.words.internal.zzZOP.zzY(inputStream));
    }

    public Shape insertOleObject(String str, String str2, boolean z, boolean z2, InputStream inputStream) throws Exception {
        return zzZ(str, str2, z, z2, com.aspose.words.internal.zzZOP.zzY(inputStream));
    }

    public Shape insertOleObjectAsIcon(String str, String str2, boolean z, String str3, String str4) throws Exception {
        return zzZ(str, z, str3, str4, zzYOA.zzD9(str2));
    }

    public Shape insertOnlineVideo(String str, String str2, byte[] bArr, double d, double d2) throws Exception {
        return insertOnlineVideo(str, str2, bArr, 2, 0.0d, 2, 0.0d, d, d2, 0);
    }

    public Shape insertShape(int i, int i2, double d, int i3, double d2, double d3, double d4, int i4) throws Exception {
        zzZpA();
        return zz22.zzZ(this, i, i2, d, i3, d2, d3, d4, i4);
    }

    public Shape insertImage(byte[] bArr) throws Exception {
        return insertImage(bArr, -1.0d, -1.0d);
    }

    public Shape insertOnlineVideo(String str, String str2, byte[] bArr, int i, double d, int i2, double d2, double d3, double d4, int i3) throws Exception {
        return new zzY3A(this).zzZ(str, str2, bArr, i, d, i2, d2, d3, d4, i3);
    }

    public void moveToStructuredDocumentTag(StructuredDocumentTag structuredDocumentTag, int i) {
        if (structuredDocumentTag == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: structuredDocumentTag");
        }
        if (i >= 0) {
            zzY(structuredDocumentTag, i);
            return;
        }
        int i2 = i + 1;
        if (i2 == 0) {
            zzY(structuredDocumentTag);
        } else {
            zzX(structuredDocumentTag, i2);
        }
    }

    private zzZR4 zzY(String str, boolean z, String str2, String str3) {
        FieldStart fieldStartZzFS = zzFS(88);
        zzZQX zzzqx = new zzZQX();
        zzzqx.setTarget(str2);
        zzzqx.setScreenTip(str3);
        if (z) {
            zzzqx.setSubAddress(str);
        } else {
            zzzqx.setAddress(com.aspose.words.internal.zzZVR.zzWH(str));
            zzzqx.setSubAddress(com.aspose.words.internal.zzZVR.zzWG(str));
        }
        zzO9(zzzqx.zzZfj());
        return new zzZR4(fieldStartZzFS, zzFR(88), null);
    }

    public EditableRangeEnd endEditableRange(EditableRangeStart editableRangeStart) {
        EditableRangeEnd editableRangeEnd = new EditableRangeEnd(this.zzYTQ, editableRangeStart.getId());
        insertNode(editableRangeEnd);
        return editableRangeEnd;
    }

    public Field insertField(String str) throws Exception {
        zzZpA();
        return zzZR9.zzZ(str, zzZpG(), zzZpw(), zzZpv(), zzZpv() == null);
    }

    public Shape insertImage(Bitmap bitmap, double d, double d2) throws Exception {
        return insertImage(bitmap, 2, 0.0d, 2, 0.0d, d, d2, 0);
    }

    public Shape insertOleObjectAsIcon(InputStream inputStream, String str, String str2, String str3) throws Exception {
        return zzY(com.aspose.words.internal.zzZOP.zzY(inputStream), str, str2, str3);
    }

    public Shape insertImage(String str, double d, double d2) throws Exception {
        return insertImage(str, 2, 0.0d, 2, 0.0d, d, d2, 0);
    }

    public DocumentBuilder(Document document) {
        setDocument(document);
    }

    public Shape insertImage(InputStream inputStream, double d, double d2) throws Exception {
        return zzZ(com.aspose.words.internal.zzZOP.zzY(inputStream), d, d2);
    }

    public Shape insertImage(byte[] bArr, double d, double d2) throws Exception {
        return insertImage(bArr, 2, 0.0d, 2, 0.0d, d, d2, 0);
    }

    private void zzZ(Story story, int i, int i2) {
        Paragraph paragraph = (Paragraph) story.getChild(8, i, true);
        if (paragraph != null) {
            zzZ((CompositeNode) paragraph, i2);
            return;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: paraIdx");
    }

    public Field insertField(String str, String str2) {
        zzZpA();
        return zzZR9.zzZ(str, str2, zzZpG(), zzZpw(), zzZpv(), zzZpv() == null);
    }

    public Shape insertImage(Bitmap bitmap, int i, double d, int i2, double d2, double d3, double d4, int i3) throws Exception {
        if (bitmap != null) {
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
            try {
                com.aspose.words.internal.zzXN.zzZ(bitmap, zzzor);
                return zzZ(zzzor, i, d, i2, d2, d3, d4, i3);
            } finally {
                zzzor.close();
            }
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: image");
    }

    public final void zzZ(Paragraph paragraph, int i) {
        zzZ((CompositeNode) paragraph, 0);
    }

    private boolean zzZ(Field field, boolean z, boolean z2) throws Exception {
        Node start;
        Inline sourceNode = field.getFormat().zzZdZ().getSourceNode();
        if (z2) {
            start = field.remove();
            if (start == null) {
                return false;
            }
        } else if (z) {
            Node nextSibling = field.getEnd().getNextSibling();
            start = nextSibling == null ? field.getEnd().getParentParagraph() : nextSibling;
        } else {
            start = field.getStart();
        }
        moveTo(start);
        if (sourceNode != null) {
            zzZ(sourceNode.zzZYh(), true);
        }
        return true;
    }

    public Shape insertImage(String str, int i, double d, int i2, double d2, double d3, double d4, int i3) throws Exception {
        ResourceLoadingArgs resourceLoadingArgs;
        int iResourceLoading;
        com.aspose.words.internal.zzZ4.zzU(str, "fileName");
        if (getDocument().getResourceLoadingCallback() != null && (iResourceLoading = getDocument().getResourceLoadingCallback().resourceLoading((resourceLoadingArgs = new ResourceLoadingArgs("", str, 0)))) != 0) {
            if (iResourceLoading != 2) {
                return null;
            }
            return insertImage(resourceLoadingArgs.getData(), i, d, i2, d2, d3, d4, i3);
        }
        com.aspose.words.internal.zzZOP zzzopZzX0 = com.aspose.words.internal.zzZXR.zzX0(str);
        try {
            Shape shapeZzZ = zzZ(zzzopZzX0, i, d, i2, d2, d3, d4, i3);
            if (zzzopZzX0 != null) {
                zzzopZzX0.close();
            }
            return shapeZzZ;
        } finally {
        }
    }

    private void zzY(CompositeNode compositeNode, int i) {
        int iZz0R;
        zzZYT zzzytZzq = zzZYT.zzq(compositeNode);
        Node node = null;
        while (node != compositeNode) {
            zzzytZzq.zzZ(null, true, true, true, false, true);
            node = zzzytZzq.getNode();
            if (!zzzytZzq.zzZou() || (node.isComposite() && node.zzYAY() == 6 && i == 0)) {
                if (node.isComposite()) {
                    iZz0R = ((CompositeNode) node).zzZYp().length();
                } else {
                    iZz0R = node.zz0R();
                }
                if (zzzytZzq.zzZou() || iZz0R != 0 || !node.isComposite() || node == compositeNode) {
                    int i2 = i - iZz0R;
                    if (i == 0 || i2 < 0) {
                        if (!zzzytZzq.zzZou() && node == compositeNode && compositeNode.getNodeType() == 28) {
                            zzY((StructuredDocumentTag) compositeNode);
                            return;
                        } else {
                            zzZ((CompositeNode) null, node);
                            this.zzYS1 = i;
                            return;
                        }
                    }
                    i = i2;
                }
            }
        }
        throw new IllegalStateException("The character index is too large.");
    }

    private void zzZ(CompositeNode compositeNode, Node node) {
        if (node != null) {
            moveTo(node);
        } else {
            moveTo(compositeNode);
        }
    }

    public Shape insertImage(InputStream inputStream, int i, double d, int i2, double d2, double d3, double d4, int i3) throws Exception {
        return zzZ(com.aspose.words.internal.zzZOP.zzY(inputStream), i, d, i2, d2, d3, d4, i3);
    }

    private Shape zzZ(com.aspose.words.internal.zzZOP zzzop, double d, double d2) throws Exception {
        return zzZ(zzzop, 2, 0.0d, 2, 0.0d, d, d2, 0);
    }

    public Shape insertImage(byte[] bArr, int i, double d, int i2, double d2, double d3, double d4, int i3) throws Exception {
        return zzZ(bArr, i, d, i2, d2, d3, d4, i3, false);
    }

    private Shape zzZ(com.aspose.words.internal.zzZOP zzzop, int i, double d, int i2, double d2, double d3, double d4, int i3) throws Exception {
        if (zzzop != null) {
            return insertImage(com.aspose.words.internal.zzZYQ.zzZX(zzzop), i, d, i2, d2, d3, d4, i3);
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: stream");
    }

    public final Shape zzZ(byte[] bArr, int i, double d, int i2, double d2, double d3, double d4, int i3, boolean z) throws Exception {
        boolean z2;
        Shape shape;
        double d5;
        double d6;
        byte[] bArrZzZ;
        zzYB5 zzyb5;
        if (bArr != null) {
            if (com.aspose.words.internal.zzEF.zzZP(bArr)) {
                new com.aspose.words.internal.zzXN(bArr).dispose();
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = this.zzYTQ.getCompatibilityOptions().getMswVersion() > 12 || this.zzYTQ.getCompatibilityOptions().getMswVersion() == 0;
            if (z3) {
                shape = new Shape((DocumentBase) this.zzYTQ, (byte) 0);
                zz3V zz3v = new zz3V();
                zz3v.zzZ(zz7G.zzOA(DrawToolFactory.LASSO_TYPE_RECT));
                zz3v.zzZ(new zzH0());
                zz3v.zzZwy().zzZQ1().zzY(this.zzYTQ);
                zz4N zz4n = new zz4N();
                zz4n.zzY(new zz4T(this.zzYTQ.zzZq0(), ""));
                zz4n.zzZ(new zzBY());
                zz3v.zzZ(zz4n);
                shape.setShapeType(75);
                shape.zzU(zz3v);
            } else {
                shape = new Shape(this.zzYTQ, 75);
            }
            Shape shape2 = shape;
            if (com.aspose.words.internal.zzEF.zzZD(bArr)) {
                d5 = d3;
                d6 = d4;
                bArrZzZ = shape2.getImageData().zzZ(bArr, new zzYB5(getPageSetup().getPageWidth(), getPageSetup().getPageHeight()), new zzYB5(d5, d6), z3 ? 6 : 2);
                if (z3) {
                    zzZ((zz3V) shape2.zzY9i(), bArr, new ImageSize(com.aspose.words.internal.zzEF.zzZT(bArrZzZ)));
                }
            } else {
                d5 = d3;
                d6 = d4;
                bArrZzZ = bArr;
            }
            if (z3 && z2) {
                ((zz3V) shape2.zzY9i()).zzZwy().zzZQ1().zzYt(bArrZzZ);
                com.aspose.words.internal.zzEG zzegZzZB = com.aspose.words.internal.zzEF.zzZB(bArrZzZ);
                zzyb5 = new zzYB5(zzegZzZB.getWidthPoints(), zzegZzZB.getHeightPoints());
            } else {
                shape2.getImageData().setImageBytes(bArrZzZ);
                zzyb5 = null;
            }
            shape2.zzZ(zzZpG());
            shape2.setRelativeHorizontalPosition(i);
            shape2.setLeft(d);
            shape2.setRelativeVerticalPosition(i2);
            shape2.setTop(d2);
            shape2.setWrapType(i3);
            shape2.setAspectRatioLocked(true);
            insertNode(shape2);
            double dZzZ = (!z && z3 && com.aspose.words.internal.zzEF.zzZR(bArrZzZ)) ? zzZ(shape2, bArrZzZ) : 0.0d;
            shape2.zzZ(d5, d6, zzyb5, dZzZ);
            double d7 = dZzZ;
            if (d7 > 0.0d) {
                shape2.setRotation(d7);
            }
            return shape2;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: imageBytes");
    }

    private void zzY(StructuredDocumentTag structuredDocumentTag) {
        zzt(structuredDocumentTag);
        this.zzYS0 = true;
        this.zzYS1 = 0;
        zzYEF zzyefZzY3J = structuredDocumentTag.zzY3J();
        int iZzYAY = structuredDocumentTag.zzYAY();
        if (iZzYAY == 3) {
            Paragraph paragraph = (Paragraph) structuredDocumentTag.getChild(8, -1, true);
            if (paragraph != null) {
                zzyefZzY3J = paragraph.zzYp5();
            }
        } else {
            if (iZzYAY != 6) {
                return;
            }
            Node nodeZzZYq = structuredDocumentTag.zzZYq();
            while (nodeZzZYq != null && !(nodeZzZYq instanceof Inline)) {
                nodeZzZYq = nodeZzZYq.getPreviousSibling();
            }
            if (nodeZzZYq != null) {
                zzyefZzY3J = ((Inline) nodeZzZYq).zzZYh();
            }
        }
        zzZ(zzyefZzY3J, true);
    }

    private static double zzZ(Shape shape, byte[] bArr) throws Exception {
        int iZzZA = com.aspose.words.internal.zzEF.zzZA(bArr);
        if (iZzZA == 1) {
            return 0.0d;
        }
        int iZzDW = zzZSL.zzDW(iZzZA);
        if (iZzDW != 0) {
            shape.setFlipOrientation(iZzDW);
        }
        return zzZSL.zzDX(iZzZA);
    }

    private void zzZ(zz3V zz3v, byte[] bArr, ImageSize imageSize) throws Exception {
        zz3v.zzZwy().zzZQ1().getExtensions();
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(bArr);
        try {
            zzY7K zzy7kZzV = zzY7I.zzV(zzzor, this.zzYTQ);
            zzy7kZzV.zzd(imageSize.getWidthPoints(), imageSize.getHeightPoints());
            zzy7kZzV.zzY0V();
            byte[] bArrZzPN = zzy7kZzV.zzPN(true);
            zzzor.close();
            zz3v.zzZwy().zzZQ1().setExtensions(new com.aspose.words.internal.zzZYG<>());
            zz82 zz82VarZzZ = zz82.zzZ(bArrZzPN, this.zzYTQ);
            zz3v.zzZwy().zzZQ1().getExtensions().zzW(zz82VarZzZ.getUri(), zz82VarZzZ);
        } catch (Throwable th) {
            zzzor.close();
            throw th;
        }
    }

    private Shape zzZ(com.aspose.words.internal.zzZOP zzzop, String str, boolean z, com.aspose.words.internal.zzZOP zzzop2) throws Exception {
        zzYOA zzyoaZzD9 = zzYOA.zzD9(str);
        return zzZ((String) null, false, zzZ(zzzop2, z, zzyoaZzD9, (String) null), zzyoaZzD9.zzXJ9, zzYO6.zzZ(zzzop, str, z));
    }

    private Shape zzZ(String str, boolean z, boolean z2, com.aspose.words.internal.zzZOP zzzop) throws Exception {
        return zzZ(str, z, z2, zzzop, zzYOA.zzD8(com.aspose.words.internal.zzZOQ.zzVe(str)));
    }

    private Shape zzZ(String str, String str2, boolean z, boolean z2, com.aspose.words.internal.zzZOP zzzop) throws Exception {
        return zzZ(str, z, z2, zzzop, zzYOA.zzD9(str2));
    }

    public final Shape zzZ(zzZFY zzzfy, com.aspose.words.internal.zzZOP zzzop) throws Exception {
        Shape shapeZzZs = zzZs(zzzop);
        shapeZzZs.setShapeType(201);
        shapeZzZs.setShapeAttr(4112, zzzfy);
        return shapeZzZs;
    }

    public final zzZR4 zzZ(zzZQX zzzqx) {
        FieldStart fieldStartZzFS = zzFS(88);
        zzO9(zzzqx.zzZfj());
        return new zzZR4(fieldStartZzFS, zzFR(88), null);
    }

    private Shape zzZ(String str, boolean z, boolean z2, com.aspose.words.internal.zzZOP zzzop, zzYOA zzyoa) throws Exception {
        if (zzyoa != null) {
            return zzZ(str, z, zzZ(zzzop, z2, zzyoa, str), zzyoa.zzXJ9, zzYO6.zzZ(str, z, z2, zzyoa));
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: oleInfo");
    }

    private Shape zzZ(String str, boolean z, String str2, String str3, zzYOA zzyoa) throws Exception {
        Shape shapeZzZ;
        if (zzyoa != null) {
            if (str3 == null) {
                str3 = com.aspose.words.internal.zzZOQ.zzVh(str);
            }
            if (str2 != null) {
                shapeZzZ = zzZk(str2, str3);
            } else {
                shapeZzZ = zzZ((String) null, str3, zzyoa);
            }
            return zzZ(str, z, shapeZzZ, zzyoa.zzXJ9, zzYO6.zzZ(str, z, true, zzyoa));
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: oleInfo");
    }

    private static Shape zzZ(String str, boolean z, Shape shape, String str2, zzYOC zzyoc) {
        if (shape != null) {
            shape.setShapeType(-2);
            shape.getOleFormat().setProgId(str2);
            shape.getOleFormat().zzY(zzyoc);
            if (z) {
                shape.getOleFormat().setSourceFullName(str);
            }
            return shape;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: insertedOleImage");
    }

    private Shape zzZ(com.aspose.words.internal.zzZOP zzzop, boolean z, zzYOA zzyoa, String str) throws Exception {
        String strZzD5;
        if (zzyoa == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: oleInfo");
        }
        if (zzzop != null) {
            return zzZs(zzzop);
        }
        if (!z) {
            return zzYo(zzYO6.zzYrj().get("normal"));
        }
        if (str != null) {
            strZzD5 = com.aspose.words.internal.zzZOQ.zzVh(str);
        } else {
            strZzD5 = zzYO6.zzD5(zzyoa.zzXJ5);
        }
        return zzZ(zzyoa, strZzD5);
    }

    private Shape zzZ(String str, String str2, zzYOA zzyoa) throws Exception {
        if (zzyoa == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: oleInfo");
        }
        if (str2 == null) {
            str2 = zzYO6.zzD5(zzyoa.zzXJ5);
        }
        if (str != null) {
            return zzZk(str, str2);
        }
        return zzZ(zzyoa, str2);
    }

    private Shape zzZ(zzYOA zzyoa, String str) throws Exception {
        if (zzyoa != null) {
            return zzYo(new com.aspose.words.internal.zzEU(zzYO6.zzD6(zzyoa.zzXJ5), null, str, getDocument().zzZqy()).zzEc());
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: oleInfo");
    }

    private void zzZ(CompositeNode compositeNode, int i) {
        if (i >= 0) {
            zzY(compositeNode, i);
        } else {
            zzX(compositeNode, i);
        }
    }

    public final void zzZ(zzYEF zzyef, boolean z) {
        if (z) {
            zzyef = (zzYEF) zzyef.zzbn();
        }
        this.zzZsP = zzyef;
    }
}
