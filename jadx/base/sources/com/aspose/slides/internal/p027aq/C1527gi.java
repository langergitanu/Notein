package com.aspose.slides.internal.p027aq;

import com.aspose.slides.internal.p059c9.C1989k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4673x6;
import com.aspose.slides.internal.p171hq.C4677y9;

/* JADX INFO: renamed from: com.aspose.slides.internal.aq.gi */
/* JADX INFO: loaded from: classes3.dex */
public class C1527gi extends AbstractC1559yd {
    /* JADX INFO: renamed from: k4 */
    public void m8315k4(AbstractC4623f9 abstractC4623f9, C3149x1 c3149x1) {
        C4677y9 c4677y9 = (C4677y9) abstractC4623f9;
        if (c4677y9.m19508k4() == null) {
            return;
        }
        if (c4677y9.m19508k4().length > 0) {
            C1989k4.m10120k4(c4677y9.m19508k4(), c3149x1);
        }
        if (c4677y9.m19509x1() == null || c4677y9.m19509x1().length <= 0) {
            return;
        }
        for (C4673x6 c4673x6 : c4677y9.m19509x1()) {
            new C1517c5().m8305k4(c4673x6, c3149x1);
        }
    }
}
