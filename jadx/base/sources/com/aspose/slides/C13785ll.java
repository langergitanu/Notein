package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ll */
/* JADX INFO: loaded from: classes3.dex */
class C13785ll extends AbstractC14265p3 {

    /* JADX INFO: renamed from: c5 */
    private boolean f46036c5;

    /* JADX INFO: renamed from: dy */
    float f46037dy;

    /* JADX INFO: renamed from: m9 */
    protected boolean f46038m9;

    public C13785ll(C14787xi c14787xi) {
        super(c14787xi);
        this.f46038m9 = false;
        this.f46037dy = 0.0f;
    }

    /* JADX INFO: renamed from: gi */
    private void m64448gi() {
        if (m68930um().size() == 0) {
            return;
        }
        float fM64459kp = m64459kp();
        float fM73203ak = m73022ix() == 3 ? 0.0f : m73203ak();
        List.Enumerator<List<nxm>> it = m68930um().iterator();
        while (it.hasNext()) {
            try {
                List<nxm> next = it.next();
                float fM67481k4 = 0.0f;
                for (int i = 0; i < next.size(); i++) {
                    fM67481k4 = C14116yg.m67481k4(next.get_Item(i).m73203ak(), fM67481k4);
                }
                float f = 0.0f;
                for (int i2 = 0; i2 < next.size(); i2++) {
                    nxm nxmVar = next.get_Item(i2);
                    float fM68260up = nxmVar.m68260up() * fM64459kp;
                    float f2 = (fM68260up / 2.0f) + f;
                    f += fM68260up;
                    nxmVar.m73208du(f2 - (nxmVar.m73225wy() / 2.0f));
                    nxmVar.m73212h4(m73022ix() == 3 ? fM73203ak : fM73203ak - fM67481k4);
                }
                fM73203ak = m73022ix() == 3 ? fM67481k4 + m73034ne() : (fM73203ak - fM67481k4) - m73034ne();
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

    /* JADX INFO: renamed from: rv */
    private void m64452rv(C14713vw c14713vw) {
        C14713vw c14713vwMo4960c5 = mo4960c5(new C14713vw(c14713vw.m72555k4() + 1.0f, c14713vw.m72556x1()));
        m73026k4().m73394k4(0);
        boolean z = ((float) m68932wl()) <= 1.0f || m68926dy(c14713vwMo4960c5);
        boolean z2 = m68930um().size() == 0 && m64449k4(c14713vwMo4960c5.m72555k4(), 45);
        boolean z3 = !m73026k4().m73421v4() || m73030kk() < c14713vwMo4960c5.m72555k4();
        if (z) {
            m73026k4().m73394k4(0);
            return;
        }
        if (z2) {
            m73026k4().m73394k4(45);
        } else if (z3) {
            m73026k4().m73394k4(90);
        } else {
            m73026k4().m73388h4(m73026k4().m73376bv() + 1);
            m64452rv(c14713vw);
        }
    }

    /* JADX INFO: renamed from: s7 */
    private boolean m64453s7() {
        return m73026k4().m73423wy().m69834fa().hasDataTable();
    }

    /* JADX INFO: renamed from: x6 */
    private C12015qq m64454x6(C14713vw c14713vw) {
        C14713vw c14713vwMo4960c5 = mo4960c5(c14713vw);
        C12015qq c12015qq = new C12015qq();
        if (m73026k4().m73386h4() == 0) {
            return m64457k4(c14713vw, c14713vwMo4960c5, m68928m9(((AbstractC14763x3) this).f49905kk));
        }
        (m73026k4().m73386h4() % 90 != 0 ? mo3034h4(((AbstractC14763x3) this).f49905kk) : mo3034h4(c14713vwMo4960c5)).CloneTo(c12015qq);
        return m64450k4(c14713vwMo4960c5, c12015qq.Clone()) ? m64454x6(((AbstractC14763x3) this).f49905kk) : c12015qq;
    }

    /* JADX INFO: renamed from: yj */
    private void m64455yj(C14713vw c14713vw) {
        if (m73026k4().m73423wy().m69861to() == null || m73026k4().m73384dy().m319k4().m68838h4()) {
            return;
        }
        m68930um().clear();
        for (int i = 0; i < m73026k4().m73423wy().m69861to().length; i++) {
            List<nxm> list = new List<>();
            m68930um().addItem(list);
            float f = 0.0f;
            for (int i2 = 0; i2 < m73026k4().m73423wy().m69861to()[i].size(); i2++) {
                nxm nxmVar = new nxm(m73026k4().m73423wy().m69861to()[i].get_Item(i2).m7238x1(), this);
                nxmVar.m68254k4(0.0f);
                nxmVar.m68255k4(C0841c4.m4458k4(m73026k4().m73423wy().m69861to()[i].get_Item(i2)));
                m73215k4((AbstractC14770x9) nxmVar);
                list.addItem(nxmVar);
                oju ojuVarClone = nxmVar.m68258kk(new C14713vw(C14116yg.m67481k4(nxmVar.m68249du(c14713vw).m56699x1(), m64459kp() * nxmVar.m68260up()), c14713vw.m72556x1())).Clone();
                float f2 = ojuVarClone.f47837x1;
                if (f2 > f) {
                    f = f2;
                }
                nxmVar.m73210fa(new C14713vw(ojuVarClone.f47836k4, ojuVarClone.f47837x1));
            }
            if (m73026k4().m73384dy().isPlotOrderReversed()) {
                list.reverse();
            }
            m73222to(m73203ak() + f + m73034ne());
        }
    }

    @Override // com.aspose.slides.AbstractC14265p3
    /* JADX INFO: renamed from: c5 */
    public C14713vw mo4960c5(C14713vw c14713vw) {
        int iM68932wl = m68932wl();
        return new C14713vw(iM68932wl == 0 ? c14713vw.m72555k4() : c14713vw.m72555k4() / iM68932wl, c14713vw.m72556x1() - m73034ne());
    }

    /* JADX INFO: renamed from: ck */
    public C12015qq mo64456ck(C14713vw c14713vw) {
        if (!m73026k4().m73384dy().isVisible() || m73026k4().m73384dy().getTickLabelPosition() == 3) {
            return new C12015qq(0.0f, 0.0f);
        }
        boolean zM73377c5 = m73026k4().m73377c5();
        m64451ks(c14713vw);
        if (!zM73377c5) {
            return m64460up(c14713vw);
        }
        m64452rv(c14713vw);
        return m64454x6(c14713vw);
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: du */
    public void mo4962du(C14713vw c14713vw) {
        float fM72555k4;
        nxm nxmVar;
        float f;
        nxm nxmVar2;
        float fM73019ck;
        float fM73019ck2;
        ((AbstractC14763x3) this).f49907to = 0.0f;
        ((AbstractC14763x3) this).f49900du = 0.0f;
        if (mo3221T_()) {
            float fM64459kp = m64459kp();
            int i = 0;
            while (true) {
                fM72555k4 = Float.NaN;
                nxmVar = null;
                if (i >= ((AbstractC14763x3) this).f49904k4.size()) {
                    f = Float.NaN;
                    nxmVar2 = null;
                    break;
                } else if (!((AbstractC14763x3) this).f49904k4.get_Item(i).mo3221T_() || C14113y2.m67411k4(((AbstractC14763x3) this).f49904k4.get_Item(i).m68253jd())) {
                    i++;
                } else {
                    nxmVar2 = ((AbstractC14763x3) this).f49904k4.get_Item(i);
                    f = m73026k4().m73375b3() ? fM64459kp / 2.0f : 0.0f;
                }
            }
            int size = ((AbstractC14763x3) this).f49904k4.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                if (!((AbstractC14763x3) this).f49904k4.get_Item(size).mo3221T_() || C14113y2.m67411k4(((AbstractC14763x3) this).f49904k4.get_Item(size).m68253jd())) {
                    size--;
                } else {
                    nxmVar = ((AbstractC14763x3) this).f49904k4.get_Item(size);
                    fM72555k4 = m73026k4().m73375b3() ? c14713vw.m72555k4() - (fM64459kp / 2.0f) : c14713vw.m72555k4();
                }
            }
            if (nxmVar2 == null || nxmVar == null) {
                return;
            }
            if (m73026k4().m73386h4() == 0) {
                fM73019ck = f - (nxmVar2.m73225wy() / 2.0f);
                fM73019ck2 = (nxmVar.m73225wy() / 2.0f) + fM72555k4;
            } else if (m73026k4().m73386h4() % 90 == 0) {
                fM73019ck2 = 0.0f;
                fM73019ck = 0.0f;
            } else {
                float fM67480k4 = C14116yg.m67480k4((m73026k4().m73386h4() / 90.0f) * m73026k4().m73400kk().m56638du());
                if (m73026k4().m73386h4() > 0) {
                    fM73019ck = ((f + m73019ck()) - nxmVar2.m73225wy()) + fM67480k4;
                    fM73019ck2 = fM72555k4 + m73019ck() + fM67480k4;
                } else {
                    fM73019ck = ((m73019ck() * (-1.0f)) + f) - fM67480k4;
                    fM73019ck2 = ((fM72555k4 - m73019ck()) + nxmVar.m73225wy()) - fM67480k4;
                }
            }
            if (fM73019ck < 0.0f) {
                ((AbstractC14763x3) this).f49907to = fM73019ck * (-1.0f);
            }
            if (fM73019ck2 > c14713vw.m72555k4()) {
                ((AbstractC14763x3) this).f49900du = fM73019ck2 - c14713vw.m72555k4();
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: dy */
    public void mo4963dy() {
        m73023jd();
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: k4 */
    public float mo4964k4(double d) {
        if (m73026k4().m73384dy().isPlotOrderReversed()) {
            return (float) (((m68925bv() - d) / (m68925bv() - ((double) 1))) * ((double) m73225wy()));
        }
        double d2 = 1;
        return (float) (((d - d2) / (m68925bv() - d2)) * ((double) m73225wy()));
    }

    /* JADX INFO: renamed from: kp */
    public final float m64459kp() {
        float fM73225wy;
        int size;
        if (m73026k4().m73375b3()) {
            fM73225wy = m73225wy();
            size = ((AbstractC14763x3) this).f49904k4.size();
        } else {
            fM73225wy = m73225wy();
            size = ((AbstractC14763x3) this).f49904k4.size() - 1;
        }
        return fM73225wy / size;
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: ks */
    public C12015qq mo4966ks() {
        return m73035rv();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [int, java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int, java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r2v13, types: [double, int] */
    /* JADX WARN: Type inference failed for: r2v19, types: [double, int] */
    /* JADX INFO: renamed from: up */
    public final C12015qq m64460up(C14713vw c14713vw) {
        C14713vw c14713vwMo4960c5 = mo4960c5(c14713vw);
        C14713vw c14713vw2 = new C14713vw(m73026k4().m73423wy().m69867v4(), m73026k4().m73423wy().m69852lr());
        if (m73026k4().m73398k4()) {
            C12015qq c12015qqClone = mo3034h4(c14713vw2).Clone();
            if (c12015qqClone.m56697kk() > c14713vwMo4960c5.m72556x1() && c12015qqClone.m56699x1() > c14713vwMo4960c5.m72555k4()) {
                m73026k4().m73388h4((int) StringBuffer.append((int) (((AbstractC14763x3) this).f49904k4.size() / (m73225wy() / c14713vwMo4960c5.m72555k4()))));
                return m64460up(c14713vw);
            }
        } else {
            if (m73026k4().m73386h4() == 0) {
                C12015qq c12015qq = new C12015qq();
                if (m73026k4().m73376bv() >= ((AbstractC14763x3) this).f49904k4.size()) {
                    mo3034h4(c14713vwMo4960c5).CloneTo(c12015qq);
                    if (c12015qq.m56697kk() > c14713vw.m72556x1()) {
                        return mo3034h4(((AbstractC14763x3) this).f49905kk);
                    }
                }
                float fM68928m9 = m68928m9(c14713vw2);
                if (fM68928m9 > c14713vwMo4960c5.m72555k4()) {
                    if (!m73026k4().m73421v4()) {
                        return mo3034h4(c14713vw2);
                    }
                    m73026k4().m73388h4(C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(((double) ((AbstractC14763x3) this).f49904k4.size()) / C14116yg.m67490kk(m73225wy() / fM68928m9))), 14));
                    return m64460up(c14713vw);
                }
                m64457k4(c14713vw, c14713vwMo4960c5, fM68928m9).CloneTo(c12015qq);
                if (c12015qq.m56697kk() > c14713vw.m72556x1()) {
                    C14713vw c14713vw3 = ((AbstractC14763x3) this).f49905kk;
                    m64457k4(c14713vw3, c14713vw3, fM68928m9).CloneTo(c12015qq);
                }
                return c12015qq;
            }
            if (m73026k4().m73386h4() % 90 != 0) {
                C12015qq c12015qqClone2 = mo3034h4(c14713vw2).Clone();
                if (m73026k4().m73376bv() >= ((AbstractC14763x3) this).f49904k4.size() || !m73026k4().m73421v4() || c12015qqClone2.m56699x1() <= c14713vwMo4960c5.m72555k4() || m64449k4(c14713vwMo4960c5.m72555k4(), m73026k4().m73386h4())) {
                    return c12015qqClone2;
                }
                m73026k4().m73388h4(m73026k4().m73376bv() + 1);
                return m64460up(c14713vw);
            }
            if (m73026k4().m73376bv() >= ((AbstractC14763x3) this).f49904k4.size()) {
                return mo3034h4(c14713vwMo4960c5);
            }
            C12015qq c12015qqClone3 = mo3034h4(c14713vwMo4960c5).Clone();
            if (c12015qqClone3.m56699x1() <= c14713vwMo4960c5.m72555k4()) {
                return c12015qqClone3;
            }
            if (m73030kk() > c14713vwMo4960c5.m72555k4()) {
                m73026k4().m73388h4((int) StringBuffer.append((int) (((AbstractC14763x3) this).f49904k4.size() / (m73225wy() / m73030kk()))));
                return m64460up(c14713vw);
            }
        }
        float fM56697kk = mo3034h4(c14713vw2).m56697kk();
        if (m73026k4().m73386h4() == 0 || fM56697kk <= c14713vwMo4960c5.m72556x1()) {
            return mo3034h4(c14713vwMo4960c5);
        }
        List.Enumerator<nxm> it = ((AbstractC14763x3) this).f49904k4.iterator();
        while (it.hasNext()) {
            try {
                m64458k4(it.next(), c14713vwMo4960c5);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f46036c5 = true;
        return mo3034h4(c14713vw2);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        super.mo3482x1();
        C12007ix c12007ix = new C12007ix(m73218lr().m73227xk(), m73218lr().m73206c6(), m73218lr().m73225wy(), m73218lr().m73203ak());
        C14851yl c14851yl = new C14851yl(m73026k4().m73423wy());
        c14851yl.m73924k4(c12007ix.Clone());
        try {
            if (m68930um().size() > 0) {
                List.Enumerator<nxm> it = ((AbstractC14763x3) this).f49904k4.iterator();
                float fM67481k4 = 0.0f;
                while (it.hasNext()) {
                    try {
                        nxm next = it.next();
                        if (next.mo3221T_()) {
                            fM67481k4 = C14116yg.m67481k4(fM67481k4, next.m73203ak());
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                if (m73026k4().m73384dy().getMajorTickMark() != 2) {
                    for (int i = 0; i <= ((AbstractC14763x3) this).f49904k4.size(); i++) {
                        if (m73022ix() == 3) {
                            float f = i;
                            m73026k4().m73393k4((m64459kp() * f) + m73227xk(), m73206c6() + m73203ak(), (m64459kp() * f) + m73227xk(), ((m73206c6() + m73203ak()) - m73034ne()) - fM67481k4);
                        } else {
                            float f2 = i;
                            m73026k4().m73393k4((m64459kp() * f2) + m73227xk(), m73206c6(), (m64459kp() * f2) + m73227xk(), m73206c6() + m73034ne() + fM67481k4);
                        }
                    }
                }
                float fM73203ak = m73022ix() == 3 ? 0.0f : m73203ak();
                m73026k4().m73393k4(m73227xk(), m73206c6(), m73227xk(), m73206c6() + m73203ak());
                it = m68930um().iterator();
                while (it.hasNext()) {
                    try {
                        List<nxm> next2 = it.next();
                        float fM67481k42 = 0.0f;
                        for (int i2 = 0; i2 < next2.size(); i2++) {
                            fM67481k42 = C14116yg.m67481k4(next2.get_Item(i2).m73203ak(), fM67481k42);
                        }
                        float fM64459kp = 0.0f;
                        for (int i3 = 0; i3 < next2.size(); i3++) {
                            fM64459kp += m64459kp() * next2.get_Item(i3).m68260up();
                            m73026k4().m73393k4(m73227xk() + fM64459kp, m73022ix() == 3 ? m73206c6() + fM73203ak : (m73206c6() + m73203ak()) - fM73203ak, m73227xk() + fM64459kp, m73022ix() == 3 ? (m73206c6() + m73203ak()) - fM73203ak : m73206c6() + fM73203ak);
                        }
                        fM73203ak = m73022ix() == 3 ? fM73203ak + fM67481k42 + m73034ne() : (fM73203ak - fM67481k42) - m73034ne();
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
            c14851yl.m73923k4();
        } catch (Throwable th) {
            c14851yl.m73923k4();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ks */
    private void m64451ks(C14713vw c14713vw) {
        int iM68932wl = m68932wl();
        if (!m73026k4().m73421v4() || m73225wy() / iM68932wl >= 1.0f) {
            return;
        }
        nxm nxmVarM73025k4 = m73025k4("x");
        float f = nxmVarM73025k4.m68258kk(c14713vw).f47836k4;
        while (((double) m73225wy()) / (((double) iM68932wl) / ((double) m73026k4().m73376bv())) < f) {
            m73026k4().m73388h4(m73026k4().m73376bv() + 10);
        }
        m73028k4(nxmVarM73025k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12015qq m64457k4(C14713vw c14713vw, C14713vw c14713vw2, float f) {
        float fM72555k4 = c14713vw.m72555k4() / ((AbstractC14763x3) this).f49904k4.size();
        return (f > fM72555k4 || m73026k4().m73376bv() > 1) ? mo3034h4(c14713vw2) : mo3034h4(new C14713vw(fM72555k4, c14713vw2.m72556x1()));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015b  */
    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo3231x1(C14713vw c14713vw) {
        int iM73376bv;
        float fM64459kp;
        float fM73225wy;
        if (m73026k4().m73384dy().isPlotOrderReversed() || ((AbstractC14763x3) this).f49908x1.get_Item(0).m64945h4().getType() == 80) {
            iM73376bv = m73026k4().m73376bv() - 1;
            ((AbstractC14763x3) this).f49904k4.reverse();
        } else {
            iM73376bv = 0;
        }
        while (iM73376bv < ((AbstractC14763x3) this).f49904k4.size()) {
            nxm nxmVar = ((AbstractC14763x3) this).f49904k4.get_Item(iM73376bv);
            float fM64459kp2 = m73026k4().m73375b3() ? (m64459kp() / 2.0f) + (m64459kp() * iM73376bv) : iM73376bv * m64459kp();
            if (m73026k4().m73386h4() == 0 || m73026k4().m73386h4() % 90 == 0) {
                int iM68835du = m73026k4().m73384dy().m319k4().m68835du();
                if (iM68835du != 1) {
                    if (iM68835du == 2) {
                        nxmVar.m73208du(((m64459kp() / 2.0f) + fM64459kp2) - (nxmVar.m73225wy() / 2.0f));
                        float fM73034ne = (nxmVar.m68247c5() || m73026k4().m73386h4() % 90 != 0) ? m73034ne() : m73034ne() - m73024k4("...").m56697kk();
                        if (this.f46038m9) {
                            if (m73022ix() == 3) {
                                fM73034ne = (m73203ak() - fM73034ne) - nxmVar.m73203ak();
                            }
                        } else if (iM73376bv % 2 == 0) {
                            fM73034ne += nxmVar.m73203ak();
                        }
                        nxmVar.m73212h4(fM73034ne);
                        iM73376bv += m73026k4().m73376bv();
                    }
                    fM64459kp = nxmVar.m73225wy();
                } else {
                    fM64459kp = m64459kp();
                }
            } else {
                nxmVar.m73208du((m73026k4().m73386h4() >= 0 ? !m73021fa().m73026k4().m73384dy().isPlotOrderReversed() : m73021fa().m73026k4().m73384dy().isPlotOrderReversed()) ? (fM64459kp2 - nxmVar.m73225wy()) + m73019ck() : fM64459kp2 - m73019ck());
                int iM68835du2 = m73026k4().m73384dy().m319k4().m68835du();
                if (iM68835du2 != 1) {
                    if (iM68835du2 == 2) {
                        fM64459kp2 = (m64459kp() / 2.0f) + nxmVar.m73205bz();
                        fM64459kp = nxmVar.m73225wy();
                    }
                    if (nxmVar.m68247c5()) {
                    }
                    if (this.f46038m9) {
                    }
                    nxmVar.m73212h4(fM73034ne);
                    iM73376bv += m73026k4().m73376bv();
                } else {
                    fM73225wy = (nxmVar.m73225wy() / 2.0f) + (nxmVar.m73205bz() - (m64459kp() / 2.0f));
                    nxmVar.m73208du(fM73225wy);
                    if (nxmVar.m68247c5()) {
                    }
                    if (this.f46038m9) {
                    }
                    nxmVar.m73212h4(fM73034ne);
                    iM73376bv += m73026k4().m73376bv();
                }
            }
            fM73225wy = fM64459kp2 - (fM64459kp / 2.0f);
            nxmVar.m73208du(fM73225wy);
            if (nxmVar.m68247c5()) {
            }
            if (this.f46038m9) {
            }
            nxmVar.m73212h4(fM73034ne);
            iM73376bv += m73026k4().m73376bv();
        }
        m64448gi();
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64458k4(nxm nxmVar, C14713vw c14713vw) {
        C14713vw c14713vw2 = new C14713vw(m73026k4().m73423wy().m69867v4(), m73026k4().m73423wy().m69852lr());
        String strM68253jd = nxmVar.m68253jd();
        nxm nxmVar2 = new nxm(strM68253jd, this);
        m73215k4((AbstractC14770x9) nxmVar2);
        oju ojuVarClone = nxmVar2.m68258kk(c14713vw2).Clone();
        m73226x1(nxmVar2);
        if (ojuVarClone.f47837x1 <= c14713vw.m72556x1()) {
            return;
        }
        while (ojuVarClone.f47837x1 > c14713vw.m72556x1() && strM68253jd.length() > 1) {
            if (C14113y2.m67369h4(strM68253jd, ControlChar.SPACE_CHAR, '-').length > 1) {
                strM68253jd = C14113y2.m67443x1(strM68253jd, 0, C14113y2.m67418kk(strM68253jd, ControlChar.SPACE_CHAR) > C14113y2.m67418kk(strM68253jd, '-') ? C14113y2.m67418kk(strM68253jd, ControlChar.SPACE_CHAR) : C14113y2.m67418kk(strM68253jd, '-'));
            } else {
                strM68253jd = OooO0OO.OooO00o(1, 0, strM68253jd, strM68253jd);
            }
            nxm nxmVar3 = new nxm(C14113y2.m67407k4(strM68253jd, (char) 8230), this);
            m73215k4((AbstractC14770x9) nxmVar3);
            nxmVar3.m68258kk(c14713vw2).CloneTo(ojuVarClone);
            m73226x1(nxmVar3);
        }
        nxmVar.m68257k4(true);
        nxmVar.m68256k4((Object) C14113y2.m67407k4(strM68253jd, (char) 8230));
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73224wp();
        this.f46036c5 = false;
        if (m73032kk(c14713vw)) {
            m73222to(0.0f);
            m73217kk(0.0f);
            mo68927jd(c14713vw);
            m73033m9();
            if (m64453s7() && m73026k4().m73419up() == 0) {
                mo63967x1(false);
            }
            m73217kk(c14713vw.m72555k4());
            if (!ChartTypeCharacterizer.m767to(((AbstractC14763x3) this).f49908x1.get_Item(0).m64945h4().getType())) {
                m64455yj(c14713vw);
            }
            C12015qq c12015qqClone = mo64456ck(c14713vw).Clone();
            m68924ar();
            this.f46037dy = m73203ak();
            m73222to(m73203ak() + (this.f46036c5 ? (c12015qqClone.m56697kk() + m73034ne()) - m73024k4("...").m56697kk() : c12015qqClone.m56697kk() + m73034ne()));
            m73027k4(c12015qqClone.Clone());
            mo4962du(c14713vw);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m64449k4(float f, int i) {
        double dM67495m9 = C14116yg.m67495m9((float) (((double) C14116yg.m67482k4(i)) * 0.017453292519943295d)) * ((double) f);
        return ((ChartPlotArea) C7019kk.m27452k4((Object) m73026k4().m73423wy().m69834fa().getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated() ? dM67495m9 >= ((double) (m73030kk() * 0.9f)) : dM67495m9 >= ((double) m73030kk());
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m64450k4(C14713vw c14713vw, C12015qq c12015qq) {
        if (m73026k4().m73386h4() == 0 || c12015qq.m56697kk() <= c14713vw.m72556x1()) {
            return false;
        }
        List.Enumerator<nxm> it = ((AbstractC14763x3) this).f49904k4.iterator();
        while (it.hasNext()) {
            try {
                m64458k4(it.next(), c14713vw);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f46036c5 = true;
        return true;
    }
}
