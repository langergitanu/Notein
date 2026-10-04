package com.aspose.slides.internal.p344pt;

import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p132fj.C4019gi;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.pt.kp */
/* JADX INFO: loaded from: classes4.dex */
public class C9517kp extends AbstractC9530rv {
    @Override // com.aspose.slides.internal.p344pt.AbstractC9530rv
    /* JADX INFO: renamed from: x1 */
    public void mo46684x1(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C4019gi c4019gi = (C4019gi) c4047sv;
        C11896dy c11896dy = new C11896dy();
        int iM15915x1 = c4019gi.m15915x1();
        int iM15908k4 = c4019gi.m15908k4();
        if (iM15915x1 > c4019gi.m15913to() - c4019gi.m15912m9()) {
            iM15915x1 = c4019gi.m15913to() - c4019gi.m15912m9();
        }
        int i = iM15915x1;
        if (iM15908k4 > c4019gi.m15910kk() - c4019gi.m15906h4()) {
            iM15908k4 = c4019gi.m15910kk() - c4019gi.m15906h4();
        }
        int i2 = iM15908k4;
        c11896dy.m55539k4((int) c4019gi.m15912m9(), (int) c4019gi.m15906h4(), i, i2, 180.0f, 90.0f);
        float f = i / 2.0f;
        c11896dy.m55574x1(c4019gi.m15912m9() + f, c4019gi.m15906h4(), c4019gi.m15913to() - f, c4019gi.m15906h4());
        c11896dy.m55539k4(c4019gi.m15913to() - i, (int) c4019gi.m15906h4(), i, i2, -90.0f, 90.0f);
        int i3 = i2 / 2;
        c11896dy.m55576x1((int) c4019gi.m15913to(), c4019gi.m15906h4() + i3, (int) c4019gi.m15913to(), c4019gi.m15910kk() - i3);
        c11896dy.m55539k4(c4019gi.m15913to() - i, c4019gi.m15910kk() - i2, i, i2, 0.0f, 90.0f);
        c11896dy.m55574x1(c4019gi.m15913to() - f, c4019gi.m15910kk(), c4019gi.m15912m9() + f, c4019gi.m15910kk());
        c11896dy.m55539k4((int) c4019gi.m15912m9(), c4019gi.m15910kk() - i2, i, i2, 90.0f, 90.0f);
        c11896dy.m55576x1((int) c4019gi.m15912m9(), c4019gi.m15910kk() - i3, (int) c4019gi.m15912m9(), c4019gi.m15906h4() + i3);
        c11896dy.m55567m9();
        if (c3856h4.m15472dy() != null) {
            abstractC12008jd.mo17527k4(c3856h4.m15472dy(), c11896dy);
        }
        if (c3856h4.m15464c5() != null) {
            abstractC12008jd.mo17540k4(c3856h4.m15464c5(), c11896dy);
        }
    }
}
