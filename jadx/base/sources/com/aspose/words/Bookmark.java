package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class Bookmark {
    private BookmarkEnd zzZCS;
    private BookmarkStart zzZCT;

    public Bookmark(BookmarkStart bookmarkStart) {
        com.aspose.words.internal.zzZ4.zzY((Object) bookmarkStart, "bookmarkStart");
        this.zzZCT = bookmarkStart;
    }

    private Node zz9k() throws Exception {
        zzYK6 zzyk6ZzZ;
        Node bookmarkEnd = getBookmarkEnd();
        if (getBookmarkEnd().zz9d() != 2 && (zzyk6ZzZ = zzJ.zzZ((Node) getBookmarkEnd(), false)) != null) {
            Node node = zzyk6ZzZ.getNode();
            boolean zZzYml = zzyk6ZzZ.zzYml();
            if (node != getBookmarkEnd()) {
                if ((getBookmarkEnd().zz9d() != 0 || zzyk6ZzZ.zzYmk() == null || getBookmarkEnd().zzYF(zzyk6ZzZ.zzYmk())) && !(getBookmarkEnd().zz9d() == 1 && zzyk6ZzZ.zzYmk() != null && getBookmarkEnd().zzYF(zzyk6ZzZ.zzYmk()))) {
                    bookmarkEnd = zzyk6ZzZ.getNode();
                    if (zZzYml) {
                        bookmarkEnd = bookmarkEnd.zzYAZ();
                    }
                } else {
                    node.getParentNode().zzZ(getBookmarkEnd(), node, zZzYml);
                    getBookmarkEnd().zzOY(2);
                }
            }
        }
        zzYK6 zzyk6ZzZ2 = zzJ.zzZ((Node) getBookmarkStart(), true);
        if (zzyk6ZzZ2 != null) {
            Node node2 = zzyk6ZzZ2.zzYml() ? zzyk6ZzZ2.getNode() : zzyk6ZzZ2.getNode().zzYAZ();
            boolean z = Node.zzD(bookmarkEnd, node2) && !node2.zzYF(bookmarkEnd);
            if (!z && bookmarkEnd == node2) {
                z = !(getBookmarkStart().zz9d() != 1 || zzyk6ZzZ2.zzYmk() == null || getBookmarkStart().zzYF(zzyk6ZzZ2.zzYmk())) || (getBookmarkStart().zz9d() == 0 && zzyk6ZzZ2.zzYmk() != null && getBookmarkStart().zzYF(zzyk6ZzZ2.zzYmk()));
            }
            if (z) {
                if (bookmarkEnd.isComposite()) {
                    ((CompositeNode) bookmarkEnd).appendChild(getBookmarkStart());
                } else {
                    bookmarkEnd.getParentNode().zzZ(getBookmarkStart(), bookmarkEnd, false);
                }
                getBookmarkStart().zzOY(2);
            }
        }
        if (bookmarkEnd.getNodeType() != 8 && bookmarkEnd.zzYAY() != 6) {
            Paragraph paragraphZzXF = zzYVU.zzXF(bookmarkEnd);
            if (paragraphZzXF == null) {
                Node nodeZztB = bookmarkEnd.zztB(3);
                if (nodeZztB == null) {
                    nodeZztB = bookmarkEnd.zztB(0);
                }
                if (nodeZztB != null && nodeZztB.isComposite()) {
                    CompositeNode compositeNode = (CompositeNode) nodeZztB;
                    paragraphZzXF = new Paragraph(getBookmarkEnd().getDocument());
                    if (compositeNode.zzT(paragraphZzXF)) {
                        compositeNode.appendChild(paragraphZzXF);
                    } else {
                        paragraphZzXF = null;
                    }
                }
            }
            if (paragraphZzXF != null) {
                paragraphZzXF.zzZ(getBookmarkEnd(), (Node) null, true);
                getBookmarkEnd().zzOY(2);
            }
        }
        return bookmarkEnd;
    }

    private zzYEF zz9n() {
        Paragraph paragraphZzXF;
        Node nodeZzYB7;
        if (this.zzZCT.zzYAY() != 6) {
            paragraphZzXF = zzYVU.zzXF(this.zzZCT);
            if (paragraphZzXF == null) {
                return new zzYEF();
            }
            nodeZzYB7 = paragraphZzXF.zzZYv();
        } else {
            paragraphZzXF = (Paragraph) this.zzZCT.getAncestor(8);
            nodeZzYB7 = this.zzZCT.zzYB7();
        }
        while (nodeZzYB7 != null && !(nodeZzYB7 instanceof Inline)) {
            nodeZzYB7 = nodeZzYB7.zzYB7();
        }
        return nodeZzYB7 != null ? ((Inline) nodeZzYB7).zzZYh() : paragraphZzXF.zzYp5();
    }

    private void zz9o() throws Exception {
        Node bookmarkEnd = getBookmarkEnd();
        do {
            bookmarkEnd = bookmarkEnd.getPreviousSibling();
            if (bookmarkEnd == null) {
                break;
            }
        } while (zzS(bookmarkEnd));
        if (getBookmarkEnd().getPreviousSibling() != bookmarkEnd) {
            getBookmarkEnd().getParentNode().insertAfter(getBookmarkEnd(), bookmarkEnd);
        }
    }

    private void zz9p() {
        if (getBookmarkStart() == null) {
            return;
        }
        Node bookmarkStart = getBookmarkStart();
        do {
            bookmarkStart = bookmarkStart.getNextSibling();
            if (bookmarkStart == null) {
                break;
            }
        } while (zzS(bookmarkStart));
        if (getBookmarkStart().getNextSibling() != bookmarkStart) {
            getBookmarkStart().getParentNode().insertBefore(getBookmarkStart(), bookmarkStart);
        }
    }

    private Cell zz9q() {
        Row row = (Row) com.aspose.words.internal.zzZKW.zzZ(getBookmarkStart().getAncestor(6), Row.class);
        if (row == null) {
            return null;
        }
        if (getFirstColumn() >= row.getCells().getCount() && getLastColumn() >= row.getCells().getCount()) {
            return null;
        }
        return row.getCells().get(getLastColumn() < getFirstColumn() ? getLastColumn() : getFirstColumn());
    }

    private Cell zz9r() throws Exception {
        Table table;
        Row lastRow = (Row) com.aspose.words.internal.zzZKW.zzZ(getBookmarkEnd().getAncestor(6), Row.class);
        if (lastRow == null && (lastRow = (Row) com.aspose.words.internal.zzZKW.zzZ(getBookmarkEnd().zzYB9(), Row.class)) == null && (table = (Table) com.aspose.words.internal.zzZKW.zzZ(getBookmarkStart().getAncestor(5), Table.class)) != null) {
            lastRow = table.getLastRow();
        }
        if (lastRow == null) {
            return null;
        }
        if (getFirstColumn() >= lastRow.getCells().getCount() && getLastColumn() >= lastRow.getCells().getCount()) {
            return null;
        }
        boolean z = lastRow.getCells().getCount() <= getLastColumn();
        Cell lastCell = z ? lastRow.getLastCell() : lastRow.getCells().get(getLastColumn());
        Row row = (Row) com.aspose.words.internal.zzZKW.zzZ(getBookmarkStart().getAncestor(6), Row.class);
        if (row == null || !Node.zzD(row, lastRow) || !Node.zzD(getBookmarkEnd(), lastCell)) {
            return lastCell;
        }
        Row previousRow = lastRow.getPreviousRow();
        return z ? previousRow.getLastCell() : previousRow.getCells().get(getLastColumn());
    }

    private static void zzQ(Node node) {
        node.getNodeType();
        node.zzYAY();
        Node nodeZzYB9 = node.zzYB9();
        Node firstChild = nodeZzYB9 == null ? node.getParentNode().getFirstChild() : nodeZzYB9.getNextSibling();
        Node nodeZzYB4 = node.zzYB4();
        CompositeNode compositeNodeZzYB5 = node.zzYB5();
        Node nodeZzZ = compositeNodeZzYB5 != null ? zzJ.zzZ(compositeNodeZzYB5, true) : null;
        if (nodeZzZ != null) {
            if (!nodeZzZ.isComposite() || zzYVU.zzXS(nodeZzZ)) {
                nodeZzZ.getParentNode().zzZ(firstChild, nodeZzYB4, nodeZzZ);
            } else {
                ((CompositeNode) nodeZzZ).zzY(firstChild, nodeZzYB4, null);
            }
        }
    }

    private static boolean zzR(Node node) {
        return node.getAncestor(1) == null;
    }

    private boolean zzS(Node node) {
        zzZD7 zzzd7 = (zzZD7) com.aspose.words.internal.zzZKW.zzZ(node, zzZD7.class);
        return (zzzd7 == null || com.aspose.words.internal.zzZYD.zzi(getName(), zzzd7.getName())) ? false : true;
    }

    private void zzTj(String str) {
        String strReplace = str.replace(ControlChar.CELL, "");
        Row row = getBookmarkStart().getParentNode().getNodeType() == 5 ? (Row) getBookmarkStart().zztD(6) : (Row) com.aspose.words.internal.zzZKW.zzZ(getBookmarkStart().getAncestor(6), Row.class);
        if (row != null) {
            if (getFirstColumn() < row.getCells().getCount() || getLastColumn() < row.getCells().getCount()) {
                Cell cell = row.getCells().get(getLastColumn() > getFirstColumn() ? getFirstColumn() : getLastColumn());
                Paragraph firstParagraph = cell.getFirstParagraph();
                zzYEF zzyefZzZYh = firstParagraph.getRuns().getCount() > 0 ? firstParagraph.zzYVe().zzZYh() : new zzYEF();
                zzZ(cell);
                if (!com.aspose.words.internal.zzZKN.zzU3(strReplace)) {
                    firstParagraph.appendChild(new Run(getBookmarkStart().getDocument(), strReplace, zzyefZzZYh));
                }
                cell.insertAfter(firstParagraph, null);
            }
        }
    }

    private void zzTk(String str) throws Exception {
        zz9p();
        zz9o();
        zzYEF zzyefZz9n = zz9n();
        zzYK6 zzyk6ZzZ = zzJ.zzZ((Node) getBookmarkStart(), true);
        if (zzyk6ZzZ == null) {
            getBookmarkStart().zzOY(2);
            zzyk6ZzZ = zzJ.zzZ((Node) getBookmarkStart(), true);
        }
        zzYK6 zzyk6ZzZ2 = zzJ.zzZ((Node) getBookmarkEnd(), false);
        if (zzyk6ZzZ2 == null) {
            getBookmarkEnd().zzOY(2);
            zzyk6ZzZ2 = zzJ.zzZ((Node) getBookmarkEnd(), false);
        }
        Node bookmarkEnd = getBookmarkEnd();
        zzYWB zzywbZzZ = zzZ(zzyk6ZzZ, zzyk6ZzZ2, (BookmarkStart) null);
        if (zzyk6ZzZ != null && zzyk6ZzZ2 != null) {
            if (zzyk6ZzZ2.getNode() == getBookmarkEnd() && getBookmarkEnd().zz9d() == 2 && getBookmarkEnd().zzYAY() != 6 && zzyk6ZzZ2.getNode().zzYB4() != zzyk6ZzZ.getNode().zzYB4()) {
                zzQ(getBookmarkEnd());
            }
            new zzY6(zzywbZzZ).zzYzM();
            zzZ(zzyk6ZzZ, zzyk6ZzZ2);
            bookmarkEnd = zz9k();
        }
        DocumentBuilder documentBuilder = new DocumentBuilder(getBookmarkStart().zzYBb());
        documentBuilder.moveTo(bookmarkEnd);
        zzYEF zzyef = (zzYEF) zzyefZz9n.zzbn();
        zzYJ3.zzA(zzyef);
        documentBuilder.zzZ(zzyef, false);
        zzZ(documentBuilder, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.aspose.words.BookmarkEnd, com.aspose.words.Node] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.aspose.words.Node] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.aspose.words.CompositeNode] */
    private static Node zzY(BookmarkStart bookmarkStart, BookmarkEnd bookmarkEnd) {
        if ((bookmarkEnd.getParentNode().getNodeType() != 8 || !zzYVU.zzXP(bookmarkEnd.getParentNode().getParentNode())) && !zzYVU.zzXP(bookmarkEnd.getParentNode()) && !zzYVU.zzXQ(bookmarkEnd.getParentNode()) && bookmarkEnd.zzYAY() != 4) {
            return bookmarkEnd;
        }
        loop0: while (true) {
            for (Node firstChild = bookmarkEnd.getParentNode().getFirstChild(); firstChild != bookmarkEnd; firstChild = firstChild.getNextSibling()) {
                if (firstChild == bookmarkStart || !zzYVU.zztq(firstChild.getNodeType())) {
                    break loop0;
                }
            }
            bookmarkEnd = bookmarkEnd.getParentNode();
        }
        return bookmarkEnd;
    }

    private zzYK6 zzYQ(boolean z) throws Exception {
        isColumn();
        Cell cellZz9q = z ? zz9q() : zz9r();
        if (cellZz9q == null) {
            return null;
        }
        return new zzYK6(cellZz9q, true, null, null);
    }

    private zzYK6 zzYR(boolean z) throws Exception {
        return isColumn() ? zzYQ(z) : zzJ.zzZ(z ? getBookmarkStart() : getBookmarkEnd(), z);
    }

    private static void zzZ(DocumentBuilder documentBuilder, String str) {
        String strZzyv = zzY0C.zzyv(str);
        int i = 0;
        while (i <= strZzyv.length()) {
            int iIndexOf = strZzyv.indexOf(13, i);
            boolean z = iIndexOf >= 0;
            if (!z) {
                iIndexOf = strZzyv.length();
            }
            int i2 = iIndexOf - i;
            if (i2 > 0) {
                documentBuilder.write(strZzyv.substring(i, i2 + i));
            }
            if (z) {
                zzZ(documentBuilder);
            }
            i = iIndexOf + 1;
        }
    }

    public BookmarkEnd getBookmarkEnd() throws Exception {
        if (this.zzZCS == null) {
            this.zzZCS = zzY9.zzY(this.zzZCT.zzYAW(), getName(), this.zzZCT);
        }
        return this.zzZCS;
    }

    public BookmarkStart getBookmarkStart() {
        return this.zzZCT;
    }

    public int getFirstColumn() {
        return this.zzZCT.getFirstColumn();
    }

    public int getLastColumn() {
        return this.zzZCT.getLastColumn();
    }

    public String getName() {
        return getBookmarkStart().getName();
    }

    public String getText() throws Exception {
        return zzYP(false);
    }

    public boolean isColumn() {
        return this.zzZCT.isColumn();
    }

    public void remove() throws Exception {
        getBookmarkEnd().remove();
        getBookmarkStart().remove();
    }

    public void setName(String str) throws Exception {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        getBookmarkEnd().zzTh(str);
        getBookmarkStart().zzTh(str);
    }

    public void setText(String str) throws Exception {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        if (isColumn()) {
            zzTj(str);
        } else {
            zzTk(str);
        }
    }

    public final zzYWB zz9l() throws Exception {
        boolean z;
        zzYWB zzywbZz9m = zz9m();
        Node node = zzywbZz9m.zzYA2().getNode();
        if (node.getNodeType() == 9 && !((BookmarkStart) node).isColumn()) {
            while (node.getPreviousSibling() != null && node.getPreviousSibling().getNodeType() == 9 && !((BookmarkStart) node.getPreviousSibling()).isColumn()) {
                node = node.getPreviousSibling();
            }
        }
        Node node2 = node;
        Node node3 = zzywbZz9m.zzYA1().getNode();
        if (node3.getNodeType() == 10) {
            while (node3.getNextSibling() != null && node3.getNextSibling().getNodeType() == 10) {
                node3 = node3.getNextSibling();
            }
        }
        Node node4 = node3;
        boolean z2 = true;
        if (node2.getNodeType() == 9) {
            z = true;
        } else {
            z = true;
            z2 = false;
        }
        return new zzYWB(node2, z2, node4, node4.getNodeType() == 10 ? z : false, (BookmarkStart) com.aspose.words.internal.zzZKW.zzZ(node2, BookmarkStart.class));
    }

    public final zzYWB zz9m() throws Exception {
        return zzZ(getBookmarkStart(), getBookmarkEnd());
    }

    public final String zzYP(boolean z) throws Exception {
        zzYK6 zzyk6ZzYR = zzYR(true);
        zzYK6 zzyk6ZzYR2 = zzYR(false);
        return (zzyk6ZzYR == null || zzyk6ZzYR2 == null) ? "" : zzYVY.zzZ(zzyk6ZzYR.getNode(), zzyk6ZzYR.zzYml(), zzyk6ZzYR2.getNode(), zzyk6ZzYR2.zzYml(), z);
    }

    public Bookmark(BookmarkStart bookmarkStart, BookmarkEnd bookmarkEnd) {
        this(bookmarkStart);
        com.aspose.words.internal.zzZ4.zzY((Object) bookmarkEnd, "bookmarkEnd");
        this.zzZCS = bookmarkEnd;
    }

    private static void zzZ(DocumentBuilder documentBuilder) {
        Document document = documentBuilder.getDocument();
        Paragraph currentParagraph = documentBuilder.getCurrentParagraph();
        Paragraph paragraph = new Paragraph(document, documentBuilder.zzZpF(), documentBuilder.zzZpG());
        zzYJ3.zzA(paragraph.zzYp5());
        currentParagraph.zzYC(paragraph);
        zzY81 zzy81 = new zzY81(document);
        try {
            paragraph.zzZ(currentParagraph.getFirstChild(), documentBuilder.getCurrentNode(), (Node) null);
        } finally {
            zzy81.dispose();
        }
    }

    private static void zzZ(Cell cell) {
        Paragraph firstParagraph = cell.getFirstParagraph();
        for (int i = 1; i < cell.getParagraphs().getCount(); i++) {
            for (Node node : cell.getParagraphs().get(i)) {
                if (node.getNodeType() == 9) {
                    firstParagraph.appendChild(node);
                }
            }
        }
        cell.getChildNodes(0, false).clear();
        for (Node node2 : firstParagraph.getChildNodes(0, false)) {
            if (!zzYVU.zzXT(node2)) {
                node2.remove();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[PHI: r5
      0x003d: PHI (r5v6 int) = (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:13:0x003a, B:18:0x004a, B:16:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzYWB zzZ(BookmarkStart bookmarkStart, BookmarkEnd bookmarkEnd) {
        zzYK6 zzyk6;
        boolean z;
        BookmarkStart bookmarkStart2;
        zzYK6 zzyk6ZzZ = zzJ.zzZ((Node) bookmarkStart, true);
        if (bookmarkEnd.zz9d() != 2) {
            zzyk6 = zzJ.zzZ((Node) bookmarkEnd, false);
        } else {
            zzyk6 = new zzYK6(zzY(bookmarkStart, bookmarkEnd), false);
        }
        if (zzyk6ZzZ != null && zzyk6 != null) {
            zzYWB zzywbZzZ = zzZ(zzyk6ZzZ, zzyk6, bookmarkStart);
            int i = 0;
            for (Node node : zzywbZzZ) {
                switch (node.getNodeType()) {
                    case 22:
                        i++;
                        z = false;
                        if (!z) {
                            bookmarkStart2 = bookmarkStart;
                        } else {
                            if (i == 0) {
                                return new zzYWB(zzZ(zzyk6ZzZ, node), true, zzyk6.getNode(), zzyk6.zzYml(), bookmarkStart);
                            }
                            bookmarkStart2 = bookmarkStart;
                            i--;
                        }
                        bookmarkStart = bookmarkStart2;
                        break;
                    case 24:
                        if (((FieldEnd) node).hasSeparator()) {
                            z = false;
                        }
                        if (!z) {
                        }
                        bookmarkStart = bookmarkStart2;
                        break;
                }
                z = true;
                if (!z) {
                }
                bookmarkStart = bookmarkStart2;
            }
            return zzywbZzZ;
        }
        return zzYWB.zzXV4;
    }

    private static zzYWB zzZ(zzYK6 zzyk6, zzYK6 zzyk62, BookmarkStart bookmarkStart) {
        return new zzYWB(zzyk6.getNode(), zzyk6.zzYml(), zzyk62.getNode(), zzyk62.zzYml(), bookmarkStart);
    }

    private static Node zzZ(zzYK6 zzyk6, Node node) {
        zzZYT zzzytZzp;
        if (zzyk6.zzYml()) {
            zzzytZzp = zzZYT.zzq(zzyk6.getNode());
        } else {
            zzzytZzp = zzZYT.zzp(zzyk6.getNode());
        }
        zzZYT zzzyt = zzzytZzp;
        while (true) {
            if (!zzzyt.zzZ(null, false, true, true, false, false)) {
                break;
            }
            Node node2 = zzzyt.getNode();
            if (zzYVU.zzXO(node2) && !zzYVU.zztq(node2.getNodeType())) {
                if (node2.getNodeType() == 22) {
                    return node2;
                }
            }
        }
        return node;
    }

    private void zzZ(zzYK6 zzyk6, zzYK6 zzyk62) throws Exception {
        if (zzR(getBookmarkStart())) {
            Node nodeZzYmk = zzyk6.zzYmk();
            if (nodeZzYmk != null && !zzR(nodeZzYmk)) {
                if (nodeZzYmk.getNodeType() == 28) {
                    zzZ(getBookmarkStart(), (CompositeNode) nodeZzYmk, zzyk6.zzYmh());
                } else {
                    nodeZzYmk.getParentNode().zzZ(getBookmarkStart(), nodeZzYmk, getBookmarkStart().zz9d() == 1);
                }
            } else {
                zzyk6.zzYmg().zzZ(getBookmarkStart(), zzyk6.zzYml() ? zzyk6.getPreviousSibling() : zzyk6.getNode(), true);
                getBookmarkStart().zzOY(2);
            }
        }
        if (zzR(getBookmarkEnd())) {
            Node nodeZzYmk2 = zzyk62.zzYmk();
            if (nodeZzYmk2 != null && !zzR(nodeZzYmk2)) {
                if (nodeZzYmk2.getNodeType() == 28) {
                    zzZ(getBookmarkEnd(), (CompositeNode) nodeZzYmk2, zzyk62.zzYmh());
                    return;
                } else {
                    nodeZzYmk2.getParentNode().zzZ(getBookmarkEnd(), nodeZzYmk2, getBookmarkEnd().zz9d() == 1);
                    return;
                }
            }
            zzyk62.zzYmg().zzZ(getBookmarkEnd(), zzyk62.zzYml() ? zzyk62.getNextSibling() : zzyk62.getNode(), false);
            getBookmarkEnd().zzOY(2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void zzZ(Node node, CompositeNode compositeNode, boolean z) {
        int displacedByCustomXml = ((zzZCT) node).getDisplacedByCustomXml();
        if (displacedByCustomXml == 0 || displacedByCustomXml == 1) {
            if (z) {
                compositeNode.zzZ(node, (Node) null, displacedByCustomXml == 1);
            } else {
                compositeNode.getParentNode().zzZ(node, compositeNode, displacedByCustomXml == 1);
            }
        }
    }
}
