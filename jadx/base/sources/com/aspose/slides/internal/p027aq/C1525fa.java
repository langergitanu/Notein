package com.aspose.slides.internal.p027aq;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4661um;
import com.aspose.slides.internal.p280ms.C6490k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.aq.fa */
/* JADX INFO: loaded from: classes3.dex */
public class C1525fa extends AbstractC1559yd {
    /* JADX INFO: renamed from: k4 */
    public void m8313k4(AbstractC4623f9 abstractC4623f9, C3149x1 c3149x1) {
        C4661um c4661um = (C4661um) abstractC4623f9;
        c3149x1.m13455x1(c4661um.m19378x1());
        long position = c3149x1.m13442k4().getPosition();
        new C1540rv().m8328k4(c4661um.m19374k4(), c3149x1);
        if (c4661um.m19378x1() != ((int) (c3149x1.m13442k4().getPosition() - position))) {
            throw new C6490k4("Writeed more bytes than the object size.");
        }
    }
}
