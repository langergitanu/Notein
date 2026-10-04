package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C8897tu;
import com.aspose.slides.internal.p464vq.C11791os;

/* JADX INFO: loaded from: classes3.dex */
class q7e extends C14665v6 {
    public q7e(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69457k4(ILayoutSlide iLayoutSlide) {
        mo55332up();
        C8897tu c8897tu = new C8897tu();
        mo3468h4().m71548kk().addItem(iLayoutSlide, mo3467du());
        m72079k4(iLayoutSlide.getShapes(), m72080x1());
        ktl.m64163k4(iLayoutSlide, c8897tu, m72080x1());
        c8897tu.mo6846k4(null, m55442ck(), "sldLayout");
        mo55333yj();
    }

    public q7e(C11791os c11791os, u8s u8sVar, IBaseSlide iBaseSlide) {
        super(c11791os, u8sVar, iBaseSlide);
    }

    /* JADX INFO: renamed from: k4 */
    private void m69456k4(ILayoutSlide iLayoutSlide, C8897tu c8897tu) {
        tgu tguVarM1849x6 = ((LayoutSlide) iLayoutSlide).m1849x6();
        if (c8897tu.m41940yj() != null) {
            tguVarM1849x6.m5304k4(c8897tu.m41940yj());
            C13670j2.m63196k4(iLayoutSlide.getTimeline(), c8897tu.m41940yj(), new yqd(m72077k4().m4229k4(), m72077k4().m4237to()));
            tguVarM1849x6.m5305k4(c8897tu.m41940yj().m31098to());
            tguVarM1849x6.m5303k4(c8897tu.m41940yj().m31092du());
        }
        C14189nn.m68099k4(tguVarM1849x6.m71155ck(), c8897tu.m41932ks());
        tguVarM1849x6.m71162to(c8897tu.m41934rv());
        tguVarM1849x6.m71160k4(c8897tu.m41923h4());
        tguVarM1849x6.m71159k4(c8897tu.m41933m9());
        tguVarM1849x6.m71164x1(c8897tu.m41918c5());
        tguVarM1849x6.m71161kk(c8897tu.m41924jd());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69458k4(IMasterSlide iMasterSlide, ILayoutSlide[] iLayoutSlideArr) {
        mo3469k4(new String[0]);
        iLayoutSlideArr[0] = null;
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "sldLayout".equals(m55443jd().mo65023fa())) {
                C8897tu c8897tu = new C8897tu(m55443jd());
                ILayoutSlide iLayoutSlideMo1945k4 = ((MasterSlide) iMasterSlide).m1944x6().f49885k4.mo1945k4(c8897tu.m41921dy());
                iLayoutSlideArr[0] = iLayoutSlideMo1945k4;
                C14349qj.m69671k4(iLayoutSlideMo1945k4.getThemeManager(), c8897tu.m41922fa());
                C14576tt.m71303k4(iLayoutSlideArr[0].getThemeManager(), mo3471m9());
                C14869z1.m74188k4(iLayoutSlideArr[0], c8897tu.m41919ck(), m72077k4());
                qas.m69498k4(iLayoutSlideArr[0].getSlideShowTransition(), c8897tu.m41937up(), mo3471m9());
                iLayoutSlideArr[0].setShowMasterShapes(c8897tu.m41920du());
                m69456k4(iLayoutSlideArr[0], c8897tu);
            }
        }
        mo55330fa();
    }
}
