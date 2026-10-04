package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class SubDocument extends Node {
    private String zzZS;

    public SubDocument(DocumentBase documentBase, String str) {
        super(documentBase);
        setFileName(str);
    }

    private void setFileName(String str) {
        com.aspose.words.internal.zzZ4.zzU(str, "fileName");
        this.zzZS = str;
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return Node.visitorActionToBool(documentVisitor.visitSubDocument(this));
    }

    public final String getFileName() {
        return this.zzZS;
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 36;
    }
}
