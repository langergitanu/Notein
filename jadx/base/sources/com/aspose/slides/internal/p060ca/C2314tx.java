package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.tx */
/* JADX INFO: loaded from: classes3.dex */
public class C2314tx extends AbstractC2040d2 {

    /* JADX INFO: renamed from: to */
    private InterfaceC2203mx f8002to;

    public C2314tx(AbstractC2320ug abstractC2320ug, int i, InterfaceC2203mx interfaceC2203mx) {
        super(abstractC2320ug, i);
        this.f8002to = interfaceC2203mx;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2383y5
    /* JADX INFO: renamed from: k4 */
    public void mo10337k4() {
        this.f8244kk = new InterfaceC2269qx[this.f8243k4.m11485to().size()];
        for (int i = 0; i < this.f8243k4.m11485to().size(); i++) {
            if (this.f8243k4.m11485to().get_Item(i).m10966jd() != 2) {
                throw new C2228oa(C14113y2.m67402k4("Unsupported format {1} for lookup type: {0}", Integer.valueOf(this.f8243k4.m11482k4()), Integer.valueOf(this.f8243k4.m11485to().get_Item(i).m10966jd())));
            }
            C2189m6 c2189m6 = (C2189m6) C7019kk.m27452k4((Object) this.f8243k4.m11485to().get_Item(i), C2189m6.class);
            if (c2189m6 == null) {
                throw new C2243pd(C14113y2.m67402k4("Incorrect table passed for lookup {0}", Integer.valueOf(this.f8243k4.m11482k4())));
            }
            this.f8244kk[i] = new C2150jv(c2189m6, this.f8243k4, this.f8245x1, this.f8002to);
        }
    }
}
