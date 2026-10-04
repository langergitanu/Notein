package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzS3 extends zzS2 {
    public zzS3(zzNQ zznq, String str, String str2) {
        super(zznq, str, "^=", str2);
    }

    @Override // com.aspose.words.zzQB
    public final boolean zzZ(zzZBM zzzbm, int i) {
        String strZzKM;
        if ((zzZXq().zzZVP() && !zzZXq().isEmpty()) || getValue().length() == 0 || (strZzKM = zzzbm.zzKM(zzZXp())) == null || strZzKM.length() < getValue().length()) {
            return false;
        }
        String strSubstring = strZzKM.substring(0, getValue().length());
        return zzMD.zzSf(zzZXp()) ? com.aspose.words.internal.zzZYD.zzi(strSubstring, getValue()) : com.aspose.words.internal.zzZKN.equals(strSubstring, getValue());
    }
}
