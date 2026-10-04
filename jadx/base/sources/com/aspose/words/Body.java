package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class Body extends Story {
    public Body(DocumentBase documentBase) {
        super(documentBase, 1);
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return acceptCore(documentVisitor);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptEnd(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitBodyEnd(this);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptStart(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitBodyStart(this);
    }

    public void ensureMinimum() {
        zzY0C.zzE(this);
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 3;
    }

    public Section getParentSection() {
        return (Section) getParentNode();
    }

    @Override // com.aspose.words.Story, com.aspose.words.CompositeNode
    public final boolean zzT(Node node) {
        if (node.getNodeType() == 29 || node.getNodeType() == 30) {
            return true;
        }
        return super.zzT(node);
    }
}
