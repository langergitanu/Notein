package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class LayoutSlideThemeManager extends BaseOverrideThemeManager {
    public LayoutSlideThemeManager(LayoutSlide layoutSlide) {
        super(layoutSlide);
    }

    @Override // com.aspose.slides.BaseOverrideThemeManager
    /* JADX INFO: renamed from: k4 */
    public IThemeable mo347k4() {
        return ((LayoutSlide) m349x1()).getMasterSlide();
    }
}
