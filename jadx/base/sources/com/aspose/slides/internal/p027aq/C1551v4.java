package com.aspose.slides.internal.p027aq;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4627gi;

/* JADX INFO: renamed from: com.aspose.slides.internal.aq.v4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1551v4 extends AbstractC1559yd {

    /* JADX INFO: renamed from: k4 */
    private final long f6063k4;

    public C1551v4(long j) {
        this.f6063k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public void m8339k4(AbstractC4623f9 abstractC4623f9, C3149x1 c3149x1) {
        C4627gi c4627gi = (C4627gi) abstractC4623f9;
        if ((this.f6063k4 & 2) > 0) {
            new C1558xw().m8346k4(c4627gi.m19108k4(), c3149x1);
        }
        long j = this.f6063k4;
        long j2 = 8 & j;
        if ((4 & j) != 0) {
            if (j2 == 0) {
                if ((j & 16) == 0) {
                    new C1545to().m8333k4(c4627gi.m19111x1()[0], c3149x1);
                    return;
                } else {
                    new C1521du().m8309k4(c4627gi.m19111x1()[0], c3149x1);
                    return;
                }
            }
            return;
        }
        if (j2 == 0) {
            return;
        }
        if ((j & 16) == 0) {
            new C1521du().m8309k4(c4627gi.m19111x1()[1], c3149x1);
        } else {
            new C1521du().m8309k4(c4627gi.m19111x1()[0], c3149x1);
            new C1521du().m8309k4(c4627gi.m19111x1()[1], c3149x1);
        }
    }
}
