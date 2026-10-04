package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseOverrideThemeManager extends BaseThemeManager implements IOverrideThemeManager {

    /* JADX INFO: renamed from: kk */
    private OverrideTheme f1052kk;

    /* JADX INFO: renamed from: x1 */
    private IThemeable f1053x1;

    public BaseOverrideThemeManager(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f1052kk = new OverrideTheme(this);
    }

    /* JADX INFO: renamed from: du */
    private C13682je m346du() {
        return mo347k4() != null ? ((BaseThemeManager) Theme.m2995k4(mo347k4())).mo348kk() : BaseThemeManager.f1088k4;
    }

    @Override // com.aspose.slides.IThemeManager
    public final void applyColorScheme(IExtraColorScheme iExtraColorScheme) {
        this.f1052kk.m2113k4().m1128k4((ColorScheme) iExtraColorScheme.getColorScheme());
        ExtraColorScheme extraColorScheme = (ExtraColorScheme) iExtraColorScheme;
        m423to().m63293k4(extraColorScheme.m1427k4().m63294k4());
        if (m423to().m63294k4()) {
            m423to().m63292k4(extraColorScheme.m1427k4());
        }
    }

    @Override // com.aspose.slides.IThemeManager
    public final IThemeEffectiveData createThemeEffective() {
        return this.f1052kk.getEffective();
    }

    @Override // com.aspose.slides.IOverrideThemeManager
    public final IOverrideTheme getOverrideTheme() {
        return this.f1052kk;
    }

    @Override // com.aspose.slides.IOverrideThemeManager
    public final boolean isOverrideThemeEnabled() {
        return !this.f1052kk.isEmpty();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract IThemeable mo347k4();

    @Override // com.aspose.slides.BaseThemeManager
    /* JADX INFO: renamed from: kk */
    public C13682je mo348kk() {
        return m423to().m63294k4() ? m423to() : m346du();
    }

    @Override // com.aspose.slides.IOverrideThemeManager
    public final void setOverrideTheme(IOverrideTheme iOverrideTheme) {
        if (iOverrideTheme == null || iOverrideTheme.getPresentation() != this.f1052kk.getPresentation()) {
            throw new ArgumentException("Assined theme must be from the same presentation and must not be null.");
        }
        this.f1052kk = (OverrideTheme) iOverrideTheme;
    }

    /* JADX INFO: renamed from: x1 */
    public final IThemeable m349x1() {
        IThemeable iThemeable = this.f1053x1;
        if (iThemeable == null) {
            IThemeable[] iThemeableArr = {iThemeable};
            kke.m63959k4(IThemeable.class, getParent_Immediate(), iThemeableArr);
            this.f1053x1 = iThemeableArr[0];
        }
        return this.f1053x1;
    }
}
