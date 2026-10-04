package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY0L {
    public static com.aspose.words.internal.zzG zzZ(ArrayList<com.aspose.words.internal.zzZG[]> arrayList, com.aspose.words.internal.zzOU zzou, com.aspose.words.internal.zzPY zzpy) {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        for (int i = 0; i < arrayList.size(); i++) {
            for (com.aspose.words.internal.zzZG zzzg : arrayList.get(i)) {
                zzzg.zzX(zzou);
                zzzg.zzY(zzpy);
                zzg.zzX(zzzg);
            }
        }
        return zzg;
    }

    public static long zzZ(String str, com.aspose.words.internal.zzPM zzpm, com.aspose.words.internal.zzGQ zzgq, boolean z) throws Exception {
        com.aspose.words.internal.zzZXH zzzxhZzZ;
        com.aspose.words.internal.zzYB zzyb = new com.aspose.words.internal.zzYB(str, zzpm);
        float f = 0.0f;
        float fZzPg = 0.0f;
        int i = 1;
        while (zzyb.moveNext()) {
            com.aspose.words.internal.zzPM zzpm2 = (!zzyb.zzr6() || (zzzxhZzZ = zzgq.zzZ(zzpm.zzPl(), zzyb.getText().charAt(0), true)) == null) ? zzpm : new com.aspose.words.internal.zzPM(zzpm.zzPg(), zzpm.zzPk(), zzzxhZzZ);
            for (int i2 = 0; i2 < zzyb.getText().length(); i2++) {
                char cCharAt = zzyb.getText().charAt(i2);
                if (cCharAt == '\n') {
                    i++;
                    fZzPg = 0.0f;
                } else {
                    fZzPg += z ? zzpm2.zzPg() : zzpm2.zzY7(cCharAt);
                    if (f < fZzPg) {
                        f = fZzPg;
                    }
                }
            }
        }
        float fZzPf = zzpm.zzPf();
        if (z) {
            fZzPf += zzpm.zzPg();
        }
        return com.aspose.words.internal.zzZPW.zzG(f, i * fZzPf);
    }
}
