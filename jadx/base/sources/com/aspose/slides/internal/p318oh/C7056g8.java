package com.aspose.slides.internal.p318oh;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p539z4.AbstractC13373f9;
import com.aspose.slides.internal.p539z4.C13364c5;
import com.aspose.slides.internal.p539z4.C13368dq;
import com.aspose.slides.internal.p539z4.C13370dy;
import com.aspose.slides.internal.p539z4.C13385jd;
import com.aspose.slides.internal.p539z4.C13415vh;
import com.aspose.slides.internal.p539z4.C13430yo;

/* JADX INFO: renamed from: com.aspose.slides.internal.oh.g8 */
/* JADX INFO: loaded from: classes4.dex */
public class C7056g8 extends AbstractC7052e0 {

    /* JADX INFO: renamed from: k4 */
    private final long f19214k4;

    public C7056g8(long j) {
        this.f19214k4 = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC13373f9 m27577k4(C3134k4 c3134k4) {
        C13370dy c13370dy;
        C13415vh c13415vh = new C13415vh();
        if ((this.f19214k4 & 2) == 2) {
            c13415vh.m62396k4((C13430yo) new C7073ri().m27594k4(c3134k4));
        }
        long j = this.f19214k4;
        if ((j & 4) != 0 || (j & 8) != 0) {
            c13370dy = (j & 4) == 4 ? (C13364c5) new C7079to().m27600k4(c3134k4) : (j & 8) == 8 ? (C13385jd) new C7050du().m27572k4(c3134k4) : null;
        }
        c13415vh.m62395k4(c13370dy);
        if ((this.f19214k4 & 64) == 64) {
            c13415vh.m62394k4((C13368dq) new C7044bv().m27566k4(c3134k4));
        }
        return c13415vh;
    }
}
