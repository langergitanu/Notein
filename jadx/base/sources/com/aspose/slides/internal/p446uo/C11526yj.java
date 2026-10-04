package com.aspose.slides.internal.p446uo;

import com.aspose.slides.internal.p018aa.C1319h4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p110ek.AbstractC3752x1;
import com.aspose.slides.internal.p132fj.C4032ks;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p377r9.C9975bv;
import com.aspose.slides.internal.p488x0.C12331c5;

/* JADX INFO: renamed from: com.aspose.slides.internal.uo.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C11526yj extends AbstractC3752x1 {
    @Override // com.aspose.slides.internal.p110ek.AbstractC3752x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo15061x1(C4047sv[] c4047svArr, AbstractC3150x6 abstractC3150x6) {
        C4032ks c4032ks = new C4032ks(c4047svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        long[] jArr = {0};
        boolean zM49087k4 = C9975bv.m49087k4(jArr, c3134k4.m13384uz());
        long j = jArr[0];
        if (!zM49087k4) {
            C6005k4.m24263kk("Invalid RasterOperation value for WmfDibStretchBlt");
            return false;
        }
        c4032ks.m15990k4(j);
        c4032ks.m16003du(c3134k4.m13381rv());
        c4032ks.m16007h4(c3134k4.m13381rv());
        c4032ks.m15991k4(c3134k4.m13381rv());
        c4032ks.m15997x1(c3134k4.m13381rv());
        if (!c4032ks.m16012up()) {
            c4032ks.m16011m9(c3134k4.m13381rv());
        }
        c4032ks.m16005dy(c3134k4.m13381rv());
        c4032ks.m16001c5(c3134k4.m13381rv());
        c4032ks.m15993kk(c3134k4.m13381rv());
        c4032ks.m15995to(c3134k4.m13381rv());
        if (c4032ks.m16012up()) {
            c4032ks.m16009k4((C12331c5) new C1319h4(c4032ks.m16065rv() & 4294967295L, (int) ((4294967295L & c4032ks.m16068yj()) * 2)).m7803x1(c3134k4));
        }
        c4047svArr[0] = c4032ks;
        return true;
    }
}
