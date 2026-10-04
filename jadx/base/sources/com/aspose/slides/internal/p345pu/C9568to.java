package com.aspose.slides.internal.p345pu;

import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p340pm.C9468x1;
import com.aspose.slides.internal.p370qv.C9944k4;
import com.aspose.slides.internal.p370qv.C9945kk;
import com.aspose.slides.internal.p370qv.C9946to;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12025x6;
import java.util.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.pu.to */
/* JADX INFO: loaded from: classes4.dex */
public class C9568to extends AbstractC9570x1<C9944k4> {

    /* JADX INFO: renamed from: to */
    private List<C12003du[]> f34547to;

    public C9568to(C11906rv c11906rv) {
        super(c11906rv);
        this.f34547to = m46732k4();
    }

    /* JADX INFO: renamed from: k4 */
    private double m46726k4(C12025x6 c12025x6, C9945kk c9945kk, C9946to c9946to) {
        C12025x6 c12025x6M46540k4;
        if (c9946to.f35846k4.equals(c12025x6) || (c12025x6M46540k4 = new C9468x1(c9946to.f35846k4, c12025x6).m46540k4(c9945kk.f35832dy)) == null) {
            return 1.0d;
        }
        return 1.0d - (C9467to.m46521k4(c12025x6, c9946to.f35846k4) / C9467to.m46521k4(c12025x6M46540k4, c9946to.f35846k4));
    }

    @Override // com.aspose.slides.internal.p345pu.InterfaceC9562fa
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C12003du mo46705k4(float f, float f2, C9944k4 c9944k4) {
        if (!c9944k4.m48884kk(f, f2)) {
            C12025x6 c12025x6 = new C12025x6(f, f2);
            C9945kk c9945kk = c9944k4.f35827k4;
            C9946to c9946toM48887k4 = c9945kk.m48887k4(c12025x6);
            return m46731k4(this.f34547to, c9946toM48887k4, m46726k4(c12025x6, c9945kk, c9946toM48887k4));
        }
        C12003du c12003duM55698m9 = this.f34546k4.m55698m9();
        float[] fArr = this.f34548kk;
        double d = fArr[0];
        double d2 = fArr[1];
        float[] fArr2 = this.f34549x1;
        C12003du c12003duM46730k4 = m46730k4(0.0d, c12003duM55698m9, d, d2, fArr2[0], fArr2[1]);
        return C12003du.m56398k4(255, c12003duM46730k4.m56507jd() & 255, c12003duM46730k4.m56502ck() & 255, c12003duM46730k4.m56505fa() & 255);
    }
}
