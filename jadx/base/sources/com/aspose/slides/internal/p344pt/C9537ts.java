package com.aspose.slides.internal.p344pt;

import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p132fj.C4007c6;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.pt.ts */
/* JADX INFO: loaded from: classes4.dex */
public class C9537ts extends AbstractC9530rv {
    @Override // com.aspose.slides.internal.p344pt.AbstractC9530rv
    /* JADX INFO: renamed from: x1 */
    public void mo46684x1(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C4007c6 c4007c6 = (C4007c6) c4047sv;
        C12025x6 c12025x6 = new C12025x6(c4007c6.m15857to(), c4007c6.m15853kk());
        C12025x6 c12025x62 = new C12025x6(c4007c6.m15859x1(), c4007c6.m15851k4());
        C12014ne c12014neClone = C12014ne.m56654k4(c4007c6.m15845c5(), c4007c6.m15847dy(), c4007c6.m15855m9(), c4007c6.m15849h4()).Clone();
        C12025x6 c12025x63 = new C12025x6((c12014neClone.m56663c5() / 2) + c12014neClone.m56669jd(), (c12014neClone.m56683x1() / 2) + c12014neClone.m56664ck());
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
        if (c3856h4.m15472dy() != null) {
            abstractC12008jd.mo17530k4(c3856h4.m15472dy(), c12014neClone.Clone(), f2, f);
        }
        if (c3856h4.m15464c5() != null) {
            abstractC12008jd.mo17600x1(c3856h4.m15464c5(), c12014neClone.Clone(), f2, f);
        }
    }
}
