package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldSeparator extends FieldChar {
    private zzYOC zzYC1;

    public FieldSeparator(DocumentBase documentBase, zzYEF zzyef, int i) {
        super(documentBase, ControlChar.FIELD_SEPARATOR_CHAR, zzyef, i);
        this.zzYC1 = null;
    }

    @Override // com.aspose.words.SpecialChar, com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return Node.visitorActionToBool(documentVisitor.visitFieldSeparator(this));
    }

    @Override // com.aspose.words.SpecialChar, com.aspose.words.Node
    public int getNodeType() {
        return 23;
    }

    public final zzYOC getOleObject() {
        return this.zzYC1;
    }

    public FieldSeparator(DocumentBase documentBase, zzYEF zzyef, int i, zzYOC zzyoc) {
        super(documentBase, ControlChar.FIELD_SEPARATOR_CHAR, zzyef, i);
        this.zzYC1 = zzyoc;
    }
}
