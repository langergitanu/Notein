package com.aspose.words;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
final class zzUM implements Comparator<zzUN> {
    private static int zzZ(zzUN zzun, zzUN zzun2) {
        try {
            if (zzun == null || zzun2 == null) {
                throw new NullPointerException();
            }
            int iZzZ7 = com.aspose.words.internal.zzZKR.zzZ7(zzun.zzZZH(), zzun2.zzZZH());
            if (iZzZ7 != 0) {
                return iZzZ7;
            }
            zzYAQ zzyaqZzZZC = ((zzUI) zzun.zza9()).zzZZC();
            zzYAQ zzyaqZzZZC2 = ((zzUI) zzun2.zza9()).zzZZC();
            if (!zzyaqZzZZC.zzY60() && zzyaqZzZZC2.zzY60()) {
                return -1;
            }
            if (!zzyaqZzZZC.zzY60() || zzyaqZzZZC2.zzY60()) {
                return com.aspose.words.internal.zzZKR.zzZ7(zzun.zzZZG(), zzun2.zzZZG());
            }
            return 1;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzUN zzun, zzUN zzun2) {
        return zzZ(zzun, zzun2);
    }
}
