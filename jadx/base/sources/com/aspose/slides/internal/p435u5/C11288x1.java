package com.aspose.slides.internal.p435u5;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p080dd.C3125bv;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.internal.u5.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C11288x1 {

    /* JADX INFO: renamed from: k4 */
    private static final char[] f38864k4 = {';', '&', ControlChar.SPACE_CHAR};

    /* JADX INFO: renamed from: k4 */
    public static String m54259k4(String str) {
        if (str == null) {
            return null;
        }
        if (C14113y2.m67429to(str, '&') < 0) {
            return str;
        }
        C6765kp c6765kp = new C6765kp();
        m54260k4(str, new C3125bv(c6765kp, C11697x1.m55250kk()));
        return c6765kp.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b A[PHI: r3 r4
      0x005b: PHI (r3v2 int) = (r3v1 int), (r3v1 int), (r3v8 int), (r3v9 int), (r3v8 int) binds: [B:10:0x001b, B:24:0x0059, B:45:0x00ad, B:43:0x00a6, B:40:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x005b: PHI (r4v1 char) = (r4v0 char), (r4v0 char), (r4v2 char), (r4v0 char), (r4v5 char) binds: [B:10:0x001b, B:24:0x0059, B:45:0x00ad, B:43:0x00a6, B:40:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m54260k4(String str, AbstractC3124b3 abstractC3124b3) {
        boolean z;
        if (str != null) {
            if (C14113y2.m67429to(str, '&') < 0) {
                abstractC3124b3.mo13304k4(str);
                return;
            }
            int length = str.length();
            int length2 = 0;
            while (length2 < length) {
                char cCharAt = str.charAt(length2);
                if (cCharAt == '&') {
                    int i = length2 + 1;
                    int iM67385k4 = C14113y2.m67385k4(str, f38864k4, i);
                    String strM67443x1 = C14113y2.f47374k4;
                    if (iM67385k4 > 0 && (str.charAt(iM67385k4) == ';' || str.charAt(iM67385k4) == ' ')) {
                        strM67443x1 = C14113y2.m67443x1(str, i, (iM67385k4 - length2) - 1);
                        if (str.charAt(iM67385k4) == ';') {
                            z = true;
                        }
                        if (strM67443x1.length() != 0) {
                            length2 = iM67385k4 > -1 ? iM67385k4 : str.length() - 1;
                            if (strM67443x1.length() <= 1 || strM67443x1.charAt(0) != '#') {
                                cCharAt = C11285kk.m54246k4(strM67443x1);
                                if (cCharAt == 0) {
                                    abstractC3124b3.mo13302k4('&');
                                    abstractC3124b3.mo13304k4(strM67443x1);
                                    if (z) {
                                        abstractC3124b3.mo13302k4(';');
                                    }
                                }
                            } else {
                                try {
                                    cCharAt = (char) ((strM67443x1.charAt(1) == 'x' || strM67443x1.charAt(1) == 'X') ? C14057f9.m66584k4(C14113y2.m67422kk(strM67443x1, 2), 512, C11697x1.m55250kk()) : C14057f9.m66585k4(C14113y2.m67422kk(strM67443x1, 1), C11697x1.m55250kk()));
                                } catch (ArgumentException | FormatException unused) {
                                    length2++;
                                }
                            }
                            abstractC3124b3.mo13302k4(cCharAt);
                        } else {
                            abstractC3124b3.mo13302k4(cCharAt);
                        }
                    } else if (iM67385k4 < 0) {
                        strM67443x1 = C14113y2.m67443x1(str, i, (str.length() - length2) - 1);
                    }
                    z = false;
                    if (strM67443x1.length() != 0) {
                    }
                }
                length2++;
            }
        }
    }
}
