package com.aspose.slides.internal.p413t1;

import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C5012m2;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p191it.AbstractC5120du;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.t1.yj */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10840yj extends AbstractC5120du {
    /* JADX INFO: renamed from: k4 */
    public static float m52403k4(float f, float f2) {
        return (float) (C14116yg.m67498to(f, f2) * 57.29577951308232d);
    }

    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: du */
    public void mo16615du(C5061vw c5061vw, C4201h4 c4201h4) {
        C5012m2 c5012m2 = (C5012m2) c5061vw;
        C12025x6 c12025x6Clone = c5012m2.m21254x1().m58198to().Clone();
        C12025x6 c12025x6Clone2 = c5012m2.m21253kk().m58198to().Clone();
        C12014ne c12014neClone = c5012m2.m21249k4().m58249dy().Clone();
        C12025x6 c12025x6 = new C12025x6((c12014neClone.m56663c5() / 2.0f) + c12014neClone.m56669jd(), (c12014neClone.m56683x1() / 2.0f) + c12014neClone.m56664ck());
        float fM52403k4 = m52403k4(c12025x6Clone.m56895kk() - c12025x6.m56895kk(), c12025x6Clone.m56897x1() - c12025x6.m56897x1());
        float fM52403k42 = m52403k4(c12025x6Clone2.m56895kk() - c12025x6.m56895kk(), c12025x6Clone2.m56897x1() - c12025x6.m56897x1());
        if (fM52403k4 < 0.0f) {
            fM52403k4 += 360.0f;
        }
        if (fM52403k42 < 0.0f) {
            fM52403k42 += 360.0f;
        }
        float f = fM52403k4 > fM52403k42 ? fM52403k4 - fM52403k42 : 360.0f - (fM52403k42 - fM52403k4);
        if (c4201h4.m16781yj()) {
            c4201h4.m16755up().m55580x1(c12014neClone.Clone(), fM52403k42, f);
        } else {
            mo16639k4(c12014neClone.Clone(), fM52403k42, f, c4201h4);
        }
    }

    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: h4 */
    public boolean mo16667h4(C5061vw c5061vw, C4201h4 c4201h4) {
        return !c4201h4.m16781yj();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo16639k4(C12014ne c12014ne, float f, float f2, C4201h4 c4201h4);
}
