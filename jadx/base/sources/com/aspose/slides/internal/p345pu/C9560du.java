package com.aspose.slides.internal.p345pu;

import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p340pm.C9468x1;
import com.aspose.slides.internal.p370qv.C9944k4;
import com.aspose.slides.internal.p370qv.C9945kk;
import com.aspose.slides.internal.p370qv.C9946to;
import com.aspose.slides.internal.p472w8.C11902kk;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.pu.du */
/* JADX INFO: loaded from: classes4.dex */
public class C9560du extends AbstractC9566kk<C9944k4> {
    public C9560du(C11906rv c11906rv) {
        super(c11906rv);
    }

    /* JADX INFO: renamed from: x1 */
    private double m46707x1(float f, float f2, C9944k4 c9944k4) {
        C12025x6 c12025x6M46540k4;
        C12025x6 c12025x6 = new C12025x6(f, f2);
        C9945kk c9945kk = c9944k4.f35827k4;
        C9946to c9946toM48887k4 = c9945kk.m48887k4(c12025x6);
        if (c9946toM48887k4.f35846k4.equals(c12025x6) || (c12025x6M46540k4 = new C9468x1(c9946toM48887k4.f35846k4, c12025x6).m46540k4(c9945kk.f35832dy)) == null) {
            return 1.0d;
        }
        return 1.0d - (C9467to.m46521k4(c12025x6, c9946toM48887k4.f35846k4) / C9467to.m46521k4(c12025x6M46540k4, c9946toM48887k4.f35846k4));
    }

    @Override // com.aspose.slides.internal.p345pu.InterfaceC9562fa
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C12003du mo46705k4(float f, float f2, C9944k4 c9944k4) {
        C11902kk c11902kkM55687jd = this.f34546k4.m55687jd();
        C12003du[] c12003duArrM55668k4 = c11902kkM55687jd.m55668k4();
        float[] fArrM55669x1 = c11902kkM55687jd.m55669x1();
        return c9944k4.m48884kk((double) f, (double) f2) ? m46724k4(1.0d, new C12003du[]{c12003duArrM55668k4[c12003duArrM55668k4.length - 1], c12003duArrM55668k4[c12003duArrM55668k4.length - 2]}, new float[]{fArrM55669x1[fArrM55669x1.length - 1], fArrM55669x1[fArrM55669x1.length - 2]}) : m46724k4(m46707x1(f, f2, c9944k4), c12003duArrM55668k4, fArrM55669x1);
    }
}
