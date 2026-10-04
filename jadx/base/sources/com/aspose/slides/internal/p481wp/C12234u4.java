package com.aspose.slides.internal.p481wp;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p150gi.C4264bz;
import com.aspose.slides.internal.p150gi.C4265c5;
import com.aspose.slides.internal.p150gi.C4270dy;
import com.aspose.slides.internal.p150gi.InterfaceC4260ak;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.wp.u4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12234u4 extends AbstractC12235um implements InterfaceC4260ak {

    /* JADX INFO: renamed from: c5 */
    private int f40715c5;

    /* JADX INFO: renamed from: dy */
    private C4264bz f40716dy;

    /* JADX INFO: renamed from: h4 */
    private C4270dy f40717h4;

    /* JADX INFO: renamed from: ix */
    private int f40718ix;

    /* JADX INFO: renamed from: jd */
    private int f40719jd;

    /* JADX INFO: renamed from: m9 */
    private C4265c5 f40720m9;

    /* JADX INFO: renamed from: ne */
    private int f40721ne;

    /* JADX INFO: renamed from: qq */
    private boolean f40722qq;

    /* JADX INFO: renamed from: rv */
    private int f40723rv;

    /* JADX INFO: renamed from: u4 */
    private int f40724u4;

    /* JADX INFO: renamed from: uz */
    private InterfaceC1984kk f40725uz;

    /* JADX INFO: renamed from: wl */
    private int f40726wl;

    /* JADX INFO: renamed from: x6 */
    private int f40727x6;

    public C12234u4(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f40722qq = false;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks
    /* JADX INFO: renamed from: ar */
    public boolean mo14315ar() {
        return true;
    }

    /* JADX INFO: renamed from: bz */
    public final int m57108bz() {
        return this.f40715c5;
    }

    /* JADX INFO: renamed from: du */
    public final void m57109du(int i) {
        this.f40721ne = i;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        super.mo14081dy();
        mo14107n_().mo14219x1(this);
    }

    /* JADX INFO: renamed from: f9 */
    public final boolean m57110f9() {
        return this.f40727x6 == 149;
    }

    /* JADX INFO: renamed from: g8 */
    public final int m57111g8() {
        return C14116yg.m67483k4(this.f40721ne, 1);
    }

    /* JADX INFO: renamed from: gi */
    public final int m57112gi() {
        return this.f40726wl;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        super.mo14083h4();
        mo14107n_().mo14193k4(this);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 75;
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12235um, com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
        this.f40717h4 = C4270dy.m17199k4(abstractC3533um);
        this.f40720m9 = abstractC3533um.m14401to();
        this.f40716dy = abstractC3533um.m14402to(17).mo17130k_();
        this.f40719jd = abstractC3533um.m14402to(87).mo17251du();
        this.f40723rv = abstractC3533um.m14402to(90).mo17251du();
        this.f40724u4 = abstractC3533um.m14402to(235).mo17251du();
        if (m57115s7() && m14115s_().mo14084ix() != 79) {
            ((AbstractC12228lr) m14115s_()).m57066sv();
        }
        this.f40727x6 = abstractC3533um.m14402to(92).mo17251du();
        this.f40715c5 = abstractC3533um.m14402to(76).mo9878h4().mo9884to();
        this.f40721ne = abstractC3533um.m14402to(165).mo9878h4().mo9884to();
        this.f40718ix = abstractC3533um.m14402to(166).mo9878h4().mo9884to();
        this.f40725uz = abstractC3533um.m14402to(StyleIdentifier.BOOK_TITLE).mo9877dy();
        this.f40726wl = abstractC3533um.m14402to(257).mo17251du();
    }

    /* JADX INFO: renamed from: kp */
    public final InterfaceC1984kk m57113kp() {
        return this.f40725uz;
    }

    /* JADX INFO: renamed from: qm */
    public final boolean m57114qm() {
        return this.f40723rv == 130;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: r_ */
    public void mo14113r_() {
        if (!this.f40722qq) {
            m14099k4("marker* (%block;)+", true);
        }
        if ((m57115s7() || m57110f9()) && m14115s_().mo14084ix() == 79) {
            C12214ar.m56996k4(m14111q_().m59580u4()).mo57010x1(this, m14106m_());
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "table-cell";
    }

    /* JADX INFO: renamed from: s7 */
    public final boolean m57115s7() {
        return this.f40724u4 == 149;
    }

    /* JADX INFO: renamed from: ss */
    public final int m57116ss() {
        return this.f40719jd;
    }

    /* JADX INFO: renamed from: sv */
    public final int m57117sv() {
        return C14116yg.m67483k4(this.f40718ix, 1);
    }

    @Override // com.aspose.slides.internal.p150gi.InterfaceC4260ak
    /* JADX INFO: renamed from: ts */
    public final C4270dy mo17117ts() {
        return this.f40717h4;
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12235um
    /* JADX INFO: renamed from: vj */
    public C4265c5 mo57067vj() {
        return this.f40720m9;
    }

    /* JADX INFO: renamed from: wp */
    public final C4264bz m57118wp() {
        return this.f40716dy;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            if (C14113y2.m67363du(str2, RequestParameters.MARKER)) {
                if (this.f40722qq) {
                    m14122x1(interfaceC3757h4, "fo:marker", "(%block;)");
                }
            } else if (m14332x1(str, str2)) {
                this.f40722qq = true;
            } else {
                m14103kk(interfaceC3757h4, str, str2);
            }
        }
    }
}
