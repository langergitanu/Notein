package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.OooO0OO;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.u1 */
/* JADX INFO: loaded from: classes5.dex */
public class C13988u1 {

    /* JADX INFO: renamed from: k4 */
    private static C14022y4 f46983k4 = C14022y4.m66318k4().Clone();

    /* JADX INFO: renamed from: k4 */
    public static int m66222k4(String str, int i) {
        int i2 = i;
        while (i2 < str.length() && (f46983k4.f47099k4[str.charAt(i2)] & 8) != 0) {
            i2++;
        }
        return i2 - i;
    }

    /* JADX INFO: renamed from: kk */
    public static int m66228kk(String str, int i) {
        int i2;
        if (i >= str.length()) {
            i2 = i;
        } else {
            if ((f46983k4.f47099k4[str.charAt(i)] & 4) == 0 && str.charAt(i) != ':') {
                return 0;
            }
            i2 = i + 1;
            while (i2 < str.length() && ((f46983k4.f47099k4[str.charAt(i2)] & 8) != 0 || str.charAt(i2) == ':')) {
                i2++;
            }
        }
        return i2 - i;
    }

    /* JADX INFO: renamed from: to */
    public static int m66230to(String str, int i) {
        int i2;
        if (i >= str.length()) {
            i2 = i;
        } else {
            if ((f46983k4.f47099k4[str.charAt(i)] & 4) == 0) {
                return 0;
            }
            i2 = i + 1;
            while (i2 < str.length() && (f46983k4.f47099k4[str.charAt(i2)] & 8) != 0) {
                i2++;
            }
        }
        return i2 - i;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m66231x1(String str) {
        return m66230to(str, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66223k4(String str, int i, int[] iArr) {
        int i2;
        int iM66230to;
        iArr[0] = 0;
        int iM66230to2 = m66230to(str, i);
        if (iM66230to2 == 0 || (i2 = i + iM66230to2) >= str.length() || str.charAt(i2) != ':' || (iM66230to = m66230to(str, i2 + 1)) == 0) {
            return iM66230to2;
        }
        iArr[0] = i2;
        return iM66230to + 1 + iM66230to2;
    }

    /* JADX INFO: renamed from: kk */
    public static String m66229kk(String str) {
        m66227k4(str, true);
        return str;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m66232x1(String str, int i) {
        int i2 = i;
        while (i2 < str.length() && ((f46983k4.f47099k4[str.charAt(i2)] & 8) != 0 || str.charAt(i2) == ':')) {
            i2++;
        }
        return i2 - i;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m66224k4(String str, int i, int i2) {
        if (i >= str.length()) {
            throw new XmlException("The empty string '' is not a valid name.", C14113y2.f47374k4);
        }
        if (f46983k4.m66342x1(str.charAt(i2)) && !C14022y4.m66318k4().m66336kk(str.charAt(i2))) {
            throw new XmlException("Name cannot begin with the '{0}' character, hexadecimal value {1}.", XmlException.buildCharExceptionArgs(str, i2));
        }
        throw new XmlException("The '{0}' character, hexadecimal value {1}, cannot be included in a name.", XmlException.buildCharExceptionArgs(str, i2));
    }

    /* JADX INFO: renamed from: x1 */
    public static Exception m66233x1(String str, int i, int i2) {
        return i >= str.length() ? new XmlException("The empty string '' is not a valid name.", C14113y2.f47374k4) : (!f46983k4.m66342x1(str.charAt(i2)) || f46983k4.m66336kk(str.charAt(i2))) ? new XmlException("The '{0}' character, hexadecimal value {1}, cannot be included in a name.", XmlException.buildCharExceptionArgs(str, i2)) : new XmlException("Name cannot begin with the '{0}' character, hexadecimal value {1}.", XmlException.buildCharExceptionArgs(str, i2));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m66225k4(String str, String[] strArr, String[] strArr2) {
        int[] iArr = {0};
        int iM66223k4 = m66223k4(str, 0, iArr);
        int i = iArr[0];
        if (iM66223k4 == 0 || iM66223k4 != str.length()) {
            m66224k4(str, 0, iM66223k4);
        }
        if (i != 0) {
            strArr[0] = C14113y2.m67443x1(str, 0, i);
            strArr2[0] = C14113y2.m67422kk(str, i + 1);
        } else {
            strArr[0] = "";
            strArr2[0] = str;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m66234x1(String str, String[] strArr, String[] strArr2) {
        int iM67429to = C14113y2.m67429to(str, ':');
        if (-1 == iM67429to) {
            strArr[0] = C14113y2.f47374k4;
            strArr2[0] = str;
        } else {
            if (iM67429to == 0 || str.length() - 1 == iM67429to) {
                throw new ArgumentException(C13968ri.m65819k4("The '{0}' character, hexadecimal value {1}, cannot be included in a name.", XmlException.buildCharExceptionArgs(':', (char) 0)), "name");
            }
            strArr[0] = C14113y2.m67443x1(str, 0, iM67429to);
            int i = iM67429to + 1;
            strArr2[0] = OooO0OO.OooO00o(i, i, str, str);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66226k4(String str) {
        int iM66228kk = m66228kk(str, 0);
        return iM66228kk > 0 && iM66228kk == str.length();
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m66227k4(String str, boolean z) {
        int iM66230to = m66230to(str, 0);
        if (iM66230to != 0 && iM66230to == str.length()) {
            return true;
        }
        if (z) {
            m66224k4(str, 0, iM66230to);
        }
        return false;
    }
}
