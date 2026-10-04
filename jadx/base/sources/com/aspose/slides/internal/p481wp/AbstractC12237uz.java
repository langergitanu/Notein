package com.aspose.slides.internal.p481wp;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p150gi.C4270dy;
import com.aspose.slides.internal.p150gi.InterfaceC4260ak;

/* JADX INFO: renamed from: com.aspose.slides.internal.wp.uz */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12237uz extends AbstractC12235um implements InterfaceC4260ak, InterfaceC12224jd {

    /* JADX INFO: renamed from: dy */
    private C4270dy f40749dy;

    /* JADX INFO: renamed from: h4 */
    public List<C12221fa> f40750h4;

    /* JADX INFO: renamed from: m9 */
    public C12226kk f40751m9;

    public AbstractC12237uz(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
    }

    /* JADX INFO: renamed from: bz */
    public abstract AbstractC12228lr mo57061bz();

    @Override // com.aspose.slides.internal.p481wp.InterfaceC12224jd
    /* JADX INFO: renamed from: k4 */
    public final C12226kk mo57053k4() {
        return this.f40751m9;
    }

    @Override // com.aspose.slides.internal.p150gi.InterfaceC4260ak
    /* JADX INFO: renamed from: ts */
    public final C4270dy mo17117ts() {
        return this.f40749dy;
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12235um, com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
        this.f40749dy = C4270dy.m17199k4(abstractC3533um);
    }

    /* JADX INFO: renamed from: k4 */
    private void m57146k4(C12234u4 c12234u4, int i, int i2) {
        C12232rv c12232rvMo57086e0 = mo57086e0();
        InterfaceC1984kk interfaceC1984kkM57113kp = (c12234u4.m57113kp().m10115du() == 9 || i2 != 1) ? null : c12234u4.m57113kp();
        for (int i3 = i; i3 < i + i2; i3++) {
            C12239wl c12239wlM57091h4 = c12232rvMo57086e0.m57091h4(i3 - 1);
            if (interfaceC1984kkM57113kp != null) {
                c12239wlM57091h4.m57153k4(interfaceC1984kkM57113kp);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57147k4(C12234u4 c12234u4, boolean z) {
        int iM57108bz = c12234u4.m57108bz();
        int iM57111g8 = c12234u4.m57111g8();
        int iM57117sv = c12234u4.m57117sv();
        C12232rv c12232rvMo57086e0 = mo57086e0();
        if (!c12232rvMo57086e0.m57083bz()) {
            int i = (iM57108bz + iM57111g8) - 1;
            c12232rvMo57086e0.m57085du(i);
            while (this.f40750h4.size() < i) {
                this.f40750h4.addItem(null);
            }
        } else if ((iM57108bz + iM57111g8) - 1 > c12232rvMo57086e0.m57097sv()) {
            C12214ar.m56996k4(m14111q_().m59580u4()).mo57007kk(this, m14106m_());
        }
        if (z) {
            m57146k4(c12234u4, iM57108bz, iM57111g8);
        }
        if (iM57117sv > 1) {
            for (int i2 = 0; i2 < iM57111g8; i2++) {
                this.f40750h4.set_Item((iM57108bz - 1) + i2, new C12221fa(iM57117sv));
            }
        }
        this.f40751m9.m57058k4(iM57108bz, (iM57111g8 + iM57108bz) - 1);
        c12232rvMo57086e0.m57082bs().mo57073k4(c12234u4);
    }
}
