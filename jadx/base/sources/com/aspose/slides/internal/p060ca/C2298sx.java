package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.sx */
/* JADX INFO: loaded from: classes3.dex */
public class C2298sx extends AbstractC2383y5 {
    public C2298sx(C2409zi c2409zi, int i) {
        super(c2409zi, i);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2383y5
    /* JADX INFO: renamed from: k4 */
    public void mo10337k4() {
        this.f8244kk = new InterfaceC2269qx[this.f8243k4.m11485to().size()];
        for (int i = 0; i < this.f8243k4.m11485to().size(); i++) {
            C2230of c2230of = (C2230of) C7019kk.m27452k4((Object) this.f8243k4.m11485to().get_Item(i), C2230of.class);
            if (c2230of == null) {
                throw new C2243pd(C14113y2.m67402k4("Incorrect table passed for lookup {0}", Integer.valueOf(this.f8243k4.m11482k4())));
            }
            this.f8244kk[i] = new C2283s1(c2230of, this.f8243k4);
        }
    }
}
