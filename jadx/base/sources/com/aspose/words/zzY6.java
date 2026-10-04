package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY6 extends zzYW0 {
    private static int[] zzZCA = {9, 10};
    private com.aspose.words.internal.zzIM<String> zzZCB;

    public zzY6(zzYWB zzywb) {
        super(zzywb, 2, true);
        this.zzZCB = new com.aspose.words.internal.zzIM<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static zzZD7 zzZ(Node node, String str, boolean z) {
        zzZD7 zzzd7 = (zzZD7) com.aspose.words.internal.zzZKW.zzZ(z ? node.getNextSibling() : node.getPreviousSibling(), zzZD7.class);
        while (zzzd7 != 0) {
            if (com.aspose.words.internal.zzZKN.equals(zzzd7.getName(), str)) {
                return zzzd7;
            }
            zzzd7 = z ? (zzZD7) com.aspose.words.internal.zzZKW.zzZ(((Node) zzzd7).getNextSibling(), zzZD7.class) : (zzZD7) com.aspose.words.internal.zzZKW.zzZ(((Node) zzzd7).getPreviousSibling(), zzZD7.class);
        }
        return null;
    }

    @Override // com.aspose.words.zzYW0
    public final void zz98() {
        for (Node node : zzYzH()) {
            zzZD7 zzzd7 = (zzZD7) com.aspose.words.internal.zzZKW.zzZ(node, zzZD7.class);
            if (zzzd7 != null && this.zzZCB.contains(zzzd7.getName())) {
                Object objZzZ = node.getNodeType() == 9 ? zzZ(zzZga().zzYA1().getNode(), zzzd7.getName(), true) : zzZ(zzZga().zzYA2().getNode(), zzzd7.getName(), false);
                if (objZzZ != null) {
                    ((Node) objZzZ).remove();
                }
            }
            node.remove();
        }
    }

    @Override // com.aspose.words.zzYW0
    public final void zzM(Node node) {
        if (!node.isComposite()) {
            zzZD7 zzzd7 = (zzZD7) com.aspose.words.internal.zzZKW.zzZ(next(), zzZD7.class);
            if (zzzd7 != null) {
                if (this.zzZCB.contains(zzzd7.getName())) {
                    this.zzZCB.remove(zzzd7.getName());
                } else {
                    this.zzZCB.add(zzzd7.getName());
                }
            }
        } else if (node.getParentNode() != null) {
            NodeCollection nodeCollectionZzY = ((CompositeNode) node).zzY(zzZCA, true);
            for (int count = nodeCollectionZzY.getCount() - 1; count >= 0; count--) {
                Node node2 = nodeCollectionZzY.get(count);
                if (node.getParentNode().zzT(node2)) {
                    node.zzYD(node2);
                }
            }
        }
        super.zzM(node);
    }
}
