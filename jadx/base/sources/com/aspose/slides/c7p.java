package com.aspose.slides;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes3.dex */
class c7p {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f4289k4 = new C7017h4(ContextChain.TAG_PRODUCT_AND_INFRA);

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC1130g3 m4504k4(String str) {
        if (C14113y2.m67411k4(str)) {
            return new C1129g2(0.0f);
        }
        if (C14280pg.m69035k4(str)) {
            return new C14280pg(str);
        }
        if (f4289k4.m27428k4(str) == 0) {
            return new C1129g2(3.1415927f);
        }
        int i = 0;
        while (i < str.length()) {
            if (C14301pt.m69231k4(str.charAt(i))) {
                return m4505k4(str, i);
            }
            if (str.charAt(i) == '(') {
                int[] iArr = {i};
                m4506k4(str, iArr);
                i = iArr[0];
            }
            i++;
        }
        if (str.charAt(0) == '(' && androidx.core.content.OooO0O0.OooO00o(1, str) == ')') {
            return m4504k4(OooO0OO.OooO00o(2, 1, str, str));
        }
        float[] fArr = {0.0f};
        return C14064he.m66713k4(str, FrameMetricsAggregator.EVERY_DURATION, C11697x1.m55250kk(), fArr) ? new C1129g2(fArr[0]) : m4507x1(str);
    }

    /* JADX INFO: renamed from: x1 */
    private static InterfaceC1130g3 m4507x1(String str) {
        int iM67429to;
        InterfaceC1130g3 interfaceC1130g3M4504k4;
        if (androidx.core.content.OooO0O0.OooO00o(1, str) != ')' || (iM67429to = C14113y2.m67429to(str, '(')) <= 0) {
            return null;
        }
        String strM67443x1 = C14113y2.m67443x1(str, 0, iM67429to);
        if (xf2.m73345k4(strM67443x1) && (interfaceC1130g3M4504k4 = m4504k4(C14113y2.m67443x1(str, iM67429to + 1, (str.length() - iM67429to) - 2))) != null) {
            return new xf2(strM67443x1, interfaceC1130g3M4504k4);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static InterfaceC1130g3 m4505k4(String str, int i) {
        InterfaceC1130g3 interfaceC1130g3M4504k4;
        InterfaceC1130g3 interfaceC1130g3M4504k42 = m4504k4(C14113y2.m67443x1(str, 0, i));
        if (interfaceC1130g3M4504k42 == null || (interfaceC1130g3M4504k4 = m4504k4(C14113y2.m67422kk(str, i + 1))) == null) {
            return null;
        }
        return new C14301pt(str.charAt(i), interfaceC1130g3M4504k42, interfaceC1130g3M4504k4);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4506k4(String str, int[] iArr) {
        int i = 0;
        while (iArr[0] < str.length()) {
            char cCharAt = str.charAt(iArr[0]);
            if (cCharAt == '(') {
                i++;
            } else if (cCharAt == ')' && i - 1 == 0) {
                return;
            }
            iArr[0] = iArr[0] + 1;
        }
    }
}
