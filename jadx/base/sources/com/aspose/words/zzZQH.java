package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQH implements zzZBD {
    private FieldEnd zzYEr;
    private FieldSeparator zzYEs;
    private int zzYGc;

    public zzZQH(int i) {
        this.zzYGc = i;
    }

    private void zzX(DocumentBuilder documentBuilder) {
        FieldEnd fieldEnd = new FieldEnd(documentBuilder.getDocument(), new zzYEF(), this.zzYGc, this.zzYEs != null);
        this.zzYEr = fieldEnd;
        documentBuilder.insertNode(fieldEnd);
    }

    private void zzY(DocumentBuilder documentBuilder) {
        int iZzCF = zzZOO.zzCF(this.zzYGc);
        if (iZzCF == 0 || iZzCF == 1) {
            this.zzYEs = null;
        } else {
            if (iZzCF != 2) {
                throw new IllegalArgumentException();
            }
            FieldSeparator fieldSeparator = new FieldSeparator(documentBuilder.getDocument(), new zzYEF(), this.zzYGc);
            this.zzYEs = fieldSeparator;
            documentBuilder.insertNode(fieldSeparator);
        }
    }

    @Override // com.aspose.words.zzZBD
    public final void buildBlock(DocumentBuilder documentBuilder) {
        zzY(documentBuilder);
        zzX(documentBuilder);
    }

    public final FieldEnd zzZe9() {
        return this.zzYEr;
    }

    public final FieldSeparator zzZea() {
        return this.zzYEs;
    }
}
