package com.aspose.words.internal;

import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzZPN {
    private static Map<String, String> zzZZY;
    private static List<String> zz0e = new ArrayList(100);
    private static String zz0d = "年";
    private static String zz0c = "月";
    private static String zz0b = "日";
    private static String zz0a = "년";
    private static String zz09 = "월";
    private static String zz08 = "일";
    private static String zz07 = "시";
    private static String zz06 = "분";
    private static String zz05 = "초";
    private static String zz04 = "時";
    private static String zz03 = "时";
    private static String zz02 = "分";
    private static String zz01 = "秒";
    private static int zz00 = zzZ.zzZZX;
    private static String zzZZZ = "";

    public static class zzZ {
        static int zzZZT = 7;
        static int zzZZU = 4;
        static int zzZZV = 2;
        static int zzZZW = 1;
        static int zzZZX;
    }

    static {
        zzZZY = new HashMap();
        HashMap map = new HashMap();
        map.put("/", zzZZZ);
        map.put(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, zzZZZ);
        map.put(".", zzZZZ);
        map.put(zz0d, zzZZZ);
        map.put(zz0c, zzZZZ);
        map.put(zz0b, zzZZZ);
        map.put(zz0a, zzZZZ);
        map.put(zz09, zzZZZ);
        map.put(zz08, zzZZZ);
        map.put(zz07, zzZZZ);
        map.put(zz06, zzZZZ);
        map.put(zz05, zzZZZ);
        map.put(zz04, zzZZZ);
        map.put(zz03, zzZZZ);
        map.put(zz02, zzZZZ);
        map.put(zz01, zzZZZ);
        zzZZY = map;
    }

    private static boolean zzR(String[] strArr) {
        char cCharAt;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() > 0 && strArr[i].charAt(0) >= '0' && strArr[i].charAt(0) <= '9') {
                int i2 = 1;
                while (i2 < strArr[i].length() && strArr[i].charAt(i2) >= '0' && strArr[i].charAt(i2) <= '9') {
                    i2++;
                }
                if (i2 == strArr[i].length()) {
                    return false;
                }
                return (i2 == strArr[i].length() - 1 && ((cCharAt = strArr[i].charAt(i2)) == 26376 || cCharAt == 50900)) ? false : true;
            }
        }
        return false;
    }

    private static boolean zzS(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            for (int i2 = 0; i2 < strArr[i].length(); i2++) {
                if (zzZKU.zzG(strArr[i].charAt(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int zzVw(String str) {
        return !"he-IL".equals(str) ? 0 : 10;
    }

    private static void zzVx(String str) {
        if (zz0e == null) {
            zz0e = new ArrayList();
        }
        String strOooO00o = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("\ue001", str);
        if (zz0e.contains(strOooO00o)) {
            return;
        }
        zz0e.add(strOooO00o);
    }

    private static void zzVy(String str) {
        zz00 = zzZ.zzZZX;
        int iZzZ = 0;
        while (iZzZ < str.length()) {
            char cCharAt = str.charAt(iZzZ);
            int[] iArr = new int[1];
            if (cCharAt != '\'') {
                if (cCharAt != '.') {
                    if (cCharAt == 'M') {
                        iZzZ = zzZ(str, 'M', iZzZ, iArr);
                        if (iArr[0] >= 4 && iZzZ < str.length() && str.charAt(iZzZ) == '\'') {
                            iZzZ = zzW(str, iZzZ + 1, "MMMM");
                        }
                        zz00 |= zzZ.zzZZV;
                    } else if (cCharAt == '\\') {
                        iZzZ += 2;
                    } else if (cCharAt == 'd') {
                        iZzZ = zzZ(str, 'd', iZzZ, iArr);
                        if (iArr[0] <= 2) {
                            zz00 |= zzZ.zzZZU;
                        }
                    } else if (cCharAt == 'y') {
                        iZzZ = zzZ(str, 'y', iZzZ, iArr);
                        zz00 |= zzZ.zzZZW;
                    } else if (zz00 == zzZ.zzZZT && !zzZKU.zzG(cCharAt)) {
                        zz00 = zzZ.zzZZX;
                    }
                } else if (zz00 == zzZ.zzZZT) {
                    zzVx(".");
                    zz00 = zzZ.zzZZX;
                }
                iZzZ++;
            } else {
                iZzZ = zzW(str, iZzZ + 1, null);
            }
        }
    }

    private static int zzW(String str, int i, String str2) {
        int iZzx = zzx(str, i);
        if (iZzx != i && str2 != null) {
            str2 = null;
        }
        StringBuilder sb = new StringBuilder();
        while (iZzx < str.length()) {
            char cCharAt = str.charAt(iZzx);
            if (cCharAt == '\'') {
                zzZY(str2, sb.toString());
                return iZzx + 1;
            }
            if (cCharAt == '\\') {
                int i2 = iZzx + 1;
                if (i2 < str.length()) {
                    sb.append(str.charAt(i2));
                    iZzx += 2;
                } else {
                    iZzx = i2;
                }
            } else {
                if (zzZKU.zzG(cCharAt)) {
                    zzZY(str2, sb.toString());
                    if (str2 != null) {
                        str2 = null;
                    }
                    sb.delete(0, sb.length());
                } else {
                    sb.append(cCharAt);
                }
                iZzx++;
            }
        }
        return iZzx;
    }

    public static String[] zzY(zzZP0 zzzp0) {
        try {
            for (String str : zzzp0.zzZV('D')) {
                zzVy(str);
            }
            for (String str2 : zzzp0.zzZV('d')) {
                zzVy(str2);
            }
            for (String str3 : zzzp0.zzZV('y')) {
                zzVy(str3);
            }
            zzVy(zzzp0.zzkh());
            for (String str4 : zzzp0.zzZV('T')) {
                zzVy(str4);
            }
            for (String str5 : zzzp0.zzZV('t')) {
                zzVy(str5);
            }
            List<String> list = zz0e;
            if (list == null || list.size() <= 0) {
                return null;
            }
            String[] strArr = new String[zz0e.size()];
            for (int i = 0; i < zz0e.size(); i++) {
                strArr[i] = zz0e.get(i);
            }
            return strArr;
        } catch (Exception e) {
            zzZHV.zzZ(e);
            return null;
        }
    }

    private static int zzZ(String str, char c, int i, int[] iArr) {
        iArr[0] = 1;
        while (true) {
            i++;
            if (i >= str.length() || str.charAt(i) != c) {
                break;
            }
            iArr[0] = iArr[0] + 1;
        }
        return i;
    }

    private static void zzZY(String str, String str2) {
        if (str2.length() > 0) {
            if (".".equals(str2)) {
                zzVx(".");
                return;
            }
            if (zzZZY.get(str2) == null) {
                if (zz0e == null) {
                    zz0e = new ArrayList();
                }
                if ("MMMM".equals(str)) {
                    String strConcat = "\ue000".concat(str2);
                    if (zz0e.contains(strConcat)) {
                        return;
                    }
                    zz0e.add(strConcat);
                    return;
                }
                if (!zz0e.contains(str2)) {
                    zz0e.add(str2);
                }
                if (androidx.core.content.OooO0O0.OooO00o(1, str2) == '.') {
                    String strOooO00o = androidx.core.content.OooO0OO.OooO00o(1, 0, str2);
                    if (zz0e.contains(strOooO00o)) {
                        return;
                    }
                    zz0e.add(strOooO00o);
                }
            }
        }
    }

    private static int zzx(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                i++;
                if (i >= str.length()) {
                    return i;
                }
                cCharAt = str.charAt(i);
                if (cCharAt == '\'') {
                    continue;
                }
            }
            if (Character.isLetter(cCharAt) || cCharAt == '\'' || cCharAt == '.') {
                break;
            }
            i++;
        }
        return i;
    }

    public static int zzZ(String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        return (zzY(strArr, strArr2) && zzY(strArr3, strArr4)) ? 0 : 1;
    }

    public static int zzZ(String[] strArr, String[] strArr2) {
        return (zzS(strArr) || zzS(strArr2)) ? 16 : 0;
    }

    public static int zzY(String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        return ((zzR(strArr) || zzR(strArr2) || zzR(strArr3) || zzR(strArr4)) ? 32 : 0) | ((zzS(strArr) || zzS(strArr2) || zzS(strArr3) || zzS(strArr4)) ? 4 : 0);
    }

    private static boolean zzY(String[] strArr, String[] strArr2) {
        if (strArr.length != strArr2.length) {
            return false;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].equals(strArr2[i])) {
                return false;
            }
        }
        return true;
    }
}
