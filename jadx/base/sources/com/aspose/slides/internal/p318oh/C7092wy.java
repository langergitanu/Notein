package com.aspose.slides.internal.p318oh;

import com.aspose.slides.internal.p026an.C1488ks;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p288n1.C6682kk;
import com.aspose.slides.internal.p501xj.C12537k4;
import com.aspose.slides.internal.p539z4.AbstractC13373f9;
import com.aspose.slides.internal.p539z4.AbstractC13421x1;
import com.aspose.slides.internal.p539z4.C13379h4;
import com.aspose.slides.internal.p539z4.C13398qm;
import com.aspose.slides.internal.p539z4.C13403s7;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.oh.wy */
/* JADX INFO: loaded from: classes4.dex */
public class C7092wy extends AbstractC7052e0 {
    /* JADX INFO: renamed from: k4 */
    public AbstractC13373f9 m27613k4(C3134k4 c3134k4) {
        AbstractC13421x1 abstractC13421x1;
        C13398qm c13398qm = new C13398qm();
        c13398qm.m62058k4(C6682kk.m26433k4(c3134k4));
        c13398qm.m62302k4(c3134k4.m13384uz() & 4294967295L);
        int iM62304x1 = (int) c13398qm.m62304x1();
        if (iM62304x1 == 0) {
            C6005k4.m24264to(C14113y2.m67408k4("Unknown image type: ", C14042ak.m66410k4(C1488ks.class, c13398qm.m62304x1())));
            abstractC13421x1 = null;
        } else if (iM62304x1 == 1) {
            abstractC13421x1 = (C13379h4) new C7063kk().m27584k4(c3134k4);
        } else {
            if (iM62304x1 != 2) {
                throw new C12537k4(C14113y2.m67408k4("Unknown image type: ", C14042ak.m66410k4(C1488ks.class, c13398qm.m62304x1())));
            }
            abstractC13421x1 = (C13403s7) new C7081ts().m27602k4(c3134k4);
        }
        c13398qm.m62303k4(abstractC13421x1);
        return c13398qm;
    }
}
