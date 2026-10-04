package com.aspose.slides.internal.p027aq;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4628gk;

/* JADX INFO: renamed from: com.aspose.slides.internal.aq.t6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1544t6 extends AbstractC1559yd {

    /* JADX INFO: renamed from: k4 */
    private final long f6060k4;

    /* JADX INFO: renamed from: x1 */
    private final int f6061x1;

    public C1544t6(long j, int i) {
        this.f6060k4 = j;
        this.f6061x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m8332k4(AbstractC4623f9 abstractC4623f9, C3149x1 c3149x1) {
        long position = c3149x1.m13442k4().getPosition();
        C4628gk c4628gk = (C4628gk) abstractC4623f9;
        if ((this.f6060k4 & 2) > 0) {
            new C1558xw().m8346k4(c4628gk.m19113k4(), c3149x1);
        }
        int position2 = this.f6061x1 - ((int) (c3149x1.m13442k4().getPosition() - position));
        if (c4628gk.m19116x1() != null) {
            new C1513ar(null, position2, position2).m8301k4(c4628gk.m19116x1(), c3149x1);
        }
    }
}
