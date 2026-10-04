package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p343pr.C9483k4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.rq */
/* JADX INFO: loaded from: classes5.dex */
public class C13969rq {
    /* JADX INFO: renamed from: k4 */
    public static String m65820k4(String str) {
        int length = str.length();
        if (length <= 0) {
            return C14113y2.f47374k4;
        }
        C14022y4 c14022y4Clone = C14022y4.m66318k4().Clone();
        int i = 0;
        while (c14022y4Clone.m66333k4(str.charAt(i))) {
            i++;
            if (i == length) {
                return C9483k4.m46680kk() ? "" : " ";
            }
        }
        C6765kp c6765kp = null;
        while (true) {
            int i2 = i;
            while (i < length) {
                if (c14022y4Clone.m66333k4(str.charAt(i))) {
                    int i3 = i + 1;
                    int i4 = i3;
                    while (i4 < length && c14022y4Clone.m66333k4(str.charAt(i4))) {
                        i4++;
                    }
                    if (i4 == length) {
                        int i5 = i - i2;
                        if (c6765kp == null) {
                            return C14113y2.m67443x1(str, i2, i5);
                        }
                        c6765kp.m26793k4(str, i2, i5);
                        return c6765kp.toString();
                    }
                    if (i4 > i3 || str.charAt(i) != ' ') {
                        if (c6765kp == null) {
                            c6765kp = new C6765kp(length);
                        }
                        c6765kp.m26793k4(str, i2, i - i2);
                        c6765kp.m26780k4(ControlChar.SPACE_CHAR);
                        i = i4;
                    } else {
                        i = i3;
                    }
                } else {
                    i++;
                }
            }
            if (c6765kp == null) {
                return i2 > 0 ? C14113y2.m67443x1(str, i2, length - i2) : str;
            }
            if (i2 < i) {
                c6765kp.m26793k4(str, i2, i - i2);
            }
            return c6765kp.toString();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static String m65822x1(String str) {
        int i;
        int length = str.length();
        if (length <= 0) {
            return C14113y2.f47374k4;
        }
        int i2 = 0;
        C6765kp c6765kp = null;
        int i3 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= ' ' || !(cCharAt == '\t' || cCharAt == '\n' || cCharAt == '\r')) {
                i2++;
            } else {
                if (c6765kp == null) {
                    c6765kp = new C6765kp(length);
                }
                if (i3 < i2) {
                    c6765kp.m26793k4(str, i3, i2 - i3);
                }
                c6765kp.m26780k4(ControlChar.SPACE_CHAR);
                i3 = (cCharAt == '\r' && (i = i2 + 1) < length && str.charAt(i) == '\n') ? i2 + 2 : i2 + 1;
                i2 = i3;
            }
        }
        if (c6765kp == null) {
            return str;
        }
        if (i2 > i3) {
            c6765kp.m26793k4(str, i3, i2 - i3);
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m65821k4(char[] cArr, int i, int i2) {
        if (i2 < 2) {
            return false;
        }
        C14022y4 c14022y4Clone = C14022y4.m66318k4().Clone();
        char c = cArr[i];
        if (c14022y4Clone.m66330dy(c)) {
            int i3 = i + 1;
            if (c14022y4Clone.m66330dy(cArr[i3])) {
                if (i2 == 2) {
                    return true;
                }
                i2--;
                i3 = i + 2;
            } else if ('I' != c && 'i' != c && 'X' != c && 'x' != c) {
                return false;
            }
            if (cArr[i3] != '-') {
                return false;
            }
            int i4 = i2 - 2;
            boolean z = false;
            while (true) {
                int i5 = i4 - 1;
                if (i4 > 0) {
                    i3++;
                    char c2 = cArr[i3];
                    if (c14022y4Clone.m66330dy(c2)) {
                        i4 = i5;
                        z = true;
                    } else {
                        if (c2 != '-' || !z) {
                            break;
                        }
                        z = false;
                        i4 = i5;
                    }
                } else if (z) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
