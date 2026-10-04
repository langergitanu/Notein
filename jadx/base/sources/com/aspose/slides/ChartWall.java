package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class ChartWall extends DomObject<Chart> implements IChartWall {

    /* JADX INFO: renamed from: k4 */
    int f1532k4;

    /* JADX INFO: renamed from: kk */
    int f1533kk;

    /* JADX INFO: renamed from: to */
    private final C14408rp f1534to;

    /* JADX INFO: renamed from: x1 */
    Format f1535x1;

    public ChartWall(Chart chart) {
        super(chart);
        this.f1533kk = -1;
        this.f1534to = new C14408rp();
        this.f1535x1 = new Format(this);
    }

    @Override // com.aspose.slides.IChartWall
    public final IFormat getFormat() {
        return this.f1535x1;
    }

    @Override // com.aspose.slides.IChartWall
    public final int getPictureType() {
        return this.f1533kk;
    }

    @Override // com.aspose.slides.IChartWall
    public final int getThickness() {
        return this.f1532k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14408rp m770k4() {
        return this.f1534to;
    }

    @Override // com.aspose.slides.IChartWall
    public final void setPictureType(int i) {
        this.f1533kk = i;
    }

    @Override // com.aspose.slides.IChartWall
    public final void setThickness(int i) {
        this.f1532k4 = i;
    }
}
