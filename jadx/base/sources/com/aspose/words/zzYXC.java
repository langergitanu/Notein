package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYXC extends zzYX9 {
    public zzYXC(DocumentBase documentBase, int i, int i2) {
        super(documentBase, i, i2);
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return Node.visitorActionToBool(documentVisitor.zzZ(this));
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 14;
    }
}
