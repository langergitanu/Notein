package com.aspose.slides.internal.p446uo;

import com.aspose.slides.internal.p018aa.C1330up;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p110ek.AbstractC3752x1;
import com.aspose.slides.internal.p132fj.C4012dy;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p280ms.C6493x1;
import com.aspose.slides.internal.p488x0.C12354yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.uo.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C11492m9 extends AbstractC3752x1 {
    @Override // com.aspose.slides.internal.p110ek.AbstractC3752x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo15061x1(C4047sv[] c4047svArr, AbstractC3150x6 abstractC3150x6) {
        C4012dy c4012dy = new C4012dy(c4047svArr[0]);
        c4012dy.m15882k4((C12354yj) new C1330up().m7815k4(new C3134k4(abstractC3150x6)));
        if ((c4012dy.m15881k4().m57890k4() & 65535) != 768) {
            throw new C6493x1("Invalid Pallete Start value for WmfPallete");
        }
        c4047svArr[0] = c4012dy;
        return true;
    }
}
