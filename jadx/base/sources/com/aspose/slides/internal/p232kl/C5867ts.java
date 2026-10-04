package com.aspose.slides.internal.p232kl;

import com.aspose.slides.internal.p042bn.C1745qm;
import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p441ui.C11315h4;
import com.aspose.slides.internal.p441ui.C11316k4;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p533yv.AbstractC13336x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.kl.ts */
/* JADX INFO: loaded from: classes.dex */
public class C5867ts extends AbstractC13336x1 {
    @Override // com.aspose.slides.internal.p533yv.AbstractC13336x1
    /* JADX INFO: renamed from: k4 */
    public C11316k4 mo23714k4(C1752sv c1752sv, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        C1745qm c1745qm = (C1745qm) c1752sv;
        if (c1745qm.m9373k4() <= 0) {
            return C11316k4.m54471kk();
        }
        C12014ne c12014ne = new C12014ne(c1745qm.m9376x1()[0].m58123kk().Clone(), new C12023wl());
        for (int i = 0; i < c1745qm.m9376x1().length; i++) {
            C12014ne.m56662x1(c12014ne.Clone(), new C12014ne(c1745qm.m9376x1()[i].m58123kk().Clone(), new C12023wl())).CloneTo(c12014ne);
        }
        return new C11316k4(c12014ne.Clone());
    }
}
