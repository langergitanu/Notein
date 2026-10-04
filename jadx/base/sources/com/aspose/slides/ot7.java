package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7414ck;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7447cx;
import com.aspose.slides.internal.p464vq.AbstractC11737em;
import com.aspose.slides.internal.p464vq.AbstractC11758j2;
import com.aspose.slides.internal.p464vq.AbstractC11840w6;
import com.aspose.slides.internal.p464vq.C11791os;

/* JADX INFO: loaded from: classes3.dex */
class ot7 extends AbstractC11737em {
    public ot7(C11791os c11791os, AbstractC11758j2 abstractC11758j2) {
        super(c11791os, abstractC11758j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static SlideShowSettings m68821k4(Presentation presentation, com.aspose.slides.internal.p332p7.k6v k6vVar) {
        SlideShowType browsedAtKiosk;
        SlideShowSettings slideShowSettings = new SlideShowSettings(presentation, k6vVar);
        C7394ca c7394caM35155m9 = slideShowSettings.f3404k4.m35155m9();
        if (c7394caM35155m9 == null) {
            browsedAtKiosk = PresentedBySpeaker.f3165k4;
        } else if (C7019kk.m27469x1(c7394caM35155m9.m29542x1(), com.aspose.slides.internal.p332p7.gz8.class)) {
            browsedAtKiosk = new BrowsedByIndividual((com.aspose.slides.internal.p332p7.gz8) c7394caM35155m9.m29542x1());
        } else if (C7019kk.m27469x1(c7394caM35155m9.m29542x1(), com.aspose.slides.internal.p332p7.wr8.class)) {
            browsedAtKiosk = new BrowsedAtKiosk((com.aspose.slides.internal.p332p7.wr8) c7394caM35155m9.m29542x1());
        }
        slideShowSettings.setSlideShowType(browsedAtKiosk);
        C7394ca c7394caM35146dy = slideShowSettings.f3404k4.m35146dy();
        if (c7394caM35146dy != null && C7019kk.m27469x1(c7394caM35146dy.m29542x1(), com.aspose.slides.internal.p332p7.a9h.class)) {
            com.aspose.slides.internal.p332p7.a9h a9hVar = (com.aspose.slides.internal.p332p7.a9h) c7394caM35146dy.m29542x1();
            slideShowSettings.setSlides(new SlidesRange());
            slideShowSettings.getSlides().setStart(a9hVar.m28055k4());
            slideShowSettings.getSlides().setEnd(a9hVar.m28057x1());
        }
        C1246ib.m7611k4(slideShowSettings.getPenColor(), k6vVar == null ? null : k6vVar.m35144c5());
        slideShowSettings.setShowMediaControls(true);
        com.aspose.slides.internal.p332p7.zgi zgiVarM28397k4 = com.aspose.slides.internal.p332p7.ap3.m28397k4(slideShowSettings.f3404k4.m35148jd());
        if (zgiVarM28397k4 != null) {
            slideShowSettings.setShowMediaControls(zgiVarM28397k4.m45615k4());
        }
        return slideShowSettings;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m68824x1(Presentation presentation) {
        mo55332up();
        pzs pzsVarM68399x6 = presentation.m2351fa().m68399x6();
        if (pzsVarM68399x6 == null) {
            pzsVarM68399x6 = new pzs();
            presentation.m2351fa().m68375k4(pzsVarM68399x6);
        }
        com.aspose.slides.internal.p332p7.ghm ghmVar = new com.aspose.slides.internal.p332p7.ghm();
        SlideShowSettings slideShowSettings = presentation.getSlideShowSettings();
        m68822k4(slideShowSettings);
        ghmVar.m32545k4(slideShowSettings.f3404k4);
        AbstractC7414ck abstractC7414ckM32546kk = ghmVar.m32546kk();
        if (abstractC7414ckM32546kk == null) {
            abstractC7414ckM32546kk = ghmVar.m32544k4();
        }
        com.aspose.slides.internal.p332p7.mai.m36741k4(abstractC7414ckM32546kk, pzsVarM68399x6.m69346k4());
        com.aspose.slides.internal.p332p7.mai.m36740k4(abstractC7414ckM32546kk, pzsVarM68399x6.m69348x1());
        com.aspose.slides.internal.p332p7.mai.m36750x1(abstractC7414ckM32546kk, pzsVarM68399x6.m69347kk());
        com.aspose.slides.internal.p332p7.mai.m36744kk(abstractC7414ckM32546kk, presentation.getProtectionManager().getReadOnlyRecommended());
        ghmVar.mo6846k4(null, m55442ck(), "presentationPr");
        mo55333yj();
    }

    public ot7(C11791os c11791os, AbstractC11840w6 abstractC11840w6) {
        super(c11791os, abstractC11840w6);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68823k4(Presentation presentation) {
        mo3469k4(new String[0]);
        com.aspose.slides.internal.p332p7.ghm ghmVar = null;
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "presentationPr".equals(m55443jd().mo65023fa())) {
                pzs pzsVarM68399x6 = presentation.m2351fa().m68399x6();
                if (pzsVarM68399x6 == null) {
                    pzsVarM68399x6 = new pzs();
                    presentation.m2351fa().m68375k4(pzsVarM68399x6);
                }
                com.aspose.slides.internal.p332p7.ghm ghmVar2 = new com.aspose.slides.internal.p332p7.ghm(m55443jd());
                com.aspose.slides.internal.p332p7.ggf ggfVarM36737k4 = com.aspose.slides.internal.p332p7.mai.m36737k4(ghmVar2.m32546kk());
                com.aspose.slides.internal.p332p7.n6c n6cVarM36748x1 = com.aspose.slides.internal.p332p7.mai.m36748x1(ghmVar2.m32546kk());
                com.aspose.slides.internal.p332p7.svz svzVarM36742kk = com.aspose.slides.internal.p332p7.mai.m36742kk(ghmVar2.m32546kk());
                com.aspose.slides.internal.p332p7.dki dkiVarM36745to = com.aspose.slides.internal.p332p7.mai.m36745to(ghmVar2.m32546kk());
                if (ggfVarM36737k4 != null) {
                    pzsVarM68399x6.m69345k4(ggfVarM36737k4.m32517k4());
                }
                if (n6cVarM36748x1 != null) {
                    pzsVarM68399x6.m69344k4(n6cVarM36748x1.m37254k4());
                }
                if (svzVarM36742kk != null) {
                    pzsVarM68399x6.m69349x1(svzVarM36742kk.m41367k4());
                }
                if (dkiVarM36745to != null) {
                    presentation.getProtectionManager().setReadOnlyRecommended(dkiVarM36745to.m30395k4());
                }
                ghmVar = ghmVar2;
            }
        }
        presentation.m2362k4(m68821k4(presentation, ghmVar != null ? ghmVar.m32547x1() : null));
        mo55330fa();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68822k4(SlideShowSettings slideShowSettings) {
        C7394ca c7394ca;
        C7394ca c7394caM35146dy;
        com.aspose.slides.internal.p332p7.k6v k6vVar = slideShowSettings.f3404k4;
        SlideShowType slideShowType = slideShowSettings.getSlideShowType();
        if (C7019kk.m27469x1(slideShowType, BrowsedByIndividual.class)) {
            com.aspose.slides.internal.p332p7.gz8 gz8Var = new com.aspose.slides.internal.p332p7.gz8();
            gz8Var.m33005k4(((BrowsedByIndividual) slideShowType).getShowScrollbar());
            c7394ca = new C7394ca("browse", gz8Var);
        } else if (C7019kk.m27469x1(slideShowType, BrowsedAtKiosk.class)) {
            com.aspose.slides.internal.p332p7.wr8 wr8Var = ((BrowsedAtKiosk) slideShowType).f1233k4;
            if (wr8Var == null) {
                wr8Var = new com.aspose.slides.internal.p332p7.wr8();
            }
            c7394ca = new C7394ca("kiosk", wr8Var);
        } else {
            c7394ca = new C7394ca("present", new com.aspose.slides.internal.p332p7.qu9());
        }
        k6vVar.m35150k4(c7394ca);
        if (slideShowSettings.getSlides() != null) {
            com.aspose.slides.internal.p332p7.a9h a9hVar = new com.aspose.slides.internal.p332p7.a9h();
            a9hVar.m28056k4(slideShowSettings.getSlides().getStart());
            a9hVar.m28058x1(slideShowSettings.getSlides().getEnd());
            c7394caM35146dy = new C7394ca("sldRg", a9hVar);
        } else {
            c7394caM35146dy = k6vVar.m35146dy();
        }
        k6vVar.m35159x1(c7394caM35146dy);
        IColorFormat penColor = slideShowSettings.getPenColor();
        if (penColor.getColorType() != -1) {
            if (k6vVar.m35144c5() == null) {
                k6vVar.m35149k4();
            }
            C1246ib.m7612x1(penColor, k6vVar.m35144c5());
        } else {
            k6vVar.m35151k4((C7447cx) null);
        }
        AbstractC7414ck abstractC7414ckM35148jd = k6vVar.m35148jd();
        if (abstractC7414ckM35148jd == null) {
            abstractC7414ckM35148jd = k6vVar.m35158x1();
        }
        com.aspose.slides.internal.p332p7.ap3.m28399k4(abstractC7414ckM35148jd, slideShowSettings.getShowMediaControls());
    }
}
