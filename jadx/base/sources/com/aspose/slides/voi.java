package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7342bs;
import com.aspose.slides.internal.p332p7.C8345ni;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11831uw;

/* JADX INFO: loaded from: classes3.dex */
class voi extends C14665v6 {
    public voi(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72397k4(IMasterNotesSlide iMasterNotesSlide) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "notesMaster".equals(m55443jd().mo65023fa())) {
                C7342bs c7342bs = new C7342bs(m55443jd());
                C14349qj.m69670k4(iMasterNotesSlide.getThemeManager(), c7342bs.m29099kk());
                m72078k4(iMasterNotesSlide.getThemeManager());
                if (!iMasterNotesSlide.getThemeManager().isOverrideThemeEnabled()) {
                    iMasterNotesSlide.getThemeManager().setOverrideTheme(new MasterTheme((InterfaceC14397rj) iMasterNotesSlide.getPresentation()));
                    m72396x1(iMasterNotesSlide.getThemeManager());
                }
                C14869z1.m74188k4(iMasterNotesSlide, c7342bs.m29101x1(), m72077k4());
                iq8.m63054k4(iMasterNotesSlide.getNotesStyle(), c7342bs.m29094du(), mo3471m9());
                m72394k4(iMasterNotesSlide, c7342bs);
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m72398x1(IMasterNotesSlide iMasterNotesSlide) {
        mo55332up();
        final C7342bs c7342bs = new C7342bs();
        mo3468h4().m71548kk().addItem(iMasterNotesSlide, mo3467du());
        C14869z1.m74189k4(iMasterNotesSlide, c7342bs.m29101x1(), m72080x1());
        C14349qj.m69675x1(iMasterNotesSlide.getThemeManager(), c7342bs.m29099kk());
        iq8.m63053k4(iMasterNotesSlide.getNotesStyle(), new AbstractC4685kk<C8345ni>() { // from class: com.aspose.slides.voi.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7342bs) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.NotesMasterElementData.AddNotesStyle()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8345ni invoke() {
                return c7342bs.m29096k4();
            }
        }, mo3468h4());
        m72395x1(iMasterNotesSlide, c7342bs);
        c7342bs.mo6846k4(null, m55442ck(), "notesMaster");
        mo55333yj();
    }

    public voi(C11791os c11791os, u8s u8sVar, IBaseSlide iBaseSlide) {
        super(c11791os, u8sVar, iBaseSlide);
    }

    /* JADX INFO: renamed from: k4 */
    private void m72394k4(IMasterNotesSlide iMasterNotesSlide, C7342bs c7342bs) {
        wun wunVarM1933x6 = ((MasterNotesSlide) iMasterNotesSlide).m1933x6();
        wunVarM1933x6.m72933k4(c7342bs.m29100to());
        wunVarM1933x6.m72934to(c7342bs.m29095h4());
    }

    /* JADX INFO: renamed from: x1 */
    private void m72395x1(IMasterNotesSlide iMasterNotesSlide, C7342bs c7342bs) {
        wun wunVarM1933x6 = ((MasterNotesSlide) iMasterNotesSlide).m1933x6();
        c7342bs.m29098k4(wunVarM1933x6.m72932dy());
        c7342bs.m29097k4(wunVarM1933x6.m72931c5());
    }

    /* JADX INFO: renamed from: x1 */
    private void m72396x1(IMasterThemeManager iMasterThemeManager) {
        C11709bg[] c11709bgArrM55309k4 = mo3471m9().m55338u4().m55309k4(C11831uw.f39896k4);
        if (c11709bgArrM55309k4.length > 0) {
            new np9(c11709bgArrM55309k4[0].m55296x1(), mo3471m9()).m68156x1(iMasterThemeManager);
        }
    }
}
