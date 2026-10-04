package com.aspose.slides.internal.p422tl;

import com.aspose.slides.internal.p018aa.C1316du;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p260ly.AbstractC6280ne;
import com.aspose.slides.internal.p260ly.C6290x6;
import com.aspose.slides.internal.p488x0.C12334dy;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.tl.fa */
/* JADX INFO: loaded from: classes4.dex */
public class C11049fa extends AbstractC11065yj {
    /* JADX INFO: renamed from: k4 */
    public AbstractC6280ne m53481k4(C3134k4 c3134k4) {
        C6290x6 c6290x6 = new C6290x6();
        c6290x6.m25718k4(c3134k4.m13384uz() & 4294967295L);
        c6290x6.m25728x1(c3134k4.m13384uz());
        c6290x6.m25717k4((int) (c3134k4.m13384uz() & C18177fb.f54859s));
        c6290x6.m25719k4((C12334dy) new C1316du().m7797k4(c3134k4));
        c6290x6.m25723kk(c3134k4.m13384uz());
        c6290x6.m25726to(c3134k4.m13384uz());
        if ((c6290x6.m25712dy() & 4294967295L) > 0) {
            c6290x6.m25720k4(new long[(int) c6290x6.m25712dy()]);
            for (int i = 0; i < (c6290x6.m25712dy() & 4294967295L); i++) {
                c6290x6.m25711c5()[i] = c3134k4.m13384uz();
            }
        }
        return c6290x6;
    }
}
