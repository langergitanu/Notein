package com.aspose.slides.internal.p318oh;

import com.aspose.slides.internal.p026an.C1486kk;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p288n1.C6682kk;
import com.aspose.slides.internal.p501xj.C12537k4;
import com.aspose.slides.internal.p539z4.AbstractC13373f9;
import com.aspose.slides.internal.p539z4.AbstractC13388kk;
import com.aspose.slides.internal.p539z4.C13371e0;
import com.aspose.slides.internal.p539z4.C13381ig;
import com.aspose.slides.internal.p539z4.C13384j5;
import com.aspose.slides.internal.p539z4.C13389kp;
import com.aspose.slides.internal.p539z4.C13402rv;
import com.aspose.slides.internal.p539z4.C13416vj;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.oh.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C7061jd extends AbstractC7052e0 {

    /* JADX INFO: renamed from: k4 */
    private final int f19215k4;

    public C7061jd(int i) {
        this.f19215k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC13373f9 m27582k4(C3134k4 c3134k4) {
        AbstractC13388kk abstractC13388kk;
        C13402rv c13402rv = new C13402rv();
        c13402rv.m62058k4(C6682kk.m26433k4(c3134k4));
        c13402rv.m62320k4(c3134k4.m13384uz() & 4294967295L);
        int i = this.f19215k4 - 8;
        int iM62323x1 = (int) c13402rv.m62323x1();
        if (iM62323x1 == 0) {
            abstractC13388kk = (C13384j5) new C7060j2().m27581k4(c3134k4);
        } else if (iM62323x1 == 1) {
            abstractC13388kk = (C13371e0) new C7066lr().m27587k4(c3134k4);
        } else if (iM62323x1 == 2) {
            abstractC13388kk = (C13381ig) new C7053em(i).m27574k4(c3134k4);
        } else if (iM62323x1 == 3) {
            abstractC13388kk = (C13416vj) new C7070qm().m27591k4(c3134k4);
        } else {
            if (iM62323x1 != 4) {
                throw new C12537k4(C14113y2.m67408k4("Unknown brush type: ", C14042ak.m66410k4(C1486kk.class, c13402rv.m62323x1())));
            }
            abstractC13388kk = (C13389kp) new C7095xk().m27616k4(c3134k4);
        }
        c13402rv.m62321k4(abstractC13388kk);
        return c13402rv;
    }
}
