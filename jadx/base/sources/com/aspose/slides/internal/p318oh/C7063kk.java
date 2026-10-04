package com.aspose.slides.internal.p318oh;

import com.aspose.slides.internal.p026an.C1485k4;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p501xj.C12537k4;
import com.aspose.slides.internal.p539z4.AbstractC13373f9;
import com.aspose.slides.internal.p539z4.AbstractC13421x1;
import com.aspose.slides.internal.p539z4.C13379h4;
import com.aspose.slides.internal.p539z4.C13394m9;
import com.aspose.slides.internal.p539z4.C13399qq;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.oh.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C7063kk extends AbstractC7052e0 {
    /* JADX INFO: renamed from: k4 */
    public AbstractC13373f9 m27584k4(C3134k4 c3134k4) {
        AbstractC13421x1 abstractC13421x1;
        C13379h4 c13379h4 = new C13379h4();
        c13379h4.m62126kk(c3134k4.m13386x6());
        c13379h4.m62122k4(c3134k4.m13386x6());
        c13379h4.m62130x1(c3134k4.m13386x6());
        c13379h4.m62123k4(c3134k4.m13384uz() & 4294967295L);
        c13379h4.m62131x1(c3134k4.m13384uz() & 4294967295L);
        c3134k4.m13371ck().getPosition();
        int iM62120dy = (int) c13379h4.m62120dy();
        if (iM62120dy == 0) {
            abstractC13421x1 = (C13394m9) new C7093x1(c13379h4).m27614k4(c3134k4);
        } else {
            if (iM62120dy != 1) {
                throw new C12537k4(C14113y2.m67408k4("Unknown bitmap data type: ", C14042ak.m66410k4(C1485k4.class, c13379h4.m62120dy())));
            }
            abstractC13421x1 = (C13399qq) new C7094x6().m27615k4(c3134k4);
        }
        c13379h4.m62124k4(abstractC13421x1);
        return c13379h4;
    }
}
