package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYW3 extends zzZPH {
    private zzYWB zzYCn;

    public zzYW3(Field field, zzYWB zzywb) {
        super(field);
        this.zzYCn = zzywb;
    }

    private Paragraph zzYzO() {
        if (getField().getStart().getParentNode() == getField().getEnd().getParentNode() || getField().getEnd().getParentNode().getNodeType() != 8) {
            return null;
        }
        Paragraph paragraph = (Paragraph) getField().getEnd().getParentNode();
        Paragraph paragraph2 = (Paragraph) paragraph.deepClone(false);
        paragraph2.zzY(paragraph.getFirstChild(), null, null);
        paragraph.zzYC(paragraph2);
        return paragraph;
    }

    private void zzZg(Paragraph paragraph) {
        if (paragraph == null) {
            return;
        }
        Paragraph paragraph2 = (Paragraph) getField().getEnd().getParentNode();
        paragraph.zzY(paragraph2.getFirstChild(), null, null);
        paragraph.zzZ(paragraph2.zzZYj());
        paragraph.zzC(paragraph2.zzYp5());
        paragraph2.remove();
    }

    @Override // com.aspose.words.zzZPH
    public final void zzZcw() throws Exception {
        zzYWB zzywb = this.zzYCn;
        if (zzywb == null || zzywb.zz13() || this.zzYCn.isEmpty()) {
            return;
        }
        zzTU zztu = new zzTU(new zzZP9(this.zzYCn, zzZP8.zzO(zzZP8.zzO(0, 2, !zzZOO.zzCw(getField().getType())), 1, !zzZOO.zzCx(getField().getType()))), new zzUP(), getField().zzZgk());
        Paragraph paragraphZzYzO = zzYzO();
        zzYWJ.zzZ(this.zzYCn, (Node) getField().getEnd(), (zzZA2) zztu, (zzZA3) null, false, 23);
        zzZg(paragraphZzYzO);
    }
}
