package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Node implements Cloneable {
    private int zzXVS;
    private Node zzXVT;
    private Node zzXVU;
    private Node zzXVV;

    public static class zzZ implements zzZA5 {
        private Node zzXVR;
        private HashMap<Integer, Integer> zzZuf;

        public zzZ(Node node) {
            this.zzXVR = node;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.aspose.words.zzZA5
        public final void zzW(Node node, Node node2) {
            if (node == this.zzXVR) {
                return;
            }
            if (node2.getNodeType() == 19 || node2.getNodeType() == 33 || node2.getNodeType() == 34) {
                zzZA1 zzza1 = (zzZA1) node2;
                if (this.zzZuf == null) {
                    this.zzZuf = new HashMap<>();
                }
                RefInt refInt = new RefInt(0);
                boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzZuf, Integer.valueOf(zzza1.getIdInternal()), refInt);
                int iZzZpW = refInt.get();
                if (!zZzZ) {
                    iZzZpW = node2.getDocument().zzZpW();
                    com.aspose.words.internal.zzZQF.zzY(this.zzZuf, Integer.valueOf(zzza1.getIdInternal()), Integer.valueOf(iZzZpW));
                }
                zzza1.setIdInternal(iZzZpW);
                RefInt refInt2 = new RefInt(0);
                boolean zZzZ2 = com.aspose.words.internal.zzZQF.zzZ(this.zzZuf, Integer.valueOf(zzza1.getParentIdInternal()), refInt2);
                int i = refInt2.get();
                if (zZzZ2) {
                    zzza1.setParentIdInternal(i);
                }
            }
        }
    }

    public Node() {
    }

    public static String nodeTypeToString(int i) {
        switch (i) {
            case 0:
                return "Any";
            case 1:
                return "Document";
            case 2:
                return "Section";
            case 3:
                return "Body";
            case 4:
                return "HeaderFooter";
            case 5:
                return "Table";
            case 6:
                return "Row";
            case 7:
                return "Cell";
            case 8:
                return "Paragraph";
            case 9:
                return "BookmarkStart";
            case 10:
                return "BookmarkEnd";
            case 11:
                return "EditableRangeStart";
            case 12:
                return "EditableRangeEnd";
            case 13:
                return "MoveFromRangeStart";
            case 14:
                return "MoveFromRangeEnd";
            case 15:
                return "MoveToRangeStart";
            case 16:
                return "MoveToRangeEnd";
            case 17:
                return "GroupShape";
            case 18:
                return "Shape";
            case 19:
                return "Comment";
            case 20:
                return "Footnote";
            case 21:
                return "Run";
            case 22:
                return "FieldStart";
            case 23:
                return "FieldSeparator";
            case 24:
                return "FieldEnd";
            case 25:
                return "FormField";
            case 26:
                return "SpecialChar";
            case 27:
                return "SmartTag";
            case 28:
                return "StructuredDocumentTag";
            case 29:
                return "StructuredDocumentTagRangeStart";
            case 30:
                return "StructuredDocumentTagRangeEnd";
            case 31:
                return "GlossaryDocument";
            case 32:
                return "BuildingBlock";
            case 33:
                return "CommentRangeStart";
            case 34:
                return "CommentRangeEnd";
            case 35:
                return "OfficeMath";
            case 36:
                return "SubDocument";
            case 37:
                return "System";
            case 38:
                return "Null";
            default:
                return "Unknown node type.";
        }
    }

    public static boolean visitorActionToBool(int i) {
        if (i == 0 || i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalStateException("Unknown visitor action.");
    }

    private boolean zz8(int... iArr) {
        for (int i : iArr) {
            if (getNodeType() == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean zzD(Node node, Node node2) {
        com.aspose.words.internal.zzZQC<Node> zzzqcZzYA;
        com.aspose.words.internal.zzZQC<Node> zzzqcZzYA2;
        Node nodeZzZ;
        if (node == null || node2 == null || (nodeZzZ = zzZ((zzzqcZzYA = zzYA(node)), (zzzqcZzYA2 = zzYA(node2)))) == null) {
            return false;
        }
        if (zzzqcZzYA.size() == 0 || zzzqcZzYA2.size() == 0) {
            return zzzqcZzYA2.size() > 0;
        }
        Node nodePeek = zzzqcZzYA.peek();
        Node nodePeek2 = zzzqcZzYA2.peek();
        for (Node node3 : ((CompositeNode) nodeZzZ).getChildNodes(0, false)) {
            if (node3 == nodePeek) {
                return true;
            }
            if (node3 == nodePeek2) {
                break;
            }
        }
        return false;
    }

    public static Node zzE(Node node, Node node2) {
        if (node == node2) {
            return node;
        }
        if (node == null || node2 == null) {
            return null;
        }
        return zzZ(zzYA(node), zzYA(node2));
    }

    private static com.aspose.words.internal.zzZQC<Node> zzYA(Node node) {
        com.aspose.words.internal.zzZQC<Node> zzzqc = new com.aspose.words.internal.zzZQC<>();
        while (node != null) {
            zzzqc.push(node);
            node = node.getParentNode();
        }
        return zzzqc;
    }

    private String zzYAT() {
        StringBuilder sb = new StringBuilder();
        Node parentNode = this;
        while (parentNode != null && parentNode.getParentNode() != null) {
            int i = 0;
            for (Node firstChild = parentNode.getParentNode().getFirstChild(); firstChild != null && firstChild != parentNode; firstChild = firstChild.getNextSibling()) {
                i++;
            }
            com.aspose.words.internal.zzZNH.zzZ(sb, "{0}{1}", parentNode == this ? "" : ".", Integer.valueOf(i));
            parentNode = parentNode.getParentNode();
        }
        return com.aspose.words.internal.zzZKN.zzTX(sb.toString());
    }

    public abstract boolean accept(DocumentVisitor documentVisitor) throws Exception;

    /* JADX INFO: renamed from: dd */
    public void m74892dd() {
    }

    public Node deepClone(boolean z) {
        return zzZ(z, new zzZ(this));
    }

    public CompositeNode getAncestor(Class cls) {
        for (CompositeNode parentNode = getParentNode(); parentNode != null; parentNode = parentNode.getParentNode()) {
            if (cls.isInstance(parentNode)) {
                return parentNode;
            }
        }
        return null;
    }

    public int getCustomNodeId() {
        return this.zzXVS;
    }

    public DocumentBase getDocument() {
        Node node = this.zzXVV;
        if (node != null) {
            return node.getDocument();
        }
        return null;
    }

    public Node getNextSibling() {
        return this.zzXVU;
    }

    public abstract int getNodeType();

    public CompositeNode getParentNode() {
        Node node = this.zzXVV;
        if (node == null || node.getNodeType() == 38) {
            return null;
        }
        return (CompositeNode) this.zzXVV;
    }

    public Node getPreviousSibling() {
        return this.zzXVT;
    }

    public Range getRange() {
        return new Range(this);
    }

    public String getText() {
        return "";
    }

    public boolean isComposite() {
        return false;
    }

    public final boolean isRemoved() {
        return getAncestor(1) == null;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public Node nextPreOrder(Node node) {
        Node firstChild = isComposite() ? ((CompositeNode) this).getFirstChild() : null;
        if (firstChild == null) {
            firstChild = this;
            while (firstChild != null && firstChild != node && firstChild.getNextSibling() == null) {
                firstChild = firstChild.getParentNode();
            }
            if (firstChild != null && firstChild != node) {
                firstChild = firstChild.getNextSibling();
            }
        }
        if (firstChild == node) {
            return null;
        }
        return firstChild;
    }

    public Node previousPreOrder(Node node) {
        Node previousSibling = getPreviousSibling();
        while (previousSibling != null) {
            Node lastChild = previousSibling.isComposite() ? ((CompositeNode) previousSibling).getLastChild() : null;
            if (lastChild == null) {
                break;
            }
            previousSibling = lastChild;
        }
        if (previousSibling == null) {
            previousSibling = getParentNode();
        }
        if (previousSibling == node) {
            return null;
        }
        return previousSibling;
    }

    public void remove() {
        if (getParentNode() == null) {
            throw new IllegalStateException("Cannot remove because there is no parent.");
        }
        getParentNode().removeChild(this);
    }

    public void setCustomNodeId(int i) {
        this.zzXVS = i;
    }

    public String toString(int i) throws Exception {
        return zzZLT.zzAA(i).zzZ8(this);
    }

    public int zz0R() {
        return getText().length();
    }

    public final Node zz9(int... iArr) {
        Node previousSibling = getPreviousSibling();
        while (previousSibling != null && !previousSibling.zz8(iArr)) {
            previousSibling = previousSibling.getPreviousSibling();
        }
        return previousSibling;
    }

    public final boolean zz9I() {
        return getParentNode() == null || this == getParentNode().getFirstChild();
    }

    public void zzI(StringBuilder sb) {
        com.aspose.words.internal.zzZNH.zzU(sb, getText());
    }

    public final Node zzN(Node node, int i) {
        Node nodePreviousPreOrder = previousPreOrder(node);
        while (nodePreviousPreOrder != null && nodePreviousPreOrder.getNodeType() != i) {
            nodePreviousPreOrder = nodePreviousPreOrder.previousPreOrder(node);
        }
        return nodePreviousPreOrder;
    }

    public final Node zzSI(boolean z) {
        return z ? getNextSibling() : getPreviousSibling();
    }

    public final void zzY(DocumentBase documentBase) {
        this.zzXVV = documentBase != null ? documentBase.zzZq3() : null;
    }

    public final zzZYT zzYAU() {
        Node nextSibling = getNextSibling();
        return nextSibling != null ? zzZYT.zzq(nextSibling) : zzZYT.zzp(getParentNode());
    }

    public final zzZYT zzYAV() {
        Node previousSibling = getPreviousSibling();
        return previousSibling != null ? zzZYT.zzp(previousSibling) : zzZYT.zzq(getParentNode());
    }

    public final Node zzYAW() {
        if (getParentNode() == null) {
            return getDocument();
        }
        Node parentNode = this;
        while (parentNode.getParentNode() != null) {
            parentNode = parentNode.getParentNode();
        }
        return parentNode;
    }

    public final zzZ96 zzYAX() {
        for (CompositeNode parentNode = getParentNode(); parentNode != null; parentNode = parentNode.getParentNode()) {
            zzZ96 zzz96 = (zzZ96) com.aspose.words.internal.zzZKW.zzZ(parentNode, zzZ96.class);
            if (zzz96 != null) {
                return zzz96;
            }
        }
        return null;
    }

    public final int zzYAY() {
        int nodeType = getNodeType();
        if (nodeType == 1) {
            return 0;
        }
        if (nodeType == 2) {
            return 1;
        }
        if (nodeType == 3 || nodeType == 4) {
            return 2;
        }
        boolean zZzXO = zzYVU.zzXO(this);
        boolean zZzXR = zzYVU.zzXR(this);
        boolean zZzXP = zzYVU.zzXP(this);
        boolean zZzXQ = zzYVU.zzXQ(this);
        CompositeNode parentNode = getParentNode();
        int iZzYAY = (parentNode == null || parentNode.getNodeType() != 28) ? 7 : getParentNode().zzYAY();
        int nodeType2 = parentNode != null ? parentNode.getNodeType() : 38;
        if (zZzXQ && ((!zZzXO && !zZzXR && !zZzXP) || iZzYAY == 4 || nodeType2 == 5)) {
            return 4;
        }
        if (zZzXP && ((!zZzXO && !zZzXR) || iZzYAY == 5 || nodeType2 == 6)) {
            return 5;
        }
        if (!zZzXR || (zZzXO && iZzYAY != 3 && (parentNode == null || parentNode.zzYAY() == 3 || iZzYAY == 6 || nodeType2 == 27 || nodeType2 == 35))) {
            return zZzXO ? 6 : 7;
        }
        return 3;
    }

    public final Node zzYAZ() {
        Node node = this.zzXVU;
        return node != null ? node : getParentNode();
    }

    public final boolean zzYB(Node node) {
        return zzD(this, node);
    }

    public final Node zzYB0() {
        return this.zzXVT;
    }

    public final Node zzYB1() {
        return this.zzXVU;
    }

    public final boolean zzYB2() {
        for (Node previousSibling = getPreviousSibling(); previousSibling != null; previousSibling = previousSibling.getPreviousSibling()) {
            if (!zzYVU.zzXW(previousSibling)) {
                return false;
            }
        }
        return true;
    }

    public final boolean zzYB3() {
        return getParentNode() == null || this == getParentNode().getLastChild();
    }

    public final Node zzYB4() {
        Node nextSibling = this;
        do {
            nextSibling = nextSibling.getNextSibling();
            if (nextSibling == null) {
                break;
            }
        } while (zzYVU.zztq(nextSibling.getNodeType()));
        return nextSibling;
    }

    public final CompositeNode zzYB5() {
        Node nodeZzYB7 = this;
        do {
            nodeZzYB7 = nodeZzYB7.zzYB7();
            if (nodeZzYB7 == null) {
                break;
            }
        } while (!nodeZzYB7.isComposite());
        return (CompositeNode) nodeZzYB7;
    }

    public final CompositeNode zzYB6() {
        Node nodeZzYB8 = this;
        do {
            nodeZzYB8 = nodeZzYB8.zzYB8();
            if (nodeZzYB8 == null) {
                break;
            }
        } while (!nodeZzYB8.isComposite());
        return (CompositeNode) nodeZzYB8;
    }

    public final Node zzYB7() {
        Node nodeZzA = zzYVU.zzA(getNextSibling(), false);
        return (nodeZzA == null && zzYVU.zzXM(getParentNode())) ? getParentNode().zzYB7() : nodeZzA;
    }

    public final Node zzYB8() {
        Node nodeZzz = zzYVU.zzz(getPreviousSibling(), false);
        return (nodeZzz == null && zzYVU.zzXM(getParentNode())) ? getParentNode().zzYB8() : nodeZzz;
    }

    public final Node zzYB9() {
        Node previousSibling = this;
        do {
            previousSibling = previousSibling.getPreviousSibling();
            if (previousSibling == null) {
                break;
            }
        } while (zzYVU.zztq(previousSibling.getNodeType()));
        return previousSibling;
    }

    public final Document zzYBa() {
        DocumentBase document = getDocument();
        return document instanceof Document ? (Document) document : ((GlossaryDocument) document).zzZrE();
    }

    public final Document zzYBb() {
        DocumentBase document = getDocument();
        if (document instanceof Document) {
            return (Document) document;
        }
        throw new IllegalStateException("This operation requires the node to be inside the main document.");
    }

    public final CompositeNode zzYBc() {
        Node parentNode = this;
        while (true) {
            if (!zzYVU.zzXM(parentNode.getParentNode()) && !zzYVU.zzXK(parentNode.getParentNode())) {
                return parentNode.getParentNode();
            }
            parentNode = parentNode.getParentNode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CompositeNode zzYBd() {
        boolean zZzXM;
        CompositeNode parentNode = this;
        do {
            zZzXM = zzYVU.zzXM(parentNode.getParentNode());
            parentNode = parentNode.getParentNode();
        } while (zZzXM);
        return parentNode;
    }

    public final Node zzYC(Node node) {
        return getParentNode().insertBefore(node, this);
    }

    public final Node zzYD(Node node) {
        return getParentNode().insertAfter(node, this);
    }

    public final Node zzYE(Node node) {
        Node nodeNextPreOrder = nextPreOrder(node);
        while (nodeNextPreOrder != null) {
            if (nodeNextPreOrder.getNodeType() == 8) {
                return nodeNextPreOrder;
            }
            nodeNextPreOrder = nodeNextPreOrder.nextPreOrder(node);
        }
        return null;
    }

    public final boolean zzYF(Node node) {
        if (node == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: node");
        }
        for (CompositeNode parentNode = getParentNode(); parentNode != null && parentNode != this; parentNode = parentNode.getParentNode()) {
            if (parentNode == node) {
                return true;
            }
        }
        return false;
    }

    public final void zzYG(Node node) {
        if (node == null) {
            node = getDocument().zzZq3();
        }
        this.zzXVV = node;
    }

    public final void zzYH(Node node) {
        this.zzXVT = node;
    }

    public final void zzYI(Node node) {
        this.zzXVU = node;
    }

    public Node zzZ(boolean z, zzZA5 zzza5) {
        Node node = (Node) memberwiseClone();
        if (this.zzXVV != null) {
            node.zzXVV = getDocument().zzZq3();
        }
        node.zzXVU = null;
        node.zzXVT = null;
        if (zzza5 != null) {
            zzza5.zzW(this, node);
        }
        return node;
    }

    public final Node zza(int... iArr) {
        Node nextSibling = getNextSibling();
        while (nextSibling != null && !nextSibling.zz8(iArr)) {
            nextSibling = nextSibling.getNextSibling();
        }
        return nextSibling;
    }

    public final Node zztB(int i) {
        for (CompositeNode parentNode = getParentNode(); parentNode != null; parentNode = parentNode.getParentNode()) {
            if (parentNode.getNodeType() != i) {
                if (zzYVU.zzXS(parentNode)) {
                    if (i != 0) {
                        return null;
                    }
                }
            }
            return parentNode;
        }
        return null;
    }

    public final Node zztC(int i) {
        Node previousSibling = getPreviousSibling();
        while (previousSibling != null && i != previousSibling.getNodeType()) {
            previousSibling = previousSibling.getPreviousSibling();
        }
        return previousSibling;
    }

    public final Node zztD(int i) {
        Node nextSibling = getNextSibling();
        while (nextSibling != null && i != nextSibling.getNodeType()) {
            nextSibling = nextSibling.getNextSibling();
        }
        return nextSibling;
    }

    public Node(DocumentBase documentBase) {
        this();
        zzY(documentBase);
    }

    public String toString(SaveOptions saveOptions) throws Exception {
        return zzZLT.zzV(saveOptions).zzZ8(this);
    }

    public CompositeNode getAncestor(int i) {
        for (CompositeNode parentNode = getParentNode(); parentNode != null; parentNode = parentNode.getParentNode()) {
            if (parentNode.getNodeType() == i) {
                return parentNode;
            }
        }
        return null;
    }

    public String toString() {
        return com.aspose.words.internal.zzZKN.zzTX(com.aspose.words.internal.zzZKN.format("{0} {1}", nodeTypeToString(getNodeType()), zzYAT()));
    }

    private static Node zzZ(com.aspose.words.internal.zzZQC<Node> zzzqc, com.aspose.words.internal.zzZQC<Node> zzzqc2) {
        Node nodePop = null;
        while (zzzqc.peek() == zzzqc2.peek()) {
            nodePop = zzzqc.pop();
            zzzqc2.pop();
            if (zzzqc.size() == 0 || zzzqc2.size() == 0) {
                break;
            }
        }
        return nodePop;
    }
}
