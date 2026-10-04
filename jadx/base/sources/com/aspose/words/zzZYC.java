package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYC extends zzYVF {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("tcPrChange", "cellIns", "cellDel");

    public zzZYC(zzZX0 zzzx0) {
        super(zzzx0);
    }

    @Override // com.aspose.words.zzYVF
    public final boolean zzZ(String str, zzYVB zzyvb, zzWP zzwp) throws Exception {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            zzZYI.zzZ(zzyvb, zzwp);
            return true;
        }
        if (iZzTP == 1) {
            zzZYI.zzZ(zzyvb, zzwp, 0);
            return true;
        }
        if (iZzTP != 2) {
            return false;
        }
        zzZYI.zzZ(zzyvb, zzwp, 1);
        return true;
    }
}
