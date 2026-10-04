package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ07 extends zzZ0J {
    private zzZ0N zzY0W = new zzZ0N();

    @Override // com.aspose.words.zzZ0J
    public final int getMathObjectType() {
        return 19;
    }

    @Override // com.aspose.words.zzZ0J
    public final boolean zzT(Node node) {
        return node.getNodeType() == 35 && ((OfficeMath) node).zzZsL().getMathObjectType() == 20;
    }

    public final void zzT2(boolean z) {
        zzX(15470, Boolean.valueOf(z), z);
    }

    public final zzZ0N zzYEI() {
        return this.zzY0W;
    }

    public final int zzYEJ() {
        return ((Integer) zzPj(15480)).intValue();
    }

    public final int zzYEK() {
        return ((Integer) zzPj(15490)).intValue();
    }

    public final int zzYEL() {
        return ((Integer) zzPj(15500)).intValue();
    }

    public final int zzYF0() {
        return ((Integer) zzPj(15260)).intValue();
    }

    public final int zzYF1() {
        return ((Integer) zzPj(15270)).intValue();
    }

    @Override // com.aspose.words.zzZS
    public final zzZS zzbn() {
        zzZ07 zzz07 = (zzZ07) super.zzbn();
        zzz07.zzY0W = this.zzY0W.zzYFr();
        return zzz07;
    }

    public final void zzuA(int i) {
        zzX(15270, Integer.valueOf(i), i != 0);
    }

    public final void zzuB(int i) {
        zzX(15230, Integer.valueOf(i), i != 2);
    }

    public final void zzut(int i) {
        if (i > 31680) {
            i = 31680;
        }
        zzX(15480, Integer.valueOf(i), i != 0);
    }

    public final void zzuu(int i) {
        zzX(15490, Integer.valueOf(i), i != 0);
    }

    public final void zzuv(int i) {
        zzX(15500, Integer.valueOf(i), i != 0);
    }

    public final void zzuz(int i) {
        zzX(15260, Integer.valueOf(i), i != 0);
    }
}
