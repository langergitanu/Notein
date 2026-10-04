package com.aspose.slides.internal.p283mv;

import com.aspose.slides.internal.p042bn.C1730j2;
import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3564h4;
import com.aspose.slides.internal.p190is.AbstractC5117x1;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p319ok.C7105h4;
import com.aspose.slides.internal.p498xe.C12502c5;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.mv.qw */
/* JADX INFO: loaded from: classes4.dex */
public class C6588qw extends AbstractC5117x1 {
    @Override // com.aspose.slides.internal.p190is.AbstractC5117x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo21976x1(C1752sv[] c1752svArr, AbstractC3150x6 abstractC3150x6) {
        C1730j2 c1730j2 = new C1730j2(c1752svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        int iM13382u4 = c3134k4.m13382u4();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C3564h4.class), iM13382u4)) {
            C6005k4.m24265x1("Invalid ColorUsage value for WmfSetDibToDev");
            return false;
        }
        c1730j2.m9307k4(iM13382u4 & 65535);
        c1730j2.m9315x1(c3134k4.m13382u4());
        c1730j2.m9313to(c3134k4.m13382u4());
        c1730j2.m9300du(c3134k4.m13382u4());
        c1730j2.m9304h4(c3134k4.m13382u4());
        c1730j2.m9311m9(c3134k4.m13382u4());
        c1730j2.m9302dy(c3134k4.m13382u4());
        c1730j2.m9299c5(c3134k4.m13382u4());
        c1730j2.m9305jd(c3134k4.m13382u4());
        c1730j2.m9308k4((C12502c5) new C7105h4(c1730j2.m9400ks() & 4294967295L, (int) ((4294967295L & c1730j2.m9402up()) * 2)).m27628x1(c3134k4));
        c1752svArr[0] = c1730j2;
        return true;
    }
}
