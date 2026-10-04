package com.aspose.slides.internal.p094dw;

import OooO0O0.OooO0OO;
import com.aspose.slides.internal.p018aa.C1316du;
import com.aspose.slides.internal.p018aa.C1319h4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p260ly.C6285um;
import com.aspose.slides.internal.p349q3.C9638du;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p377r9.C9975bv;
import com.aspose.slides.internal.p422tl.C11062uz;
import com.aspose.slides.internal.p488x0.C12334dy;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.dw.du */
/* JADX INFO: loaded from: classes3.dex */
public class C3400du {
    /* JADX INFO: renamed from: k4 */
    public static boolean m13958k4(C9723vw[] c9723vwArr, AbstractC3150x6 abstractC3150x6) {
        long position = abstractC3150x6.getPosition() - 8;
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C9638du c9638du = new C9638du(c9723vwArr[0]);
        c9638du.m47140k4((C12350uz) OooO0OO.OooO0O0(c3134k4));
        c9638du.m47135k4(c3134k4.m13386x6());
        c9638du.m47153x1(c3134k4.m13386x6());
        c9638du.m47143kk(c3134k4.m13386x6());
        c9638du.m47149to(c3134k4.m13386x6());
        long[] jArr = {0};
        boolean zM49087k4 = C9975bv.m49087k4(jArr, c3134k4.m13384uz());
        long j = jArr[0];
        if (!zM49087k4) {
            C6005k4.m24263kk("Invalid RasterOperation value for EmfBitBlt");
            return false;
        }
        c9638du.m47136k4(j);
        c9638du.m47126du(c3134k4.m13386x6());
        c9638du.m47131h4(c3134k4.m13386x6());
        c9638du.m47137k4((C6285um) new C11062uz().m53494k4(c3134k4));
        c9638du.m47139k4((C12334dy) new C1316du().m7797k4(c3134k4));
        c9638du.m47154x1(c3134k4.m13384uz() & 4294967295L);
        c9638du.m47144kk(c3134k4.m13384uz());
        c9638du.m47150to(c3134k4.m13384uz());
        c9638du.m47127du(c3134k4.m13384uz());
        c9638du.m47132h4(c3134k4.m13384uz());
        c9638du.m47138k4(new C1319h4(position, c9638du.m47766lr(), c9638du.m47151up(), c9638du.m47156yj(), c9638du.m47145ks(), c9638du.m47147rv(), (int) (c9638du.m47129fa() & C18177fb.f54859s)).m7802k4(c3134k4));
        c9723vwArr[0] = c9638du;
        return true;
    }
}
