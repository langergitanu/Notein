package com.aspose.slides.internal.p296nd;

import com.aspose.slides.C22203OooOO0o;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p042bn.C1768x1;
import com.aspose.slides.internal.p441ui.C11315h4;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.nd.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C6860x1 extends AbstractC6841rv {
    @Override // com.aspose.slides.internal.p296nd.AbstractC6841rv
    /* JADX INFO: renamed from: x1 */
    public void mo26875x1(C1752sv c1752sv, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        C1768x1 c1768x1 = (C1768x1) c1752sv;
        C12025x6 c12025x6 = new C12025x6(c1768x1.m9516to(), c1768x1.m9512kk());
        C12025x6 c12025x62 = new C12025x6(c1768x1.m9518x1(), c1768x1.m9510k4());
        C12007ix c12007ixClone = C12007ix.m56541k4(c1768x1.m9504c5(), c1768x1.m9506dy(), c1768x1.m9514m9(), c1768x1.m9508h4()).Clone();
        C12025x6 c12025x63 = new C12025x6(C22205OooOOo.OooO00o(c12007ixClone, 2.0f, c12007ixClone.m56557jd()), C22203OooOO0o.OooO0O0(c12007ixClone, 2.0f, c12007ixClone.m56551ck()));
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
        if (c11315h4.m54395c5() != null) {
            abstractC12008jd.mo17542k4(c11315h4.m54395c5(), c12007ixClone.Clone(), f2, f);
        }
    }
}
