package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYSB {
    static String[] zzXQC = {"VALUE()>0", "VALUE()>=0", "VALUE()<0"};

    public static String zzK(int i, int i2, boolean z) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            int i3 = i % 3;
            if (i <= 3) {
                com.aspose.words.internal.zzZNH.zzU(sb, "#");
                if (i < 3) {
                    com.aspose.words.internal.zzZNH.zzU(sb, ",");
                    com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzZKN.zzS('#', 3 - i));
                }
            }
            com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzZKN.zzS('0', i3));
            for (int i4 = i - i3; i4 > 0; i4 -= 3) {
                com.aspose.words.internal.zzZNH.zzU(sb, ",");
                com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzZKN.zzS('0', 3));
            }
        } else if (i > 0) {
            com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzZKN.zzS('0', i));
        } else {
            sb.append('#');
        }
        if (i2 > 0) {
            com.aspose.words.internal.zzZNH.zzU(sb, ".");
            com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzZKN.zzS('0', i2));
        }
        return sb.toString();
    }

    public static String zzX(int i, int i2, int i3, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(zzK(i, i3, z));
        sb.append("E+");
        sb.append(i2 > 0 ? com.aspose.words.internal.zzZKN.zzS('0', i2) : "#");
        return sb.toString();
    }

    public static String zzZ(String str, ArrayList<zzYPN> arrayList, zzYPO zzypo) {
        if (arrayList == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strZzX = zzX(arrayList, "VALUE()>0", "VALUE()>=0");
        com.aspose.words.internal.zzZNH.zzU(sb, strZzX != null ? zzZ(strZzX, zzypo) : str);
        com.aspose.words.internal.zzZNH.zzU(sb, ";");
        String strZzX2 = zzX(arrayList, "VALUE()<0");
        com.aspose.words.internal.zzZNH.zzU(sb, strZzX2 != null ? zzZ(strZzX2, zzypo) : str);
        if (strZzX != null && strZzX2 != null) {
            com.aspose.words.internal.zzZNH.zzU(sb, ";");
            com.aspose.words.internal.zzZNH.zzU(sb, str);
        }
        return sb.toString();
    }

    private static String zzX(ArrayList<zzYPN> arrayList, String... strArr) {
        if (arrayList == null) {
            return null;
        }
        for (zzYPN zzypn : arrayList) {
            for (String str : strArr) {
                if (com.aspose.words.internal.zzZYD.zzi(zzypn.zzYtW(), str)) {
                    return zzypn.zzYtX();
                }
            }
        }
        return null;
    }

    private static String zzZ(String str, zzYPO zzypo) {
        zzYQT zzyqt = (zzYQT) com.aspose.words.internal.zzZKW.zzZ(zzypo.zzYh(str, null), zzYQT.class);
        return zzyqt != null ? zzyqt.getFormat() : "";
    }
}
