package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYW4 extends zzYW6 {
    private static zzYW4 zzXUU = new zzYW4();

    private zzYW4() {
    }

    private static void zzV(Node node, Node node2, boolean z) {
        CompositeNode parentNode = node.getParentNode();
        CompositeNode parentNode2 = node2.getParentNode();
        zzo(node, parentNode.getLastChild());
        zzo(parentNode2.getFirstChild(), node2);
        zzYJK.zzU(parentNode, parentNode2);
        if (z) {
            zzo(parentNode, parentNode2.getPreviousSibling());
        }
    }

    public static void zzY(Node node, Node node2, int i) throws Exception {
        zzXUU.zzZ(node, node2, i);
    }

    private static void zzo(Node node, Node node2) {
        while (true) {
            Node nextSibling = node.getNextSibling();
            node.remove();
            if (node == node2) {
                return;
            } else {
                node = nextSibling;
            }
        }
    }

    private static void zzs(Node node, Node node2) {
        CompositeNode parentNode = node.getParentNode();
        CompositeNode parentNode2 = node2.getParentNode();
        CompositeNode parentNode3 = parentNode.getParentNode();
        CompositeNode parentNode4 = parentNode2.getParentNode();
        parentNode3.getNodeType();
        parentNode4.getNodeType();
        CompositeNode parentNode5 = parentNode3.getParentNode();
        CompositeNode parentNode6 = parentNode4.getParentNode();
        zzV(node, node2, false);
        zzo(parentNode, parentNode3.getLastChild());
        if (parentNode2.getPreviousSibling() != null) {
            zzo(parentNode4.getFirstChild(), parentNode2.getPreviousSibling());
        }
        zzYJK.zzU(parentNode3, parentNode4);
        zzo(parentNode5, parentNode6.getPreviousSibling());
    }

    @Override // com.aspose.words.zzYW6
    public final void zzX(Cell cell, Cell cell2) {
        zzo(cell, cell2);
    }

    @Override // com.aspose.words.zzYW6
    public final void zzY6(Node node) {
        node.remove();
    }

    @Override // com.aspose.words.zzYW6
    public final void zzr(Node node, Node node2) {
        zzo(node, node2);
    }

    @Override // com.aspose.words.zzYW6
    public final void zzt(Node node, Node node2) {
        CompositeNode parentNode = node.getParentNode();
        CompositeNode parentNode2 = node2.getParentNode();
        if (parentNode == parentNode2) {
            zzo(node, node2);
        } else if (parentNode.getParentNode() == parentNode2.getParentNode()) {
            zzV(node, node2, true);
        } else {
            zzs(node, node2);
        }
    }
}
