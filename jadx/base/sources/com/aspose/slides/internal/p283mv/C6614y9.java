package com.aspose.slides.internal.p283mv;

import com.aspose.slides.internal.p042bn.C1728ig;
import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3558bv;
import com.aspose.slides.internal.p190is.AbstractC5117x1;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p319ok.C7108k4;
import com.aspose.slides.internal.p498xe.C12523x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.mv.y9 */
/* JADX INFO: loaded from: classes4.dex */
public class C6614y9 extends AbstractC5117x1 {
    @Override // com.aspose.slides.internal.p190is.AbstractC5117x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo21976x1(C1752sv[] c1752svArr, AbstractC3150x6 abstractC3150x6) {
        C1728ig c1728ig = new C1728ig(c1752svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        long[] jArr = {0};
        boolean zM14471k4 = C3558bv.m14471k4(jArr, c3134k4.m13384uz());
        long j = jArr[0];
        if (!zM14471k4) {
            C6005k4.m24263kk("Invalid RasterOperation value for WmfStretchBlt");
            return false;
        }
        c1728ig.m9329k4(j);
        c1728ig.m9282du(c3134k4.m13381rv());
        c1728ig.m9286h4(c3134k4.m13381rv());
        c1728ig.m9330k4(c3134k4.m13381rv());
        c1728ig.m9336x1(c3134k4.m13381rv());
        if (!c1728ig.m9285fa()) {
            c1728ig.m9290m9(c3134k4.m13381rv());
        }
        c1728ig.m9284dy(c3134k4.m13381rv());
        c1728ig.m9280c5(c3134k4.m13381rv());
        c1728ig.m9332kk(c3134k4.m13381rv());
        c1728ig.m9334to(c3134k4.m13381rv());
        if (c1728ig.m9285fa()) {
            c1728ig.m9288k4((C12523x1) new C7108k4().m27631k4(c3134k4));
        }
        c1752svArr[0] = c1728ig;
        return true;
    }
}
