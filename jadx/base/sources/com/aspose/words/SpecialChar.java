package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class SpecialChar extends Inline {
    private String zzZi;

    public SpecialChar(DocumentBase documentBase, char c, zzYEF zzyef) {
        super(documentBase, zzyef);
        this.zzZi = Character.toString(c);
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return Node.visitorActionToBool(documentVisitor.visitSpecialChar(this));
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 26;
    }

    @Override // com.aspose.words.Node
    public String getText() {
        return this.zzZi;
    }
}
