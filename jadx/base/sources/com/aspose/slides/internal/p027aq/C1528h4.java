package com.aspose.slides.internal.p027aq;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4662up;
import com.aspose.slides.internal.p280ms.C6490k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.aq.h4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1528h4 extends AbstractC1559yd {
    /* JADX INFO: renamed from: k4 */
    public void m8316k4(AbstractC4623f9 abstractC4623f9, C3149x1 c3149x1) {
        C4662up c4662up = (C4662up) abstractC4623f9;
        c3149x1.m13455x1(c4662up.m19383x1());
        long position = c3149x1.m13442k4().getPosition();
        new C1520dq().m8308k4(c4662up.m19380k4(), c3149x1);
        if (((int) (c3149x1.m13442k4().getPosition() - position)) > c4662up.m19383x1()) {
            throw new C6490k4("Stream position is out of object bounds.");
        }
    }
}
