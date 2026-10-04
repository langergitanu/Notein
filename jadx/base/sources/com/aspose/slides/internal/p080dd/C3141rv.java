package com.aspose.slides.internal.p080dd;

import androidx.core.content.OooO0O0;
import com.aspose.slides.OooO0OO;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p234ko.C5892kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.dd.rv */
/* JADX INFO: loaded from: classes3.dex */
public final class C3141rv {

    /* JADX INFO: renamed from: c5 */
    private static String f9297c5;

    /* JADX INFO: renamed from: du */
    static String f9298du;

    /* JADX INFO: renamed from: dy */
    private static boolean f9299dy;

    /* JADX INFO: renamed from: h4 */
    public static char f9300h4;

    /* JADX INFO: renamed from: k4 */
    @Deprecated
    public static char[] f9301k4;

    /* JADX INFO: renamed from: kk */
    public static char f9302kk;

    /* JADX INFO: renamed from: m9 */
    static char[] f9303m9;

    /* JADX INFO: renamed from: to */
    public static char f9304to;

    /* JADX INFO: renamed from: x1 */
    public static char f9305x1;

    static {
        boolean z = C14052dq.f47191x1;
        char c = IOUtils.DIR_SEPARATOR_WINDOWS;
        char c2 = IOUtils.DIR_SEPARATOR_UNIX;
        f9302kk = z ? '\\' : '/';
        if (z) {
            c = '/';
        }
        f9305x1 = c;
        if (z) {
            c2 = ':';
        }
        f9300h4 = c2;
        f9304to = ';';
        f9301k4 = m13408kk();
        f9298du = C14117yj.m67537ne(f9302kk);
        char c3 = f9302kk;
        char c4 = f9300h4;
        f9303m9 = new char[]{c3, f9305x1, c4};
        f9299dy = c3 == c4;
    }

    /* JADX INFO: renamed from: c5 */
    public static String m13395c5(String str) {
        if (str.length() < 2 || str.charAt(1) != ':' || !C14117yj.m67519h4(str.charAt(0))) {
            return str;
        }
        String strM13417k4 = C3142to.m13417k4();
        return str.length() == 2 ? strM13417k4.charAt(0) == str.charAt(0) ? strM13417k4 : C14113y2.m67441x1(str, IOUtils.DIR_SEPARATOR_WINDOWS) : (str.charAt(2) == f9302kk || str.charAt(2) == f9305x1) ? str : strM13417k4.charAt(0) == str.charAt(0) ? m13412x1(strM13417k4, C14113y2.m67443x1(str, 2, str.length() - 2)) : C14113y2.m67408k4(C14113y2.m67443x1(str, 0, 2), f9298du, OooO0OO.OooO00o(2, 2, str, str));
    }

    /* JADX INFO: renamed from: ck */
    public static String m13396ck(String str) {
        int i = 2;
        while (i < str.length() && !m13405k4(str.charAt(i))) {
            i++;
        }
        if (i < str.length()) {
            do {
                i++;
                if (i >= str.length()) {
                    break;
                }
            } while (!m13405k4(str.charAt(i)));
        }
        return C14113y2.m67393k4(C14113y2.m67443x1(str, 2, i - 2), f9305x1, f9302kk);
    }

    /* JADX INFO: renamed from: du */
    public static String m13397du(String str) {
        if (str == null) {
            return null;
        }
        if (C14113y2.m67384k4(str, f9301k4) != -1) {
            throw new ArgumentException("Illegal characters in path.");
        }
        int iM13399fa = m13399fa(str);
        return (iM13399fa <= -1 || iM13399fa >= str.length() + (-1)) ? C14113y2.f47374k4 : C14113y2.m67422kk(str, iM13399fa);
    }

