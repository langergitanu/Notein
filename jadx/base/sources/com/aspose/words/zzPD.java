package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzPD extends zzOO {
    public zzPD() {
        super("float", false, zzL4.zzZno, zzL3.zzX(zzL4.zzZmH, zzL4.zzZmG, zzL4.zzZno));
    }

    @Override // com.aspose.words.zzMS
    public final void zzY(zzMP zzmp, Shape shape) {
        if (shape.isHorizontalRule()) {
            return;
        }
        if (zzmp.zzP(zzL4.zzZmH)) {
            shape.setWrapType(2);
            shape.setShapeAttr(911, 1);
            shape.setRelativeVerticalPosition(3);
            shape.setAllowOverlap(false);
            return;
        }
        if (zzmp.zzP(zzL4.zzZmG)) {
            shape.setWrapType(2);
            shape.setShapeAttr(911, 3);
            shape.setRelativeVerticalPosition(3);
            shape.setAllowOverlap(false);
        }
    }

    @Override // com.aspose.words.zzMS
    public final void zzZ(zzMP zzmp, Table table) throws Exception {
        zzmp.getCount();
        zzL4 zzl4ZzZVx = zzmp.zzZVx();
        if (zzl4ZzZVx.zzP(zzL4.zzZmG)) {
            table.setAlignment(2);
        } else if (zzl4ZzZVx.zzP(zzL4.zzZmH)) {
            table.setAlignment(0);
        }
        table.setTextWrapping(1);
    }
}
