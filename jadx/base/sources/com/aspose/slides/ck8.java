package com.aspose.slides;

import com.aspose.slides.internal.p159h0.C4443em;
import com.aspose.slides.internal.p159h0.C4473um;
import com.aspose.slides.internal.p159h0.C4479w6;
import com.aspose.slides.internal.p159h0.C4489zj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class ck8 {
    /* JADX INFO: renamed from: k4 */
    public static C4473um m4609k4(float[] fArr) {
        float f = fArr[4];
        float f2 = fArr[5];
        double dM18402k4 = C4479w6.m18402k4(f);
        return new C4473um(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, ((float) C14116yg.m67470dy(dM18402k4)) * f2, ((float) C14116yg.m67495m9(dM18402k4)) * f2, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: x1 */
    public static C4473um m4611x1(float[] fArr) {
        C4473um c4473umClone = C4473um.m18359k4(C4479w6.m18403k4(fArr[0])).Clone();
        C4473um c4473umClone2 = C4473um.m18364x1(C4479w6.m18403k4(-fArr[1])).Clone();
        return C4473um.m18361k4(C4473um.m18361k4(c4473umClone2, c4473umClone), C4473um.m18363kk(C4479w6.m18403k4(fArr[2])).Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static C4473um m4610k4(float[] fArr, C4473um c4473um, C4489zj c4489zj, C4443em c4443em, float[] fArr2, C4443em[] c4443emArr) {
        C4443em c4443em2 = new C4443em();
        c4443emArr[0] = c4443em2;
        if (fArr[3] >= Float.MIN_VALUE) {
            c4443em2.m18174k4(C7019kk.m27462to(Float.valueOf(c4443em.m18173k4() * 1.6666666f), 13));
            c4443emArr[0].m18178x1(C7019kk.m27462to(Float.valueOf(c4443em.m18177x1() * 1.6666666f), 13));
            float fM18177x1 = (c4443emArr[0].m18177x1() * 0.5f) / ((float) C14116yg.m67466c5(C4479w6.m18403k4(fArr[3] / 2.0f)));
            fArr2[0] = fM18177x1;
            return C4473um.m18360k4(C4479w6.m18403k4(fArr[3]), c4443emArr[0].m18173k4() / c4443emArr[0].m18177x1(), 1.0f, fM18177x1 * 2.0f);
        }
        c4443em2.m18174k4(C7019kk.m27462to(Float.valueOf(((C14116yg.m67480k4(c4473um.m18367du()) * c4489zj.m18508kk()) + c4489zj.m18506k4() + 1.0f) * 2.0f), 13));
        c4443emArr[0].m18178x1(C7019kk.m27462to(Float.valueOf(((C14116yg.m67480k4(c4473um.m18369h4()) * c4489zj.m18508kk()) + c4489zj.m18511x1() + 1.0f) * 2.0f), 13));
        float fM18177x12 = c4443em.m18177x1() * 2.0f;
        fArr2[0] = fM18177x12;
        return C4473um.m18365x1(c4443emArr[0].m18173k4(), c4443emArr[0].m18177x1(), 1.0f, fM18177x12 * 2.0f);
    }
}
