package com.aspose.slides.internal.p258lv;

import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p138fu.C4127k4;
import com.aspose.slides.internal.p302nm.C6923jd;
import com.aspose.slides.internal.p504xm.C12549du;
import com.aspose.slides.internal.p505xn.C12565ks;

/* JADX INFO: renamed from: com.aspose.slides.internal.lv.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C6235ck {
    /* JADX INFO: renamed from: k4 */
    private static boolean m25248k4(byte[] bArr) {
        int iM58515x1 = C12549du.m58515x1(bArr);
        return iM58515x1 == 5 || iM58515x1 == 7;
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m25249k4(C4127k4 c4127k4, int i) throws Throwable {
        C3152yj c3152yj = new C3152yj();
        int iM16536h4 = c4127k4.m16536h4();
        if (iM16536h4 == 5 || iM16536h4 == 7) {
            c4127k4.m16541k4(c3152yj, c4127k4.m16536h4());
        } else {
            c4127k4.mo16493x1(c3152yj, i);
        }
        return C12565ks.m58632x1(c3152yj);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m25250k4(byte[] bArr, int i) {
        if (m25248k4(bArr)) {
            return bArr;
        }
        try {
            C4127k4 c4127k4 = new C4127k4(bArr);
            try {
                return m25249k4(c4127k4, i);
            } finally {
                c4127k4.dispose();
            }
        } catch (RuntimeException unused) {
            return C6923jd.m27138x1();
        }
    }
}
