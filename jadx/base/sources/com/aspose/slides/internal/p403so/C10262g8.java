package com.aspose.slides.internal.p403so;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4614c5;
import com.aspose.slides.internal.p171hq.C4618dq;
import com.aspose.slides.internal.p171hq.C4620dy;
import com.aspose.slides.internal.p171hq.C4635jd;
import com.aspose.slides.internal.p171hq.C4665vh;
import com.aspose.slides.internal.p171hq.C4680yo;

/* JADX INFO: renamed from: com.aspose.slides.internal.so.g8 */
/* JADX INFO: loaded from: classes4.dex */
public class C10262g8 extends AbstractC10258e0 {

    /* JADX INFO: renamed from: k4 */
    private final long f36717k4;

    public C10262g8(long j) {
        this.f36717k4 = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC4623f9 m50216k4(C3134k4 c3134k4) {
        C4620dy c4620dy;
        C4665vh c4665vh = new C4665vh();
        if ((this.f36717k4 & 2) == 2) {
            c4665vh.m19412k4((C4680yo) new C10279ri().m50233k4(c3134k4));
        }
        long j = this.f36717k4;
        if ((j & 4) != 0 || (j & 8) != 0) {
            c4620dy = (j & 4) == 4 ? (C4614c5) new C10285to().m50239k4(c3134k4) : (j & 8) == 8 ? (C4635jd) new C10256du().m50211k4(c3134k4) : null;
        }
        c4665vh.m19411k4(c4620dy);
        if ((this.f36717k4 & 64) == 64) {
            c4665vh.m19410k4((C4618dq) new C10250bv().m50205k4(c3134k4));
        }
        return c4665vh;
    }
}
