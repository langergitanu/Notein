package com.aspose.slides.internal.p442uj;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3558bv;
import com.aspose.slides.internal.p183ij.C4987ga;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p319ok.C7105h4;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.internal.p509xs.AbstractC12603k4;
import com.huawei.hms.network.embedded.C18177fb;
import o00OoOo.C25068OooO00o;

/* JADX INFO: renamed from: com.aspose.slides.internal.uj.b5 */
/* JADX INFO: loaded from: classes4.dex */
public class C11328b5 extends AbstractC12603k4 {
    @Override // com.aspose.slides.internal.p509xs.AbstractC12603k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo54490k4(C5061vw[] c5061vwArr, AbstractC3150x6 abstractC3150x6) {
        long position = abstractC3150x6.getPosition() - 8;
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C4987ga c4987ga = new C4987ga(c5061vwArr[0]);
        c4987ga.m21046k4((C12521uz) C25068OooO00o.OooO00o(c3134k4));
        c4987ga.m21043k4(c3134k4.m13386x6());
        c4987ga.m21060x1(c3134k4.m13386x6());
        c4987ga.m21049kk(c3134k4.m13386x6());
        c4987ga.m21056to(c3134k4.m13386x6());
        c4987ga.m21033du(c3134k4.m13386x6());
        c4987ga.m21039h4(c3134k4.m13386x6());
        c4987ga.m21044k4(c3134k4.m13384uz());
        c4987ga.m21061x1(c3134k4.m13384uz());
        c4987ga.m21050kk(c3134k4.m13384uz());
        c4987ga.m21057to(c3134k4.m13384uz());
        c4987ga.m21034du(c3134k4.m13384uz() & 4294967295L);
        long[] jArr = {0};
        boolean zM14471k4 = C3558bv.m14471k4(jArr, c3134k4.m13384uz());
        long j = jArr[0];
        if (!zM14471k4) {
            C6005k4.m24263kk("Invalid RasterOperation value for EmfBitBlt");
            return false;
        }
        c4987ga.m21040h4(j);
        c4987ga.m21053m9(c3134k4.m13386x6());
        c4987ga.m21036dy(c3134k4.m13386x6());
        c4987ga.m21045k4(new C7105h4(position, c4987ga.m21560lr(), c4987ga.m21031c5(), c4987ga.m21041jd(), c4987ga.m21032ck(), c4987ga.m21037fa(), (int) (c4987ga.m21058up() & C18177fb.f54859s)).m27627k4(c3134k4));
        c5061vwArr[0] = c4987ga;
        return true;
    }
}
