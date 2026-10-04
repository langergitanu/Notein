package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: loaded from: classes3.dex */
final class fuq implements IThemeEffectiveData, InterfaceC14398rk {

    /* JADX INFO: renamed from: m9 */
    private static final fuq f5128m9 = m6301du();

    /* JADX INFO: renamed from: du */
    private FontScheme f5129du;

    /* JADX INFO: renamed from: h4 */
    private long f5130h4;

    /* JADX INFO: renamed from: k4 */
    private final Theme f5131k4;

    /* JADX INFO: renamed from: kk */
    private final C13744kr f5132kk;

    /* JADX INFO: renamed from: to */
    private final C0874cy f5133to;

    /* JADX INFO: renamed from: x1 */
    private final C14870z2 f5134x1;

    public fuq() {
        this.f5131k4 = null;
        this.f5130h4 = 4294967295L;
        MasterTheme masterTheme = new MasterTheme(null);
        hy0.m7330k4(masterTheme);
        this.f5134x1 = new C14870z2((ColorScheme) masterTheme.getColorScheme());
        this.f5133to = new C0874cy((FormatScheme) masterTheme.getFormatScheme());
        FontScheme fontScheme = (FontScheme) masterTheme.getFontScheme();
        this.f5132kk = new C13744kr(fontScheme);
        if (fontScheme != null) {
            this.f5129du = fontScheme;
        }
    }

    /* JADX INFO: renamed from: du */
    private static fuq m6301du() {
        return new fuq();
    }

    @Override // com.aspose.slides.IThemeEffectiveData
    public final IColorSchemeEffectiveData getColorScheme(Integer num) {
        return m6304k4(C12003du.m56401k4(num));
    }

    @Override // com.aspose.slides.IThemeEffectiveData
    public final IFontSchemeEffectiveData getFontScheme() {
        return this.f5132kk;
    }

    @Override // com.aspose.slides.IThemeEffectiveData
    public final IFormatSchemeEffectiveData getFormatScheme() {
        return this.f5133to;
    }

    /* JADX INFO: renamed from: k4 */
    public final FontScheme m6303k4() {
        return this.f5129du;
    }

    @Override // com.aspose.slides.InterfaceC14398rk
    /* JADX INFO: renamed from: kk */
    public final long mo4607kk() {
        return this.f5130h4;
    }

    /* JADX INFO: renamed from: to */
    public final xxf m6309to(IBaseSlide iBaseSlide, int i, ColorFormat colorFormat) {
        if (i == 0) {
            return null;
        }
        return new xxf((skr) this.f5133to.m4887x1(colorFormat.m1086x1(iBaseSlide).m69339k4().Clone()).get_Item(i - 1), colorFormat.m1086x1(iBaseSlide));
    }

    /* JADX INFO: renamed from: x1 */
    public final fpw m6311x1(long j) {
        if ((4294967295L & j) == 0) {
            return null;
        }
        return (fpw) this.f5133to.f4512to.get_Item(((int) j) - 1).getThreeDFormat();
    }

    public fuq(Theme theme) {
        this.f5131k4 = theme;
        this.f5130h4 = 4294967295L;
        this.f5134x1 = new C14870z2();
        this.f5132kk = new C13744kr();
        this.f5133to = new C0874cy();
    }

    /* JADX INFO: renamed from: k4 */
    public IColorSchemeEffectiveData m6304k4(C12003du c12003du) {
        return this.f5134x1;
    }

