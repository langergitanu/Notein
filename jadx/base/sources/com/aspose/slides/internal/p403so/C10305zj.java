package com.aspose.slides.internal.p403so;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4628gk;
import com.aspose.slides.internal.p171hq.C4648qm;
import com.aspose.slides.internal.p171hq.C4680yo;

/* JADX INFO: renamed from: com.aspose.slides.internal.so.zj */
/* JADX INFO: loaded from: classes4.dex */
public class C10305zj extends AbstractC10258e0 {

    /* JADX INFO: renamed from: k4 */
    private final long f36725k4;

    /* JADX INFO: renamed from: x1 */
    private final int f36726x1;

    public C10305zj(long j, int i) {
        this.f36725k4 = j;
        this.f36726x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4623f9 m50259k4(C3134k4 c3134k4) {
        long position = c3134k4.m13371ck().getPosition();
        C4628gk c4628gk = new C4628gk();
        if ((this.f36725k4 & 2) > 0) {
            c4628gk.m19115k4((C4680yo) new C10279ri().m50233k4(c3134k4));
        }
        if (this.f36726x1 - ((int) (c3134k4.m13371ck().getPosition() - position)) > 24) {
            c4628gk.m19114k4((C4648qm) new C10298wy().m50252k4(c3134k4));
        }
        return c4628gk;
    }
}
