package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYD6 extends Node {
    int zzXWe;
    int zze0;

    public zzYD6(DocumentBase documentBase, int i, int i2) {
        super(documentBase);
        this.zze0 = i;
        this.zzXWe = i2;
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) {
        return true;
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 37;
    }
}
