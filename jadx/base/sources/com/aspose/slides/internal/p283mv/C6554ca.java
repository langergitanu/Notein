package com.aspose.slides.internal.p283mv;

import com.aspose.slides.internal.p042bn.C1727he;
import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3557ar;
import com.aspose.slides.internal.p190is.AbstractC5117x1;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.mv.ca */
/* JADX INFO: loaded from: classes4.dex */
public class C6554ca extends AbstractC5117x1 {
    @Override // com.aspose.slides.internal.p190is.AbstractC5117x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo21976x1(C1752sv[] c1752svArr, AbstractC3150x6 abstractC3150x6) {
        C1727he c1727he = new C1727he(c1752svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        int iM13382u4 = c3134k4.m13382u4();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C3557ar.class), iM13382u4)) {
            C6005k4.m24264to("Invalid StretchMode for WmfSetStretchBltMode");
            return false;
        }
        c1727he.m9277k4(iM13382u4 & 65535);
        if ((c1727he.m9402up() & 4294967295L) > 4) {
            c1727he.m9278k4(c3134k4.m13381rv());
        }
        c1752svArr[0] = c1727he;
        return true;
    }
}
