package com.aspose.slides.internal.p372qx;

import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.qx.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C9963x1 {
    /* JADX INFO: renamed from: k4 */
    public static float m49072k4(C5659x1 c5659x1, int i) {
        int i2 = i & 24;
        if (i2 == 0) {
            return c5659x1.m23111c5();
        }
        if (i2 != 8) {
            return 0.0f;
        }
        return -c5659x1.m23116jd();
    }

    /* JADX INFO: renamed from: k4 */
    public static float m49073k4(C12015qq c12015qq, int i) {
        int i2 = i & 6;
        if (i2 == 2) {
            return c12015qq.m56699x1();
        }
        if (i2 != 6) {
            return 0.0f;
        }
        return c12015qq.m56699x1() / 2.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4317dy m49074k4(C12025x6 c12025x6, C4317dy c4317dy, C12015qq c12015qq, C5659x1 c5659x1, int i, float f) {
        C4317dy c4317dyM17345kk = c4317dy.m17345kk();
        c4317dyM17345kk.m17349x1(-m49073k4(c12015qq.Clone(), i), m49072k4(c5659x1, i) * C14116yg.m67505x1(c4317dyM17345kk.m17346m9()), 0);
        float[] fArrM17350x1 = c4317dyM17345kk.m17350x1();
        float fM67505x1 = C14116yg.m67505x1(fArrM17350x1[5]);
        float[] fArr = {C14116yg.m67505x1(fArrM17350x1[0]), C14116yg.m67505x1(fArrM17350x1[3]), C14116yg.m67505x1(fArrM17350x1[4]), fM67505x1};
        fArr[2] = fArr[0] < 0.0f ? fArr[2] : 1.0f;
        if (fArr[1] >= 0.0f) {
            fM67505x1 = 1.0f;
        }
        fArr[3] = fM67505x1;
        C12025x6 c12025x62 = new C12025x6(c12025x6.m56897x1() * fArr[0], c12025x6.m56895kk() * fArr[1]);
        C4317dy c4317dy2 = new C4317dy(fArr[0] * fArrM17350x1[0], fArrM17350x1[1], fArrM17350x1[2], fArr[1] * fArrM17350x1[3], fArr[2] * fArrM17350x1[4], fArr[3] * fArrM17350x1[5]);
        c4317dy2.m17339k4((-f) * C14116yg.m67505x1(c12025x62.m56895kk()), new C12025x6(c12025x62.m56897x1(), c12025x62.m56895kk() - m49072k4(c5659x1, i)), 0);
        return c4317dy2;
    }
}
