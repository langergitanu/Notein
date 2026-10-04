package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.cl */
/* JADX INFO: loaded from: classes3.dex */
public class C2035cl extends AbstractC2040d2 {
    public C2035cl(AbstractC2320ug abstractC2320ug, int i) {
        super(abstractC2320ug, i);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2383y5
    /* JADX INFO: renamed from: k4 */
    public void mo10337k4() {
        this.f8244kk = new InterfaceC2269qx[this.f8243k4.m11485to().size()];
        for (int i = 0; i < this.f8243k4.m11485to().size(); i++) {
            C2158k9 c2158k9 = (C2158k9) C7019kk.m27452k4((Object) this.f8243k4.m11485to().get_Item(i), C2158k9.class);
            if (c2158k9 == null) {
                throw new C2243pd(C14113y2.m67402k4("Incorrect table passed for lookup {0}", Integer.valueOf(this.f8243k4.m11482k4())));
            }
            this.f8244kk[i] = new C2394yq(c2158k9, this.f8243k4);
        }
    }
}
