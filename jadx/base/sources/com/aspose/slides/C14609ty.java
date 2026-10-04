package com.aspose.slides;

/* JADX INFO: renamed from: com.aspose.slides.ty */
/* JADX INFO: loaded from: classes3.dex */
class C14609ty extends DomObject<Axis> implements ILayoutable, IOverridableText {

    /* JADX INFO: renamed from: du */
    private boolean f49223du;

    /* JADX INFO: renamed from: k4 */
    private Chart f49224k4;

    /* JADX INFO: renamed from: kk */
    private TextFrame f49225kk;

    /* JADX INFO: renamed from: m9 */
    private ChartTextFormat f49226m9;

    /* JADX INFO: renamed from: to */
    private IFormat f49227to;

    /* JADX INFO: renamed from: x1 */
    private final C13685jh f49228x1;

    public C14609ty(Axis axis) {
        super(axis);
        this.f49228x1 = new C13685jh(getChart());
        this.f49227to = new Format(this);
    }

    @Override // com.aspose.slides.IOverridableText
    public final ITextFrame addTextFrameForOverriding(String str) {
        if (this.f49225kk == null) {
            this.f49225kk = new TextFrame(this);
        }
        ((ParagraphCollection) this.f49225kk.getParagraphs()).m2178k4(str);
        return this.f49225kk;
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getBottom() {
        return m71456k4().getBottom();
    }

    @Override // com.aspose.slides.IChartComponent
    public final IChart getChart() {
        Chart chart = this.f49224k4;
        if (chart == null) {
            Chart[] chartArr = {chart};
            kke.m63959k4(Chart.class, (InterfaceC14397rj) this.f2127h4, chartArr);
            this.f49224k4 = chartArr[0];
        }
        return this.f49224k4;
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getHeight() {
        return m71456k4().getHeight();
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
        return m71456k4().getRight();
    }

    @Override // com.aspose.slides.ISlideComponent
    public final IBaseSlide getSlide() {
        if (getChart() != null) {
            return getChart().getSlide();
        }
        return null;
    }

    @Override // com.aspose.slides.IFormattedTextContainer
    public final IChartTextFormat getTextFormat() {
        if (this.f49226m9 == null) {
            this.f49226m9 = new ChartTextFormat(this);
        }
        return this.f49226m9;
    }

    @Override // com.aspose.slides.IOverridableText
    public final ITextFrame getTextFrameForOverriding() {
        return this.f49225kk;
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getWidth() {
        return m71456k4().getWidth();
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getX() {
        return m71456k4().getX();
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getY() {
        return m71456k4().getY();
    }

    /* JADX INFO: renamed from: k4 */
    public final C13685jh m71456k4() {
        return this.f49228x1;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m71458kk() {
        return this.f49223du;
    }

    @Override // com.aspose.slides.ILayoutable
    public final void setHeight(float f) {
        m71456k4().setHeight(f);
    }

    @Override // com.aspose.slides.ILayoutable
    public final void setWidth(float f) {
        m71456k4().setWidth(f);
    }

    @Override // com.aspose.slides.ILayoutable
    public final void setX(float f) {
        m71456k4().setX(f);
    }

    @Override // com.aspose.slides.ILayoutable
    public final void setY(float f) {
        m71456k4().setY(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: to */
    public final Axis m71459to() {
        return (Axis) this.f2127h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final IFormat m71460x1() {
        return this.f49227to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71457k4(boolean z) {
        this.f49223du = z;
    }
}
