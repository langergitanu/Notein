package com.aspose.slides.internal.p057c6;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10009ck;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.c6.jd */
/* JADX INFO: loaded from: classes3.dex */
public class C1982jd {

    /* JADX INFO: renamed from: k4 */
    private static final String f6945k4 = C14113y2.m67408k4(",;:$&+=", "?/[]@");

    /* JADX INFO: renamed from: x1 */
    private static final char[] f6946x1 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: du */
    private static boolean m10106du(char c) {
        return m10109k4(c) || m10113x1(c) || C14113y2.m67429to("_-!.~'()*", c) >= 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m10107k4(String str) {
        String strM67440x1 = C14113y2.m67440x1(str);
        if (C14113y2.m67448x1(strM67440x1, "url(") && C14113y2.m67364dy(strM67440x1, ")") != -1) {
            strM67440x1 = C14113y2.m67440x1(C10009ck.m49139k4(strM67440x1, 4, C14113y2.m67430to(strM67440x1, ")")));
            if ((C14113y2.m67448x1(strM67440x1, "'") && C14113y2.m67424kk(strM67440x1, "'")) || (C14113y2.m67448x1(strM67440x1, "\"") && C14113y2.m67424kk(strM67440x1, "\""))) {
                return C10009ck.m49139k4(strM67440x1, 1, strM67440x1.length() - 1);
            }
        }
        return strM67440x1;
    }

    /* JADX INFO: renamed from: kk */
    private static boolean m10110kk(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        if (c < 'A' || c > 'F') {
            return c >= 'a' && c <= 'f';
        }
        return true;
    }

    /* JADX INFO: renamed from: to */
    private static boolean m10111to(char c) {
        return C14113y2.m67429to(f6945k4, c) >= 0 || '#' == c;
    }

    /* JADX INFO: renamed from: x1 */
    public static String m10112x1(String str) {
        String strM10107k4 = m10107k4(str);
        C6765kp c6765kp = new C6765kp();
        int length = strM10107k4.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = strM10107k4.charAt(i);
            if ((cCharAt == '%' && i < length - 3 && m10110kk(strM10107k4.charAt(i + 1)) && m10110kk(strM10107k4.charAt(i + 2))) || m10111to(cCharAt) || m10106du(cCharAt)) {
                c6765kp.m26780k4(cCharAt);
            } else {
                for (byte b : AbstractC6747ar.m26635ix().mo26677to(C14117yj.m67537ne(cCharAt))) {
                    m10108k4(c6765kp, b);
                }
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m10108k4(C6765kp c6765kp, byte b) {
        C6765kp c6765kpM26780k4 = c6765kp.m26780k4('%');
        char[] cArr = f6946x1;
        c6765kpM26780k4.m26780k4(cArr[(C7019kk.m27462to(Byte.valueOf(b), 6) >> 4) & 15]).m26780k4(cArr[C7019kk.m27462to(Byte.valueOf(b), 6) & 15]);
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m10113x1(char c) {
        if (c < 'A' || c > 'Z') {
            return c >= 'A' && c <= 'z';
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m10109k4(char c) {
        return c >= '0' && c <= '9';
    }
}
