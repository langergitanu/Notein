package com.aspose.slides.internal.p134fo;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p539z4.AbstractC13373f9;
import com.aspose.slides.internal.p539z4.C13386jw;

/* JADX INFO: renamed from: com.aspose.slides.internal.fo.h4 */
/* JADX INFO: loaded from: classes.dex */
public class C4080h4 extends AbstractC4081k4 {
    /* JADX INFO: renamed from: k4 */
    public void m16243k4(AbstractC13373f9 abstractC13373f9, C3149x1 c3149x1) {
        C13386jw c13386jw = (C13386jw) abstractC13373f9;
        c3149x1.m13447k4(c13386jw.m62170x1() & 4294967295L);
        int iM62170x1 = (int) c13386jw.m62170x1();
        if (iM62170x1 == 1) {
            new C4084to(0).m16246k4(c13386jw.m62166k4(), c3149x1);
            return;
        }
        if (iM62170x1 == 2) {
            new C4084to(1).m16246k4(c13386jw.m62166k4(), c3149x1);
            return;
        }
        if (iM62170x1 == 3) {
            new C4084to(2).m16246k4(c13386jw.m62166k4(), c3149x1);
            return;
        }
        if (iM62170x1 == 4) {
            new C4084to(3).m16246k4(c13386jw.m62166k4(), c3149x1);
            return;
        }
        if (iM62170x1 == 5) {
            new C4084to(4).m16246k4(c13386jw.m62166k4(), c3149x1);
        } else if (iM62170x1 == 268435456) {
            new C4082kk().m16244k4(c13386jw.m62166k4(), c3149x1);
        } else {
            if (iM62170x1 != 268435457) {
                return;
            }
            new C4079du().m16242k4(c13386jw.m62166k4(), c3149x1);
        }
    }
}
