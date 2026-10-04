package com.aspose.slides.internal.p403so;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4608ak;
import com.aspose.slides.internal.p171hq.C4654ss;
import com.aspose.slides.internal.p171hq.C4678yd;

/* JADX INFO: renamed from: com.aspose.slides.internal.so.uz */
/* JADX INFO: loaded from: classes4.dex */
public class C10291uz extends AbstractC10258e0 {

    /* JADX INFO: renamed from: k4 */
    private final long f36721k4;

    public C10291uz(long j) {
        this.f36721k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4623f9 m50245k4(C3134k4 c3134k4) {
        C4678yd c4678yd = new C4678yd();
        if ((this.f36721k4 & 1) > 0) {
            c4678yd.m19511k4((C4608ak) new C10289um().m50243k4(c3134k4));
        }
        if ((this.f36721k4 & 2) > 0) {
            c4678yd.m19512k4((C4654ss) new C10255dq().m50210k4(c3134k4));
        }
        return c4678yd;
    }
}
