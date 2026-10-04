package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZ02 extends zzZ0J {
    public final int getJustification() {
        return ((Integer) zzPj(15010)).intValue();
    }

    @Override // com.aspose.words.zzZ0J
    public final int getMathObjectType() {
        return 1;
    }

    public final void setJustification(int i) {
        zzX(15010, Integer.valueOf(i), i != 1);
    }

    @Override // com.aspose.words.zzZ0J
    public final boolean zzT(Node node) {
        return node.getNodeType() == 35 && ((OfficeMath) node).zzZsL().getMathObjectType() == 0;
    }
}
