package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZRS extends CompositeNode {
    public zzZRS(Document document) {
        super(document);
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptEnd(DocumentVisitor documentVisitor) {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptStart(DocumentVisitor documentVisitor) {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 37;
    }

    public abstract int zzZhe();

    public abstract Node zzZhf();

    public void zzZz9() {
        for (Node firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            ((zzZRS) firstChild).zzZz9();
        }
    }

    public abstract void zzf(Node node);
}
