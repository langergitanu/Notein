package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzY5V implements zzZBD {
    private String zzZi;

    public zzY5V(String str) {
        this.zzZi = str;
    }

    @Override // com.aspose.words.zzZBD
    public void buildBlock(DocumentBuilder documentBuilder) {
        documentBuilder.write(this.zzZi);
    }
}
