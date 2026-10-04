package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY extends zzYL4 {
    private zzU8 zzZGE;

    public zzY(zzU8 zzu8) {
        this.zzZGE = zzu8;
    }

    @Override // com.aspose.words.zzYL4
    public final void zzZ(Node node, Node node2) throws Exception {
        AbsolutePositionTab absolutePositionTab = (AbsolutePositionTab) node;
        AbsolutePositionTab absolutePositionTab2 = (AbsolutePositionTab) node2;
        zzU6.zzSU(com.aspose.words.internal.zzZKN.format("\n{{AbsolutePositionTab}} '{0}' -> '{1}'", absolutePositionTab, absolutePositionTab2));
        if (absolutePositionTab.getAlignment() == absolutePositionTab2.getAlignment() && absolutePositionTab.zzc0() == absolutePositionTab2.zzc0() && absolutePositionTab.zzc1() == absolutePositionTab2.zzc1()) {
            return;
        }
        zzU4.zzY(absolutePositionTab, absolutePositionTab2, this.zzZGE);
    }
}
