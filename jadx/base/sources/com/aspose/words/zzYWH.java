package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYWH implements zzZBD {
    private Node zzYR6;

    public zzYWH(Node node) {
        this.zzYR6 = node;
    }

    @Override // com.aspose.words.zzZBD
    public final void buildBlock(DocumentBuilder documentBuilder) {
        documentBuilder.insertNode(this.zzYR6);
    }
}
