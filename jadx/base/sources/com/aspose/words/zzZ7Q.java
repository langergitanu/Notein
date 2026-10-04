package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ7Q {
    private Map<zzZAD, Node> zzYhR;
    private CompositeNode zzYhT;
    private StructuredDocumentTag zzYhU;
    private ArrayList<Node> zzYhS = new ArrayList<>();
    private HashMap<Node, ArrayList<Node>> zzYhQ = new HashMap<>();
    private HashMap<Node, CompositeNode> zzYhP = new HashMap<>();
    private HashMap<Node, ArrayList<Node>> zzYhO = new HashMap<>();
    private HashMap<Node, CompositeNode> zzYhN = new HashMap<>();

    public zzZ7Q(Map<zzZAD, Node> map) {
        this.zzYhR = map;
    }

    private void zzI(Node node, Node node2) {
        ArrayList arrayList = new ArrayList(this.zzYhR.keySet().size());
        for (zzZAD zzzad : this.zzYhR.keySet()) {
            if (this.zzYhR.get(zzzad) == node2) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZAD>) arrayList, zzzad);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.zzYhR.put((zzZAD) it.next(), node);
        }
    }

    private void zzJ(ArrayList<Node> arrayList, int i) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Node node = arrayList.get(i2);
            int nodeType = node.getNodeType();
            if (nodeType == 5) {
                zzY((Table) node, i);
            } else if (nodeType == 8) {
                zzZ((Paragraph) node, i, i2);
            }
            zzZ3(node);
        }
    }

    private void zzW(CompositeNode compositeNode, int i) {
        Paragraph paragraph;
        ArrayList<Node> arrayListZzy9 = zzy9(i);
        if (arrayListZzy9.size() == 0 || (paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(arrayListZzy9.get(0), Paragraph.class)) == null || paragraph.getParentNode() == this.zzYhS.get(i)) {
            return;
        }
        while (paragraph.getFirstChild() != null && zzQ(paragraph.getFirstChild(), i)) {
            compositeNode.appendChild(paragraph.getFirstChild());
        }
    }

    private void zzY(Table table, int i) {
        Node nodeZzya = zzya(i);
        if (nodeZzya == null) {
            return;
        }
        CompositeNode parentNode = table.getParentNode();
        CompositeNode compositeNode = (CompositeNode) com.aspose.words.internal.zzQW.zzZ(this.zzYhN, nodeZzya);
        table.getFirstRow().getFirstCell().ensureMinimum();
        Paragraph firstParagraph = table.getFirstRow().getFirstCell().getFirstParagraph();
        zzI(firstParagraph, compositeNode.getLastChild());
        while (firstParagraph.getFirstChild() != null) {
            parentNode.appendChild(firstParagraph.getFirstChild());
        }
        zzW(firstParagraph, i);
        compositeNode.insertBefore(table, compositeNode.getLastChild());
        firstParagraph.appendChild(nodeZzya);
        while (true) {
            i++;
            if (i >= this.zzYhS.size()) {
                return;
            }
            ArrayList<Node> arrayListZzy9 = zzy9(i);
            if (arrayListZzy9.size() > 0 && arrayListZzy9.get(0) == firstParagraph) {
                Node node = this.zzYhS.get(i);
                this.zzYhS.set(i, nodeZzya);
                this.zzYhO.put(nodeZzya, arrayListZzy9);
                this.zzYhN.put(nodeZzya, (CompositeNode) com.aspose.words.internal.zzQW.zzZ(this.zzYhN, node));
                return;
            }
        }
    }

    private void zzYUO() {
        this.zzYhU = null;
        this.zzYhT = null;
    }

    private int zzYUP() {
        StructuredDocumentTag structuredDocumentTag = this.zzYhU;
        if (structuredDocumentTag == null || !this.zzYhO.containsKey(structuredDocumentTag)) {
            return 0;
        }
        return this.zzYhO.get(this.zzYhU).size();
    }

    private static CompositeNode zzZ2(Node node) {
        for (CompositeNode parentNode = node.getParentNode(); parentNode != null; parentNode = parentNode.getParentNode()) {
            if (parentNode.zzT(node) && (parentNode.getNodeType() != 28 || ((zzZAD) parentNode).getLevel_IMarkupNode() != 1)) {
                return parentNode;
            }
        }
        return node.getParentNode();
    }

    private void zzZ3(Node node) {
        CompositeNode compositeNode;
        if (this.zzYhQ.containsKey(node)) {
            for (Node node2 : this.zzYhQ.get(node)) {
                if (this.zzYhP.containsKey(node2) && (compositeNode = this.zzYhP.get(node2)) != null && node2 != compositeNode.getLastChild()) {
                    compositeNode.insertBefore(node2, compositeNode.getLastChild());
                }
            }
        }
    }

    private boolean zzZG(Paragraph paragraph) {
        for (Node node : paragraph.getChildNodes(28, false)) {
            if (this.zzYhO.containsKey(node)) {
                ArrayList<Node> arrayList = this.zzYhO.get(node);
                if (arrayList.size() > 0 && arrayList.get(0) == paragraph) {
                    return true;
                }
            }
        }
        return false;
    }

    private ArrayList<Node> zzy9(int i) {
        Node node = this.zzYhS.get(i);
        if (this.zzYhO.containsKey(node)) {
            return this.zzYhO.get(node);
        }
        ArrayList<Node> arrayList = new ArrayList<>();
        arrayList.add(node);
        return arrayList;
    }

    private Node zzya(int i) {
        Node node = this.zzYhS.get(i);
        ArrayList arrayList = (ArrayList) com.aspose.words.internal.zzQW.zzZ(this.zzYhO, node);
        CompositeNode compositeNode = (CompositeNode) com.aspose.words.internal.zzQW.zzZ(this.zzYhN, node);
        boolean z = arrayList == null;
        if (z) {
            compositeNode.insertBefore(node, compositeNode.getLastChild());
        }
        if (z) {
            return null;
        }
        return node;
    }

    public final void zzQ(StructuredDocumentTag structuredDocumentTag) {
        if (structuredDocumentTag.getLevel() != 1) {
            return;
        }
        if (this.zzYhS.size() != 0) {
            if (this.zzYhS.get(0) == structuredDocumentTag) {
                for (int i = 0; i < this.zzYhS.size(); i++) {
                    Node node = this.zzYhS.get(i);
                    ArrayList<Node> arrayListZzy9 = zzy9(i);
                    if (((CompositeNode) com.aspose.words.internal.zzQW.zzZ(this.zzYhN, node)) == null) {
                        break;
                    }
                    zzJ(arrayListZzy9, i);
                }
                this.zzYhQ.clear();
                this.zzYhS.clear();
                this.zzYhN.clear();
                this.zzYhO.clear();
                this.zzYhP.clear();
                zzYUO();
                return;
            }
        }
        if (this.zzYhU == structuredDocumentTag) {
            zzYUO();
        }
    }

    public final void zzR(StructuredDocumentTag structuredDocumentTag) {
        if (this.zzYhU != null) {
            return;
        }
        this.zzYhU = structuredDocumentTag;
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<StructuredDocumentTag>) this.zzYhS, structuredDocumentTag);
    }

    public final StructuredDocumentTag zzYUN() {
        return this.zzYhU;
    }

    public final int zzZ(StructuredDocumentTag structuredDocumentTag, int i) {
        if (structuredDocumentTag.getLevel() != 1) {
            return -1;
        }
        StructuredDocumentTag structuredDocumentTag2 = this.zzYhU;
        ArrayList<Node> arrayList = null;
        if (structuredDocumentTag2 != null) {
            if (!this.zzYhO.containsKey(structuredDocumentTag2)) {
                ArrayList<Node> arrayList2 = new ArrayList<>();
                Paragraph paragraph = (Paragraph) structuredDocumentTag.getAncestor(8);
                if (!zzZG(paragraph)) {
                    arrayList2.add(paragraph);
                }
                zzJ(this.zzYhU, paragraph);
                this.zzYhO.put(this.zzYhU, arrayList2);
            }
            ArrayList<Node> arrayList3 = this.zzYhO.get(this.zzYhU);
            arrayList3.add(null);
            arrayList = arrayList3;
        }
        if (i == 5) {
            zzYUO();
        }
        if (arrayList != null) {
            return arrayList.size() - 1;
        }
        return -1;
    }

    private void zzJ(Node node, Node node2) {
        if (this.zzYhT == null) {
            this.zzYhT = zzZ2(node2);
        }
        this.zzYhN.put(node, this.zzYhT);
    }

    public final void zzZ(StructuredDocumentTag structuredDocumentTag, Node node, int i) {
        if (structuredDocumentTag == null || structuredDocumentTag.getLevel() == 1) {
            if (structuredDocumentTag == null) {
                zzJ(node, node);
                com.aspose.words.internal.zzZQG.zzZ(this.zzYhS, node);
            } else {
                this.zzYhO.get(structuredDocumentTag).set(i, node);
                if (i + 1 == zzYUP()) {
                    zzYUO();
                }
            }
        }
    }

    private boolean zzQ(Node node, int i) {
        if (node.isComposite()) {
            return (!node.isComposite() || node.getNodeType() == 28) && !((Node) C21505OooO0Oo.OooO00o(1, zzy9(i))).zzYF(node);
        }
        return true;
    }

    private void zzZ(Paragraph paragraph, int i, int i2) {
        Node nodeZzya = zzya(i);
        if (nodeZzya == null) {
            return;
        }
        CompositeNode compositeNode = (CompositeNode) com.aspose.words.internal.zzQW.zzZ(this.zzYhN, nodeZzya);
        boolean z = i2 == this.zzYhO.get(nodeZzya).size() - 1;
        Node nodeZzZ = zzZ((CompositeNode) paragraph, i, i2);
        if (nodeZzZ != null && !z) {
            if (!this.zzYhQ.containsKey(nodeZzZ)) {
                com.aspose.words.internal.zzZQF.zzY(this.zzYhQ, nodeZzZ, new ArrayList());
            }
            this.zzYhQ.get(nodeZzZ).add(paragraph);
            this.zzYhP.put(paragraph, compositeNode);
        }
        if (i2 != 0 || paragraph.getParentNode() == nodeZzya) {
            while (paragraph.getFirstChild() != null) {
                paragraph.getParentNode().appendChild(paragraph.getFirstChild());
            }
        }
        if (z) {
            zzW(paragraph, i);
            paragraph.remove();
            paragraph.appendChild(nodeZzya);
            compositeNode.insertBefore(paragraph, compositeNode.getLastChild());
            zzI(paragraph, compositeNode.getLastChild());
        }
    }

    private Node zzZ(CompositeNode compositeNode, int i, int i2) {
        boolean zZzYF;
        Node node = null;
        while (i < this.zzYhS.size()) {
            ArrayList<Node> arrayListZzy9 = zzy9(i);
            do {
                i2++;
                if (i2 >= arrayListZzy9.size()) {
                    break;
                }
                zZzYF = arrayListZzy9.get(i2).zzYF(compositeNode);
                if (zZzYF) {
                    node = arrayListZzy9.get(i2);
                }
                i++;
                i2 = -1;
            } while (zZzYF);
            i++;
            i2 = -1;
        }
        return node;
    }
}
