package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldEnd extends FieldChar {
    private boolean zzYEt;

    public FieldEnd(DocumentBase documentBase, zzYEF zzyef, int i, boolean z) {
        super(documentBase, ControlChar.FIELD_END_CHAR, zzyef, i);
        this.zzYEt = z;
    }

    @Override // com.aspose.words.SpecialChar, com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return Node.visitorActionToBool(documentVisitor.visitFieldEnd(this));
    }

    @Override // com.aspose.words.SpecialChar, com.aspose.words.Node
    public int getNodeType() {
        return 24;
    }

    public boolean hasSeparator() {
        return this.zzYEt;
    }

    public final void zzVU(boolean z) {
        this.zzYEt = z;
    }
}
