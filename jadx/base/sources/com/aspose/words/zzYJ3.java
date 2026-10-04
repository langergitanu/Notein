package com.aspose.words;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYJ3 {
    public static void zzA(zzYEF zzyef) {
        zzyef.remove(12);
        zzyef.remove(14);
        zzyef.remove(13);
        zzyef.remove(15);
    }

    private static StructuredDocumentTag zzG(StructuredDocumentTag structuredDocumentTag) {
        StructuredDocumentTag structuredDocumentTag2 = (StructuredDocumentTag) structuredDocumentTag.getChild(28, -1, true);
        return structuredDocumentTag2 != null ? structuredDocumentTag2 : structuredDocumentTag;
    }

    private static void zzP(Paragraph paragraph, Paragraph paragraph2) {
        paragraph.zzC((zzYEF) paragraph2.zzYp5().zzbn());
        paragraph.zzZ((zzYMX) paragraph2.zzZYj().zzbn());
        zzA(paragraph.zzYp5());
    }

    private static void zzQ(Node node, zzYJ9 zzyj9) {
        CompositeNode parentNode = node.getParentNode();
        node.remove();
        if (parentNode.getNodeType() == 27 || parentNode.getNodeType() == 19) {
            zzZ(parentNode, parentNode.getNodeType(), zzyj9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void zzR(Node node, zzYJ9 zzyj9) {
        zzYEF runPr_IInline = ((zzZAM) node).getRunPr_IInline();
        runPr_IInline.remove(10010);
        if (zzyj9.zzYl6() && zzyj9.getRevisionType() == 2) {
            return;
        }
        runPr_IInline.remove(12);
        runPr_IInline.remove(13);
        if (zzY(runPr_IInline, zzyj9)) {
            FieldChar fieldChar = (FieldChar) com.aspose.words.internal.zzZKW.zzZ(node, FieldChar.class);
            if (fieldChar != null) {
                zzZ(fieldChar, zzyj9);
            } else {
                zzyj9.zzWZ(node);
            }
            if (runPr_IInline.zzXS3()) {
                zzZ(zzyj9);
            }
        }
    }

    private static boolean zzS(zzWP zzwp) {
        return (zzwp.zz6D() || zzwp.zzYsN() == null) ? false : true;
    }

    private static void zzT(Node node, zzYJ9 zzyj9) {
        Row row = (Row) node;
        if (zzyj9.zzYl5()) {
            zzZ(row, row.zzZYf(), zzyj9);
        } else {
            zzY(row, row.zzZYf(), zzyj9);
        }
        Iterator<T> it = row.getCells().iterator();
        while (it.hasNext()) {
            zzWP zzwpZz6G = ((Cell) it.next()).zz6G();
            if (zzS(zzwpZz6G)) {
                zzwpZz6G.remove(10010);
            }
        }
    }

    private static void zzU(Node node, zzYJ9 zzyj9) {
        if (node.getParentNode() == null) {
            return;
        }
        if (zzyj9.zzYl5()) {
            zzS(node, zzyj9);
        } else {
            zzR(node, zzyj9);
        }
    }

    private static void zzV(Node node, zzYJ9 zzyj9) {
        Paragraph paragraph = (Paragraph) node;
        if (zzyj9.zzYl5()) {
            zzZ(paragraph, zzyj9);
        } else {
            zzY(paragraph, zzyj9);
        }
    }

    private static void zzW(Node node, zzYJ9 zzyj9) {
        zzYCZ zzyczZzYvR = ((Section) node).zzYvR();
        if (zzyj9.zzYl5()) {
            zzyczZzYvR.zzYpN();
        } else {
            zzyczZzYvR.remove(10010);
        }
    }

    private static Node zzWM(Node node) {
        while (node.isComposite()) {
            CompositeNode compositeNode = (CompositeNode) node;
            if (!compositeNode.hasChildNodes()) {
                break;
            }
            node = compositeNode.getFirstChild();
        }
        return node;
    }

    private static void zzWN(Node node) {
        if (node.getParentNode() != null) {
            node.remove();
        }
    }

    public static boolean zzWO(Node node) throws Exception {
        return zzYVU.zzZ(node, new zzYJ8()) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static WordAttrCollection zzWP(Node node) {
        if (node instanceof zzZAM) {
            return ((zzZAM) node).getRunPr_IInline();
        }
        if (node instanceof Paragraph) {
            return ((Paragraph) node).zzZYj();
        }
        if (node instanceof Section) {
            return ((Section) node).zzYvR();
        }
        if (node instanceof Row) {
            return ((Row) node).zzZYf();
        }
        if (node instanceof Cell) {
            return ((Cell) node).zz6G();
        }
        if (node instanceof StructuredDocumentTag) {
            return ((StructuredDocumentTag) node).zzY3J();
        }
        return null;
    }

    private static void zzX(Node node, zzYJ9 zzyj9) {
        Cell cell = (Cell) node;
        if (zzyj9.zzYl5()) {
            zzZ(cell, cell.zz6G(), zzyj9);
        } else {
            zzY(cell, cell.zz6G(), zzyj9);
        }
    }

    private static void zzY(Node node, zzYJ9 zzyj9) {
        StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) node;
        if (zzyj9.zzYl5()) {
            structuredDocumentTag.zzY3I().zzYpN();
            zzZ(structuredDocumentTag, structuredDocumentTag.zzY3J(), zzyj9);
        } else {
            structuredDocumentTag.zzY3I().remove(10010);
            zzY(structuredDocumentTag, structuredDocumentTag.zzY3J(), zzyj9);
        }
    }

    public static void zzZ(Node node, zzYJ9 zzyj9) throws Exception {
        zzyj9.zzWY(node);
        zzY81 zzy81 = new zzY81(node.getDocument());
        try {
            if (node instanceof zzZAM) {
                zzU(node, zzyj9);
            } else if (node instanceof Paragraph) {
                zzV(node, zzyj9);
            } else if (node instanceof Section) {
                zzW(node, zzyj9);
            } else if (node instanceof Row) {
                zzT(node, zzyj9);
            } else if (node instanceof Cell) {
                zzX(node, zzyj9);
            } else if (node instanceof StructuredDocumentTag) {
                zzY(node, zzyj9);
            } else {
                com.aspose.words.internal.zzZKN.format("Unknown node type {0}", Integer.valueOf(node.getNodeType()));
            }
            if (zzyj9.zzYl6()) {
                zzZ(zzyj9, node.getDocument());
            }
            zzy81.dispose();
        } catch (Throwable th) {
            zzy81.dispose();
            throw th;
        }
    }

    private static void zzZ8(ArrayList<StructuredDocumentTag> arrayList) {
        Iterator<StructuredDocumentTag> it = arrayList.iterator();
        while (it.hasNext()) {
            zzG(it.next()).zzY3V();
        }
    }

    private static void zzZ9(ArrayList<Node> arrayList) throws Exception {
        Iterator<Node> it = arrayList.iterator();
        while (it.hasNext()) {
            ((StructuredDocumentTag) it.next()).zzQl(false);
        }
        arrayList.clear();
    }

    private static void zzZa(ArrayList<Node> arrayList) {
        Iterator<Node> it = arrayList.iterator();
        while (it.hasNext()) {
            zzWN(it.next());
        }
        arrayList.clear();
    }

    private static void zzZb(ArrayList<Node> arrayList) {
        Iterator<Node> it = arrayList.iterator();
        while (it.hasNext()) {
            zzWN((Row) it.next());
        }
        arrayList.clear();
    }

    private static boolean zzo(Node node, boolean z) {
        zzZA6 zzza6 = (zzZA6) com.aspose.words.internal.zzZKW.zzZ(node, zzZA6.class);
        if (zzza6 == null) {
            return false;
        }
        return z ? zzza6.getMoveToRevision() == null : zzza6.getMoveFromRevision() == null;
    }

    public static boolean zzp(Node node, boolean z) {
        zzZA6 zzza6 = (zzZA6) com.aspose.words.internal.zzZKW.zzZ(node, zzZA6.class);
        if (zzza6 == null) {
            return false;
        }
        return z ? zzza6.getMoveToRevision() != null : zzza6.getMoveFromRevision() != null;
    }

    private static void zzu(DocumentBase documentBase) {
        zzU(documentBase, 13);
        zzU(documentBase, 15);
    }

    public static void zzz(zzYEF zzyef) {
        zzA(zzyef);
        zzyef.remove(10010);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void zzS(Node node, zzYJ9 zzyj9) {
        zzYEF runPr_IInline = ((zzZAM) node).getRunPr_IInline();
        runPr_IInline.zzRc(Run.zzBq(node.getText()));
        if (zzyj9.zzYl6() && zzyj9.getRevisionType() == 2) {
            return;
        }
        runPr_IInline.remove(14);
        runPr_IInline.remove(15);
        if (zzZ(runPr_IInline, zzyj9)) {
            FieldChar fieldChar = (FieldChar) com.aspose.words.internal.zzZKW.zzZ(node, FieldChar.class);
            if (fieldChar != null) {
                zzZ(fieldChar, zzyj9);
            } else {
                zzyj9.zzWZ(node);
            }
            if (runPr_IInline.zzXS4()) {
                zzZ(zzyj9);
            }
        }
    }

    private static void zzQ(Paragraph paragraph, Paragraph paragraph2) {
        if (paragraph.hasChildNodes() && paragraph2 != null) {
            paragraph2.zzY(paragraph.getFirstChild(), null, null);
        }
        if (paragraph.hasChildNodes()) {
            zzA(paragraph.zzYp5());
        } else if (paragraph.getParentNode() != null) {
            paragraph.remove();
        }
    }

    private static void zzU(DocumentBase documentBase, int i) {
        Iterator it = documentBase.getChildNodes(i, true).zzYAN().iterator();
        while (it.hasNext()) {
            zzYXA zzyxa = new zzYXA((zzYX6) ((Node) it.next()));
            if (zzyxa.isEmpty()) {
                zzyxa.remove();
            }
        }
    }

    private static void zzV(Paragraph paragraph, zzYJ9 zzyj9) {
        Body body = (Body) paragraph.zzYBd();
        Section parentSection = body.getParentSection();
        Section section = (Section) parentSection.getNextSibling();
        if (section != null) {
            Body body2 = section.getBody();
            Paragraph firstParagraph = body2.getFirstParagraph();
            if (paragraph.hasChildNodes()) {
                firstParagraph.zzY(paragraph.getFirstChild(), null, null);
            }
            if (!com.aspose.words.internal.zzZKO.zzA(paragraph.getParentNode(), body)) {
                body2.zzY(body.getFirstChild(), null, null);
                paragraph.zzYp5().remove(12);
            } else {
                body2.zzY(body.getFirstChild(), paragraph, null);
            }
            if (section.getHeadersFooters().getCount() == 0) {
                while (parentSection.getHeadersFooters().getCount() > 0) {
                    section.insertBefore(parentSection.getHeadersFooters().get(0), section.getBody());
                }
            }
            parentSection.remove();
            return;
        }
        if (zzY(paragraph, zzyj9, (ArrayList<Node>) null)) {
            return;
        }
        zzA(paragraph.zzYp5());
    }

    private static void zzW(Paragraph paragraph, zzYJ9 zzyj9) {
        Cell cellZzZex = paragraph.zzZex();
        Row parentRow = cellZzZex.getParentRow();
        Table parentTable = parentRow.getParentTable();
        cellZzZex.remove();
        if (!parentRow.isRemoved()) {
            if (zzY(parentRow, zzyj9.zzYl5() ? zzyj9.zzYl7() : null)) {
                parentRow.remove();
            }
        }
        if (parentTable == null || parentTable.getFirstRow() != null) {
            return;
        }
        parentTable.remove();
    }

    private static boolean zzX(Paragraph paragraph, zzYJ9 zzyj9) {
        zzYXA zzyxaZzYlg = zzyj9.zzYlg();
        for (CompositeNode compositeNodeZzYB5 = paragraph.zzYB5(); compositeNodeZzYB5 != null && compositeNodeZzYB5.zzYB(zzyxaZzYlg.zzYBV()); compositeNodeZzYB5 = compositeNodeZzYB5.zzYB5()) {
            if (zzo(compositeNodeZzYB5, zzyxaZzYlg.zzYBU())) {
                return false;
            }
        }
        return true;
    }

    private static void zzY(Paragraph paragraph, zzYJ9 zzyj9) {
        paragraph.zzZYj().remove(10010);
        paragraph.zzZYj().remove(EditingLanguage.DIVEHI);
        zzYEF zzyefZzYp5 = paragraph.zzYp5();
        zzyefZzYp5.remove(10010);
        if (zzyj9.zzYl6() && zzyj9.getRevisionType() == 2) {
            return;
        }
        zzyefZzYp5.remove(12);
        zzyefZzYp5.remove(13);
        if (zzY(zzyefZzYp5, zzyj9)) {
            zzZ(paragraph, zzyj9, zzyefZzYp5.zzXS3());
        }
    }

    private static boolean zzT(CompositeNode compositeNode, CompositeNode compositeNode2) {
        return compositeNode2.zzZYt() == compositeNode && compositeNode2.zzZYs() == compositeNode;
    }

    private static boolean zzX(CompositeNode compositeNode, boolean z) {
        Iterator<V> it = compositeNode.iterator();
        while (it.hasNext()) {
            Node node = (Node) it.next();
            if (zzo(node, z)) {
                return true;
            }
            if (node.isComposite() && zzX((CompositeNode) node, z)) {
                return true;
            }
        }
        return false;
    }

    private static Node zzX(Node node, zzYX7 zzyx7) {
        if (zzyx7.zzYBJ().isEmpty()) {
            return null;
        }
        if (!zzYVU.zzl(zzyx7.zzYBF(), node) && node.getNextSibling() != null) {
            return zzWM(node.getNextSibling());
        }
        CompositeNode parentNode = node.getParentNode();
        return parentNode == zzyx7.zzYBG() ? zzWM(zzyx7.zz4t()) : parentNode;
    }

    private static boolean zzY(WordAttrCollection wordAttrCollection, zzYJ9 zzyj9) {
        return zzyj9.zzYl6() ? (zzyj9.getRevisionType() == 0 && wordAttrCollection.zzYrV()) || (zzyj9.getRevisionType() == 4 && wordAttrCollection.zzXS3()) : wordAttrCollection.zzYrV() || wordAttrCollection.zzXS3();
    }

    public static void zzZ(zzYJ9 zzyj9, DocumentBase documentBase) throws Exception {
        zzZ9(zzyj9.zzYla());
        zzZ(zzyj9.zzYlf(), zzyj9);
        ArrayList arrayList = new ArrayList();
        zzZ(zzyj9.zzYle(), zzyj9, (ArrayList<Node>) arrayList);
        zzZb(zzyj9.zzYld());
        zzZa(zzyj9.zzYlc());
        zzZ((ArrayList<Node>) arrayList, zzyj9, (ArrayList<Node>) null);
        zzY(zzyj9);
        zzZ8(zzyj9.zzYl9());
        if (zzyj9.zzYl6()) {
            zzYXA zzyxaZzYlg = zzyj9.zzYlg();
            if (zzyxaZzYlg == null || !zzyxaZzYlg.isEmpty()) {
                return;
            }
            zzyxaZzYlg.remove();
            return;
        }
        zzu(documentBase);
    }

    private static boolean zzY(Node node, zzYX7 zzyx7) {
        return node.getNodeType() == 28 && zzyx7.zzYBM() && zzyx7.zzM((StructuredDocumentTag) node) && zzyx7.zzYBI().getNodeType() == 28;
    }

    private static boolean zzY(Row row, ArrayList<Revision> arrayList) {
        if (row.getFirstCell() == null) {
            return true;
        }
        for (Cell cell : row.getCells()) {
            if (!zzZ(cell, arrayList, 0) || zzZ(cell, arrayList, 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzY(Paragraph paragraph, zzYJ9 zzyj9, ArrayList<Node> arrayList) {
        CompositeNode compositeNodeZzYB5 = paragraph.zzYB5();
        Paragraph paragraphZzXF = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(compositeNodeZzYB5, Paragraph.class);
        if (paragraphZzXF != null) {
            CompositeNode parentNode = paragraph.getParentNode();
            CompositeNode parentNode2 = paragraphZzXF.getParentNode();
            if (parentNode != parentNode2 && (parentNode.getNodeType() == 28 || parentNode2.getNodeType() == 28)) {
                CompositeNode compositeNode = (CompositeNode) Node.zzE(paragraph, paragraphZzXF);
                CompositeNode compositeNodeZzY = parentNode == compositeNode ? paragraph : zzY(paragraph, compositeNode);
                CompositeNode compositeNodeZzY2 = parentNode2 == compositeNode ? paragraphZzXF : zzY(paragraphZzXF, compositeNode);
                if (compositeNodeZzY != null && compositeNodeZzY2 != null && ((compositeNodeZzY != paragraph || paragraph.zzZYr() != null) && !zzZ(paragraph, compositeNodeZzY, zzyj9) && !zzZ(paragraphZzXF, compositeNodeZzY2, zzyj9))) {
                    return zzZ(paragraph, paragraphZzXF, compositeNodeZzY, compositeNodeZzY2, zzyj9);
                }
            }
        } else if (compositeNodeZzYB5 instanceof Table) {
            if (arrayList != null) {
                arrayList.add(paragraph);
                return true;
            }
            paragraphZzXF = zzYVU.zzXF(paragraph);
        }
        zzZ(paragraph, paragraphZzXF);
        zzQ(paragraph, paragraphZzXF);
        return true;
    }

    private static void zzZ(Node node, WordAttrCollection wordAttrCollection, zzYJ9 zzyj9) {
        wordAttrCollection.zzYpN();
        wordAttrCollection.remove(14);
        wordAttrCollection.remove(15);
        if (zzZ(wordAttrCollection, zzyj9)) {
            zzyj9.zzWZ(node);
            if (wordAttrCollection.zzXS4()) {
                zzZ(zzyj9);
            }
        }
    }

    private static void zzZ(Paragraph paragraph, zzYJ9 zzyj9) {
        paragraph.zzZYj().zzYpN();
        paragraph.zzZYj().remove(EditingLanguage.DIVEHI);
        zzYEF zzyefZzYp5 = paragraph.zzYp5();
        zzyefZzYp5.zzYpN();
        if (zzyj9.zzYl6() && zzyj9.getRevisionType() == 2) {
            return;
        }
        zzyefZzYp5.remove(14);
        zzyefZzYp5.remove(15);
        if (zzZ(zzyefZzYp5, zzyj9)) {
            zzZ(paragraph, zzyj9, zzyefZzYp5.zzXS4());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.aspose.words.Node] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.aspose.words.Node] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.aspose.words.CompositeNode, com.aspose.words.Node] */
    private static CompositeNode zzY(Node node, CompositeNode compositeNode) {
        if (compositeNode == null) {
            return null;
        }
        do {
            node = node.getParentNode();
            if (node == 0 || node.getNodeType() != 28) {
                return null;
            }
        } while (node.getParentNode() != compositeNode);
        return node;
    }

    private static void zzZ(Paragraph paragraph, zzYJ9 zzyj9, boolean z) {
        zzYXA zzyxaZzYlg = zzyj9.zzYlg();
        if (z && zzyxaZzYlg.isDefined()) {
            if (new zzYX7(zzyxaZzYlg).zzYBQ() && zzX(paragraph, zzyxaZzYlg.zzYBU()) && !zzX(paragraph, zzyj9)) {
                if (zzyxaZzYlg.zzYBU()) {
                    paragraph.zzYp5().remove(15);
                } else {
                    paragraph.zzYp5().remove(13);
                }
                paragraph.zzYp5().clear();
                return;
            }
            zzyj9.zzWZ(paragraph);
            zzZ(zzyj9);
            return;
        }
        zzyj9.zzWZ(paragraph);
    }

    private static void zzY(zzYJ9 zzyj9) {
        for (StructuredDocumentTag structuredDocumentTag : zzyj9.zzYl8()) {
            if (structuredDocumentTag.zzZYt() == null) {
                StructuredDocumentTag structuredDocumentTagZzG = zzG(structuredDocumentTag);
                for (StructuredDocumentTag structuredDocumentTag2 : zzyj9.zzH(structuredDocumentTag)) {
                    if (zzZ(structuredDocumentTag2, structuredDocumentTag, zzyj9)) {
                        structuredDocumentTagZzG.appendChild(structuredDocumentTag2);
                    }
                    structuredDocumentTagZzG = structuredDocumentTag2;
                }
                structuredDocumentTagZzG.zzY3V();
            }
        }
    }

    private static void zzY(Node node, WordAttrCollection wordAttrCollection, zzYJ9 zzyj9) {
        wordAttrCollection.remove(10010);
        wordAttrCollection.remove(12);
        wordAttrCollection.remove(13);
        if (zzY(wordAttrCollection, zzyj9)) {
            zzyj9.zzWZ(node);
            if (wordAttrCollection.zzXS3()) {
                zzZ(zzyj9);
            }
        }
    }

    private static boolean zzZ(WordAttrCollection wordAttrCollection, zzYJ9 zzyj9) {
        return zzyj9.zzYl6() ? (zzyj9.getRevisionType() == 1 && wordAttrCollection.zzYrW()) || (zzyj9.getRevisionType() == 4 && wordAttrCollection.zzXS4()) : wordAttrCollection.zzYrW() || wordAttrCollection.zzXS4();
    }

    private static void zzZ(FieldChar fieldChar, zzYJ9 zzyj9) {
        for (Node node : new Field(zzZR4.zzW(fieldChar)).zzZgH()) {
            zzZAM zzzam = (zzZAM) com.aspose.words.internal.zzZKW.zzZ(node, zzZAM.class);
            if ((zzzam != null ? zzzam.getRunPr_IInline() : null) != null) {
                zzyj9.zzWZ(node);
            }
        }
    }

    private static void zzZ(Collection<Node> collection, zzYJ9 zzyj9) {
        Iterator<Node> it = collection.iterator();
        while (it.hasNext()) {
            zzQ(it.next(), zzyj9);
        }
        collection.clear();
    }

    private static void zzZ(ArrayList<Node> arrayList, zzYJ9 zzyj9, ArrayList<Node> arrayList2) {
        Iterator<Node> it = arrayList.iterator();
        while (true) {
            Paragraph paragraph = null;
            while (it.hasNext()) {
                Paragraph paragraph2 = (Paragraph) it.next();
                if (!zzZ(paragraph2, zzyj9, arrayList2)) {
                    paragraph = paragraph2;
                } else if (paragraph == null || !zzZ(paragraph, zzyj9, arrayList2)) {
                }
            }
            arrayList.clear();
            return;
        }
    }

    private static void zzZ(CompositeNode compositeNode, int i, zzYJ9 zzyj9) {
        if (zzyj9.zzs(compositeNode, false) || compositeNode.getParentNode() == null) {
            return;
        }
        if (compositeNode.getParentNode().getNodeType() == i) {
            zzZ(compositeNode.getParentNode(), i, zzyj9);
        }
        compositeNode.remove();
    }

    private static void zzZ(zzYJ9 zzyj9) {
        zzYXA zzyxaZzYlg = zzyj9.zzYlg();
        if (zzyxaZzYlg.isDefined()) {
            zzYX7 zzyx7 = new zzYX7(zzyxaZzYlg);
            if (zzyx7.zzYBQ()) {
                return;
            }
            Node nodeZzX = zzX(zzyj9.getCurrentNode(), zzyx7);
            while (nodeZzX != null) {
                if (nodeZzX instanceof zzZA6) {
                    if (zzp(nodeZzX, zzyxaZzYlg.zzYBU())) {
                        return;
                    }
                    if (zzZ(nodeZzX, zzyx7)) {
                        zzyj9.zzWZ(nodeZzX);
                    } else if (zzY(nodeZzX, zzyx7)) {
                        zzyj9.zzZ((StructuredDocumentTag) zzyx7.zzYBI(), (StructuredDocumentTag) zzyx7.zzYBH(), zzyx7.zzYBE());
                    }
                }
                nodeZzX = zzX(nodeZzX, zzyx7);
                if (nodeZzX == zzyj9.getCurrentNode()) {
                    return;
                }
            }
        }
    }

    private static boolean zzZ(Node node, zzYX7 zzyx7) {
        if (node.getNodeType() == 28) {
            StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) node;
            return (zzyx7.zzYBO() || (zzyx7.zzYBP() && zzyx7.zzN(structuredDocumentTag)) || (zzyx7.zzYBN() && zzyx7.zzM(structuredDocumentTag))) ? false : true;
        }
        if (node.getNodeType() == 8 || (node instanceof zzZAM)) {
            return ((node.getNodeType() == 8 && zzyx7.zzYBF().zzYF(node)) || zzyx7.zzYBL() || (node.getNodeType() == 8 && zzyx7.zzYBK() && zzyx7.zzZq((Paragraph) node))) ? false : true;
        }
        return false;
    }

    private static boolean zzZ(Paragraph paragraph, zzYJ9 zzyj9, ArrayList<Node> arrayList) {
        if (paragraph.isEndOfCell()) {
            zzW(paragraph, zzyj9);
            return true;
        }
        if (paragraph.isEndOfSection()) {
            zzV(paragraph, zzyj9);
            return true;
        }
        return zzY(paragraph, zzyj9, arrayList);
    }

    private static boolean zzZ(Cell cell, ArrayList<Revision> arrayList, int i) {
        if (arrayList == null) {
            return false;
        }
        for (Revision revision : arrayList) {
            if (revision.getRevisionType() == i && revision.getParentNode() != null && cell.getLastParagraph() == revision.getParentNode()) {
                return true;
            }
        }
        return false;
    }

    private static void zzZ(Node node, CompositeNode compositeNode) {
        if (compositeNode == null) {
            return;
        }
        Node nextSibling = node.getNextSibling();
        Node node2 = null;
        while (nextSibling != null && zzYVU.zztq(nextSibling.getNodeType())) {
            Node nextSibling2 = nextSibling.getNextSibling();
            if (!zzYVU.zzXL(nextSibling)) {
                compositeNode.insertAfter(nextSibling, node2);
                node2 = nextSibling;
            }
            nextSibling = nextSibling2;
        }
    }

    private static boolean zzZ(Node node, CompositeNode compositeNode, zzYJ9 zzyj9) {
        if (compositeNode.getNodeType() != 28) {
            return false;
        }
        do {
            node = node.getParentNode();
            if (node == null || node.getNodeType() != 28) {
                break;
            }
            Iterator<StructuredDocumentTag> it = zzyj9.zzH((StructuredDocumentTag) node).iterator();
            while (it.hasNext()) {
                Iterator<T> it2 = it.next().getChildNodes(8, true).iterator();
                while (it2.hasNext()) {
                    if (!zzyj9.zzN((Node) it2.next())) {
                        return true;
                    }
                }
            }
        } while (node != compositeNode);
        return false;
    }

    private static boolean zzZ(Paragraph paragraph, Paragraph paragraph2, CompositeNode compositeNode, CompositeNode compositeNode2, zzYJ9 zzyj9) {
        if (compositeNode != paragraph && !zzT(paragraph, compositeNode)) {
            zzA(paragraph.zzYp5());
            return true;
        }
        boolean z = (paragraph.zzYp5().zzYrV() || paragraph.zzYp5().zzYrW()) ? false : true;
        if (z && compositeNode2 != paragraph2) {
            zzYXA zzyxaZzF = zzYX8.zzF(paragraph.hasChildNodes() ? paragraph.getLastChild() : paragraph, !zzyj9.zzYl5());
            if (zzyxaZzF.zzYBV() != null && (zzyxaZzF.zzYBV().zzYF(paragraph2) || zzyxaZzF.zzYBV().zzYB(paragraph2))) {
                zzP(paragraph, paragraph2);
                return true;
            }
        }
        if (compositeNode2 != paragraph2 && !zzT(paragraph2, compositeNode2)) {
            if (z) {
                Iterator<T> it = compositeNode2.getChildNodes(8, true).iterator();
                while (it.hasNext()) {
                    if (zzyj9.zzN((Node) it.next())) {
                        return false;
                    }
                }
            }
            zzA(paragraph.zzYp5());
            return true;
        }
        for (Node nextSibling = compositeNode.getNextSibling(); nextSibling != compositeNode2; nextSibling = nextSibling.getNextSibling()) {
            if (!zzYVU.zztq(nextSibling.getNodeType()) && (nextSibling.getNodeType() != 28 || ((CompositeNode) nextSibling).zzZYt() != null)) {
                zzA(paragraph.zzYp5());
                return true;
            }
        }
        if (compositeNode != paragraph) {
            zzZ(paragraph, (StructuredDocumentTag) compositeNode, zzyj9);
        }
        if (compositeNode2 != paragraph2) {
            zzZ(paragraph2, (StructuredDocumentTag) compositeNode2, zzyj9);
        }
        Node previousSibling = paragraph2.getPreviousSibling();
        while (previousSibling != paragraph) {
            Node previousSibling2 = previousSibling.getPreviousSibling();
            if (previousSibling.getNodeType() == 28) {
                previousSibling.remove();
                ((StructuredDocumentTag) previousSibling).setLevel(1);
            }
            paragraph2.insertAfter(previousSibling, null);
            previousSibling = previousSibling2;
        }
        paragraph2.zzY(paragraph.getFirstChild(), null, null);
        paragraph.remove();
        return true;
    }

    private static void zzZ(Paragraph paragraph, StructuredDocumentTag structuredDocumentTag, zzYJ9 zzyj9) {
        paragraph.zzYF(structuredDocumentTag);
        StructuredDocumentTag structuredDocumentTag2 = (StructuredDocumentTag) paragraph.getParentNode();
        Node nextSibling = paragraph.getNextSibling();
        structuredDocumentTag.zzYD(paragraph);
        structuredDocumentTag.remove();
        structuredDocumentTag.setLevel(1);
        structuredDocumentTag2.zzZ(paragraph.getFirstChild(), (Node) null, nextSibling);
        paragraph.appendChild(structuredDocumentTag);
        zzyj9.zzYl9().add(structuredDocumentTag2);
    }

    private static boolean zzZ(StructuredDocumentTag structuredDocumentTag, StructuredDocumentTag structuredDocumentTag2, zzYJ9 zzyj9) {
        Node nodePreviousPreOrder = structuredDocumentTag.previousPreOrder(structuredDocumentTag2.getDocument());
        while (nodePreviousPreOrder != null && !zzYVU.zzl(nodePreviousPreOrder, structuredDocumentTag2)) {
            if ((nodePreviousPreOrder instanceof zzZ8X) && !zzyj9.zzN(nodePreviousPreOrder)) {
                return false;
            }
            nodePreviousPreOrder = nodePreviousPreOrder.previousPreOrder(structuredDocumentTag2.getDocument());
        }
        if (structuredDocumentTag.getLevel() != 1) {
            return true;
        }
        if (!zzyj9.zzI(structuredDocumentTag2)) {
            return false;
        }
        zzYXA zzyxaZzF = zzYX8.zzF(structuredDocumentTag, !zzyj9.zzYl5());
        if (zzyxaZzF.isDefined() && zzYX8.zzY(structuredDocumentTag.getDocument(), zzyxaZzF.zzYBW().getName(), zzyj9.zzYl5() ? 1 : 0) != null) {
            CompositeNode compositeNodeZzYB5 = structuredDocumentTag.zzYB5();
            while (compositeNodeZzYB5 != null && (compositeNodeZzYB5.getNodeType() != 8 || zzyj9.zzN(compositeNodeZzYB5))) {
                compositeNodeZzYB5 = compositeNodeZzYB5.zzYB5();
            }
            if (compositeNodeZzYB5 != null && zzyj9.zzs(compositeNodeZzYB5, true)) {
                return false;
            }
        }
        return true;
    }
}
