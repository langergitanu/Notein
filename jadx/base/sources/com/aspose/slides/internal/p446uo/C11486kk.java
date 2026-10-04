package com.aspose.slides.internal.p446uo;

import com.aspose.slides.internal.p018aa.C1322k4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p110ek.AbstractC3752x1;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p132fj.C4049to;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p377r9.C9975bv;
import com.aspose.slides.internal.p377r9.C9993um;
import com.aspose.slides.internal.p488x0.C12352x1;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.uo.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C11486kk extends AbstractC3752x1 {
    @Override // com.aspose.slides.internal.p110ek.AbstractC3752x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo15061x1(C4047sv[] c4047svArr, AbstractC3150x6 abstractC3150x6) {
        C4049to c4049to = new C4049to(c4047svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        long jM13384uz = c3134k4.m13384uz();
        if (AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C9993um.class), jM13384uz)) {
            c4049to.m15990k4(jM13384uz & 4294967295L);
        } else {
            long[] jArr = {0};
            boolean zM49087k4 = C9975bv.m49087k4(jArr, jM13384uz);
            long j = jArr[0];
            if (!zM49087k4) {
                C6005k4.m24263kk("Invalid RasterOperation value for WmfBitBlt");
                return false;
            }
            c4049to.m15990k4(j);
        }
        c4049to.m15991k4(c3134k4.m13381rv());
        c4049to.m15997x1(c3134k4.m13381rv());
        if (!c4049to.m16078ck()) {
            c4049to.m16079du(c3134k4.m13381rv());
        }
        c4049to.m16081h4(c3134k4.m13381rv());
        c4049to.m16085m9(c3134k4.m13381rv());
        c4049to.m15993kk(c3134k4.m13381rv());
        c4049to.m15995to(c3134k4.m13381rv());
        if (c4049to.m16078ck()) {
            c4049to.m16083k4((C12352x1) new C1322k4().m7806k4(c3134k4));
        }
        c4047svArr[0] = c4049to;
        return true;
    }
}
