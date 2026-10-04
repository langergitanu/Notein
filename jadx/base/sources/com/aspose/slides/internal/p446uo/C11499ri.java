package com.aspose.slides.internal.p446uo;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p110ek.AbstractC3752x1;
import com.aspose.slides.internal.p132fj.C4003bs;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p377r9.C9984k4;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.uo.ri */
/* JADX INFO: loaded from: classes4.dex */
public class C11499ri extends AbstractC3752x1 {
    @Override // com.aspose.slides.internal.p110ek.AbstractC3752x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo15061x1(C4047sv[] c4047svArr, AbstractC3150x6 abstractC3150x6) {
        C4003bs c4003bs = new C4003bs(c4047svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        int iM13382u4 = c3134k4.m13382u4();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C9984k4.class), iM13382u4)) {
            C6005k4.m24264to("Invalid DrawMode for WmfSetRop2");
            return false;
        }
        c4003bs.m15824k4(iM13382u4 & 65535);
        if ((c4003bs.m16068yj() & 4294967295L) > 4) {
            c4003bs.m15825k4(c3134k4.m13381rv());
        }
        c4047svArr[0] = c4003bs;
        return true;
    }
}
