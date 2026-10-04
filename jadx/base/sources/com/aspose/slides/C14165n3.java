package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.n3 */
/* JADX INFO: loaded from: classes3.dex */
class C14165n3 extends AbstractC14557tg {
    public C14165n3(C0886d8 c0886d8) {
        super(c0886d8);
    }

    /* JADX INFO: renamed from: du */
    public final boolean m67860du() {
        double dMo63720yj = m71148c5().m6216ks().f45392kk.mo63720yj();
        if (ChartTypeCharacterizer.m758dy(m71148c5().m6220yj().m64945h4().getType()) || ChartTypeCharacterizer.m761jd(m71148c5().m6220yj().m64945h4().getType())) {
            dMo63720yj = 0.0d;
        }
        if (m6918fa() >= dMo63720yj || m71148c5().m6216ks().f45392kk.m73026k4().m73384dy().isPlotOrderReversed()) {
            return !m71148c5().m6216ks().f45392kk.m73026k4().m73384dy().isPlotOrderReversed() || m6918fa() <= dMo63720yj;
        }
        return false;
    }

    @Override // com.aspose.slides.AbstractC1164gw
    /* JADX INFO: renamed from: k4 */
    public C12025x6 mo3519k4() {
        return new C12025x6(m71148c5().m6216ks().f45392kk.mo4964k4(m6918fa()), (m73203ak() / 2.0f) + m73219qm());
    }

    /* JADX INFO: renamed from: kk */
    public final float m67861kk(C14713vw c14713vw) {
        double dM67475k4;
        ValueAxisBase valueAxisBase = (ValueAxisBase) C7019kk.m27452k4((Object) m71148c5().m6216ks().f45392kk, ValueAxisBase.class);
        double dM67476k4 = valueAxisBase.m73026k4().m73384dy().isLogarithmic() ? C14116yg.m67476k4(valueAxisBase.m3033gi(), valueAxisBase.m73026k4().m73384dy().getLogBase()) : valueAxisBase.m3033gi();
        double dM67476k42 = valueAxisBase.m73026k4().m73384dy().isLogarithmic() ? C14116yg.m67476k4(valueAxisBase.m3039s7(), valueAxisBase.m73026k4().m73384dy().getLogBase()) : valueAxisBase.m3039s7();
        if (ChartTypeCharacterizer.m761jd(m71148c5().m6220yj().m64945h4().getType())) {
            dM67475k4 = (C14116yg.m67475k4(m6926yj().m4989k4()) * 1.0d) / m71148c5().m6213k4(m71149dy());
        } else {
            if (valueAxisBase.m73026k4().m73384dy().isLogarithmic()) {
                double dM67477k4 = C14116yg.m67477k4(valueAxisBase.m73026k4().m73424x1(m6918fa()) - m6926yj().m4989k4(), 4);
                if (dM67477k4 != 0.0d) {
                    dM67477k4 = valueAxisBase.m73026k4().m73391k4(dM67477k4);
                }
                float fMo4964k4 = valueAxisBase.mo4964k4(m6918fa());
                float fMo4964k42 = valueAxisBase.mo4964k4(dM67477k4);
                return C14116yg.m67481k4(fMo4964k4, fMo4964k42) - C14116yg.m67504x1(fMo4964k4, fMo4964k42);
            }
            dM67475k4 = C14116yg.m67475k4(ChartTypeCharacterizer.m758dy(m71148c5().m6220yj().m64945h4().getType()) ? m6926yj().m4989k4() : valueAxisBase.mo63720yj() - m6926yj().m4989k4());
        }
        return (((float) dM67475k4) / ((float) (dM67476k4 - dM67476k42))) * c14713vw.m72555k4();
    }

    @Override // com.aspose.slides.AbstractC14557tg
    /* JADX INFO: renamed from: to */
    public C12025x6 mo7138to() {
        return !m71148c5().m6216ks().f45394x1.m73026k4().m73384dy().isPlotOrderReversed() ? new C12025x6(m71148c5().m6216ks().f45392kk.mo4964k4(m6918fa()), m73219qm()) : new C12025x6(m71148c5().m6216ks().f45392kk.mo4964k4(m6918fa()), m73219qm() + m73203ak());
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f9, code lost:
    
        if (r7.m73223ts().m56897x1() < r0.m56897x1()) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010d A[RETURN] */
    @Override // com.aspose.slides.AbstractC1164gw
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C12025x6 mo3520k4(C14177nd c14177nd) {
        C12025x6 c12025x6 = new C12025x6(m71148c5().m6216ks().f45392kk.mo4964k4(m6918fa()), (m73203ak() / 2.0f) + m73206c6());
        if (ChartTypeCharacterizer.m758dy(m71148c5().m6220yj().m64945h4().getType()) || ChartTypeCharacterizer.m761jd(m71148c5().m6220yj().m64945h4().getType())) {
            C12025x6 c12025x62 = new C12025x6((m73225wy() / 2.0f) + m73227xk(), m73206c6());
            C12025x6 c12025x63 = new C12025x6((m73225wy() / 2.0f) + m73227xk(), m73206c6() + m73203ak());
            if (!m71150h4()) {
                if (m71151m9()) {
                    if (m67860du() && c14177nd.m73223ts().m56897x1() < m73227xk()) {
                        return new C12025x6(m73227xk(), c12025x6.m56895kk());
                    }
                    if (!m67860du()) {
                    }
                }
                return c14177nd.m73223ts().m56895kk() > c12025x6.m56895kk() ? c12025x62 : c12025x63;
            }
            if (!m67860du() || c14177nd.m73223ts().m56897x1() <= c12025x6.m56897x1()) {
                if (!m67860du() && c14177nd.m73223ts().m56897x1() < m73227xk()) {
                    return new C12025x6(m73227xk(), c12025x6.m56895kk());
                }
                if (m71151m9()) {
                }
                if (c14177nd.m73223ts().m56895kk() > c12025x6.m56895kk()) {
                }
            }
        }
        return c12025x6;
    }

    @Override // com.aspose.slides.AbstractC14557tg
    /* JADX INFO: renamed from: kk */
    public C12025x6 mo7137kk() {
        return m71148c5().m6216ks().f45394x1.m73026k4().m73384dy().isPlotOrderReversed() ? new C12025x6(m71148c5().m6216ks().f45392kk.mo4964k4(m6918fa()), m73219qm()) : new C12025x6(m71148c5().m6216ks().f45392kk.mo4964k4(m6918fa()), m73219qm() + m73203ak());
    }

    @Override // com.aspose.slides.AbstractC14557tg, com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73217kk(c14713vw.m72555k4());
        m73222to(c14713vw.m72556x1());
    }
}
