package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p057c6.C1985m9;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p057c6.InterfaceC1986to;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p150gi.C4272f9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.qm */
/* JADX INFO: loaded from: classes.dex */
public class C4287qm extends C4272f9.k4 {

    /* JADX INFO: renamed from: m9 */
    private C11697x1 f11705m9;

    public C4287qm(int i) {
        super(i);
        this.f11705m9 = C11697x1.m55244k4("en-US");
    }

    @Override // com.aspose.slides.internal.p150gi.C4309x6, com.aspose.slides.internal.p150gi.AbstractC4275gi
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo14415k4(AbstractC3533um abstractC3533um, String str, AbstractC3524ks abstractC3524ks) {
        AbstractC4282kp abstractC4282kpMo14415k4 = super.mo14415k4(abstractC3533um, str, abstractC3524ks);
        abstractC4282kpMo14415k4.mo17204rv().m17201du(C4288qq.m17258k4(118, "RETAIN"), true);
        abstractC4282kpMo14415k4.mo17204rv().m17205to(C4288qq.m17258k4(53, "FORCE"), true);
        return abstractC4282kpMo14415k4;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
    /* JADX INFO: renamed from: to */
    public AbstractC4282kp mo17228to(AbstractC3533um abstractC3533um) {
        String strM17254ks;
        AbstractC4282kp abstractC4282kpM14390h4 = abstractC3533um.m14390h4(this.f11665k4);
        if (abstractC4282kpM14390h4 == null || (strM17254ks = abstractC4282kpM14390h4.m17254ks()) == null) {
            return null;
        }
        return mo14415k4(abstractC3533um, strM17254ks, abstractC3533um.m14404x1());
    }

    @Override // com.aspose.slides.internal.p150gi.C4272f9.k4, com.aspose.slides.internal.p150gi.C4309x6, com.aspose.slides.internal.p150gi.AbstractC4275gi
    /* JADX INFO: renamed from: x1 */
    public AbstractC4282kp mo17139x1(AbstractC4282kp abstractC4282kp, AbstractC3533um abstractC3533um, AbstractC3524ks abstractC3524ks) {
        InterfaceC1986to interfaceC1986toMo9878h4 = abstractC4282kp.mo9878h4();
        if (interfaceC1986toMo9878h4 == null || interfaceC1986toMo9878h4.mo9885x1() != 0) {
            return super.mo17139x1(abstractC4282kp, abstractC3533um, abstractC3524ks);
        }
        if (C7019kk.m27469x1(mo17231x1(abstractC3533um), C1985m9.class)) {
            InterfaceC1984kk interfaceC1984kkM10114kk = ((C1985m9) mo17231x1(abstractC3533um)).m10114kk();
            if (interfaceC1984kkM10114kk == null || !interfaceC1984kkM10114kk.mo9883kk()) {
                abstractC4282kp = new C4292ss(interfaceC1986toMo9878h4.mo9879k4(), mo17231x1(abstractC3533um));
            } else {
                abstractC4282kp = C4261ar.m17118k4(interfaceC1984kkM10114kk.mo9879k4() * interfaceC1986toMo9878h4.mo9879k4());
            }
        }
        AbstractC4282kp abstractC4282kpMo17139x1 = super.mo17139x1(abstractC4282kp, abstractC3533um, abstractC3524ks);
        abstractC4282kpMo17139x1.m17253k4(C14044b3.m66432k4(interfaceC1986toMo9878h4.mo9879k4(), (InterfaceC14073kp) this.f11705m9));
        return abstractC4282kpMo17139x1;
    }
}
