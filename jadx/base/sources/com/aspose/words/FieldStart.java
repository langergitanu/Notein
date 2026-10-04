package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldStart extends FieldChar {
    private byte[] zzYBP;

    public FieldStart(DocumentBase documentBase, zzYEF zzyef, int i) {
        super(documentBase, ControlChar.FIELD_START_CHAR, zzyef, i);
    }

    private FormField zzZcf() {
        zzZYT zzzytZzp = zzZYT.zzp(this);
        int i = 0;
        while (zzzytZzp.zzZ(null, true, true, true, false, false)) {
            Node node = zzzytZzp.getNode();
            switch (node.getNodeType()) {
                case 22:
                    i++;
                    break;
                case 23:
                    if (i == 0) {
                        return null;
                    }
                    break;
                case 24:
                    if (i == 0) {
                        return null;
                    }
                    i--;
                    break;
                case 25:
                    if (i == 0) {
                        return (FormField) node;
                    }
                    break;
            }
        }
        return null;
    }

    @Override // com.aspose.words.SpecialChar, com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return Node.visitorActionToBool(documentVisitor.visitFieldStart(this));
    }

    public byte[] getFieldData() {
        return this.zzYBP;
    }

    @Override // com.aspose.words.SpecialChar, com.aspose.words.Node
    public int getNodeType() {
        return 22;
    }

    public final void zzYg(byte[] bArr) {
        this.zzYBP = bArr;
    }

    public final FormField zzZcg() {
        zzZOO.zzCJ(getFieldType());
        return zzZcf();
    }
}
