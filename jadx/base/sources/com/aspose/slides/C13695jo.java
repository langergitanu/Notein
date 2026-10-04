package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.jo */
/* JADX INFO: loaded from: classes3.dex */
class C13695jo extends AbstractC13808ls {
    public C13695jo(ixg ixgVar, C13847mr c13847mr) {
        super(ixgVar, c13847mr);
        List.Enumerator<C0886d8> it = m6220yj().m64944dy().iterator();
        while (it.hasNext()) {
            try {
                C0886d8 next = it.next();
                C1199hg c1199hg = new C1199hg(next);
                ((fml) this).f5072x1.addItem(c1199hg);
                m73215k4((AbstractC14770x9) c1199hg);
                if (!next.m4983dy() && next.m5003ks() != null && next.m5003ks().m4569up()) {
                    C14610tz c14610tz = new C14610tz(c1199hg);
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

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r1.m7135du() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        r5 = r1.m73219qm() + r1.m73203ak();
        r10 = r3.m73203ak();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
    
        r5 = r1.m73219qm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        if (r1.m7135du() == false) goto L25;
     */
    /* JADX INFO: renamed from: du */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m63446du(C14713vw c14713vw) {
        float fM73205bz;
        float fM73203ak;
        float fM73219qm;
        float fM73219qm2;
        int i = 0;
        while (i < ((fml) this).f5069kk.size()) {
            C1199hg c1199hg = (C1199hg) ((C14610tz) C7019kk.m27452k4((Object) ((fml) this).f5069kk.get_Item(i), C14610tz.class)).m71462to();
            C14177nd c14177nd = ((fml) this).f5069kk.get_Item(i);
            AbstractC14770x9 abstractC14770x9 = ((fml) this).f5071to.size() > i ? (klm) ((fml) this).f5071to.get_Item(i) : null;
            int iM4559dy = c1199hg.m6926yj().m5003ks().m4559dy();
            if (iM4559dy == 2) {
                c14177nd.m73212h4(((c1199hg.m73203ak() / 2.0f) + c1199hg.m73219qm()) - (c14177nd.m73203ak() / 2.0f));
            } else if (iM4559dy != 3) {
                if (iM4559dy != 4) {
                    if (iM4559dy == 6) {
                        float fM73203ak2 = 4.0f;
                        if (c1199hg.m7135du()) {
                            float fM73219qm3 = c1199hg.m73219qm() - c14177nd.m73203ak();
                            fM73219qm2 = fM73219qm3 - fM73203ak2;
                            c14177nd.m73212h4(fM73219qm2);
                        } else {
                            fM73219qm2 = c1199hg.m73219qm() + c1199hg.m73203ak() + 4.0f;
                            c14177nd.m73212h4(fM73219qm2);
                        }
                    }
                }
            }
            if (m6220yj().m64945h4().getType() == 0 && c14177nd.m73203ak() > c1199hg.m73203ak() && c1199hg.m6926yj().m5003ks().m4559dy() != 6) {
                c14177nd.m73212h4(c1199hg.m7135du() ? (c1199hg.m73219qm() + c1199hg.m73203ak()) - c14177nd.m73203ak() : c1199hg.m73219qm());
            }
            c14177nd.m73208du(((c1199hg.m73225wy() / 2.0f) + c1199hg.m73205bz()) - (c14177nd.m73225wy() / 2.0f));
            mxy mxyVar = (mxy) c14713vw;
            C12007ix c12007ix = new C12007ix(-mxyVar.m67814to(), -mxyVar.m67811du(), m73218lr().m73225wy(), m73218lr().m73203ak());
            if (!c1199hg.m7135du()) {
                c14177nd.m67977x1(-c14177nd.m67966jd());
            }
            if (m6216ks().f45392kk.m73026k4().m73384dy().isPlotOrderReversed()) {
                c14177nd.m67968k4(-c14177nd.m67962c5());
            }
            C12025x6 c12025x6Clone = c14177nd.m67976x1(new C12025x6(c14177nd.m73205bz(), c14177nd.m73219qm()), c12007ix.Clone()).Clone();
            c14177nd.m73208du(c12025x6Clone.m56897x1());
            c14177nd.m73212h4(c12025x6Clone.m56895kk());
            if (m6220yj().m64945h4().getType() == 0 && c1199hg.m6926yj().m5003ks().m4559dy() != 3 && !m6220yj().m64945h4().getChart().getShowDataLabelsOverMaximum() && m63447k4(((C14610tz) C7019kk.m27452k4((Object) ((fml) this).f5069kk.get_Item(i), C14610tz.class)).m71462to())) {
                m73226x1(c14177nd);
                if (abstractC14770x9 != null) {
                    m73226x1(abstractC14770x9);
                }
            }
            if (m6220yj().m64945h4().getType() == 1 || m6220yj().m64945h4().getType() == 2) {
                fM73205bz = (c14177nd.m73223ts().m56897x1() > c1199hg.m73223ts().m56897x1() ? c1199hg.m73205bz() + c1199hg.m73225wy() : c1199hg.m73205bz()) - c14177nd.m73205bz();
                fM73203ak = (c1199hg.m73203ak() / 2.0f) + c1199hg.m73219qm();
            } else {
                fM73205bz = ((c1199hg.m73225wy() / 2.0f) + c1199hg.m73205bz()) - c14177nd.m73205bz();
                float fM73203ak3 = c1199hg.m73203ak();
                fM73203ak = c1199hg.m73219qm();
                if (fM73203ak3 >= 10.0f) {
                    fM73219qm = (fM73203ak - c14177nd.m73219qm()) + 10.0f;
                }
                c14177nd.m67969k4(new C12025x6(fM73205bz, fM73219qm));
                i++;
            }
            fM73219qm = fM73203ak - c14177nd.m73219qm();
            c14177nd.m67969k4(new C12025x6(fM73205bz, fM73219qm));
            i++;
        }
    }

    /* JADX INFO: renamed from: rv */
    private void m63448rv() {
        float fM63449to = m63449to();
        for (int i = 0; i < ((fml) this).f5072x1.size(); i++) {
            C1199hg c1199hg = (C1199hg) ((fml) this).f5072x1.get_Item(i);
            c1199hg.m73212h4(!c1199hg.m7135du() ? m6216ks().f45394x1.mo4964k4(c1199hg.m6918fa()) - ((fml) this).f5072x1.get_Item(i).m73203ak() : m6216ks().f45394x1.mo4964k4(c1199hg.m6918fa()));
            float fM73225wy = c1199hg.m73225wy() * m64545c5();
            float fM73225wy2 = c1199hg.m73225wy() * m64547dy();
            float fM73225wy3 = (c1199hg.m73225wy() - fM73225wy) * m6216ks().f45391k4.indexOf(this);
            float f = fM73225wy2 / 2.0f;
            float fM73225wy4 = (i * fM63449to) + f + fM73225wy3;
            if (C7019kk.m27469x1(m6216ks().f45392kk, AbstractC14464sp.class) && !C14044b3.m66437kk(((fml) this).f5072x1.get_Item(i).m6926yj().m5015x1())) {
                fM73225wy4 = m6216ks().f45392kk.mo4964k4(((fml) this).f5072x1.get_Item(i).m6926yj().m5015x1()) + f + fM73225wy3;
            }
            if (!m6216ks().f45392kk.m73026k4().m73375b3()) {
                fM73225wy4 -= fM63449to / 2.0f;
            }
            if (m6216ks().f45392kk.m73026k4().m73384dy().isPlotOrderReversed()) {
                fM73225wy4 = (m73225wy() - fM73225wy4) - c1199hg.m73225wy();
            }
            c1199hg.m73208du(fM73225wy4);
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73217kk(c14713vw.m72555k4());
        m73222to(c14713vw.m72556x1());
        ValueAxisBase valueAxisBase = (ValueAxisBase) C7019kk.m27452k4((Object) m6216ks().f45394x1, ValueAxisBase.class);
        for (int i = 0; i < ((fml) this).f5072x1.size(); i++) {
            C1199hg c1199hg = (C1199hg) ((fml) this).f5072x1.get_Item(i);
            if (c1199hg.m6926yj().m4983dy() || (valueAxisBase != null && valueAxisBase.m73026k4().m73384dy().isLogarithmic() && C14044b3.m66437kk(c1199hg.m6918fa()))) {
                ((fml) this).f5072x1.get_Item(i).m73210fa(c14713vw);
                ((fml) this).f5072x1.get_Item(i).mo63967x1(false);
            } else {
                float fM63449to = m63449to() / ((m6216ks().f45391k4.size() - (m64545c5() * (m6216ks().f45391k4.size() - 1))) + m64547dy());
                if (C7019kk.m27469x1(m6220yj().m64941c5().m69870wy(), C14250os.class) && m63449to() - fM63449to < 1.5d && C14116yg.m67480k4(m63449to() - fM63449to) > 0.1d) {
                    fM63449to = m63449to() - 1.5f;
                }
                if (fM63449to < 0.5d) {
                    fM63449to = 0.5f;
                }
                c1199hg.m73210fa(new C14713vw(fM63449to, c1199hg.m7136kk(c14713vw)));
            }
        }
        m64549kk(c14713vw);
    }

    /* JADX INFO: renamed from: to */
    public final float m63449to() {
        return C7019kk.m27469x1(m6216ks().f45392kk, AbstractC14464sp.class) ? ((C1195hd) C7019kk.m27452k4((Object) m6216ks().f45392kk, C1195hd.class)).m7099um() : C7019kk.m27469x1(m6216ks().f45392kk, C13785ll.class) ? ((C13785ll) C7019kk.m27452k4((Object) m6216ks().f45392kk, C13785ll.class)).m64459kp() : m73225wy() / ((fml) this).f5072x1.size();
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        m63448rv();
        m63446du(c14713vw);
        m64550m9();
        m6210fa();
        m64546du();
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m63447k4(AbstractC1164gw abstractC1164gw) {
        if (!C7019kk.m27469x1(m6216ks().f45394x1, ValueAxisBase.class)) {
            return false;
        }
        return abstractC1164gw.m6926yj().m4989k4() < ((ValueAxisBase) C7019kk.m27452k4((Object) m6216ks().f45394x1, ValueAxisBase.class)).m3039s7() || abstractC1164gw.m6926yj().m4989k4() > ((ValueAxisBase) C7019kk.m27452k4((Object) m6216ks().f45394x1, ValueAxisBase.class)).m3033gi();
    }
}
