package com.aspose.slides.internal.p296nd;

import com.aspose.slides.internal.p042bn.C1712c6;
import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p441ui.C11315h4;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.nd.c6 */
/* JADX INFO: loaded from: classes4.dex */
public class C6805c6 extends AbstractC6841rv {
    @Override // com.aspose.slides.internal.p296nd.AbstractC6841rv
    /* JADX INFO: renamed from: x1 */
    public void mo26875x1(C1752sv c1752sv, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        C1712c6 c1712c6 = (C1712c6) c1752sv;
        C12025x6 c12025x6 = new C12025x6(c1712c6.m9203to(), c1712c6.m9199kk());
        C12025x6 c12025x62 = new C12025x6(c1712c6.m9205x1(), c1712c6.m9197k4());
        C12014ne c12014neClone = C12014ne.m56654k4(c1712c6.m9191c5(), c1712c6.m9193dy(), c1712c6.m9201m9(), c1712c6.m9195h4()).Clone();
        C12025x6 c12025x63 = new C12025x6((c12014neClone.m56663c5() / 2) + c12014neClone.m56669jd(), (c12014neClone.m56683x1() / 2) + c12014neClone.m56664ck());
        float fM67498to = (float) (C14116yg.m67498to(c12025x6.m56897x1() - c12025x63.m56897x1(), c12025x6.m56895kk() - c12025x63.m56895kk()) * 57.29577951308232d);
        float fM67498to2 = (float) (C14116yg.m67498to(c12025x62.m56897x1() - c12025x63.m56897x1(), c12025x62.m56895kk() - c12025x63.m56895kk()) * 57.29577951308232d);
        if (fM67498to < 0.0f) {
            fM67498to += 360.0f;
        }
        if (fM67498to2 < 0.0f) {
            fM67498to2 += 360.0f;
        }
        float f = fM67498to2 - fM67498to;
        if (f < 0.0f) {
            f += 360.0f;
        }
        float f2 = fM67498to - 90.0f;
        if (c11315h4.m54403dy() != null) {
            abstractC12008jd.mo17530k4(c11315h4.m54403dy(), c12014neClone.Clone(), f2, f);
        }
        if (c11315h4.m54395c5() != null) {
            abstractC12008jd.mo17600x1(c11315h4.m54395c5(), c12014neClone.Clone(), f2, f);
        }
    }
}
