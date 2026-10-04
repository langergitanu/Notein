package com.aspose.slides.internal.p283mv;

import com.aspose.slides.internal.p042bn.C1717dy;
import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p190is.AbstractC5117x1;
import com.aspose.slides.internal.p319ok.C7116up;
import com.aspose.slides.internal.p498xe.C12525yj;
import com.aspose.slides.internal.p501xj.C12540x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.mv.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C6582m9 extends AbstractC5117x1 {
    @Override // com.aspose.slides.internal.p190is.AbstractC5117x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo21976x1(C1752sv[] c1752svArr, AbstractC3150x6 abstractC3150x6) {
        C1717dy c1717dy = new C1717dy(c1752svArr[0]);
        c1717dy.m9228k4((C12525yj) new C7116up().m27640k4(new C3134k4(abstractC3150x6)));
        if ((c1717dy.m9227k4().m58293k4() & 65535) != 768) {
            throw new C12540x1("Invalid Pallete Start value for WmfPallete");
        }
        c1752svArr[0] = c1717dy;
        return true;
    }
}
