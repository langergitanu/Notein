package com.aspose.words;

import com.aspose.words.net.System.OverflowException;

/* JADX INFO: loaded from: classes6.dex */
final class zzYTS {
    private static int zzGJ(String str) {
        int i;
        try {
            i = com.aspose.words.internal.zzJB.parseInt(str);
        } catch (OverflowException | NumberFormatException unused) {
        }
        if (i >= 0) {
            return i;
        }
        return -1;
    }

    public static zzYTT zzGK(String str) {
        com.aspose.words.internal.zzZNT zzzntZzZU = com.aspose.words.internal.zzZNR.zzZU(str, "^[0]*([0-9]+)(?:\\.[0]*([0-9]+))?$");
        if (!zzzntZzZU.zzhL()) {
            return null;
        }
        zzzntZzZU.zzhJ().getCount();
        int iZzGJ = zzGJ(zzzntZzZU.zzhJ().zzQx(1).getValue());
        if (iZzGJ < 0) {
            return null;
        }
        String strOooO00o = OooO0O0.OooO00o(zzzntZzZU, 2);
        if (!com.aspose.words.internal.zzZYD.zzXk(strOooO00o)) {
            return new zzYTT(iZzGJ);
        }
        int iZzGJ2 = zzGJ(strOooO00o);
        if (iZzGJ2 >= 0) {
            return new zzYTT(iZzGJ, iZzGJ2);
        }
        return null;
    }
}
