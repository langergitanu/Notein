package com.aspose.slides.p559ms.System;

import Oooo0oO.C21111o0ooOoO;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p088dn.C3205up;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.internal.p463vm.C11690k4;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.words.ControlChar;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.y2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14113y2 {

    /* JADX INFO: renamed from: kk */
    private static final AbstractC14068j5 f47375kk = C7019kk.m27443k4((Class<?>) InterfaceC14105wp.class);

    /* JADX INFO: renamed from: k4 */
    public static String f47374k4 = "";

    /* JADX INFO: renamed from: x1 */
    static final char[] f47376x1 = {'\t', '\n', ControlChar.LINE_BREAK_CHAR, '\f', ControlChar.PARAGRAPH_BREAK_CHAR, ControlChar.SPACE_CHAR, 133, ControlChar.NON_BREAKING_SPACE_CHAR, 5760, 8192, 8193, ControlChar.DEFAULT_TEXT_INPUT_CHAR, 8195, 8196, 8197, 8198, 8199, 8200, 8201, 8202, 8203, 8232, 8233, 12288, 65279};

    /* JADX INFO: renamed from: c5 */
    public static String m67358c5(String str) {
        if (str != null) {
            return m67444x1(str, C11697x1.m55252to());
        }
        throw new NullReferenceException();
    }

    /* JADX INFO: renamed from: du */
    public static int m67360du(String str, String str2, short s) {
        if (s == 0) {
            return m67383k4(str, str2, false, C11697x1.m55252to());
        }
        if (s == 1) {
            return m67383k4(str, str2, true, C11697x1.m55252to());
        }
        if (s == 2) {
            return m67383k4(str, str2, false, C11697x1.m55250kk());
        }
        if (s == 3) {
            return m67383k4(str, str2, true, C11697x1.m55250kk());
        }
        if (s == 4) {
            return m67426m9(str, str2);
        }
        if (s == 5) {
            return m67370jd(str, str2);
        }
        throw new ArgumentException(C21111o0ooOoO.OooO0Oo(m67402k4("Invalid value '{0}' for StringComparison", Short.valueOf(s)), "\r\nParameter name: comparisonType"));
    }

    /* JADX INFO: renamed from: dy */
    public static int m67364dy(String str, String str2) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (str2 == null) {
            throw new ArgumentNullException("value");
        }
        if (str2.length() == 0) {
            return 0;
        }
        if (str.length() == 0) {
            return -1;
        }
        return C11697x1.m55252to().m55271up().m55131k4(str, str2, 0, str.length(), 1073741824L);
    }

    /* JADX INFO: renamed from: h4 */
    public static int m67366h4(String str, String str2) {
        return C11697x1.m55252to().m55271up().m55132k4(str, str2, 0L);
    }

    /* JADX INFO: renamed from: jd */
    private static int m67370jd(String str, String str2) {
        return str.compareToIgnoreCase(str2);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67372k4(String str, char c, int i) {
        if (str != null) {
            return m67373k4(str, c, i, i + 1);
        }
        throw new NullReferenceException();
    }

    /* JADX INFO: renamed from: kk */
    public static int m67418kk(String str, char c) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (str.length() == 0) {
            return -1;
        }
        return m67373k4(str, c, str.length() - 1, str.length());
    }

    /* JADX INFO: renamed from: m9 */
    public static int m67426m9(String str, String str2) {
        if (str == null && str2 == null) {
            return 0;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }

    /* JADX INFO: renamed from: to */
    public static int m67429to(String str, char c) {
        if (str != null) {
            return m67434x1(str, c, 0);
        }
        throw new NullReferenceException();
    }

    /* JADX INFO: renamed from: x1 */
    public static int m67434x1(String str, char c, int i) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("startIndex", "< 0");
        }
        if (i > str.length()) {
            throw new ArgumentOutOfRangeException("startIndex", "startIndex > this.length");
        }
        if ((i == 0 && str.length() == 0) || i == str.length()) {
            return -1;
        }
        return str.indexOf(c, i);
    }

    /* JADX INFO: renamed from: c5 */
    public static boolean m67359c5(String str, String str2) {
        if (str != null) {
            return m67364dy(str, str2) != -1;
        }
        throw new NullReferenceException();
    }

    /* JADX INFO: renamed from: dy */
    public static char[] m67365dy(String str) {
        if (str != null) {
            return m67425kk(str, 0, str.length());
        }
        throw new NullReferenceException();
    }

    /* JADX INFO: renamed from: h4 */
    public static int m67367h4(String str, String str2, short s) {
        if (str != null) {
            return m67438x1(str, str2, 0, str.length(), s);
        }
        throw new NullReferenceException();
    }

    /* JADX INFO: renamed from: jd */
    public static String m67371jd(String str) {
        if (str != null) {
            return m67444x1(str, C11697x1.m55250kk());
        }
        throw new NullReferenceException();
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67373k4(String str, char c, int i, int i2) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (str.length() == 0) {
            return -1;
        }
        if (i < 0 || i >= str.length()) {
            throw new ArgumentOutOfRangeException("startIndex", "< 0 || >= this.Length");
        }
        if (i2 < 0 || i2 > str.length()) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "< 0 || > this.Length");
        }
        int i3 = (i - i2) + 1;
        if (i3 < 0) {
            throw new ArgumentOutOfRangeException("startIndex - count + 1 < 0");
        }
        int iLastIndexOf = str.substring(i3, i + 1).lastIndexOf(c, i2 - 1);
        return iLastIndexOf >= 0 ? iLastIndexOf + i3 : iLastIndexOf;
    }

    /* JADX INFO: renamed from: kk */
    private static int m67419kk(String str, int i, String str2, int i2, int i3) {
        if (i > str.length() || i2 > str2.length() || i < 0 || i2 < 0 || i3 < 0) {
            throw new ArgumentException();
        }
        return str.substring(i, i + i3).compareToIgnoreCase(str2.substring(i2, i3 + i2));
    }

    /* JADX INFO: renamed from: m9 */
    public static String m67427m9(String str) {
        if (str == null) {
            throw new ArgumentNullException("str");
        }
        return new String(str.toCharArray(), 0, str.length());
    }

    /* JADX INFO: renamed from: to */
    public static int m67430to(String str, String str2) {
        if (str != null) {
            return m67379k4(str, str2, str.length() - 1, str.length());
        }
        throw new NullReferenceException();
    }

    /* JADX INFO: renamed from: x1 */
    public static int m67435x1(String str, char c, int i, int i2) {
        int iIndexOf;
        if (str == null) {
            throw new NullReferenceException();
        }
        if (i < 0 || i > str.length()) {
            throw new ArgumentOutOfRangeException("startIndex", "Cannot be negative and must be< 0");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "< 0");
        }
        if (i > str.length() - i2) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "startIndex + count > this.length");
        }
        if ((i == 0 && str.length() == 0) || i == str.length() || i2 == 0 || (iIndexOf = str.indexOf(c, i)) >= i + i2) {
            return -1;
        }
        return iIndexOf;
    }

    /* JADX INFO: renamed from: h4 */
    public static String m67368h4(String str) {
        if (str != null) {
            return m67398k4(str, C11697x1.m55252to());
        }
        throw new NullReferenceException();
    }

    /* JADX INFO: renamed from: k4 */
    private static int m67374k4(String str, int i, int i2, int i3) {
        while (i != i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 133) {
                if (cCharAt != 160 && cCharAt != 65279 && cCharAt != 12288 && cCharAt != 133 && cCharAt != 5760 && cCharAt != 8232 && cCharAt != 8233 && (cCharAt < 8192 || cCharAt > 8203)) {
                    break;
                }
                i += i3;
            } else {
                if (cCharAt != ' ' && (cCharAt < '\t' || cCharAt > '\r')) {
                    break;
                }
                i += i3;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: kk */
    public static int m67420kk(String str, String str2, short s) {
        if (str != null) {
            return str.length() == 0 ? str2.length() == 0 ? 0 : -1 : m67380k4(str, str2, str.length() - 1, str.length(), s);
        }
        throw new NullReferenceException();
    }

    /* JADX INFO: renamed from: m9 */
    private static String m67428m9(String str, char[] cArr) {
        while (m67384k4(str, cArr) == 0) {
            str = m67422kk(str, 1);
        }
        return str;
    }

    /* JADX INFO: renamed from: to */
    public static String m67431to(String str, char... cArr) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (str.length() == 0) {
            return f47374k4;
        }
        int length = str.length();
        int iM67374k4 = 0;
        if (cArr == null || cArr.length == 0) {
            iM67374k4 = m67374k4(str, 0, str.length(), 1);
        } else {
            while (iM67374k4 < length && m67413k4(cArr, str.charAt(iM67374k4))) {
                iM67374k4++;
            }
        }
        return iM67374k4 > 0 ? str.substring(iM67374k4) : str;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m67436x1(String str, int i, String str2, int i2, int i3) {
        if (i > str.length() || i2 > str2.length() || i < 0 || i2 < 0 || i3 < 0) {
            throw new ArgumentException();
        }
        return str.substring(i, Math.min(i + i3, str.length())).compareTo(str2.substring(i2, Math.min(i3 + i2, str2.length())));
    }

    /* JADX INFO: renamed from: h4 */
    public static String[] m67369h4(String str, char... cArr) {
        if (str != null) {
            return m67450x1(str, cArr, Integer.MAX_VALUE, 0);
        }
        throw new NullReferenceException();
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67375k4(String str, int i, String str2, int i2, int i3) {
        return m67377k4(str, i, str2, i2, i3, false, C11697x1.m55252to());
    }

    /* JADX INFO: renamed from: kk */
    public static String m67421kk(String str) {
        if (str != null) {
            return m67431to(str, f47376x1);
        }
        throw new NullReferenceException();
    }

    /* JADX INFO: renamed from: to */
    public static boolean m67432to(String str, String str2, short s) {
        if (str != str2) {
            return (str == null || str2 == null || m67360du(str, str2, s) != 0) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m67437x1(String str, String str2, int i, int i2) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (str2 == null) {
            throw new ArgumentNullException("value");
        }
        if (i < 0 || i > str.length()) {
            throw new ArgumentOutOfRangeException("startIndex", "Cannot be negative, and should not exceed length of string.");
        }
        if (i2 < 0 || i > str.length() - i2) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Cannot be negative, and should point to location in string.");
        }
        if (str2.length() == 0) {
            return i;
        }
        if ((i == 0 && str.length() == 0) || i2 == 0) {
            return -1;
        }
        return C11697x1.m55252to().m55271up().m55130k4(str, str2, i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67376k4(String str, int i, String str2, int i2, int i3, short s) {
        String str3;
        int i4;
        String str4;
        int i5;
        int i6;
        boolean z;
        C11697x1 c11697x1M55252to;
        if (s == 0) {
            str3 = str;
            i4 = i;
            str4 = str2;
            i5 = i2;
            i6 = i3;
            z = false;
        } else {
            if (s != 1) {
                if (s == 2) {
                    str3 = str;
                    i4 = i;
                    str4 = str2;
                    i5 = i2;
                    i6 = i3;
                    z = false;
                    c11697x1M55252to = C11697x1.m55250kk();
                } else {
                    if (s != 3) {
                        if (s == 4) {
                            return m67436x1(str, i, str2, i2, i3);
                        }
                        if (s == 5) {
                            return m67419kk(str, i, str2, i2, i3);
                        }
                        throw new ArgumentException(C21111o0ooOoO.OooO0Oo(m67402k4("Invalid value '{0}' for StringComparison", Short.valueOf(s)), "\r\nParameter name: comparisonType"));
                    }
                    z = true;
                    c11697x1M55252to = C11697x1.m55250kk();
                    str3 = str;
                    i4 = i;
                    str4 = str2;
                    i5 = i2;
                    i6 = i3;
                }
                return m67377k4(str3, i4, str4, i5, i6, z, c11697x1M55252to);
            }
            str3 = str;
            i4 = i;
            str4 = str2;
            i5 = i2;
            i6 = i3;
            z = true;
        }
        c11697x1M55252to = C11697x1.m55252to();
        return m67377k4(str3, i4, str4, i5, i6, z, c11697x1M55252to);
    }

    /* JADX INFO: renamed from: kk */
    public static String m67422kk(String str, int i) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (i == 0) {
            return str;
        }
        if (i < 0 || i > str.length()) {
            throw new ArgumentOutOfRangeException("startIndex");
        }
        return str.substring(i);
    }

    /* JADX INFO: renamed from: to */
    public static String[] m67433to(String str) {
        if (str != null) {
            return m67369h4(str, (char[]) null);
        }
        throw new NullReferenceException();
    }

    /* JADX INFO: renamed from: x1 */
    public static int m67438x1(String str, String str2, int i, int i2, short s) {
        String str3;
        String str4;
        int i3;
        int i4;
        C11697x1 c11697x1M55252to;
        C11690k4 c11690k4M55271up;
        long j;
        C11697x1 c11697x1M55252to2;
        if (str == null) {
            throw new NullReferenceException();
        }
        if (s != 0) {
            if (s == 1) {
                str3 = str;
                str4 = str2;
                i3 = i;
                i4 = i2;
                c11697x1M55252to2 = C11697x1.m55252to();
            } else if (s == 2) {
                str3 = str;
                str4 = str2;
                i3 = i;
                i4 = i2;
                c11697x1M55252to = C11697x1.m55250kk();
            } else {
                if (s != 3) {
                    if (s == 4) {
                        str3 = str;
                        str4 = str2;
                        i3 = i;
                        i4 = i2;
                        c11690k4M55271up = C11697x1.m55250kk().m55271up();
                        j = 1073741824;
                    } else {
                        if (s != 5) {
                            throw new ArgumentException(m67402k4("Invalid value '{0}' for StringComparison", Short.valueOf(s)), "comparisonType");
                        }
                        c11690k4M55271up = C11697x1.m55250kk().m55271up();
                        j = 268435456;
                        str3 = str;
                        str4 = str2;
                        i3 = i;
                        i4 = i2;
                    }
                    return c11690k4M55271up.m55131k4(str3, str4, i3, i4, j);
                }
                str3 = str;
                str4 = str2;
                i3 = i;
                i4 = i2;
                c11697x1M55252to2 = C11697x1.m55250kk();
            }
            c11690k4M55271up = c11697x1M55252to2.m55271up();
            j = 1;
            return c11690k4M55271up.m55131k4(str3, str4, i3, i4, j);
        }
        str3 = str;
        str4 = str2;
        i3 = i;
        i4 = i2;
        c11697x1M55252to = C11697x1.m55252to();
        c11690k4M55271up = c11697x1M55252to.m55271up();
        j = 0;
        return c11690k4M55271up.m55131k4(str3, str4, i3, i4, j);
    }

    /* JADX INFO: renamed from: kk */
    public static String m67423kk(String str, char... cArr) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (cArr == null || cArr.length == 0) {
            return m67440x1(str);
        }
        if (str.length() == 0) {
            return f47374k4;
        }
        int length = str.length();
        int i = 0;
        while (i < length && m67413k4(cArr, str.charAt(i))) {
            i++;
        }
        while (i < length && m67413k4(cArr, str.charAt(length - 1))) {
            length--;
        }
        return (i > 0 || length < str.length()) ? str.substring(i, length) : str;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m67439x1(String str, char[] cArr) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (cArr == null) {
            throw new ArgumentNullException();
        }
        if (str.length() == 0) {
            return -1;
        }
        for (int length = str.length() - 1; length >= 0; length--) {
            for (char c : cArr) {
                if (str.charAt(length) == c) {
                    return length;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m67424kk(String str, String str2) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (str2 != null) {
            return C11697x1.m55252to().m55271up().m55134kk(str, str2, 0L);
        }
        throw new ArgumentNullException("value");
    }

    /* JADX INFO: renamed from: x1 */
    public static String m67440x1(String str) {
        if (str != null) {
            return m67423kk(str, f47376x1);
        }
        throw new NullReferenceException();
    }

    /* JADX INFO: renamed from: du */
    public static String m67361du(String str) {
        if (str != null) {
            return m67398k4(str, C11697x1.m55250kk());
        }
        throw new NullReferenceException();
    }

    /* JADX INFO: renamed from: kk */
    public static char[] m67425kk(String str, int i, int i2) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("startIndex", "< 0");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("length", "< 0");
        }
        if (i > str.length() - i2) {
            throw new ArgumentOutOfRangeException("startIndex", "Must be greater than the length of the string.");
        }
        char[] cArr = new char[i2];
        AbstractC14092to.m67229k4(str.toCharArray(), i, cArr, 0, i2);
        return cArr;
    }

    /* JADX INFO: renamed from: x1 */
    public static String m67441x1(String str, char c) {
        if (str == null) {
            str = "";
        }
        return str + c;
    }

    /* JADX INFO: renamed from: du */
    public static String m67362du(String str, char... cArr) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (str.length() == 0) {
            return f47374k4;
        }
        int length = str.length();
        if (cArr == null || cArr.length == 0) {
            length = m67374k4(str, str.length() - 1, -1, -1) + 1;
        } else {
            while (length > 0 && m67413k4(cArr, str.charAt(length - 1))) {
                length--;
            }
        }
        return length < str.length() ? str.substring(0, length) : str;
    }

    /* JADX INFO: renamed from: x1 */
    public static String m67442x1(String str, int i) {
        if (str == null) {
            str = "";
        }
        return str + i;
    }

    /* JADX INFO: renamed from: du */
    public static boolean m67363du(String str, String str2) {
        if (str != str2) {
            return str != null && str.equals(str2);
        }
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public static String m67443x1(String str, int i, int i2) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("length", "Cannot be negative.");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("startIndex", "Cannot be negative.");
        }
        if (i > str.length()) {
            throw new ArgumentOutOfRangeException("startIndex", "Cannot exceed length of string.");
        }
        if (i <= str.length() - i2) {
            return (i == 0 && i2 == str.length()) ? str : str.substring(i, i2 + i);
        }
        throw new ArgumentOutOfRangeException("length", "startIndex + length cannot exceed length of string.");
    }

    /* JADX INFO: renamed from: x1 */
    public static String m67444x1(String str, C11697x1 c11697x1) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (c11697x1 != null) {
            return str.toUpperCase(C11697x1.m55246k4(c11697x1));
        }
        throw new ArgumentNullException("culture");
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67377k4(String str, int i, String str2, int i2, int i3, boolean z, C11697x1 c11697x1) {
        if (c11697x1 == null) {
            throw new ArgumentNullException("culture");
        }
        if (i3 == 0) {
            return 0;
        }
        if (str == null) {
            return str2 == null ? 0 : -1;
        }
        if (str2 == null) {
            return 1;
        }
        if (i > str.length() || i2 > str2.length() || i < 0 || i2 < 0 || i3 < 0) {
            throw new ArgumentException();
        }
        return c11697x1.m55271up().m55128k4(str, i, i3 > str.length() - i ? str.length() - i : i3, str2, i2, i3 > str2.length() - i2 ? str2.length() - i2 : i3, z ? 1L : 0L);
    }

    /* JADX INFO: renamed from: x1 */
    private static StringBuilder m67445x1(String[] strArr) {
        int length = 0;
        for (String str : strArr) {
            if (str != null) {
                length += str.length();
            }
        }
        StringBuilder sb = new StringBuilder(length);
        for (String str2 : strArr) {
            if (str2 != null) {
                sb.append(str2);
            }
        }
        return sb;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67378k4(String str, String str2, int i) {
        if (str != null) {
            return m67437x1(str, str2, i, str.length() - i);
        }
        throw new NullReferenceException();
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m67446x1(Object obj) {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof C14046bv);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67379k4(String str, String str2, int i, int i2) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (str2 == null) {
            throw new ArgumentNullException("value");
        }
        if (str.length() == 0) {
            return str2.length() == 0 ? 0 : -1;
        }
        if (i < -1 || i > str.length()) {
            throw new ArgumentOutOfRangeException("startIndex", "< 0 || > this.Length");
        }
        if (i2 < 0 || i2 > str.length()) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "< 0 || > this.Length");
        }
        if ((i - i2) + 1 < 0) {
            throw new ArgumentOutOfRangeException("startIndex - count + 1 < 0");
        }
        if (str2.length() == 0) {
            return Math.min(str.length() - 1, i);
        }
        if (i == 0 && str.length() == 0) {
            return -1;
        }
        if ((str.length() == 0 && str2.length() > 0) || i2 == 0) {
            return -1;
        }
        if (i == str.length()) {
            i--;
        }
        return C11697x1.m55252to().m55271up().m55136x1(str, str2, i, i2);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m67447x1(String str, Object obj) {
        if (str != obj) {
            return str != null && str.equals(obj);
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67380k4(String str, String str2, int i, int i2, short s) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (str2 == null) {
            throw new ArgumentNullException("value");
        }
        if (str.length() == 0) {
            return str2.length() == 0 ? 0 : -1;
        }
        if (s < 0 || s > 5) {
            throw new ArgumentException("comparisonType");
        }
        if (str2.length() == 0) {
            return Math.min(str.length() - 1, i);
        }
        if (i < 0 || i > str.length()) {
            throw new ArgumentOutOfRangeException("startIndex");
        }
        if (i2 < 0 || i < i2 - 1) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f);
        }
        if (s == 0) {
            return C11697x1.m55252to().m55271up().m55137x1(str, str2, i, i2, 0L);
        }
        if (s == 1) {
            return C11697x1.m55252to().m55271up().m55137x1(str, str2, i, i2, 1L);
        }
        if (s == 2) {
            return C11697x1.m55250kk().m55271up().m55137x1(str, str2, i, i2, 0L);
        }
        if (s == 3) {
            return C11697x1.m55250kk().m55271up().m55137x1(str, str2, i, i2, 1L);
        }
        if (s == 4) {
            return C11697x1.m55250kk().m55271up().m55137x1(str, str2, i, i2, 1073741824L);
        }
        if (s == 5) {
            return C11697x1.m55250kk().m55271up().m55137x1(str, str2, i, i2, 268435456L);
        }
        throw new ArgumentException(m67402k4("Invalid value '{0}' for StringComparison", Short.valueOf(s)), "comparisonType");
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m67448x1(String str, String str2) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (str2 != null) {
            return C11697x1.m55252to().m55271up().m55138x1(str, str2, 0L);
        }
        throw new ArgumentNullException("value");
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67381k4(String str, String str2, int i, short s) {
        if (str != null) {
            return m67438x1(str, str2, i, str.length() - i, s);
        }
        throw new NullReferenceException();
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m67449x1(String str, String str2, short s) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (str2 == null) {
            throw new ArgumentNullException("value");
        }
        if (s == 0) {
            return C11697x1.m55252to().m55271up().m55134kk(str, str2, 0L);
        }
        if (s == 1) {
            return C11697x1.m55252to().m55271up().m55134kk(str, str2, 1L);
        }
        if (s == 2) {
            return C11697x1.m55250kk().m55271up().m55134kk(str, str2, 0L);
        }
        if (s == 3) {
            return C11697x1.m55250kk().m55271up().m55134kk(str, str2, 1L);
        }
        if (s == 4) {
            return C11697x1.m55252to().m55271up().m55134kk(str, str2, 1073741824L);
        }
        if (s == 5) {
            return C11697x1.m55252to().m55271up().m55134kk(str, str2, 268435456L);
        }
        throw new ArgumentException(m67402k4("Invalid value '{0}' for StringComparison", Short.valueOf(s)), "comparisonType");
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67382k4(String str, String str2, boolean z) {
        return C11697x1.m55252to().m55271up().m55132k4(str, str2, z ? 1L : 0L);
    }

    /* JADX INFO: renamed from: x1 */
    public static String[] m67450x1(String str, char[] cArr, int i, int i2) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Count cannot be less than zero.");
        }
        if (i2 != 0 && i2 != 1) {
            throw new ArgumentException(m67407k4("Illegal enum value: ", Integer.valueOf(i2), "."));
        }
        if (str.length() == 0 && (i2 & 1) != 0) {
            return new String[0];
        }
        if (i <= 1) {
            return i == 0 ? new String[0] : new String[]{str};
        }
        return m67415k4(str, cArr, i, i2 != 0);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67383k4(String str, String str2, boolean z, C11697x1 c11697x1) {
        if (c11697x1 != null) {
            return c11697x1.m55271up().m55132k4(str, str2, z ? 1L : 0L);
        }
        throw new ArgumentNullException("culture");
    }

    /* JADX INFO: renamed from: x1 */
    public static String[] m67451x1(String str, String[] strArr, int i, int i2) {
        int iM67438x1;
        if (str == null) {
            throw new NullReferenceException();
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Count cannot be less than zero.");
        }
        if (i2 != 0 && i2 != 1) {
            throw new ArgumentException(m67407k4("Illegal enum value: ", Integer.valueOf(i2), "."));
        }
        if (i <= 1) {
            return i == 0 ? new String[0] : new String[]{str};
        }
        boolean z = (i2 & 1) != 0;
        if (strArr == null || strArr.length == 0) {
            return m67415k4(str, (char[]) null, i, z);
        }
        if (str.length() == 0 && z) {
            return new String[0];
        }
        List list = new List();
        int length = 0;
        int i3 = 0;
        while (length < str.length()) {
            int i4 = Integer.MAX_VALUE;
            int i5 = -1;
            for (int i6 = 0; i6 < strArr.length; i6++) {
                String str2 = strArr[i6];
                if (str2 != null && str2.length() != 0 && (iM67438x1 = m67438x1(str, str2, length, str.length() - length, (short) 4)) >= 0 && iM67438x1 < i4) {
                    i5 = i6;
                    i4 = iM67438x1;
                }
            }
            if (i5 == -1) {
                break;
            }
            if (i4 != length || !z) {
                if (list.size() == i - 1) {
                    break;
                }
                list.addItem(m67443x1(str, length, i4 - length));
            }
            length = strArr[i5].length() + i4;
            i3++;
        }
        if (i3 == 0) {
            return new String[]{str};
        }
        if (z && i3 != 0 && length == str.length() && list.size() == 0) {
            return new String[0];
        }
        if (!z || length != str.length()) {
            list.addItem(m67422kk(str, length));
        }
        return (String[]) list.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67384k4(String str, char[] cArr) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (cArr == null) {
            throw new ArgumentNullException();
        }
        if (str.length() == 0) {
            return -1;
        }
        return m67385k4(str, cArr, 0);
    }

    /* JADX INFO: renamed from: x1 */
    private static String[] m67452x1(Object[] objArr) {
        String[] strArr = new String[objArr.length];
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            strArr[i] = obj == null ? f47374k4 : obj.toString();
        }
        return strArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67385k4(String str, char[] cArr, int i) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (cArr == null) {
            throw new ArgumentNullException();
        }
        if (i < 0 || i > str.length()) {
            throw new ArgumentOutOfRangeException();
        }
        if (m67411k4(str) || cArr.length == 0 || i > str.length()) {
            return -1;
        }
        return m67386k4(str, cArr, i, str.length() - i);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67386k4(String str, char[] cArr, int i, int i2) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (cArr == null) {
            throw new ArgumentNullException();
        }
        if (i < 0 || i > str.length()) {
            throw new ArgumentOutOfRangeException();
        }
        if (i2 < 0 || i > str.length() - i2) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Count cannot be negative, and startIndex + count must be less than length of the string.");
        }
        int i3 = i2 + i;
        int i4 = i3 - 1;
        int length = cArr.length;
        int i5 = length - 1;
        while (i < i3) {
            char cCharAt = str.charAt(i);
            for (int i6 = 0; i6 < length; i6++) {
                if (cArr[i6] == cCharAt && (i >= i4 || i6 >= i5 || !Character.isHighSurrogate(cCharAt) || cArr[i6 + 1] == str.charAt(i + 1))) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m67387k4(String str, int[] iArr) {
        int i = iArr[0];
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || '9' < cCharAt) {
                break;
            }
            i2 = ((i2 * 10) + cCharAt) - 48;
            i++;
        }
        if (i == iArr[0] || i == length) {
            return -1;
        }
        iArr[0] = i;
        return i2;
    }

    /* JADX INFO: renamed from: k4 */
    public static C6765kp m67388k4(C6765kp c6765kp, InterfaceC14073kp interfaceC14073kp, String str, Object... objArr) {
        if (interfaceC14073kp == null) {
            interfaceC14073kp = C11683c5.m55033ck();
        }
        if (str == null) {
            throw new ArgumentNullException("format");
        }
        if (objArr == null) {
            throw new ArgumentNullException("args");
        }
        if (c6765kp == null) {
            int i = 0;
            int length = 0;
            while (i < objArr.length) {
                Object obj = objArr[i];
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 == null) {
                    break;
                }
                length += str2.length();
                i++;
            }
            c6765kp = i == objArr.length ? new C6765kp(str.length() + length) : new C6765kp();
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            int i4 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt == '{') {
                c6765kp.m26793k4(str, i3, (i4 - i3) - 1);
                if (str.charAt(i4) == '{') {
                    i2 += 2;
                    i3 = i4;
                } else {
                    int[] iArr = {i4};
                    int[] iArr2 = {0};
                    int[] iArr3 = {0};
                    boolean[] zArr = {false};
                    String[] strArr = {null};
                    m67410k4(str, iArr, iArr2, iArr3, zArr, strArr);
                    i3 = iArr[0];
                    int i5 = iArr2[0];
                    int i6 = iArr3[0];
                    boolean z = zArr[0];
                    String str3 = strArr[0];
                    if (i5 >= objArr.length) {
                        throw new FormatException("Index (zero based) must be greater than or equal to zero and less than the size of the argument list.");
                    }
                    Object obj2 = objArr[i5];
                    InterfaceC14105wp interfaceC14105wp = interfaceC14073kp != null ? (InterfaceC14105wp) interfaceC14073kp.mo55052k4(f47375kk) : null;
                    String strM67329k4 = obj2 == null ? f47374k4 : interfaceC14105wp != null ? interfaceC14105wp.m67329k4(str3, obj2, interfaceC14073kp) : m67446x1(obj2) ? C3205up.m13810k4(obj2, str3, interfaceC14073kp) : obj2 instanceof InterfaceC14061gi ? ((InterfaceC14061gi) obj2).mo66517k4(str3, interfaceC14073kp) : obj2.toString();
                    if (strM67329k4 == null) {
                        strM67329k4 = f47374k4;
                    }
                    if (i6 > strM67329k4.length()) {
                        int length2 = i6 - strM67329k4.length();
                        if (z) {
                            c6765kp.m26792k4(strM67329k4);
                            c6765kp.m26783k4(ControlChar.SPACE_CHAR, length2);
                            i2 = i3;
                        } else {
                            c6765kp.m26783k4(ControlChar.SPACE_CHAR, length2);
                            c6765kp.m26792k4(strM67329k4);
                            i2 = i3;
                        }
                    } else {
                        c6765kp.m26792k4(strM67329k4);
                        i2 = i3;
                    }
                }
            } else if (cCharAt == '}' && i4 < str.length() && str.charAt(i4) == '}') {
                c6765kp.m26793k4(str, i3, (i4 - i3) - 1);
                i2 += 2;
                i3 = i4;
            } else {
                if (cCharAt == '}') {
                    throw new FormatException("Input string was not in a correct format.");
                }
                i2 = i4;
            }
        }
        if (i3 < str.length()) {
            c6765kp.m26793k4(str, i3, str.length() - i3);
        }
        return c6765kp;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67389k4(char c, int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f);
        }
        if (i == 0) {
            return "";
        }
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = c;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: k4 */
    private static String m67390k4(int i, char c) throws IndexOutOfBoundsException {
        if (i < 0) {
            throw new IndexOutOfBoundsException(C21532OooOOo.OooO0OO(i, "Cannot pad a negative amount: "));
        }
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = c;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67391k4(InterfaceC14073kp interfaceC14073kp, String str, Object... objArr) {
        return m67388k4((C6765kp) null, interfaceC14073kp, str, objArr).toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67392k4(Object obj) {
        return obj == null ? f47374k4 : obj.getClass() == Byte.TYPE ? m67392k4((Byte) obj) : new String(obj.toString());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67393k4(String str, char c, char c2) {
        if (str != null) {
            return str.replace(c, c2);
        }
        throw new NullReferenceException();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67394k4(String str, int i) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("startIndex", "StartIndex can not be less than zero");
        }
        if (i < str.length()) {
            return m67396k4(str, i, str.length() - i);
        }
        throw new ArgumentOutOfRangeException("startIndex", "StartIndex must be less than the length of the string");
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67395k4(String str, int i, char c) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("totalWidth", "< 0");
        }
        int length = i - str.length();
        return length <= 0 ? str : m67390k4(length, c).concat(str);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67396k4(String str, int i, int i2) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("startIndex", "Cannot be negative.");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Cannot be negative.");
        }
        if (i <= str.length() - i2) {
            return new StringBuilder(str).delete(i, i2 + i).toString();
        }
        throw new ArgumentOutOfRangeException(C18293o1.f55803f, "startIndex + count > this.length");
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67397k4(String str, int i, String str2) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (str2 == null) {
            throw new ArgumentNullException("value");
        }
        if (i < 0 || i > str.length()) {
            throw new ArgumentOutOfRangeException("startIndex", "Cannot be negative and must be less than or equal to length of string.");
        }
        return str2.length() == 0 ? str : str.length() == 0 ? str2 : new StringBuilder(str).insert(i, str2).toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67398k4(String str, C11697x1 c11697x1) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (c11697x1 != null) {
            return str.toLowerCase(C11697x1.m55246k4(c11697x1));
        }
        throw new ArgumentNullException("culture");
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67399k4(String str, Object obj) {
        if (str == null) {
            str = "";
        }
        return str + obj;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67400k4(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return str.concat(str2);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67401k4(String str, String str2, String str3) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (str2 == null) {
            throw new ArgumentNullException("oldValue");
        }
        if (str2.length() == 0) {
            throw new ArgumentException("oldValue is the empty string.");
        }
        if (str.length() == 0) {
            return str;
        }
        if (str3 == null) {
            str3 = f47374k4;
        }
        return str.replace(str2, str3);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67402k4(String str, Object... objArr) {
        if (str == null) {
            throw new ArgumentNullException("format");
        }
        if (objArr != null) {
            return m67391k4((InterfaceC14073kp) null, str, objArr);
        }
        throw new ArgumentNullException("args");
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67403k4(String str, String[] strArr) {
        if (strArr == null) {
            throw new ArgumentNullException("value");
        }
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str2 : strArr) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            if (str2 != null) {
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67404k4(String str, String[] strArr, int i, int i2) {
        if (strArr == null) {
            throw new ArgumentNullException("value");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("startIndex", "< 0");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "< 0");
        }
        if (i > strArr.length - i2) {
            throw new ArgumentOutOfRangeException("startIndex", "startIndex + count > value.length");
        }
        if (i == strArr.length) {
            return f47374k4;
        }
        if (str == null) {
            str = f47374k4;
        }
        String strM67408k4 = f47374k4;
        boolean z = true;
        for (int i3 = i; i3 < i + i2; i3++) {
            String str2 = strArr[i3];
            String str3 = str2 == null ? f47374k4 : str2;
            if (z) {
                strM67408k4 = m67427m9(str2);
                z = false;
            } else {
                strM67408k4 = m67408k4(strM67408k4, str, str3);
            }
        }
        return strM67408k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67405k4(char[] cArr) {
        return cArr == null ? f47374k4 : new String(cArr);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67406k4(char[] cArr, int i, int i2) {
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("length");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("startIndex");
        }
        if (cArr == null) {
            throw new ArgumentNullException("value");
        }
        if (((long) i) + ((long) i2) <= cArr.length) {
            return new String(cArr, i, i2);
        }
        throw new ArgumentOutOfRangeException("startIndex");
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67407k4(Object... objArr) {
        if (objArr == null) {
            return null;
        }
        return objArr.length == 0 ? "" : m67445x1(m67452x1(objArr)).toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67408k4(String... strArr) {
        if (strArr == null) {
            return null;
        }
        return strArr.length == 0 ? "" : m67445x1(strArr).toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67409k4(String str, int i, char[] cArr, int i2, int i3) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (cArr == null) {
            throw new ArgumentNullException(FirebaseAnalytics.Param.DESTINATION);
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("sourceIndex", "Cannot be negative");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("destinationIndex", "Cannot be negative.");
        }
        if (i3 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Cannot be negative.");
        }
        if (i > str.length() - i3) {
            throw new ArgumentOutOfRangeException("sourceIndex", "sourceIndex + count > Length");
        }
        if (i2 > cArr.length - i3) {
            throw new ArgumentOutOfRangeException("destinationIndex", "destinationIndex + count > destination.Length");
        }
        str.getChars(i, i3 + i, cArr, i2);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m67410k4(String str, int[] iArr, int[] iArr2, int[] iArr3, boolean[] zArr, String[] strArr) {
        int length = str.length();
        int iM67387k4 = m67387k4(str, iArr);
        iArr2[0] = iM67387k4;
        if (iM67387k4 < 0) {
            throw new FormatException("Input string was not in a correct format.");
        }
        int i = iArr[0];
        if (i >= length || str.charAt(i) != ',') {
            iArr3[0] = 0;
            zArr[0] = false;
            strArr[0] = f47374k4;
        } else {
            iArr[0] = iArr[0] + 1;
            while (true) {
                int i2 = iArr[0];
                if (i2 >= length || !C14117yj.m67534ks(str.charAt(i2))) {
                    break;
                } else {
                    iArr[0] = iArr[0] + 1;
                }
            }
            strArr[0] = m67443x1(str, iArr[0], 0);
            int i3 = iArr[0];
            boolean z = i3 < length && str.charAt(i3) == '-';
            zArr[0] = z;
            if (z) {
                iArr[0] = iArr[0] + 1;
            }
            int iM67387k42 = m67387k4(str, iArr);
            iArr3[0] = iM67387k42;
            if (iM67387k42 < 0) {
                throw new FormatException("Input string was not in a correct format.");
            }
        }
        int i4 = iArr[0];
        if (i4 >= length || str.charAt(i4) != ':') {
            strArr[0] = null;
        } else {
            int i5 = iArr[0] + 1;
            iArr[0] = i5;
            while (true) {
                int i6 = iArr[0];
                if (i6 >= length || str.charAt(i6) == '}') {
                    break;
                } else {
                    iArr[0] = iArr[0] + 1;
                }
            }
            strArr[0] = m67400k4(strArr[0], m67443x1(str, i5, iArr[0] - i5));
        }
        int i7 = iArr[0];
        if (i7 < length) {
            iArr[0] = i7 + 1;
            if (str.charAt(i7) == '}') {
                return;
            }
        }
        throw new FormatException("Input string was not in a correct format.");
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m67411k4(String str) {
        return str == null || str.length() == 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m67412k4(String str, String str2, short s) {
        if (str == null) {
            throw new NullReferenceException();
        }
        if (str2 == null) {
            throw new ArgumentNullException("value");
        }
        if (s == 0) {
            return C11697x1.m55252to().m55271up().m55138x1(str, str2, 0L);
        }
        if (s == 1) {
            return C11697x1.m55252to().m55271up().m55138x1(str, str2, 1L);
        }
        if (s == 2) {
            return C11697x1.m55250kk().m55271up().m55138x1(str, str2, 0L);
        }
        if (s == 3) {
            return C11697x1.m55250kk().m55271up().m55138x1(str, str2, 1L);
        }
        if (s == 4) {
            return C11697x1.m55252to().m55271up().m55138x1(str, str2, 1073741824L);
        }
        if (s == 5) {
            return C11697x1.m55252to().m55271up().m55138x1(str, str2, 268435456L);
        }
        throw new ArgumentException(m67402k4("Invalid value '{0}' for StringComparison", Short.valueOf(s)), "comparisonType");
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m67413k4(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static String[] m67414k4(String str, char c) {
        if (str == null) {
            throw new NullReferenceException();
        }
        int[] iArr = new int[str.length()];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) == c) {
                iArr[i2] = i3;
                i2++;
            }
        }
        String[] strArr = new String[i2 + 1];
        if (i2 == 0) {
            strArr[0] = str;
            return strArr;
        }
        int i4 = 0;
        int i5 = 0;
        while (i < i2) {
            int i6 = iArr[i];
            strArr[i4] = str.substring(i5, i6);
            i5 = i6 + 1;
            i++;
            i4++;
        }
        strArr[i4] = str.substring(i5, str.length());
        return strArr;
    }

    /* JADX INFO: renamed from: k4 */
    private static String[] m67415k4(String str, char[] cArr, int i, boolean z) {
        if (cArr == null || cArr.length == 0) {
            cArr = f47376x1;
        }
        int[] iArr = new int[str.length()];
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= cArr.length) {
                    break;
                }
                if (str.charAt(i3) == cArr[i4]) {
                    iArr[i2] = i3;
                    i2++;
                    break;
                }
                i4++;
            }
        }
        if (i2 == str.length() && z) {
            return new String[0];
        }
        int i5 = (i == Integer.MAX_VALUE || i >= i2) ? i2 : i;
        int i6 = i5 + 1;
        String[] strArr = new String[i6];
        if (i2 == 0) {
            strArr[0] = str;
            return strArr;
        }
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i5 && (i == Integer.MAX_VALUE || i9 < i - 1); i9++) {
            int i10 = iArr[i9];
            String strSubstring = str.substring(i7, i10);
            if (!strSubstring.equals(f47374k4) || !z) {
                strArr[i8] = strSubstring;
                i8++;
            }
            i7 = i10 + 1;
        }
        String strSubstring2 = str.substring(i7, str.length());
        if (!z || !strSubstring2.equals(f47374k4)) {
            if (strSubstring2.length() > 0) {
                strSubstring2 = m67428m9(strSubstring2, cArr);
            }
            strArr[i8] = strSubstring2;
        }
        if (i6 > i && !z) {
            String[] strArr2 = new String[i];
            AbstractC14092to.m67234k4(strArr, 0, strArr2, 0, i);
            return strArr2;
        }
        if (!z) {
            return strArr;
        }
        int[] iArr2 = new int[i6];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i6; i13++) {
            String str2 = strArr[i13];
            if (str2 != null && !str2.equals(f47374k4)) {
                iArr2[i11] = i12;
                i11++;
            }
            i12++;
        }
        if (i11 <= 0) {
            return new String[0];
        }
        String[] strArr3 = new String[i11];
        for (int i14 = 0; i14 < i11; i14++) {
            strArr3[i14] = strArr[iArr2[i14]];
        }
        if (i11 < i) {
            int i15 = i11 - 1;
            if (m67384k4(strArr3[i15], cArr) != -1) {
                if (i11 == 1) {
                    return m67415k4(strArr3[i15], cArr, i, z);
                }
                String[] strArrM67415k4 = m67415k4(strArr3[i15], cArr, i - i11, z);
                for (int i16 = 0; i16 < strArrM67415k4.length; i16++) {
                    strArr3[i15 + i16] = strArrM67415k4[0];
                }
            }
        }
        return strArr3;
    }

    /* JADX INFO: renamed from: k4 */
    public static String[] m67416k4(String str, char[] cArr, short s) {
        if (str != null) {
            return m67450x1(str, cArr, Integer.MAX_VALUE, s);
        }
        throw new NullReferenceException();
    }

    /* JADX INFO: renamed from: k4 */
    public static String[] m67417k4(String str, String[] strArr, int i) {
        if (str != null) {
            return m67451x1(str, strArr, Integer.MAX_VALUE, i);
        }
        throw new NullReferenceException();
    }
}
