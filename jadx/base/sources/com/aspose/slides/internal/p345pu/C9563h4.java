package com.aspose.slides.internal.p345pu;

import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p340pm.C9468x1;
import com.aspose.slides.internal.p370qv.C9946to;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.pu.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9563h4 extends AbstractC9570x1<C9946to> {
    public C9563h4(C11906rv c11906rv) {
        super(c11906rv);
    }

    @Override // com.aspose.slides.internal.p345pu.InterfaceC9562fa
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C12003du mo46705k4(float f, float f2, C9946to c9946to) {
        double d;
        double d2;
        C12025x6 c12025x6 = new C12025x6(f, f2);
        C9468x1 c9468x1M46536k4 = C9468x1.m46536k4(c9946to.f35852yj, c12025x6);
        C12025x6 c12025x6M46540k4 = c9468x1M46536k4.m46540k4(c9946to.f35844h4);
        if (c12025x6M46540k4 == null) {
            return null;
        }
        double dM46521k4 = C9467to.m46521k4(c12025x6M46540k4, c9946to.f35846k4) / c9946to.f35839c5;
        C12025x6 c12025x6M46540k42 = c9468x1M46536k4.m46540k4(c9946to.f35843fa);
        C12025x6 c12025x6M46540k43 = c9468x1M46536k4.m46540k4(c9946to.f35850up);
        if (c12025x6M46540k42 == null || c12025x6M46540k43 == null) {
            return null;
        }
        double dM46521k42 = 1.0d - (C9467to.m46521k4(c12025x6M46540k42, c12025x6) / C9467to.m46521k4(c12025x6M46540k42, c12025x6M46540k43));
        double d3 = 1.0d - dM46521k42;
        int length = this.f34548kk.length - 1;
        while (length > 0) {
            float[] fArr = this.f34549x1;
            int i = length - 1;
            float f3 = fArr[i];
            float f4 = fArr[length];
            float[] fArr2 = this.f34548kk;
            float f5 = fArr2[i];
            float f6 = fArr2[length];
            if (f5 > f6) {
                f3 = f4;
                f4 = f3;
                f6 = f5;
                f5 = f6;
            }
            double d4 = f5;
            if (d4 <= dM46521k4) {
                double d5 = d3;
                double d6 = f6;
                if (dM46521k4 <= d6) {
                    double d7 = f3;
                    double d8 = f4;
                    double d9 = dM46521k4;
                    C12003du c12003duM46733x1 = m46733x1(d9, this.f34546k4.m55698m9(), d4, d6, d7, d8);
                    C12003du c12003duM46717k4 = m46717k4(m46730k4(d9, c9946to.f35849to, d4, d6, d7, d8), dM46521k42);
                    C12003du c12003duM46717k42 = m46717k4(m46730k4(d9, c9946to.f35841du, d4, d6, d7, d8), d5);
                    return m46716k4(255, (c12003duM46733x1.m56507jd() & 255) + (c12003duM46717k4.m56507jd() & 255) + (c12003duM46717k42.m56507jd() & 255), (c12003duM46733x1.m56502ck() & 255) + (c12003duM46717k4.m56502ck() & 255) + (c12003duM46717k42.m56502ck() & 255), (c12003duM46733x1.m56505fa() & 255) + (c12003duM46717k4.m56505fa() & 255) + (c12003duM46717k42.m56505fa() & 255));
                }
                d2 = dM46521k4;
                d = d5;
            } else {
                d = d3;
                d2 = dM46521k4;
            }
            length--;
            dM46521k4 = d2;
            d3 = d;
        }
        return C12003du.m56396k4(0);
    }
}
