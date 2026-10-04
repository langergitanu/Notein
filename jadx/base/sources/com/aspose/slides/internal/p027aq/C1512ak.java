package com.aspose.slides.internal.p027aq;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4665vh;

/* JADX INFO: renamed from: com.aspose.slides.internal.aq.ak */
/* JADX INFO: loaded from: classes3.dex */
public class C1512ak extends AbstractC1559yd {

    /* JADX INFO: renamed from: k4 */
    private final long f6045k4;

    public C1512ak(long j) {
        this.f6045k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public void m8300k4(AbstractC4623f9 abstractC4623f9, C3149x1 c3149x1) {
        C4665vh c4665vh = (C4665vh) abstractC4623f9;
        if ((this.f6045k4 & 2) == 2) {
            new C1558xw().m8346k4(c4665vh.m19409k4(), c3149x1);
        }
        long j = this.f6045k4;
        if ((j & 4) != 0 || (j & 8) != 0) {
            if ((j & 4) == 4) {
                new C1545to().m8333k4(c4665vh.m19415x1(), c3149x1);
            } else if ((j & 8) == 8) {
                new C1521du().m8309k4(c4665vh.m19415x1(), c3149x1);
            }
        }
        if ((this.f6045k4 & 64) == 64) {
            new C1547u4().m8335k4(c4665vh.m19414kk(), c3149x1);
        }
    }
}
