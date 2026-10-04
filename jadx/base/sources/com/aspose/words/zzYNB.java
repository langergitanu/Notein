package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYNB implements zzZA5 {
    private Node zzXHU;
    private Paragraph zzXHV;
    private int zzYSu;
    private LayoutCollector zzYfD;
    private Document zzZEY;
    private com.aspose.words.internal.zzZQC<CompositeNode> zzYA = new com.aspose.words.internal.zzZQC<>();
    private int zzXHY = -1;
    private int zzXHX = -1;
    private int zzXHW = 1;
    private com.aspose.words.internal.zzIM<ListLevel> zzXHT = new com.aspose.words.internal.zzIM<>();
    private HashMap<Integer, Integer> zzXHS = new HashMap<>();
    private HashMap<Integer, Integer> zzXHR = new HashMap<>();
    private com.aspose.words.internal.zzIM<Node> zzXHQ = new com.aspose.words.internal.zzIM<>();
    private com.aspose.words.internal.zzIM<Node> zzXHP = new com.aspose.words.internal.zzIM<>();
    private ArrayList<Node> zzY3Y = new ArrayList<>();
    private ArrayList<Node> zzXHO = new ArrayList<>();
    private HashMap<Node, Node> zzXHN = new HashMap<>();

    public static class zzZ implements zzZB4 {
        private zzZ() {
        }

        @Override // com.aspose.words.zzZB4
        public final boolean zzU(FieldChar fieldChar) {
            return fieldChar.getFieldType() == 26;
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    public zzYNB(Document document) throws Exception {
        this.zzZEY = document;
        LayoutCollector layoutCollector = new LayoutCollector(document);
        this.zzYfD = layoutCollector;
        layoutCollector.getStartPageIndex(document);
        this.zzYSu = this.zzZEY.zzZq4();
    }

    private int getLineStartingNumber() throws Exception {
        for (int i = this.zzXHY; i <= getPageCount(); i++) {
            int iZzqN = this.zzZEY.zzZqh().zzqN(i - 1);
            if (iZzqN != -1) {
                return iZzqN;
            }
        }
        return 1;
    }

    private int getPageCount() throws Exception {
        zzYqx();
        return this.zzZEY.getPageCount();
    }

    private static void zz7(Document document) {
        if (document.zzZpU().zzB1(3) == null) {
            return;
        }
        Paragraph paragraph = (Paragraph) document.zzZpU().zzB1(3).getFirstChild();
        paragraph.removeAllChildren();
        paragraph.appendChild(new SpecialChar(document, (char) 4, new zzYEF()));
    }

    private void zz8(Document document) throws Exception {
        if (this.zzY3Y.size() == 0) {
            return;
        }
        Iterator<Node> it = this.zzY3Y.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Footnote footnote = (Footnote) it.next();
            int iZzXg = zzXg(footnote);
            Footnote footnoteZzZ = null;
            for (Node node : footnote.getParagraphs()) {
                int iZzXg2 = zzXg(node);
                if (!z && iZzXg == 0) {
                    document.getFootnoteOptions().setStartNumber(this.zzY3Y.indexOf(footnote) + document.getFootnoteOptions().getStartNumber());
                    z = true;
                }
                if (iZzXg == 1 && iZzXg2 == 2) {
                    if (footnoteZzZ == null) {
                        Paragraph firstParagraph = document.getFirstSection().getBody().getFirstParagraph();
                        if (firstParagraph == null) {
                            firstParagraph = zzO(document.getFirstSection().getBody());
                        }
                        footnoteZzZ = zzZ(0, firstParagraph);
                    }
                    this.zzYA.push(footnoteZzZ);
                    zzXh(node);
                    this.zzYA.pop();
                }
            }
        }
    }

    private void zz9(Document document) throws Exception {
        if (this.zzXHO.size() == 0) {
            return;
        }
        if (document.getLastSection() == null) {
            zzY(this.zzZEY.getLastSection(), (CompositeNode) document, false);
        }
        if (document.getLastSection().getBody() == null) {
            zzY(this.zzZEY.getLastSection().getBody(), document.getLastSection(), false);
        }
        Iterator<Node> it = this.zzXHO.iterator();
        Footnote footnote = null;
        int i = 1;
        while (it.hasNext()) {
            Footnote footnote2 = (Footnote) it.next();
            int iZzXg = zzXg(footnote2);
            Footnote footnoteZzZ = null;
            for (Node node : footnote2.getParagraphs()) {
                int iZzXg2 = zzXg(node);
                if (iZzXg == 1 && iZzXg2 != 1) {
                    if (footnoteZzZ == null) {
                        Paragraph firstParagraph = document.getFirstSection().getBody().getFirstParagraph();
                        if (firstParagraph == null) {
                            firstParagraph = zzO(document.getFirstSection().getBody());
                        }
                        footnoteZzZ = zzZ(1, firstParagraph);
                    }
                    this.zzYA.push(footnoteZzZ);
                    zzXh(node);
                    this.zzYA.pop();
                } else if (footnoteZzZ == null) {
                    i++;
                }
            }
            footnote = footnoteZzZ;
        }
        if (i > 1 && footnote != null) {
            document.getEndnoteOptions().setStartNumber(i);
        }
        int endPageIndex = this.zzYfD.getEndPageIndex(this.zzZEY);
        if (this.zzXHO.size() <= 0 || this.zzXHY <= endPageIndex) {
            return;
        }
        zz7(document);
    }

    private void zzF(List list) {
        zzZ4J zzz4jZzX = list.zzYPa().zzX(list.getDocument(), list.getDocument().getLists().zzYP3());
        list.getDocument().getLists().zzZ(zzz4jZzX);
        List listZzY = list.zzY(list.getDocument(), list.getDocument().getLists().zzYP2());
        list.getDocument().getLists().zzQ(listZzY);
        listZzY.zzxB(zzz4jZzX.zzYP8());
        com.aspose.words.internal.zzZQF.zzY(this.zzXHR, Integer.valueOf(list.getListId()), Integer.valueOf(listZzY.getListId()));
    }

    private static Paragraph zzO(CompositeNode compositeNode) {
        if (compositeNode.getDocument() == null) {
            throw new IllegalStateException("This operation requires the node to be inside the main document.");
        }
        Paragraph paragraph = new Paragraph(compositeNode.getDocument());
        paragraph.zzZYj().zzw3(0);
        paragraph.zzZYj().zzw5(0);
        paragraph.zzYp5().setSize(0);
        paragraph.zzYp5().zzvA(0);
        compositeNode.appendChild(paragraph);
        return paragraph;
    }

    private void zzR(Paragraph paragraph, Paragraph paragraph2) {
        if (paragraph.isListItem() && paragraph2.isListItem() && paragraph.zzYoT()) {
            zzZ(paragraph2, paragraph2.getListFormat().getList().getListLevels().get(paragraph2.zzRB(false).zzYOa()));
            for (int i = 0; i <= paragraph.zzRB(false).zzYOa(); i++) {
                ListLevel listLevel = paragraph2.getListFormat().getList().getListLevels().get(i);
                if (!this.zzXHT.contains(listLevel)) {
                    zzZ(listLevel, paragraph);
                    for (zzZ4B zzz4b : paragraph2.getListFormat().getList().zzYPb()) {
                        if (zzz4b.getListLevel().zzYOa() == listLevel.zzYOa()) {
                            zzz4b.zzYbY = listLevel.getStartAt();
                        }
                    }
                    this.zzXHT.add(listLevel);
                }
            }
        }
    }

    private void zzV(Section section, Section section2) throws Exception {
        for (int i : HeaderFooterType.getValues()) {
            HeaderFooter headerFooterZzV = zzV(section, i);
            HeaderFooter byHeaderFooterType = section.getHeadersFooters().getByHeaderFooterType(i);
            HeaderFooter byHeaderFooterType2 = section2.getHeadersFooters().getByHeaderFooterType(i);
            boolean z = (byHeaderFooterType == null || byHeaderFooterType.isLinkedToPrevious() || section.zzYVf()) ? false : true;
            if (((section2.zzYVf() && headerFooterZzV != null) || z) && byHeaderFooterType2 == null) {
                zzZ(headerFooterZzV, section2, i);
            }
        }
        if (this.zzYfD.getStartPageIndex(section) < this.zzXHY) {
            section2.zzYvR().setDifferentFirstPageHeaderFooter(false);
        }
    }

    private void zzX(Node node, Node node2, int i) throws Exception {
        int nodeType = node.getNodeType();
        if (nodeType == 2) {
            zzY((Section) node, (Section) node2, i);
            return;
        }
        if (nodeType == 28) {
            zzZ((StructuredDocumentTag) node, (StructuredDocumentTag) node2, i);
            return;
        }
        if (nodeType == 5) {
            zzZ((Table) node, (Table) node2, i);
            return;
        }
        if (nodeType == 6) {
            zzZ((Row) node, (Row) node2, i);
            return;
        }
        if (nodeType == 7) {
            zzZ((Cell) node, (Cell) node2, i);
            return;
        }
        if (nodeType == 8) {
            zzZ((Paragraph) node, (Paragraph) node2, i);
        } else if (nodeType == 20) {
            zzZ((Footnote) node, (Footnote) node2, i);
        } else {
            if (nodeType != 21) {
                return;
            }
            zzZ((Run) node, (Run) node2, i);
        }
    }

    private int zzXg(Node node) throws Exception {
        int startPageIndex = this.zzYfD.getStartPageIndex(node);
        int endPageIndex = this.zzYfD.getEndPageIndex(node);
        int i = this.zzXHY;
        if (startPageIndex >= i && endPageIndex <= this.zzXHX) {
            return 0;
        }
        if (startPageIndex < i && endPageIndex < i) {
            return 1;
        }
        int i2 = this.zzXHX;
        return (startPageIndex <= i2 || endPageIndex <= i2) ? 2 : 1;
    }

    private void zzXh(Node node) throws Exception {
        Node nodeZzY;
        int iZzXg = zzXg(node);
        boolean zZzF = zzF(node, iZzXg);
        if (iZzXg != 1) {
            nodeZzY = zzY(node, zzYz7(), !zZzF);
            this.zzXHU = node;
        } else {
            nodeZzY = null;
        }
        zzX(node, nodeZzY, iZzXg);
        if (zZzF) {
            this.zzYA.push((CompositeNode) nodeZzY);
            Iterator<T> it = ((CompositeNode) node).getChildNodes(0, false).iterator();
            while (it.hasNext()) {
                zzXh((Node) it.next());
            }
            this.zzYA.pop();
        }
    }

    private void zzY(Section section, Section section2, int i) throws Exception {
        if (section.zzYVf() || section.zzYvR().contains(2200)) {
            this.zzXHW = section.zzYvR().getPageStartingNumber() - this.zzYfD.getStartPageIndex(section);
        }
        if (i == 1) {
            return;
        }
        if (section2.zzYVf()) {
            int i2 = this.zzXHW + this.zzXHY;
            section2.zzYvR().zzYcu();
            section2.zzYvR().setPageStartingNumber(i2);
            if ((section2.zzYvR().getSectionStart() == 3 || section2.zzYvR().getSectionStart() == 4) && this.zzYfD.getStartPageIndex(section) < this.zzXHY) {
                section2.zzYvR().setSectionStart(0);
            }
            if (section2.zzYvR().getLineNumberCountBy() > 0) {
                section2.zzYvR().setLineStartingNumber(getLineStartingNumber());
            }
        }
        zzV(section, section2);
    }

    private void zzYqw() {
        for (Node node : this.zzXHN.keySet()) {
            int nodeType = node.getNodeType();
            if (nodeType == 7) {
                Cell cell = (Cell) node;
                zzWP zzwpZzYI = ((Cell) this.zzXHN.get(cell)).zzYI(true);
                cell.zz6G().zzY((zzZS) zzwpZzYI);
                cell.zzZ(zzwpZzYI);
            } else if (nodeType == 8) {
                Paragraph paragraph = (Paragraph) node;
                Paragraph paragraph2 = (Paragraph) this.zzXHN.get(paragraph);
                zzYMX zzymxZzqw = paragraph2.zzqw(4);
                paragraph.zzZYj().zzY(zzymxZzqw);
                paragraph.zzZ(zzymxZzqw);
                zzYEF zzyefZzqv = paragraph2.zzqv(64);
                paragraph.zzYp5().zzY(zzyefZzqv);
                paragraph.zzC(zzyefZzqv);
            } else if (nodeType == 21) {
                Run run = (Run) node;
                zzYEF zzyefZzZ = zzZ7R.zzZ((Run) this.zzXHN.get(run), 0);
                run.zzZYh().zzY(zzyefZzZ);
                run.zzZ(zzyefZzZ);
            }
        }
    }

    private void zzYqx() throws Exception {
        if (this.zzZEY.zzZq4() != this.zzYSu) {
            this.zzZEY.zzZqk();
            this.zzYfD.clear();
            this.zzZEY.updatePageLayout();
            this.zzYSu = this.zzZEY.zzZq4();
        }
    }

    private CompositeNode zzYz7() {
        return this.zzYA.peek();
    }

    private static void zzZ(Paragraph paragraph, Section section) {
        Paragraph paragraph2 = (Paragraph) paragraph.deepClone(true);
        Document documentZzYBb = section.getDocument().zzYBb();
        paragraph2.zzY(documentZzYBb);
        documentZzYBb.getFirstSection().getBody().getFirstParagraph().zzYC(paragraph2);
        paragraph2.zzYp5().setSize(0);
        paragraph2.zzYp5().zzvA(0);
        paragraph2.zzZYj().zzw3(0);
        paragraph2.zzZYj().zzw5(0);
        for (Run run : paragraph2.getRuns()) {
            run.zzZYh().setSize(0);
            run.zzZYh().zzvA(0);
            run.zzZYh().zzY(com.aspose.words.internal.zzPV.zzI5);
        }
    }

    private static void zza(Document document) {
        Run runZzRD;
        Paragraph lastParagraph = document.getLastSection().getBody().getLastParagraph();
        if (lastParagraph.isEndOfSection() && !lastParagraph.zzZYw() && lastParagraph.getPreviousSibling() != null) {
            lastParagraph = lastParagraph.getPreviousSibling().getNodeType() == 5 ? ((Table) lastParagraph.getPreviousSibling()).getLastRow().getLastCell().getLastParagraph() : (Paragraph) com.aspose.words.internal.zzZKW.zzZ(lastParagraph.getPreviousSibling(), Paragraph.class);
        }
        if (lastParagraph == null || (runZzRD = lastParagraph.zzRD(false)) == null) {
            return;
        }
        if (lastParagraph.zzZYr() == runZzRD && com.aspose.words.internal.zzZKN.zzW(runZzRD.getText(), ControlChar.PAGE_BREAK, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) && runZzRD.getText().length() == 1) {
            if (document.getLastSection().getBody().getLastParagraph() != lastParagraph) {
                document.getLastSection().getBody().getLastParagraph().remove();
            }
            lastParagraph.remove();
            return;
        }
        String text = runZzRD.getText();
        String str = ControlChar.PAGE_BREAK;
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        if (com.aspose.words.internal.zzZKN.zzW(text, str, i) || com.aspose.words.internal.zzZKN.zzW(runZzRD.getText(), ControlChar.LINE_BREAK, i) || com.aspose.words.internal.zzZKN.zzW(runZzRD.getText(), ControlChar.COLUMN_BREAK, i)) {
            runZzRD.setText(runZzRD.getText().substring(0, runZzRD.getText().length() - 1));
        }
    }

    private static void zzd(Table table) throws Exception {
        TableStyle tableStyle = (TableStyle) table.getStyle();
        if (tableStyle == null || !tableStyle.zzXWR()) {
            return;
        }
        TableStyle tableStyle2 = (TableStyle) table.getDocument().getStyles().addCopy(tableStyle);
        tableStyle2.zzXWV();
        table.setStyle(tableStyle2);
    }

    private int zzqP(int i) {
        if (this.zzXHS.containsKey(Integer.valueOf(i))) {
            return this.zzXHS.get(Integer.valueOf(i)).intValue();
        }
        return Integer.MAX_VALUE;
    }

    public final Document extractPages(int i, int i2) throws Exception {
        zzYqx();
        this.zzXHT.clear();
        this.zzXHS.clear();
        this.zzXHR.clear();
        this.zzXHQ.clear();
        this.zzXHO.clear();
        this.zzY3Y.clear();
        this.zzXHP.clear();
        this.zzXHN.clear();
        if (i > i2 || i <= 0) {
            throw new IllegalArgumentException("Page index is out of range.\r\nParameter name: startIndex");
        }
        if (i2 > getPageCount()) {
            throw new IllegalArgumentException("Page index is out of range.\r\nParameter name: endIndex");
        }
        byte b = 0;
        Document document = (Document) this.zzZEY.deepClone(false);
        document.zzZq9().add(23);
        this.zzXHY = i;
        this.zzXHX = i2;
        this.zzXHV = null;
        zzY(this.zzZEY, 0, getPageCount());
        this.zzYA.push(document);
        Iterator<T> it = this.zzZEY.getChildNodes(0, false).iterator();
        while (it.hasNext()) {
            zzXh((Node) it.next());
        }
        while (document.getSections().getCount() > 1 && document.getLastSection().getBody().getChildNodes(8, true).getCount() == 0) {
            document.getLastSection().remove();
        }
        zz8(document);
        zz9(document);
        if (document.getLastSection() != null && document.getLastSection().getBody().getLastChild() != null && document.getLastSection().getBody().getLastChild().getNodeType() == 5) {
            zzO(document.getLastSection().getBody());
        }
        document.ensureMinimum();
        Paragraph lastParagraph = document.getLastSection().getBody().getLastParagraph();
        if (lastParagraph.getParagraphFormat().getNoSpaceBetweenParagraphsOfSameStyle()) {
            lastParagraph.getParagraphFormat().setSpaceAfter(0.0d);
        }
        Node node = this.zzXHU;
        if (node != null) {
            int startPageIndex = this.zzYfD.getStartPageIndex(node);
            int endPageIndex = this.zzYfD.getEndPageIndex(this.zzXHU);
            int i3 = this.zzXHX;
            if (startPageIndex == i3 || endPageIndex > i3) {
                zza(document);
            }
        }
        zzYqw();
        for (Section section : document.getSections()) {
            for (HeaderFooter headerFooter : section.getHeadersFooters()) {
                if (section == document.getFirstSection()) {
                    zzV(headerFooter);
                }
                zzZPN.zzZ(new zzYWB(headerFooter, headerFooter), new zzZ(b));
            }
        }
        this.zzYA.pop();
        return document;
    }

    @Override // com.aspose.words.zzZA5
    public final void zzW(Node node, Node node2) {
        int nodeType = node.getNodeType();
        if (nodeType != 6 ? (nodeType == 7 || nodeType == 8 || nodeType == 21) ? this.zzXHP.contains(node.getParentNode()) : false : this.zzXHP.contains(((Row) node).getParentTable())) {
            if (node.getNodeType() != 6) {
                com.aspose.words.internal.zzZQF.zzY(this.zzXHN, node2, node);
            }
            if (node.getNodeType() != 21) {
                this.zzXHP.add(node);
            }
        }
    }

    private boolean zzF(Node node, int i) {
        if (!node.isComposite()) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        boolean zContains = this.zzXHQ.contains(node);
        if (i == 0 && zContains) {
            return true;
        }
        Iterator<T> it = ((CompositeNode) node).getChildNodes(8, true).iterator();
        while (it.hasNext()) {
            if (((Paragraph) it.next()).isListItem()) {
                return true;
            }
        }
        return false;
    }

    private void zzV(HeaderFooter headerFooter) throws Exception {
        Style styleZz0;
        for (Field field : headerFooter.getRange().getFields()) {
            if (field.getType() == 10 && (styleZz0 = headerFooter.getDocument().getStyles().zz0(((FieldStyleRef) field).getStyleName(), false)) != null) {
                for (int count = this.zzZEY.getSections().getCount() - 1; count >= 0 && !zzX(this.zzZEY.getSections().get(count), headerFooter.getParentSection(), styleZz0.zzZ7j()); count--) {
                }
            }
        }
    }

    private boolean zzX(Section section, Section section2, int i) throws Exception {
        int startPageIndex;
        int i2;
        if (this.zzYfD.getStartPageIndex(section) > this.zzXHY) {
            return false;
        }
        NodeCollection childNodes = section.getBody().getChildNodes(8, true);
        for (int count = childNodes.getCount() - 1; count >= 0; count--) {
            Paragraph paragraph = (Paragraph) childNodes.get(count);
            if (paragraph.zzqy(0).zzZ7j() == i && (startPageIndex = this.zzYfD.getStartPageIndex(paragraph)) <= (i2 = this.zzXHY)) {
                if (startPageIndex < i2) {
                    zzZ(paragraph, section2);
                }
                return true;
            }
        }
        return false;
    }

    private Node zzY(Node node, CompositeNode compositeNode, boolean z) {
        Node nodeZzZ = node.zzZ(z, this);
        nodeZzZ.zzY(compositeNode.getDocument());
        compositeNode.appendChild(nodeZzZ);
        return nodeZzZ;
    }

    private void zzZ(HeaderFooter headerFooter, Section section, int i) {
        HeaderFooter headerFooter2 = new HeaderFooter(section.getDocument(), i);
        Iterator<T> it = headerFooter.getChildNodes(0, false).iterator();
        while (it.hasNext()) {
            zzY((Node) it.next(), (CompositeNode) headerFooter2, true);
        }
        section.appendChild(headerFooter2);
    }

    private static HeaderFooter zzV(Section section, int i) {
        while (section != null) {
            if (section.getHeadersFooters().getByHeaderFooterType(i) != null) {
                return section.getHeadersFooters().getByHeaderFooterType(i);
            }
            section = (Section) section.getPreviousSibling();
        }
        return null;
    }

    private boolean zzY(CompositeNode compositeNode, int i, int i2) throws Exception {
        boolean z = false;
        for (Node node : compositeNode.getChildNodes(0, false)) {
            if (node instanceof CompositeNode) {
                CompositeNode compositeNode2 = (CompositeNode) node;
                int startPageIndex = this.zzYfD.getStartPageIndex(compositeNode2);
                int endPageIndex = this.zzYfD.getEndPageIndex(compositeNode2);
                if (zzY(compositeNode2, startPageIndex, endPageIndex)) {
                    this.zzXHQ.add(compositeNode2);
                    z = true;
                }
                if (compositeNode instanceof Footnote) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<CompositeNode>) (((Footnote) compositeNode).getFootnoteType() == 1 ? this.zzXHO : this.zzY3Y), compositeNode);
                    return startPageIndex > i2 || endPageIndex < i || endPageIndex > i2 || startPageIndex < i;
                }
            }
        }
        return z;
    }

    private void zzV(CompositeNode compositeNode, CompositeNode compositeNode2) {
        NodeCollection childNodes = compositeNode.getChildNodes(8, true);
        NodeCollection childNodes2 = compositeNode2.getChildNodes(8, true);
        if (childNodes.getCount() == childNodes2.getCount()) {
            for (int i = 0; i < childNodes.getCount(); i++) {
                zzR((Paragraph) childNodes.get(i), (Paragraph) childNodes2.get(i));
            }
        }
    }

    private void zzZ(Run run, Run run2, int i) throws Exception {
        if (i != 2) {
            return;
        }
        ArrayList<Integer> arrayListZzYU = this.zzYfD.zzYU(run);
        StringBuilder sb = new StringBuilder();
        if (arrayListZzYU.size() == 0) {
            return;
        }
        int startPageIndex = this.zzYfD.getStartPageIndex(run);
        int endPageIndex = this.zzYfD.getEndPageIndex(run);
        int i2 = this.zzXHY;
        while (i2 <= this.zzXHX) {
            if (i2 >= startPageIndex && i2 <= endPageIndex) {
                int iIntValue = i2 == startPageIndex ? 0 : arrayListZzYU.get((i2 - startPageIndex) - 1).intValue();
                com.aspose.words.internal.zzZNH.zzU(sb, C22241OooO0Oo.OooO00o(i2 == endPageIndex ? run.getText().length() : arrayListZzYU.get(i2 - startPageIndex).intValue(), iIntValue, iIntValue, iIntValue, run.getText()));
            }
            i2++;
        }
        if (sb.length() != 0 && com.aspose.words.internal.zzZKN.zzX(sb.substring(sb.length() - 1, sb.length()), "\r", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            sb.setLength(sb.length() - 1);
        }
        run2.setText(sb.toString());
    }

    private boolean zzY(Footnote footnote, Footnote footnote2) {
        if (footnote.getFootnoteType() != 1) {
            return false;
        }
        int startNumber = this.zzZEY.getEndnoteOptions().getStartNumber() + this.zzXHO.indexOf(footnote);
        int numberStyle = this.zzZEY.getEndnoteOptions().getNumberStyle();
        if (numberStyle != 0 && numberStyle != 1 && numberStyle != 2 && numberStyle != 3 && numberStyle != 4) {
            return false;
        }
        Run run = new Run(footnote2.getDocument());
        run.zzZ(footnote2.zzZYh());
        run.setText(zzYTW.zzM(startNumber, this.zzZEY.getEndnoteOptions().getNumberStyle(), false));
        footnote2.getParentNode().appendChild(run);
        footnote2.remove();
        return true;
    }

    private void zzZ(Table table, Table table2, int i) {
        if (i == 2 && table.getStyle() != null && ((TableStyle) table.getStyle()).zzXWR()) {
            this.zzXHP.add(table);
        }
        if (i == 0) {
            zzV(table, table2);
        }
    }

    private void zzZ(Row row, Row row2, int i) throws Exception {
        Table parentTable = row.getParentTable();
        Table table = (Table) zzYz7();
        if (zzXg(parentTable) != 2) {
            return;
        }
        if (row2 != null) {
            if (row2.getRowFormat().getHeadingFormat()) {
                if (parentTable.zzY08() < table.zzY08()) {
                    row2.getRowFormat().setHeadingFormat(false);
                }
            } else if (row.isFirstRow() && parentTable.getParentNode().getNodeType() == 3 && this.zzYfD.getStartPageIndex(parentTable) < this.zzXHY) {
                row2.zzZYf().zzXXi();
            }
        }
        if (zzZ(row, table)) {
            zzY((Node) row, (CompositeNode) table, true);
            return;
        }
        if (!parentTable.getFirstRow().getRowFormat().getHeadingFormat() && row2 != null && row2.isFirstRow()) {
            zzd(table);
        }
        if (i == 0) {
            zzV(row, row2);
        }
    }

    private void zzZ(Paragraph paragraph, Paragraph paragraph2, int i) throws Exception {
        if (i == 1 || paragraph2 == null) {
            return;
        }
        if (this.zzYfD.getStartPageIndex(paragraph) < this.zzXHY) {
            if (paragraph2.isListItem() && !paragraph2.zzZYj().contains(EditingLanguage.KASHMIRI_ARABIC)) {
                zzYMX zzymxZzqw = paragraph2.zzqw(0);
                zzymxZzqw.zzBl(0);
                zzymxZzqw.remove(EditingLanguage.KASHMIRI_ARABIC);
                zzymxZzqw.remove(EditingLanguage.GALICIAN);
                paragraph2.zzZ(zzymxZzqw);
            }
            paragraph2.zzZYj().zzQ(1200, 0);
            paragraph2.zzZYj().zzQ(EditingLanguage.CENTRAL_KURDISH_IRAQ, 0);
            paragraph2.zzZYj().remove(EditingLanguage.KASHMIRI_ARABIC);
            paragraph2.zzZYj().remove(EditingLanguage.GALICIAN);
        }
        if (this.zzYfD.getEndPageIndex(paragraph) > this.zzXHX) {
            paragraph2.zzZYj().zzQ(1220, 0);
        }
        int endPageIndex = this.zzYfD.getEndPageIndex(paragraph);
        if (this.zzXHV == null) {
            this.zzXHV = paragraph2;
            if (endPageIndex != 1 && endPageIndex == this.zzXHY && paragraph.getParentTable() == null) {
                paragraph2.zzZYj().zzQ(1200, 0);
            }
        }
        zzR(paragraph, paragraph2);
    }

    private void zzZ(StructuredDocumentTag structuredDocumentTag, StructuredDocumentTag structuredDocumentTag2, int i) throws Exception {
        if (i != 1 && structuredDocumentTag.hasChildNodes() && structuredDocumentTag.getFirstChild().getNodeType() == 8) {
            zzZ((Paragraph) structuredDocumentTag.getFirstChild(), (Paragraph) structuredDocumentTag2.getFirstChild(), i);
        }
    }

    private void zzZ(Footnote footnote, Footnote footnote2, int i) throws Exception {
        this.zzXHQ.remove(footnote);
        if (i == 0 && zzXg(footnote.getFirstChild()) == 1 && !zzY(footnote, footnote2)) {
            zzO(footnote2);
        }
        Iterator<Node> it = this.zzXHQ.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof Footnote) {
                return;
            }
        }
        this.zzXHQ.clear();
    }

    private boolean zzZ(Row row, Table table) throws Exception {
        if (!row.getRowFormat().getHeadingFormat() || this.zzYfD.getStartPageIndex(row) >= this.zzXHY) {
            return false;
        }
        if (table.zzY08() > 0 && (row.getPreviousRow() == null || !row.getPreviousRow().zzYki())) {
            return false;
        }
        if (this.zzZEY.getCompatibilityOptions().zzZYM()) {
            return table.zzY08() < row.getParentTable().zzY08();
        }
        while (true) {
            row = row.getNextRow();
            if (row == null) {
                return true;
            }
            if (row.getRowFormat().getHeadingFormat() && this.zzYfD.getStartPageIndex(row) == this.zzXHY) {
                return false;
            }
        }
    }

    private static Footnote zzZ(int i, CompositeNode compositeNode) {
        Footnote footnote = new Footnote(compositeNode.getDocument(), i);
        footnote.zzZYh().setSize(0);
        footnote.zzZYh().zzvA(0);
        compositeNode.appendChild(footnote);
        return footnote;
    }

    private void zzZ(Paragraph paragraph, ListLevel listLevel) {
        List list = paragraph.getListFormat().getList();
        Iterator<T> it = this.zzXHR.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Integer num = (Integer) it.next();
            List listByListId = list.getDocument().getLists().getListByListId(num.intValue());
            if (listByListId != null && list.zzYP8() == listByListId.zzYP8()) {
                if (listLevel.zzYOa() == 0 || zzqP(list.getListId()) > listLevel.zzYOa()) {
                    com.aspose.words.internal.zzZQF.zzY(this.zzXHR, num);
                }
            }
        }
        zzZ(list.getListId(), listLevel);
        if (listLevel.zzYOa() == 0 || zzqP(list.getListId()) <= 0) {
            return;
        }
        if (!this.zzXHR.containsKey(Integer.valueOf(list.getListId()))) {
            zzF(list);
        }
        paragraph.zzZYj().zzQ(EditingLanguage.KASHMIRI_ARABIC, this.zzXHR.get(Integer.valueOf(list.getListId())));
    }

    private void zzZ(int i, ListLevel listLevel) {
        if (this.zzXHS.containsKey(Integer.valueOf(i))) {
            if (this.zzXHS.get(Integer.valueOf(i)).intValue() > listLevel.zzYOa()) {
                this.zzXHS.put(Integer.valueOf(i), Integer.valueOf(listLevel.zzYOa()));
                return;
            }
            return;
        }
        com.aspose.words.internal.zzZQF.zzY(this.zzXHS, Integer.valueOf(i), Integer.valueOf(listLevel.zzYOa()));
    }

    private void zzZ(ListLevel listLevel, Paragraph paragraph) {
        int iZzR0;
        if (this.zzZEY.getRevisionsView() == 0 && paragraph.getListLabel().zzYOD() == null) {
            return;
        }
        if (this.zzZEY.getRevisionsView() == 1 && paragraph.getListLabel().zzYOC() == null) {
            return;
        }
        if (this.zzZEY.getRevisionsView() == 0) {
            iZzR0 = paragraph.getListLabel().zzYOD().zzR0(listLevel.zzYOa());
        } else {
            iZzR0 = paragraph.getListLabel().zzYOC().zzR0(listLevel.zzYOa());
        }
        if (ListLevel.zzx9(iZzR0)) {
            listLevel.setStartAt(iZzR0);
        }
    }

    private void zzZ(Cell cell, Cell cell2, int i) throws Exception {
        com.aspose.words.internal.zzDB zzdb = (com.aspose.words.internal.zzDB) cell.getParentRow().getParentTable().zzZYf().get(5103);
        if (cell2 != null && zzdb != null && cell2.zz6G().getPreferredWidth().isFixed() && cell2.zz6G().getPreferredWidth().zzYmD() != cell2.zz6G().getWidth()) {
            int i2 = 0;
            for (int columnIndex = cell2.getColumnIndex(); columnIndex < cell2.zz6G().zz5q(); columnIndex++) {
                i2 += zzdb.get(columnIndex);
            }
            if (i2 != 0) {
                cell2.zz6G().setPreferredWidth(PreferredWidth.zzpK(i2));
            }
        }
        if (i == 0) {
            zzV(cell, cell2);
        }
        if (i != 1) {
            return;
        }
        Row parentRow = cell.getParentRow();
        int startPageIndex = this.zzYfD.getStartPageIndex(parentRow);
        if (this.zzYfD.getEndPageIndex(parentRow) < this.zzXHY || startPageIndex > this.zzXHX) {
            return;
        }
        Cell cell3 = (Cell) zzY((Node) cell, zzYz7(), false);
        cell3.zz6G().setPreferredWidth(PreferredWidth.zzpK(cell3.zz6G().getWidth()));
    }
}
