package com.aspose.slides.internal.p118ex;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p174hz.C4750to;
import com.aspose.slides.internal.p174hz.C4763wp;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p419tg.C10936fa;
import com.aspose.slides.internal.p525yi.C12842x1;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.ex.to */
/* JADX INFO: loaded from: classes.dex */
public final class C3827to extends C4750to {

    /* JADX INFO: renamed from: kk */
    private String f10437kk;

    public C3827to(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("encodedDistinguishedName");
        }
        m19731k4(new C4763wp());
        m19732k4(bArr);
        if (bArr.length > 0) {
            m15341to();
        } else {
            this.f10437kk = C14113y2.f47374k4;
        }
    }

    /* JADX INFO: renamed from: to */
    private void m15341to() {
        this.f10437kk = (m19736x1() == null || m19736x1().length < 3) ? C14113y2.f47374k4 : C10936fa.m52726k4(new C12842x1(m19736x1()), true, ", ", true);
    }

    /* JADX INFO: renamed from: x1 */
    private static String m15342x1(int i) {
        return (i & 16) != 0 ? "; " : ((i & 128) == 0 && (i & 256) != 0) ? C14052dq.m66570kk() : ", ";
    }

    /* JADX INFO: renamed from: k4 */
    public String m15343k4(int i) {
        if (i != 0 && (i & 29169) == 0) {
            throw new ArgumentException("flag");
        }
        if (m19736x1().length == 0) {
            return C14113y2.f47374k4;
        }
        return C10936fa.m52726k4(new C12842x1(m19736x1()), (i & 1) != 0, m15342x1(i), (i & 64) == 0);
    }

    /* JADX INFO: renamed from: kk */
    public String m15345kk() {
        return this.f10437kk;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m15339k4(String str) {
        int iM67429to = C14113y2.m67429to(str, '=') + 1;
        boolean zM67536m9 = false;
        C6765kp c6765kp = new C6765kp(C14113y2.m67443x1(str, 0, iM67429to));
        while (iM67429to < str.length() && C14117yj.m67536m9(str, iM67429to)) {
            iM67429to++;
        }
        String strM67362du = C14113y2.m67362du(str, new char[0]);
        while (iM67429to < strM67362du.length()) {
            if (!zM67536m9 || !(zM67536m9 = C14117yj.m67536m9(strM67362du, iM67429to))) {
                if (C14117yj.m67536m9(strM67362du, iM67429to)) {
                    zM67536m9 = true;
                }
                c6765kp.m26780k4(C14117yj.m67541u4(strM67362du.charAt(iM67429to)));
            }
            iM67429to++;
        }
        return c6765kp.toString();
    }

    @Override // com.aspose.slides.internal.p174hz.C4750to
    /* JADX INFO: renamed from: k4 */
    public String mo15344k4(boolean z) {
        if (!z) {
            return m15343k4(128);
        }
        String strM15343k4 = m15343k4(256);
        return strM15343k4.length() > 0 ? C14113y2.m67408k4(strM15343k4, C14052dq.m66570kk()) : strM15343k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m15340k4(C3827to c3827to, C3827to c3827to2) {
        if (c3827to == null) {
            return c3827to2 == null;
        }
        if (c3827to2 == null) {
            return false;
        }
        String[] strArr = {C14052dq.m66570kk()};
        String[] strArrM67417k4 = C14113y2.m67417k4(c3827to.m15343k4(StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6), strArr, 1);
        String[] strArrM67417k42 = C14113y2.m67417k4(c3827to2.m15343k4(StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6), strArr, 1);
        if (strArrM67417k4.length != strArrM67417k42.length) {
            return false;
        }
        for (int i = 0; i < strArrM67417k4.length; i++) {
            if (!C14113y2.m67363du(m15339k4(strArrM67417k4[i]), m15339k4(strArrM67417k42[i]))) {
                return false;
            }
        }
        return true;
    }
}
