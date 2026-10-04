package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzRY extends zzS2 {
    public zzRY(zzNQ zznq, String str, String str2) {
        super(zznq, str, "~=", str2);
    }

    @Override // com.aspose.words.zzQB
    public final boolean zzZ(zzZBM zzzbm, int i) {
        String strZzKM;
        if ((zzZXq().zzZVP() && !zzZXq().isEmpty()) || (strZzKM = zzzbm.zzKM(zzZXp())) == null) {
            return false;
        }
        String[] strArrZzS8 = zzL5.zzS8(strZzKM);
        for (int i2 = 0; i2 < strArrZzS8.length; i2++) {
            if (zzMD.zzSf(zzZXp())) {
                if (com.aspose.words.internal.zzZYD.zzi(getValue(), strArrZzS8[i2])) {
                    return true;
                }
            } else if (com.aspose.words.internal.zzZKN.equals(getValue(), strArrZzS8[i2])) {
                return true;
            }
        }
        return false;
    }
}
