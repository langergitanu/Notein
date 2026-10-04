package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ08 extends zzZ0J {
    @Override // com.aspose.words.zzZ0J
    public final int getMathObjectType() {
        return 17;
    }

    @Override // com.aspose.words.zzZ0J
    public final boolean zzT(Node node) {
        if (super.zzT(node)) {
            return true;
        }
        return node.getNodeType() == 35 && ((OfficeMath) node).zzZsL().getMathObjectType() == 16;
    }
}
