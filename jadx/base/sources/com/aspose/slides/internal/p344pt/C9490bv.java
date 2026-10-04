package com.aspose.slides.internal.p344pt;

import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p132fj.C4001ar;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.pt.bv */
/* JADX INFO: loaded from: classes4.dex */
public class C9490bv extends AbstractC9530rv {
    @Override // com.aspose.slides.internal.p344pt.AbstractC9530rv
    /* JADX INFO: renamed from: x1 */
    public void mo46684x1(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C4001ar c4001ar = (C4001ar) c4047sv;
        AbstractC12024x1 abstractC12024x1M15480jd = c3856h4.m15480jd(c4001ar.m15816x1());
        C12018u4 c12018u4M15467ck = c3856h4.m15467ck(c4001ar.m15811k4());
        if (abstractC12024x1M15480jd == null || c12018u4M15467ck == null) {
            return;
        }
        C12007ix c12007ixClone = c12018u4M15467ck.m56749k4(abstractC12008jd).Clone();
        C11913yj c11913yj = new C11913yj(c12007ixClone.Clone(), new C12025x6[]{new C12025x6(c12007ixClone.m56552du().m56897x1() - c4001ar.m15815to(), c12007ixClone.m56552du().m56895kk() - c4001ar.m15814kk()), new C12025x6((c4001ar.m15815to() * 2.0f) + c12007ixClone.m56550c5() + (c12007ixClone.m56552du().m56897x1() - c4001ar.m15815to()), c12007ixClone.m56552du().m56895kk() - c4001ar.m15814kk()), new C12025x6(c12007ixClone.m56552du().m56897x1() - c4001ar.m15815to(), (c4001ar.m15814kk() * 2.0f) + c12007ixClone.m56575x1() + (c12007ixClone.m56552du().m56895kk() - c4001ar.m15814kk()))});
        C12018u4 c12018u4M56768x1 = c12018u4M15467ck.m56768x1();
        c12018u4M56768x1.m56771x1(c11913yj);
        c12018u4M56768x1.m56774x1(c12018u4M15467ck);
        abstractC12008jd.mo17531k4(abstractC12024x1M15480jd, c12018u4M56768x1);
    }
}
