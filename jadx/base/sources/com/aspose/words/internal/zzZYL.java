package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZYL {
    public static boolean zzY(zzZYM zzzym, String str) {
        if (str.length() > zzzym.getLength()) {
            return false;
        }
        char[] cArrZzr5 = zzzym.zzr5();
        int startIndex = (zzzym.getStartIndex() + zzzym.getLength()) - str.length();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != cArrZzr5[i + startIndex]) {
                return false;
            }
        }
        return true;
    }

    public static int zzZ(zzZYM zzzym, char c, int i) {
        int iZzZ = zzZKV.zzZ(zzzym.zzr5(), c, zzzym.getStartIndex() + 7, i);
        if (iZzZ == -1) {
            return -1;
        }
        return iZzZ - zzzym.getStartIndex();
    }

    public static boolean zzZ(zzZYM zzzym, String str) {
        if (str.length() > zzzym.getLength()) {
            return false;
        }
        char[] cArrZzr5 = zzzym.zzr5();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != cArrZzr5[zzzym.getStartIndex() + i]) {
                return false;
            }
        }
        return true;
    }
}
