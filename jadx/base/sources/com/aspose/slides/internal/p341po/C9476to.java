package com.aspose.slides.internal.p341po;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.po.to */
/* JADX INFO: loaded from: classes4.dex */
public class C9476to {
    /* JADX INFO: renamed from: k4 */
    public static float m46652k4(C11913yj c11913yj) {
        float[] fArrM55776k4 = c11913yj.m55776k4();
        float f = fArrM55776k4[0];
        float fM67480k4 = C14116yg.m67480k4(fArrM55776k4[1]);
        float fM67480k42 = C14116yg.m67480k4(fArrM55776k4[2]);
        if (fM67480k4 <= 1.0E-6d && fM67480k42 <= 1.0E-6d) {
            return f;
        }
        float f2 = fArrM55776k4[0];
        float f3 = fArrM55776k4[1];
        return (float) C14116yg.m67496rv((f3 * f3) + (f2 * f2));
    }

    /* JADX INFO: renamed from: x1 */
    public static float m46657x1(C11913yj c11913yj) {
        float[] fArrM55776k4 = c11913yj.m55776k4();
        float f = fArrM55776k4[3];
        float fM67480k4 = C14116yg.m67480k4(fArrM55776k4[1]);
        float fM67480k42 = C14116yg.m67480k4(fArrM55776k4[2]);
        if (fM67480k4 <= 1.0E-6d && fM67480k42 <= 1.0E-6d) {
            return f;
        }
        float f2 = fArrM55776k4[2];
        float f3 = fArrM55776k4[3];
        return (float) C14116yg.m67496rv((f3 * f3) + (f2 * f2));
    }

    /* JADX INFO: renamed from: k4 */
    public static float m46653k4(C11913yj c11913yj, int i, int i2) {
        return c11913yj.m55776k4()[(i * 2) + i2];
    }

    /* JADX INFO: renamed from: k4 */
    public static C11913yj m46654k4(float f) {
        return new C11913yj(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, f);
    }

    /* JADX INFO: renamed from: k4 */
    public static C11913yj m46655k4(C7185jd c7185jd) {
        if (!C7019kk.m27469x1(c7185jd, C7186k4.class)) {
            return new C11913yj();
        }
        C7186k4 c7186k4 = (C7186k4) c7185jd;
        if (c7186k4.m27778k4() < 6) {
            return new C11913yj();
        }
        for (int i = 0; i < 6; i++) {
            if (!C7019kk.m27469x1(c7186k4.m27787x1(i), C7179c5.class)) {
                return new C11913yj();
            }
        }
        return new C11913yj(((C7179c5) c7186k4.m27787x1(0)).m27753to(), ((C7179c5) c7186k4.m27787x1(1)).m27753to(), ((C7179c5) c7186k4.m27787x1(2)).m27753to(), ((C7179c5) c7186k4.m27787x1(3)).m27753to(), ((C7179c5) c7186k4.m27787x1(4)).m27753to(), ((C7179c5) c7186k4.m27787x1(5)).m27753to());
    }

    /* JADX INFO: renamed from: k4 */
    public static C12025x6 m46656k4(float f, float f2, C11913yj c11913yj) {
        C12025x6 c12025x6 = new C12025x6();
        c12025x6.m56891k4((c11913yj.m55776k4()[2] * f2) + (c11913yj.m55776k4()[0] * f) + c11913yj.m55776k4()[4]);
        c12025x6.m56898x1((c11913yj.m55776k4()[3] * f2) + (c11913yj.m55776k4()[1] * f) + c11913yj.m55776k4()[5]);
        return c12025x6;
    }
}
