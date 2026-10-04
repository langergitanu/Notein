package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZPT {
    private Node zzYCN;
    private zzYWB zzZtB;

    public static class zzZ implements zzZA5 {
        private Node zzYCJ;
        private Node zzYCK;
        private Node zzYCL;
        private Node zzYCM;

        public zzZ(Node node, Node node2) {
            this.zzYCK = node;
            this.zzYCJ = node2;
        }

        @Override // com.aspose.words.zzZA5
        public final void zzW(Node node, Node node2) {
            if (node == this.zzYCK) {
                this.zzYCM = node2;
            }
            if (node == this.zzYCJ) {
                this.zzYCL = node2;
            }
        }

        public final Node zzZcM() {
            return this.zzYCL;
        }

        public final Node zzZcN() {
            return this.zzYCM;
        }
    }

    private zzZPT(Field field) {
        zzYWB zzywbZzZgF = field.zzZgF();
        if (zzywbZzZgF.zz13()) {
            this.zzZtB = zzYWB.zzXV4;
            return;
        }
        Node node = zzywbZzZgF.zzYA2().getNode();
        Node node2 = zzywbZzZgF.zzYA1().getNode();
        zzZ zzz = new zzZ(node, node2);
        this.zzYCN = zzZ(node, node2, zzz);
        this.zzZtB = new zzYWB(zzz.zzZcN(), false, zzz.zzZcM(), false);
    }

    public static zzZPT zzH(Field field) {
        return new zzZPT(field);
    }

    private static com.aspose.words.internal.zzFQ<Node> zzU(Node node, Node node2) {
        com.aspose.words.internal.zzIM zzim = new com.aspose.words.internal.zzIM();
        while (node != null) {
            zzim.add(node);
            if (node == node2) {
                break;
            }
            node = node.getParentNode();
        }
        return zzim;
    }

    private static Node zzZ(Node node, Node node2, zzZA5 zzza5) {
        Node nodeZzE = Node.zzE(node, node2);
        return zzZ(nodeZzE, zzU(node, nodeZzE), zzU(node2, nodeZzE), zzza5);
    }

    public final zzYWB zzZga() {
        return this.zzZtB;
    }

    private static Node zzZ(Node node, com.aspose.words.internal.zzFQ<Node> zzfq, com.aspose.words.internal.zzFQ<Node> zzfq2, zzZA5 zzza5) {
        Node nodeZzZ = node.zzZ(false, zzza5);
        if (node.isComposite()) {
            CompositeNode compositeNode = (CompositeNode) node;
            CompositeNode compositeNode2 = (CompositeNode) nodeZzZ;
            boolean z = zzfq == null;
            for (Node firstChild = compositeNode.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
                if (z) {
                    if (zzfq2 != null && zzfq2.contains(firstChild)) {
                        compositeNode2.zzA(zzZ(firstChild, null, zzfq2, zzza5));
                        return nodeZzZ;
                    }
                    compositeNode2.zzA(firstChild.deepClone(true));
                } else if (zzfq.contains(firstChild)) {
                    compositeNode2.zzA(zzZ(firstChild, zzfq, null, zzza5));
                    z = true;
                }
            }
        }
        return nodeZzZ;
    }
}
