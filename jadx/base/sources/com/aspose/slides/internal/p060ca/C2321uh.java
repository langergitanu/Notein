package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.uh */
/* JADX INFO: loaded from: classes3.dex */
public class C2321uh extends AbstractC2383y5 {

    /* JADX INFO: renamed from: to */
    private InterfaceC2203mx f8018to;

    public C2321uh(C2409zi c2409zi, int i, InterfaceC2203mx interfaceC2203mx) {
        super(c2409zi, i);
        this.f8018to = interfaceC2203mx;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2383y5
    /* JADX INFO: renamed from: k4 */
    public void mo10337k4() {
        this.f8244kk = new InterfaceC2269qx[this.f8243k4.m11485to().size()];
        for (int i = 0; i < this.f8243k4.m11485to().size(); i++) {
            if (this.f8243k4.m11485to().get_Item(i).m10966jd() == 2) {
                C2267qv c2267qv = (C2267qv) C7019kk.m27452k4((Object) this.f8243k4.m11485to().get_Item(i), C2267qv.class);
                if (c2267qv == null) {
                    throw new C2243pd(C14113y2.m67402k4("Incorrect table passed for lookup {0}", Integer.valueOf(this.f8243k4.m11482k4())));
                }
                this.f8244kk[i] = new C2223o1(c2267qv, this.f8243k4, this.f8245x1, this.f8018to);
            } else {
                if (this.f8243k4.m11485to().get_Item(i).m10966jd() != 3) {
                    throw new C2228oa(C14113y2.m67402k4("Unsupported format {1} for lookup type: {0}", Integer.valueOf(this.f8243k4.m11482k4()), Integer.valueOf(this.f8243k4.m11485to().get_Item(i).m10966jd())));
                }
                C2415zr c2415zr = (C2415zr) C7019kk.m27452k4((Object) this.f8243k4.m11485to().get_Item(i), C2415zr.class);
                if (c2415zr == null) {
                    throw new C2243pd(C14113y2.m67402k4("Incorrect table passed for lookup {0}", Integer.valueOf(this.f8243k4.m11482k4())));
                }
                this.f8244kk[i] = new C2088fk(c2415zr, this.f8243k4, this.f8245x1, this.f8018to);
            }
        }
    }
}
