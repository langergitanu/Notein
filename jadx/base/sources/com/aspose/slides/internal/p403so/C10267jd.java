package com.aspose.slides.internal.p403so;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.AbstractC4638kk;
import com.aspose.slides.internal.p171hq.C4621e0;
import com.aspose.slides.internal.p171hq.C4631ig;
import com.aspose.slides.internal.p171hq.C4634j5;
import com.aspose.slides.internal.p171hq.C4639kp;
import com.aspose.slides.internal.p171hq.C4652rv;
import com.aspose.slides.internal.p171hq.C4666vj;
import com.aspose.slides.internal.p280ms.C6490k4;
import com.aspose.slides.internal.p396sc.C10188kk;
import com.aspose.slides.internal.p542z7.C13454kk;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.so.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C10267jd extends AbstractC10258e0 {

    /* JADX INFO: renamed from: k4 */
    private final int f36718k4;

    public C10267jd(int i) {
        this.f36718k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4623f9 m50221k4(C3134k4 c3134k4) {
        AbstractC4638kk abstractC4638kk;
        C4652rv c4652rv = new C4652rv();
        c4652rv.m19054k4(C13454kk.m62588k4(c3134k4));
        c4652rv.m19331k4(c3134k4.m13384uz() & 4294967295L);
        int i = this.f36718k4 - 8;
        int iM19334x1 = (int) c4652rv.m19334x1();
        if (iM19334x1 == 0) {
            abstractC4638kk = (C4634j5) new C10266j2().m50220k4(c3134k4);
        } else if (iM19334x1 == 1) {
            abstractC4638kk = (C4621e0) new C10272lr().m50226k4(c3134k4);
        } else if (iM19334x1 == 2) {
            abstractC4638kk = (C4631ig) new C10259em(i).m50213k4(c3134k4);
        } else if (iM19334x1 == 3) {
            abstractC4638kk = (C4666vj) new C10276qm().m50230k4(c3134k4);
        } else {
            if (iM19334x1 != 4) {
                throw new C6490k4(C14113y2.m67408k4("Unknown brush type: ", C14042ak.m66410k4(C10188kk.class, c4652rv.m19334x1())));
            }
            abstractC4638kk = (C4639kp) new C10301xk().m50255k4(c3134k4);
        }
        c4652rv.m19332k4(abstractC4638kk);
        return c4652rv;
    }
}
