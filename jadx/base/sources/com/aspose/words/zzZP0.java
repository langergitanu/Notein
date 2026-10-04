package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZP0 extends zzZP6 {
    private Shape zzZ2R;

    public zzZP0(Field field, Shape shape) {
        super(field);
        this.zzZ2R = shape;
    }

    @Override // com.aspose.words.zzZP6
    public final void zzZhW() throws Exception {
        com.aspose.words.internal.zzZOY zzzoyZzZbn = getField().zzZgn().zzZbn();
        try {
            DocumentBuilder documentBuilder = new DocumentBuilder(getDocument());
            documentBuilder.moveTo(getField().getEnd());
            Shape shape = this.zzZ2R;
            if (shape != null) {
                documentBuilder.insertNode(shape);
            }
        } finally {
            zzzoyZzZbn.dispose();
        }
    }
}
