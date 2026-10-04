package com.aspose.slides.internal.p446uo;

import com.aspose.slides.internal.p018aa.C1319h4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p110ek.AbstractC3752x1;
import com.aspose.slides.internal.p132fj.C4020gk;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p377r9.C9975bv;
import com.aspose.slides.internal.p377r9.C9981h4;
import com.aspose.slides.internal.p488x0.C12331c5;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.uo.gf */
/* JADX INFO: loaded from: classes4.dex */
public class C11474gf extends AbstractC3752x1 {
    @Override // com.aspose.slides.internal.p110ek.AbstractC3752x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo15061x1(C4047sv[] c4047svArr, AbstractC3150x6 abstractC3150x6) {
        C4020gk c4020gk = new C4020gk(c4047svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        long[] jArr = {0};
        boolean zM49087k4 = C9975bv.m49087k4(jArr, c3134k4.m13384uz());
        long j = jArr[0];
        if (!zM49087k4) {
            C6005k4.m24263kk("Invalid RasterOperation value for WmfStretchDib");
            return false;
        }
        c4020gk.m15990k4(j);
        int iM13382u4 = c3134k4.m13382u4();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C9981h4.class), iM13382u4)) {
            C6005k4.m24265x1("Invalid ColorUsage value for WmfStretchDib");
            return false;
        }
        c4020gk.m15925k4(iM13382u4 & 65535);
        c4020gk.m15919du(c3134k4.m13381rv());
        c4020gk.m15923h4(c3134k4.m13381rv());
        c4020gk.m15991k4(c3134k4.m13381rv());
        c4020gk.m15997x1(c3134k4.m13381rv());
        c4020gk.m15928m9(c3134k4.m13381rv());
        c4020gk.m15921dy(c3134k4.m13381rv());
        c4020gk.m15993kk(c3134k4.m13381rv());
        c4020gk.m15995to(c3134k4.m13381rv());
        c4020gk.m15926k4((C12331c5) new C1319h4(c4020gk.m16065rv() & 4294967295L, (int) ((4294967295L & c4020gk.m16068yj()) * 2)).m7803x1(c3134k4));
        c4047svArr[0] = c4020gk;
        return true;
    }
}
