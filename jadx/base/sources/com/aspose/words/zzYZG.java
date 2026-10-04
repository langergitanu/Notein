package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYZG implements zzZB1 {
    private Paragraph zzXZX;
    private Paragraph zzXZY;
    private Iterable<Node> zzYjv;

    public zzYZG(Iterable<Node> iterable, Paragraph paragraph, Paragraph paragraph2) {
        this.zzYjv = iterable;
        this.zzXZY = paragraph;
        this.zzXZX = paragraph2;
    }

    @Override // com.aspose.words.zzZB1
    public final void zzZ(zzYWB zzywb) throws Exception {
        zzYWO.zzZ(zzywb, (Paragraph) zzywb.zzYA2().getNode().getAncestor(8), (Paragraph) zzywb.zzYA1().getNode().getAncestor(8), new zzYOK(this.zzYjv, this.zzXZY), this.zzXZX);
    }
}
