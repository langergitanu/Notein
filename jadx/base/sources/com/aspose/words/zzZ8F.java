package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ8F extends zzYVV {
    public zzZ8F() {
        super(18);
    }

    @Override // com.aspose.words.zzYVV, com.aspose.words.zzYWD
    public final boolean zzJ(Node node) throws Exception {
        if (super.zzJ(node)) {
            return ((Shape) node).hasImage();
        }
        return false;
    }
}
