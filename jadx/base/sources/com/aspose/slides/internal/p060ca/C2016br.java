package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.br */
/* JADX INFO: loaded from: classes3.dex */
class C2016br {
    /* JADX INFO: renamed from: k4 */
    public static String m10269k4(String str) {
        return C14113y2.m67401k4(C14113y2.m67401k4(str, ".", C11697x1.m55250kk().m55263fa().m55062ne()), ",", C11697x1.m55250kk().m55263fa().m55062ne());
    }

    /* JADX INFO: renamed from: x1 */
    public static double m10272x1(String str) {
        double[] dArr = {-1.7976931348623157E308d};
        C14044b3.m66435k4(m10269k4(str.toString()), 167, C11697x1.m55250kk(), dArr);
        return dArr[0];
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m10270k4(byte b) {
        return C14044b3.m66436k4(AbstractC6747ar.m26650yj().m26681x1(new byte[]{b}), new double[]{0.0d});
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m10271k4(byte[] bArr, int i) {
        byte b;
        if (C7019kk.m27434ck(Byte.valueOf(bArr[i]), 6) == '-') {
            int i2 = i + 1;
            if (i2 > bArr.length - 1) {
                return false;
            }
            b = bArr[i2];
        } else {
            b = bArr[i];
        }
        return m10270k4(b);
    }
}
