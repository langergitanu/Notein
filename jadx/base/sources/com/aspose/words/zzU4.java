package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzU4 {
    private static Node zzB(Node node) {
        while (node.isComposite()) {
            CompositeNode compositeNode = (CompositeNode) node;
            if (!compositeNode.hasChildNodes()) {
                break;
            }
            node = compositeNode.getFirstChild();
        }
        return node;
    }

    private static int zzC(Node node) {
        if (node instanceof zzYD5) {
            return ((zzYD5) node).zzYcK().zzYAY() == 6 ? 1 : 2;
        }
        if (node instanceof zzYD6) {
            return ((zzYD6) node).zzXWe == 1 ? 1 : 2;
        }
        if (node.getNodeType() == 8) {
            return 0;
        }
        return node.zzYAY() == 6 ? 1 : 2;
    }

    public static Node zzD(Node node) {
        Node nextSibling = node.getNextSibling();
        return nextSibling == null ? node.getParentNode() : (!nextSibling.isComposite() || nextSibling.getNodeType() == 19) ? nextSibling : zzB(nextSibling);
    }

    private static boolean zzMY(int i) {
        return (i == 5 || i == 35 || i == 4) ? false : true;
    }

    private static Node zzV(Node node, Node node2, zzU8 zzu8) throws Exception {
        Node nodeZzZ = zzZ(node, zzu8, true);
        if (node2.zzYAY() == 6) {
            node2 = node2.getAncestor(8);
        }
        if (!node2.getParentNode().zzT(nodeZzZ)) {
            zzU6.zzH(node2);
        }
        node2.zzYC(nodeZzZ);
        return nodeZzZ;
    }

    private static void zzW(Node node, zzU8 zzu8) throws Exception {
        if (node.isComposite()) {
            Iterator<T> it = ((CompositeNode) node).getChildNodes(0, false).iterator();
            while (it.hasNext()) {
                zzW((Node) it.next(), zzu8);
            }
        }
        int nodeType = node.getNodeType();
        if (nodeType == 6) {
            zzZ(((Row) node).zzZYf(), 4005, zzu8);
            return;
        }
        if (nodeType != 8) {
            zzZAM zzzam = (zzZAM) com.aspose.words.internal.zzZKW.zzZ(node, zzZAM.class);
            if (zzzam == null || zzzam.getDirectRunAttr(50) == null) {
                return;
            }
            zzzam.setRunAttr(50, Integer.valueOf(zzu8.zzN8(((Integer) zzzam.getDirectRunAttr(50)).intValue())));
            return;
        }
        Paragraph paragraph = (Paragraph) node;
        zzZ(paragraph.zzZYj(), 1000, zzu8);
        zzZ(paragraph.zzYp5(), 50, zzu8);
        if (paragraph.zzZYj().getListId() != 0) {
            paragraph.zzZYj().zzxC(zzZ4K.zzZ(0, paragraph.zzZYj().getListId(), zzu8));
        }
    }

    public static Node zzX(Node node, Node node2, zzU8 zzu8) throws Exception {
        zzY(node, zzu8);
        Node nodeZzZ = zzZ(node2, zzu8, true);
        node.zzYC(nodeZzZ);
        return nodeZzZ;
    }

    public static void zzY(Document document, zzU8 zzu8) {
        ArrayList<Node> arrayListZzYAN = document.getChildNodes(37, true).zzYAN();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Node node : arrayListZzYAN) {
            zzYD5 zzyd5 = (zzYD5) com.aspose.words.internal.zzZKW.zzZ(node, zzYD5.class);
            if (zzyd5 != null) {
                linkedHashMap.put(Integer.valueOf(zzyd5.zzYcK().getId()), zzyd5);
            } else {
                zzYD6 zzyd6 = (zzYD6) com.aspose.words.internal.zzZKW.zzZ(node, zzYD6.class);
                if (zzyd6 != null) {
                    linkedHashMap2.put(Integer.valueOf(zzyd6.zze0), zzyd6);
                }
            }
        }
        for (Integer num : linkedHashMap.keySet()) {
            num.intValue();
            zzYD5 zzyd52 = (zzYD5) linkedHashMap.get(num);
            if (linkedHashMap2.containsKey(num)) {
                zzYD6 zzyd62 = (zzYD6) linkedHashMap2.get(num);
                if (zzyd52.getAncestor(2) == zzyd62.getAncestor(2) && zzZ(zzyd52, zzyd62)) {
                    StructuredDocumentTag structuredDocumentTagZzYcK = zzyd52.zzYcK();
                    if (structuredDocumentTagZzYcK.getLevel() == 4 && !zzyd52.getParentNode().zzT(structuredDocumentTagZzYcK)) {
                        structuredDocumentTagZzYcK.setLevel(2);
                    }
                    zzyd52.zzYC(structuredDocumentTagZzYcK);
                    if (zzyd52.getInsertRevision() != null) {
                        zzY((zzZ8X) structuredDocumentTagZzYcK, zzu8);
                    }
                    if (zzyd52.getDeleteRevision() != null) {
                        zzZ((zzZ8X) structuredDocumentTagZzYcK, zzu8);
                    }
                    Node nextSibling = zzyd52.getNextSibling();
                    while (!com.aspose.words.internal.zzZKO.zzA(nextSibling, zzyd62) && nextSibling != null) {
                        Node nextSibling2 = nextSibling.getNextSibling();
                        structuredDocumentTagZzYcK.appendChild(nextSibling);
                        nextSibling = nextSibling2;
                    }
                } else {
                    StructuredDocumentTagRangeStart structuredDocumentTagRangeStart = new StructuredDocumentTagRangeStart(zzyd52.getDocument(), zzyd52.zzYcK());
                    zzyd52.zzYC(structuredDocumentTagRangeStart);
                    zzyd62.zzYC(new StructuredDocumentTagRangeEnd(zzyd62.getDocument(), structuredDocumentTagRangeStart.getId()));
                }
                zzyd62.remove();
            }
            zzyd52.remove();
        }
    }

    public static boolean zzZ(StructuredDocumentTag structuredDocumentTag) {
        return structuredDocumentTag.getSdtType() == 12 || structuredDocumentTag.getSdtType() == 6;
    }

    public static void zzZ(Document document, zzU8 zzu8) {
        for (StructuredDocumentTag structuredDocumentTag : document.getChildNodes(28, true).zzYAN()) {
            if (!zzZ(structuredDocumentTag) && (structuredDocumentTag.getLevel() == 2 || structuredDocumentTag.getLevel() == 1 || structuredDocumentTag.getLevel() == 4)) {
                zzYD5 zzyd5 = new zzYD5(document, structuredDocumentTag);
                if (zzu8 != null) {
                    zzu8.zzZum.put(Integer.valueOf(structuredDocumentTag.getId()), zzyd5);
                }
                zzYD6 zzyd6 = new zzYD6(document, structuredDocumentTag.getId(), structuredDocumentTag.getLevel());
                structuredDocumentTag.zzYC(zzyd5);
                structuredDocumentTag.zzYD(zzyd6);
                Node nodeZzYD = structuredDocumentTag;
                while (structuredDocumentTag.getChildNodes(0, false).getCount() > 0) {
                    nodeZzYD = nodeZzYD.zzYD(structuredDocumentTag.getFirstChild());
                }
                structuredDocumentTag.remove();
            }
        }
        for (StructuredDocumentTagRangeStart structuredDocumentTagRangeStart : document.getChildNodes(29, true).zzYAN()) {
            StructuredDocumentTagRangeEnd rangeEnd = structuredDocumentTagRangeStart.getRangeEnd();
            if (rangeEnd != null) {
                zzYD5 zzyd52 = new zzYD5(document, structuredDocumentTagRangeStart.zzYcK());
                zzYD6 zzyd62 = new zzYD6(document, structuredDocumentTagRangeStart.zzYcK().getId(), structuredDocumentTagRangeStart.zzYcK().getLevel());
                if (zzu8 != null) {
                    zzu8.zzZum.put(Integer.valueOf(structuredDocumentTagRangeStart.zzYcK().getId()), zzyd52);
                }
                structuredDocumentTagRangeStart.zzYC(zzyd52);
                rangeEnd.zzYC(zzyd62);
                structuredDocumentTagRangeStart.remove();
                rangeEnd.remove();
            }
        }
    }

    private static void zzX(Node node, zzU8 zzu8) {
        zzZ8X zzz8x = (zzZ8X) com.aspose.words.internal.zzZKW.zzZ(node, zzZ8X.class);
        if (zzz8x != null) {
            zzZ(zzz8x, zzu8);
        }
        if (node.isComposite()) {
            for (Node node2 : ((CompositeNode) node).getChildNodes(0, false)) {
                if (node2.getNodeType() == 7) {
                    Iterator<T> it = ((Cell) node2).getChildNodes(0, false).iterator();
                    while (it.hasNext()) {
                        zzX((Node) it.next(), zzu8);
                    }
                } else {
                    zzX(node2, zzu8);
                }
            }
        }
    }

    private static Paragraph zzW(Node node, Node node2, zzU8 zzu8) throws Exception {
        Paragraph paragraphZzY4x;
        zzY9D zzy9dPeek = zzu8.zzZuo.peek();
        if (node.getNodeType() == 8) {
            paragraphZzY4x = (Paragraph) node;
        } else {
            paragraphZzY4x = zzy9dPeek.zzY4x();
        }
        if (zzu8.zzZun.containsKey(paragraphZzY4x)) {
            return (Paragraph) zzu8.zzZun.get(paragraphZzY4x);
        }
        Paragraph paragraph = (Paragraph) zzZ((Node) paragraphZzY4x, zzu8, false);
        com.aspose.words.internal.zzZQF.zzY(zzu8.zzZun, paragraphZzY4x, paragraph);
        zzZ(paragraph, node2);
        if (paragraphZzY4x.isEndOfSection()) {
            Section section = (Section) zzZ((Node) paragraphZzY4x.getParentSection(), zzu8, false);
            section.appendChild(new Body(zzu8.zzZZ6()));
            zzZ(section, paragraph, node2);
            com.aspose.words.internal.zzZQF.zzY(zzu8.zzZun, paragraphZzY4x.getParentSection(), section);
        }
        return paragraph;
    }

    public static Run zzZ(Run run, int i, int i2, zzU8 zzu8) throws Exception {
        Run run2 = new Run(zzu8.zzZZ6(), run.getText().substring(i, i2 + i), (zzYEF) run.zzZYh().zzbn());
        zzZ((zzZ8X) run2, zzu8.zzZZ6().zzZqs());
        zzW(run2, zzu8);
        return run2;
    }

    public static void zzZ(Field field, Node node, zzU8 zzu8) throws Exception {
        for (Node node2 : zzZ(field)) {
            int iZzC = zzC(node2);
            if (iZzC == 0) {
                zzW(node2, node, zzu8);
            } else if (iZzC == 1) {
                zzY(zzZ(node2, zzu8, true), node2, node, zzu8);
            } else if (iZzC != 2) {
                zzU6.zzH(node2);
            } else if (node2.getNodeType() != 4) {
                zzV(node2, node, zzu8);
            }
            if (node.getNodeType() == 5) {
                node = node.getPreviousSibling();
            }
        }
    }

    public static Node zzY(Field field, Node node, zzU8 zzu8) throws Exception {
        Node node2 = node;
        Node nodeZzD = null;
        Node nodeZzZ = null;
        for (Node node3 : zzZ(field)) {
            int iZzC = zzC(node3);
            if (iZzC == 0) {
                nodeZzZ = zzW(node3, nodeZzD, zzu8);
                if (zzD(nodeZzD).getNodeType() == 3) {
                    node2 = nodeZzD;
                    nodeZzD = null;
                }
            } else if (iZzC != 1) {
                zzU6.zzH(node3);
            } else {
                if (nodeZzD == null) {
                    nodeZzZ = zzZ(node3, node2, zzu8, true);
                } else {
                    nodeZzZ = zzZ(node3, nodeZzD, zzu8);
                }
                if (nodeZzD == null) {
                    nodeZzD = zzD(nodeZzZ);
                }
            }
        }
        return nodeZzZ;
    }

    public static Node zzZ(Node node, Node node2, zzU8 zzu8, boolean z) throws Exception {
        Node nodeZzZ = zzZ(node, zzu8, z);
        zzZ(nodeZzZ, node, node2, zzu8);
        return nodeZzZ;
    }

    public static Node zzY(Node node, Node node2, Node node3, zzU8 zzu8) throws Exception {
        int iZzC = zzC(node3);
        if (iZzC == 0) {
            return ((Paragraph) node3).appendChild(node);
        }
        if (iZzC == 1) {
            return node3.zzYC(node);
        }
        if (iZzC != 2) {
            zzU6.zzH(node3);
            return null;
        }
        return zzW(node2, node3, zzu8).appendChild(node);
    }

    public static Node zzZ(Node node, Node node2, Node node3, zzU8 zzu8) throws Exception {
        if (zzu8.zzZun.containsKey(node2)) {
            return node;
        }
        int iZzYAY = node.zzYAY();
        int iZzYAY2 = node3.zzYAY();
        if (node3.getNodeType() == 8 && ((Paragraph) node3).isEndOfSection()) {
            iZzYAY2 = 1;
        }
        if (iZzYAY2 == iZzYAY) {
            node3.zzYD(node);
            return node;
        }
        while (node2.zzYAY() != iZzYAY2) {
            node2 = node2.getParentNode();
            CompositeNode compositeNode = (CompositeNode) com.aspose.words.internal.zzQW.zzZ(zzu8.zzZun, node2);
            if (compositeNode != null) {
                compositeNode.appendChild(node);
                return node;
            }
            Node nodeZzZ = zzZ(node2, zzu8, false);
            CompositeNode compositeNode2 = (CompositeNode) nodeZzZ;
            compositeNode2.appendChild(node);
            com.aspose.words.internal.zzZQF.zzY(zzu8.zzZun, node2, compositeNode2);
            node = nodeZzZ;
        }
        while (node3.zzYAY() != iZzYAY2) {
            node3 = node3.getParentNode();
        }
        node3.getParentNode().appendChild(node);
        return node;
    }

    public static Node zzY(Node node, Node node2, zzU8 zzu8) throws Exception {
        zzY(node, zzu8);
        Node nodeZzZ = zzZ(node2, zzu8, true);
        node.zzYD(nodeZzZ);
        return nodeZzZ;
    }

    public static void zzY(zzZ8X zzz8x, zzU8 zzu8) {
        zzZ(zzz8x, zzu8.zzZZ6().zzZqs());
        zzu8.zzZZ7();
    }

    public static void zzY(Node node, zzU8 zzu8) {
        if (zzu8.zzZup.getIgnoreFootnotes() && node.getNodeType() == 20) {
            zzZ((zzZ8X) node, zzu8);
        } else {
            zzX(node, zzu8);
        }
    }

    private static void zzY(zzZ8X zzz8x, zzZV7 zzzv7) {
        zzz8x.setDeleteRevision(new zzZV8(1, zzzv7.getAuthor(), zzzv7.zzZx()));
    }

    public static Node zzZ(Node node, Node node2, zzU8 zzu8) throws Exception {
        int iZzC = zzC(node);
        if (iZzC == 0) {
            return zzW(node, node2, zzu8);
        }
        if (iZzC == 1) {
            Node nodeZzZ = zzZ(node, zzu8, true);
            zzY(nodeZzZ, node, node2, zzu8);
            return nodeZzZ;
        }
        if (iZzC != 2) {
            zzU6.zzH(node);
            return null;
        }
        return zzV(node, node2, zzu8);
    }

    public static Node zzZ(Node node, zzU8 zzu8, boolean z) throws Exception {
        Node nodeDeepClone = node.deepClone(z);
        nodeDeepClone.zzY(zzu8.zzZZ6());
        if (zzu8.zzZup.getIgnoreFootnotes() && nodeDeepClone.getNodeType() == 20) {
            zzZ((zzZ8X) nodeDeepClone, zzu8.zzZZ6().zzZqs());
        } else {
            zzZ(nodeDeepClone, zzu8.zzZZ6().zzZqs());
        }
        zzW(nodeDeepClone, zzu8);
        return nodeDeepClone;
    }

    public static void zzZ(zzZ8X zzz8x, zzU8 zzu8) {
        zzY(zzz8x, zzu8.zzZZ6().zzZqs());
        zzu8.zzZZ7();
    }

    public static void zzZ(Node node, zzU8 zzu8) {
        zzZ(node, zzu8.zzZZ6().zzZqs());
        zzu8.zzZZ7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void zzZ(Field field, zzU8 zzu8) {
        for (Node node : zzZ(field)) {
            if (node.getNodeType() == 8) {
                zzY((zzZ8X) node, zzu8.zzZZ6().zzZqs());
            } else {
                zzX(node, zzu8);
            }
        }
    }

    public static void zzZ(StructuredDocumentTag structuredDocumentTag, StructuredDocumentTag structuredDocumentTag2, zzU8 zzu8) throws Exception {
        CustomXmlPartCollection customXmlParts = zzu8.zzZZ6().getCustomXmlParts();
        if (customXmlParts.getById(structuredDocumentTag.getXmlMapping().getStoreItemId()) == null && structuredDocumentTag2.getXmlMapping().getCustomXmlPart() != null) {
            customXmlParts.add(structuredDocumentTag2.getXmlMapping().getCustomXmlPart().deepClone());
        }
        if (structuredDocumentTag.getXmlMapping().getCustomXmlPart() != null) {
            structuredDocumentTag.getXmlMapping().setValue(structuredDocumentTag.getText());
        }
    }

    private static boolean zzZ(zzYD5 zzyd5, zzYD6 zzyd6) {
        for (Node node : new zzYWB(zzyd5, zzyd6)) {
            if (node.getNodeType() == 29 || node.getNodeType() == 30) {
                return false;
            }
        }
        return true;
    }

    private static void zzZ(zzZ8X zzz8x, zzZV7 zzzv7) {
        zzz8x.setInsertRevision(new zzZV8(0, zzzv7.getAuthor(), zzzv7.zzZx()));
    }

    private static void zzZ(Node node, zzZV7 zzzv7) {
        zzZ8X zzz8x = (zzZ8X) com.aspose.words.internal.zzZKW.zzZ(node, zzZ8X.class);
        if (zzz8x != null) {
            zzZ(zzz8x, zzzv7);
        }
        if (node.isComposite()) {
            for (Node node2 : ((CompositeNode) node).getChildNodes(0, false)) {
                if (node2.getNodeType() == 7) {
                    Iterator<T> it = ((Cell) node2).getChildNodes(0, false).iterator();
                    while (it.hasNext()) {
                        zzZ((Node) it.next(), zzzv7);
                    }
                } else if (node2.getNodeType() != 19) {
                    zzZ(node2, zzzv7);
                }
            }
        }
    }

    private static ArrayList<Node> zzZ(Field field) {
        zzYWB zzywbZzZgH;
        if (field.getType() == 68) {
            zzywbZzZgH = field.zzZgG();
        } else {
            zzywbZzZgH = field.zzZgH();
        }
        ArrayList<Node> arrayList = new ArrayList<>();
        Node node = zzywbZzZgH.zzYA2().getNode();
        while (true) {
            if (node.getNodeType() != 3 && node.getNodeType() != 2 && node.getNodeType() != 4) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, node);
            }
            if (com.aspose.words.internal.zzZKO.zzA(node, zzywbZzZgH.zzYA1().getNode())) {
                break;
            }
            Node nextSibling = node.getNextSibling();
            node = (nextSibling == null || zzMY(nextSibling.getNodeType())) ? zzD(node) : nextSibling;
        }
        if (field.getType() == 68) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<FieldEnd>) arrayList, field.getEnd());
        }
        return arrayList;
    }

    private static void zzZ(WordAttrCollection wordAttrCollection, int i, zzU8 zzu8) {
        Object obj = wordAttrCollection.get(i);
        if (obj != null) {
            wordAttrCollection.zzQ(i, Integer.valueOf(zzu8.zzN8(((Integer) obj).intValue())));
        }
    }

    private static void zzZ(Paragraph paragraph, Node node) {
        int iZzC = zzC(node);
        if (iZzC == 0) {
            Paragraph paragraph2 = (Paragraph) node;
            while (paragraph2.hasChildNodes()) {
                paragraph.appendChild(paragraph2.getFirstChild());
            }
            paragraph2.zzYC(paragraph);
            return;
        }
        if (iZzC != 1) {
            if (iZzC != 2) {
                zzU6.zzH(node);
                return;
            } else {
                node.zzYC(paragraph);
                return;
            }
        }
        Paragraph paragraph3 = (Paragraph) node.getAncestor(8);
        paragraph3.zzYC(paragraph);
        while (!com.aspose.words.internal.zzZKO.zzA(node.getParentNode(), paragraph3)) {
            node = node.getParentNode();
        }
        paragraph.zzY(paragraph3.getFirstChild(), node, paragraph.getLastChild());
    }

    private static void zzZ(Section section, Paragraph paragraph, Node node) {
        Section section2 = (Section) node.getAncestor(2);
        CompositeNode parentNode = paragraph;
        while (!com.aspose.words.internal.zzZKO.zzA(parentNode.getParentNode(), section2.getBody())) {
            parentNode = parentNode.getParentNode();
        }
        section.getBody().zzZ(section2.getBody().getFirstChild(), parentNode, (Node) null);
        section.getBody().appendChild(paragraph);
        section2.zzYC(section);
    }
}
