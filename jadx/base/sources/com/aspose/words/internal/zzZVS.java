package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZVS {
    public static boolean isSurrogate(char c) {
        return zz4(c) || zz3(c);
    }

    public static boolean zz3(char c) {
        return c >= 56320 && c <= 57343;
    }

    public static boolean zz4(char c) {
        return c >= 55296 && c <= 56319;
    }

    public static int zzA(String str, int i) {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: s");
        }
        if (i < 0 || i >= str.length()) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: position");
        }
        return zzz(str, i) ? zzW(str.charAt(i), str.charAt(i + 1)) : str.charAt(i);
    }

    public static boolean zzS1(int i) {
        if (i >= 57344 && i <= 63743) {
            return true;
        }
        if (i < 983040 || i > 1048573) {
            return i >= 1048576 && i <= 1114109;
        }
        return true;
    }

    public static boolean zzS2(int i) {
        return 3584 <= i && i <= 3711;
    }

    public static boolean zzS3(int i) {
        if (1536 <= i && i <= 1791) {
            return true;
        }
        if (1872 <= i && i <= 1919) {
            return true;
        }
        if (1920 <= i && i <= 1983) {
            return true;
        }
        if (2208 <= i && i <= 2303) {
            return true;
        }
        if (64336 > i || i > 65023) {
            return 65136 <= i && i <= 65279;
        }
        return true;
    }

    public static boolean zzS4(int i) {
        return i >= 65536 && i <= 1114111;
    }

    public static boolean zzS5(int i) {
        return i >= 0 && i <= 1114111;
    }

    public static int zzS6(int i) {
        if (zzS5(i)) {
            return zzS4(i) ? 2 : 1;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: utf32Char");
    }

    public static String zzS7(int i) {
        if (!zzS5(i)) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: utf32Char");
        }
        if (!zzS4(i)) {
            return zzZKN.zzS((char) i, 1);
        }
        int i2 = i - 65536;
        return new String(new char[]{(char) ((i2 / 1024) + 55296), (char) ((i2 % 1024) + 56320)});
    }

    public static int zzW(char c, char c2) {
        if (!zz4(c)) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: leadSurrogate");
        }
        if (!zz3(c2)) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: tailSurrogate");
        }
        return (c2 - 56320) + ((c - 55296) * 1024) + 65536;
    }

    public static String zzWI(String str) {
        int iIntValue;
        StringBuilder sb = new StringBuilder();
        Iterator itOooO00o = OooO0OO.OooO00o(str);
        while (itOooO00o.hasNext() && (iIntValue = ((Integer) itOooO00o.next()).intValue()) != 0) {
            zzZNH.zzU(sb, zzS7(iIntValue));
        }
        return sb.toString();
    }

    public static String zzWJ(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (zzY7.zzW(str.charAt(i)) != str.charAt(i)) {
                char[] cArr = new char[str.length()];
                for (int i2 = 0; i2 < str.length(); i2++) {
                    cArr[i2] = zzY7.zzW(str.charAt(i2));
                }
                return new String(cArr);
            }
        }
        return str;
    }

    public static int[] zzWK(String str) {
        if (zzZKN.zzU3(str)) {
            return new int[0];
        }
        zzDB zzdbZzCT = zzDB.zzCT();
        Iterator itOooO00o = OooO0OO.OooO00o(str);
        while (itOooO00o.hasNext()) {
            zzdbZzCT.add(((Integer) itOooO00o.next()).intValue());
        }
        return zzdbZzCT.toArray();
    }

    public static void zzZ(StringBuilder sb, int i) {
        if (!zzS5(i)) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: utf32Char");
        }
        if (!zzS4(i)) {
            sb.append((char) i);
            return;
        }
        int i2 = i - 65536;
        sb.append((char) ((i2 / 1024) + 55296));
        sb.append((char) ((i2 % 1024) + 56320));
    }

    public static boolean zzz(String str, int i) {
        int i2;
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: s");
        }
        if (i < 0 || i >= str.length()) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: position");
        }
        return zz4(str.charAt(i)) && (i2 = i + 1) < str.length() && zz3(str.charAt(i2));
    }
}
