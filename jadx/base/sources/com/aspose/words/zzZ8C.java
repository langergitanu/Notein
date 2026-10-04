package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ8C implements zzZB1 {
    private Iterable<Node> zzYjv;

    public zzZ8C(Iterable<Node> iterable) {
        this.zzYjv = iterable;
    }

    private static Shape zzE(Iterable<Node> iterable) {
        for (Node node : iterable) {
            if (node.getNodeType() == 18) {
                return (Shape) node;
            }
        }
        return null;
    }

    @Override // com.aspose.words.zzZB1
    public final void zzZ(zzYWB zzywb) {
        Shape shapeZzE = zzE(this.zzYjv);
        Shape shapeZzE2 = zzE(zzywb);
        if (shapeZzE == null || shapeZzE2 == null) {
            return;
        }
        shapeZzE2.zzWf(shapeZzE.getWidth());
        shapeZzE2.zzWe(shapeZzE.getHeight());
    }
}
