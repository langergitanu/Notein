package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12015qq;

/* JADX INFO: loaded from: classes3.dex */
class f2h extends AbstractC14464sp {
    public f2h(C14787xi c14787xi) {
        super(c14787xi);
    }

    /* JADX INFO: renamed from: up */
    private void m5810up(C14713vw c14713vw) {
        C14713vw c14713vwMo5811k4 = mo5811k4(c14713vw, m70708k4(m73026k4().m73384dy().getBaseUnitScale()));
        C14713vw c14713vw2 = new C14713vw(m73026k4().m73423wy().m69867v4(), m73026k4().m73423wy().m69852lr());
        float fM70707jd = (m73026k4().m73386h4() == 0 || m73026k4().m73386h4() % 90 == 0) ? m70707jd(c14713vw2) : mo3034h4(c14713vw2).m56697kk();
        if (!m73026k4().m73422wl() || !m73026k4().m73411qq()) {
            if (!m73026k4().m73422wl() && m73026k4().m73411qq()) {
                m73026k4().m73387h4(C22208OooOo0.OooO00o(m73026k4().m73418um(), 2.0d, 14) != 0 ? C22208OooOo0.OooO00o(m73026k4().m73418um(), 2.0d, 14) : 1.0d);
                m73026k4().m73382du(m73026k4().m73417u4());
                return;
            } else {
                if (m73026k4().m73422wl()) {
                    m73026k4().m73411qq();
                    return;
                }
                return;
            }
        }
        if (fM70707jd <= c14713vwMo5811k4.m72555k4()) {
            m73026k4().m73409m9(1.0d);
            m73026k4().m73387h4(1.0d);
            m73026k4().m73415to(m73026k4().m73384dy().getBaseUnitScale());
            m73026k4().m73382du(m73026k4().m73384dy().getBaseUnitScale());
            return;
        }
        int iM70708k4 = m70708k4(m73026k4().m73384dy().getBaseUnitScale());
        int iM27462to = C7019kk.m27462to(Float.valueOf(c14713vw.m72556x1() / fM70707jd), 13);
        int i = iM70708k4 % iM27462to;
        int i2 = iM70708k4 / iM27462to;
        if (i != 0) {
            i2++;
        }
        m70714x1(i2);
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: du */
    public void mo4962du(C14713vw c14713vw) {
        float fM56638du = m73026k4().m73400kk().m56638du() / 2.0f;
        if (!m73026k4().m73375b3() || m73026k4().m73386h4() == 0) {
            ((AbstractC14763x3) this).f49900du = fM56638du;
            ((AbstractC14763x3) this).f49907to = fM56638du;
            return;
        }
        float fM5812um = m5812um();
        for (int i = 0; i < ((AbstractC14763x3) this).f49904k4.size(); i++) {
            nxm nxmVar = ((AbstractC14763x3) this).f49904k4.get_Item(i);
            float fM73203ak = nxmVar.m73203ak();
            if (nxmVar.mo3221T_()) {
                float fM72556x1 = c14713vw.m72556x1() - ((fM5812um / 2.0f) + (i * fM5812um));
                if (m73026k4().m73386h4() > 0) {
                    float f = (fM72556x1 - fM56638du) + fM73203ak;
                    if (f > m73203ak() && f - m73203ak() > ((AbstractC14763x3) this).f49907to) {
                        ((AbstractC14763x3) this).f49907to = f - m73203ak();
                    }
                } else {
                    float f2 = (fM72556x1 + fM56638du) - fM73203ak;
                    if (f2 < 0.0f) {
                        float f3 = f2 * (-1.0f);
                        if (f3 > ((AbstractC14763x3) this).f49900du) {
                            ((AbstractC14763x3) this).f49900du = f3;
                        }
                    }
                }
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: dy */
    public void mo4963dy() {
        m73018c5();
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: k4 */
    public float mo4964k4(double d) {
        int iM27462to = C7019kk.m27462to(Double.valueOf(m73026k4().m73410ne()), 14);
        int iM70708k4 = m70708k4(m73026k4().m73384dy().getBaseUnitScale());
        int iM4455k4 = C0841c4.m4455k4(m73026k4().m73384dy().getBaseUnitScale(), C7019kk.m27462to(Double.valueOf(d), 14), iM27462to, C7019kk.m27462to(Double.valueOf(m73026k4().m73389ix()), 14), false);
        return !m73026k4().m73384dy().isPlotOrderReversed() ? m73203ak() - ((iM4455k4 / iM70708k4) * m73203ak()) : (iM4455k4 / iM70708k4) * m73203ak();
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: ks */
    public C12015qq mo4966ks() {
        return m73038x6();
    }

    /* JADX INFO: renamed from: um */
    public final float m5812um() {
        return m73203ak() / m70708k4(m73026k4().m73384dy().getBaseUnitScale());
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        double dM5812um = m5812um();
        float fM56638du = m73026k4().m73400kk().m56638du() / 2.0f;
        for (int i = 0; i < ((AbstractC14763x3) this).f49904k4.size(); i++) {
            nxm nxmVar = ((AbstractC14763x3) this).f49904k4.get_Item(i);
            float fMo4964k4 = mo4964k4(((Integer) nxmVar.m68259m9()).intValue());
            if (m73026k4().m73375b3() || m73026k4().m73423wy().m69834fa().hasDataTable()) {
                fMo4964k4 += (float) (dM5812um / 2.0d);
            }
            if (m73026k4().m73384dy().isPlotOrderReversed()) {
                fMo4964k4 = m73203ak() - fMo4964k4;
            }
            float fM73203ak = (m73026k4().m73386h4() == 0 || m73026k4().m73386h4() % 90 == 0) ? fMo4964k4 + (nxmVar.m73203ak() / 2.0f) : m73026k4().m73386h4() > 0 ? fMo4964k4 + fM56638du : (fMo4964k4 - fM56638du) + nxmVar.m73203ak();
            nxmVar.m73208du(m73022ix() == 1 ? (m73225wy() - m73034ne()) - nxmVar.m73225wy() : m73034ne());
            nxmVar.m73212h4(m73203ak() - fM73203ak);
        }
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }

    @Override // com.aspose.slides.AbstractC14464sp
    /* JADX INFO: renamed from: k4 */
    public C14713vw mo5811k4(C14713vw c14713vw, int i) {
        return new C14713vw((c14713vw.m72555k4() * 0.5f) - m73034ne(), c14713vw.m72556x1() / i);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73224wp();
        m70705ck(c14713vw);
        m73033m9();
        m70703ar();
        m5810up(c14713vw);
        m70711m9(c14713vw);
        C12015qq c12015qqClone = mo3034h4(c14713vw).Clone();
        m73217kk(c12015qqClone.m56699x1() + m73034ne());
        m73222to(c14713vw.m72556x1());
        m73027k4(c12015qqClone.Clone());
        mo4962du(c14713vw);
    }
}
