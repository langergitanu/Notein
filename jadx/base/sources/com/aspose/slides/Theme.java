package com.aspose.slides;

import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Theme implements ITheme, InterfaceC0973f1, InterfaceC14376r6 {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC14397rj f3556k4;

    /* JADX INFO: renamed from: kk */
    private fuq f3557kk;

    /* JADX INFO: renamed from: x1 */
    private IPresentationComponent f3558x1;

    public Theme(InterfaceC14397rj interfaceC14397rj) {
        this.f3556k4 = interfaceC14397rj;
    }

    /* JADX INFO: renamed from: k4 */
    public static IThemeManager m2995k4(IThemeable iThemeable) {
        if (C7019kk.m27469x1(iThemeable, IMasterThemeable.class)) {
            return ((IMasterThemeable) iThemeable).getThemeManager();
        }
        if (C7019kk.m27469x1(iThemeable, IOverrideThemeable.class)) {
            return ((IOverrideThemeable) iThemeable).getThemeManager();
        }
        C6005k4.m24259k4("");
        return null;
    }

    @Override // com.aspose.slides.ITheme
    public abstract IColorScheme getColorScheme();

    @Override // com.aspose.slides.ITheme
    public final IThemeEffectiveData getEffective() {
        return m2997x1();
    }

    @Override // com.aspose.slides.ITheme
    public abstract IFontScheme getFontScheme();

    @Override // com.aspose.slides.ITheme
    public abstract IFormatScheme getFormatScheme();

    @Override // com.aspose.slides.InterfaceC14376r6
    public final IPresentationComponent getParent_IPresentationComponent() {
        IPresentationComponent iPresentationComponent = this.f3558x1;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, this.f3556k4, iPresentationComponentArr);
            this.f3558x1 = iPresentationComponentArr[0];
        }
        return this.f3558x1;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f3556k4;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        if (getParent_IPresentationComponent() != null) {
            return getParent_IPresentationComponent().getPresentation();
        }
        return null;
    }

    public abstract long getVersion();

    /* JADX INFO: renamed from: kk */
    public final void m2996kk() {
        this.f3557kk = null;
    }

    /* JADX INFO: renamed from: x1 */
    public final fuq m2997x1() {
        if (this.f3557kk == null) {
            this.f3557kk = new fuq(this);
        }
        this.f3557kk.m6310to();
        return this.f3557kk;
    }
}
