package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1R extends zzYVF {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("annotation");

    public zzY1R(zzY13 zzy13) {
        super(zzy13);
    }

    @Override // com.aspose.words.zzYVF
    public final boolean zzZ(String str, zzYVB zzyvb, zzWP zzwp) throws Exception {
        if (zzUR.zzTP(str) != 0) {
            return false;
        }
        zzY1U.zzZ(zzwp, zzyvb);
        return true;
    }
}
