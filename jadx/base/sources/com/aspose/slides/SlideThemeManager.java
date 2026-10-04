package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class SlideThemeManager extends BaseOverrideThemeManager {
    public SlideThemeManager(Slide slide) {
        super(slide);
    }

    @Override // com.aspose.slides.BaseOverrideThemeManager
    /* JADX INFO: renamed from: k4 */
    public IThemeable mo347k4() {
        return ((Slide) m349x1()).getLayoutSlide();
    }
}
