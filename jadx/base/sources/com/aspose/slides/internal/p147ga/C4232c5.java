package com.aspose.slides.internal.p147ga;

import com.aspose.slides.internal.p049bx.C1876du;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p260ly.AbstractC6280ne;
import com.aspose.slides.internal.p260ly.C6290x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.ga.c5 */
/* JADX INFO: loaded from: classes.dex */
public class C4232c5 extends AbstractC4233ck {
    /* JADX INFO: renamed from: k4 */
    public void m17061k4(C3149x1 c3149x1, AbstractC6280ne abstractC6280ne) {
        C6290x6 c6290x6 = (C6290x6) abstractC6280ne;
        c3149x1.m13447k4(c6290x6.m25715k4() & 4294967295L);
        c3149x1.m13447k4(c6290x6.m25727x1() & 4294967295L);
        c3149x1.m13447k4(c6290x6.m25725to() & 65535);
        new C1876du().m9794k4(c3149x1, c6290x6.m25713h4());
        c3149x1.m13447k4(c6290x6.m25724m9() & 4294967295L);
        c3149x1.m13447k4(c6290x6.m25712dy() & 4294967295L);
        if (c6290x6.m25711c5() != null) {
            for (long j : c6290x6.m25711c5()) {
                c3149x1.m13447k4(j & 4294967295L);
            }
        }
    }
}
