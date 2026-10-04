package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p463vm.C11697x1;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.yj */
/* JADX INFO: loaded from: classes5.dex */
public final class C14117yj {
    /* JADX INFO: renamed from: c5 */
    public static boolean m67512c5(char c) {
        return c >= 56320 && c <= 57343;
    }

    /* JADX INFO: renamed from: ck */
    public static boolean m67513ck(char c) {
        int iM67545x1 = m67545x1(c);
        return iM67545x1 >= 18 && iM67545x1 <= 24;
    }

    /* JADX INFO: renamed from: du */
    public static boolean m67514du(char c) {
        return c >= 55296 && c <= 56319;
    }

    /* JADX INFO: renamed from: dy */
    private static void m67516dy(String str, int i) {
        if (str == null) {
            throw new ArgumentNullException("s");
        }
        if (i < 0 || i >= str.length()) {
            throw new ArgumentOutOfRangeException("The value of index is less than zero, or greater than or equal to the length of s.");
        }
    }

    /* JADX INFO: renamed from: fa */
    public static boolean m67518fa(char c) {
        int iM67545x1 = m67545x1(c);
        return iM67545x1 >= 11 && iM67545x1 <= 13;
    }

    /* JADX INFO: renamed from: h4 */
    public static boolean m67519h4(char c) {
        return m67545x1(c) <= 4;
    }

    /* JADX INFO: renamed from: ix */
    public static char m67521ix(char c) {
        return m67544x1(c, C11697x1.m55252to());
    }

    /* JADX INFO: renamed from: jd */
    public static boolean m67522jd(char c) {
        int iM67545x1 = m67545x1(c);
        return iM67545x1 >= 8 && iM67545x1 <= 10;
    }

