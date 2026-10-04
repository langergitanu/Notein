package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYX {
    private static int[] zzYRG = {2030, 2350, 2360, 2370, EditingLanguage.FRENCH_BELGIUM, 2380};
    private Paragraph zzYRH;
    private Paragraph zzYRI;
    private zzZ85 zzYRJ;
    private NodeImporter zzYRK;
    private Document zzYRL;
    private DocumentBuilder zzYRM;

    public zzZYX(Document document) {
        this.zzYRJ = new zzZ85();
        this.zzYRL = document;
    }

    private Node insertDocument(Document document, int i, ImportFormatOptions importFormatOptions) {
        if (!zzJ(document)) {
            throw new IllegalStateException("You cannot insert document with this content into this location.");
        }
        this.zzYRK = new NodeImporter(document, this.zzYRL, i, importFormatOptions);
        this.zzYRL.zzZq9().add(22);
        return (zzZp6().getCurrentNode() == null || zzZp6().getCurrentNode().getParentNode().zzYAY() != 6) ? zzZpd() : zzZpc();
    }

    private Document zz9Z() {
        return (Document) this.zzYRK.zzYAh().zzYVJ();
    }

    private Style zzI(Paragraph paragraph) {
        Style styleZzqy = paragraph.zzqy(0);
        StyleCollection styles = zz9Z().getStyles();
        int iZzVB = this.zzYRK.zzYAh().zzYVD().zzVB(styleZzqy.zzZ7j());
        return iZzVB != Integer.MIN_VALUE ? styles.zzZ8(iZzVB, false) : styles.zzm(styleZzqy);
    }

    private boolean zzJ(Document document) {
        if (document.getSections().getCount() == 1) {
            return true;
        }
        int nodeType = zzZp6().getCurrentParagraph().getParentNode().getNodeType();
        return (nodeType == 7 || nodeType == 18 || nodeType == 4 || nodeType == 20 || nodeType == 19) ? false : true;
    }

    private static void zzK(Paragraph paragraph) {
        int iIntValue = ((Integer) paragraph.fetchParaAttr(EditingLanguage.KASHMIRI_ARABIC)).intValue();
        if (iIntValue == 0) {
            return;
        }
        DocumentBase document = paragraph.getDocument();
        List listByListId = document.getLists().getListByListId(iIntValue);
        List listAddCopy = document.getLists().addCopy(listByListId);
        while (paragraph != null) {
            if (((Integer) paragraph.zzZYj().zzPj(EditingLanguage.KASHMIRI_ARABIC)).intValue() == listByListId.getListId()) {
                paragraph.zzZYj().zzQ(EditingLanguage.KASHMIRI_ARABIC, Integer.valueOf(listAddCopy.getListId()));
            }
            paragraph = zzYVU.zzXF(paragraph);
        }
    }

    private static boolean zzW(Section section) {
        if (!zzZ(section.getBody())) {
            return false;
        }
        if (section.zzYVg() && !section.zzYVf()) {
            return true;
        }
        Iterator<T> it = section.getHeadersFooters().iterator();
        while (it.hasNext()) {
            if (!zzZ((HeaderFooter) it.next())) {
                return false;
            }
        }
        return true;
    }

    private static void zzX(Paragraph paragraph, boolean z) {
        char cCharAt;
        if (paragraph == null) {
            return;
        }
        Run runZzYVe = z ? paragraph.zzYVe() : paragraph.zzRD(true);
        if (runZzYVe == null || runZzYVe.getText().length() == 0) {
            return;
        }
        if (z) {
            cCharAt = runZzYVe.getText().charAt(0);
            if (!com.aspose.words.internal.zzZYD.isLetter(cCharAt)) {
                return;
            }
        } else {
            cCharAt = runZzYVe.getText().charAt(runZzYVe.getText().length() - 1);
        }
        if (com.aspose.words.internal.zzZKU.zzG(cCharAt)) {
            return;
        }
        Run run = new Run(runZzYVe.getDocument(), " ", (zzYEF) runZzYVe.zzZYh().zzbn());
        if (z) {
            paragraph.prependChild(run);
        } else {
            paragraph.appendChild(run);
        }
    }

    private static void zzY(Paragraph paragraph, Paragraph paragraph2) {
        Integer num = (Integer) paragraph2.fetchParaAttr(EditingLanguage.KASHMIRI_ARABIC);
        num.intValue();
        paragraph.zzZYj().set(EditingLanguage.KASHMIRI_ARABIC, num);
        if (paragraph.zzqy(0).getStyleIdentifier() == 0) {
            paragraph.zzZYj().set(1000, Integer.valueOf(paragraph2.getDocument().getStyles().zzkW(179).zzZ7j()));
        }
    }

    public static Node zzZ(DocumentBuilder documentBuilder, Document document, int i, ImportFormatOptions importFormatOptions) {
        return new zzZYX(documentBuilder).insertDocument(document, i, importFormatOptions);
    }

    private Paragraph zzZp1() {
        if (this.zzYRL.getLastSection() == null || this.zzYRL.getLastSection().getBody() == null) {
            return null;
        }
        return this.zzYRL.getLastSection().getBody().getLastParagraph();
    }

    private Node zzZp2() {
        if (this.zzYRL.getLastSection() == null || this.zzYRL.getLastSection().getBody() == null) {
            return null;
        }
        return this.zzYRL.getLastSection().getBody().zzZYq();
    }

    private boolean zzZp3() {
        Paragraph paragraph = this.zzYRH;
        return paragraph == null || paragraph.zzYoV();
    }

    private boolean zzZp4() {
        Paragraph paragraph = this.zzYRI;
        return paragraph == null || this.zzYRH == null || paragraph.zzYoV();
    }

    private ImportFormatOptions zzZp5() {
        return this.zzYRK.zzYAh().zzYVu();
    }

    private DocumentBuilder zzZp6() {
        if (this.zzYRM == null) {
            this.zzYRM = new DocumentBuilder(this.zzYRL);
        }
        return this.zzYRM;
    }

    private boolean zzZp7() {
        Paragraph paragraph = this.zzYRI;
        if (paragraph == null || !paragraph.isListItem() || (zzZp5().getAdjustSentenceAndWordSpacing() && this.zzYRJ.zzYVk())) {
            return false;
        }
        if (!zzZp4() && !this.zzYRJ.zzYVm()) {
            return false;
        }
        if (!this.zzYRJ.zzYVj()) {
            return true;
        }
        if (this.zzYRJ.zzYVi()) {
            Paragraph paragraph2 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(this.zzYRJ.zzYVo(), Paragraph.class);
            if (paragraph2 != null && paragraph2.isListItem()) {
                return true;
            }
            Paragraph paragraph3 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(this.zzYRJ.zzYVn(), Paragraph.class);
            if (paragraph3 != null && paragraph3.isListItem()) {
                return true;
            }
        }
        return false;
    }

    private void zzZp8() {
        Paragraph paragraph;
        Paragraph paragraph2;
        Paragraph paragraph3 = this.zzYRI;
        if (paragraph3 == null) {
            return;
        }
        Node nodeZzYB4 = paragraph3.zzYB4();
        Paragraph paragraph4 = this.zzYRH;
        Node nodeZzYB9 = paragraph4 != null ? paragraph4.zzYB9() : zzZp2();
        if (nodeZzYB9 != null && zzYVU.zztq(nodeZzYB9.getNodeType())) {
            nodeZzYB9 = nodeZzYB9.zzYB9();
        }
        if (nodeZzYB4 == null || nodeZzYB9 == null) {
            return;
        }
        if (zzZp5().getAdjustSentenceAndWordSpacing()) {
            if (nodeZzYB4.getNodeType() != 5) {
                zzX(this.zzYRI, false);
            }
            if (nodeZzYB9.getNodeType() == 28) {
                zzX(this.zzYRH, true);
            }
        }
        Paragraph paragraph5 = nodeZzYB4.getNodeType() == 8 ? (Paragraph) nodeZzYB4 : (Paragraph) nodeZzYB4.zzYE(nodeZzYB4.getDocument());
        if (paragraph5 != null) {
            if (this.zzYRI.getNextSibling() != null && this.zzYRI.getParentNode() == nodeZzYB4.getParentNode()) {
                paragraph5.zzZ(this.zzYRI.getNextSibling(), nodeZzYB4, paragraph5.getFirstChild(), true);
            }
            while (this.zzYRI.getLastChild() != null && zzYVU.zztq(this.zzYRI.getLastChild().getNodeType())) {
                paragraph5.prependChild(this.zzYRI.getLastChild());
            }
        }
        if (nodeZzYB4.getNodeType() == 8) {
            if (this.zzYRI.hasChildNodes()) {
                zzZ(this.zzYRI, paragraph5);
            }
        } else if (paragraph5 != null && nodeZzYB4.getNodeType() != 5) {
            this.zzYRI.zzZ((zzYMX) paragraph5.zzZYj().zzbn());
        }
        if (!this.zzYRI.hasChildNodes()) {
            this.zzYRI.remove();
        }
        if (!zzZp5().zzYVp() || (paragraph = this.zzYRH) == null || (paragraph2 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph.getPreviousSibling(), Paragraph.class)) == null) {
            return;
        }
        zzZ(paragraph2, this.zzYRH);
        if (paragraph2.hasChildNodes()) {
            return;
        }
        paragraph2.remove();
    }

    private void zzZp9() {
        if (zzZp5().getMergePastedLists()) {
            if (zzZp7()) {
                if (this.zzYRJ.zzYVm()) {
                    Paragraph paragraph = (Paragraph) this.zzYRJ.zzYVh().get(0);
                    if (paragraph.getParentTable() == this.zzYRJ.zzYVo()) {
                        zzY(paragraph, this.zzYRI);
                    }
                } else {
                    for (Paragraph paragraph2 : this.zzYRJ.zzYVh()) {
                        if (!paragraph2.isInCell() && (!this.zzYRJ.zzYVj() || paragraph2.isListItem())) {
                            zzY(paragraph2, this.zzYRI);
                        }
                    }
                }
            }
            if (this.zzYRJ.zzYVg() && this.zzYRJ.zzYVk() && !zzZp3()) {
                zzK(this.zzYRH);
            }
        }
    }

    private void zzZpa() {
        if (zzZp5().getMergePastedLists()) {
            zzZp9();
        }
        if (!zzZp5().getSmartStyleBehavior() || this.zzYRJ.zzYVc()) {
            Iterator<T> it = this.zzYRJ.zzYVh().iterator();
            while (it.hasNext()) {
                zzJ((Paragraph) it.next());
            }
        }
    }

    private Paragraph zzZpb() {
        while (zzZp6().getCurrentNode() != null && zzZp6().getCurrentNode().getNextSibling() != null && (zzZp6().getCurrentNode().getNodeType() == 9 || zzZp6().getCurrentNode().getNodeType() == 10)) {
            zzZp6().moveTo(zzZp6().getCurrentNode().getNextSibling());
        }
        return zzZp6().zzZpN();
    }

    private Node zzZpc() {
        Node previousSibling = zzZp6().getCurrentNode().getPreviousSibling();
        for (Section section : zz9Z().getSections()) {
            if (!section.zzYVf() || zzZp5().getAdjustSentenceAndWordSpacing()) {
                zzr(zzZp6().getCurrentNode());
            }
            zzZ(section.getBody(), zzZp6().getCurrentNode().getParentNode(), zzZp6().getCurrentNode());
        }
        if (zzZp5().getAdjustSentenceAndWordSpacing() && zz9Z().getLastSection().getBody().zzZYq().getNodeType() == 28) {
            zzr(zzZp6().getCurrentNode());
        }
        return previousSibling == null ? zzZp6().getCurrentNode().getParentNode().getFirstChild() : previousSibling.getNextSibling();
    }

    private Node zzZpd() {
        Section parentSection = zzZp6().getCurrentParagraph().getParentSection();
        boolean z = false;
        boolean z2 = parentSection.zzYVg() && zzW(parentSection);
        StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) zzZp6().getCurrentParagraph().getAncestor(28);
        if (structuredDocumentTag != null && zzYVU.zzJ(structuredDocumentTag, 28) && structuredDocumentTag.getSdtType() == 12) {
            z = true;
        }
        this.zzYRH = zzZp6().getCurrentParagraph();
        this.zzYRI = zzZpb();
        Iterator<T> it = zz9Z().getSections().iterator();
        while (it.hasNext()) {
            Section section = (Section) this.zzYRK.zzZ((Node) it.next(), true, (zzZA5) this.zzYRJ);
            zzZpa();
            if (!this.zzYRJ.zzYVg() && !z) {
                this.zzYRL.insertBefore(section, parentSection);
                if (this.zzYRJ.zzYVf()) {
                    if (structuredDocumentTag != null) {
                        StructuredDocumentTag.zzWr(structuredDocumentTag);
                    }
                    if (section.getPageSetup().getSectionStart() != parentSection.getPageSetup().getSectionStart()) {
                        section.zzYvR().setSectionStart(parentSection.zzYvR().getSectionStart());
                    }
                    section.getBody().zzZ(this.zzYRI.getParentNode().getFirstChild(), this.zzYRI.zzYB1(), section.getBody().getFirstChild());
                }
            } else if (z2 && this.zzYRH.getParentStory().getStoryType() == 1) {
                zzZ(section, parentSection);
            } else {
                this.zzYRH.getParentNode().zzZ(section.getBody().getFirstChild(), (Node) null, this.zzYRH);
            }
        }
        Node nodeZzYB4 = this.zzYRI.zzYB4();
        zzZp8();
        this.zzYRK.zzYAk();
        return nodeZzYB4;
    }

    private static void zzr(Node node) {
        if (node == null || node.getParentNode() == null) {
            return;
        }
        node.getParentNode().insertBefore(new Run(node.getDocument(), " "), node);
    }

    public final void appendDocument(Document document, int i, ImportFormatOptions importFormatOptions) {
        ImportFormatOptions importFormatOptions2 = importFormatOptions != null ? importFormatOptions : new ImportFormatOptions();
        boolean smartStyleBehavior = importFormatOptions2.getSmartStyleBehavior();
        importFormatOptions2.setSmartStyleBehavior(true);
        this.zzYRK = new NodeImporter(document, this.zzYRL, i, importFormatOptions2);
        this.zzYRI = zzZp1();
        this.zzYRL.zzZq9().add(22);
        Iterator<T> it = zz9Z().getSections().iterator();
        while (it.hasNext()) {
            Section section = (Section) this.zzYRK.zzZ((Node) it.next(), true, (zzZA5) this.zzYRJ);
            zzZpa();
            this.zzYRL.appendChild(section);
        }
        zzZp8();
        if (importFormatOptions != null) {
            importFormatOptions.setSmartStyleBehavior(smartStyleBehavior);
        }
        this.zzYRK.zzYAk();
    }

    private static boolean zzZ(Story story) {
        Iterator<V> it = story.iterator();
        while (it.hasNext()) {
            Node node = (Node) it.next();
            if (node.getNodeType() == 8) {
                Paragraph paragraph = (Paragraph) node;
                if (paragraph.zzYoV()) {
                    return story.getStoryType() == 1 ? paragraph.isEndOfSection() : paragraph.isEndOfHeaderFooter();
                }
                return false;
            }
            if (!zzYVU.zztq(node.getNodeType())) {
                return false;
            }
        }
        return true;
    }

    private zzZYX(DocumentBuilder documentBuilder) {
        this(documentBuilder.getDocument());
        this.zzYRM = documentBuilder;
    }

    private void zzJ(Paragraph paragraph) {
        int[] iArrZzrc;
        Style styleZzI = zzI(paragraph);
        if (styleZzI == null) {
            return;
        }
        zzYMX zzymxZzZYj = paragraph.zzZYj();
        int iIntValue = ((Integer) styleZzI.fetchParaAttr(EditingLanguage.KASHMIRI_ARABIC)).intValue();
        if (iIntValue == 0 || zzymxZzZYj.zzYpL()) {
            return;
        }
        if (zzymxZzZYj.getListId() == 0) {
            zzymxZzZYj.zzxC(this.zzYRL.getLists().zzZ(this.zzYRK.zzYAh(), iIntValue));
        }
        zzYMX zzymxZzqw = styleZzI.zzqw(1);
        zzymxZzZYj.zzY(zzymxZzqw);
        if (this.zzYRK.zzYAh().zzZn1() == 2) {
            iArrZzrc = zzymxZzZYj.zzrc();
        } else {
            iArrZzrc = new int[]{1000};
        }
        zzymxZzqw.zzX(paragraph.zzqw(128), iArrZzrc);
        paragraph.zzZ(zzymxZzqw);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0034. Please report as an issue. */
    private void zzZ(CompositeNode compositeNode, CompositeNode compositeNode2, Node node) {
        zzYEF zzyef;
        Iterator<V> it = compositeNode.iterator();
        while (it.hasNext()) {
            Node node2 = (Node) it.next();
            CompositeNode compositeNode3 = (CompositeNode) com.aspose.words.internal.zzZKW.zzZ(node2, CompositeNode.class);
            int nodeType = node2.getNodeType();
            if (nodeType == 7) {
                Cell cell = (Cell) node2;
                if (!cell.isFirstCell() && !zzYVU.zzJ(cell.getPreviousCell(), 28)) {
                    if (!this.zzYRJ.zzYVl() && this.zzYRJ.zzYVe() != null) {
                        zzyef = (zzYEF) this.zzYRJ.zzYVe().zzZYh().zzbn();
                    } else {
                        zzyef = new zzYEF();
                    }
                    compositeNode2.insertBefore(new Run(this.zzYRL, ControlChar.TAB, zzyef), node);
                }
            } else if (nodeType != 28) {
                if (nodeType != 18 && nodeType != 19 && nodeType != 33 && nodeType != 34) {
                    switch (nodeType) {
                        case 21:
                            zzZ((Run) node2, compositeNode2, node);
                            break;
                    }
                }
                compositeNode2.insertBefore(this.zzYRK.importNode(node2, true), node);
            } else {
                StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) this.zzYRK.importNode(node2, false);
                structuredDocumentTag.setLevel(1);
                compositeNode2.insertBefore(structuredDocumentTag, node);
                zzZ(compositeNode3, structuredDocumentTag, (Node) null);
            }
            if (node2.isComposite()) {
                zzZ(compositeNode3, compositeNode2, node);
            }
        }
    }

    private void zzZ(Run run, CompositeNode compositeNode, Node node) {
        zzYEF zzyefZzZYh;
        if (this.zzYRK.zzYAh().zzZn1() == 1) {
            zzYEF zzyefZzZYh2 = run.zzZYh();
            Style styleZzVp = zz9Z().getStyles().zzVp(zzyefZzZYh2.zzZ7j(), 10);
            if (styleZzVp.zzZ7j() != 10) {
                zzyefZzZYh = (zzYEF) styleZzVp.zzZYh().zzbn();
            } else {
                zzyefZzZYh = new zzYEF();
            }
            zzyefZzZYh2.zzY(zzyefZzZYh);
            zzyefZzZYh.remove(50);
        } else {
            zzyefZzZYh = ((Run) this.zzYRK.importNode(run, false)).zzZYh();
        }
        compositeNode.insertBefore(new Run(this.zzYRL, run.getText(), zzyefZzZYh), node);
        Cell cell = (Cell) run.getAncestor(7);
        if (cell != null && run == cell.getChild(21, -1, true) && cell.isLastCell() && zzYVU.zzJ(cell, 28)) {
            compositeNode.insertBefore(new Run(this.zzYRL, ControlChar.PARAGRAPH_BREAK, zzyefZzZYh), node);
        }
    }

    private void zzZ(Paragraph paragraph, Paragraph paragraph2) {
        Inline inline;
        Style styleZzm = this.zzYRL.getStyles().zzm(zz9Z().getFirstSection().getBody().getFirstParagraph().zzqy(0));
        zzYEF zzyefZzl1 = styleZzm.zzl1(1);
        zzYMX zzymxZzqw = styleZzm.zzqw(1);
        if (styleZzm.getStyleIdentifier() != 0) {
            Iterator<V> it = paragraph2.iterator();
            while (it.hasNext()) {
                Inline inline2 = (Inline) com.aspose.words.internal.zzZKW.zzZ((Node) it.next(), Inline.class);
                if (inline2 != null) {
                    inline2.zzZ(zzZ7R.zzZ(inline2, 1));
                    inline2.zzZYh().zzX(zzyefZzl1);
                }
            }
        }
        while (paragraph.getLastChild() != null) {
            if (!com.aspose.words.internal.zzZKN.equals(paragraph.zzqy(0).getName(), styleZzm.getName()) && (inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(paragraph.getLastChild(), Inline.class)) != null) {
                inline.zzZ(zzZ7R.zzZ(inline, 1));
                inline.zzZYh().zzX(zzyefZzl1);
            }
            paragraph2.prependChild(paragraph.getLastChild());
        }
        zzYEF zzyefZzqv = paragraph2.zzqv(1);
        zzyefZzqv.zzX(zzyefZzl1);
        paragraph2.zzC(zzyefZzqv);
        zzYMX zzymxZzqw2 = paragraph2.zzqw(1);
        zzymxZzqw2.zzX(zzymxZzqw);
        paragraph2.zzZ(zzymxZzqw2);
        paragraph2.zzZYj().set(1000, Integer.valueOf(styleZzm.zzZ7j()));
    }

    private void zzZ(Section section, Section section2) {
        this.zzYRL.appendChild(section);
        for (int i : zzYRG) {
            if (i != 2030 || zz9Z().getSections().getCount() <= 1) {
                section2.zzYvR().zzY(section.zzYvR(), i);
            }
        }
        section.getBody().appendChild(this.zzYRH);
        if (this.zzYRJ.zzYVf()) {
            section.getBody().prependChild(this.zzYRI);
        }
        section2.remove();
    }
}
