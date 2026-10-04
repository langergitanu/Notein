package com.aspose.slides.internal.p283mv;

import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p042bn.C1759up;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3558bv;
import com.aspose.slides.internal.p190is.AbstractC5117x1;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p319ok.C7105h4;
import com.aspose.slides.internal.p498xe.C12502c5;

/* JADX INFO: renamed from: com.aspose.slides.internal.mv.fa */
/* JADX INFO: loaded from: classes4.dex */
public class C6562fa extends AbstractC5117x1 {
    @Override // com.aspose.slides.internal.p190is.AbstractC5117x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo21976x1(C1752sv[] c1752svArr, AbstractC3150x6 abstractC3150x6) {
        C1759up c1759up = new C1759up(c1752svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        long[] jArr = {0};
        boolean zM14471k4 = C3558bv.m14471k4(jArr, c3134k4.m13384uz());
        long j = jArr[0];
        if (!zM14471k4) {
            C6005k4.m24263kk("Invalid RasterOperation value for WmfDibBitBlt");
            return false;
        }
        c1759up.m9329k4(j);
        c1759up.m9330k4(c3134k4.m13381rv());
        c1759up.m9336x1(c3134k4.m13381rv());
        if (!c1759up.m9460jd()) {
            c1759up.m9457du(c3134k4.m13381rv());
        }
        c1759up.m9459h4(c3134k4.m13381rv());
        c1759up.m9463m9(c3134k4.m13381rv());
        c1759up.m9332kk(c3134k4.m13381rv());
        c1759up.m9334to(c3134k4.m13381rv());
        if (c1759up.m9460jd()) {
            c1759up.m9461k4((C12502c5) new C7105h4(c1759up.m9400ks() & 4294967295L, (int) ((4294967295L & c1759up.m9402up()) * 2)).m27628x1(c3134k4));
        }
        c1752svArr[0] = c1759up;
        return true;
    }
}
