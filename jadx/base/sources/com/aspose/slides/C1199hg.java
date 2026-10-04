package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.hg */
/* JADX INFO: loaded from: classes3.dex */
class C1199hg extends AbstractC14557tg {
    public C1199hg(C0886d8 c0886d8) {
        super(c0886d8);
    }

    /* JADX INFO: renamed from: du */
    public final boolean m7135du() {
        double dMo63720yj = m71148c5().m6216ks().f45394x1.mo63720yj();
        if (ChartTypeCharacterizer.m758dy(m71148c5().m6220yj().m64945h4().getType()) || ChartTypeCharacterizer.m761jd(m71148c5().m6220yj().m64945h4().getType())) {
            dMo63720yj = 0.0d;
        }
        if (m6918fa() >= dMo63720yj || m71148c5().m6216ks().f45394x1.m73026k4().m73384dy().isPlotOrderReversed()) {
            return !m71148c5().m6216ks().f45394x1.m73026k4().m73384dy().isPlotOrderReversed() || m6918fa() <= dMo63720yj;
        }
        return false;
    }

    @Override // com.aspose.slides.AbstractC1164gw
    /* JADX INFO: renamed from: k4 */
    public C12025x6 mo3519k4() {
        return new C12025x6((m73225wy() / 2.0f) + m73205bz(), m71148c5().m6216ks().f45394x1.mo4964k4(m6918fa()));
    }

    /* JADX INFO: renamed from: kk */
    public final float m7136kk(C14713vw c14713vw) {
        double dM67475k4;
        float fMo4964k4;
        float fMo63718up;
        ValueAxisBase valueAxisBase = (ValueAxisBase) m71148c5().m6216ks().f45394x1;
        double dM67476k4 = valueAxisBase.m73026k4().m73384dy().isLogarithmic() ? C14116yg.m67476k4(valueAxisBase.m3033gi(), valueAxisBase.m73026k4().m73384dy().getLogBase()) : valueAxisBase.m3033gi();
        double dM67476k42 = valueAxisBase.m73026k4().m73384dy().isLogarithmic() ? C14116yg.m67476k4(valueAxisBase.m3039s7(), valueAxisBase.m73026k4().m73384dy().getLogBase()) : valueAxisBase.m3039s7();
        if (ChartTypeCharacterizer.m761jd(m71148c5().m6220yj().m64945h4().getType())) {
            dM67475k4 = (C14116yg.m67475k4(m6926yj().m4989k4()) * 1.0d) / m71148c5().m6213k4(m71149dy());
        } else {
            if (valueAxisBase.m73026k4().m73384dy().isLogarithmic()) {
                ChartSeries chartSeriesM64945h4 = m71148c5().m6220yj().m64945h4();
                if (ChartTypeCharacterizer.m758dy(chartSeriesM64945h4.getType())) {
                    double dM6214k4 = m71148c5().m6214k4(m71149dy(), ((C14886zi) chartSeriesM64945h4.getParentSeriesGroup().getSeries()).m74526k4((IChartSeries) chartSeriesM64945h4));
                    double dM4989k4 = dM6214k4 - m6926yj().m4989k4();
                    double dM67476k43 = C14116yg.m67476k4(dM6214k4, valueAxisBase.m73026k4().m73384dy().getLogBase());
                    double dM67476k44 = dM4989k4 != 0.0d ? C14116yg.m67476k4(dM4989k4, valueAxisBase.m73026k4().m73384dy().getLogBase()) : 0.0d;
                    fMo4964k4 = valueAxisBase.mo4964k4(dM67476k43);
                    fMo63718up = valueAxisBase.mo4964k4(dM67476k44);
                } else {
                    fMo4964k4 = valueAxisBase.mo4964k4(m6918fa());
                    fMo63718up = valueAxisBase.mo63718up();
                }
                return C14116yg.m67481k4(fMo4964k4, fMo63718up) - C14116yg.m67504x1(fMo4964k4, fMo63718up);
            }
            dM67475k4 = C14116yg.m67475k4(((!ChartTypeCharacterizer.m758dy(m71148c5().m6220yj().m64945h4().getType()) || m6926yj().m4989k4() == m6918fa()) && valueAxisBase.mo63720yj() != dM67476k4) ? valueAxisBase.mo63720yj() - m6926yj().m4989k4() : m6926yj().m4989k4());
        }
        return (((float) dM67475k4) / ((float) (dM67476k4 - dM67476k42))) * c14713vw.m72556x1();
    }

    @Override // com.aspose.slides.AbstractC14557tg
    /* JADX INFO: renamed from: to */
    public C12025x6 mo7138to() {
        return m71148c5().m6216ks().f45392kk.m73026k4().m73384dy().isPlotOrderReversed() ? new C12025x6(m73205bz(), m71148c5().m6216ks().f45394x1.mo4964k4(m6918fa())) : new C12025x6(m73205bz() + m73225wy(), m71148c5().m6216ks().f45394x1.mo4964k4(m6918fa()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0103, code lost:
    
        if (r8.m73223ts().m56895kk() > r0.m56895kk()) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0117 A[RETURN] */
    @Override // com.aspose.slides.AbstractC1164gw
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C12025x6 mo3520k4(C14177nd c14177nd) {
        C12025x6 c12025x6 = new C12025x6((m73225wy() / 2.0f) + m73227xk(), m71148c5().m6216ks().f45394x1.mo4964k4(m6918fa()));
        if (ChartTypeCharacterizer.m758dy(m71148c5().m6220yj().m64945h4().getType()) || ChartTypeCharacterizer.m761jd(m71148c5().m6220yj().m64945h4().getType())) {
            C12025x6 c12025x62 = new C12025x6(m73227xk(), (m73203ak() / 2.0f) + m73206c6());
            C12025x6 c12025x63 = new C12025x6(m73227xk() + m73225wy(), (m73203ak() / 2.0f) + m73206c6());
            if (!m71150h4()) {
                if (m71151m9()) {
                    if (m7135du() && c14177nd.m73223ts().m56895kk() > m73206c6() + m73203ak()) {
                        return new C12025x6(c12025x6.m56897x1(), c12025x6.m56895kk() + m73203ak());
                    }
                    if (!m7135du()) {
                    }
                }
                return c14177nd.m73223ts().m56897x1() > c12025x6.m56897x1() ? c12025x62 : c12025x63;
            }
            if (!m7135du() || c14177nd.m73223ts().m56895kk() >= m73206c6()) {
                if (!m7135du() && c14177nd.m73223ts().m56895kk() < m73206c6()) {
                    return new C12025x6(c12025x6.m56897x1(), m73206c6());
                }
                if (m71151m9()) {
                }
                if (c14177nd.m73223ts().m56897x1() > c12025x6.m56897x1()) {
                }
            }
        }
        return c12025x6;
    }

    @Override // com.aspose.slides.AbstractC14557tg
    /* JADX INFO: renamed from: kk */
    public C12025x6 mo7137kk() {
        return m71148c5().m6216ks().f45392kk.m73026k4().m73384dy().isPlotOrderReversed() ? new C12025x6(m73205bz() + m73225wy(), m71148c5().m6216ks().f45394x1.mo4964k4(m6918fa())) : new C12025x6(m73205bz(), m71148c5().m6216ks().f45394x1.mo4964k4(m6918fa()));
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73217kk(c14713vw.m72555k4());
        m73222to(c14713vw.m72556x1());
    }
}
