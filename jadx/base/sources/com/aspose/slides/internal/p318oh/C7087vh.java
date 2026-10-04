package com.aspose.slides.internal.p318oh;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p539z4.AbstractC13373f9;
import com.aspose.slides.internal.p539z4.AbstractC13376gf;
import com.aspose.slides.internal.p539z4.C13366ca;
import com.aspose.slides.internal.p539z4.C13386jw;
import com.aspose.slides.internal.p539z4.C13393m4;
import com.aspose.slides.internal.p539z4.C13426y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.oh.vh */
/* JADX INFO: loaded from: classes4.dex */
public class C7087vh extends AbstractC7052e0 {
    /* JADX INFO: renamed from: k4 */
    public AbstractC13373f9 m27608k4(C3134k4 c3134k4) {
        C7096xw c7096xw;
        AbstractC13376gf abstractC13376gf;
        C13386jw c13386jw = new C13386jw();
        c13386jw.m62167k4(c3134k4.m13384uz() & 4294967295L);
        int iM62170x1 = (int) c13386jw.m62170x1();
        if (iM62170x1 == 1) {
            c7096xw = new C7096xw(0);
        } else if (iM62170x1 == 2) {
            c7096xw = new C7096xw(1);
        } else if (iM62170x1 == 3) {
            c7096xw = new C7096xw(2);
        } else if (iM62170x1 == 4) {
            c7096xw = new C7096xw(3);
        } else {
            if (iM62170x1 != 5) {
                abstractC13376gf = iM62170x1 != 268435456 ? iM62170x1 != 268435457 ? null : (C13393m4) new C7088vj().m27609k4(c3134k4) : (C13366ca) new C7075s7().m27596k4(c3134k4);
                c13386jw.m62168k4(abstractC13376gf);
                return c13386jw;
            }
            c7096xw = new C7096xw(4);
        }
        abstractC13376gf = (C13426y2) c7096xw.m27617k4(c3134k4);
        c13386jw.m62168k4(abstractC13376gf);
        return c13386jw;
    }
}
