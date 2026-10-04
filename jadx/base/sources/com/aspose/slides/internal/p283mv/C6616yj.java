package com.aspose.slides.internal.p283mv;

import com.aspose.slides.internal.p042bn.C1737ks;
import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3558bv;
import com.aspose.slides.internal.p190is.AbstractC5117x1;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p319ok.C7105h4;
import com.aspose.slides.internal.p498xe.C12502c5;

/* JADX INFO: renamed from: com.aspose.slides.internal.mv.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C6616yj extends AbstractC5117x1 {
    @Override // com.aspose.slides.internal.p190is.AbstractC5117x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo21976x1(C1752sv[] c1752svArr, AbstractC3150x6 abstractC3150x6) {
        C1737ks c1737ks = new C1737ks(c1752svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        long[] jArr = {0};
        boolean zM14471k4 = C3558bv.m14471k4(jArr, c3134k4.m13384uz());
        long j = jArr[0];
        if (!zM14471k4) {
            C6005k4.m24263kk("Invalid RasterOperation value for WmfDibStretchBlt");
            return false;
        }
        c1737ks.m9329k4(j);
        c1737ks.m9342du(c3134k4.m13381rv());
        c1737ks.m9346h4(c3134k4.m13381rv());
        c1737ks.m9330k4(c3134k4.m13381rv());
        c1737ks.m9336x1(c3134k4.m13381rv());
        if (!c1737ks.m9345fa()) {
            c1737ks.m9350m9(c3134k4.m13381rv());
        }
        c1737ks.m9344dy(c3134k4.m13381rv());
        c1737ks.m9340c5(c3134k4.m13381rv());
        c1737ks.m9332kk(c3134k4.m13381rv());
        c1737ks.m9334to(c3134k4.m13381rv());
        if (c1737ks.m9345fa()) {
            c1737ks.m9348k4((C12502c5) new C7105h4(c1737ks.m9400ks() & 4294967295L, (int) ((4294967295L & c1737ks.m9402up()) * 2)).m27628x1(c3134k4));
        }
        c1752svArr[0] = c1737ks;
        return true;
    }
}
