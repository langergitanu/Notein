package com.aspose.slides.internal.p283mv;

import com.aspose.slides.internal.p042bn.C1748ri;
import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3565ix;
import com.aspose.slides.internal.p190is.AbstractC5117x1;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.mv.zj */
/* JADX INFO: loaded from: classes4.dex */
public class C6617zj extends AbstractC5117x1 {
    @Override // com.aspose.slides.internal.p190is.AbstractC5117x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo21976x1(C1752sv[] c1752svArr, AbstractC3150x6 abstractC3150x6) {
        C1748ri c1748ri = new C1748ri(c1752svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        int iM13382u4 = c3134k4.m13382u4();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C3565ix.class), iM13382u4)) {
            C6005k4.m24264to("Invalid PolyFillMode for WmfSetPolyfillMode");
            return false;
        }
        c1748ri.m9386k4(iM13382u4 & 65535);
        if ((c1748ri.m9402up() & 4294967295L) > 4) {
            c1748ri.m9387k4(c3134k4.m13381rv());
        }
        c1752svArr[0] = c1748ri;
        return true;
    }
}
