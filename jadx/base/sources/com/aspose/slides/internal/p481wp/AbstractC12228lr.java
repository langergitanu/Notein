package com.aspose.slides.internal.p481wp;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p097e0.C3507ak;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p111em.InterfaceC3760kk;
import com.aspose.slides.internal.p150gi.C4265c5;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.wp.lr */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12228lr extends AbstractC12237uz {

    /* JADX INFO: renamed from: c5 */
    protected boolean f40666c5;

    /* JADX INFO: renamed from: dy */
    protected boolean f40667dy;

    /* JADX INFO: renamed from: ix */
    private List<List<List<C12220dy>>> f40668ix;

    /* JADX INFO: renamed from: jd */
    private C4265c5 f40669jd;

    /* JADX INFO: renamed from: ne */
    private boolean f40670ne;

    /* JADX INFO: renamed from: rv */
    private boolean f40671rv;

    /* JADX INFO: renamed from: x6 */
    private boolean f40672x6;

    public AbstractC12228lr(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f40667dy = false;
        this.f40666c5 = false;
        this.f40671rv = true;
        this.f40672x6 = false;
        this.f40670ne = true;
        this.f40668ix = new List<>();
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12237uz
    /* JADX INFO: renamed from: bz */
    public AbstractC12228lr mo57061bz() {
        return this;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    public Object clone() {
        AbstractC12228lr abstractC12228lr = (AbstractC12228lr) super.clone();
        abstractC12228lr.f40668ix = new List<>(this.f40668ix);
        return abstractC12228lr;
    }

    /* JADX INFO: renamed from: g8 */
    public final List<List<List<C12220dy>>> m57062g8() {
        return this.f40668ix;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57063k4(List<List<C12220dy>> list) {
        this.f40668ix.addItem(list);
    }

    /* JADX INFO: renamed from: qm */
    public final void m57065qm() {
        if (mo14110p_()) {
            return;
        }
        AbstractC12244yj abstractC12244yjM57082bs = mo57086e0().m57082bs();
        if (this.f40667dy) {
            abstractC12244yjM57082bs.mo57071k4();
        } else if (!this.f40670ne) {
            abstractC12244yjM57082bs.mo57072k4(this);
        }
        try {
            abstractC12244yjM57082bs.mo57076x1();
        } catch (C3507ak e) {
            e.m59590k4(this.f9753kk);
            throw e;
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: r_ */
    public void mo14113r_() {
        if (!mo14110p_()) {
            ((AbstractC12237uz) this).f40750h4 = null;
            ((AbstractC12237uz) this).f40751m9 = null;
        }
        if (this.f40667dy || this.f40666c5) {
            m57065qm();
        } else {
            m14099k4("marker* (table-row+|table-cell+)", true);
            m14115s_().mo14121x1(this);
        }
    }

    /* JADX INFO: renamed from: sv */
    public final void m57066sv() {
        if (this.f40672x6) {
            this.f40671rv = false;
            if (this.f40670ne) {
                return;
            }
            ((AbstractC12237uz) this).f40751m9.m57059k4(((AbstractC12237uz) this).f40750h4);
            mo57086e0().m57082bs().mo57072k4(this);
        }
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12235um
    /* JADX INFO: renamed from: vj */
    public C4265c5 mo57067vj() {
        return this.f40669jd;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14089k4(AbstractC3511c5 abstractC3511c5) {
        if (!mo14110p_()) {
            int iMo14084ix = abstractC3511c5.mo14084ix();
            if (iMo14084ix == 75) {
                if (!this.f40672x6) {
                    mo57086e0().m57082bs().mo57077x1(this);
                }
                this.f40672x6 = true;
                C12234u4 c12234u4 = (C12234u4) abstractC3511c5;
                m57147k4(c12234u4, this.f40671rv);
                boolean zM57110f9 = c12234u4.m57110f9();
                this.f40670ne = zM57110f9;
                if (zM57110f9) {
                    this.f40671rv = false;
                    ((AbstractC12237uz) this).f40751m9.m57059k4(((AbstractC12237uz) this).f40750h4);
                    mo57086e0().m57082bs().mo57072k4(this);
                }
            } else if (iMo14084ix == 79) {
                if (this.f40672x6) {
                    ((AbstractC12237uz) this).f40751m9.m57059k4(((AbstractC12237uz) this).f40750h4);
                    mo57086e0().m57082bs().mo57071k4();
                } else {
                    mo57086e0().m57082bs().mo57077x1(this);
                }
                this.f40672x6 = true;
                mo57086e0().m57082bs().mo57074k4((C12243yd) abstractC3511c5);
            }
        }
        super.mo14089k4(abstractC3511c5);
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12237uz, com.aspose.slides.internal.p481wp.AbstractC12235um, com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        this.f40669jd = abstractC3533um.m14401to();
        super.mo14090k4(abstractC3533um);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            if (C14113y2.m67363du(str2, RequestParameters.MARKER)) {
                if (this.f40667dy || this.f40666c5) {
                    m14122x1(interfaceC3757h4, "fo:marker", "(table-row+|table-cell+)");
                    return;
                }
                return;
            }
            if (C14113y2.m67363du(str2, "table-row")) {
                this.f40667dy = true;
                if (this.f40666c5) {
                    C12214ar.m56996k4(m14111q_().m59580u4()).mo57004k4(this, m14105ks(), m14106m_());
                    return;
                }
                return;
            }
            if (!C14113y2.m67363du(str2, "table-cell")) {
                m14103kk(interfaceC3757h4, str, str2);
                return;
            }
            this.f40666c5 = true;
            if (this.f40667dy) {
                C12214ar.m56996k4(m14111q_().m59580u4()).mo57004k4(this, m14105ks(), m14106m_());
            }
        }
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12235um, com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14098k4(String str, InterfaceC3757h4 interfaceC3757h4, InterfaceC3760kk interfaceC3760kk, AbstractC3533um abstractC3533um) {
        super.mo14098k4(str, interfaceC3757h4, interfaceC3760kk, abstractC3533um);
        if (mo14110p_()) {
            return;
        }
        C12232rv c12232rvMo57086e0 = mo57086e0();
        if (c12232rvMo57086e0.m57083bz()) {
            int iM57097sv = c12232rvMo57086e0.m57097sv();
            ((AbstractC12237uz) this).f40750h4 = new List<>(iM57097sv);
            for (int i = 0; i < iM57097sv; i++) {
                ((AbstractC12237uz) this).f40750h4.addItem(null);
            }
        } else {
            ((AbstractC12237uz) this).f40750h4 = new List<>();
        }
        ((AbstractC12237uz) this).f40751m9 = new C12226kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m57064k4(C12243yd c12243yd) {
        AbstractC3511c5 abstractC3511c5 = this.f9851to;
        return abstractC3511c5 == null || abstractC3511c5 == c12243yd;
    }
}
