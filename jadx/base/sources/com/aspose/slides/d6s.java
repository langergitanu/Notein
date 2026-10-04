package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class d6s extends AbstractC14265p3 {
    public d6s(C14787xi c14787xi) {
        super(c14787xi);
    }

    /* JADX INFO: renamed from: gi */
    private void m4957gi() {
        if (m68930um().size() == 0) {
            return;
        }
        float fM73203ak = m73203ak() / ((AbstractC14763x3) this).f49904k4.size();
        float fM73225wy = m73022ix() == 1 ? 0.0f : m73225wy();
        List.Enumerator<List<nxm>> it = m68930um().iterator();
        while (it.hasNext()) {
            try {
                List<nxm> next = it.next();
                float fM67481k4 = 0.0f;
                for (int i = 0; i < next.size(); i++) {
                    fM67481k4 = C14116yg.m67481k4(next.get_Item(i).m73225wy(), fM67481k4);
                }
                float f = 0.0f;
                for (int i2 = 0; i2 < next.size(); i2++) {
                    nxm nxmVar = next.get_Item(i2);
                    float fM68260up = nxmVar.m68260up() * fM73203ak;
                    float f2 = (fM68260up / 2.0f) + f;
                    f += fM68260up;
                    nxmVar.m73212h4(f2 - (nxmVar.m73203ak() / 2.0f));
                    nxmVar.m73208du(m73022ix() == 1 ? (fM73225wy + fM67481k4) - nxmVar.m73225wy() : fM73225wy - nxmVar.m73225wy());
                }
                fM73225wy = m73022ix() == 1 ? fM73225wy + fM67481k4 + m73034ne() : (fM73225wy - fM67481k4) - m73034ne();
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
    }

    /* JADX INFO: renamed from: up */
    private void m4958up(C14713vw c14713vw) {
        m68930um().clear();
        if (m73026k4().m73423wy().m69861to() == null) {
            return;
        }
        for (int i = 0; i < m73026k4().m73423wy().m69861to().length; i++) {
            List<nxm> list = new List<>();
            m68930um().addItem(list);
            C14713vw c14713vw2 = new C14713vw(c14713vw.m72555k4(), c14713vw.m72556x1() / m73026k4().m73423wy().m69861to()[i].size());
            float f = 0.0f;
            for (int i2 = 0; i2 < m73026k4().m73423wy().m69861to()[i].size(); i2++) {
                nxm nxmVar = new nxm(m73026k4().m73423wy().m69861to()[i].get_Item(i2).m7238x1(), this);
                nxmVar.m68254k4(90.0f);
                nxmVar.m68255k4(C0841c4.m4458k4(m73026k4().m73423wy().m69861to()[i].get_Item(i2)));
                m73215k4((AbstractC14770x9) nxmVar);
                list.addItem(nxmVar);
                oju ojuVarClone = nxmVar.m68258kk(c14713vw2).Clone();
                if (nxmVar.m68258kk(c14713vw2).f47836k4 > f) {
                    f = ojuVarClone.f47836k4;
                }
                nxmVar.m73210fa(new C14713vw(ojuVarClone.f47836k4, ojuVarClone.f47837x1));
            }
            if (!m73026k4().m73384dy().isPlotOrderReversed()) {
                list.reverse();
            }
            m73217kk(m73225wy() + m73034ne() + f);
        }
    }

    /* JADX INFO: renamed from: yj */
    private boolean m4959yj(C14713vw c14713vw) {
        List.Enumerator<nxm> it = ((AbstractC14763x3) this).f49904k4.iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                nxm next = it.next();
                String strMo64292k4 = next.m73367ks().m288x1().f3523to.mo64292k4(c14713vw.m72555k4(), c14713vw.m72556x1(), true);
                if (C14113y2.m67364dy(strMo64292k4, next.m68253jd()) == -1) {
                    next.m68256k4((Object) strMo64292k4);
                    next.m68257k4(true);
                    z = true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return z;
    }

    @Override // com.aspose.slides.AbstractC14265p3
    /* JADX INFO: renamed from: c5 */
    public C14713vw mo4960c5(C14713vw c14713vw) {
        int iM68932wl = m68932wl();
        float fM72555k4 = (c14713vw.m72555k4() * 0.51f) - m73034ne();
        float fM72556x1 = c14713vw.m72556x1();
        if (!((ChartPlotArea) C7019kk.m27452k4((Object) m73026k4().m73423wy().m69834fa().getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated()) {
            fM72555k4 = c14713vw.m72555k4() - m73034ne();
        }
        if (iM68932wl > 0) {
            fM72556x1 = c14713vw.m72556x1() / iM68932wl;
        }
        return new C14713vw(fM72555k4, fM72556x1);
    }

    /* JADX INFO: renamed from: ck */
    public final C12015qq m4961ck(C14713vw c14713vw) {
        if (!m73026k4().m73384dy().isVisible() || m73026k4().m73384dy().getTickLabelPosition() == 3) {
            return new C12015qq(0.0f, 0.0f);
        }
        C14713vw c14713vwMo4960c5 = mo4960c5(c14713vw);
        C12015qq c12015qqClone = mo3034h4(c14713vwMo4960c5).Clone();
        if (m73026k4().m73421v4() && m73026k4().m73386h4() == 0) {
            if (c12015qqClone.m56697kk() - 2.0f > c14713vwMo4960c5.m72556x1()) {
                if (m4959yj(c14713vwMo4960c5)) {
                    return m4961ck(c14713vw);
                }
                if (m68929qq() > 1) {
                    m73026k4().m73388h4(m73026k4().m73376bv() + 1);
                    return m4961ck(c14713vw);
                }
            }
            return c12015qqClone;
        }
        return mo3034h4(c14713vw);
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: du */
    public void mo4962du(C14713vw c14713vw) {
        ((AbstractC14763x3) this).f49900du = 0.0f;
        ((AbstractC14763x3) this).f49907to = 0.0f;
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: dy */
    public void mo4963dy() {
        m73018c5();
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: k4 */
    public float mo4964k4(double d) {
        if (!m73026k4().m73384dy().isPlotOrderReversed()) {
            return (float) (((m68925bv() - d) / (m68925bv() - ((double) 1))) * ((double) m73203ak()));
        }
        double d2 = 1;
        return (float) (((d - d2) / (m68925bv() - d2)) * ((double) m73203ak()));
    }

    /* JADX INFO: renamed from: kp */
    public final float m4965kp() {
        float fM73203ak;
        int size;
        if (m73026k4().m73375b3()) {
            fM73203ak = m73203ak();
            size = ((AbstractC14763x3) this).f49904k4.size();
        } else {
            fM73203ak = m73203ak();
            size = ((AbstractC14763x3) this).f49904k4.size() - 1;
        }
        return fM73203ak / size;
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: ks */
    public C12015qq mo4966ks() {
        return m73038x6();
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        super.mo3482x1();
        C12007ix c12007ix = new C12007ix(m73218lr().m73227xk(), m73218lr().m73206c6(), m73218lr().m73225wy(), m73218lr().m73203ak());
        C14851yl c14851yl = new C14851yl(m73026k4().m73423wy());
        c14851yl.m73924k4(c12007ix.Clone());
        try {
            if (m68930um().size() == 0) {
                return;
            }
            float fM73203ak = m73203ak() / ((AbstractC14763x3) this).f49904k4.size();
            float fM73225wy = m73022ix() == 1 ? 0.0f : m73225wy();
            m73026k4().m73393k4(m73227xk(), m73206c6(), m73227xk() + m73225wy(), m73206c6());
            List.Enumerator<List<nxm>> it = m68930um().iterator();
            while (it.hasNext()) {
                try {
                    List<nxm> next = it.next();
                    float fM73206c6 = m73206c6();
                    float fM67481k4 = 0.0f;
                    for (int i = 0; i < next.size(); i++) {
                        fM67481k4 = C14116yg.m67481k4(next.get_Item(i).m73225wy(), fM67481k4);
                    }
                    for (int i2 = 0; i2 < next.size(); i2++) {
                        fM73206c6 += next.get_Item(i2).m68260up() * fM73203ak;
                        m73026k4().m73393k4(m73022ix() == 1 ? m73227xk() + fM73225wy : m73227xk(), fM73206c6, m73022ix() == 1 ? m73227xk() + m73225wy() : m73227xk() + fM73225wy, fM73206c6);
                    }
                    fM73225wy = m73022ix() == 1 ? fM73225wy + fM67481k4 + m73034ne() : (fM73225wy - fM67481k4) - m73034ne();
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
        } finally {
            c14851yl.m73923k4();
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        if (m73026k4().m73421v4()) {
            m73026k4().m73388h4(1);
        }
        m73224wp();
        if (c14713vw.m72556x1() <= 1.0f) {
            return;
        }
        m73222to(c14713vw.m72556x1());
        mo68927jd(c14713vw);
        m73033m9();
        C12015qq c12015qqClone = m4961ck(c14713vw).Clone();
        m68924ar();
        m73217kk(c12015qqClone.m56699x1() + m73034ne());
        m73027k4(c12015qqClone.Clone());
        mo4962du(c14713vw);
        if (ChartTypeCharacterizer.m767to(((AbstractC14763x3) this).f49908x1.get_Item(0).m64945h4().getType())) {
            return;
        }
        m4958up(c14713vw);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        int iM73376bv;
        float fM56638du = m73026k4().m73400kk().m56638du() / 2.0f;
        if (m73026k4().m73384dy().isPlotOrderReversed() || ((AbstractC14763x3) this).f49908x1.get_Item(0).m64945h4().getType() == 80) {
            iM73376bv = m73026k4().m73376bv() - 1;
            ((AbstractC14763x3) this).f49904k4.reverse();
        } else {
            iM73376bv = 0;
        }
        while (iM73376bv < ((AbstractC14763x3) this).f49904k4.size()) {
            nxm nxmVar = ((AbstractC14763x3) this).f49904k4.get_Item(iM73376bv);
            float fM4965kp = m73026k4().m73375b3() ? (m4965kp() / 2.0f) + (m4965kp() * iM73376bv) : iM73376bv * m4965kp();
            nxmVar.m73212h4(m73203ak() - ((m73026k4().m73386h4() == 0 || m73026k4().m73386h4() % 90 == 0) ? fM4965kp + (nxmVar.m73203ak() / 2.0f) : m73026k4().m73386h4() > 0 ? fM4965kp + fM56638du : (fM4965kp - fM56638du) + nxmVar.m73203ak()));
            nxmVar.m73208du(m73022ix() == 1 ? (m73225wy() - m73034ne()) - nxmVar.m73225wy() : m73034ne());
            iM73376bv += m73026k4().m73376bv();
        }
        m4957gi();
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }
}
