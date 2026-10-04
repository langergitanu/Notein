package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZR4 {
    private FieldEnd zzYGf;
    private FieldSeparator zzYGg;
    private FieldStart zzYGh;

    public zzZR4() {
    }

    public static zzZR4 zzV(FieldChar fieldChar) {
        zzZR4 zzzr4 = new zzZR4();
        switch (fieldChar.getNodeType()) {
            case 22:
                return zzZ(zzzr4, fieldChar, true);
            case 23:
                return zzZ(zzZ(zzzr4, fieldChar, true), fieldChar, false);
            case 24:
                return zzZ(zzzr4, fieldChar, false);
            default:
                throw zzZfZ();
        }
    }

    public static zzZR4 zzW(FieldChar fieldChar) {
        zzZR4 zzzr4ZzV = zzV(fieldChar);
        if (zzzr4ZzV.zzYGf.hasSeparator() == (zzzr4ZzV.zzYGg != null)) {
            return zzzr4ZzV;
        }
        throw zzZfZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[LOOP:0: B:3:0x0011->B:29:0x006c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071 A[EDGE_INSN: B:34:0x0071->B:30:0x0071 BREAK  A[LOOP:0: B:3:0x0011->B:29:0x006c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String zzW1(boolean z) {
        boolean z2;
        StringBuilder sb = new StringBuilder();
        FieldChar fieldCharZzZgr = zzZgr();
        int i = 0;
        for (Node nextSibling = this.zzYGh.getNextSibling(); nextSibling != null && nextSibling != fieldCharZzZgr; nextSibling = nextSibling.getNextSibling()) {
            int nodeType = nextSibling.getNodeType();
            if (nodeType != 21) {
                if (nodeType == 22) {
                    if (!zzZOO.zzCK(((FieldStart) nextSibling).getFieldType())) {
                        if (this.zzYGh.getFieldType() != 67 && i == 0) {
                            z2 = true;
                        }
                        if (!z2) {
                            break;
                        }
                    } else {
                        i++;
                    }
                } else if (nodeType == 24 && zzZOO.zzCK(((FieldEnd) nextSibling).getFieldType())) {
                    i--;
                }
            } else if (i == 0 && (z || !((Run) nextSibling).zzYUU())) {
                com.aspose.words.internal.zzZNH.zzU(sb, nextSibling.getText());
            }
            z2 = false;
            if (!z2) {
            }
        }
        return sb.toString();
    }

    public static zzZR4 zzZ(zzZR4 zzzr4, FieldChar fieldChar, boolean z) {
        boolean z2;
        boolean z3 = fieldChar.getNodeType() == 23;
        zzZPY zzzpy = new zzZPY(z, z3);
        if (z3) {
            zzzr4.zzYGg = null;
        }
        zzZYT zzzytZzp = z ? zzZYT.zzp(fieldChar) : zzZYT.zzq(fieldChar);
        while (true) {
            Node node = zzzytZzp.getNode();
            switch (node.getNodeType()) {
                case 22:
                    if (zzzpy.zzZd2()) {
                        FieldStart fieldStart = (FieldStart) node;
                        zzzr4.zzYGh = fieldStart;
                        zzZ(fieldStart, fieldChar);
                        if (!z) {
                            return zzzr4;
                        }
                    }
                    break;
                case 23:
                    if (zzzpy.zzZd0()) {
                        if (zzzr4.zzYGg != null) {
                            throw zzZfZ();
                        }
                        FieldSeparator fieldSeparator = (FieldSeparator) node;
                        zzzr4.zzYGg = fieldSeparator;
                        zzZ(fieldSeparator, fieldChar);
                    }
                    break;
                case 24:
                    if (zzzpy.zzZd1()) {
                        FieldEnd fieldEnd = (FieldEnd) node;
                        zzzr4.zzYGf = fieldEnd;
                        zzZ(fieldEnd, fieldChar);
                        if (z) {
                            return zzzr4;
                        }
                    }
                    break;
            }
            while (true) {
                z2 = z;
                if (!zzzytZzp.zzZ(null, z2, true, true, false, false)) {
                    throw zzZfZ();
                }
                if (zzzytZzp.getNode() != node) {
                    break;
                }
                z = z2;
            }
            z = z2;
        }
    }

    private static IllegalStateException zzZfZ() {
        return new IllegalStateException("Invalid document model. Operation can not be completed.");
    }

    public final FieldEnd getEnd() {
        return this.zzYGf;
    }

    public final String getFieldCode(boolean z) {
        zzYVX zzyvx = new zzYVX();
        zzyvx.zzSC(this.zzYGh.getFont().getHidden() || this.zzYGh.getFieldType() == 88);
        zzyvx.zzSD(!z);
        return zzYVY.zzZ((Node) this.zzYGh, false, (Node) zzZgr(), false, zzyvx);
    }

    public final int getFieldType() {
        return this.zzYGh.getFieldType();
    }

    public final FieldSeparator getSeparator() {
        return this.zzYGg;
    }

    public final FieldStart getStart() {
        return this.zzYGh;
    }

    public final boolean hasSeparator() {
        return this.zzYGg != null;
    }

    public final void normalizeFieldTypes() {
        zzDJ(zzZg2());
    }

    public final void zzDJ(int i) {
        this.zzYGh.zzDJ(i);
        this.zzYGf.zzDJ(i);
        FieldSeparator fieldSeparator = this.zzYGg;
        if (fieldSeparator != null) {
            fieldSeparator.zzDJ(i);
        }
    }

    public final void zzVZ(boolean z) {
        this.zzYGh.isDirty(z);
        this.zzYGf.isDirty(z);
        FieldSeparator fieldSeparator = this.zzYGg;
        if (fieldSeparator != null) {
            fieldSeparator.isDirty(z);
        }
    }

    public final void zzW0(boolean z) {
        this.zzYGh.isLocked(z);
        this.zzYGf.isLocked(z);
        FieldSeparator fieldSeparator = this.zzYGg;
        if (fieldSeparator != null) {
            fieldSeparator.isLocked(z);
        }
    }

    public final void zzX(FieldSeparator fieldSeparator) {
        this.zzYGg = fieldSeparator;
    }

    public final void zzY(FieldStart fieldStart) {
        this.zzYGh = fieldStart;
    }

    public final void zzZg0() {
        FieldSeparator fieldSeparator;
        FieldSeparator fieldSeparator2;
        boolean z = true;
        zzVZ(this.zzYGh.isDirty() || this.zzYGf.isDirty() || ((fieldSeparator2 = this.zzYGg) != null && fieldSeparator2.isDirty()));
        if (!this.zzYGh.isLocked() && !this.zzYGf.isLocked() && ((fieldSeparator = this.zzYGg) == null || !fieldSeparator.isLocked())) {
            z = false;
        }
        zzW0(z);
    }

    public final void zzZg1() {
        FieldStart fieldStart = this.zzYGh;
        if (fieldStart != null) {
            fieldStart.remove();
        }
        FieldSeparator fieldSeparator = this.zzYGg;
        if (fieldSeparator != null) {
            fieldSeparator.remove();
        }
        FieldEnd fieldEnd = this.zzYGf;
        if (fieldEnd != null) {
            fieldEnd.remove();
        }
    }

    public final int zzZg2() {
        return zzZOO.zzLE(this.zzYGh.getParentNode() != zzZgr().getParentNode() ? getFieldCode(true) : zzW1(this.zzYGh.zzYUU()));
    }

    public final FieldChar zzZgr() {
        FieldSeparator fieldSeparator = this.zzYGg;
        return fieldSeparator != null ? fieldSeparator : this.zzYGf;
    }

    public zzZR4(FieldStart fieldStart, FieldSeparator fieldSeparator, FieldEnd fieldEnd) {
        this.zzYGh = fieldStart;
        this.zzYGg = fieldSeparator;
        this.zzYGf = fieldEnd;
    }

    public final void zzX(FieldEnd fieldEnd) {
        this.zzYGf = fieldEnd;
    }

    private static void zzZ(FieldChar fieldChar, FieldChar fieldChar2) {
        if (fieldChar.getFieldType() != fieldChar2.getFieldType()) {
            throw zzZfZ();
        }
    }
}
