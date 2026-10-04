package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.x2 */
/* JADX INFO: loaded from: classes3.dex */
public class C2360x2 extends AbstractC2040d2 {
    public C2360x2(AbstractC2320ug abstractC2320ug, int i) {
        super(abstractC2320ug, i);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2383y5
    /* JADX INFO: renamed from: k4 */
    public void mo10337k4() {
        this.f8244kk = new InterfaceC2269qx[this.f8243k4.m11485to().size()];
        for (int i = 0; i < this.f8243k4.m11485to().size(); i++) {
            if (this.f8243k4.m11485to().get_Item(i).m10966jd() != 1) {
                throw new C2228oa(C14113y2.m67402k4("Unsupported format {1} for lookup type: {0}", Integer.valueOf(this.f8243k4.m11482k4()), Integer.valueOf(this.f8243k4.m11485to().get_Item(i).m10966jd())));
            }
            C2408zg c2408zg = (C2408zg) C7019kk.m27452k4((Object) this.f8243k4.m11485to().get_Item(i), C2408zg.class);
            if (c2408zg == null) {
                throw new C2243pd(C14113y2.m67402k4("Incorrect table passed for lookup {0}", Integer.valueOf(this.f8243k4.m11482k4())));
            }
            this.f8244kk[i] = new C2414zp(c2408zg, this.f8243k4);
        }
    }
}
