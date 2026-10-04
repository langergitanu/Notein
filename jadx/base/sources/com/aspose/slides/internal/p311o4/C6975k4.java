package com.aspose.slides.internal.p311o4;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p306ny.InterfaceC6962k4;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.internal.o4.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6975k4 {

    /* JADX INFO: renamed from: k4 */
    private static final char[] f18981k4 = {ControlChar.SPACE_CHAR, '\t', '\n', ControlChar.PARAGRAPH_BREAK_CHAR};

    /* JADX INFO: renamed from: du */
    private static String m27278du(String str, C5659x1 c5659x1, C12007ix c12007ix, InterfaceC6962k4 interfaceC6962k4) {
        if (C14113y2.m67411k4(str)) {
            return str;
        }
        if (c5659x1 == null) {
            throw new ArgumentNullException("font");
        }
        if (interfaceC6962k4 == null) {
            throw new ArgumentNullException("textMeasurer");
        }
        String[] strArrM67369h4 = C14113y2.m67369h4(str, f18981k4);
        int length = strArrM67369h4.length - 1;
        C12015qq c12015qq = new C12015qq();
        int i = 0;
        while (true) {
            int i2 = length - i;
            if (i2 <= 1) {
                break;
            }
            int i3 = (i2 / 2) + i;
            interfaceC6962k4.mo27216k4(m27281k4(strArrM67369h4, i3 + 1, str), c5659x1).CloneTo(c12015qq);
            if (c12015qq.m56699x1() < c12007ix.m56550c5()) {
                i = i3;
            } else {
                length = i3;
            }
        }
        String strM27281k4 = m27281k4(strArrM67369h4, i + 1, str);
        interfaceC6962k4.mo27216k4(strM27281k4, c5659x1).CloneTo(c12015qq);
        return c12015qq.m56699x1() > c12007ix.m56550c5() ? C14113y2.f47374k4 : strM27281k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m27279k4(InterfaceC6962k4 interfaceC6962k4, String str, C5659x1 c5659x1, C12007ix c12007ix) {
        int iM56804du;
        if (!C14113y2.m67411k4(str)) {
            if (c5659x1 == null) {
                throw new ArgumentNullException("font");
            }
            if (interfaceC6962k4.mo27216k4(str, c5659x1).m56699x1() > c12007ix.m56550c5() && (iM56804du = interfaceC6962k4.mo27217k4().m56804du()) != 0) {
                if (iM56804du == 2) {
                    return m27278du(str, c5659x1, c12007ix.Clone(), interfaceC6962k4);
                }
                if (iM56804du == 3) {
                    return m27280k4(str, c5659x1, c12007ix.Clone(), interfaceC6962k4);
                }
                if (iM56804du == 4) {
                    return m27284x1(str, c5659x1, c12007ix.Clone(), interfaceC6962k4);
                }
                C12007ix c12007ixClone = c12007ix.Clone();
                return iM56804du != 5 ? m27283to(str, c5659x1, c12007ixClone, interfaceC6962k4) : m27282kk(str, c5659x1, c12007ixClone, interfaceC6962k4);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: kk */
    private static String m27282kk(String str, C5659x1 c5659x1, C12007ix c12007ix, InterfaceC6962k4 interfaceC6962k4) {
        if (C14113y2.m67411k4(str)) {
            return str;
        }
        if (c5659x1 == null) {
            throw new ArgumentNullException("font");
        }
        if (interfaceC6962k4 == null) {
            throw new ArgumentNullException("textMeasurer");
        }
        C12015qq c12015qq = new C12015qq();
        if (str.length() < 3) {
            String strM67537ne = C14117yj.m67537ne((char) 8230);
            interfaceC6962k4.mo27216k4(strM67537ne, c5659x1).CloneTo(c12015qq);
            return c12015qq.m56699x1() > c12007ix.m56550c5() ? C14113y2.f47374k4 : strM67537ne;
        }
        int length = (str.length() - 1) / 2;
        int i = 0;
        while (true) {
            int i2 = length - i;
            if (i2 <= 1) {
                break;
            }
            int i3 = (i2 / 2) + i;
            interfaceC6962k4.mo27216k4(C14113y2.m67407k4(C14113y2.m67443x1(str, 0, i3 + 1), (char) 8230, C14113y2.m67422kk(str, (str.length() - 1) - i3)), c5659x1).CloneTo(c12015qq);
            if (c12015qq.m56699x1() < c12007ix.m56550c5()) {
                i = i3;
            } else {
                length = i3;
            }
        }
        String strM67407k4 = C14113y2.m67407k4(C14113y2.m67443x1(str, 0, i + 1), (char) 8230, C14113y2.m67422kk(str, (str.length() - 1) - i));
        interfaceC6962k4.mo27216k4(strM67407k4, c5659x1).CloneTo(c12015qq);
        if (c12015qq.m56699x1() <= c12007ix.m56550c5()) {
            return strM67407k4;
        }
        String strM67537ne2 = C14117yj.m67537ne((char) 8230);
        interfaceC6962k4.mo27216k4(strM67537ne2, c5659x1).CloneTo(c12015qq);
        return c12015qq.m56699x1() > c12007ix.m56550c5() ? C14113y2.f47374k4 : strM67537ne2;
    }

    /* JADX INFO: renamed from: to */
    private static String m27283to(String str, C5659x1 c5659x1, C12007ix c12007ix, InterfaceC6962k4 interfaceC6962k4) {
        if (C14113y2.m67411k4(str)) {
            return str;
        }
        if (c5659x1 == null) {
            throw new ArgumentNullException("font");
        }
        if (interfaceC6962k4 == null) {
            throw new ArgumentNullException("textMeasurer");
        }
        int length = str.length() - 1;
        C12015qq c12015qq = new C12015qq();
        int i = 0;
        while (true) {
            int i2 = length - i;
            if (i2 <= 1) {
                break;
            }
            int i3 = (i2 / 2) + i;
            interfaceC6962k4.mo27216k4(C14113y2.m67443x1(str, 0, i3 + 1), c5659x1).CloneTo(c12015qq);
            if (c12015qq.m56699x1() < c12007ix.m56550c5()) {
                i = i3;
            } else {
                length = i3;
            }
        }
        String strM67443x1 = C14113y2.m67443x1(str, 0, i + 1);
        interfaceC6962k4.mo27216k4(strM67443x1, c5659x1).CloneTo(c12015qq);
        return c12015qq.m56699x1() > c12007ix.m56550c5() ? C14113y2.f47374k4 : strM67443x1;
    }

    /* JADX INFO: renamed from: x1 */
    private static String m27284x1(String str, C5659x1 c5659x1, C12007ix c12007ix, InterfaceC6962k4 interfaceC6962k4) {
        if (C14113y2.m67411k4(str)) {
            return str;
        }
        if (c5659x1 == null) {
            throw new ArgumentNullException("font");
        }
        if (interfaceC6962k4 == null) {
            throw new ArgumentNullException("textMeasurer");
        }
        String[] strArrM67369h4 = C14113y2.m67369h4(str, f18981k4);
        int length = strArrM67369h4.length - 1;
        C12015qq c12015qq = new C12015qq();
        int i = 0;
        while (true) {
            int i2 = length - i;
            if (i2 <= 1) {
                break;
            }
            int i3 = (i2 / 2) + i;
            interfaceC6962k4.mo27216k4(C14113y2.m67407k4(m27281k4(strArrM67369h4, i3 + 1, str), (char) 8230), c5659x1).CloneTo(c12015qq);
            if (c12015qq.m56699x1() < c12007ix.m56550c5()) {
                i = i3;
            } else {
                length = i3;
            }
        }
        String strM67407k4 = C14113y2.m67407k4(m27281k4(strArrM67369h4, i + 1, str), (char) 8230);
        interfaceC6962k4.mo27216k4(strM67407k4, c5659x1).CloneTo(c12015qq);
        if (c12015qq.m56699x1() <= c12007ix.m56550c5()) {
            return strM67407k4;
        }
        String strM67537ne = C14117yj.m67537ne((char) 8230);
        interfaceC6962k4.mo27216k4(strM67537ne, c5659x1).CloneTo(c12015qq);
        return c12015qq.m56699x1() > c12007ix.m56550c5() ? C14113y2.f47374k4 : strM67537ne;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m27280k4(String str, C5659x1 c5659x1, C12007ix c12007ix, InterfaceC6962k4 interfaceC6962k4) {
        if (C14113y2.m67411k4(str)) {
            return str;
        }
        if (c5659x1 == null) {
            throw new ArgumentNullException("font");
        }
        if (interfaceC6962k4 == null) {
            throw new ArgumentNullException("textMeasurer");
        }
        int length = str.length() - 1;
        C12015qq c12015qq = new C12015qq();
        int i = 0;
        while (true) {
            int i2 = length - i;
            if (i2 <= 1) {
                break;
            }
            int i3 = (i2 / 2) + i;
            interfaceC6962k4.mo27216k4(C14113y2.m67407k4(C14113y2.m67443x1(str, 0, i3 + 1), (char) 8230), c5659x1).CloneTo(c12015qq);
            if (c12015qq.m56699x1() < c12007ix.m56550c5()) {
                i = i3;
            } else {
                length = i3;
            }
        }
        String strM67407k4 = C14113y2.m67407k4(C14113y2.m67443x1(str, 0, i + 1), (char) 8230);
        interfaceC6962k4.mo27216k4(strM67407k4, c5659x1).CloneTo(c12015qq);
        if (c12015qq.m56699x1() <= c12007ix.m56550c5()) {
            return strM67407k4;
        }
        String strM67537ne = C14117yj.m67537ne((char) 8230);
        interfaceC6962k4.mo27216k4(strM67537ne, c5659x1).CloneTo(c12015qq);
        return c12015qq.m56699x1() > c12007ix.m56550c5() ? C14113y2.f47374k4 : strM67537ne;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m27281k4(String[] strArr, int i, String str) {
        C6765kp c6765kp = new C6765kp();
        for (int i2 = 0; i2 < i; i2++) {
            c6765kp.m26792k4(strArr[i2]);
            if (c6765kp.m26807x1() < str.length()) {
                c6765kp.m26780k4(str.charAt(c6765kp.m26807x1()));
            }
        }
        return c6765kp.toString();
    }
}
