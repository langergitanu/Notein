package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZUQ extends CompositeNode {
    @Override // com.aspose.words.Node
    public final boolean accept(DocumentVisitor documentVisitor) {
        return true;
    }

    @Override // com.aspose.words.CompositeNode
    public final int acceptEnd(DocumentVisitor documentVisitor) {
        return 1;
    }

    @Override // com.aspose.words.CompositeNode
    public final int acceptStart(DocumentVisitor documentVisitor) {
        return 1;
    }

    @Override // com.aspose.words.Node
    public final int getNodeType() {
        return 37;
    }

    @Override // com.aspose.words.CompositeNode
    public final boolean zzT(Node node) {
        return false;
    }
}