    /* JADX INFO: renamed from: kk */
    public final C0888da m6308kk(IBaseSlide iBaseSlide, int i, ColorFormat colorFormat) {
        int i2;
        if (i > 0) {
            if (i > this.f5133to.f4513x1.size()) {
                return null;
            }
            C14321pz c14321pzM1086x1 = colorFormat.m1086x1(iBaseSlide);
            return new C0888da((C14176nc) this.f5133to.m4881k4(c14321pzM1086x1.m69339k4().Clone()).get_Item(i - 1), c14321pzM1086x1);
        }
        if (i >= 0 || (i2 = -i) > this.f5133to.f4509du.size()) {
            return null;
        }
        C14321pz c14321pzM1086x12 = colorFormat.m1086x1(iBaseSlide);
        return new C0888da((C14176nc) this.f5133to.m4886to(c14321pzM1086x12.m69339k4().Clone()).get_Item(i2 - 1), c14321pzM1086x12);
    }

    /* JADX INFO: renamed from: to */
    public final void m6310to() {
        Theme theme = this.f5131k4;
        if (theme != null) {
            fuq fuqVarM6302k4 = m6302k4(theme);
            long version = (this.f5131k4.getVersion() & 4294967295L) + (fuqVarM6302k4.mo4607kk() & 4294967295L);
            long j = version & 4294967295L;
            if ((version & 4294967295L) != (4294967295L & this.f5130h4)) {
                this.f5129du = fuqVarM6302k4.f5129du;
                this.f5134x1.m74205k4(fuqVarM6302k4.f5134x1, (ColorScheme) this.f5131k4.getColorScheme());
                this.f5133to.mo4883k4((InterfaceC14672vc) fuqVarM6302k4.f5133to, (FormatScheme) this.f5131k4.getFormatScheme());
                FontScheme fontScheme = (FontScheme) this.f5131k4.getFontScheme();
                this.f5132kk.m64130k4(fuqVarM6302k4.f5132kk, fontScheme);
                if (fontScheme != null) {
                    this.f5129du = fontScheme;
                }
            }
            this.f5130h4 = j;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final skr m6312x1(int i) {
        if (i == 0) {
            return null;
        }
        return (skr) this.f5133to.f4511kk.get_Item(i - 1);
    }

    /* JADX INFO: renamed from: k4 */
    private static fuq m6302k4(Theme theme) {
        IMasterThemeable masterSlide;
        IPresentation presentation;
        IMasterThemeManager themeManager;
        IPresentationComponent masterTheme;
        IPresentationComponent parent_IPresentationComponent = theme.getParent_IPresentationComponent();
        if (C7019kk.m27469x1(parent_IPresentationComponent, Chart.class)) {
            IThemeManager iThemeManagerM402m9 = ((BaseSlide) ((Chart) C7019kk.m27452k4((Object) parent_IPresentationComponent, Chart.class)).getSlide()).m402m9();
            if (C7019kk.m27469x1(iThemeManagerM402m9, MasterThemeManager.class)) {
                masterTheme = ((MasterThemeManager) iThemeManagerM402m9).getOverrideTheme();
            } else {
                if (!C7019kk.m27469x1(iThemeManagerM402m9, BaseOverrideThemeManager.class)) {
                    throw new NotImplementedException("Unknown theme manager type.");
                }
                masterTheme = ((BaseOverrideThemeManager) iThemeManagerM402m9).getOverrideTheme();
            }
        } else if (C7019kk.m27469x1(parent_IPresentationComponent, Slide.class)) {
            Slide slide = (Slide) C7019kk.m27452k4((Object) parent_IPresentationComponent, Slide.class);
            if (slide.getLayoutSlide() != null && slide.getLayoutSlide().getThemeManager().isOverrideThemeEnabled()) {
                masterTheme = slide.getLayoutSlide().getThemeManager().getOverrideTheme();
            } else if (slide.m2713v4() == null || !slide.m2713v4().getThemeManager().isOverrideThemeEnabled()) {
                presentation = slide.getPresentation();
                masterTheme = presentation.getMasterTheme();
            } else {
                masterSlide = slide.m2713v4();
                themeManager = masterSlide.getThemeManager();
                masterTheme = themeManager.getOverrideTheme();
            }
        } else if (C7019kk.m27469x1(parent_IPresentationComponent, NotesSlide.class)) {
            NotesSlide notesSlide = (NotesSlide) C7019kk.m27452k4((Object) parent_IPresentationComponent, NotesSlide.class);
            MasterSlide masterSlideM409yj = notesSlide.m409yj();
            if (masterSlideM409yj != null) {
                themeManager = masterSlideM409yj.getThemeManager();
                masterTheme = themeManager.getOverrideTheme();
            } else {
                if (notesSlide.getPresentation().getMasterNotesSlideManager().getMasterNotesSlide().getThemeManager().isOverrideThemeEnabled()) {
                    masterSlide = notesSlide.getPresentation().getMasterNotesSlideManager().getMasterNotesSlide();
                    themeManager = masterSlide.getThemeManager();
                    masterTheme = themeManager.getOverrideTheme();
                }
                presentation = parent_IPresentationComponent.getPresentation();
                masterTheme = presentation.getMasterTheme();
            }
        } else {
            if (C7019kk.m27469x1(parent_IPresentationComponent, LayoutSlide.class)) {
                LayoutSlide layoutSlide = (LayoutSlide) C7019kk.m27452k4((Object) parent_IPresentationComponent, LayoutSlide.class);
                if (layoutSlide.getMasterSlide().getThemeManager().isOverrideThemeEnabled()) {
                    masterSlide = layoutSlide.getMasterSlide();
                    themeManager = masterSlide.getThemeManager();
                    masterTheme = themeManager.getOverrideTheme();
                }
            } else {
                if (!C7019kk.m27469x1(parent_IPresentationComponent, MasterSlide.class) && !C7019kk.m27469x1(parent_IPresentationComponent, MasterNotesSlide.class) && !C7019kk.m27469x1(parent_IPresentationComponent, MasterHandoutSlide.class)) {
                    if (C7019kk.m27469x1(parent_IPresentationComponent, Presentation.class)) {
                        return f5128m9;
                    }
                    throw new NotImplementedException();
                }
                if (!C7019kk.m27469x1(((InterfaceC14397rj) parent_IPresentationComponent.getPresentation().getMasterTheme()).getParent_Immediate(), Presentation.class)) {
                    return f5128m9;
                }
            }
            presentation = parent_IPresentationComponent.getPresentation();
            masterTheme = presentation.getMasterTheme();
        }
        return ((Theme) masterTheme).m2997x1();
    }

    /* JADX INFO: renamed from: x1 */
    public final skr m6313x1(IBaseSlide iBaseSlide, int i, ColorFormat colorFormat) {
        xxf xxfVarM6309to = m6309to(iBaseSlide, i, colorFormat);
        if (xxfVarM6309to != null) {
            return (skr) C7019kk.m27452k4((Object) xxfVarM6309to.f50226k4, skr.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14176nc m6305k4(int i) {
        C0927e5 c0927e5;
        if (i == 0) {
            return null;
        }
        if (i <= 0) {
            i = -i;
            if (i > this.f5133to.f4509du.size()) {
                return null;
            }
            c0927e5 = this.f5133to.f4509du;
        } else {
            if (i > this.f5133to.f4513x1.size()) {
                return null;
            }
            c0927e5 = this.f5133to.f4513x1;
        }
        return (C14176nc) c0927e5.get_Item(i - 1);
    }

    /* JADX INFO: renamed from: x1 */
    public final C14870z2 m6314x1() {
        return this.f5134x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14176nc m6306k4(IBaseSlide iBaseSlide, int i, ColorFormat colorFormat) {
        C0888da c0888daM6308kk = m6308kk(iBaseSlide, i, colorFormat);
        if (c0888daM6308kk != null) {
            return (C14176nc) C7019kk.m27452k4((Object) c0888daM6308kk.f4563k4, C14176nc.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14754wx m6307k4(long j) {
        if ((4294967295L & j) == 0) {
            return null;
        }
        return (C14754wx) this.f5133to.f4512to.get_Item(((int) j) - 1).getEffectFormat();
    }
}
