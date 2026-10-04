package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7660fc;
import com.aspose.slides.internal.p332p7.C8538po;
import com.aspose.slides.internal.p332p7.C8547pt;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class np9 extends ywb {
    public np9(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: kk */
    private C8547pt m68150kk(IMasterTheme iMasterTheme) {
        C8547pt c8547pt = new C8547pt();
        c8547pt.m39119k4(iMasterTheme.getName());
        C0827bq.m4294x1(iMasterTheme.getColorScheme(), c8547pt.m39120kk().m36365k4());
        C0820bk.m4240x1(iMasterTheme.getFontScheme(), c8547pt.m39120kk().m36369x1());
        C14378r8.m70037k4(iMasterTheme.getFormatScheme(), c8547pt.m39120kk().m36367kk(), mo3468h4());
        if (iMasterTheme.getExtraColorSchemes().size() > 0) {
            final C8538po c8538poM39115k4 = c8547pt.m39115k4();
            IGenericEnumerator<IExtraColorScheme> it = iMasterTheme.getExtraColorSchemes().iterator();
            while (it.hasNext()) {
                try {
                    C0748ag.m3564k4(it.next(), new AbstractC4685kk<C7660fc>() { // from class: com.aspose.slides.np9.1
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(c8538poM39115k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_ColorSchemeListElementData.AddExtraClrScheme()";
                        }

                        @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                        public C7660fc invoke() {
                            return c8538poM39115k4.m39035k4();
                        }
                    });
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        m68152x1(iMasterTheme, c8547pt);
        return c8547pt;
    }

    /* JADX INFO: renamed from: x1 */
    private void m68151x1(IMasterTheme iMasterTheme) {
        C8547pt c8547pt = new C8547pt(m55443jd());
        m68149k4(iMasterTheme, c8547pt);
        iMasterTheme.setName(c8547pt.m39123x1());
        C0827bq.m4293k4(iMasterTheme.getColorScheme(), c8547pt.m39120kk().m36365k4());
        C0820bk.m4239k4(iMasterTheme.getFontScheme(), c8547pt.m39120kk().m36369x1());
        C14378r8.m70036k4(iMasterTheme.getFormatScheme(), c8547pt.m39120kk().m36367kk(), mo3471m9());
        if (c8547pt.m39113du() != null) {
            for (C7660fc c7660fc : c8547pt.m39113du().m39036x1()) {
                C0748ag.m3565k4(((ExtraColorSchemeCollection) iMasterTheme.getExtraColorSchemes()).m1435k4(iMasterTheme), c7660fc);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68153k4(IMasterTheme iMasterTheme) {
        mo55332up();
        m68150kk(iMasterTheme).mo6846k4(null, m55442ck(), "theme");
        mo55333yj();
    }

    public np9(C11791os c11791os, u8s u8sVar) {
        super(c11791os, u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68149k4(IMasterTheme iMasterTheme, C8547pt c8547pt) {
        duw duwVarM1959k4 = ((MasterTheme) iMasterTheme).m1959k4();
        duwVarM1959k4.m5252k4(c8547pt.m39122to());
        duwVarM1959k4.m5253k4(c8547pt.m39114h4());
        duwVarM1959k4.m5251k4(c8547pt.m39121m9());
        duwVarM1959k4.m5257x1(c8547pt.m39120kk().m36368to());
    }

    /* JADX INFO: renamed from: x1 */
    private static void m68152x1(IMasterTheme iMasterTheme, C8547pt c8547pt) {
        duw duwVarM1959k4 = ((MasterTheme) iMasterTheme).m1959k4();
        c8547pt.m39116k4(duwVarM1959k4.m5250k4());
        c8547pt.m39118k4(duwVarM1959k4.m5256x1());
        c8547pt.m39117k4(duwVarM1959k4.m5254kk());
        c8547pt.m39120kk().m36366k4(duwVarM1959k4.m5255to());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68154k4(IMasterThemeManager iMasterThemeManager) {
        if (mo3471m9().m6796up().containsKey(mo3467du())) {
            iMasterThemeManager.setOverrideTheme((IMasterTheme) mo3471m9().m6796up().get_Item(mo3467du()));
            return;
        }
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "theme".equals(m55443jd().mo65023fa())) {
                mo3471m9().m6790ks().throwIfInterruptionRequested();
                m68151x1(iMasterThemeManager.getOverrideTheme());
                mo3471m9().m6796up().addItem(mo3467du(), iMasterThemeManager.getOverrideTheme());
                iMasterThemeManager.setOverrideThemeEnabled(true);
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m68156x1(IMasterThemeManager iMasterThemeManager) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "theme".equals(m55443jd().mo65023fa())) {
                mo3471m9().m6790ks().throwIfInterruptionRequested();
                m68151x1(iMasterThemeManager.getOverrideTheme());
                iMasterThemeManager.setOverrideThemeEnabled(true);
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68155k4(IPresentation iPresentation) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "theme".equals(m55443jd().mo65023fa())) {
                m68151x1(iPresentation.getMasterTheme());
                mo3471m9().m6796up().addItem(mo3467du(), iPresentation.getMasterTheme());
            }
        }
        mo55330fa();
    }
}
