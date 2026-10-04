package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYX4 extends zzYX9 {
    public zzYX4(DocumentBase documentBase, int i, int i2) {
        super(documentBase, i, i2);
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return Node.visitorActionToBool(documentVisitor.zzY(this));
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 16;
    }
}
