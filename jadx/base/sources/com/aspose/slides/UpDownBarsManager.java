package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class UpDownBarsManager extends DomObject<ChartSeriesGroup> implements IUpDownBarsManager {

    /* JADX INFO: renamed from: du */
    private int f3625du;

    /* JADX INFO: renamed from: k4 */
    private final xoj f3626k4;

    /* JADX INFO: renamed from: kk */
    private final Format f3627kk;

    /* JADX INFO: renamed from: to */
    private boolean f3628to;

    /* JADX INFO: renamed from: x1 */
    private final Format f3629x1;

    public UpDownBarsManager(ChartSeriesGroup chartSeriesGroup) {
        super(chartSeriesGroup);
        this.f3626k4 = new xoj();
        this.f3628to = false;
        this.f3625du = 150;
        this.f3629x1 = new Format(this);
        this.f3627kk = new Format(this);
    }

    @Override // com.aspose.slides.IUpDownBarsManager
    public final IFormat getDownBarsFormat() {
        return this.f3627kk;
    }

    @Override // com.aspose.slides.IUpDownBarsManager
    public final int getGapWidth() {
        return this.f3625du;
    }

    @Override // com.aspose.slides.IUpDownBarsManager
    public final IFormat getUpBarsFormat() {
        return this.f3629x1;
    }

    @Override // com.aspose.slides.IUpDownBarsManager
    public final boolean hasUpDownBars() {
        return this.f3628to;
    }

    /* JADX INFO: renamed from: k4 */
    public final xoj m3027k4() {
        return this.f3626k4;
    }

    @Override // com.aspose.slides.IUpDownBarsManager
    public final void setGapWidth(int i) {
        this.f3625du = i;
    }

    @Override // com.aspose.slides.IUpDownBarsManager
    public final void setUpDownBars(boolean z) {
        this.f3628to = z;
    }
}
