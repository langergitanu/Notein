package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZSB implements zzZA2 {
    private NodeImporter zzYRK;

    public zzZSB(DocumentBase documentBase, DocumentBase documentBase2, com.aspose.words.internal.zzD5 zzd5) {
        this(documentBase, documentBase2, 0, zzd5);
    }

    @Override // com.aspose.words.zzZA2
    public final Node zzZ(Node node, Node node2, boolean z, zzZA5 zzza5) {
        return this.zzYRK.zzZ(node2, z, zzza5);
    }

    public zzZSB(DocumentBase documentBase, DocumentBase documentBase2, int i) {
        this(documentBase, documentBase2, i, null);
    }

    private zzZSB(DocumentBase documentBase, DocumentBase documentBase2, int i, com.aspose.words.internal.zzD5 zzd5) {
        this.zzYRK = new NodeImporter(documentBase, documentBase2, new zzZ86(documentBase, documentBase2, i, null, zzd5));
    }
}
