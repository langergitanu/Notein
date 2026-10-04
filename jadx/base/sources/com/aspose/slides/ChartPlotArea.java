package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class ChartPlotArea extends DomObject<Chart> implements IChartPlotArea {

    /* JADX INFO: renamed from: c5 */
    private float f1447c5;

    /* JADX INFO: renamed from: du */
    private float f1448du;

    /* JADX INFO: renamed from: dy */
    private float f1449dy;

    /* JADX INFO: renamed from: k4 */
    boolean f1450k4;

    /* JADX INFO: renamed from: kk */
    private final IFormat f1451kk;

    /* JADX INFO: renamed from: m9 */
    private float f1452m9;

    /* JADX INFO: renamed from: to */
    private int f1453to;

    /* JADX INFO: renamed from: x1 */
    private final C14361qv f1454x1;

    public ChartPlotArea(Chart chart) {
        super(chart);
        this.f1450k4 = true;
        this.f1453to = 1;
        this.f1454x1 = new C14361qv(chart);
        this.f1451kk = new Format(this);
    }

    @Override // com.aspose.slides.IActualLayout
    public final float getActualHeight() {
        return this.f1447c5;
    }

    @Override // com.aspose.slides.IActualLayout
    public final float getActualWidth() {
        return this.f1449dy;
    }

    @Override // com.aspose.slides.IActualLayout
    public final float getActualX() {
        return this.f1448du;
    }

    @Override // com.aspose.slides.IActualLayout
    public final float getActualY() {
        return this.f1452m9;
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getBottom() {
        return m709k4().getBottom();
    }

    @Override // com.aspose.slides.IChartComponent
    public final IChart getChart() {
        return (IChart) this.f2127h4;
    }

    @Override // com.aspose.slides.IChartPlotArea
    public final IFormat getFormat() {
        return this.f1451kk;
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getHeight() {
        return m709k4().getHeight();
    }

    @Override // com.aspose.slides.IChartPlotArea
    public final int getLayoutTargetType() {
        return this.f1453to;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        if (getChart() != null) {
            return getChart().getPresentation();
        }
        return null;
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getRight() {
        return m709k4().getRight();
    }

    @Override // com.aspose.slides.ISlideComponent
    public final IBaseSlide getSlide() {
        if (getChart() != null) {
            return getChart().getSlide();
        }
        return null;
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getWidth() {
        return m709k4().getWidth();
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getX() {
        return m709k4().getX();
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getY() {
        return m709k4().getY();
    }

    public final boolean isLocationAutocalculated() {
        return this.f1450k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14361qv m709k4() {
        return this.f1454x1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m711kk(float f) {
        this.f1449dy = f;
    }

    @Override // com.aspose.slides.ILayoutable
    public final void setHeight(float f) {
        this.f1450k4 = false;
        m709k4().setHeight(f);
    }

    @Override // com.aspose.slides.IChartPlotArea
    public final void setLayoutTargetType(int i) {
        this.f1453to = i;
    }

    @Override // com.aspose.slides.ILayoutable
    public final void setWidth(float f) {
        this.f1450k4 = false;
        m709k4().setWidth(f);
    }

    @Override // com.aspose.slides.ILayoutable
    public final void setX(float f) {
        this.f1450k4 = false;
        m709k4().setX(f);
    }

    @Override // com.aspose.slides.ILayoutable
    public final void setY(float f) {
        this.f1450k4 = false;
        m709k4().setY(f);
    }

    /* JADX INFO: renamed from: to */
    public final void m712to(float f) {
        this.f1447c5 = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m713x1(float f) {
        this.f1452m9 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m710k4(float f) {
        this.f1448du = f;
    }
}
