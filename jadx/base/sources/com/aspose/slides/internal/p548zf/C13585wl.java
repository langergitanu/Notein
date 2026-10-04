package com.aspose.slides.internal.p548zf;

import com.aspose.slides.internal.p069cw.C2638du;
import com.aspose.slides.internal.p109ei.AbstractC3734k4;
import com.aspose.slides.internal.p109ei.AbstractC3746x1;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p146g9.AbstractC4229kk;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;
import com.aspose.slides.internal.p505xn.C12556ck;

/* JADX INFO: renamed from: com.aspose.slides.internal.zf.wl */
/* JADX INFO: loaded from: classes5.dex */
public class C13585wl extends AbstractC3734k4 {
    public C13585wl(AbstractC3746x1 abstractC3746x1) {
        super(abstractC3746x1);
    }

    @Override // com.aspose.slides.internal.p109ei.AbstractC3734k4
    /* JADX INFO: renamed from: k4 */
    public void mo15023k4(C6045bz c6045bz, C2638du c2638du) {
        AbstractC12008jd abstractC12008jd = (AbstractC12008jd) c2638du.m12052k4();
        C11913yj c11913yjMo17577u4 = abstractC12008jd.mo17577u4();
        int iM24402c5 = c6045bz.m24443rv().m52376k4().m24402c5() / 96;
        if (c2638du.m12050ix() == 1 && iM24402c5 > 1) {
            C11913yj c11913yjMo17577u42 = abstractC12008jd.mo17577u4();
            float f = iM24402c5;
            c11913yjMo17577u42.m55769k4(new C11913yj(f, 0.0f, 0.0f, f, 0.0f, 0.0f), 1);
            abstractC12008jd.mo17588x1(c11913yjMo17577u42);
        }
        try {
            c2638du.f8460k4 = C12556ck.m58571k4(abstractC12008jd, c2638du.m12064kk(), c2638du.m12070rv(), c2638du.f8460k4);
            C12018u4 c12018u4M56768x1 = c2638du.m12048h4().m56768x1();
            C11913yj c11913yjM12070rv = c2638du.m12070rv();
            c11913yjM12070rv.m55780m9();
            c12018u4M56768x1.m56771x1(c11913yjM12070rv);
            C12556ck.m58565k4(abstractC12008jd, c12018u4M56768x1);
            this.f10264k4.mo15028k4(c6045bz, c2638du);
        } finally {
            abstractC12008jd.mo17588x1(c11913yjMo17577u4);
        }
    }

    @Override // com.aspose.slides.internal.p109ei.AbstractC3734k4
    /* JADX INFO: renamed from: k4 */
    public void mo15025k4(AbstractC12002ck abstractC12002ck, C12025x6[] c12025x6Arr, C12007ix c12007ix, int i, C3976c5 c3976c5, C2638du c2638du) {
        C12556ck.m58563k4(abstractC12002ck, c12025x6Arr, c12007ix.Clone(), i, c3976c5, (AbstractC12008jd) c2638du.m12052k4());
    }

    @Override // com.aspose.slides.internal.p109ei.AbstractC3734k4
    /* JADX INFO: renamed from: k4 */
    public void mo15026k4(C12007ix c12007ix, C11913yj c11913yj, int i, C2638du c2638du) {
        ((AbstractC12008jd) c2638du.m12052k4()).mo17519k4(c12007ix.Clone(), i);
    }

    @Override // com.aspose.slides.internal.p109ei.AbstractC3734k4
    /* JADX INFO: renamed from: k4 */
    public void mo15027k4(AbstractC12536x1 abstractC12536x1, C12025x6[] c12025x6Arr, C11913yj c11913yj, C12007ix c12007ix, C2638du c2638du) {
        AbstractC4229kk abstractC4229kkM17034k4 = AbstractC4229kk.m17034k4(abstractC12536x1);
        abstractC4229kkM17034k4.mo17030k4(c2638du.m12073u4());
        abstractC4229kkM17034k4.mo17031k4(c2638du.m12052k4(), c11913yj);
    }
}
