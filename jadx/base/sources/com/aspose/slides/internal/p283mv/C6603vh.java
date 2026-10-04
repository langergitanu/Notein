package com.aspose.slides.internal.p283mv;

import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p042bn.C1755tq;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3573rv;
import com.aspose.slides.internal.p190is.AbstractC5117x1;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.mv.vh */
/* JADX INFO: loaded from: classes4.dex */
public class C6603vh extends AbstractC5117x1 {
    @Override // com.aspose.slides.internal.p190is.AbstractC5117x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo21976x1(C1752sv[] c1752svArr, AbstractC3150x6 abstractC3150x6) {
        C1755tq c1755tq = new C1755tq(c1752svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        int iM13382u4 = c3134k4.m13382u4();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C3573rv.class), iM13382u4)) {
            C6005k4.m24264to("Invalid BkMode for WmfSetBkMode");
            return false;
        }
        c1755tq.m9423k4(iM13382u4 & 65535);
        if ((c1755tq.m9402up() & 4294967295L) > 4) {
            c1755tq.m9424k4(c3134k4.m13381rv());
        }
        c1752svArr[0] = c1755tq;
        return true;
    }
}
