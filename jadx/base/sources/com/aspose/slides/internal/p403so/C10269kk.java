package com.aspose.slides.internal.p403so;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.AbstractC4671x1;
import com.aspose.slides.internal.p171hq.C4629h4;
import com.aspose.slides.internal.p171hq.C4644m9;
import com.aspose.slides.internal.p171hq.C4649qq;
import com.aspose.slides.internal.p280ms.C6490k4;
import com.aspose.slides.internal.p396sc.C10187k4;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.so.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C10269kk extends AbstractC10258e0 {
    /* JADX INFO: renamed from: k4 */
    public AbstractC4623f9 m50223k4(C3134k4 c3134k4) {
        AbstractC4671x1 abstractC4671x1;
        C4629h4 c4629h4 = new C4629h4();
        c4629h4.m19126kk(c3134k4.m13386x6());
        c4629h4.m19123k4(c3134k4.m13386x6());
        c4629h4.m19131x1(c3134k4.m13386x6());
        c4629h4.m19124k4(c3134k4.m13384uz() & 4294967295L);
        c4629h4.m19132x1(c3134k4.m13384uz() & 4294967295L);
        c3134k4.m13371ck().getPosition();
        int iM19118c5 = (int) c4629h4.m19118c5();
        if (iM19118c5 == 0) {
            abstractC4671x1 = (C4644m9) new C10299x1(c4629h4).m50253k4(c3134k4);
        } else {
            if (iM19118c5 != 1) {
                throw new C6490k4(C14113y2.m67408k4("Unknown bitmap data type: ", C14042ak.m66410k4(C10187k4.class, c4629h4.m19118c5())));
            }
            abstractC4671x1 = (C4649qq) new C10300x6().m50254k4(c3134k4);
        }
        c4629h4.m19125k4(abstractC4671x1);
        return c4629h4;
    }
}
