package com.aspose.slides.internal.p296nd;

import com.aspose.slides.internal.p042bn.C1724gi;
import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p441ui.C11315h4;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.nd.ss */
/* JADX INFO: loaded from: classes4.dex */
public class C6843ss extends AbstractC6841rv {
    @Override // com.aspose.slides.internal.p296nd.AbstractC6841rv
    /* JADX INFO: renamed from: x1 */
    public void mo26875x1(C1752sv c1752sv, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        C1724gi c1724gi = (C1724gi) c1752sv;
        C11896dy c11896dy = new C11896dy();
        int iM9261x1 = c1724gi.m9261x1();
        int iM9254k4 = c1724gi.m9254k4();
        if (iM9261x1 > c1724gi.m9259to() - c1724gi.m9258m9()) {
            iM9261x1 = c1724gi.m9259to() - c1724gi.m9258m9();
        }
        int i = iM9261x1;
        if (iM9254k4 > c1724gi.m9256kk() - c1724gi.m9252h4()) {
            iM9254k4 = c1724gi.m9256kk() - c1724gi.m9252h4();
        }
        int i2 = iM9254k4;
        c11896dy.m55539k4((int) c1724gi.m9258m9(), (int) c1724gi.m9252h4(), i, i2, 180.0f, 90.0f);
        float f = i / 2.0f;
        c11896dy.m55574x1(c1724gi.m9258m9() + f, c1724gi.m9252h4(), c1724gi.m9259to() - f, c1724gi.m9252h4());
        c11896dy.m55539k4(c1724gi.m9259to() - i, (int) c1724gi.m9252h4(), i, i2, -90.0f, 90.0f);
        int i3 = i2 / 2;
        c11896dy.m55576x1((int) c1724gi.m9259to(), c1724gi.m9252h4() + i3, (int) c1724gi.m9259to(), c1724gi.m9256kk() - i3);
        c11896dy.m55539k4(c1724gi.m9259to() - i, c1724gi.m9256kk() - i2, i, i2, 0.0f, 90.0f);
        c11896dy.m55574x1(c1724gi.m9259to() - f, c1724gi.m9256kk(), c1724gi.m9258m9() + f, c1724gi.m9256kk());
        c11896dy.m55539k4((int) c1724gi.m9258m9(), c1724gi.m9256kk() - i2, i, i2, 90.0f, 90.0f);
        c11896dy.m55576x1((int) c1724gi.m9258m9(), c1724gi.m9256kk() - i3, (int) c1724gi.m9258m9(), c1724gi.m9252h4() + i3);
        c11896dy.m55567m9();
        if (c11315h4.m54403dy() != null) {
            abstractC12008jd.mo17527k4(c11315h4.m54403dy(), c11896dy);
        }
        if (c11315h4.m54395c5() != null) {
            abstractC12008jd.mo17540k4(c11315h4.m54395c5(), c11896dy);
        }
    }
}
