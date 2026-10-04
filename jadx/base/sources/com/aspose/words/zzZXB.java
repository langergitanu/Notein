package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZXB extends zzYV2 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("anchor", "docLocation", "history", "id", "tgtFrame", "tooltip");

    @Override // com.aspose.words.zzYV2
    public final void zzY(zzYVB zzyvb) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        boolean zZz8 = false;
        String strZzY9 = "";
        String value = strZzY9;
        String value2 = value;
        String value3 = value2;
        String value4 = value3;
        while (zzyu4ZzZsD.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 0) {
                value = zzyu4ZzZsD.getValue();
            } else if (iZzTP == 1) {
                value4 = zzyu4ZzZsD.getValue();
            } else if (iZzTP == 2) {
                zZz8 = zzyu4ZzZsD.zz8();
            } else if (iZzTP == 3) {
                strZzY9 = zzyvb.zzY9(zzyu4ZzZsD.getValue());
            } else if (iZzTP == 4) {
                value3 = zzyu4ZzZsD.getValue();
            } else if (iZzTP != 5) {
                zzyu4ZzZsD.zzZ(65536, 9, zzyu4ZzZsD.getLocalName());
            } else {
                value2 = zzyu4ZzZsD.getValue();
            }
        }
        Node lastChild = zzyvb.zzYz7().getLastChild();
        zzG(zzyvb);
        Node lastChild2 = zzyvb.zzYz7().getLastChild();
        if ((lastChild2 instanceof ShapeBase) && lastChild2.getPreviousSibling() == lastChild) {
            ShapeBase shapeBase = (ShapeBase) lastChild2;
            shapeBase.setShapeAttr(898, com.aspose.words.internal.zzZVR.zz5(strZzY9, value));
            if (com.aspose.words.internal.zzZYD.zzXk(value3)) {
                shapeBase.setShapeAttr(4120, value3);
            }
            if (com.aspose.words.internal.zzZYD.zzXk(value2)) {
                shapeBase.setShapeAttr(909, value2);
                return;
            }
            return;
        }
        Node fieldStart = new FieldStart(zzyvb.getDocument(), new zzYEF(), 88);
        zzyvb.zzY(zzyvb.zzYz7(), fieldStart, lastChild);
        Run run = new Run(zzyvb.getDocument(), new zzZQX(strZzY9, value, value2, value3, value4, !zZz8).zzZfj());
        if (lastChild2 != null && lastChild2.getNodeType() == 21) {
            ((Run) lastChild2).zzZYh().zzY(run.zzZYh());
        }
        zzyvb.zzY(zzyvb.zzYz7(), run, fieldStart);
        zzyvb.zzY(zzyvb.zzYz7(), new FieldSeparator(zzyvb.getDocument(), new zzYEF(), 88), run);
        zzyvb.zzXB(new FieldEnd(zzyvb.getDocument(), new zzYEF(), 88, true));
    }
}
