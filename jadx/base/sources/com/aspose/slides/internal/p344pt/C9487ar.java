package com.aspose.slides.internal.p344pt;

import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p132fj.C4060wl;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12018u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.pt.ar */
/* JADX INFO: loaded from: classes4.dex */
public class C9487ar extends AbstractC9530rv {
    @Override // com.aspose.slides.internal.p344pt.AbstractC9530rv
    /* JADX INFO: renamed from: x1 */
    public void mo46684x1(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C4060wl c4060wl = (C4060wl) c4047sv;
        if ((c4060wl.m16159x1() & 65535) >= c3856h4.m15510m9().length || (c4060wl.m16157k4() & 65535) >= c3856h4.m15510m9().length) {
            return;
        }
        AbstractC12024x1 abstractC12024x1M15480jd = c3856h4.m15480jd(c4060wl.m16159x1());
        C12018u4 c12018u4M15467ck = c3856h4.m15467ck(c4060wl.m16157k4());
        if (abstractC12024x1M15480jd == null || c12018u4M15467ck == null) {
            return;
        }
        if (!C7019kk.m27469x1(abstractC12024x1M15480jd, C12012lr.class)) {
            abstractC12008jd.mo17531k4(abstractC12024x1M15480jd, c12018u4M15467ck);
            return;
        }
        C12012lr c12012lr = (C12012lr) C7019kk.m27452k4((Object) abstractC12024x1M15480jd, C12012lr.class);
        C11913yj c11913yjM55760h4 = abstractC12008jd.mo17577u4().m55760h4();
        c11913yjM55760h4.m55780m9();
        c12012lr.m56623kk(c11913yjM55760h4);
        abstractC12008jd.mo17531k4(c12012lr, c12018u4M15467ck);
    }
}
