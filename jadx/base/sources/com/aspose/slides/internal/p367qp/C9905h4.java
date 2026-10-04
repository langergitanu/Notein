package com.aspose.slides.internal.p367qp;

import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.qp.h4 */
/* JADX INFO: loaded from: classes4.dex */
class C9905h4 extends AbstractC9910x1 {

    /* JADX INFO: renamed from: k4 */
    final /* synthetic */ C9904du f35764k4;

    public C9905h4(C9904du c9904du) {
        this.f35764k4 = c9904du;
    }

    @Override // com.aspose.slides.internal.p367qp.AbstractC9910x1
    public void invoke(Object obj, C9906k4 c9906k4) {
        Iterator it = ((AbstractC7018k4) this.f35764k4).f19081x1.iterator();
        while (it.hasNext()) {
            ((AbstractC9910x1) it.next()).invoke(obj, c9906k4);
        }
    }
}
