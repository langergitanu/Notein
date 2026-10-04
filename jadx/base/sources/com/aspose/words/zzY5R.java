package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY5R extends zzZPH {
    private zzZQ8 zzX3I;
    private int zzYS3;

    public zzY5R(Field field, String str) {
        this(field, str, true);
    }

    private boolean zzK(Inline inline) {
        return getField().zzZgm() ? getField().zzZgo().zzZaN().zzU(inline) : inline.zzYUU();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.aspose.words.FieldStart, com.aspose.words.Inline] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.aspose.words.Node] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.aspose.words.Node, java.lang.Object] */
    private void zzZ(DocumentBuilder documentBuilder, Node node, FieldStart fieldStart) {
        Inline inline;
        documentBuilder.moveTo(node);
        boolean zZzK = zzK(fieldStart);
        do {
            fieldStart = fieldStart.getNextSibling();
            inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(fieldStart, Inline.class);
            if (inline != null && zzYVU.zzXV(inline) && zzK(inline) == zZzK) {
                break;
            }
        } while (fieldStart != 0);
        if (inline != null) {
            documentBuilder.zzZ(inline.zzZYh(), true);
        }
    }

    @Override // com.aspose.words.zzZPH
    public final void zzZcw() throws Exception {
        DocumentBuilder documentBuilder = new DocumentBuilder(getField().getStart().zzYBb());
        documentBuilder.zzFQ(this.zzYS3);
        zzZ(documentBuilder, getField().getEnd(), getField().getStart());
        zzZPB.zzZ(getField(), documentBuilder, this.zzX3I);
    }

    public zzY5R(Field field, String str, boolean z) {
        this(field, new zzZQ8(zzYIU.zzCI(str), false), z);
    }

    public zzY5R(Field field, zzZQ8 zzzq8) {
        this(field, zzzq8, true);
    }

    public zzY5R(Field field, zzZQ8 zzzq8, int i) {
        this(field, zzzq8, true);
        this.zzYS3 = i;
    }

    private zzY5R(Field field, zzZQ8 zzzq8, boolean z) {
        super(field, z);
        this.zzX3I = zzzq8;
    }
}
