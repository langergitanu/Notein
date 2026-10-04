package com.aspose.slides.internal.p344pt;

import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p146g9.AbstractC4229kk;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;
import com.aspose.slides.internal.p543z9.C13474jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.pt.ne */
/* JADX INFO: loaded from: classes4.dex */
public class C9523ne extends AbstractC9530rv {
    @Override // com.aspose.slides.internal.p344pt.AbstractC9530rv
    /* JADX INFO: renamed from: x1 */
    public void mo46684x1(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        AbstractC12536x1 abstractC12536x1M58363k4 = AbstractC12536x1.m58363k4(new C3152yj(((C13474jd) c4047sv).m62659x1()));
        try {
            AbstractC4229kk abstractC4229kkM17034k4 = AbstractC4229kk.m17034k4(abstractC12536x1M58363k4);
            abstractC4229kkM17034k4.mo17030k4(c3856h4.m15479ix());
            if (abstractC12008jd.mo17577u4().m55776k4()[0] != 0.0f) {
                float fMo15760yj = c3856h4.m15479ix().mo15760yj() / abstractC12536x1M58363k4.mo13502h4();
                float fMo15757m9 = c3856h4.m15479ix().mo15757m9() / abstractC12536x1M58363k4.mo13504m9();
                abstractC12008jd.mo17588x1(new C11913yj(fMo15760yj, 0.0f, 0.0f, fMo15757m9, (-abstractC12536x1M58363k4.mo13497E_()) * fMo15760yj, (-abstractC12536x1M58363k4.mo13498F_()) * fMo15757m9));
            }
            abstractC4229kkM17034k4.m17039k4(abstractC12008jd);
            if (abstractC12536x1M58363k4 != null) {
                abstractC12536x1M58363k4.dispose();
            }
        } finally {
        }
    }
}