    /* JADX INFO: renamed from: dy */
    public static String m13398dy(String str) {
        int i;
        char cCharAt;
        int i2;
        char cCharAt2;
        int length = str.length();
        char cCharAt3 = str.charAt(0);
        int i3 = (length > 2 && cCharAt3 == '\\' && str.charAt(1) == '\\') ? 2 : 0;
        if (length != 1 || (cCharAt3 != f9302kk && cCharAt3 != f9305x1)) {
            int i4 = 0;
            for (int i5 = i3; i5 < length; i5++) {
                char cCharAt4 = str.charAt(i5);
                if ((cCharAt4 == f9302kk || cCharAt4 == f9305x1) && ((i2 = i5 + 1) == length || (cCharAt2 = str.charAt(i2)) == f9302kk || cCharAt2 == f9305x1)) {
                    i4++;
                }
            }
            if (i4 != 0) {
                int i6 = length - i4;
                char[] cArr = new char[i6];
                if (i3 != 0) {
                    cArr[0] = IOUtils.DIR_SEPARATOR_WINDOWS;
                    cArr[1] = IOUtils.DIR_SEPARATOR_WINDOWS;
                }
                int i7 = i3;
                while (i3 < length && i7 < i6) {
                    char cCharAt5 = str.charAt(i3);
                    char c = f9302kk;
                    if (cCharAt5 == c || cCharAt5 == f9305x1) {
                        int i8 = i7 + 1;
                        if (i8 != i6) {
                            cArr[i7] = c;
                            while (i3 < length - 1 && ((cCharAt = str.charAt((i = i3 + 1))) == f9302kk || cCharAt == f9305x1)) {
                                i3 = i;
                            }
                            i7 = i8;
                        }
                    } else {
                        cArr[i7] = cCharAt5;
                        i7++;
                    }
                    i3++;
                }
                return C14113y2.m67405k4(cArr);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: fa */
    private static int m13399fa(String str) {
        int iM67418kk;
        if (str == null || (iM67418kk = C14113y2.m67418kk(str, FilenameUtils.EXTENSION_SEPARATOR)) <= C14113y2.m67439x1(str, f9303m9)) {
            return -1;
        }
        return iM67418kk;
    }

    /* JADX INFO: renamed from: h4 */
    public static String m13400h4(String str) {
        if (C14113y2.m67363du(str, C14113y2.f47374k4)) {
            throw new ArgumentException("Invalid path");
        }
        if (str == null || C14113y2.m67363du(m13410to(str), str)) {
            return null;
        }
        if (C14113y2.m67440x1(str).length() == 0) {
            throw new ArgumentException("Argument string consists of whitespace characters only.");
        }
        if (C14113y2.m67384k4(str, f9301k4) > -1) {
            throw new ArgumentException("Path contains invalid characters");
        }
        int iM67439x1 = C14113y2.m67439x1(str, f9303m9);
        if (iM67439x1 == 0) {
            iM67439x1++;
        }
        if (iM67439x1 <= 0) {
            return C14113y2.f47374k4;
        }
        String strM67443x1 = C14113y2.m67443x1(str, 0, iM67439x1);
        int length = strM67443x1.length();
        return (length >= 2 && f9302kk == '\\' && strM67443x1.charAt(length + (-1)) == f9300h4) ? C14113y2.m67407k4(strM67443x1, Character.valueOf(f9302kk)) : m13398dy(strM67443x1);
    }

    /* JADX INFO: renamed from: jd */
    public static String m13401jd(String str) {
        if (str == null) {
            return str;
        }
        if (C14052dq.f47191x1) {
            str = C14113y2.m67440x1(str);
        }
        if (str.length() == 0) {
            return str;
        }
        String strM13410to = m13410to(str);
        String[] strArrM67369h4 = C14113y2.m67369h4(str, f9302kk, f9305x1);
        boolean z = C14052dq.f47191x1 && strM13410to.length() > 2 && m13405k4(strM13410to.charAt(0)) && m13405k4(strM13410to.charAt(1));
        int i = z ? 3 : 0;
        int i2 = 0;
        for (int i3 = 0; i3 < strArrM67369h4.length; i3++) {
            if (C14052dq.f47191x1) {
                strArrM67369h4[i3] = C14113y2.m67362du(strArrM67369h4[i3], new char[0]);
            }
            if (!".".equals(strArrM67369h4[i3]) && (i3 == 0 || strArrM67369h4[i3].length() != 0)) {
                if (!"..".equals(strArrM67369h4[i3])) {
                    strArrM67369h4[i2] = strArrM67369h4[i3];
                    i2++;
                } else if (i2 > i) {
                    i2--;
                }
            }
        }
        if (i2 == 0 || (i2 == 1 && "".equals(strArrM67369h4[0]))) {
            return strM13410to;
        }
        String strM67404k4 = C14113y2.m67404k4(f9298du, strArrM67369h4, 0, i2);
        if (!C14052dq.f47191x1) {
            return strM67404k4;
        }
        if (z) {
            strM67404k4 = C14113y2.m67408k4(f9298du, strM67404k4);
        }
        if (!m13407kk(strM13410to, strM67404k4)) {
            strM67404k4 = C14113y2.m67408k4(strM13410to, strM67404k4);
        }
        if (z) {
            return strM67404k4;
        }
        if (!m13405k4(str.charAt(0)) && m13407kk(strM13410to, str)) {
            return (strM67404k4.length() > 2 || C14113y2.m67424kk(strM67404k4, f9298du)) ? strM67404k4 : C14113y2.m67441x1(strM67404k4, f9302kk);
        }
        String strM13417k4 = C3142to.m13417k4();
        if (strM13417k4.length() <= 1 || strM13417k4.charAt(1) != f9300h4) {
            return (m13405k4(strM13417k4.charAt(strM13417k4.length() - 1)) && m13405k4(strM67404k4.charAt(0))) ? C14113y2.m67408k4(strM13417k4, C14113y2.m67422kk(strM67404k4, 1)) : C14113y2.m67408k4(strM13417k4, strM67404k4);
        }
        if (strM67404k4.length() == 0 || m13405k4(strM67404k4.charAt(0))) {
            strM67404k4 = C14113y2.m67441x1(strM67404k4, IOUtils.DIR_SEPARATOR_WINDOWS);
        }
        return C14113y2.m67408k4(C14113y2.m67443x1(strM13417k4, 0, 2), strM67404k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m13402k4() {
        if (f9297c5 == null) {
            String absolutePath = C5892kk.m23741x1().getAbsolutePath();
            if (absolutePath.length() > 0) {
                char cOooO00o = OooO0O0.OooO00o(1, absolutePath);
                char c = f9302kk;
                if (cOooO00o != c) {
                    f9297c5 = C14113y2.m67407k4(absolutePath, Character.valueOf(c));
                }
            }
        }
        return f9297c5;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m13406kk(String str) {
        boolean z;
        if (str == null) {
            throw new ArgumentNullException("path");
        }
        if (C14113y2.m67440x1(str).length() == 0) {
            throw new ArgumentException("The specified path is empty");
        }
        if (C14052dq.f47191x1) {
            str = m13395c5(str);
        }
        char cOooO00o = OooO0O0.OooO00o(1, str);
        if (str.length() >= 2 && m13405k4(str.charAt(0)) && m13405k4(str.charAt(1))) {
            if (str.length() == 2 || C14113y2.m67434x1(str, str.charAt(0), 2) < 0) {
                throw new ArgumentException("UNC paths should be of the form \\\\server\\share.");
            }
            char cCharAt = str.charAt(0);
            char c = f9302kk;
            if (cCharAt != c) {
                str = C14113y2.m67393k4(str, f9305x1, c);
            }
        } else {
            if (!m13409m9(str)) {
                if (!C14052dq.f47191x1) {
                    int iM67434x1 = 0;
                    do {
                        iM67434x1 = C14113y2.m67434x1(str, FilenameUtils.EXTENSION_SEPARATOR, iM67434x1);
                        if (iM67434x1 == -1 || (iM67434x1 = iM67434x1 + 1) == str.length() || str.charAt(iM67434x1) == f9302kk) {
                            break;
                        }
                    } while (str.charAt(iM67434x1) != f9305x1);
                    z = iM67434x1 > 0;
                    str = C14113y2.m67408k4(C3142to.m13417k4(), f9298du, str);
                }
                if (z) {
                    str = m13401jd(str);
                }
                if (m13405k4(cOooO00o)) {
                    return str;
                }
                char cOooO00o2 = OooO0O0.OooO00o(1, str);
                char c2 = f9302kk;
                return cOooO00o2 != c2 ? C14113y2.m67441x1(str, c2) : str;
            }
            if (f9302kk == '\\' && str.length() >= 2 && m13405k4(str.charAt(0)) && !m13405k4(str.charAt(1))) {
                String strM13417k4 = C3142to.m13417k4();
                str = strM13417k4.charAt(1) == f9300h4 ? C14113y2.m67408k4(C14113y2.m67443x1(strM13417k4, 0, 2), str) : C14113y2.m67443x1(strM13417k4, 0, C14113y2.m67434x1(strM13417k4, IOUtils.DIR_SEPARATOR_WINDOWS, C14113y2.m67364dy(strM13417k4, "\\\\") + 1));
            }
        }
        z = true;
        if (z) {
        }
        if (m13405k4(cOooO00o)) {
        }
    }

    /* JADX INFO: renamed from: m9 */
    public static boolean m13409m9(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (C14113y2.m67384k4(str, f9301k4) != -1) {
            throw new ArgumentException("Illegal characters in path.");
        }
        char cCharAt = str.charAt(0);
        return cCharAt == f9302kk || cCharAt == f9305x1 || (!f9299dy && str.length() > 1 && str.charAt(1) == f9300h4);
    }

    /* JADX INFO: renamed from: to */
    public static String m13410to(String str) {
        if (str == null) {
            return null;
        }
        if (C14113y2.m67440x1(str).length() == 0) {
            throw new ArgumentException("The specified path is not of a legal form.");
        }
        if (!m13409m9(str)) {
            return C14113y2.f47374k4;
        }
        if (f9302kk == '/') {
            return m13405k4(str.charAt(0)) ? f9298du : C14113y2.f47374k4;
        }
        if (str.length() == 1 && m13405k4(str.charAt(0))) {
            return f9298du;
        }
        int i = 2;
        if (str.length() < 2) {
            return C14113y2.f47374k4;
        }
        if (!m13405k4(str.charAt(0)) || !m13405k4(str.charAt(1))) {
            if (m13405k4(str.charAt(0))) {
                return f9298du;
            }
            if (str.charAt(1) != f9300h4) {
                return C14113y2.m67443x1(C3142to.m13417k4(), 0, 2);
            }
            if (str.length() >= 3 && m13405k4(str.charAt(2))) {
                i = 3;
            }
            return C14113y2.m67443x1(str, 0, i);
        }
        int i2 = 2;
        while (i2 < str.length() && !m13405k4(str.charAt(i2))) {
            i2++;
        }
        if (i2 < str.length()) {
            do {
                i2++;
                if (i2 >= str.length()) {
                    break;
                }
            } while (!m13405k4(str.charAt(i2)));
        }
        String str2 = f9298du;
        return C14113y2.m67408k4(str2, str2, C14113y2.m67393k4(C14113y2.m67443x1(str, 2, i2 - 2), f9305x1, f9302kk));
    }

    /* JADX INFO: renamed from: x1 */
    public static String m13411x1(String str) {
        return m13404k4(m13403k4(str), null);
    }

    /* JADX INFO: renamed from: x1 */
    public static String m13412x1(String str, String str2) {
        if (str == null) {
            throw new ArgumentNullException("path1");
        }
        if (str2 == null) {
            throw new ArgumentNullException("path2");
        }
        if (str.length() != 0) {
            if (str2.length() == 0) {
                return str;
            }
            if (C14113y2.m67384k4(str, f9301k4) != -1) {
                throw new ArgumentException("Illegal characters in path.");
            }
            if (C14113y2.m67384k4(str2, f9301k4) != -1) {
                throw new ArgumentException("Illegal characters in path.");
            }
            if (!m13409m9(str2)) {
                char cOooO00o = OooO0O0.OooO00o(1, str);
                return (cOooO00o == f9302kk || cOooO00o == f9305x1 || cOooO00o == f9300h4) ? C14113y2.m67408k4(str, str2) : C14113y2.m67408k4(str, f9298du, str2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m13403k4(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        if (C14113y2.m67384k4(str, f9301k4) != -1) {
            throw new ArgumentException("Illegal characters in path.");
        }
        int iM67439x1 = C14113y2.m67439x1(str, f9303m9);
        return iM67439x1 >= 0 ? C14113y2.m67422kk(str, iM67439x1 + 1) : str;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m13404k4(String str, String str2) {
        if (str == null) {
            return null;
        }
        if (C14113y2.m67384k4(str, f9301k4) != -1) {
            throw new ArgumentException("Illegal characters in path.");
        }
        int iM13399fa = m13399fa(str);
        if (str2 == null) {
            return iM13399fa < 0 ? str : C14113y2.m67443x1(str, 0, iM13399fa);
        }
        if (str2.length() == 0) {
            return iM13399fa < 0 ? C14113y2.m67407k4(str, Character.valueOf(FilenameUtils.EXTENSION_SEPARATOR)) : C14113y2.m67443x1(str, 0, iM13399fa + 1);
        }
        if (str.length() == 0) {
            str2 = C14113y2.f47374k4;
        } else if (str2.length() > 0 && str2.charAt(0) != '.') {
            str2 = C14113y2.m67408k4(".", str2);
        }
        return iM13399fa < 0 ? C14113y2.m67408k4(str, str2) : iM13399fa > 0 ? C14113y2.m67408k4(C14113y2.m67443x1(str, 0, iM13399fa), str2) : str2;
    }

    /* JADX INFO: renamed from: x1 */
    public static char[] m13413x1() {
        return C14052dq.f47191x1 ? new char[]{0, 1, 2, 3, 4, 5, 6, 7, '\b', '\t', '\n', ControlChar.LINE_BREAK_CHAR, '\f', ControlChar.PARAGRAPH_BREAK_CHAR, ControlChar.COLUMN_BREAK_CHAR, 15, 16, 17, 18, ControlChar.FIELD_START_CHAR, ControlChar.FIELD_SEPARATOR_CHAR, ControlChar.FIELD_END_CHAR, 22, 23, 24, 25, 26, 27, 28, 29, ControlChar.NON_BREAKING_HYPHEN_CHAR, ControlChar.OPTIONAL_HYPHEN_CHAR, '\"', '<', '>', '|', ':', '*', '?', IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX} : new char[]{0, IOUtils.DIR_SEPARATOR_UNIX};
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m13405k4(char c) {
        return c == f9302kk || c == f9305x1;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m13407kk(String str, String str2) {
        if (str.length() < 2 || str2.length() < 2) {
            return false;
        }
        if (m13405k4(str.charAt(0)) && m13405k4(str.charAt(1))) {
            return m13405k4(str2.charAt(0)) && m13405k4(str2.charAt(1)) && C14113y2.m67383k4(m13396ck(str), m13396ck(str2), true, C11697x1.m55250kk()) == 0;
        }
        if (!C14117yj.m67547x1(str.charAt(0), str2.charAt(0)) || str2.charAt(1) != f9300h4) {
            return false;
        }
        if (str.length() <= 2 || str2.length() <= 2) {
            return true;
        }
        return m13405k4(str.charAt(2)) && m13405k4(str2.charAt(2));
    }

    /* JADX INFO: renamed from: kk */
    public static char[] m13408kk() {
        return C14052dq.f47191x1 ? new char[]{'\"', '<', '>', '|', 0, 1, 2, 3, 4, 5, 6, 7, '\b', '\t', '\n', ControlChar.LINE_BREAK_CHAR, '\f', ControlChar.PARAGRAPH_BREAK_CHAR, ControlChar.COLUMN_BREAK_CHAR, 15, 16, 17, 18, ControlChar.FIELD_START_CHAR, ControlChar.FIELD_SEPARATOR_CHAR, ControlChar.FIELD_END_CHAR, 22, 23, 24, 25, 26, 27, 28, 29, ControlChar.NON_BREAKING_HYPHEN_CHAR, ControlChar.OPTIONAL_HYPHEN_CHAR} : new char[]{0};
    }
}
