package com.aspose.slides.internal.p345pu;

import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p340pm.C9468x1;
import com.aspose.slides.internal.p370qv.C9946to;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12025x6;
import java.util.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.pu.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C9564jd extends AbstractC9566kk<C9946to> {

    /* JADX INFO: renamed from: x1 */
    protected List<C12003du[]> f34545x1;

    public C9564jd(C11906rv c11906rv) {
        super(c11906rv);
        this.f34545x1 = m46719k4(c11906rv.m55687jd().m55668k4());
    }

    @Override // com.aspose.slides.internal.p345pu.InterfaceC9562fa
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C12003du mo46705k4(float f, float f2, C9946to c9946to) {
        return m46712k4(c9946to, new C12025x6(f, f2), this.f34545x1, this.f34546k4.m55687jd().m55669x1(), true);
    }

    /* JADX INFO: renamed from: k4 */
    public C12003du m46712k4(C9946to c9946to, C12025x6 c12025x6, List<C12003du[]> list, float[] fArr, boolean z) {
        C12025x6 c12025x6M46540k4 = C9468x1.m46536k4(c9946to.f35852yj, c12025x6).m46540k4(c9946to.f35844h4);
        if (c12025x6M46540k4 == null) {
            return null;
        }
        double dM46521k4 = C9467to.m46521k4(c12025x6M46540k4, c9946to.f35846k4) / c9946to.f35839c5;
        if (z) {
            dM46521k4 = 1.0d - dM46521k4;
        }
        return m46723k4(dM46521k4, list, fArr);
    }
}
