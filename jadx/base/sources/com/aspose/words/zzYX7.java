package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYX7 {
    private CompositeNode zzXWS;
    private Node zzXWT;
    private Node zzXWU;
    private Node zzXWV;
    private Node zzXWW;
    private zzYK6 zzXWX;
    private zzYK6 zzXWY;
    private zzYXA zzXWZ;

    public zzYX7(zzYXA zzyxa) {
        this.zzXWZ = zzyxa;
        zzYK6 zzyk6ZzZ = zzJ.zzZ((Node) zzyxa.zzYBW(), true);
        this.zzXWY = zzyk6ZzZ;
        if (zzyk6ZzZ == null) {
            this.zzXWY = new zzYK6(zzyxa.zzYBW(), true);
        }
        zzYK6 zzyk6ZzZ2 = zzJ.zzZ((Node) zzyxa.zzYBV(), false);
        this.zzXWX = zzyk6ZzZ2;
        if (zzyk6ZzZ2 == null) {
            this.zzXWX = new zzYK6(zzyxa.zzYBV(), true);
        }
        zzYBT();
    }

    private boolean zzYBB() {
        if (this.zzXWT.getNodeType() == 28 && this.zzXWZ.zzYBV().zzYF(this.zzXWT)) {
            return this.zzXWZ.zzYBV().getParentNode().getNodeType() == 28 || this.zzXWZ.zzYBV().zz9d() == 0;
        }
        return false;
    }

    private boolean zzYBC() {
        return this.zzXWX.zzYmk() == this.zzXWT;
    }

    private boolean zzYBD() {
        return this.zzXWU.getNodeType() == 28 && this.zzXWZ.zzYBW().zzYF(this.zzXWU) && this.zzXWZ.zzYBW().getParentNode().getNodeType() == 28;
    }

    private Node zzYBR() {
        if (this.zzXWX.zzYmk() != null) {
            return (!this.zzXWX.zzYmh() ? this.zzXWX.zzYmi() == 1 : this.zzXWX.zzYmi() == 0) ? this.zzXWX.zzYmj() : this.zzXWX.zzYmk();
        }
        Node node = this.zzXWX.getNode();
        if (this.zzXWX.zzYml() || zzYVU.zztq(node.getNodeType())) {
            return node;
        }
        while (node != null && node.getPreviousSibling() == null) {
            node = node.getParentNode();
        }
        return node != null ? node.getPreviousSibling() : this.zzXWX.getNode();
    }

    private Node zzYBS() {
        if (this.zzXWY.zzYmk() != null) {
            return (!this.zzXWY.zzYmh() ? this.zzXWY.zzYmi() == 0 : this.zzXWY.zzYmi() == 1) ? this.zzXWY.zzYmj() : this.zzXWY.zzYmk();
        }
        Node node = this.zzXWY.getNode();
        if (this.zzXWY.zzYml() || zzYVU.zztq(node.getNodeType())) {
            return node;
        }
        while (node != null && node.getNextSibling() == null) {
            node = node.getParentNode();
        }
        return node != null ? node.getNextSibling() : this.zzXWY.getNode();
    }

    private void zzYBT() {
        this.zzXWW = zzYBS();
        Node nodeZzYBR = zzYBR();
        this.zzXWV = nodeZzYBR;
        Node nextSibling = this.zzXWW;
        if (nextSibling != nodeZzYBR) {
            Node nodeZzE = Node.zzE(nextSibling, nodeZzYBR);
            if (nodeZzE == null) {
                throw new IllegalStateException("Wrong move range.");
            }
            if (nextSibling != nodeZzE) {
                while (nextSibling.getParentNode() != nodeZzE) {
                    nextSibling = nextSibling.getParentNode();
                }
            }
            if (nodeZzYBR != nodeZzE) {
                while (nodeZzYBR.getParentNode() != nodeZzE) {
                    nodeZzYBR = nodeZzYBR.getParentNode();
                }
            }
        }
        if (this.zzXWW.zzYF(nextSibling) && nodeZzYBR != nextSibling) {
            Node parentNode = this.zzXWW;
            while (parentNode != nextSibling && parentNode.zzYB4() == null && (parentNode.getParentNode().getNodeType() != 8 || !zzYJ(parentNode.getParentNode()))) {
                parentNode = parentNode.getParentNode();
            }
            if (parentNode == nextSibling) {
                nextSibling = nextSibling.getNextSibling();
            }
        }
        if (this.zzXWV.zzYF(nodeZzYBR) && nodeZzYBR != nextSibling) {
            Node parentNode2 = this.zzXWV;
            while (parentNode2 != nodeZzYBR && parentNode2.zzYB9() == null) {
                parentNode2 = parentNode2.getParentNode();
            }
            if (parentNode2 == nodeZzYBR) {
                nodeZzYBR = nodeZzYBR.getPreviousSibling();
            }
        }
        Node nextSibling2 = nextSibling;
        while (zzYVU.zztq(nextSibling2.getNodeType()) && nextSibling2 != nodeZzYBR) {
            nextSibling2 = nextSibling2.getNextSibling();
        }
        if (nextSibling2 != nodeZzYBR) {
            nextSibling = nextSibling2;
        }
        Node previousSibling = nodeZzYBR;
        while (zzYVU.zztq(previousSibling.getNodeType()) && previousSibling != nextSibling) {
            previousSibling = previousSibling.getPreviousSibling();
        }
        if (previousSibling != nextSibling) {
            nodeZzYBR = previousSibling;
        }
        this.zzXWU = nextSibling;
        this.zzXWT = nodeZzYBR;
        this.zzXWS = nextSibling.getParentNode();
        if (Node.zzD(this.zzXWW, this.zzXWU)) {
            this.zzXWW = this.zzXWU;
            while (this.zzXWW.isComposite() && ((CompositeNode) this.zzXWW).hasChildNodes()) {
                this.zzXWW = ((CompositeNode) this.zzXWW).getFirstChild();
            }
        }
        if (zzYVU.zzl(this.zzXWV, this.zzXWT) || !Node.zzD(this.zzXWT, this.zzXWV)) {
            return;
        }
        this.zzXWV = this.zzXWT;
    }

    private boolean zzYJ(Node node) {
        zzZA6 zzza6 = (zzZA6) com.aspose.words.internal.zzZKW.zzZ(node, zzZA6.class);
        if (zzza6 == null) {
            return false;
        }
        return (this.zzXWZ.zzYBU() ? zzza6.getMoveToRevision() : zzza6.getMoveFromRevision()) != null;
    }

    private boolean zzZnk() {
        return this.zzXWS.getNodeType() == 28;
    }

    public final Node zz4t() {
        return this.zzXWW;
    }

    public final boolean zzM(StructuredDocumentTag structuredDocumentTag) {
        if (this.zzXWT.getNodeType() != 28) {
            return false;
        }
        while (structuredDocumentTag != null && structuredDocumentTag != this.zzXWT && structuredDocumentTag.getParentNode().getNodeType() == 28 && ((structuredDocumentTag.zzYB4() == null || this.zzXWZ.zzYBV().zzYB9() == structuredDocumentTag || this.zzXWZ.zzYBV().zzYF(structuredDocumentTag)) && Node.zzD(structuredDocumentTag, this.zzXWZ.zzYBV()))) {
            structuredDocumentTag = (StructuredDocumentTag) structuredDocumentTag.getParentNode();
        }
        return structuredDocumentTag == this.zzXWT;
    }

    public final boolean zzN(StructuredDocumentTag structuredDocumentTag) {
        if (this.zzXWU.getNodeType() != 28) {
            return false;
        }
        while (structuredDocumentTag != null && structuredDocumentTag != this.zzXWU && ((structuredDocumentTag.zzYB9() == null || this.zzXWZ.zzYBW().zzYB4() == structuredDocumentTag || this.zzXWZ.zzYBW().zzYF(structuredDocumentTag)) && structuredDocumentTag.getParentNode().getNodeType() == 28 && (!Node.zzD(structuredDocumentTag, this.zzXWZ.zzYBW()) || this.zzXWZ.zzYBW().zzYF(structuredDocumentTag)))) {
            structuredDocumentTag = (StructuredDocumentTag) structuredDocumentTag.getParentNode();
        }
        return structuredDocumentTag == this.zzXWU;
    }

    public final boolean zzYBE() {
        return zzZnk();
    }

    public final Node zzYBF() {
        return this.zzXWV;
    }

    public final CompositeNode zzYBG() {
        return this.zzXWS;
    }

    public final Node zzYBH() {
        return this.zzXWT;
    }

    public final Node zzYBI() {
        return this.zzXWU;
    }

    public final zzYXA zzYBJ() {
        return this.zzXWZ;
    }

    public final boolean zzYBK() {
        if (zzYBL()) {
            return true;
        }
        return this.zzXWT.getNodeType() == 28 && zzYBC();
    }

    public final boolean zzYBL() {
        return zzZnk() && zzYBC() && !zzYBB();
    }

    public final boolean zzYBM() {
        return zzYBD() && zzYBC() && zzYBB();
    }

    public final boolean zzYBN() {
        if (zzYBO()) {
            return true;
        }
        if (zzYBC() && zzYBB()) {
            return true;
        }
        return !zzYBB() && this.zzXWZ.zzYBV().zzYF(this.zzXWT);
    }

    public final boolean zzYBO() {
        return zzZnk() && zzYBC() && !zzYBB();
    }

    public final boolean zzYBP() {
        if (zzYBO()) {
            return true;
        }
        if (zzYBD()) {
            return (zzYBC() && !zzYBB() && zzZnk()) ? false : true;
        }
        return false;
    }

    public final boolean zzYBQ() {
        return zzYBL() && zzYBO();
    }

    public final boolean zzZq(Paragraph paragraph) {
        Node node = this.zzXWT;
        if (node == paragraph) {
            return true;
        }
        if (!node.isComposite()) {
            return false;
        }
        ArrayList arrayListZzYAN = ((CompositeNode) this.zzXWT).getChildNodes(8, true).zzYAN();
        for (int size = arrayListZzYAN.size() - 1; size >= 0; size--) {
            Node node2 = (Node) arrayListZzYAN.get(size);
            if (Node.zzD(node2, this.zzXWZ.zzYBV())) {
                return node2 == paragraph;
            }
        }
        return false;
    }
}
