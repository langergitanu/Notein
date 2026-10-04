package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYV9 {
    private com.aspose.words.internal.zzZQC<FieldChar> zzYEn = new com.aspose.words.internal.zzZQC<>();
    private com.aspose.words.internal.zzZQC<Integer> zzXTK = new com.aspose.words.internal.zzZQC<>();

    private static boolean zz0(Field field) {
        Iterator<Node> it = field.zzZgG().iterator();
        while (it.hasNext()) {
            zzZ8X zzz8x = (zzZ8X) com.aspose.words.internal.zzZKW.zzZ(it.next(), zzZ8X.class);
            if (zzz8x != null && (zzz8x.getDeleteRevision() != null || zzz8x.getInsertRevision() != null)) {
                return true;
            }
        }
        return false;
    }

    private static boolean zz1(Field field) {
        Iterator<Node> it = field.zzZgG().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof FieldChar) {
                return true;
            }
        }
        return false;
    }

    private static boolean zz2(Field field) {
        Node previousSibling = field.getEnd().getPreviousSibling();
        return (previousSibling instanceof ShapeBase) && previousSibling.getPreviousSibling() == field.getSeparator();
    }

    private void zzN(FieldChar fieldChar) throws Exception {
        switch (fieldChar.getNodeType()) {
            case 22:
                zzZQX zzzqxZzM7 = zzZQX.zzM7(fieldChar.getField().getFieldCode());
                zzZ(zzzqxZzM7.getAddress(), zzzqxZzM7.getSubAddress(), zzzqxZzM7.getTarget(), zzzqxZzM7.getScreenTip(), zzzqxZzM7.zzZfi(), !zzzqxZzM7.zzZfh());
                return;
            case 23:
                return;
            case 24:
                zzZlN();
                return;
            default:
                throw new IllegalStateException("Unknown field char occurred.");
        }
    }

    private static boolean zzO(FieldChar fieldChar) {
        return fieldChar.getFieldType() == 88;
    }

    private int zzYyN() {
        if (this.zzXTK.size() > 0) {
            return this.zzXTK.peek().intValue();
        }
        return 0;
    }

    private void zzth(int i) {
        if (this.zzXTK.size() > 0) {
            this.zzXTK.pop();
        }
        this.zzXTK.push(Integer.valueOf(i));
    }

    public final void zzP(FieldChar fieldChar) throws Exception {
        String str;
        if (!zzYyP() || zzYyO() == fieldChar.getField().getStart()) {
            switch (fieldChar.getNodeType()) {
                case 22:
                    this.zzYEn.push(fieldChar);
                    zzth(zzYyN() + 1);
                    str = "begin";
                    break;
                case 23:
                    this.zzYEn.pop();
                    this.zzYEn.push(fieldChar);
                    zzth(zzYyN() - 1);
                    str = "separate";
                    break;
                case 24:
                    if (this.zzYEn.pop().getNodeType() == 22) {
                        zzth(zzYyN() - 1);
                    }
                    str = "end";
                    break;
                default:
                    throw new IllegalStateException("Field delimiter expected.");
            }
            if (!zzO(fieldChar) || !zzZ(fieldChar)) {
                zzZ(fieldChar, str);
            } else {
                if (zz2(fieldChar.getField())) {
                    return;
                }
                zzN(fieldChar);
            }
        }
    }

    public final FieldChar zzYyO() {
        if (this.zzYEn.size() == 0) {
            return null;
        }
        return this.zzYEn.peek();
    }

    public final boolean zzYyP() {
        return zzZlU() && zzO(zzYyO()) && zzZ(zzYyO()) && zzYyO().getNodeType() == 22;
    }

    public final void zzYyQ() {
        this.zzXTK.pop();
    }

    public final void zzYyR() {
        this.zzXTK.push(0);
    }

    public abstract void zzZ(FieldChar fieldChar, String str) throws Exception;

    public abstract void zzZ(String str, String str2, String str3, String str4, String str5, boolean z) throws Exception;

    public boolean zzZ(FieldChar fieldChar) {
        fieldChar.getFieldType();
        Field field = fieldChar.getField();
        return (field.getStart().getParentNode() != field.getSeparator().getParentNode() || field.getStart().getParentNode() != field.getEnd().getParentNode() || field.getStart().zzZYh().hasRevisions() || com.aspose.words.internal.zzZVR.zzWw(zzZQX.zzM7(field.getFieldCode()).getAddress()) || zz1(field) || zz0(field)) ? false : true;
    }

    public abstract void zzZlN();

    public final boolean zzZlT() {
        return this.zzYEn.size() > 0;
    }

    public final boolean zzZlU() {
        return zzYyN() != 0;
    }

    public final void zzi(Shape shape) throws Exception {
        zzZ(com.aspose.words.internal.zzZVR.zzWH(shape.getHRef()), com.aspose.words.internal.zzZVR.zzWG(shape.getHRef()), shape.getTarget(), shape.getScreenTip(), null, true);
    }
}
