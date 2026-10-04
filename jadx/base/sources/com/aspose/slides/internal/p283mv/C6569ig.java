package com.aspose.slides.internal.p283mv;

import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p042bn.C1769x5;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p190is.AbstractC5117x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;

/* JADX INFO: renamed from: com.aspose.slides.internal.mv.ig */
/* JADX INFO: loaded from: classes4.dex */
public class C6569ig extends AbstractC5117x1 {
    @Override // com.aspose.slides.internal.p190is.AbstractC5117x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo21976x1(C1752sv[] c1752svArr, AbstractC3150x6 abstractC3150x6) {
        C1769x5 c1769x5 = new C1769x5(c1752svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        c1769x5.m9522k4(c3134k4.m13381rv());
        byte[] bArrM13372dy = c3134k4.m13372dy((c1769x5.m9520k4() % 2) + c1769x5.m9520k4());
        c1769x5.m9521k4(AbstractC6747ar.m26650yj().m26681x1(bArrM13372dy));
        c1769x5.m9523k4(bArrM13372dy);
        c1769x5.m9525kk(c3134k4.m13381rv());
        c1769x5.m9528x1(c3134k4.m13381rv());
        c1752svArr[0] = c1769x5;
        return true;
    }
}
