package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ04 extends zzZ0J {
    public final char getCharacter() {
        return ((Character) zzPj(15045)).charValue();
    }

    @Override // com.aspose.words.zzZ0J
    public final int getMathObjectType() {
        return 21;
    }

    public final void setCharacter(char c) {
        zzX(15045, Character.valueOf(c), c != 8747);
    }

    public final void zzSZ(boolean z) {
        zzX(15530, Boolean.valueOf(z), z);
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

    public final void zzT0(boolean z) {
        zzX(15520, Boolean.valueOf(z), z);
    }

    public final void zzT3(boolean z) {
        zzX(15210, Boolean.valueOf(z), z);
    }

    public final boolean zzYED() {
        return ((Boolean) zzPj(15530)).booleanValue();
    }

    public final boolean zzYEE() {
        return ((Boolean) zzPj(15520)).booleanValue();
    }

    public final int zzYEF() {
        return ((Integer) zzPj(15510)).intValue();
    }

    public final boolean zzYEO() {
        return ((Boolean) zzPj(15210)).booleanValue();
    }

    public final void zzus(int i) {
        zzX(15510, Integer.valueOf(i), i != -1);
    }
}
