package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYDI {
    private static boolean zz0(Document document) {
        return document.getFirstSection().getBody().getParagraphs().getCount() > 1;
    }

    private static boolean zzA(StructuredDocumentTag structuredDocumentTag) {
        if (structuredDocumentTag.zzYB3()) {
            return true;
        }
        for (Node nextSibling = structuredDocumentTag.getNextSibling(); nextSibling != null; nextSibling = nextSibling.getNextSibling()) {
            if (!zzYVU.zzXT(nextSibling)) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzB(StructuredDocumentTag structuredDocumentTag) {
        if (structuredDocumentTag.zz9I()) {
            return true;
        }
        for (Node previousSibling = structuredDocumentTag.getPreviousSibling(); previousSibling != null; previousSibling = previousSibling.getPreviousSibling()) {
            if (!zzYVU.zzXT(previousSibling)) {
                return false;
            }
        }
        return true;
    }

    private static String zzBm(String str) {
        return com.aspose.words.internal.zzZNR.zzZ(str, "AM/PM", "tt", 66).replace("YY", "yy");
    }

    private static ArrayList<com.aspose.words.internal.zzY3> zzBn(String str) {
        ArrayList<com.aspose.words.internal.zzY3> arrayList = new ArrayList<>();
        if (str.length() == 0) {
            return arrayList;
        }
        int i = 0;
        boolean zZzN = com.aspose.words.internal.zzUX.zzN(str.charAt(0));
        for (int i2 = 1; i2 < str.length(); i2++) {
            if (com.aspose.words.internal.zzUX.zzN(str.charAt(i2)) != zZzN) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, new com.aspose.words.internal.zzY3(C22241OooO0Oo.OooO00o(i2, i, i, i, str), zZzN ? 1 : 0));
                zZzN = !zZzN ? 1 : 0;
                i = i2;
            }
        }
        com.aspose.words.internal.zzZQG.zzZ(arrayList, new com.aspose.words.internal.zzY3(str.substring(i, (str.length() - i) + i), zZzN ? 1 : 0));
        return arrayList;
    }

    private static String zzBo(String str) {
        return str.replace(ControlChar.CR_LF, ControlChar.LINE_BREAK).replace(ControlChar.f50773CR, ControlChar.LINE_BREAK).replace(ControlChar.f50774LF, ControlChar.LINE_BREAK);
    }

    private static void zzC(StructuredDocumentTag structuredDocumentTag) {
        Paragraph paragraph = (Paragraph) structuredDocumentTag.getAncestor(8);
        if (!zzB(structuredDocumentTag)) {
            Paragraph paragraph2 = new Paragraph(paragraph.getDocument());
            while (!structuredDocumentTag.zz9I()) {
                paragraph2.appendChild(paragraph.getFirstChild());
            }
            paragraph.zzYC(paragraph2);
        }
        if (!zzA(structuredDocumentTag)) {
            Paragraph paragraph3 = (Paragraph) paragraph.deepClone(false);
            while (!structuredDocumentTag.zzYB3()) {
                paragraph3.appendChild(structuredDocumentTag.getNextSibling());
            }
            paragraph.zzYD(paragraph3);
        }
        while (!structuredDocumentTag.zz9I()) {
            paragraph.zzYC(paragraph.getFirstChild());
        }
        Node nodeInsertAfter = paragraph;
        while (!structuredDocumentTag.zzYB3()) {
            nodeInsertAfter = paragraph.getParentNode().insertAfter(structuredDocumentTag.getNextSibling(), nodeInsertAfter);
        }
        structuredDocumentTag.getChildNodes(0, false).clear();
        structuredDocumentTag.remove();
        structuredDocumentTag.setLevel(2);
        paragraph.zzYC(structuredDocumentTag);
        structuredDocumentTag.appendChild(paragraph);
    }

    public static void zzD(StructuredDocumentTag structuredDocumentTag) throws Exception {
        Paragraph paragraphZzz;
        if (zzYJ3.zzWO(structuredDocumentTag)) {
            return;
        }
        int sdtType = structuredDocumentTag.getSdtType();
        boolean z = structuredDocumentTag.getPlaceholder() != null;
        if ((structuredDocumentTag.zzY3P() || structuredDocumentTag.zzY3O() || sdtType == 13 || sdtType == 2 || sdtType == 9 || sdtType == 16 || structuredDocumentTag.getLevel() == 3) && !z) {
            return;
        }
        if (!structuredDocumentTag.getXmlMapping().isEmpty() && !structuredDocumentTag.zzY3P() && !structuredDocumentTag.zzY3O()) {
            try {
                structuredDocumentTag.getXmlMapping().setValue(null);
            } catch (Exception unused) {
            }
        }
        if (sdtType == 5 || sdtType == 4) {
            ((zzYDB) structuredDocumentTag.zzY3H()).getListItems().setSelectedValue(null);
        }
        if (structuredDocumentTag.getLevel() == 3) {
            NodeCollection childNodes = structuredDocumentTag.getChildNodes(7, true);
            if (childNodes.getCount() != 1) {
                return;
            } else {
                zzZ((Cell) childNodes.get(0), structuredDocumentTag);
            }
        } else if (structuredDocumentTag.getLevel() == 4) {
            Cell cell = (Cell) structuredDocumentTag.getChild(7, 0, true);
            if (cell != null) {
                zzZ(cell, structuredDocumentTag);
            }
        } else {
            Paragraph paragraphZzz2 = zzz(structuredDocumentTag);
            structuredDocumentTag.removeAllChildren();
            zzZ(structuredDocumentTag, true);
            if (structuredDocumentTag.getCount() == 0) {
                zzZ(structuredDocumentTag, structuredDocumentTag.zzY3J(), structuredDocumentTag.getLevel() == 2, structuredDocumentTag.zzY3I());
            }
            if (paragraphZzz2 != null && (paragraphZzz = zzz(structuredDocumentTag)) != null) {
                paragraphZzz.zzZ((zzYMX) paragraphZzz2.zzZYj().zzbn());
                paragraphZzz.zzC((zzYEF) paragraphZzz2.zzYp5().zzbn());
            }
        }
        structuredDocumentTag.isShowingPlaceholderText(true);
    }

    public static void zzE(StructuredDocumentTag structuredDocumentTag) {
        zzYDN zzydn = (zzYDN) structuredDocumentTag.zzY3H();
        if (!com.aspose.words.internal.zzZYD.zzXk(zzydn.zzYcX().getFontName())) {
            zzydn.zzZ(zzYDM.zzXol);
        }
        if (!com.aspose.words.internal.zzZYD.zzXk(zzydn.zzYcW().getFontName())) {
            zzydn.zzY(zzYDM.zzXok);
        }
        Run run = (Run) structuredDocumentTag.getChild(21, 0, true);
        zzYDM zzydmZzYcX = zzydn.getChecked() ? zzydn.zzYcX() : zzydn.zzYcW();
        String string = Character.toString((char) zzydmZzYcX.zzYcU());
        String fontName = zzydmZzYcX.getFontName();
        if (run != null) {
            run.setText(string);
            run.zzZYh().setName(fontName);
        } else {
            Run run2 = new Run(structuredDocumentTag.getDocument(), string);
            run2.zzZYh().setName(fontName);
            zzZ(structuredDocumentTag, (Node) run2, true);
        }
    }

    public static void zzF(StructuredDocumentTag structuredDocumentTag) {
        if (structuredDocumentTag.getLevel() != 1 || structuredDocumentTag.getPlaceholder() == null || structuredDocumentTag.isShowingPlaceholderText()) {
            return;
        }
        Body body = (Body) structuredDocumentTag.getPlaceholder().getChild(3, 0, true);
        structuredDocumentTag.removeAllChildren();
        Iterator<T> it = body.getChildNodes(0, false).iterator();
        while (it.hasNext()) {
            zzZ(structuredDocumentTag, (Node) it.next(), true);
        }
        structuredDocumentTag.isShowingPlaceholderText(true);
    }

    private static Node zzK(CompositeNode compositeNode) {
        if (compositeNode == null) {
            return null;
        }
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(compositeNode.zzZYq(), Paragraph.class);
        if (paragraph != null) {
            paragraph.getChildNodes(0, false).clear();
        } else {
            paragraph = new Paragraph(compositeNode.getDocument());
        }
        return zzX(compositeNode, paragraph);
    }

    private static void zzN(Paragraph paragraph, Paragraph paragraph2) {
        paragraph2.zzqu(paragraph.zzYoR());
        paragraph2.zzqt(paragraph.zzYoQ());
    }

    private static void zzO(Paragraph paragraph, Paragraph paragraph2) {
        paragraph2.zzZ((zzYMX) paragraph.zzZYj().zzbn());
    }

    private static void zzV(StructuredDocumentTag structuredDocumentTag, Node node) {
        CompositeNode row;
        boolean z = structuredDocumentTag.getLevel() == 3;
        boolean z2 = structuredDocumentTag.getLevel() == 4;
        if ((z && zzYVU.zzXQ(node)) || (z2 && zzYVU.zzXP(node))) {
            structuredDocumentTag.appendChild(node);
            return;
        }
        if (!zzYVU.zzXR(node)) {
            if (!zzYVU.zzXO(node)) {
                throw new IllegalStateException("Can not insert node at this level.");
            }
            zzZ(node, structuredDocumentTag);
            return;
        }
        if (!z2) {
            row = new Row(structuredDocumentTag.getDocument());
            structuredDocumentTag.appendChild(row);
        } else if (structuredDocumentTag.hasChildNodes() && structuredDocumentTag.getFirstChild().getNodeType() == 7) {
            row = (CompositeNode) structuredDocumentTag.getFirstChild();
        } else {
            row = new Cell(structuredDocumentTag.getDocument());
            structuredDocumentTag.appendChild(row);
        }
        if (z && !zzYVU.zzXP(node)) {
            Cell cell = new Cell(structuredDocumentTag.getDocument());
            row.appendChild(cell);
            row = cell;
        }
        row.appendChild(node);
    }

    private static void zzW(StructuredDocumentTag structuredDocumentTag, Node node) {
        if (zzYVU.zzXR(node)) {
            structuredDocumentTag.appendChild(node);
        } else {
            if (!zzYVU.zzXO(node)) {
                throw new IllegalStateException("Cannot insert such node at Block level.");
            }
            zzZ(node, structuredDocumentTag);
        }
    }

    private static boolean zzWz(Node node) {
        return node.getNodeType() == 8 && node.getParentNode().getNodeType() == 3 && ((Body) node.getParentNode()).getParentSection().getChildNodes(8, true).getCount() == 1;
    }

    private static Node zzX(CompositeNode compositeNode, Node node) {
        compositeNode.getChildNodes(0, false).clear();
        return compositeNode.appendChild(node);
    }

    public static void zzY(StructuredDocumentTag structuredDocumentTag, String str) {
        zzZ(structuredDocumentTag, (Node) new Run(structuredDocumentTag.zzYBb(), zzBo(str)), true);
    }

    private static boolean zzYn(Paragraph paragraph) {
        if (paragraph != null) {
            paragraph.zzYB3();
        }
        if (paragraph == null || paragraph.zzYoU() || paragraph.zzYoT()) {
            return false;
        }
        Style styleZzYp7 = paragraph.zzYp7();
        return !styleZzYp7.getBuiltIn() || styleZzYp7.getStyleIdentifier() == 0;
    }

    public static boolean zzYo(Paragraph paragraph) {
        return zzYn(paragraph) && paragraph.zzYoV();
    }

    public static void zzZ(StructuredDocumentTag structuredDocumentTag, boolean z) {
        if (structuredDocumentTag.getPlaceholder() != null) {
            zzx(structuredDocumentTag);
        } else {
            int sdtType = structuredDocumentTag.getSdtType();
            if (sdtType != 2) {
                if (sdtType != 10) {
                    switch (sdtType) {
                        case 12:
                            zzZ(structuredDocumentTag, (Node) new Run(structuredDocumentTag.getDocument(), "     "), true);
                            break;
                        case 13:
                            zzE(structuredDocumentTag);
                            break;
                        case 14:
                        case 15:
                            break;
                        default:
                            if (!z) {
                                throw new IllegalStateException("Unknown sdt type. Please report exception.");
                            }
                            break;
                    }
                } else {
                    zzw(structuredDocumentTag);
                }
            }
        }
        if (structuredDocumentTag.isShowingPlaceholderText() || structuredDocumentTag.getPlaceholder() == null) {
            return;
        }
        structuredDocumentTag.isShowingPlaceholderText(true);
    }

    private static boolean zzZZ(Document document) {
        return document.getSections().getCount() <= 1 && document.getFirstSection().getBody().getParagraphs().getCount() <= 1 && document.getFirstSection().getBody().getFirstParagraph().getCount() <= 0;
    }

    private static boolean zzmE(int i) {
        return i == 4 || i == 2;
    }

    private static Shape zzr(DocumentBase documentBase) {
        try {
            com.aspose.words.internal.zzZOP zzzopZzW = com.aspose.words.internal.zzZXR.zzW("Aspose.Words.Resources.SdtImageDefaultContent.docx", Document.class);
            try {
                LoadOptions loadOptions = new LoadOptions();
                loadOptions.setLoadFormat(20);
                return (Shape) documentBase.importNode(new Document(zzzopZzW, loadOptions, false).getChild(18, 0, true), true);
            } finally {
                if (zzzopZzW != null) {
                    zzzopZzW.close();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void zzw(StructuredDocumentTag structuredDocumentTag) {
        Paragraph paragraph = new Paragraph(structuredDocumentTag.getDocument());
        paragraph.appendChild(zzr(structuredDocumentTag.getDocument()));
        zzZ(structuredDocumentTag, (Node) paragraph, true);
    }

    private static void zzx(StructuredDocumentTag structuredDocumentTag) {
        if (structuredDocumentTag != null) {
            structuredDocumentTag.getPlaceholder();
        }
        boolean z = structuredDocumentTag.getLevel() == 3;
        Node nodeZzy = z ? null : zzy(structuredDocumentTag);
        for (Paragraph paragraph : structuredDocumentTag.getPlaceholder().getFirstSection().getBody().getParagraphs()) {
            boolean z2 = z && paragraph.zz9I();
            if (paragraph.zzYB3()) {
                Paragraph paragraph2 = (Paragraph) paragraph.deepClone(true);
                paragraph2.zzZYj().clear();
                Node nodeZzZ = zzZ(structuredDocumentTag, paragraph2, z2);
                if (zzmE(structuredDocumentTag.getLevel()) && nodeZzy != null) {
                    Paragraph paragraph3 = (Paragraph) nodeZzy;
                    Paragraph paragraph4 = (Paragraph) nodeZzZ;
                    zzO(paragraph3, paragraph4);
                    zzN(paragraph3, paragraph4);
                }
            } else {
                zzZ(structuredDocumentTag, paragraph, z2);
            }
        }
        if (nodeZzy != null) {
            nodeZzy.remove();
        }
    }

    private static Node zzy(StructuredDocumentTag structuredDocumentTag) {
        int level = structuredDocumentTag.getLevel();
        if (level == 1) {
            return zzX(structuredDocumentTag, new Run(structuredDocumentTag.getDocument()));
        }
        if (level == 2) {
            return zzK(structuredDocumentTag);
        }
        if (level == 4) {
            return zzK((CompositeNode) structuredDocumentTag.getChild(7, 0, false));
        }
        throw new IllegalStateException("Unknown markup level.");
    }

    private static Paragraph zzz(StructuredDocumentTag structuredDocumentTag) {
        Node lastChild = structuredDocumentTag.getLastChild();
        while (lastChild != null && lastChild.getNodeType() != 8) {
            lastChild = lastChild.getPreviousSibling();
        }
        return (Paragraph) lastChild;
    }

    public static Node zzZ(StructuredDocumentTag structuredDocumentTag, Node node, boolean z) {
        Node nodeZzZ;
        if (node.getNodeType() == 1) {
            return zzZ(structuredDocumentTag, (Document) node);
        }
        if (node.getNodeType() == 21 && structuredDocumentTag.getSdtType() != 13) {
            ((Run) node).zzZ((zzYEF) structuredDocumentTag.zzY3J().zzbn());
        }
        if (z) {
            NodeCollection childNodes = structuredDocumentTag.getChildNodes(node.getNodeType(), true);
            nextSibling = childNodes.getCount() != 0 ? childNodes.get(childNodes.getCount() - 1).getNextSibling() : null;
            childNodes.clear();
        }
        int level = structuredDocumentTag.getLevel();
        if (level == 1) {
            nodeZzZ = zzZ(structuredDocumentTag, node, nextSibling);
        } else if (level == 2) {
            nodeZzZ = structuredDocumentTag.getDocument().importNode(node, true);
            zzW(structuredDocumentTag, nodeZzZ);
        } else {
            if (level != 3 && level != 4) {
                throw new IllegalStateException("Unknown markup level.");
            }
            nodeZzZ = structuredDocumentTag.getDocument().importNode(node, true);
            zzV(structuredDocumentTag, nodeZzZ);
        }
        if (structuredDocumentTag.isShowingPlaceholderText() && structuredDocumentTag.getPlaceholder() == null) {
            structuredDocumentTag.isShowingPlaceholderText(false);
        }
        return nodeZzZ;
    }

    public static String zzZ(StructuredDocumentTag structuredDocumentTag, String str) {
        String strZzVn = com.aspose.words.internal.zzBM.zzVn(structuredDocumentTag.getDateDisplayLocale());
        boolean zZzXk = com.aspose.words.internal.zzZYD.zzXk(strZzVn);
        if (zZzXk) {
            try {
                com.aspose.words.internal.zzZXR.zzpX();
                com.aspose.words.internal.zzZXR.zzWX(strZzVn);
            } finally {
                if (zZzXk) {
                    com.aspose.words.internal.zzZXR.zzpW();
                }
            }
        }
        String strZzBm = zzBm(structuredDocumentTag.getDateDisplayFormat());
        com.aspose.words.internal.zzZQ9 zzzq9ZzZw = com.aspose.words.internal.zzJB.zzZw(str);
        if (!com.aspose.words.internal.zzZQ9.zzZ(zzzq9ZzZw, com.aspose.words.internal.zzZQ9.zz35)) {
            str = zzzq9ZzZw.zzkK().toString(strZzBm);
        }
        return str;
    }

    public static void zzZ(CompositeNode compositeNode, zzYEF zzyef, boolean z, zzYEF zzyef2) {
        CompositeNode compositeNode2;
        if (z) {
            Paragraph paragraph = new Paragraph(compositeNode.getDocument());
            paragraph.zzC((zzYEF) zzyef2.zzbn());
            compositeNode.appendChild(paragraph);
            compositeNode2 = paragraph;
        } else {
            compositeNode2 = compositeNode;
        }
        Run run = new Run(compositeNode.getDocument(), "     ");
        run.zzZ((zzYEF) zzyef.zzbn());
        compositeNode2.appendChild(run);
    }

    private static Node zzZ(StructuredDocumentTag structuredDocumentTag, Document document) {
        Paragraph paragraph;
        Paragraph lastParagraph = document.getLastSection().getBody().getLastParagraph();
        boolean zZzYn = zzYn(lastParagraph);
        if (zzZZ(document)) {
            lastParagraph.remove();
        }
        boolean z = true;
        if (structuredDocumentTag.getLevel() == 1 && structuredDocumentTag.getSdtType() == 11 && zz0(document)) {
            zzC(structuredDocumentTag);
        } else {
            Story story = (Story) structuredDocumentTag.getAncestor(Story.class);
            Node lastChild = structuredDocumentTag.getLastChild();
            if (structuredDocumentTag == story.getLastChild() && lastChild.getNodeType() == 8) {
                story.insertAfter(lastChild, structuredDocumentTag);
                ((Paragraph) lastChild).getRuns().clear();
            }
            z = false;
        }
        Node nodeZzy = zzy(structuredDocumentTag);
        if (nodeZzy == null) {
            return null;
        }
        DocumentBuilder documentBuilder = new DocumentBuilder(structuredDocumentTag.zzYBb());
        documentBuilder.moveTo(nodeZzy);
        ImportFormatOptions importFormatOptions = new ImportFormatOptions();
        importFormatOptions.zzYVs();
        Node nodeInsertDocument = documentBuilder.insertDocument(document, 0, importFormatOptions);
        if (zzmE(structuredDocumentTag.getLevel()) && zZzYn && !lastParagraph.isRemoved() && (paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(nodeZzy.zztC(8), Paragraph.class)) != null) {
            Paragraph paragraph2 = (Paragraph) nodeZzy;
            if (z) {
                zzO(paragraph2, paragraph);
            }
            zzN(paragraph2, paragraph);
        }
        if (!(nodeZzy.zzYB0() instanceof Table) && (structuredDocumentTag.getLevel() != 4 ? !zzWz(nodeZzy) : !(lastParagraph.isRemoved() || !zZzYn))) {
            nodeZzy.remove();
        }
        return nodeInsertDocument;
    }

    private static void zzZ(Cell cell, StructuredDocumentTag structuredDocumentTag) {
        Paragraph paragraph;
        Paragraph paragraph2 = (Paragraph) cell.getChild(8, -1, false);
        cell.removeAllChildren();
        if (structuredDocumentTag.getPlaceholder() != null) {
            cell.appendChild(structuredDocumentTag.getDocument().importNode(structuredDocumentTag.getPlaceholder().getFirstSection().getBody().getFirstParagraph(), true));
        } else {
            zzZ(cell, structuredDocumentTag.zzY3J(), true, structuredDocumentTag.zzY3I());
        }
        if (paragraph2 == null || (paragraph = (Paragraph) cell.getChild(8, 0, false)) == null) {
            return;
        }
        paragraph.zzZ((zzYMX) paragraph2.zzZYj().zzbn());
        paragraph.zzC((zzYEF) paragraph2.zzYp5().zzbn());
    }

    private static Node zzZ(StructuredDocumentTag structuredDocumentTag, Node node, Node node2) {
        if (zzYVU.zzXR(node) && node.isComposite()) {
            CompositeNode compositeNode = (CompositeNode) node;
            if (compositeNode.getFirstChild() == null) {
                return null;
            }
            Node nodeImportNode = structuredDocumentTag.getDocument().importNode(compositeNode.getFirstChild(), false);
            structuredDocumentTag.appendChild(nodeImportNode);
            return nodeImportNode;
        }
        if (zzYVU.zzXO(node)) {
            Node nodeImportNode2 = structuredDocumentTag.getDocument().importNode(node, false);
            structuredDocumentTag.insertBefore(nodeImportNode2, node2);
            return nodeImportNode2;
        }
        throw new IllegalStateException("Cannot insert such node at Inline level.");
    }

    private static void zzZ(Node node, StructuredDocumentTag structuredDocumentTag) {
        if (zzYVU.zzXR(node) && !zzYVU.zzXO(node)) {
            throw new IllegalArgumentException("Only inline content nodes is expected.");
        }
        Paragraph paragraph = (Paragraph) structuredDocumentTag.getChild(8, 0, true);
        if (paragraph == null) {
            paragraph = new Paragraph(structuredDocumentTag.getDocument());
            structuredDocumentTag.appendChild(paragraph);
        }
        if (zzZ(paragraph, (Run) com.aspose.words.internal.zzZKW.zzZ(node, Run.class))) {
            return;
        }
        paragraph.appendChild(node);
    }

    private static boolean zzZ(Paragraph paragraph, Run run) {
        if (run == null) {
            return false;
        }
        com.aspose.words.internal.zzY3[] zzy3ArrZzW = com.aspose.words.internal.zzY9.zzW(run.getText(), paragraph.zzZYj().getBidi());
        for (com.aspose.words.internal.zzY3 zzy3 : zzy3ArrZzW) {
            if (zzy3ArrZzW.length > 1 && zzy3.zzXn()) {
                for (com.aspose.words.internal.zzY3 zzy32 : zzBn(zzy3.getText())) {
                    Run run2 = new Run(run.getDocument(), zzy32.getText(), (zzYEF) run.zzZYh().zzbn());
                    if (run2.zzZYh().zzYdM().toBool() != zzy32.zzXn()) {
                        run2.zzZYh().zzW(zzZU.zzYW(zzy32.zzXn()));
                    }
                    paragraph.appendChild(run2);
                }
            } else {
                Run run3 = new Run(run.getDocument(), zzy3.getText(), (zzYEF) run.zzZYh().zzbn());
                if (run3.zzZYh().zzYdM().toBool() != zzy3.zzXn()) {
                    run3.zzZYh().zzW(zzZU.zzYW(zzy3.zzXn()));
                }
                paragraph.appendChild(run3);
            }
        }
        return true;
    }
}
