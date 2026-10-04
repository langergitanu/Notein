package com.aspose.slides.internal.p513xw;

import com.aspose.slides.internal.p022ai.C1375h4;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p150gi.C4272f9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.ca */
/* JADX INFO: loaded from: classes5.dex */
public class C12689ca extends AbstractC12716nv {

    /* JADX INFO: renamed from: k4 */
    private int f42202k4;

    public C12689ca(C12717os c12717os, C4272f9 c4272f9, C12721ri c12721ri, boolean z, boolean z2, InterfaceC1981h4 interfaceC1981h4) {
        super(c12717os, c4272f9.mo17204rv().mo17130k_().m17128k4(interfaceC1981h4), c12721ri, c4272f9.m17202ix(), z, z2);
        this.f42202k4 = c4272f9.mo17204rv().m17206yj().mo17251du() == 53 ? Integer.MAX_VALUE : ((Integer) C7019kk.m27464to(c4272f9.mo17204rv().m17206yj().mo9924m9(), Integer.TYPE)).intValue();
    }

    /* JADX INFO: renamed from: c5 */
    public final int m58896c5() {
        return this.f42202k4;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12716nv
    /* JADX INFO: renamed from: k4 */
    public void mo58897k4(C1375h4 c1375h4) {
        InterfaceC12734v4 interfaceC12734v4 = (InterfaceC12734v4) C7019kk.m27452k4((Object) m58996up(), InterfaceC12734v4.class);
        if (interfaceC12734v4 != null) {
            interfaceC12734v4.mo49025k4(m59068ck(), c1375h4);
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m58898m9() {
        return this.f42202k4 == Integer.MAX_VALUE;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12716nv
    public String toString() {
        C6765kp c6765kp = new C6765kp("Space[");
        c6765kp.m26792k4(super.toString());
        c6765kp.m26792k4(", precedence=");
        if (m58898m9()) {
            c6765kp.m26792k4("forcing");
        } else {
            c6765kp.m26805kk(m58896c5());
        }
        c6765kp.m26792k4("]");
        return c6765kp.toString();
    }
}
