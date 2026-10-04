package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzOQ {
    private static int zzY(String str, boolean z, boolean z2) {
        int iZzZo;
        int i = 0;
        if (z) {
            while (i < str.length() && str.charAt(i) == ' ') {
                i++;
            }
        }
        if (i >= str.length()) {
            return Integer.MIN_VALUE;
        }
        int i2 = 1;
        if (str.charAt(i) == '+') {
            i++;
        } else if (str.charAt(i) == '-') {
            i++;
            i2 = -1;
        }
        if (z) {
            while (i < str.length() && str.charAt(i) == ' ') {
                i++;
            }
        }
        if (i >= str.length()) {
            if (z2) {
                return i2;
            }
            return Integer.MIN_VALUE;
        }
        String strSubstring = str.substring(i);
        if (!com.aspose.words.internal.zzZYD.zzXc(strSubstring) || (iZzZo = com.aspose.words.internal.zzJB.zzZo(strSubstring)) < 0) {
            return Integer.MIN_VALUE;
        }
        return i2 * iZzZo;
    }

    public static zzOR zzt(ArrayList<zzLH> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            zzLH zzlh = arrayList.get(i);
            if (zzlh.zzZe('+') || zzlh.zzZe('-')) {
                sb.append(((zzPO) zzlh).zzqe());
            } else {
                int type = zzlh.getType();
                if (type == 0) {
                    com.aspose.words.internal.zzZNH.zzU(sb, ((zzLJ) zzlh).getText());
                } else if (type == 9 || type == 11) {
                    zzNI zzni = (zzNI) zzlh;
                    if (!zzni.zzZVN()) {
                        return null;
                    }
                    if (zzni.isSigned() && zzni.getValue() > 0.0d) {
                        sb.append('+');
                    }
                    com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzJB.zzZZ(zzni.getValue()));
                    if (zzlh.getType() == 11) {
                        com.aspose.words.internal.zzZNH.zzU(sb, ((zzPM) zzni).zzZW9());
                    }
                } else {
                    if (type != 12) {
                        return null;
                    }
                    sb.append(ControlChar.SPACE_CHAR);
                }
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < sb.length() && sb.charAt(i3) == ' '; i3++) {
            i2++;
        }
        if (i2 > 0) {
            sb.delete(0, i2);
        }
        int i4 = 0;
        for (int length = sb.length() - 1; length >= 0 && sb.charAt(length) == ' '; length--) {
            i4++;
        }
        if (i4 > 0) {
            sb.delete(sb.length() - i4, (sb.length() - i4) + i4);
        }
        String strZzXl = com.aspose.words.internal.zzZYD.zzXl(sb.toString());
        if (strZzXl.length() == 0) {
            return null;
        }
        if ("even".equals(strZzXl)) {
            return new zzOR(2, 0);
        }
        if ("odd".equals(strZzXl)) {
            return new zzOR(2, 1);
        }
        int iIndexOf = strZzXl.indexOf(110);
        if (iIndexOf < 0) {
            int iZzY = zzY(strZzXl, false, false);
            if (iZzY == Integer.MIN_VALUE) {
                return null;
            }
            return new zzOR(0, iZzY);
        }
        String strSubstring = strZzXl.substring(0, iIndexOf);
        String strSubstring2 = strZzXl.substring(iIndexOf + 1);
        int iZzY2 = strSubstring.length() > 0 ? zzY(strSubstring, false, true) : 1;
        if (iZzY2 == Integer.MIN_VALUE) {
            return null;
        }
        int iZzY3 = strSubstring2.length() > 0 ? zzY(strSubstring2, true, false) : 0;
        if (iZzY3 == Integer.MIN_VALUE) {
            return null;
        }
        return new zzOR(iZzY2, iZzY3);
    }
}
