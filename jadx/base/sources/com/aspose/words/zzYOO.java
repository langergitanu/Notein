package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYOO extends zzYL4 {
    private zzU8 zzZGE;

    public zzYOO(zzU8 zzu8) {
        this.zzZGE = zzu8;
    }

    @Override // com.aspose.words.zzYL4
    public final void zzZ(Node node, Node node2) throws Exception {
        OfficeMath officeMath = (OfficeMath) node;
        OfficeMath officeMath2 = (OfficeMath) node2;
        zzU6.zzSU(com.aspose.words.internal.zzZKN.format("\n{{OfficeMath}} '{0}' -> '{1}'", officeMath, officeMath2));
        if (com.aspose.words.internal.zzZKN.equals(officeMath.getText(), officeMath2.getText())) {
            return;
        }
        zzU4.zzY(officeMath, officeMath2, this.zzZGE);
    }
}
