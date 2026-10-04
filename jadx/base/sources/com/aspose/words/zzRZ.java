package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzRZ extends zzS2 {
    public zzRZ(zzNQ zznq, String str, String str2) {
        super(zznq, str, "=", str2);
    }

    @Override // com.aspose.words.zzQB
    public final boolean zzZ(zzZBM zzzbm, int i) {
        String strZzKM;
        if ((!zzZXq().zzZVP() || zzZXq().isEmpty()) && (strZzKM = zzzbm.zzKM(zzZXp())) != null) {
            return zzMD.zzSf(zzZXp()) ? com.aspose.words.internal.zzZYD.zzi(getValue(), strZzKM) : com.aspose.words.internal.zzZKN.equals(getValue(), strZzKM);
        }
        return false;
    }
}
