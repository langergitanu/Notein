package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ0B extends zzZ0J {
    @Override // com.aspose.words.zzZ0J
    public final int getMathObjectType() {
        return 10;
    }

    @Override // com.aspose.words.zzZ0J
    public final boolean zzT(Node node) {
        if (node.getNodeType() != 35) {
            return false;
        }
        zzZ0J zzz0jZzZsL = ((OfficeMath) node).zzZsL();
        return zzz0jZzZsL.getMathObjectType() == 12 || zzz0jZzZsL.getMathObjectType() == 11;
    }

    public final int zzYEN() {
        return ((Integer) zzPj(15460)).intValue();
    }

    public final void zzux(int i) {
        zzX(15460, Integer.valueOf(i), i != 0);
    }
}
