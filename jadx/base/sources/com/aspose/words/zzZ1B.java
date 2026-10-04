package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ1B {
    private LoadOptions zzYWO;
    private int zzu;
    private com.aspose.words.internal.zzZQC<zzZAD> zzY2B = new com.aspose.words.internal.zzZQC<>();
    private com.aspose.words.internal.zzZQC<zzZAD> zzY2A = new com.aspose.words.internal.zzZQC<>();
    private HashMap<zzZAD, Node> zzY2z = new HashMap<>();
    private HashMap<zzZAD, Node> zzY2y = new HashMap<>();
    private ArrayList<zzZAD> zzY2x = new ArrayList<>();
    private ArrayList<zzZAD> zzY2w = new ArrayList<>();
    private zzZ7Q zzY2C = new zzZ7Q(this.zzY2z);

    public zzZ1B(LoadOptions loadOptions, int i) {
        this.zzYWO = loadOptions;
        this.zzu = i;
    }

    private static ArrayList<Node> zzH(Node node, Node node2) {
        int iZzXH = zzYVU.zzXH(node);
        int iZzXH2 = zzYVU.zzXH(node2);
        int iMin = Math.min(iZzXH, iZzXH2);
        Node nodeZzI = zzYVU.zzI(node, iZzXH - iMin);
        Node nodeZzI2 = zzYVU.zzI(node2, iZzXH2 - iMin);
        while (nodeZzI != null && nodeZzI2 != null && nodeZzI.getParentNode() != nodeZzI2.getParentNode()) {
            nodeZzI = nodeZzI.getParentNode();
            nodeZzI2 = nodeZzI2.getParentNode();
        }
        if (nodeZzI == null || nodeZzI2 == null) {
            return null;
        }
        ArrayList<Node> arrayList = new ArrayList<>();
        while (nodeZzI != null && nodeZzI != nodeZzI2) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, nodeZzI);
            nodeZzI = nodeZzI.getNextSibling();
        }
        com.aspose.words.internal.zzZQG.zzZ(arrayList, nodeZzI2);
        return arrayList;
    }

    private static void zzX(CompositeNode compositeNode, ArrayList<Node> arrayList) {
        arrayList.get(0).zzYC(compositeNode);
        Iterator<Node> it = arrayList.iterator();
        while (it.hasNext()) {
            compositeNode.appendChild(it.next());
        }
    }

    private static boolean zzY(CompositeNode compositeNode, ArrayList<Node> arrayList) {
        Iterator<Node> it = arrayList.iterator();
        while (it.hasNext()) {
            if (!compositeNode.zzT(it.next())) {
                return false;
            }
        }
        return true;
    }

    private void zzY0(String str) {
        if (this.zzYWO.getWarningCallback() != null) {
            this.zzYWO.getWarningCallback().warning(new WarningInfo(1, this.zzu, str));
        }
    }

    private static Node zzYN(Node node) {
        for (Node parentNode = node; parentNode.getParentNode() != null; parentNode = parentNode.getParentNode()) {
            if (parentNode.getParentNode().getNodeType() == 3) {
                return parentNode;
            }
        }
        return node;
    }

    public final void zzO(StructuredDocumentTag structuredDocumentTag) {
        if (structuredDocumentTag.getLevel() == 1) {
            this.zzY2C.zzR(structuredDocumentTag);
        } else {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<StructuredDocumentTag>) this.zzY2x, structuredDocumentTag);
        }
    }

    public final boolean zzYHh() {
        return this.zzY2x.size() > 0;
    }

    public final Node zzYHi() {
        if (this.zzY2A.size() == 0) {
            return null;
        }
        return this.zzY2y.get(this.zzY2A.peek());
    }

    public final zzZAD zzYHj() {
        if (this.zzY2A.size() > 0) {
            return this.zzY2A.peek();
        }
        return null;
    }

    public final zzZ7Q zzYHk() {
        return this.zzY2C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzYHl() throws Exception {
        while (this.zzY2A.size() > 0) {
            zzZAD zzzadPop = this.zzY2A.pop();
            Node node = this.zzY2z.get(zzzadPop);
            Node node2 = this.zzY2y.get(zzzadPop);
            if (node == null || !com.aspose.words.internal.zzZKO.zzA(node, node2) || !this.zzY2w.contains(zzzadPop) || !zzY((StructuredDocumentTag) zzzadPop, node)) {
                ArrayList<Node> arrayListZzZ = zzZ(zzzadPop);
                if (arrayListZzZ == null) {
                    zzY0("Unable to get common parent range, markup ignored.");
                } else {
                    StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) zzzadPop;
                    if (structuredDocumentTag.getLevel() == 4 && (structuredDocumentTag.getSdtType() == 14 || structuredDocumentTag.getSdtType() == 15)) {
                        structuredDocumentTag.setLevel(2);
                    }
                    CompositeNode parentNode = arrayListZzZ.get(0).getParentNode();
                    if ((parentNode.getNodeType() == 5 && zzzadPop.getLevel_IMarkupNode() == 2) || ((parentNode.getNodeType() == 6 && zzzadPop.getLevel_IMarkupNode() == 3) || (parentNode.getNodeType() == 7 && zzzadPop.getLevel_IMarkupNode() == 4))) {
                        arrayListZzZ.clear();
                        com.aspose.words.internal.zzZQG.zzZ((ArrayList<CompositeNode>) arrayListZzZ, parentNode);
                        parentNode = parentNode.getParentNode();
                    } else if (parentNode.getNodeType() == 7 && zzzadPop.getLevel_IMarkupNode() == 3) {
                        Cell cell = (Cell) parentNode;
                        arrayListZzZ.clear();
                        com.aspose.words.internal.zzZQG.zzZ((ArrayList<Row>) arrayListZzZ, cell.getParentRow());
                        parentNode = cell.getParentRow().getParentTable();
                    } else if (parentNode.getNodeType() == 6 && zzzadPop.getLevel_IMarkupNode() == 2) {
                        Row row = (Row) parentNode;
                        arrayListZzZ.clear();
                        com.aspose.words.internal.zzZQG.zzZ((ArrayList<Table>) arrayListZzZ, row.getParentTable());
                        parentNode = row.getParentTable().getParentNode();
                    }
                    if (parentNode.zzT((Node) zzzadPop)) {
                        CompositeNode compositeNode = (CompositeNode) zzzadPop;
                        if (zzY(compositeNode, arrayListZzZ)) {
                            zzX(compositeNode, arrayListZzZ);
                        }
                    }
                    Node nodeZzYN = zzYN(node2);
                    if (StructuredDocumentTag.zz5(node, nodeZzYN)) {
                        zzZ(zzzadPop, node, nodeZzYN);
                    } else {
                        zzY0("Node is unable to accept markup, markup ignored.");
                    }
                }
            }
        }
    }

    public final void zzYO(Node node) {
        Iterator<zzZAD> it = this.zzY2x.iterator();
        while (it.hasNext()) {
            zzZ(it.next(), node);
        }
        this.zzY2x.clear();
    }

    public final void zzZ(StructuredDocumentTag structuredDocumentTag, Node node) {
        if (structuredDocumentTag.getLevel() == 1) {
            this.zzY2C.zzQ(structuredDocumentTag);
            return;
        }
        if (this.zzY2x.size() > 0) {
            Iterator<zzZAD> it = this.zzY2x.iterator();
            while (it.hasNext()) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzY2w, it.next());
            }
            zzYO(node);
        }
        zzZAD zzzadPop = this.zzY2B.pop();
        if (zzzadPop.getLevel_IMarkupNode() != 1) {
            this.zzY2A.push(zzzadPop);
            this.zzY2y.put(zzzadPop, node);
        }
    }

    private boolean zzY(StructuredDocumentTag structuredDocumentTag, Node node) throws Exception {
        boolean zIsMapped = structuredDocumentTag.getXmlMapping().isMapped();
        if (this.zzYWO.getMswVersion() <= 5) {
            Paragraph paragraph = (Paragraph) node.zzYE(node.getDocument());
            if (paragraph != null && zIsMapped) {
                structuredDocumentTag.setLevel(1);
                paragraph.insertAfter(structuredDocumentTag, null);
                return true;
            }
            if (paragraph == null) {
                paragraph = new Paragraph(node.getDocument());
                node.zzYD(paragraph);
            }
            this.zzY2z.put(structuredDocumentTag, paragraph);
            this.zzY2y.put(structuredDocumentTag, paragraph);
            return false;
        }
        Node paragraph2 = !zIsMapped ? (Node) com.aspose.words.internal.zzZKW.zzZ(node.zzYB4(), Paragraph.class) : null;
        if (structuredDocumentTag.getLevel() == 3 && node.getNodeType() == 5) {
            Table table = (Table) node;
            if (table.getFirstRow() != null && table.getFirstRow().getFirstCell() != null) {
                Cell firstCell = table.getFirstRow().getFirstCell();
                if (firstCell.getFirstParagraph() == null) {
                    firstCell.getParagraphs().add(new Paragraph(node.getDocument()));
                }
                paragraph2 = firstCell.getFirstParagraph();
            } else if (table.zzYB4() instanceof CompositeNode) {
                paragraph2 = table.zzYB4();
            } else {
                Node paragraph3 = new Paragraph(node.getDocument());
                table.zzYD(paragraph3);
                paragraph2 = paragraph3;
            }
            structuredDocumentTag.setLevel(2);
        }
        if (paragraph2 == null) {
            paragraph2 = new Paragraph(node.getDocument());
            Table table2 = (Table) com.aspose.words.internal.zzZKW.zzZ(node.zzYB4(), Table.class);
            if (table2 != null && table2.getFirstRow() != null && table2.getFirstRow().getFirstCell() != null) {
                table2.getFirstRow().getFirstCell().insertAfter(paragraph2, null);
            } else if (node.getNodeType() == 7) {
                ((Cell) node).getParagraphs().add(paragraph2);
            } else {
                node.zzYD(paragraph2);
            }
        }
        this.zzY2z.put(structuredDocumentTag, paragraph2);
        this.zzY2y.put(structuredDocumentTag, paragraph2);
        return false;
    }

    private void zzZ(zzZAD zzzad, Node node) {
        this.zzY2B.push(zzzad);
        if (zzzad.getLevel_IMarkupNode() != 1) {
            this.zzY2z.put(zzzad, node);
        }
    }

    private static void zzZ(zzZAD zzzad, Node node, Node node2) {
        DocumentBase document = node.getDocument();
        StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) zzzad;
        structuredDocumentTag.zzY3Y();
        int id = structuredDocumentTag.getId();
        StructuredDocumentTagRangeStart structuredDocumentTagRangeStart = new StructuredDocumentTagRangeStart(document, structuredDocumentTag);
        StructuredDocumentTagRangeEnd structuredDocumentTagRangeEnd = new StructuredDocumentTagRangeEnd(document, id);
        node.zzYC(structuredDocumentTagRangeStart);
        node2.zzYD(structuredDocumentTagRangeEnd);
    }

    public final ArrayList<Node> zzZ(zzZAD zzzad) {
        return zzH((Node) com.aspose.words.internal.zzQW.zzZ(this.zzY2z, zzzad), (Node) com.aspose.words.internal.zzQW.zzZ(this.zzY2y, zzzad));
    }
}
