package com.aspose.slides.internal.p085dk;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.dk.ck */
/* JADX INFO: loaded from: classes3.dex */
public class C3169ck {

    /* JADX INFO: renamed from: k4 */
    private static final char[] f9416k4 = {ControlChar.SPACE_CHAR, '<', '>', '{', '}', '|', '^', '[', ']', '`', '\"'};

    /* JADX INFO: renamed from: x1 */
    private static final char[] f9417x1 = {IOUtils.DIR_SEPARATOR_UNIX, IOUtils.DIR_SEPARATOR_WINDOWS};

    /* JADX INFO: renamed from: du */
    public static String m13538du(String str) {
        return m13546m9(str) ? m13540h4(str) : str;
    }

    /* JADX INFO: renamed from: dy */
    private static boolean m13539dy(String str) {
        return str.length() == 3 && str.charAt(0) == '%' && C12565ks.m58617k4(str.charAt(1)) && C12565ks.m58617k4(str.charAt(2));
    }

    /* JADX INFO: renamed from: h4 */
    public static String m13540h4(String str) {
        C6765kp c6765kp = new C6765kp();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (m13548x1(cCharAt)) {
                m13542k4(c6765kp, cCharAt);
            } else {
                c6765kp.m26780k4(cCharAt);
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m13541k4(String str, String str2) {
        if (!C12565ks.m58630x1(str)) {
            return str2;
        }
        String str3 = C14113y2.m67364dy(str, "\\") == -1 ? "/" : "\\";
        return C14113y2.m67424kk(str, str3) ? C14113y2.m67408k4(str, str2) : C14113y2.m67408k4(str, str3, str2);
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m13545kk(String str) {
        return C14113y2.m67448x1(str, "\\\\");
    }

    /* JADX INFO: renamed from: m9 */
    private static boolean m13546m9(String str) {
        if (C12565ks.m58630x1(str) && !m13549x1(str) && !m13545kk(str)) {
            if (C14113y2.m67384k4(str, f9416k4) >= 0) {
                return true;
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '%' && i + 2 < str.length() && !m13539dy(C14113y2.m67443x1(str, i, 3))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: to */
    public static boolean m13547to(String str) {
        return C14113y2.m67448x1(str, "#");
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m13548x1(char c) {
        return C14113y2.m67429to(" <>{}|^[]`\"%", c) >= 0;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m13542k4(C6765kp c6765kp, char c) {
        c6765kp.m26780k4('%');
        c6765kp.m26798k4(C12565ks.m58626k4((byte) c));
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m13549x1(String str) {
        return str.length() > 2 && m13543k4(str.charAt(0)) && str.charAt(1) == ':' && (str.charAt(2) == '\\' || str.charAt(2) == '/');
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m13543k4(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m13544k4(String str) {
        return m13549x1(str) || m13545kk(str);
    }
}
