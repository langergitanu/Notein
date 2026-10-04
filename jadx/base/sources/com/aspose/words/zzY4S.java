package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY4S implements zzZBU {
    private TxtSaveOptions zzX1X;

    public zzY4S() {
        this.zzX1X = new TxtSaveOptions();
    }

    @Override // com.aspose.words.zzZBU
    public final String zzZ8(Node node) throws Exception {
        zzY4F zzy4f = new zzY4F();
        Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(node, Document.class);
        if (document != null) {
            document.zzZq9().add(18);
        }
        return zzy4f.zzZ(node, this.zzX1X);
    }

    public zzY4S(TxtSaveOptions txtSaveOptions) {
        this.zzX1X = txtSaveOptions;
    }
}
