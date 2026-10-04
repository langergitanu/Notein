package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.pu */
/* JADX INFO: loaded from: classes3.dex */
public class C2252pu extends AbstractC2383y5 {
    public C2252pu(C2409zi c2409zi, int i) {
        super(c2409zi, i);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2383y5
    /* JADX INFO: renamed from: k4 */
    public void mo10337k4() {
        this.f8244kk = new InterfaceC2269qx[this.f8243k4.m11485to().size()];
        for (int i = 0; i < this.f8243k4.m11485to().size(); i++) {
            C2161kh c2161kh = (C2161kh) C7019kk.m27452k4((Object) this.f8243k4.m11485to().get_Item(i), C2161kh.class);
            if (c2161kh == null) {
                throw new C2243pd(C14113y2.m67402k4("Incorrect table passed for lookup {0}", Integer.valueOf(this.f8243k4.m11482k4())));
            }
            this.f8244kk[i] = new C2368xh(c2161kh, this.f8243k4);
        }
    }
}
