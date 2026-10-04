package com.aspose.slides.internal.p064cj;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p310o3.AbstractC6973k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p349q3.C9658ix;
import com.aspose.slides.internal.p349q3.C9670ks;
import com.aspose.slides.internal.p349q3.C9681ne;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p349q3.C9743yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.cj.ks */
/* JADX INFO: loaded from: classes3.dex */
public class C2485ks extends AbstractC6973k4 {
    /* JADX INFO: renamed from: k4 */
    private long m11866k4(C9658ix c9658ix) {
        if (C7019kk.m27469x1(c9658ix, C9670ks.class)) {
            return 0L;
        }
        if (C7019kk.m27469x1(c9658ix, C9743yj.class)) {
            return 726027589L;
        }
        return C7019kk.m27469x1(c9658ix, C9681ne.class) ? 1128875079L : 1L;
    }

    @Override // com.aspose.slides.internal.p310o3.AbstractC6973k4
    /* JADX INFO: renamed from: x1 */
    public boolean mo11861x1(C9723vw c9723vw, C3149x1 c3149x1) {
        AbstractC6973k4.m27276k4(c9723vw, c3149x1);
        C9658ix c9658ix = (C9658ix) c9723vw;
        c3149x1.m13447k4(c9658ix.m47290dy() & 4294967295L);
        int iM11866k4 = (int) m11866k4(c9658ix);
        return iM11866k4 != 0 ? iM11866k4 != 726027589 ? iM11866k4 != 1128875079 ? new C2541x6().m11869k4(c9658ix, c3149x1) : new C2550yj().m11870k4(c9658ix, c3149x1) : new C2478jd().m11865k4(c9658ix, c3149x1) : new C2451ck().m11863k4(c9658ix, c3149x1);
    }
}
