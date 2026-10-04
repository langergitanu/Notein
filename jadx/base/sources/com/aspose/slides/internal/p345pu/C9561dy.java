package com.aspose.slides.internal.p345pu;

import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p340pm.C9468x1;
import com.aspose.slides.internal.p370qv.C9946to;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.pu.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C9561dy extends AbstractC9565k4<C9946to> {
    public C9561dy(C11906rv c11906rv) {
        super(c11906rv);
    }

    @Override // com.aspose.slides.internal.p345pu.InterfaceC9562fa
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C12003du mo46705k4(float f, float f2, C9946to c9946to) {
        C12025x6 c12025x6 = new C12025x6(f, f2);
        C12025x6 c12025x6M46540k4 = C9468x1.m46536k4(c9946to.f35852yj, c12025x6).m46540k4(c9946to.f35844h4);
        if (c12025x6M46540k4 == null) {
            return null;
        }
        C12003du c12003duM46717k4 = m46717k4(this.f34546k4.m55698m9(), 1.0d - (C9467to.m46521k4(c12025x6M46540k4, c9946to.f35846k4) / c9946to.f35839c5));
        C12025x6 c12025x6M46540k42 = C9468x1.m46536k4(c9946to.f35850up, c12025x6).m46540k4(c9946to.f35848m9);
        if (c12025x6M46540k42 == null) {
            return null;
        }
        C12003du c12003duM46717k42 = m46717k4(c9946to.f35849to, 1.0d - (C9467to.m46521k4(c12025x6M46540k42, c9946to.f35851x1) / c9946to.f35845jd));
        C12025x6 c12025x6M46540k43 = C9468x1.m46536k4(c9946to.f35843fa, c12025x6).m46540k4(c9946to.f35842dy);
        if (c12025x6M46540k43 == null) {
            return null;
        }
        C12003du c12003duM46717k43 = m46717k4(c9946to.f35841du, 1.0d - (C9467to.m46521k4(c12025x6M46540k43, c9946to.f35847kk) / c9946to.f35840ck));
        return C12003du.m56398k4(255, m46713k4((c12003duM46717k4.m56507jd() & 255) + (c12003duM46717k42.m56507jd() & 255) + (c12003duM46717k43.m56507jd() & 255)), m46713k4((c12003duM46717k4.m56502ck() & 255) + (c12003duM46717k42.m56502ck() & 255) + (c12003duM46717k43.m56502ck() & 255)), m46713k4((c12003duM46717k4.m56505fa() & 255) + (c12003duM46717k42.m56505fa() & 255) + (c12003duM46717k43.m56505fa() & 255)));
    }
}
