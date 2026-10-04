package com.aspose.slides.internal.p403so;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4614c5;
import com.aspose.slides.internal.p171hq.C4620dy;
import com.aspose.slides.internal.p171hq.C4627gi;
import com.aspose.slides.internal.p171hq.C4635jd;
import com.aspose.slides.internal.p171hq.C4680yo;

/* JADX INFO: renamed from: com.aspose.slides.internal.so.c6 */
/* JADX INFO: loaded from: classes4.dex */
public class C10253c6 extends AbstractC10258e0 {

    /* JADX INFO: renamed from: k4 */
    private final long f36715k4;

    public C10253c6(long j) {
        this.f36715k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4623f9 m50208k4(C3134k4 c3134k4) {
        C4627gi c4627gi = new C4627gi();
        if ((this.f36715k4 & 2) > 0) {
            c4627gi.m19109k4((C4680yo) new C10279ri().m50233k4(c3134k4));
        }
        C4620dy[] c4620dyArr = new C4620dy[2];
        long j = this.f36715k4;
        long j2 = 8 & j;
        if ((4 & j) == 0) {
            if (j2 != 0) {
                if ((j & 16) == 0) {
                    c4620dyArr[1] = (C4635jd) new C10256du().m50211k4(c3134k4);
                } else {
                    c4620dyArr[0] = (C4635jd) new C10256du().m50211k4(c3134k4);
                    c4620dyArr[1] = (C4635jd) new C10256du().m50211k4(c3134k4);
                }
            }
        } else if (j2 == 0) {
            if ((j & 16) == 0) {
                c4620dyArr[0] = (C4614c5) new C10285to().m50239k4(c3134k4);
            } else {
                c4620dyArr[0] = (C4635jd) new C10256du().m50211k4(c3134k4);
            }
        }
        c4627gi.m19110k4(c4620dyArr);
        return c4627gi;
    }
}
