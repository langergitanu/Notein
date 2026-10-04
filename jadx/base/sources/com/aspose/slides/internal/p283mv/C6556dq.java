package com.aspose.slides.internal.p283mv;

import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p042bn.C1771xk;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3558bv;
import com.aspose.slides.internal.p190is.AbstractC5117x1;
import com.aspose.slides.internal.p243l6.C6005k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.mv.dq */
/* JADX INFO: loaded from: classes4.dex */
public class C6556dq extends AbstractC5117x1 {
    @Override // com.aspose.slides.internal.p190is.AbstractC5117x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo21976x1(C1752sv[] c1752svArr, AbstractC3150x6 abstractC3150x6) {
        C1771xk c1771xk = new C1771xk(c1752svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        long[] jArr = {0};
        boolean zM14471k4 = C3558bv.m14471k4(jArr, c3134k4.m13384uz());
        long j = jArr[0];
        if (!zM14471k4) {
            C6005k4.m24263kk("Invalid RasterOperation value for WmfPatBlt");
            return false;
        }
        c1771xk.m9531k4(j);
        c1771xk.m9532k4(c3134k4.m13381rv());
        c1771xk.m9538x1(c3134k4.m13381rv());
        c1771xk.m9534kk(c3134k4.m13381rv());
        c1771xk.m9536to(c3134k4.m13381rv());
        c1752svArr[0] = c1771xk;
        return true;
    }
}
