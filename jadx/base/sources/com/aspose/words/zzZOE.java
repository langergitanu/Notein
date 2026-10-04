package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZOE implements zzZ9P {
    private static int zzYzN = 7;
    private int zzTL;
    private com.aspose.words.internal.zzD4[] zzYzO;
    private Object[] zzYzP;
    private com.aspose.words.internal.zzD4 zzYzQ;
    private com.aspose.words.internal.zzD3<zzZNP> zzYzR;
    private com.aspose.words.internal.zzZOX zzZtg;

    public zzZOE(zzZRA zzzra, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        int i = zzYzN;
        this.zzYzP = new Object[i];
        this.zzYzO = new com.aspose.words.internal.zzD4[i];
        this.zzZtg = zzzox;
        zzZ(0, zzzra.zzYGE.zzXAp, "PlcfFldMom");
        zzZ(2, zzzra.zzYGE.zzXAo, "PlcfFldHdr");
        zzZ(1, zzzra.zzYGE.zzXAn, "PlcfFldFtn");
        zzZ(3, zzzra.zzYGE.zzXAm, "PlcfFldAtn");
        zzZ(4, zzzra.zzYGE.zzXzT, "PlcfFldEdn");
        zzZ(5, zzzra.zzYGE.zzXzK, "PlcfFldTxbx");
        zzZ(6, zzzra.zzYGE.zzXzI, "PlcfFldHdrTxtbx");
    }

    private void zzZ(int i, zzZRG zzzrg, String str) throws Exception {
        com.aspose.words.internal.zzD3<zzZNP> zzd3 = new com.aspose.words.internal.zzD3<>();
        this.zzYzR = zzd3;
        this.zzYzP[i] = zzd3;
        com.aspose.words.internal.zzD4 zzd4 = new com.aspose.words.internal.zzD4();
        this.zzYzQ = zzd4;
        this.zzYzO[i] = zzd4;
        this.zzTL = 0;
        this.zzZtg.zzq().zzU(zzzrg.zzYHK, 0);
        zzYLK.zzZ(this.zzZtg, zzzrg.zzYHJ, 2, this, str);
    }

    public final zzZNP zzXA(int i, int i2) {
        return (zzZNP) ((com.aspose.words.internal.zzD3) this.zzYzP[i]).get(i2);
    }

    public final int zzXz(int i, int i2) {
        int i3 = this.zzYzO[i].get(i2);
        if (com.aspose.words.internal.zzD4.zzWm(i3)) {
            return -1;
        }
        return i3;
    }

    @Override // com.aspose.words.zzZ9P
    public final void zzY(com.aspose.words.internal.zzZOX zzzox, int i, int i2) throws Exception {
        this.zzYzR.set(i, new zzZNP(zzzox));
        com.aspose.words.internal.zzD4 zzd4 = this.zzYzQ;
        int i3 = this.zzTL;
        this.zzTL = i3 + 1;
        zzd4.set(i, i3);
    }
}
