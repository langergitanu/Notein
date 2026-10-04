package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C7736g8;
import com.aspose.slides.internal.p464vq.C11791os;

/* JADX INFO: renamed from: com.aspose.slides.cp */
/* JADX INFO: loaded from: classes3.dex */
class C0863cp extends C14665v6 {
    public C0863cp(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4711k4(IMasterHandoutSlide iMasterHandoutSlide) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "handoutMaster".equals(m55443jd().mo65023fa())) {
                C7736g8 c7736g8 = new C7736g8(m55443jd());
                C14869z1.m74188k4(iMasterHandoutSlide, c7736g8.m32348k4(), m72077k4());
                C14349qj.m69670k4(iMasterHandoutSlide.getThemeManager(), c7736g8.m32353x1());
                m4709k4(iMasterHandoutSlide, c7736g8);
                m72078k4(iMasterHandoutSlide.getThemeManager());
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m4712x1(IMasterHandoutSlide iMasterHandoutSlide) {
        mo55332up();
        C7736g8 c7736g8 = new C7736g8();
        mo3468h4().m71548kk().addItem(iMasterHandoutSlide, mo3467du());
        C14869z1.m74189k4(iMasterHandoutSlide, c7736g8.m32348k4(), m72080x1());
        C14349qj.m69675x1(iMasterHandoutSlide.getThemeManager(), c7736g8.m32353x1());
        m4710x1(iMasterHandoutSlide, c7736g8);
        c7736g8.mo6846k4(null, m55442ck(), "handoutMaster");
        mo55333yj();
    }

    public C0863cp(C11791os c11791os, u8s u8sVar, IBaseSlide iBaseSlide) {
        super(c11791os, u8sVar, iBaseSlide);
    }

    /* JADX INFO: renamed from: k4 */
    private void m4709k4(IMasterHandoutSlide iMasterHandoutSlide, C7736g8 c7736g8) {
        g4c g4cVarM1930x6 = ((MasterHandoutSlide) iMasterHandoutSlide).m1930x6();
        g4cVarM1930x6.m6431k4(c7736g8.m32351kk());
        g4cVarM1930x6.m6432to(c7736g8.m32352to());
    }

    /* JADX INFO: renamed from: x1 */
    private void m4710x1(IMasterHandoutSlide iMasterHandoutSlide, C7736g8 c7736g8) {
        g4c g4cVarM1930x6 = ((MasterHandoutSlide) iMasterHandoutSlide).m1930x6();
        c7736g8.m32350k4(g4cVarM1930x6.m6430dy());
        c7736g8.m32349k4(g4cVarM1930x6.m6429c5());
    }
}
