package com.aspose.slides.internal.p283mv;

import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p042bn.C1757u4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3562dy;
import com.aspose.slides.internal.p190is.AbstractC5117x1;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p319ok.C7102du;
import com.aspose.slides.internal.p498xe.C12505dy;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.mv.ix */
/* JADX INFO: loaded from: classes4.dex */
public class C6570ix extends AbstractC5117x1 {
    @Override // com.aspose.slides.internal.p190is.AbstractC5117x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo21976x1(C1752sv[] c1752svArr, AbstractC3150x6 abstractC3150x6) {
        C1757u4 c1757u4 = new C1757u4(c1752svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        int iM13382u4 = c3134k4.m13382u4();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C3562dy.class), iM13382u4)) {
            C6005k4.m24265x1("Invalid Mode value for WmfExtFloodFill");
            return false;
        }
        c1757u4.m9435k4(iM13382u4 & 65535);
        c1757u4.m9436k4((C12505dy) new C7102du().m27622k4(c3134k4));
        c1757u4.m9441x1(c3134k4.m13381rv());
        c1757u4.m9437k4(c3134k4.m13381rv());
        c1752svArr[0] = c1757u4;
        return true;
    }
}
