package com.aspose.slides.internal.p446uo;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p110ek.AbstractC3752x1;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p132fj.C4066xk;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p377r9.C9975bv;

/* JADX INFO: renamed from: com.aspose.slides.internal.uo.dq */
/* JADX INFO: loaded from: classes4.dex */
public class C11466dq extends AbstractC3752x1 {
    @Override // com.aspose.slides.internal.p110ek.AbstractC3752x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo15061x1(C4047sv[] c4047svArr, AbstractC3150x6 abstractC3150x6) {
        C4066xk c4066xk = new C4066xk(c4047svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        long[] jArr = {0};
        boolean zM49087k4 = C9975bv.m49087k4(jArr, c3134k4.m13384uz());
        long j = jArr[0];
        if (!zM49087k4) {
            C6005k4.m24263kk("Invalid RasterOperation value for WmfPatBlt");
            return false;
        }
        c4066xk.m16201k4(j);
        c4066xk.m16202k4(c3134k4.m13381rv());
        c4066xk.m16208x1(c3134k4.m13381rv());
        c4066xk.m16204kk(c3134k4.m13381rv());
        c4066xk.m16206to(c3134k4.m13381rv());
        c4047svArr[0] = c4066xk;
        return true;
    }
}
