package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYVY extends zzYWI {
    private zzYVX zzXUM;
    private int zzYPC;
    private StringBuilder zzxe;

    private zzYVY(zzYWB zzywb, zzYVX zzyvx) {
        super(zzywb);
        this.zzxe = new StringBuilder();
        this.zzXUM = zzyvx;
    }

    private String getText() {
        while (zzSG(!zzYzD())) {
            zzYzC();
            if (!zzYzD() && !isLocked()) {
                if (next().isComposite()) {
                    CompositeNode compositeNode = (CompositeNode) next();
                    if (!compositeNode.hasChildNodes() && !zzXZ(compositeNode)) {
                        com.aspose.words.internal.zzZNH.zzU(this.zzxe, compositeNode.zzZYp());
                    }
                } else {
                    Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(next(), Inline.class);
                    if (this.zzXUM.zzYzx() || inline == null || !inline.zzYUU()) {
                        com.aspose.words.internal.zzZNH.zzU(this.zzxe, next().getText());
                    }
                }
            }
        }
        return this.zzxe.toString();
    }

    private boolean isLocked() {
        if (this.zzYPC > 0) {
            return true;
        }
        switch (next().getNodeType()) {
            case 22:
            case 23:
            case 24:
                return this.zzXUM.zzYzy() || zzYzz();
            default:
                return false;
        }
    }

    public static String zzJ(zzYWB zzywb) {
        zzYVX zzyvx = new zzYVX();
        zzyvx.zzSD(true);
        return zzZ(zzywb, zzyvx);
    }

    public static String zzK(zzYWB zzywb) {
        return zzZ(zzywb, new zzYVX());
    }

    private boolean zzXZ(Node node) {
        Node node2 = zzZga().zzYA1().getNode();
        if (node.getNodeType() != 8 || !zzYVU.zztq(node2.getNodeType()) || node2.zzYB6() != node) {
            return false;
        }
        Paragraph paragraph = (Paragraph) node;
        return paragraph.isEndOfCell() || paragraph.zzYp0() || paragraph.zzYp1() || paragraph.zzYp2() || paragraph.zzYp3() || paragraph.isEndOfSection() || paragraph.isEndOfHeaderFooter();
    }

    private void zzYzA() {
        int i = this.zzYPC;
        if (i > 0) {
            this.zzYPC = i - 1;
        } else {
            this.zzxe.setLength(0);
        }
    }

    private void zzYzB() {
        this.zzYPC++;
    }

    private void zzYzC() {
        if (this.zzXUM.zzYzy() || zzYzz()) {
            switch (next().getNodeType()) {
                case 22:
                    zzYzB();
                    return;
                case 23:
                    if (zzZOO.zzT((FieldSeparator) next())) {
                        return;
                    }
                    break;
                case 24:
                    FieldEnd fieldEnd = (FieldEnd) next();
                    if (fieldEnd.hasSeparator() && !zzZOO.zzT(fieldEnd)) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            zzYzA();
        }
    }

    private boolean zzYzD() {
        return (next() instanceof Comment) || (next() instanceof Footnote);
    }

    private boolean zzYzz() {
        FieldChar fieldChar = (FieldChar) com.aspose.words.internal.zzZKW.zzZ(next(), FieldChar.class);
        if (fieldChar == null) {
            return false;
        }
        return zzZOO.zzCK(fieldChar.getFieldType());
    }

    public static String zzZ(Node node, boolean z, Node node2, boolean z2, boolean z3) {
        zzYVX zzyvx = new zzYVX();
        zzyvx.zzSD(z3);
        return zzZ(node, z, node2, z2, zzyvx);
    }

    @Override // com.aspose.words.zzYWI
    public final void zztA(int i) {
        if (i != 4 || zzXZ(next())) {
            return;
        }
        com.aspose.words.internal.zzZNH.zzU(this.zzxe, ((CompositeNode) next()).zzZYp());
    }

    public static String zzZ(Node node, boolean z, Node node2, boolean z2, zzYVX zzyvx) {
        return zzZ(new zzYWB(node, z, node2, z2), zzyvx);
    }

    public static String zzZ(zzYWB zzywb, zzYVX zzyvx) {
        return new zzYVY(zzywb, zzyvx).getText();
    }
}
