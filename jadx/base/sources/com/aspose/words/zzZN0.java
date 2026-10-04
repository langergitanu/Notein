package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZN0 extends zzYL4 {
    private zzU8 zzZGE;

    public zzZN0(zzU8 zzu8) {
        this.zzZGE = zzu8;
    }

    @Override // com.aspose.words.zzYL4
    public final void zzZ(Node node, Node node2) throws Exception {
        Footnote footnote = (Footnote) node;
        Footnote footnote2 = (Footnote) node2;
        zzU6.zzSU(com.aspose.words.internal.zzZKN.format("\n{{Footnote}} '{0}' -> '{1}'", footnote, footnote2));
        if (!zzZ(footnote, footnote2)) {
            zzU4.zzY(footnote, footnote2, this.zzZGE);
        } else {
            if (this.zzZGE.zzZup.getIgnoreFootnotes()) {
                return;
            }
            zzY9D.zzU(footnote, footnote2, this.zzZGE);
        }
    }

    private static boolean zzZ(Footnote footnote, Footnote footnote2) {
        return footnote.getFootnoteType() == footnote2.getFootnoteType() && footnote.isAuto() == footnote2.isAuto() && com.aspose.words.internal.zzZKN.equals(footnote.getReferenceMark(), footnote2.getReferenceMark());
    }
}
