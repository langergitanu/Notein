package com.aspose.slides.internal.p027aq;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.AbstractC4671x1;
import com.aspose.slides.internal.p171hq.C4629h4;
import com.aspose.slides.internal.p280ms.C6490k4;
import com.aspose.slides.internal.p396sc.C10187k4;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.aq.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C1532kk extends AbstractC1559yd {

    /* JADX INFO: renamed from: k4 */
    private final C4629h4 f6053k4;

    /* JADX INFO: renamed from: kk */
    private final int f6054kk;

    /* JADX INFO: renamed from: x1 */
    private final int f6055x1;

    public C1532kk(C4629h4 c4629h4, int i, int i2) {
        this.f6053k4 = c4629h4;
        this.f6055x1 = i;
        this.f6054kk = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public void m8320k4(AbstractC4623f9 abstractC4623f9, C3149x1 c3149x1) {
        int i;
        C4629h4 c4629h4 = this.f6053k4;
        if (c4629h4 == null) {
            c4629h4 = (C4629h4) abstractC4623f9;
            c3149x1.m13455x1(c4629h4.m19121jd());
            c3149x1.m13455x1(c4629h4.m19119du());
            c3149x1.m13455x1(c4629h4.m19120dy());
            c3149x1.m13447k4(c4629h4.m19128m9() & 4294967295L);
            c3149x1.m13447k4(c4629h4.m19118c5() & 4294967295L);
            i = this.f6055x1 - 20;
        } else {
            c4629h4.m19129to();
            i = this.f6055x1;
        }
        AbstractC4671x1 abstractC4671x1M19129to = c4629h4.m19129to();
        long position = c3149x1.m13442k4().getPosition();
        int iM19118c5 = (int) c4629h4.m19118c5();
        if (iM19118c5 == 0) {
            new C1555x1(c4629h4).m8343k4(abstractC4671x1M19129to, c3149x1);
        } else {
            if (iM19118c5 != 1) {
                throw new C6490k4(C14113y2.m67408k4("Unknown bitmap data type: ", C14042ak.m66410k4(C10187k4.class, c4629h4.m19118c5())));
            }
            new C1519ck().m8307k4(abstractC4671x1M19129to, c3149x1);
        }
        if (position + ((long) i) != c3149x1.m13442k4().getPosition()) {
            throw new C6490k4("Writeed more bytes than the object size.");
        }
    }
}
