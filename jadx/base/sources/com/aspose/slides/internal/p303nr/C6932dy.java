package com.aspose.slides.internal.p303nr;

import com.aspose.slides.internal.p075d5.AbstractC3024x1;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p214k0.AbstractC5568kk;
import com.aspose.slides.internal.p220k7.AbstractC5629jd;
import com.aspose.slides.internal.p220k7.AbstractC5630k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p359qf.C9856du;
import com.aspose.slides.internal.p421tk.C11029up;
import com.aspose.slides.internal.p436u8.AbstractC11290x1;
import com.aspose.slides.internal.p436u8.C11289k4;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.nr.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C6932dy extends AbstractC5629jd {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC5630k4 f18910k4 = new C6947wl(this);

    @Override // com.aspose.slides.internal.p220k7.AbstractC5642x1
    /* JADX INFO: renamed from: k4 */
    public AbstractC5630k4 mo23039k4() {
        return this.f18910k4;
    }

    @Override // com.aspose.slides.internal.p220k7.AbstractC5629jd
    /* JADX INFO: renamed from: k4 */
    public void mo23018k4(C11029up c11029up, C9856du c9856du) {
        C3976c5 c3976c5M48637fa;
        AbstractC12008jd abstractC12008jd = (AbstractC12008jd) c9856du.m48641k4();
        AbstractC11290x1 abstractC11290x1M48662up = c9856du.m48662up();
        if ((c11029up.m53403m9() & 4294967295L) != 4294967295L) {
            c9856du.m48639h4((int) c11029up.m53403m9());
            c3976c5M48637fa = c9856du.m48637fa();
        } else {
            c3976c5M48637fa = null;
        }
        C3976c5 c3976c5 = c3976c5M48637fa;
        C12007ix c12007ixClone = c11029up.m53395dy().mo62062k4().Clone();
        C12007ix c12007ixClone2 = c11029up.m53394c5().mo62062k4().Clone();
        if (C7019kk.m27469x1(abstractC11290x1M48662up, C11289k4.class)) {
            abstractC12008jd.mo17516k4(((C11289k4) abstractC11290x1M48662up).m54261k4(), new C12025x6[]{c12007ixClone.m56552du(), new C12025x6(c12007ixClone.m56556h4(), c12007ixClone.m56554dy()), new C12025x6(c12007ixClone.m56571to(), c12007ixClone.m56558k4())}, c12007ixClone2.Clone(), c11029up.m53396jd(), c3976c5);
            return;
        }
        C11913yj c11913yj = new C11913yj(c12007ixClone2.Clone(), new C12025x6[]{new C12025x6(c12007ixClone.m56571to(), c12007ixClone.m56554dy()), new C12025x6(c12007ixClone.m56556h4(), c12007ixClone.m56554dy()), new C12025x6(c12007ixClone.m56571to(), c12007ixClone.m56558k4())});
        abstractC12008jd.mo17519k4(c12007ixClone2.Clone(), 1);
        AbstractC5568kk abstractC5568kkM22887k4 = AbstractC5568kk.m22887k4((AbstractC3024x1) abstractC11290x1M48662up);
        abstractC5568kkM22887k4.mo22892k4(c9856du.m48658ne());
        abstractC5568kkM22887k4.mo22884k4(abstractC12008jd, c11913yj);
    }
}
