package com.aspose.slides.internal.p380ri;

import com.aspose.slides.internal.p048bv.InterfaceC1858du;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p486wy.C12326x6;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ri.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10018x1 {
    /* JADX INFO: renamed from: c5 */
    public static String m49171c5(int i) {
        C6765kp c6765kp = new C6765kp();
        int i2 = i > 65535 ? 6 : 4;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i & 15;
            c6765kp.m26780k4((char) (i4 < 10 ? i4 + 48 : i4 + 55));
            i3++;
            i >>= 4;
        }
        return C14113y2.m67408k4("&#x", C12326x6.k4.m57622k4(c6765kp.toString()), ";");
    }

    /* JADX INFO: renamed from: du */
    public static boolean m49172du(int i) {
        return i == 160 || i == 8239 || i == 12288 || i == 8288 || i == 65279;
    }

    /* JADX INFO: renamed from: dy */
    public static boolean m49173dy(int i) {
        return i == 10 || i == 13 || i == 133 || i == 8232 || i == 8233;
    }

    /* JADX INFO: renamed from: h4 */
    public static boolean m49174h4(int i) {
        return i == 32 || i == 160;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m49175k4(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 13 || i == 32 || i == 9) {
            return 4;
        }
        if (i != 10) {
            return m49179m9(i) ? 0 : 3;
        }
        return 1;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m49178kk(int i) {
        return i == 8203 || i == 8288 || i == 65279;
    }

    /* JADX INFO: renamed from: m9 */
    public static boolean m49179m9(int i) {
        return m49181x1(i) || m49172du(i);
    }

    /* JADX INFO: renamed from: to */
    public static boolean m49180to(int i) {
        return (i >= 8192 && i <= 8203) || i == 12288;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m49181x1(int i) {
        return i == 32 || m49180to(i);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m49176k4(String str) {
        String strM49171c5;
        C6765kp c6765kp = new C6765kp();
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt < ' ' || cCharAt >= 127) {
                    strM49171c5 = m49171c5(cCharAt);
                } else if (cCharAt == '<') {
                    strM49171c5 = "&lt;";
                } else if (cCharAt == '>') {
                    strM49171c5 = "&gt;";
                } else if (cCharAt == '&') {
                    strM49171c5 = "&amp;";
                } else {
                    c6765kp.m26780k4(cCharAt);
                }
                c6765kp.m26792k4(strM49171c5);
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m49177k4(InterfaceC1858du interfaceC1858du, InterfaceC1858du interfaceC1858du2) {
        if (interfaceC1858du.mo9715m9() != interfaceC1858du2.mo9715m9()) {
            return false;
        }
        int iMo9715m9 = interfaceC1858du.mo9715m9();
        for (int i = 0; i < iMo9715m9; i++) {
            if (interfaceC1858du.mo9716to(i) != interfaceC1858du2.mo9716to(i)) {
                return false;
            }
        }
        return true;
    }
}
