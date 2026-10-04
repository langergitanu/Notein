package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYZY extends zzZ0J {
    @Override // com.aspose.words.zzZ0J
    public final int getMathObjectType() {
        return 28;
    }

    public final void zzSS(boolean z) {
        zzX(15550, Boolean.valueOf(z), z);
    }

    @Override // com.aspose.words.zzZ0J
    public final boolean zzT(Node node) {
        if (super.zzT(node)) {
            return true;
        }
        if (node.getNodeType() != 35) {
            return false;
        }
        int mathObjectType = ((OfficeMath) node).zzZsL().getMathObjectType();
        return mathObjectType == 24 || mathObjectType == 25;
    }
}
