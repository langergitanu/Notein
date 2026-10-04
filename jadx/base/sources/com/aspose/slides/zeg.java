package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class zeg extends AbstractC14353qn {
    public zeg(C14237oh c14237oh, C0974f2 c0974f2) {
        super(c14237oh, c0974f2);
    }

    /* JADX INFO: renamed from: k4 */
    private void m74497k4(C12015qq c12015qq, float f, float f2) {
        if (m69711x1() != null) {
            m69711x1().m73210fa(new C14713vw(c12015qq.m56699x1(), f / 2.0f));
        }
        if (m69706k4() != null) {
            m69706k4().m73210fa(new C14713vw(f2 / 2.0f, c12015qq.m56697kk()));
        }
        if (m69710to() != null) {
            m69710to().m73210fa(new C14713vw(c12015qq.m56699x1(), f / 2.0f));
        }
        if (m69708kk() != null) {
            m69708kk().m73210fa(new C14713vw(f2 / 2.0f, c12015qq.m56697kk()));
        }
        if (m69709m9().m68552dy() != null) {
            m69709m9().m68552dy().m73210fa(new C14713vw(c12015qq.m56699x1(), c12015qq.m56697kk()));
        }
        if (m69709m9().m68548c5() != null) {
            m69709m9().m68548c5().m73210fa(new C14713vw(m69709m9().m68552dy().m73225wy(), m69709m9().m68552dy().m73203ak() / 2.0f));
        }
        if (m69709m9().m68555jd() != null) {
            m69709m9().m68555jd().m73210fa(new C14713vw(m69709m9().m68552dy().m73225wy(), m69709m9().m68552dy().m73203ak() / 2.0f));
        }
    }

    @Override // com.aspose.slides.AbstractC14353qn
    /* JADX INFO: renamed from: k4 */
    public void mo3141k4(C14713vw c14713vw) {
        C12025x6 c12025x6 = new C12025x6();
        C12015qq c12015qq = new C12015qq();
        C12025x6[] c12025x6Arr = {c12025x6};
        C12015qq[] c12015qqArr = {c12015qq};
        m69705h4().m5807k4(m69704du().getPlotArea(), c12025x6Arr, c12015qqArr);
        c12025x6Arr[0].CloneTo(c12025x6);
        c12015qqArr[0].CloneTo(c12015qq);
        m74497k4(c12015qq.Clone(), c14713vw.m72556x1(), c14713vw.m72555k4());
        c12025x6Arr[0] = c12025x6;
        c12015qqArr[0] = c12015qq;
        m69705h4().m5807k4(m69704du().getPlotArea(), c12025x6Arr, c12015qqArr);
        c12025x6Arr[0].CloneTo(c12025x6);
        c12015qqArr[0].CloneTo(c12015qq);
        m74497k4(c12015qq.Clone(), c14713vw.m72556x1(), c14713vw.m72555k4());
    }

    @Override // com.aspose.slides.AbstractC14353qn
    /* JADX INFO: renamed from: k4 */
    public void mo3142k4(C12025x6[] c12025x6Arr, C12015qq[] c12015qqArr) {
        float f = m69705h4().f4955k4;
        float fM68556k4 = 0.0f;
        float fM67481k4 = C14116yg.m67481k4(m69709m9().m68558kk(1), ((m69709m9().m68561to() == null || !m69709m9().m68561to().mo3221T_()) && (m69709m9().m68554h4() == null || !m69709m9().m68554h4().mo3221T_())) ? 0.0f : m69709m9().m68556k4(1) + f);
        float fM68558kk = m69709m9().m68558kk(2);
        if ((m69711x1() != null && m69711x1().mo3221T_()) || (m69710to() != null && m69710to().mo3221T_())) {
            fM68556k4 = m69709m9().m68556k4(2) + f;
        }
        m69707k4(c12025x6Arr, c12015qqArr, fM67481k4, C14116yg.m67481k4(fM68558kk, fM68556k4), C14116yg.m67481k4(m69709m9().m68558kk(3), m69709m9().m68556k4(3)), C14116yg.m67481k4(m69709m9().m68558kk(0), m69709m9().m68556k4(0)));
    }
}
