package com.aspose.slides.internal.p027aq;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4629h4;
import com.aspose.slides.internal.p171hq.C4644m9;
import com.aspose.slides.internal.p396sc.C10178dq;

/* JADX INFO: renamed from: com.aspose.slides.internal.aq.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1555x1 extends AbstractC1559yd {

    /* JADX INFO: renamed from: k4 */
    private final C4629h4 f6064k4;

    public C1555x1(C4629h4 c4629h4) {
        this.f6064k4 = c4629h4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m8343k4(AbstractC4623f9 abstractC4623f9, C3149x1 c3149x1) {
        C4644m9 c4644m9 = (C4644m9) abstractC4623f9;
        if (C10178dq.m50011x1(this.f6064k4.m19128m9())) {
            new C1514b3().m8302k4(c4644m9.m19240to(), c3149x1);
        }
        int iM19120dy = this.f6064k4.m19120dy() - ((this.f6064k4.m19121jd() * C10178dq.m50010k4(this.f6064k4.m19128m9())) / 8);
        for (byte[] bArr : c4644m9.m19237du()) {
            c3149x1.m13450k4(bArr);
            c3149x1.m13442k4().seek(iM19120dy, 1);
        }
    }
}
