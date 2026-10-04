package com.aspose.slides.internal.p283mv;

import com.aspose.slides.internal.p042bn.C1718e0;
import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p190is.AbstractC5117x1;
import com.aspose.slides.internal.p190is.C5114k4;
import com.aspose.slides.internal.p190is.C5116to;

/* JADX INFO: renamed from: com.aspose.slides.internal.mv.ts */
/* JADX INFO: loaded from: classes4.dex */
public class C6597ts extends AbstractC5117x1 {
    @Override // com.aspose.slides.internal.p190is.AbstractC5117x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo21976x1(C1752sv[] c1752svArr, AbstractC3150x6 abstractC3150x6) {
        C1718e0 c1718e0 = new C1718e0(c1752svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        c1718e0.m9230k4(c3134k4.m13382u4());
        c1718e0.m9231k4(C5114k4.m21969x1(c1718e0.m9229k4() & 65535, c3134k4));
        long j = 0;
        for (int i : c1718e0.m9234x1()) {
            j = ((j & 4294967295L) + ((long) (i & 65535))) & 4294967295L;
        }
        c1718e0.m9232k4(C5116to.m21974x1(j, c3134k4));
        c1752svArr[0] = c1718e0;
        return true;
    }
}
