package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class ChartThemeManager extends BaseOverrideThemeManager {
    public ChartThemeManager(Chart chart) {
        super(chart);
    }

    @Override // com.aspose.slides.BaseOverrideThemeManager
    /* JADX INFO: renamed from: k4 */
    public IThemeable mo347k4() {
        return ((Chart) m349x1()).getSlide();
    }
}
