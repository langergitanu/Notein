package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.jm */
/* JADX INFO: loaded from: classes3.dex */
class C13692jm extends AbstractC13808ls {
    public C13692jm(ixg ixgVar, C13847mr c13847mr) {
        super(ixgVar, c13847mr);
        List.Enumerator<C0886d8> it = m6220yj().m64944dy().iterator();
        while (it.hasNext()) {
            try {
                C0886d8 next = it.next();
                C14165n3 c14165n3 = new C14165n3(next);
                ((fml) this).f5072x1.addItem(c14165n3);
                m73215k4(c14165n3);
                if (!next.m4983dy() && next.m5003ks() != null && next.m5003ks().m4569up()) {
                    C14610tz c14610tz = new C14610tz(c14165n3);
                    ((fml) this).f5069kk.addItem(c14610tz);
                    m73215k4(c14610tz);
                    if (next.m5003ks().m4570x1().getDataLabelFormat().getShowLeaderLines() || c13847mr.m64945h4().getLabels().getDefaultDataLabelFormat().getShowLeaderLines()) {
                        klm klmVar = new klm(next);
                        ((fml) this).f5071to.addItem(klmVar);
                        m73215k4(klmVar);
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        m64548h4();
    }

    /* JADX INFO: renamed from: du */
    private void m63434du(C14713vw c14713vw) {
        float fM73225wy;
        float fM73219qm;
        float fM73205bz;
        float fM73205bz2;
        float fM73225wy2;
        float fM73205bz3;
        float fM73225wy3;
        int iIndexOf = m6216ks().f45391k4.indexOf(this);
        for (int i = 0; i < ((fml) this).f5069kk.size(); i++) {
            C14165n3 c14165n3 = (C14165n3) ((C14610tz) C7019kk.m27452k4((Object) ((fml) this).f5069kk.get_Item(i), C14610tz.class)).m71462to();
            C14177nd c14177nd = ((fml) this).f5069kk.get_Item(i);
            int iM4559dy = c14165n3.m6926yj().m5003ks().m4559dy();
            if (iM4559dy == 2) {
                c14177nd.m73208du(((c14165n3.m73225wy() / 2.0f) + c14165n3.m73205bz()) - (c14177nd.m73225wy() / 2.0f));
            } else if (iM4559dy == 3) {
                if (c14165n3.m67860du()) {
                    fM73205bz2 = c14165n3.m73205bz();
                    fM73225wy2 = 3.0f;
                    fM73225wy3 = fM73205bz2 + fM73225wy2;
                    c14177nd.m73208du(fM73225wy3);
                }
                fM73205bz3 = c14165n3.m73205bz() + c14165n3.m73225wy();
                fM73225wy3 = fM73205bz3 - c14177nd.m73225wy();
                c14177nd.m73208du(fM73225wy3);
            } else if (iM4559dy == 4) {
                if (!c14165n3.m67860du()) {
                    fM73225wy3 = c14165n3.m73205bz();
                    c14177nd.m73208du(fM73225wy3);
                }
                fM73205bz3 = c14165n3.m73205bz() + c14165n3.m73225wy();
                fM73225wy3 = fM73205bz3 - c14177nd.m73225wy();
                c14177nd.m73208du(fM73225wy3);
            } else if (iM4559dy == 6) {
                if (c14165n3.m67860du()) {
                    fM73205bz2 = c14165n3.m73205bz();
                    fM73225wy2 = c14165n3.m73225wy();
                    fM73225wy3 = fM73205bz2 + fM73225wy2;
                    c14177nd.m73208du(fM73225wy3);
                } else {
                    fM73205bz3 = c14165n3.m73205bz();
                    fM73225wy3 = fM73205bz3 - c14177nd.m73225wy();
                    c14177nd.m73208du(fM73225wy3);
                }
            }
            c14177nd.m73212h4(((c14165n3.m73203ak() / 2.0f) + c14165n3.m73219qm()) - (c14177nd.m73203ak() / 2.0f));
            mxy mxyVar = (mxy) c14713vw;
            C12007ix c12007ix = new C12007ix(-mxyVar.m67814to(), -mxyVar.m67811du(), m73218lr().m73225wy(), m73218lr().m73203ak());
            if (m6216ks().f45392kk.m73026k4().m73384dy().isPlotOrderReversed()) {
                c14177nd.m67968k4(-c14177nd.m67962c5());
            }
            if (m6216ks().f45394x1.m73026k4().m73384dy().isPlotOrderReversed()) {
                c14177nd.m67977x1(-c14177nd.m67966jd());
            }
            if (ChartTypeCharacterizer.m758dy(m6220yj().m64945h4().getType()) && !c14165n3.m67860du()) {
                c14177nd.m67977x1(-c14177nd.m67966jd());
            }
            C12025x6 c12025x6Clone = c14177nd.m67976x1(new C12025x6(c14177nd.m73205bz(), c14177nd.m73219qm()), c12007ix.Clone()).Clone();
            c14177nd.m73208du(c12025x6Clone.m56897x1());
            c14177nd.m73212h4(c12025x6Clone.m56895kk());
            if (!m6220yj().m64945h4().getChart().getShowDataLabelsOverMaximum()) {
                double dM3039s7 = ((vfb) C7019kk.m27452k4((Object) m6216ks().f45392kk, vfb.class)).m3039s7();
                if (iIndexOf > 0) {
                    fml fmlVar = m6216ks().f45391k4.get_Item(iIndexOf - 1);
                    int iM5007rv = ((C14610tz) C7019kk.m27452k4((Object) c14177nd, C14610tz.class)).m71462to().m6926yj().m5007rv();
                    if (fmlVar.f5072x1.size() - 1 >= iM5007rv) {
                        dM3039s7 = fmlVar.f5072x1.get_Item(iM5007rv).m6918fa();
                    }
                }
                double d = dM3039s7;
                double dM3033gi = ((vfb) C7019kk.m27452k4((Object) m6216ks().f45392kk, vfb.class)).m3033gi();
                int iMo4194dy = c14177nd.mo4194dy();
                if (iMo4194dy == 2 ? OooOO0.OooO00o(c14165n3.m6918fa(), d, 2.0d, d) > dM3033gi : !(iMo4194dy == 3 ? d <= dM3033gi : iMo4194dy != 4 || c14165n3.m6918fa() <= dM3033gi)) {
                    c14177nd.m67970k4(false);
                }
            }
            if (m6220yj().m64945h4().getType() != 35 && m6220yj().m64945h4().getType() != 32) {
                float fM73205bz4 = 10.0f;
                if (c14165n3.m73225wy() >= 10.0f) {
                    fM73205bz = (c14165n3.m73205bz() + c14165n3.m73225wy()) - c14177nd.m73205bz();
                } else {
                    fM73205bz = c14165n3.m73205bz() + c14165n3.m73225wy();
                    fM73205bz4 = c14177nd.m73205bz();
                }
                fM73225wy = fM73205bz - fM73205bz4;
                fM73219qm = ((c14165n3.m73203ak() / 2.0f) + c14165n3.m73219qm()) - c14165n3.m73219qm();
            } else if (c14177nd.m73223ts().m56895kk() < c14165n3.m73223ts().m56895kk()) {
                fM73225wy = ((c14165n3.m73225wy() / 2.0f) + c14165n3.m73205bz()) - c14177nd.m73205bz();
                fM73219qm = c14165n3.m73219qm() - c14177nd.m73219qm();
            } else {
                fM73225wy = ((c14165n3.m73225wy() / 2.0f) + c14165n3.m73205bz()) - c14177nd.m73205bz();
                fM73219qm = (c14165n3.m73219qm() + c14165n3.m73203ak()) - c14177nd.m73219qm();
            }
            c14177nd.m67969k4(new C12025x6(fM73225wy, fM73219qm));
        }
    }

    /* JADX INFO: renamed from: rv */
    private void m63435rv() {
        AbstractC1164gw abstractC1164gw;
        float fMo4964k4;
        float fM63436to = m63436to();
        for (int i = 0; i < ((fml) this).f5072x1.size(); i++) {
            C14165n3 c14165n3 = (C14165n3) ((fml) this).f5072x1.get_Item(i);
            if (c14165n3.m67860du()) {
                abstractC1164gw = ((fml) this).f5072x1.get_Item(i);
                fMo4964k4 = m6216ks().f45392kk.mo4964k4(c14165n3.m6918fa()) - ((fml) this).f5072x1.get_Item(i).m73225wy();
            } else {
                abstractC1164gw = ((fml) this).f5072x1.get_Item(i);
                fMo4964k4 = m6216ks().f45392kk.mo4964k4(c14165n3.m6918fa());
            }
            abstractC1164gw.m73208du(fMo4964k4);
            float fM73203ak = c14165n3.m73203ak() * m64545c5();
            float fM73203ak2 = ((c14165n3.m73203ak() * m64547dy()) / 2.0f) + (i * fM63436to) + ((c14165n3.m73203ak() - fM73203ak) * m6216ks().f45391k4.indexOf(this));
            if (!m6216ks().f45394x1.m73026k4().m73375b3()) {
                fM73203ak2 -= fM63436to / 2.0f;
            }
            if (!m6216ks().f45394x1.m73026k4().m73384dy().isPlotOrderReversed()) {
                fM73203ak2 = (m73203ak() - fM73203ak2) - c14165n3.m73203ak();
            }
            c14165n3.m73212h4(fM73203ak2);
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73217kk(c14713vw.m72555k4());
        m73222to(c14713vw.m72556x1());
        ValueAxisBase valueAxisBase = (ValueAxisBase) C7019kk.m27452k4((Object) m6216ks().f45392kk, ValueAxisBase.class);
        for (int i = 0; i < ((fml) this).f5072x1.size(); i++) {
            C14165n3 c14165n3 = (C14165n3) ((fml) this).f5072x1.get_Item(i);
            if (c14165n3.m6926yj().m4983dy() || (valueAxisBase.m73026k4().m73384dy().isLogarithmic() && C14044b3.m66437kk(c14165n3.m6918fa()))) {
                ((fml) this).f5072x1.get_Item(i).m73210fa(c14713vw);
                ((fml) this).f5072x1.get_Item(i).mo63967x1(false);
            } else {
                c14165n3.m73210fa(new C14713vw(c14165n3.m67861kk(c14713vw), m63436to() / ((m6216ks().f45391k4.size() - (m64545c5() * (m6216ks().f45391k4.size() - 1))) + m64547dy())));
            }
        }
        m64549kk(c14713vw);
    }

    /* JADX INFO: renamed from: to */
    public final float m63436to() {
        return C7019kk.m27469x1(m6216ks().f45394x1, AbstractC14464sp.class) ? ((f2h) C7019kk.m27452k4((Object) m6216ks().f45394x1, f2h.class)).m5812um() : C7019kk.m27469x1(m6216ks().f45394x1, d6s.class) ? ((d6s) C7019kk.m27452k4((Object) m6216ks().f45394x1, d6s.class)).m4965kp() : m73203ak() / ((fml) this).f5072x1.size();
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.mo5524U_();
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        m63435rv();
        m63434du(c14713vw);
        m64550m9();
        m6210fa();
        m64546du();
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }
}
