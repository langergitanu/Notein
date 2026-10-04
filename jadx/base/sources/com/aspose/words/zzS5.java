package com.aspose.words;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
final class zzS5 extends zzS2 {
    public zzS5(zzNQ zznq, String str, String str2) {
        super(zznq, str, "|=", str2);
    }

    @Override // com.aspose.words.zzQB
    public final boolean zzZ(zzZBM zzzbm, int i) {
        String strZzKM;
        if ((zzZXq().zzZVP() && !zzZXq().isEmpty()) || (strZzKM = zzzbm.zzKM(zzZXp())) == null) {
            return false;
        }
        if (zzMD.zzSf(zzZXp())) {
            if (com.aspose.words.internal.zzZYD.zzi(strZzKM, getValue())) {
                return true;
            }
        } else if (com.aspose.words.internal.zzZKN.equals(strZzKM, getValue())) {
            return true;
        }
        new StringBuilder();
        String string = Bundle.getString(getValue());
        if (strZzKM.length() < string.length()) {
            return false;
        }
        String strSubstring = strZzKM.substring(0, string.length());
        return zzMD.zzSf(zzZXp()) ? com.aspose.words.internal.zzZYD.zzi(strSubstring, string) : com.aspose.words.internal.zzZKN.equals(strSubstring, string);
    }
}
