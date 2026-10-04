package com.aspose.slides.internal.p446uo;

import com.aspose.slides.internal.p018aa.C1322k4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p110ek.AbstractC3752x1;
import com.aspose.slides.internal.p132fj.C4023ig;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p377r9.C9975bv;
import com.aspose.slides.internal.p488x0.C12352x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.uo.y9 */
/* JADX INFO: loaded from: classes4.dex */
public class C11524y9 extends AbstractC3752x1 {
    @Override // com.aspose.slides.internal.p110ek.AbstractC3752x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo15061x1(C4047sv[] c4047svArr, AbstractC3150x6 abstractC3150x6) {
        C4023ig c4023ig = new C4023ig(c4047svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        long[] jArr = {0};
        boolean zM49087k4 = C9975bv.m49087k4(jArr, c3134k4.m13384uz());
        long j = jArr[0];
        if (!zM49087k4) {
            C6005k4.m24263kk("Invalid RasterOperation value for WmfStretchBlt");
            return false;
        }
        c4023ig.m15990k4(j);
        c4023ig.m15938du(c3134k4.m13381rv());
        c4023ig.m15942h4(c3134k4.m13381rv());
        c4023ig.m15991k4(c3134k4.m13381rv());
        c4023ig.m15997x1(c3134k4.m13381rv());
        if (!c4023ig.m15947up()) {
            c4023ig.m15946m9(c3134k4.m13381rv());
        }
        c4023ig.m15940dy(c3134k4.m13381rv());
        c4023ig.m15936c5(c3134k4.m13381rv());
        c4023ig.m15993kk(c3134k4.m13381rv());
        c4023ig.m15995to(c3134k4.m13381rv());
        if (c4023ig.m15947up()) {
            c4023ig.m15944k4((C12352x1) new C1322k4().m7806k4(c3134k4));
        }
        c4047svArr[0] = c4023ig;
        return true;
    }
}
