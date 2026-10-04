package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZPP implements zzZA2 {
    private boolean zzYCh;

    public zzZPP(boolean z) {
        this.zzYCh = z;
    }

    private boolean zzD6(int i) {
        return (i == 19 || i == 20 || i == 33 || i == 34) ? !this.zzYCh : zzYVU.zztq(i);
    }

    private Node zzN(Node node, boolean z) {
        if (zzZD(node)) {
            return null;
        }
        if (z && node.isComposite()) {
            Node firstChild = ((CompositeNode) node).getFirstChild();
            while (firstChild != null) {
                Node nextSibling = firstChild.getNextSibling();
                if (zzN(firstChild, true) == null) {
                    firstChild.remove();
                }
                firstChild = nextSibling;
            }
        }
        return node;
    }

    private boolean zzZD(Node node) {
        if (zzD6(node.getNodeType())) {
            return true;
        }
        if (!zzYVU.zzXN(node)) {
            return false;
        }
        while (node.getParentNode() != null && zzYVU.zzXN(node.getParentNode())) {
            node = node.getParentNode();
        }
        return !((ShapeBase) node).isInline();
    }

    @Override // com.aspose.words.zzZA2
    public final Node zzZ(Node node, Node node2, boolean z, zzZA5 zzza5) {
        return zzN(node2, z);
    }
}
