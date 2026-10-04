package com.aspose.slides.internal.p413t1;

import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p191it.AbstractC5120du;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.t1.kk */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10821kk extends AbstractC5120du {
    /* JADX INFO: renamed from: k4 */
    public abstract void mo16631k4(C12014ne c12014ne, float f, float f2, C4201h4 c4201h4);

    /* JADX INFO: renamed from: k4 */
    public final void m52398k4(C12016rv c12016rv, C12016rv c12016rv2, C12014ne c12014ne, C4201h4 c4201h4) {
        C12025x6 c12025x6 = new C12025x6((c12014ne.m56663c5() / 2) + c12014ne.m56665du().m56708k4(), (c12014ne.m56683x1() / 2) + c12014ne.m56665du().m56713x1());
        float fM67498to = (float) (C14116yg.m67498to(c12016rv.m56708k4() - c12025x6.m56897x1(), c12016rv.m56713x1() - c12025x6.m56895kk()) * 57.29577951308232d);
        float fM67498to2 = (float) (C14116yg.m67498to(c12016rv2.m56708k4() - c12025x6.m56897x1(), c12016rv2.m56713x1() - c12025x6.m56895kk()) * 57.29577951308232d);
        if (fM67498to < 0.0f) {
            fM67498to += 360.0f;
        }
        if (fM67498to2 < 0.0f) {
            fM67498to2 += 360.0f;
        }
        float f = fM67498to2 - fM67498to;
        if (c4201h4.m16681c6() != 2) {
            if (f < 0.0f) {
                f += 360.0f;
            }
            fM67498to -= 90.0f;
        }
        if (c4201h4.m16781yj()) {
            c4201h4.m16755up().m55545k4(c12014ne.Clone(), fM67498to, f);
            c4201h4.m16772x1(c12016rv2.Clone());
        } else {
            if (c4201h4.m16688dy() != null) {
                mo16631k4(c12014ne.Clone(), fM67498to, f, c4201h4);
            }
            c4201h4.m16718k4(c12016rv2.Clone());
        }
    }
}
