package com.aspose.slides.internal.p548zf;

import com.aspose.slides.internal.p069cw.C2638du;
import com.aspose.slides.internal.p109ei.AbstractC3733jd;
import com.aspose.slides.internal.p109ei.AbstractC3734k4;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p146g9.AbstractC4229kk;
import com.aspose.slides.internal.p251li.C6086up;
import com.aspose.slides.internal.p298nh.AbstractC6888dy;
import com.aspose.slides.internal.p298nh.C6895to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.zf.dy */
/* JADX INFO: loaded from: classes5.dex */
public class C13570dy extends AbstractC3733jd {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC3734k4 f45125k4 = new C13585wl(this);

    @Override // com.aspose.slides.internal.p109ei.AbstractC3746x1
    /* JADX INFO: renamed from: k4 */
    public AbstractC3734k4 mo15042k4() {
        return this.f45125k4;
    }

    @Override // com.aspose.slides.internal.p109ei.AbstractC3733jd
    /* JADX INFO: renamed from: k4 */
    public void mo15021k4(C6086up c6086up, C2638du c2638du) {
        C3976c5 c3976c5M12074up;
        AbstractC12008jd abstractC12008jd = (AbstractC12008jd) c2638du.m12052k4();
        AbstractC6888dy abstractC6888dyM12081yj = c2638du.m12081yj();
        if ((c6086up.m24646dy() & 4294967295L) != 4294967295L) {
            c2638du.m12049h4((int) c6086up.m24646dy());
            c3976c5M12074up = c2638du.m12074up();
        } else {
            c3976c5M12074up = null;
        }
        C3976c5 c3976c5 = c3976c5M12074up;
        C12007ix c12007ixClone = c6086up.m24644c5().mo19058k4().Clone();
        C12007ix c12007ixClone2 = c6086up.m24647jd().mo19058k4().Clone();
        if (C7019kk.m27469x1(abstractC6888dyM12081yj, C6895to.class)) {
            abstractC12008jd.mo17516k4(((C6895to) abstractC6888dyM12081yj).m27022k4(), new C12025x6[]{c12007ixClone.m56552du(), new C12025x6(c12007ixClone.m56556h4(), c12007ixClone.m56554dy()), new C12025x6(c12007ixClone.m56571to(), c12007ixClone.m56558k4())}, c12007ixClone2.Clone(), c6086up.m24645ck(), c3976c5);
            return;
        }
        C11913yj c11913yj = new C11913yj(c12007ixClone2.Clone(), new C12025x6[]{new C12025x6(c12007ixClone.m56571to(), c12007ixClone.m56554dy()), new C12025x6(c12007ixClone.m56556h4(), c12007ixClone.m56554dy()), new C12025x6(c12007ixClone.m56571to(), c12007ixClone.m56558k4())});
        abstractC12008jd.mo17519k4(c12007ixClone.Clone(), 1);
        AbstractC4229kk abstractC4229kkM17034k4 = AbstractC4229kk.m17034k4((AbstractC12536x1) abstractC6888dyM12081yj);
        abstractC4229kkM17034k4.mo17030k4(c2638du.m12073u4());
        abstractC4229kkM17034k4.mo17031k4(abstractC12008jd, c11913yj);
    }
}
