package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZPD implements zzZBD {
    private FieldStart zzYBO;
    private int zzYGc;

    public zzZPD(int i) {
        this.zzYGc = i;
    }

    @Override // com.aspose.words.zzZBD
    public final void buildBlock(DocumentBuilder documentBuilder) {
        FieldStart fieldStart = new FieldStart(documentBuilder.getDocument(), new zzYEF(), this.zzYGc);
        this.zzYBO = fieldStart;
        documentBuilder.insertNode(fieldStart);
    }

    public final FieldStart zzZce() {
        return this.zzYBO;
    }
}
