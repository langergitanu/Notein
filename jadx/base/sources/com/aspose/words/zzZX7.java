package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZX7 extends zzYUY {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("del", "ins");
    private zzZYI zzYNI;

    public zzZX7(zzYVB zzyvb, zzZWS zzzws, zzZXA zzzxa, zzZYI zzzyi) {
        super(zzyvb, zzzws, zzzxa);
        this.zzYNI = zzzyi;
    }

    public static void zzM(zzYVB zzyvb) throws Exception {
        zzYUX.zzY(zzZWW.zzK(zzyvb));
    }

    public static void zzN(zzYVB zzyvb) throws Exception {
        zzYUX.zzZ(zzZWW.zzK(zzyvb));
    }

    @Override // com.aspose.words.zzYUY
    public final boolean zzZ(String str, zzZAB zzzab) throws Exception {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            this.zzYNI.zzZ(zzZsE(), (zzYEF) zzzab, true);
            return true;
        }
        if (iZzTP != 1) {
            return false;
        }
        this.zzYNI.zzZ(zzZsE(), (zzYEF) zzzab, false);
        return true;
    }
}
