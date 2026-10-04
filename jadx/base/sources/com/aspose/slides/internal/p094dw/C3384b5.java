package com.aspose.slides.internal.p094dw;

import OooO0O0.OooO0OO;
import com.aspose.slides.internal.p018aa.C1319h4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p349q3.C9649ga;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p377r9.C9975bv;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.dw.b5 */
/* JADX INFO: loaded from: classes3.dex */
public class C3384b5 {
    /* JADX INFO: renamed from: k4 */
    public static boolean m13942k4(C9723vw[] c9723vwArr, AbstractC3150x6 abstractC3150x6) {
        long position = abstractC3150x6.getPosition() - 8;
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C9649ga c9649ga = new C9649ga(c9723vwArr[0]);
        c9649ga.m47223k4((C12350uz) OooO0OO.OooO0O0(c3134k4));
        c9649ga.m47220k4(c3134k4.m13386x6());
        c9649ga.m47237x1(c3134k4.m13386x6());
        c9649ga.m47226kk(c3134k4.m13386x6());
        c9649ga.m47233to(c3134k4.m13386x6());
        c9649ga.m47210du(c3134k4.m13386x6());
        c9649ga.m47216h4(c3134k4.m13386x6());
        c9649ga.m47221k4(c3134k4.m13384uz());
        c9649ga.m47238x1(c3134k4.m13384uz());
        c9649ga.m47227kk(c3134k4.m13384uz());
        c9649ga.m47234to(c3134k4.m13384uz());
        c9649ga.m47211du(c3134k4.m13384uz() & 4294967295L);
        long[] jArr = {0};
        boolean zM49087k4 = C9975bv.m49087k4(jArr, c3134k4.m13384uz());
        long j = jArr[0];
        if (!zM49087k4) {
            C6005k4.m24263kk("Invalid RasterOperation value for EmfBitBlt");
            return false;
        }
        c9649ga.m47217h4(j);
        c9649ga.m47230m9(c3134k4.m13386x6());
        c9649ga.m47213dy(c3134k4.m13386x6());
        c9649ga.m47222k4(new C1319h4(position, c9649ga.m47766lr(), c9649ga.m47208c5(), c9649ga.m47218jd(), c9649ga.m47209ck(), c9649ga.m47214fa(), (int) (c9649ga.m47235up() & C18177fb.f54859s)).m7802k4(c3134k4));
        c9723vwArr[0] = c9649ga;
        return true;
    }
}
