package com.aspose.slides.internal.p403so;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.AbstractC4671x1;
import com.aspose.slides.internal.p171hq.C4629h4;
import com.aspose.slides.internal.p171hq.C4648qm;
import com.aspose.slides.internal.p171hq.C4653s7;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p280ms.C6490k4;
import com.aspose.slides.internal.p396sc.C10190ks;
import com.aspose.slides.internal.p542z7.C13454kk;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.so.wy */
/* JADX INFO: loaded from: classes4.dex */
public class C10298wy extends AbstractC10258e0 {
    /* JADX INFO: renamed from: k4 */
    public AbstractC4623f9 m50252k4(C3134k4 c3134k4) {
        AbstractC4671x1 abstractC4671x1;
        C4648qm c4648qm = new C4648qm();
        c4648qm.m19054k4(C13454kk.m62588k4(c3134k4));
        c4648qm.m19309k4(c3134k4.m13384uz() & 4294967295L);
        int iM19311x1 = (int) c4648qm.m19311x1();
        if (iM19311x1 == 0) {
            C6005k4.m24264to(C14113y2.m67408k4("Unknown image type: ", C14042ak.m66410k4(C10190ks.class, c4648qm.m19311x1())));
            abstractC4671x1 = null;
        } else if (iM19311x1 == 1) {
            abstractC4671x1 = (C4629h4) new C10269kk().m50223k4(c3134k4);
        } else {
            if (iM19311x1 != 2) {
                throw new C6490k4(C14113y2.m67408k4("Unknown image type: ", C14042ak.m66410k4(C10190ks.class, c4648qm.m19311x1())));
            }
            abstractC4671x1 = (C4653s7) new C10287ts().m50241k4(c3134k4);
        }
        c4648qm.m19310k4(abstractC4671x1);
        return c4648qm;
    }
}
