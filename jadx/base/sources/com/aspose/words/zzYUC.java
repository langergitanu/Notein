package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYUC {
    public static void zzZ(String str, StyleCollection styleCollection, boolean z, boolean z2, boolean z3, Style style) {
        int iZzAP;
        com.aspose.words.internal.zzZ4.zzU(str, "name");
        com.aspose.words.internal.zzZ4.zzY((Object) styleCollection, "styles");
        com.aspose.words.internal.zzZ4.zzY((Object) style, "style");
        int i = StyleIdentifier.USER;
        if (z) {
            iZzAP = 4094;
        } else {
            iZzAP = zzY8T.zzAP(str);
            if (z2 && iZzAP == 4094) {
                iZzAP = zzY8T.zzAP(str.toLowerCase());
            }
        }
        if (iZzAP != 4094) {
            str = zzY8T.zzAO(str);
        }
        if (!styleCollection.contains(iZzAP)) {
            i = iZzAP;
        } else if (z3) {
            Style styleZzZ7 = styleCollection.zzZ7(iZzAP, false);
            if (com.aspose.words.internal.zzZKN.equals(styleZzZ7.getName(), str) && styleZzZ7.getType() == 1 && style.getType() == 2) {
                str = com.aspose.words.internal.zzZKN.zzZI(str, " Char");
            } else {
                styleCollection.zzs(styleZzZ7);
                i = iZzAP;
            }
        }
        int iZzkH = zzY8O.zzkH(i);
        if (iZzkH == 12287) {
            iZzkH = styleCollection.zzY30();
        }
        style.zzZb(i, false);
        style.zz1(str, false);
        style.zzZc(iZzkH, false);
        style.zzl4(iZzkH);
    }
}
