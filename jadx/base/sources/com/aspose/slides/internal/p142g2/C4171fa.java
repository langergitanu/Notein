package com.aspose.slides.internal.p142g2;

import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C4984f9;
import com.aspose.slides.internal.p191it.AbstractC5129up;
import com.aspose.slides.internal.p413t1.AbstractC10819jd;
import com.aspose.slides.internal.p472w8.C11893c5;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.g2.fa */
/* JADX INFO: loaded from: classes.dex */
public class C4171fa extends AbstractC10819jd {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC5129up f11348k4 = new C4185sv(this);

    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: k4 */
    public AbstractC5129up mo16616k4() {
        return this.f11348k4;
    }

    @Override // com.aspose.slides.internal.p413t1.AbstractC10819jd
    /* JADX INFO: renamed from: k4 */
    public void mo16625k4(C4984f9 c4984f9, C4201h4 c4201h4) {
        AbstractC12008jd abstractC12008jd = (AbstractC12008jd) c4201h4.m16701k4();
        C11893c5 c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
        AbstractC12024x1 abstractC12024x1M16735ks = c4201h4.m16735ks(c4984f9.m21019x1());
        C12018u4 c12018u4M7984kk = c4984f9.m21010h4().m7984kk();
        if (abstractC12024x1M16735ks != null && c12018u4M7984kk != null) {
            C12007ix c12007ixClone = c12018u4M7984kk.m56749k4(abstractC12008jd).Clone();
            C11913yj c11913yj = new C11913yj(c12007ixClone.Clone(), new C12025x6[]{new C12025x6(c12007ixClone.m56552du().m56897x1() - c4984f9.m21017kk(), c12007ixClone.m56552du().m56895kk() - c4984f9.m21018to()), new C12025x6((c4984f9.m21017kk() * 2.0f) + c12007ixClone.m56550c5() + (c12007ixClone.m56552du().m56897x1() - c4984f9.m21017kk()), c12007ixClone.m56552du().m56895kk() - c4984f9.m21018to()), new C12025x6(c12007ixClone.m56552du().m56897x1() - c4984f9.m21017kk(), (c4984f9.m21018to() * 2.0f) + c12007ixClone.m56575x1() + (c12007ixClone.m56552du().m56895kk() - c4984f9.m21018to()))});
            C12018u4 c12018u4M56768x1 = c12018u4M7984kk.m56768x1();
            c12018u4M56768x1.m56771x1(c11913yj);
            c12018u4M56768x1.m56774x1(c12018u4M7984kk);
            abstractC12008jd.mo17531k4(abstractC12024x1M16735ks, c12018u4M56768x1);
        }
        abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
    }
}
