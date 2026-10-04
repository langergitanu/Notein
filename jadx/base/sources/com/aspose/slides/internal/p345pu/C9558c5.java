package com.aspose.slides.internal.p345pu;

import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p340pm.C9468x1;
import com.aspose.slides.internal.p370qv.C9946to;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12025x6;
import java.util.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.pu.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C9558c5 extends AbstractC9570x1<C9946to> {

    /* JADX INFO: renamed from: to */
    private List<C12003du[]> f34543to;

    public C9558c5(C11906rv c11906rv) {
        super(c11906rv);
        this.f34543to = m46732k4();
    }

    @Override // com.aspose.slides.internal.p345pu.InterfaceC9562fa
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C12003du mo46705k4(float f, float f2, C9946to c9946to) {
        C12025x6 c12025x6M46540k4 = C9468x1.m46536k4(c9946to.f35852yj, new C12025x6(f, f2)).m46540k4(c9946to.f35844h4);
        if (c12025x6M46540k4 == null) {
            return null;
        }
        return m46731k4(this.f34543to, c9946to, 1.0d - (C9467to.m46521k4(c12025x6M46540k4, c9946to.f35846k4) / c9946to.f35839c5));
    }
}
