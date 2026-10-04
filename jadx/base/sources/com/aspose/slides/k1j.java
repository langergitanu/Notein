package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C9212xl;
import com.aspose.slides.internal.p464vq.C11791os;

/* JADX INFO: loaded from: classes3.dex */
class k1j extends ywb {
    public k1j(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63593k4(IOverrideTheme iOverrideTheme) {
        mo55332up();
        C9212xl c9212xl = new C9212xl();
        if (iOverrideTheme.getColorScheme() != null) {
            C0827bq.m4294x1(iOverrideTheme.getColorScheme(), c9212xl.m44475k4());
        }
        if (iOverrideTheme.getFontScheme() != null) {
            C0820bk.m4240x1(iOverrideTheme.getFontScheme(), c9212xl.m44478x1());
        }
        if (iOverrideTheme.getFormatScheme() != null) {
            C14378r8.m70037k4(iOverrideTheme.getFormatScheme(), c9212xl.m44476kk(), mo3468h4());
        }
        c9212xl.mo6846k4(null, m55442ck(), "themeOverride");
        mo55333yj();
    }

    public k1j(C11791os c11791os, u8s u8sVar) {
        super(c11791os, u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63594k4(IOverrideThemeManager iOverrideThemeManager) {
        if (mo3471m9().m6796up().containsKey(mo3467du())) {
            iOverrideThemeManager.setOverrideTheme((IOverrideTheme) mo3471m9().m6796up().get_Item(mo3467du()));
            mo3467du().m55422k4(true);
            return;
        }
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "themeOverride".equals(m55443jd().mo65023fa())) {
                C9212xl c9212xl = new C9212xl(m55443jd());
                IOverrideTheme overrideTheme = iOverrideThemeManager.getOverrideTheme();
                mo3471m9().m6796up().addItem(mo3467du(), overrideTheme);
                if (c9212xl.m44477to() != null) {
                    ((OverrideTheme) overrideTheme).initColorScheme();
                    C0827bq.m4293k4(overrideTheme.getColorScheme(), c9212xl.m44477to());
                }
                if (c9212xl.m44473du() != null) {
                    ((OverrideTheme) overrideTheme).initFontScheme();
                    C0820bk.m4239k4(overrideTheme.getFontScheme(), c9212xl.m44473du());
                }
                if (c9212xl.m44474h4() != null) {
                    ((OverrideTheme) overrideTheme).initFormatScheme();
                    C14378r8.m70036k4(overrideTheme.getFormatScheme(), c9212xl.m44474h4(), mo3471m9());
                }
            }
        }
        mo55330fa();
    }
}
