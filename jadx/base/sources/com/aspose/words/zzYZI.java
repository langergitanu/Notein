package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYZI extends DocumentVisitor {
    private boolean zzY00;
    private FieldStart zzYBO;
    private FieldMergeField zzYDf;
    private String zzYDk;
    private FieldSeparator zzYEs;

    public static FieldMergeField zzR(Node node, String str) throws Exception {
        zzYZI zzyzi = new zzYZI();
        zzyzi.zzYDk = str;
        zzyzi.zzYL(node);
        FieldMergeField fieldMergeField = zzyzi.zzYDf;
        if (fieldMergeField != null) {
            return fieldMergeField;
        }
        if (node instanceof Document) {
            return null;
        }
        node.getDocument().accept(zzyzi);
        return zzyzi.zzYDf;
    }

    public static FieldMergeField zzS(Node node, String str) throws Exception {
        zzYZI zzyzi = new zzYZI();
        zzyzi.zzYDk = str;
        node.accept(zzyzi);
        return zzyzi.zzYDf;
    }

    private boolean zzYL(Node node) throws Exception {
        while (true) {
            for (Node nextSibling = node; nextSibling != null; nextSibling = nextSibling.getNextSibling()) {
                if (!nextSibling.accept(this)) {
                    return false;
                }
            }
            if (node.getParentNode() == null || node.getParentNode().getNextSibling() == null) {
                break;
            }
            node = node.getParentNode().getNextSibling();
        }
        return false;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldEnd(FieldEnd fieldEnd) {
        if (fieldEnd.zzZ(this) && this.zzY00) {
            FieldMergeField fieldMergeField = (FieldMergeField) zzZQB.zzX(this.zzYBO, this.zzYEs, fieldEnd);
            if (com.aspose.words.internal.zzZYD.zzi(fieldMergeField.getFieldNameNoPrefix(), this.zzYDk)) {
                this.zzYDf = fieldMergeField;
                return 2;
            }
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldSeparator(FieldSeparator fieldSeparator) {
        if (fieldSeparator.zzZ(this) && this.zzY00) {
            this.zzYEs = fieldSeparator;
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldStart(FieldStart fieldStart) {
        if (!fieldStart.zzZ(this)) {
            return 0;
        }
        boolean z = fieldStart.getFieldType() == 59;
        this.zzY00 = z;
        if (z) {
            this.zzYBO = fieldStart;
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final boolean zzZn9() {
        return false;
    }
}
