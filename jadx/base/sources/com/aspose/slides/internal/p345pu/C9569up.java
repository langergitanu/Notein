package com.aspose.slides.internal.p345pu;

import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p340pm.C9468x1;
import com.aspose.slides.internal.p370qv.C9944k4;
import com.aspose.slides.internal.p370qv.C9945kk;
import com.aspose.slides.internal.p370qv.C9946to;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.pu.up */
/* JADX INFO: loaded from: classes4.dex */
public class C9569up extends AbstractC9565k4<C9944k4> {
    public C9569up(C11906rv c11906rv) {
        super(c11906rv);
    }

    @Override // com.aspose.slides.internal.p345pu.InterfaceC9562fa
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C12003du mo46705k4(float f, float f2, C9944k4 c9944k4) {
        C12025x6 c12025x6M46540k4;
        if (c9944k4.m48884kk(f, f2)) {
            return this.f34546k4.m55698m9();
        }
        C12025x6 c12025x6 = new C12025x6(f, f2);
        C9945kk c9945kk = c9944k4.f35827k4;
        C9946to c9946toM48887k4 = c9945kk.m48887k4(c12025x6);
        double dM46521k4 = 1.0d;
        if (!c9946toM48887k4.f35846k4.equals(c12025x6) && (c12025x6M46540k4 = new C9468x1(c9946toM48887k4.f35846k4, c12025x6).m46540k4(c9945kk.f35832dy)) != null) {
            dM46521k4 = 1.0d - (C9467to.m46521k4(c12025x6, c9946toM48887k4.f35846k4) / C9467to.m46521k4(c12025x6M46540k4, c9946toM48887k4.f35846k4));
        }
        int iM46715k4 = m46715k4(this.f34546k4.m55698m9().m56507jd(), c9946toM48887k4.f35849to.m56507jd(), dM46521k4);
        int iM46715k42 = m46715k4(this.f34546k4.m55698m9().m56502ck(), c9946toM48887k4.f35849to.m56502ck(), dM46521k4);
        int iM46715k43 = m46715k4(this.f34546k4.m55698m9().m56505fa(), c9946toM48887k4.f35849to.m56505fa(), dM46521k4);
        m46715k4(this.f34546k4.m55698m9().m56501c5(), c9946toM48887k4.f35849to.m56501c5(), dM46521k4);
        return C12003du.m56398k4(255, iM46715k4, iM46715k42, iM46715k43);
    }
}
