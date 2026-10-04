package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.tg */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC14557tg extends AbstractC1164gw {
    public AbstractC14557tg(C0886d8 c0886d8) {
        super(c0886d8);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: U_ */
    public void mo5524U_() {
        if (!mo3221T_() || m6926yj() == null || m6926yj().m5013uz().isNoEffects()) {
            return;
        }
        C14365qy c14365qyM64941c5 = m6926yj().m5012up().m64941c5();
        C12007ix c12007ix = new C12007ix(m73228yd().m73227xk(), m73228yd().m73206c6(), m73228yd().m73225wy(), m73228yd().m73203ak());
        C14851yl c14851yl = new C14851yl(c14365qyM64941c5);
        c14851yl.m73924k4(c12007ix.Clone());
        try {
            m6926yj().m5010to(new C12007ix(m73227xk(), m73206c6(), m73225wy(), m73203ak()).Clone());
        } finally {
            c14851yl.m73923k4();
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final fml m71148c5() {
        return (fml) m73228yd();
    }

    /* JADX INFO: renamed from: dy */
    public final int m71149dy() {
        return m71148c5().f5072x1.indexOf(this);
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m71150h4() {
        for (AbstractC1164gw abstractC1164gw : m71148c5().m6216ks().m63152k4(m71149dy())) {
            if (abstractC1164gw.m6918fa() > m6918fa()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: kk */
    public abstract C12025x6 mo7137kk();

    /* JADX INFO: renamed from: m9 */
    public final boolean m71151m9() {
        for (AbstractC1164gw abstractC1164gw : m71148c5().m6216ks().m63152k4(m71149dy())) {
            if (abstractC1164gw.m6918fa() < m6918fa()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: to */
    public abstract C12025x6 mo7138to();

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        if (m73225wy() == 0.0f || m73203ak() == 0.0f) {
            return;
        }
        C14365qy c14365qyM64941c5 = m6926yj().m5012up().m64941c5();
        C12007ix c12007ix = new C12007ix(m73228yd().m73227xk(), m73228yd().m73206c6(), m73228yd().m73225wy(), m73228yd().m73203ak());
        C14851yl c14851yl = new C14851yl(c14365qyM64941c5);
        c14851yl.m73924k4(c12007ix.Clone());
        try {
            C12007ix c12007ix2 = new C12007ix(m73227xk(), m73206c6(), m73225wy(), m73203ak());
            if (!m6926yj().m5002kk(c12007ix2.Clone())) {
                m6926yj().m5017x1(c12007ix2.Clone());
                m6926yj().m4996k4(c12007ix2.Clone());
            }
        } finally {
            c14851yl.m73923k4();
        }
    }
}
