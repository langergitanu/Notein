package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZP2 extends zzZP6 {
    private String zzYBj;

    public zzZP2(Field field, String str) {
        super(field);
        this.zzYBj = str;
    }

    @Override // com.aspose.words.zzZP6
    public final void zzZhW() throws Exception {
        com.aspose.words.internal.zzZOY zzzoyZzZbn = getField().zzZgn().zzZbn();
        try {
            DocumentBuilder documentBuilder = new DocumentBuilder(getDocument());
            documentBuilder.moveTo(getField().getEnd());
            documentBuilder.setBold(true);
            documentBuilder.write(this.zzYBj);
        } finally {
            zzzoyZzZbn.dispose();
        }
    }
}
