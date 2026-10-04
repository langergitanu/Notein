package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.aq */
/* JADX INFO: loaded from: classes3.dex */
public class C2002aq extends AbstractC2311tt {
    public C2002aq(InterfaceC2106h0 interfaceC2106h0) {
        super(interfaceC2106h0);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2311tt
    /* JADX INFO: renamed from: k4 */
    public void mo10155k4(C2372xo c2372xo, C2068ei c2068ei, InterfaceC2039cz interfaceC2039cz) {
        c2068ei.m10476k4(c2372xo);
        c2068ei.m10471k4(c2372xo.m11682du(), c2372xo.m11684h4());
        InterfaceC2106h0 interfaceC2106h0 = (InterfaceC2106h0) C7019kk.m27452k4((Object) interfaceC2039cz, InterfaceC2106h0.class);
        if (interfaceC2106h0 != null) {
            for (InterfaceC2196mi interfaceC2196mi : c2068ei.m10468h4().m10362k4()) {
                C2140j6 c2140j6 = (C2140j6) C7019kk.m27452k4((Object) interfaceC2196mi, C2140j6.class);
                if (c2140j6 != null) {
                    interfaceC2106h0.mo10658k4(c2140j6);
                } else {
                    C2090fu c2090fu = (C2090fu) C7019kk.m27452k4((Object) interfaceC2196mi, C2090fu.class);
                    if (c2090fu != null) {
                        interfaceC2106h0.mo10657k4(c2090fu);
                    } else {
                        C2264qn c2264qn = (C2264qn) C7019kk.m27452k4((Object) interfaceC2196mi, C2264qn.class);
                        if (c2264qn != null) {
                            interfaceC2106h0.mo10659k4(c2264qn);
                        } else if (C7019kk.m27469x1(interfaceC2196mi, C2387yg.class)) {
                            interfaceC2106h0.mo10656k4();
                        }
                    }
                }
            }
        }
    }
}
