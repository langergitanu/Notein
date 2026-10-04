package com.aspose.slides.internal.p283mv;

import com.aspose.slides.internal.p042bn.C1711c5;
import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p190is.AbstractC5117x1;
import com.aspose.slides.internal.p319ok.C7108k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.mv.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C6558dy extends AbstractC5117x1 {
    @Override // com.aspose.slides.internal.p190is.AbstractC5117x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo21976x1(C1752sv[] c1752svArr, AbstractC3150x6 abstractC3150x6) {
        C1711c5 c1711c5 = new C1711c5(c1752svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        c1711c5.m9187k4(new C7108k4().m27632x1(c3134k4));
        c1711c5.m9188k4(c3134k4.m13372dy(18));
        c1711c5.m9189x1(c3134k4.m13372dy(c1711c5.m9186k4().m58281kk() * ((((c1711c5.m9186k4().m58286x1() * (c1711c5.m9186k4().m58283m9() & 255)) + 15) >> 4) << 1)));
        c1752svArr[0] = c1711c5;
        return true;
    }
}
