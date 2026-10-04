package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYX3 extends zzYX6 {
    public zzYX3(DocumentBase documentBase, int i, String str, String str2, com.aspose.words.internal.zzZQ9 zzzq9, int i2) {
        super(documentBase, i, str, str2, zzzq9, i2);
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return Node.visitorActionToBool(documentVisitor.zzY(this));
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 15;
    }
}
