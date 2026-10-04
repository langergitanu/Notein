package com.aspose.slides.internal.p283mv;

import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p042bn.C1754to;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3558bv;
import com.aspose.slides.internal.p100e4.C3576um;
import com.aspose.slides.internal.p190is.AbstractC5117x1;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p319ok.C7108k4;
import com.aspose.slides.internal.p498xe.C12523x1;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.mv.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C6576kk extends AbstractC5117x1 {
    @Override // com.aspose.slides.internal.p190is.AbstractC5117x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo21976x1(C1752sv[] c1752svArr, AbstractC3150x6 abstractC3150x6) {
        C1754to c1754to = new C1754to(c1752svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        long jM13384uz = c3134k4.m13384uz();
        if (AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C3576um.class), jM13384uz)) {
            c1754to.m9329k4(jM13384uz & 4294967295L);
        } else {
            long[] jArr = {0};
            boolean zM14471k4 = C3558bv.m14471k4(jArr, jM13384uz);
            long j = jArr[0];
            if (!zM14471k4) {
                C6005k4.m24263kk("Invalid RasterOperation value for WmfBitBlt");
                return false;
            }
            c1754to.m9329k4(j);
        }
        c1754to.m9330k4(c3134k4.m13381rv());
        c1754to.m9336x1(c3134k4.m13381rv());
        if (!c1754to.m9418jd()) {
            c1754to.m9415du(c3134k4.m13381rv());
        }
        c1754to.m9417h4(c3134k4.m13381rv());
        c1754to.m9421m9(c3134k4.m13381rv());
        c1754to.m9332kk(c3134k4.m13381rv());
        c1754to.m9334to(c3134k4.m13381rv());
        if (c1754to.m9418jd()) {
            c1754to.m9419k4((C12523x1) new C7108k4().m27631k4(c3134k4));
        }
        c1752svArr[0] = c1754to;
        return true;
    }
}
