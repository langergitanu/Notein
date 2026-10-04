package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1C extends zzYV2 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("dest", "bookmark", "target", "screenTip");

    @Override // com.aspose.words.zzYV2
    public final void zzY(zzYVB zzyvb) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        String value = "";
        String value2 = value;
        String value3 = value2;
        String value4 = value3;
        while (zzyu4ZzZsD.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 0) {
                value = zzyu4ZzZsD.getValue();
            } else if (iZzTP == 1) {
                value2 = zzyu4ZzZsD.getValue();
            } else if (iZzTP == 2) {
                value4 = zzyu4ZzZsD.getValue();
            } else if (iZzTP != 3) {
                zzyvb.zzZ(16777216, 13, com.aspose.words.internal.zzZKN.format("Tag or attribute with name '{0}' is unexpected.", zzyu4ZzZsD.getLocalName()));
            } else {
                value3 = zzyu4ZzZsD.getValue();
            }
        }
        Node lastChild = zzyvb.zzYz7().getLastChild();
        zzG(zzyvb);
        ShapeBase shapeBase = (ShapeBase) com.aspose.words.internal.zzZKW.zzZ(zzyvb.zzYz7().getLastChild(), ShapeBase.class);
        if (shapeBase != null) {
            shapeBase.setShapeAttr(898, com.aspose.words.internal.zzZVR.zz5(value, value2));
            if (com.aspose.words.internal.zzZYD.zzXk(value4)) {
                shapeBase.setShapeAttr(4120, value4);
            }
            if (com.aspose.words.internal.zzZYD.zzXk(value3)) {
                shapeBase.setShapeAttr(909, value3);
                return;
            }
            return;
        }
        FieldStart fieldStart = new FieldStart(zzyvb.getDocument(), new zzYEF(), 88);
        zzyvb.zzY(zzyvb.zzYz7(), fieldStart, lastChild);
        Run run = new Run(zzyvb.getDocument(), new zzZQX(value, value2, value3, value4, "", false).zzZfj());
        zzyvb.zzY(zzyvb.zzYz7(), run, fieldStart);
        zzyvb.zzY(zzyvb.zzYz7(), new FieldSeparator(zzyvb.getDocument(), new zzYEF(), 88), run);
        zzyvb.zzXB(new FieldEnd(zzyvb.getDocument(), new zzYEF(), 88, true));
    }
}
