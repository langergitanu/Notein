package com.aspose.slides.internal.p094dw;

import OooO0O0.OooO0OO;
import com.aspose.slides.internal.p018aa.C1316du;
import com.aspose.slides.internal.p018aa.C1319h4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p260ly.C6285um;
import com.aspose.slides.internal.p349q3.C9630cj;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p377r9.C9975bv;
import com.aspose.slides.internal.p422tl.C11062uz;
import com.aspose.slides.internal.p488x0.C12334dy;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.dw.ew */
/* JADX INFO: loaded from: classes3.dex */
public class C3406ew {
    /* JADX INFO: renamed from: k4 */
    public static boolean m13964k4(C9723vw[] c9723vwArr, AbstractC3150x6 abstractC3150x6) {
        long position = abstractC3150x6.getPosition() - 8;
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C9630cj c9630cj = new C9630cj(c9723vwArr[0]);
        c9630cj.m47039k4((C12350uz) OooO0OO.OooO0O0(c3134k4));
        c9630cj.m47034k4(c3134k4.m13386x6());
        c9630cj.m47054x1(c3134k4.m13386x6());
        c9630cj.m47042kk(c3134k4.m13386x6());
        c9630cj.m47050to(c3134k4.m13386x6());
        long[] jArr = {0};
        boolean zM49087k4 = C9975bv.m49087k4(jArr, c3134k4.m13384uz());
        long j = jArr[0];
        if (!zM49087k4) {
            C6005k4.m24263kk("Invalid RasterOperation value for EmfStretchBlt");
            return false;
        }
        c9630cj.m47035k4(j);
        c9630cj.m47023du(c3134k4.m13386x6());
        c9630cj.m47029h4(c3134k4.m13386x6());
        c9630cj.m47036k4((C6285um) new C11062uz().m53494k4(c3134k4));
        c9630cj.m47038k4((C12334dy) new C1316du().m7797k4(c3134k4));
        c9630cj.m47055x1(c3134k4.m13384uz() & 4294967295L);
        c9630cj.m47043kk(c3134k4.m13384uz());
        c9630cj.m47051to(c3134k4.m13384uz());
        c9630cj.m47024du(c3134k4.m13384uz());
        c9630cj.m47030h4(c3134k4.m13384uz());
        c9630cj.m47046m9(c3134k4.m13386x6());
        c9630cj.m47026dy(c3134k4.m13386x6());
        c9630cj.m47037k4(new C1319h4(position, c9630cj.m47766lr(), c9630cj.m47052up(), c9630cj.m47057yj(), c9630cj.m47044ks(), c9630cj.m47048rv(), (int) (c9630cj.m47027fa() & C18177fb.f54859s)).m7802k4(c3134k4));
        c9723vwArr[0] = c9630cj;
        return true;
    }
}
