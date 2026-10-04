package com.aspose.slides.internal.p027aq;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.AbstractC4671x1;
import com.aspose.slides.internal.p171hq.C4629h4;
import com.aspose.slides.internal.p171hq.C4648qm;
import com.aspose.slides.internal.p171hq.C4653s7;
import com.aspose.slides.internal.p280ms.C6490k4;
import com.aspose.slides.internal.p292n5.C6743to;
import com.aspose.slides.internal.p396sc.C10190ks;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.aq.ar */
/* JADX INFO: loaded from: classes3.dex */
public class C1513ar extends AbstractC1559yd {

    /* JADX INFO: renamed from: k4 */
    private final C4648qm f6046k4;

    /* JADX INFO: renamed from: kk */
    private final int f6047kk;

    /* JADX INFO: renamed from: x1 */
    private final int f6048x1;

    public C1513ar(C4648qm c4648qm, int i, int i2) {
        this.f6046k4 = c4648qm;
        this.f6048x1 = i;
        this.f6047kk = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public void m8301k4(AbstractC4623f9 abstractC4623f9, C3149x1 c3149x1) {
        AbstractC4671x1 abstractC4671x1M19308k4;
        int i;
        int i2;
        C4648qm c4648qm = (C4648qm) abstractC4623f9;
        C4648qm c4648qm2 = this.f6046k4;
        if (c4648qm2 == null) {
            C6743to.m26602k4(c4648qm.m19053c5(), c3149x1);
            c3149x1.m13447k4(c4648qm.m19311x1() & 4294967295L);
            i2 = this.f6048x1 - 8;
            i = this.f6047kk - 8;
            abstractC4671x1M19308k4 = null;
        } else {
            abstractC4671x1M19308k4 = c4648qm2.m19308k4();
            i = this.f6048x1;
            c4648qm = c4648qm2;
            i2 = i;
        }
        int iM19311x1 = (int) c4648qm.m19311x1();
        if (iM19311x1 == 0) {
            c3149x1.m13442k4().seek(i2, 1);
        } else if (iM19311x1 == 1) {
            new C1532kk((C4629h4) abstractC4671x1M19308k4, i2, i).m8320k4(c4648qm.m19308k4(), c3149x1);
        } else {
            if (iM19311x1 != 2) {
                throw new C6490k4(C14113y2.m67408k4("Unknown image type: ", C14042ak.m66410k4(C10190ks.class, c4648qm.m19311x1())));
            }
            new C1535lr((C4653s7) abstractC4671x1M19308k4, i2, i).m8323k4(c4648qm.m19308k4(), c3149x1);
        }
    }
}
