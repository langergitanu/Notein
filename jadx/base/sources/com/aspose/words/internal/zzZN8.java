package com.aspose.words.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZN8 {
    static Map zzZVl = new HashMap();
    static Map zzZVk = new HashMap();

    public static String decode(String str) {
        String str2 = (String) zzZVl.get(str);
        if (str2 != null) {
            return str2;
        }
        String strZzUB = zzUB(str);
        zzZVl.put(str, strZzUB);
        return strZzUB;
    }

    private static String zzUA(String str) {
        if (str == null || str.length() < 6) {
            return str;
        }
        try {
            char c = (char) Integer.parseInt(str.substring(1, 5), 16);
            if (str.length() == 6) {
                return String.valueOf(c);
            }
            return c + zzUB(str.substring(6));
        } catch (Exception unused) {
            return str.charAt(0) + zzUB(str.substring(1));
        }
    }

    public static String zzUB(String str) {
        int iIndexOf;
        int i;
        if (str == null || str.length() == 0 || (iIndexOf = str.indexOf(95)) == -1 || (i = iIndexOf + 6) >= str.length()) {
            return str;
        }
        int i2 = iIndexOf + 1;
        if ((str.charAt(i2) == 'X' || str.charAt(i2) == 'x') && str.charAt(i) == '_') {
            return str.substring(0, iIndexOf) + zzUA(str.substring(i2));
        }
        return str.charAt(0) + zzUB(str.substring(1));
    }
}
