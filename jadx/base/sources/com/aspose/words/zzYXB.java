package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYXB extends zzYX6 {
    public zzYXB(DocumentBase documentBase, int i, String str, String str2, com.aspose.words.internal.zzZQ9 zzzq9, int i2) {
        super(documentBase, i, str, str2, zzzq9, i2);
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return Node.visitorActionToBool(documentVisitor.zzZ(this));
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 13;
    }
}
