package com.aspose.slides.internal.p027aq;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4633j2;
import com.aspose.slides.internal.p292n5.C6743to;

/* JADX INFO: renamed from: com.aspose.slides.internal.aq.ts */
/* JADX INFO: loaded from: classes3.dex */
public class C1546ts extends AbstractC1559yd {

    /* JADX INFO: renamed from: k4 */
    private final int f6062k4;

    public C1546ts(int i) {
        this.f6062k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m8334k4(AbstractC4623f9 abstractC4623f9, C3149x1 c3149x1) {
        C4633j2 c4633j2 = (C4633j2) abstractC4623f9;
        long position = c3149x1.m13442k4().getPosition();
        C6743to.m26602k4(c4633j2.m19053c5(), c3149x1);
        c3149x1.m13455x1(c4633j2.m19154k4());
        new C1557xk().m8345k4(c4633j2.m19161x1(), c3149x1);
        new C1522dy(this.f6062k4 - ((int) (c3149x1.m13442k4().getPosition() - position))).m8310k4(c4633j2.m19159kk(), c3149x1);
    }
}
