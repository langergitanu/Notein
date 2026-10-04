package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p463vm.C11691kk;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.um */
/* JADX INFO: loaded from: classes5.dex */
public class C14097um {
    /* JADX INFO: renamed from: k4 */
    public static int m67306k4(String str, int i, char c) {
        int length = str.length();
        int i2 = i + 1;
        while (i2 < length && str.charAt(i2) == c) {
            i2++;
        }
        return i2 - i;
    }

    /* JADX INFO: renamed from: x1 */
    public static String m67314x1(char c, C11691kk c11691kk, boolean[] zArr, boolean[] zArr2, boolean z) {
        zArr[0] = false;
        zArr2[0] = false;
        if (c == 'D') {
            return c11691kk.m55212x6();
        }
        if (c != 'M') {
            if (c != 'O') {
                if (c != 'R') {
                    if (c != 'Y') {
                        if (c == 'd') {
                            return c11691kk.m55193ne();
                        }
                        if (c != 'm') {
                            if (c != 'o') {
                                if (c != 'y') {
                                    if (c == 'F') {
                                        return C14113y2.m67408k4(c11691kk.m55212x6(), " ", c11691kk.m55200u4());
                                    }
                                    if (c == 'G') {
                                        return C14113y2.m67408k4(c11691kk.m55193ne(), " ", c11691kk.m55200u4());
                                    }
                                    if (c == 'T') {
                                        return c11691kk.m55200u4();
                                    }
                                    if (c == 'U') {
                                        if (z) {
                                            return null;
                                        }
                                        String strM67408k4 = C14113y2.m67408k4(c11691kk.m55212x6(), " ", c11691kk.m55200u4());
                                        zArr[0] = true;
                                        return strM67408k4;
                                    }
                                    if (c == 'f') {
                                        return C14113y2.m67408k4(c11691kk.m55212x6(), " ", c11691kk.m55173ix());
                                    }
                                    if (c == 'g') {
                                        return C14113y2.m67408k4(c11691kk.m55193ne(), " ", c11691kk.m55173ix());
                                    }
                                    switch (c) {
                                        case 'r':
                                            break;
                                        case 's':
                                            String strM55207wy = c11691kk.m55207wy();
                                            zArr2[0] = true;
                                            return strM55207wy;
                                        case 't':
                                            return c11691kk.m55173ix();
                                        case 'u':
                                            String strM55147ak = c11691kk.m55147ak();
                                            if (z) {
                                                zArr[0] = true;
                                            }
                                            zArr2[0] = true;
                                            return strM55147ak;
                                        default:
                                            return null;
                                    }
                                }
                            }
                        }
                    }
                    return c11691kk.m55206wl();
                }
                String strM55214yd = c11691kk.m55214yd();
                if (z) {
                    zArr[0] = true;
                }
                zArr2[0] = true;
                return strM55214yd;
            }
            String strM55148b3 = c11691kk.m55148b3();
            zArr2[0] = true;
            return strM55148b3;
        }
        return c11691kk.m55204uz();
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67307k4(String str, int i, StringBuilder sb) {
        int length = str.length();
        int i2 = i + 1;
        char cCharAt = str.charAt(i);
        while (i2 < length) {
            int i3 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 == cCharAt) {
                return i3 - i;
            }
            if (cCharAt2 != '\\') {
                sb.append(cCharAt2);
                i2 = i3;
            } else {
                if (i3 >= length) {
                    throw new FormatException("Un-ended quote");
                }
                i2 += 2;
                sb.append(str.charAt(i3));
            }
        }
        throw new FormatException("Un-ended quote");
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67308k4(char c, C11691kk c11691kk, boolean[] zArr, boolean[] zArr2) {
        return m67309k4(c, c11691kk, zArr, zArr2, false);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67309k4(char c, C11691kk c11691kk, boolean[] zArr, boolean[] zArr2, boolean z) {
        zArr[0] = false;
        zArr2[0] = false;
        if (c == 'D') {
            return c11691kk.m55212x6();
        }
        if (c != 'M') {
            if (c != 'O') {
                if (c != 'R') {
                    if (c != 'Y') {
                        if (c == 'd') {
                            return c11691kk.m55193ne();
                        }
                        if (c != 'm') {
                            if (c != 'o') {
                                if (c != 'y') {
                                    if (c == 'F') {
                                        return c11691kk.m55194qq();
                                    }
                                    if (c == 'G') {
                                        return C14113y2.m67408k4(c11691kk.m55193ne(), " ", c11691kk.m55200u4());
                                    }
                                    if (c == 'T') {
                                        return c11691kk.m55200u4();
                                    }
                                    if (c == 'U') {
                                        if (z) {
                                            return null;
                                        }
                                        String strM55194qq = c11691kk.m55194qq();
                                        zArr[0] = true;
                                        return strM55194qq;
                                    }
                                    if (c == 'f') {
                                        return C14113y2.m67408k4(c11691kk.m55212x6(), " ", c11691kk.m55173ix());
                                    }
                                    if (c == 'g') {
                                        return C14113y2.m67408k4(c11691kk.m55193ne(), " ", c11691kk.m55173ix());
                                    }
                                    switch (c) {
                                        case 'r':
                                            break;
                                        case 's':
                                            String strM55207wy = c11691kk.m55207wy();
                                            zArr2[0] = true;
                                            return strM55207wy;
                                        case 't':
                                            return c11691kk.m55173ix();
                                        case 'u':
                                            String strM55147ak = c11691kk.m55147ak();
                                            if (z) {
                                                zArr[0] = true;
                                            }
                                            zArr2[0] = true;
                                            return strM55147ak;
                                        default:
                                            return null;
                                    }
                                }
                            }
                        }
                    }
                    return c11691kk.m55206wl();
                }
                String strM55214yd = c11691kk.m55214yd();
                if (z) {
                    zArr[0] = true;
                }
                zArr2[0] = true;
                return strM55214yd;
            }
            String strM55148b3 = c11691kk.m55148b3();
            zArr2[0] = true;
            return strM55148b3;
        }
        return c11691kk.m55204uz();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7 A[PHI: r5 r6
      0x00d7: PHI (r5v49 int) = (r5v20 int), (r5v47 int), (r5v50 int) binds: [B:100:0x022a, B:42:0x00e4, B:38:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r6v41 int) = (r6v14 int), (r6v39 int), (r6v42 int) binds: [B:100:0x022a, B:42:0x00e4, B:38:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m67310k4(C14084qq c14084qq, C14077m4 c14077m4, String str, C11691kk c11691kk, boolean z) {
        Object objValueOf;
        String strM55169h4;
        int iM67306k4;
        int iM67147to;
        String strM55183kk;
        char cCharAt;
        int iM66825x1;
        StringBuilder sb = new StringBuilder(str.length() + 10);
        int i = 0;
        while (i < str.length()) {
            char cCharAt2 = str.charAt(i);
            switch (cCharAt2) {
                case '\"':
                case '\'':
                    iM67307k4 = m67307k4(str, i, sb);
                    i += iM67307k4;
                    break;
                case '%':
                    if (i >= str.length() - 1) {
                        throw new FormatException("% at end of date time string");
                    }
                    if (str.charAt(i + 1) == '%') {
                        throw new FormatException("%% in date string");
                    }
                    iM67307k4 = 1;
                    i += iM67307k4;
                    break;
                    break;
                case '/':
                    objValueOf = z ? Character.valueOf(cCharAt2) : c11691kk.m55187ks();
                    sb.append(objValueOf);
                    iM67307k4 = 1;
                    i += iM67307k4;
                    break;
                case ':':
                    if (!z) {
                        objValueOf = c11691kk.m55195rv();
                    }
                    sb.append(objValueOf);
                    iM67307k4 = 1;
                    i += iM67307k4;
                    break;
                case 'E':
                    iM67307k4 = m67306k4(str, i, cCharAt2);
                    if (iM67307k4 != 4) {
                        i += iM67307k4;
                    } else {
                        strM55169h4 = c11691kk.m55169h4(c11691kk.m55205v4().mo55092x1(c14084qq.Clone()));
                        sb.append(strM55169h4);
                        i += iM67307k4;
                    }
                    break;
                case 'F':
                case 'f':
                    boolean z2 = cCharAt2 == 'F';
                    iM67307k4 = m67306k4(str, i, cCharAt2);
                    if (iM67307k4 > 7) {
                        throw new FormatException("Invalid Format String");
                    }
                    int iM67130fa = (int) ((c14084qq.m67130fa() % 10000000) / ((long) Math.pow(10.0d, 7 - iM67307k4)));
                    int length = sb.length();
                    m67312k4(sb, iM67130fa, iM67307k4);
                    if (z2) {
                        while (sb.length() > length && sb.charAt(sb.length() - 1) == '0') {
                            sb.setLength(sb.length() - 1);
                        }
                        if (iM67130fa == 0 && length > 0 && sb.charAt(length - 1) == '.') {
                            sb.setLength(sb.length() - 1);
                        }
                    }
                    i += iM67307k4;
                    break;
                    break;
                case 'H':
                    iM67306k4 = m67306k4(str, i, cCharAt2);
                    iM67147to = c14084qq.m67147to();
                    if (iM67306k4 == 1) {
                        iM67307k4 = 1;
                    }
                    m67312k4(sb, iM67147to, iM67307k4);
                    iM67307k4 = iM67306k4;
                    i += iM67307k4;
                    break;
                case 'K':
                    if (c14077m4 != null || c14084qq.m67127du() == 2) {
                        C14077m4 c14077m4Clone = c14077m4 != null ? c14077m4 : C14076m2.m66792k4(TimeZone.getDefault(), c14084qq.Clone()).Clone();
                        if (c14077m4Clone.m66813du() >= 0) {
                            sb.append('+');
                        } else {
                            sb.append('-');
                        }
                        sb.append(C14057f9.m66587k4(Math.abs(c14077m4Clone.m66825x1()), "D2"));
                        sb.append(':');
                        sb.append(C14057f9.m66587k4(Math.abs(c14077m4Clone.m66820kk()), "D2"));
                    } else if (c14084qq.m67127du() == 1) {
                        cCharAt2 = 'Z';
                        sb.append(cCharAt2);
                    }
                    iM67307k4 = 1;
                    i += iM67307k4;
                    break;
                case 'M':
                    iM67306k4 = m67306k4(str, i, cCharAt2);
                    int iMo55090to = c11691kk.m55205v4().mo55090to(c14084qq.Clone());
                    if (iM67306k4 > 2) {
                        if (iM67306k4 == 3) {
                            strM55183kk = c11691kk.m55177k4(iMo55090to);
                        } else {
                            strM55183kk = (!m67313k4(str) || c11691kk.m55156ck() == null || c11691kk.m55156ck().length <= 0) ? c11691kk.m55183kk(iMo55090to) : c11691kk.m55156ck()[iMo55090to - 1];
                        }
                        sb.append(strM55183kk);
                        iM67307k4 = iM67306k4;
                        i += iM67307k4;
                    } else {
                        m67312k4(sb, iMo55090to, iM67306k4);
                        iM67307k4 = iM67306k4;
                        i += iM67307k4;
                    }
                    break;
                case '\\':
                    if (i >= str.length() - 1) {
                        throw new FormatException("\\ at end of date time string");
                    }
                    cCharAt = str.charAt(i + 1);
                    sb.append(cCharAt);
                    i += iM67307k4;
                    break;
                    break;
                case 'a':
                    iM67307k4 = m67306k4(str, i, cCharAt2);
                    strM55169h4 = c14084qq.m67147to() < 12 ? c11691kk.m55201up() : c11691kk.m55215yj();
                    sb.append(strM55169h4);
                    i += iM67307k4;
                    break;
                case 'd':
                    iM67306k4 = m67306k4(str, i, cCharAt2);
                    if (iM67306k4 > 2) {
                        strM55183kk = iM67306k4 == 3 ? c11691kk.m55189m9(c11691kk.m55205v4().mo55092x1(c14084qq.Clone())) : c11691kk.m55169h4(c11691kk.m55205v4().mo55092x1(c14084qq.Clone()));
                        sb.append(strM55183kk);
                        iM67307k4 = iM67306k4;
                        i += iM67307k4;
                    } else {
                        iM67147to = c11691kk.m55205v4().mo55085k4(c14084qq.Clone());
                        if (iM67306k4 == 1) {
                            iM67307k4 = 1;
                        }
                        m67312k4(sb, iM67147to, iM67307k4);
                        iM67307k4 = iM67306k4;
                        i += iM67307k4;
                    }
                    break;
                case 'g':
                    iM67307k4 = m67306k4(str, i, cCharAt2);
                    strM55169h4 = c11691kk.m55208x1(c11691kk.m55205v4().mo55088kk(c14084qq.Clone()));
                    sb.append(strM55169h4);
                    i += iM67307k4;
                    break;
                case 'h':
                    iM67306k4 = m67306k4(str, i, cCharAt2);
                    int iM67147to2 = c14084qq.m67147to() % 12;
                    m67312k4(sb, iM67147to2 != 0 ? iM67147to2 : 12, iM67306k4 == 1 ? 1 : 2);
                    iM67307k4 = iM67306k4;
                    i += iM67307k4;
                    break;
                case 'm':
                    iM67306k4 = m67306k4(str, i, cCharAt2);
                    iM67147to = c14084qq.m67144m9();
                    if (iM67306k4 == 1) {
                    }
                    m67312k4(sb, iM67147to, iM67307k4);
                    iM67307k4 = iM67306k4;
                    i += iM67307k4;
                    break;
                case 's':
                    iM67306k4 = m67306k4(str, i, cCharAt2);
                    iM67147to = c14084qq.m67126ck();
                    if (iM67306k4 == 1) {
                    }
                    m67312k4(sb, iM67147to, iM67307k4);
                    iM67307k4 = iM67306k4;
                    i += iM67307k4;
                    break;
                case 't':
                    iM67307k4 = m67306k4(str, i, cCharAt2);
                    strM55169h4 = c14084qq.m67147to() < 12 ? c11691kk.m55201up() : c11691kk.m55215yj();
                    if (iM67307k4 != 1) {
                        sb.append(strM55169h4);
                    } else if (strM55169h4.length() >= 1) {
                        cCharAt = strM55169h4.charAt(0);
                        sb.append(cCharAt);
                    }
                    i += iM67307k4;
                    break;
                case 'y':
                    iM67306k4 = m67306k4(str, i, cCharAt2);
                    int iMo55083du = c11691kk.m55205v4().mo55083du(c14084qq.Clone());
                    if (iM67306k4 <= 2) {
                        iMo55083du %= 100;
                    }
                    m67312k4(sb, iMo55083du, iM67306k4);
                    iM67307k4 = iM67306k4;
                    i += iM67307k4;
                    break;
                case 'z':
                    iM67306k4 = m67306k4(str, i, cCharAt2);
                    C14077m4 c14077m4Clone2 = c14077m4 != null ? c14077m4 : C14076m2.m66792k4(TimeZone.getDefault(), c14084qq.Clone()).Clone();
                    if (c14077m4Clone2.m66813du() >= 0) {
                        sb.append('+');
                    } else {
                        sb.append('-');
                    }
                    if (iM67306k4 == 1) {
                        sb.append(Math.abs(c14077m4Clone2.m66825x1()));
                        iM67307k4 = iM67306k4;
                        i += iM67307k4;
                    } else {
                        if (iM67306k4 != 2) {
                            sb.append(C14057f9.m66587k4(Math.abs(c14077m4Clone2.m66825x1()), "D2"));
                            sb.append(':');
                            iM66825x1 = c14077m4Clone2.m66820kk();
                        } else {
                            iM66825x1 = c14077m4Clone2.m66825x1();
                        }
                        strM55183kk = C14057f9.m66587k4(Math.abs(iM66825x1), "D2");
                        sb.append(strM55183kk);
                        iM67307k4 = iM67306k4;
                        i += iM67307k4;
                    }
                    break;
                default:
                    sb.append(cCharAt2);
                    iM67307k4 = 1;
                    i += iM67307k4;
                    break;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67311k4(C14084qq c14084qq, String str, C11691kk c11691kk, boolean z) {
        return m67310k4(c14084qq.Clone(), (C14077m4) null, str, c11691kk, z);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67312k4(StringBuilder sb, int i, int i2) {
        int i3 = 16;
        char[] cArr = new char[16];
        do {
            i3--;
            cArr[i3] = (char) ((i % 10) + 48);
            i /= 10;
            i2--;
        } while (i > 0);
        while (true) {
            int i4 = i2 - 1;
            if (i2 <= 0) {
                sb.append(new String(cArr, i3, 16 - i3));
                return;
            } else {
                i3--;
                cArr[i3] = '0';
                i2 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m67313k4(String str) {
        boolean z = false;
        for (char c : C14113y2.m67365dy(str)) {
            if (c == '\'') {
                z = !z;
            }
            if (c == 'd' && !z) {
                return true;
            }
        }
        return false;
    }
}