    /* JADX INFO: renamed from: k4 */
    public static char m67523k4(char c, C11697x1 c11697x1) {
        if (c11697x1 != null) {
            return c11697x1.m55260ck().m55234k4(c);
        }
        throw new ArgumentNullException("culture");
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m67531kk(char c) {
        return m67545x1(c) == 14;
    }

    /* JADX INFO: renamed from: ks */
    public static boolean m67534ks(char c) {
        if (c < 5760) {
            return c == ' ' || (c >= '\t' && c <= '\r') || c == 133 || c == 160;
        }
        int iM67545x1 = m67545x1(c);
        return iM67545x1 > 10 && iM67545x1 <= 13 && c != 8203;
    }

    /* JADX INFO: renamed from: m9 */
    public static boolean m67535m9(char c) {
        int iM67545x1 = m67545x1(c);
        return iM67545x1 <= 4 || iM67545x1 == 8;
    }

    /* JADX INFO: renamed from: ne */
    public static String m67537ne(char c) {
        return C14113y2.m67389k4(c, 1);
    }

    /* JADX INFO: renamed from: rv */
    public static char m67538rv(char c) {
        return m67523k4(c, C11697x1.m55252to());
    }

    /* JADX INFO: renamed from: to */
    public static boolean m67539to(char c) {
        return m67545x1(c) == 8;
    }

    /* JADX INFO: renamed from: u4 */
    public static char m67541u4(char c) {
        return Character.toUpperCase(c);
    }

    /* JADX INFO: renamed from: up */
    public static boolean m67542up(char c) {
        return c >= 55296 && c <= 57343;
    }

    /* JADX INFO: renamed from: uz */
    private static boolean m67543uz(char c) {
        return c <= 255;
    }

    /* JADX INFO: renamed from: x1 */
    public static char m67544x1(char c, C11697x1 c11697x1) {
        if (c11697x1 != null) {
            return c11697x1.m55260ck().m55240x1(c);
        }
        throw new ArgumentNullException("culture");
    }

    /* JADX INFO: renamed from: x6 */
    public static char m67549x6(char c) {
        return Character.toLowerCase(c);
    }

    /* JADX INFO: renamed from: yj */
    public static boolean m67550yj(char c) {
        return m67545x1(c) == 0;
    }

    /* JADX INFO: renamed from: du */
    public static boolean m67515du(String str, int i) {
        m67516dy(str, i);
        int i2 = i + 1;
        return i2 < str.length() && m67532kk(str.charAt(i), str.charAt(i2));
    }

    /* JADX INFO: renamed from: dy */
    public static boolean m67517dy(char c) {
        return m67545x1(c) == 1;
    }

    /* JADX INFO: renamed from: h4 */
    public static boolean m67520h4(String str, int i) {
        m67516dy(str, i);
        return m67550yj(str.charAt(i));
    }

    /* JADX INFO: renamed from: k4 */
    public static double m67524k4(char c) {
        return Character.getNumericValue(c);
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m67532kk(char c, char c2) {
        return c >= 55296 && c <= 56319 && c2 >= 56320 && c2 <= 57343;
    }

    /* JADX INFO: renamed from: m9 */
    public static boolean m67536m9(String str, int i) {
        m67516dy(str, i);
        return m67534ks(str.charAt(i));
    }

    /* JADX INFO: renamed from: to */
    public static boolean m67540to(String str, int i) {
        m67516dy(str, i);
        return m67542up(str.charAt(i));
    }

    /* JADX INFO: renamed from: x1 */
    public static int m67545x1(char c) {
        return m67546x1(Character.getType(c));
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67525k4(char c, char c2) {
        if (c < 55296 || 56319 < c) {
            throw new ArgumentOutOfRangeException("highSurrogate");
        }
        if (c2 < 56320 || 57343 < c2) {
            throw new ArgumentOutOfRangeException("lowSurrogate");
        }
        return (c2 - 56320) + ((c - 55296) << 10) + 65536;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m67533kk(String str, int i) {
        m67516dy(str, i);
        return m67514du(str.charAt(i));
    }

    /* JADX INFO: renamed from: x1 */
    private static int m67546x1(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 7;
            case 8:
                return 6;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
            default:
                return 29;
            case 18:
                return 17;
            case 19:
                return 16;
            case 20:
                return 19;
            case 21:
                return 20;
            case 22:
                return 21;
            case 23:
                return 18;
            case 24:
                return 24;
            case 25:
                return 25;
            case 26:
                return 26;
            case 27:
                return 27;
            case 28:
                return 28;
            case 29:
                return 22;
            case 30:
                return 23;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67526k4(char c, Object obj) {
        if (obj == null) {
            return 1;
        }
        if (obj.getClass() == Character.class) {
            return c - C14080ne.m67039x1(obj);
        }
        throw new ArgumentException("Value is not a System.Char");
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m67547x1(char c, char c2) {
        return c == c2;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67527k4(String str, int i) {
        m67516dy(str, i);
        return m67543uz(str.charAt(i)) ? m67545x1(str.charAt(i)) : m67546x1(Character.getType(Character.codePointAt(str, i)));
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m67548x1(String str, int i) {
        return m67527k4(str, i) == 8;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67528k4(char c, InterfaceC14073kp interfaceC14073kp) {
        return m67537ne(c);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67529k4(int i) {
        if (i < 0 || i > 1114111) {
            throw new ArgumentOutOfRangeException("utf32", "The argument must be from 0 to 0x10FFFF.");
        }
        if (55296 <= i && i <= 57343) {
            throw new ArgumentOutOfRangeException("utf32", "The argument must not be in surrogate pair range.");
        }
        if (i < 65536) {
            return C14113y2.m67389k4((char) i, 1);
        }
        int i2 = i - 65536;
        return C14113y2.m67405k4(new char[]{(char) ((i2 >> 10) + 55296), (char) ((i2 % 1024) + 56320)});
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m67530k4(String str, char[] cArr) {
        if (str == null || str.length() != 1) {
            cArr[0] = 0;
            return false;
        }
        cArr[0] = str.charAt(0);
        return true;
    }
}
