package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class MasterThemeManager extends BaseThemeManager implements IMasterThemeManager {

    /* JADX INFO: renamed from: kk */
    private boolean f2714kk;

    /* JADX INFO: renamed from: x1 */
    private MasterTheme f2715x1;

    public MasterThemeManager(BaseSlide baseSlide) {
        super(baseSlide);
        this.f2715x1 = new MasterTheme(this);
        m423to().m63293k4(true);
    }

    /* JADX INFO: renamed from: du */
    private IMasterTheme m1961du() {
        return m1964x1().getPresentation().getMasterTheme();
    }

    /* JADX INFO: renamed from: h4 */
    private C13682je m1962h4() {
        return BaseThemeManager.f1088k4;
    }

    @Override // com.aspose.slides.IThemeManager
    public final void applyColorScheme(IExtraColorScheme iExtraColorScheme) {
        ((ColorScheme) this.f2715x1.getColorScheme()).m1128k4((ColorScheme) iExtraColorScheme.getColorScheme());
        m423to().m63292k4(((ExtraColorScheme) iExtraColorScheme).m1427k4());
    }

    @Override // com.aspose.slides.IThemeManager
    public final IThemeEffectiveData createThemeEffective() {
        return this.f2715x1.getEffective();
    }

    @Override // com.aspose.slides.IMasterThemeManager
    public final IMasterTheme getOverrideTheme() {
        return this.f2715x1;
    }

    @Override // com.aspose.slides.IMasterThemeManager
    public final boolean isOverrideThemeEnabled() {
        return this.f2714kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final IMasterTheme m1963k4() {
        return isOverrideThemeEnabled() ? getOverrideTheme() : m1961du();
    }

    @Override // com.aspose.slides.BaseThemeManager
    /* JADX INFO: renamed from: kk */
    public C13682je mo348kk() {
        return m423to().m63294k4() ? m423to() : m1962h4();
    }

    @Override // com.aspose.slides.IMasterThemeManager
    public final void setOverrideTheme(IMasterTheme iMasterTheme) {
        if (iMasterTheme == null || iMasterTheme.getPresentation() != this.f2715x1.getPresentation()) {
            throw new ArgumentException("Assined theme must be from the same presentation and must not be null.");
        }
        this.f2715x1 = (MasterTheme) iMasterTheme;
    }

    @Override // com.aspose.slides.IMasterThemeManager
    public final void setOverrideThemeEnabled(boolean z) {
        if (z && (this.f2715x1.getName() == null || "".equals(this.f2715x1.getName()))) {
            this.f2715x1.setName(C14113y2.m67408k4(m1961du().getName(), " overriden"));
        }
        this.f2714kk = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final BaseSlide m1964x1() {
        return (BaseSlide) getParent_Immediate();
    }
}
