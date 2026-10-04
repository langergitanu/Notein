package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzS1 extends zzS2 {
    public zzS1(zzNQ zznq, String str, String str2) {
        super(zznq, str, "*=", str2);
    }

    @Override // com.aspose.words.zzQB
    public final boolean zzZ(zzZBM zzzbm, int i) {
        String strZzKM;
        if ((zzZXq().zzZVP() && !zzZXq().isEmpty()) || getValue().length() == 0 || (strZzKM = zzzbm.zzKM(zzZXp())) == null) {
            return false;
        }
        return com.aspose.words.internal.zzZYD.zzX(strZzKM, getValue(), zzMD.zzSf(zzZXp()));
    }
}
