package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzTQ extends zzYVZ {
    public zzTQ(int... iArr) {
        super(iArr);
    }

    @Override // com.aspose.words.zzYVZ
    public final void zzx(Node node) {
        CompositeNode compositeNode = (CompositeNode) node;
        while (compositeNode.getFirstChild() != null) {
            compositeNode.zzYC(compositeNode.getFirstChild());
        }
        compositeNode.remove();
    }
}
