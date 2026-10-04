package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: renamed from: com.aspose.slides.o3 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC14213o3 {

    /* JADX INFO: renamed from: k4 */
    protected final C12003du f47666k4;

    public AbstractC14213o3(ColorEffect colorEffect, IBaseSlide iBaseSlide) {
        C12003du c12003du = new C12003du();
        this.f47666k4 = c12003du;
        ((ColorFormat) colorEffect.getTo()).m1086x1(iBaseSlide).m69339k4().CloneTo(c12003du);
    }

    /* JADX INFO: renamed from: k4 */
    private static byte m68324k4(byte b, byte b2, float f) {
        float f2 = b & 255;
        return C7019kk.m27442k4(Float.valueOf((((b2 & 255) - f2) * f) + f2), 13);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12003du m68325k4(C12003du c12003du, C12003du c12003du2, float f) {
        return C12003du.m56398k4(m68324k4(c12003du.m56501c5(), c12003du2.m56501c5(), f) & 255, m68324k4(c12003du.m56507jd(), c12003du2.m56507jd(), f) & 255, m68324k4(c12003du.m56502ck(), c12003du2.m56502ck(), f) & 255, m68324k4(c12003du.m56505fa(), c12003du2.m56505fa(), f) & 255);
    }
}
