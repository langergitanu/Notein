package com.aspose.slides.internal.p027aq;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4678yd;

/* JADX INFO: renamed from: com.aspose.slides.internal.aq.ks */
/* JADX INFO: loaded from: classes3.dex */
public class C1534ks extends AbstractC1559yd {

    /* JADX INFO: renamed from: k4 */
    private final long f6056k4;

    public C1534ks(long j) {
        this.f6056k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public void m8322k4(AbstractC4623f9 abstractC4623f9, C3149x1 c3149x1) {
        C4678yd c4678yd = (C4678yd) abstractC4623f9;
        if ((this.f6056k4 & 1) > 0) {
            new C1529ix().m8317k4(c4678yd.m19510k4(), c3149x1);
        }
        if ((this.f6056k4 & 2) > 0) {
            new C1548um().m8336k4(c4678yd.m19514x1(), c3149x1);
        }
    }
}
