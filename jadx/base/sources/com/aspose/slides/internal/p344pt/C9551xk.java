package com.aspose.slides.internal.p344pt;

import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p132fj.C4010dq;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12018u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.pt.xk */
/* JADX INFO: loaded from: classes4.dex */
public class C9551xk extends AbstractC9530rv {
    @Override // com.aspose.slides.internal.p344pt.AbstractC9530rv
    /* JADX INFO: renamed from: x1 */
    public void mo46684x1(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C4010dq c4010dq = (C4010dq) c4047sv;
        if ((c4010dq.m15863k4() & 65535) >= c3856h4.m15510m9().length) {
            return;
        }
        C12018u4 c12018u4M15467ck = c3856h4.m15467ck(c4010dq.m15863k4());
        if (c3856h4.m15472dy() == null || c12018u4M15467ck == null) {
            return;
        }
        abstractC12008jd.mo17531k4(c3856h4.m15472dy(), c12018u4M15467ck);
    }
}
