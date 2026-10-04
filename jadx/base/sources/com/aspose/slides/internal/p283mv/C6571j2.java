package com.aspose.slides.internal.p283mv;

import com.aspose.slides.internal.p042bn.C1744os;
import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3563fa;
import com.aspose.slides.internal.p190is.AbstractC5117x1;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.mv.j2 */
/* JADX INFO: loaded from: classes4.dex */
public class C6571j2 extends AbstractC5117x1 {
    @Override // com.aspose.slides.internal.p190is.AbstractC5117x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo21976x1(C1752sv[] c1752svArr, AbstractC3150x6 abstractC3150x6) {
        C1744os c1744os = new C1744os(c1752svArr[0]);
        int iM13382u4 = new C3134k4(abstractC3150x6).m13382u4();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C3563fa.class), iM13382u4)) {
            C6005k4.m24264to("Invalid MapMode for WmfSetMapMode");
            return false;
        }
        c1744os.m9372k4(iM13382u4 & 65535);
        c1752svArr[0] = c1744os;
        return true;
    }
}
