package com.aspose.slides.internal.p296nd;

import com.aspose.slides.internal.p042bn.C1706ar;
import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p441ui.C11315h4;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.nd.um */
/* JADX INFO: loaded from: classes4.dex */
public class C6850um extends AbstractC6841rv {
    @Override // com.aspose.slides.internal.p296nd.AbstractC6841rv
    /* JADX INFO: renamed from: x1 */
    public void mo26875x1(C1752sv c1752sv, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        C1706ar c1706ar = (C1706ar) c1752sv;
        AbstractC12024x1 abstractC12024x1M54410jd = c11315h4.m54410jd(c1706ar.m9164x1());
        C12018u4 c12018u4M54399ck = c11315h4.m54399ck(c1706ar.m9159k4());
        if (abstractC12024x1M54410jd == null || c12018u4M54399ck == null) {
            return;
        }
        C12007ix c12007ixClone = c12018u4M54399ck.m56749k4(abstractC12008jd).Clone();
        C11913yj c11913yj = new C11913yj(c12007ixClone.Clone(), new C12025x6[]{new C12025x6(c12007ixClone.m56552du().m56897x1() - c1706ar.m9163to(), c12007ixClone.m56552du().m56895kk() - c1706ar.m9162kk()), new C12025x6((c1706ar.m9163to() * 2.0f) + c12007ixClone.m56550c5() + (c12007ixClone.m56552du().m56897x1() - c1706ar.m9163to()), c12007ixClone.m56552du().m56895kk() - c1706ar.m9162kk()), new C12025x6(c12007ixClone.m56552du().m56897x1() - c1706ar.m9163to(), (c1706ar.m9162kk() * 2.0f) + c12007ixClone.m56575x1() + (c12007ixClone.m56552du().m56895kk() - c1706ar.m9162kk()))});
        C12018u4 c12018u4M56768x1 = c12018u4M54399ck.m56768x1();
        c12018u4M56768x1.m56771x1(c11913yj);
        c12018u4M56768x1.m56774x1(c12018u4M54399ck);
        abstractC12008jd.mo17531k4(abstractC12024x1M54410jd, c12018u4M56768x1);
    }
}
