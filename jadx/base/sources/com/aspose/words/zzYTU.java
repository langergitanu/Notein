package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYTU {
    private static char[] zzXSd = {1632, 1633, 1634, 1635, 1636, 1637, 1638, 1639, 1640, 1641};
    private static char[] zzXSc = {1776, 1777, 1778, 1779, 1780, 1781, 1782, 1783, 1784, 1785};
    private static char[] zzXSe = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    private static char[] zzT(int i, boolean z, int i2) {
        if (i == 1) {
            return zzXSd;
        }
        if (i == 2) {
            return zzXSc;
        }
        if (i == 3 && z) {
            if (com.aspose.words.internal.zzBZ.zzZY(i2, 41) || com.aspose.words.internal.zzBZ.zzZY(i2, 32)) {
                return zzXSc;
            }
            if (com.aspose.words.internal.zzBZ.zzZY(i2, 1)) {
                return zzXSd;
            }
        }
        return zzXSe;
    }

    private static boolean zzU(int i, boolean z, int i2) {
        if (i == 0 || com.aspose.words.internal.zzBZ.zzZY(i2, 13)) {
            return false;
        }
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 && z) {
            return com.aspose.words.internal.zzBZ.zzZY(i2, 41) || com.aspose.words.internal.zzBZ.zzZY(i2, 32) || com.aspose.words.internal.zzBZ.zzZY(i2, 1);
        }
        return false;
    }

    public static boolean zzV(int i, boolean z, int i2) {
        return zzU(i, z, i2);
    }

    private static char zzY(char c, char[] cArr) {
        return (c < '0' || c > '9') ? c : cArr[c - '0'];
    }

    public static String zzZ(String str, int i, boolean z, int i2) {
        char[] cArrZzT = zzT(i, z, i2);
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (com.aspose.words.internal.zzUX.zzQ(cCharAt)) {
                cCharAt = zzY(cCharAt, cArrZzT);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }
}
