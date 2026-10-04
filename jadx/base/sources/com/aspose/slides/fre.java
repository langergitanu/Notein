package com.aspose.slides;

import com.aspose.slides.internal.p332p7.AbstractC7414ck;
import com.aspose.slides.internal.p332p7.C7534e4;

/* JADX INFO: loaded from: classes3.dex */
class fre extends AbstractC14463so implements ILayoutable {

    /* JADX INFO: renamed from: k4 */
    private h7e f5117k4 = new h7e();

    /* JADX INFO: renamed from: x1 */
    private IChart f5118x1;

    public fre(IChart iChart) {
        this.f5118x1 = iChart;
    }

    /* JADX INFO: renamed from: c5 */
    public C7534e4 m6283c5() {
        return this.f5117k4.m7052jd();
    }

    /* JADX INFO: renamed from: ck */
    public AbstractC7414ck m6284ck() {
        return this.f5117k4.m7050fa();
    }

    /* JADX INFO: renamed from: dy */
    public C7534e4 m6285dy() {
        return this.f5117k4.m7046c5();
    }

    @Override // com.aspose.slides.ILayoutable
    public float getBottom() {
        return this.f5117k4.m7051h4();
    }

    @Override // com.aspose.slides.IChartComponent
    public IChart getChart() {
        return this.f5118x1;
    }

    @Override // com.aspose.slides.ILayoutable
    public float getHeight() {
        return this.f5117k4.m7061to();
    }

    @Override // com.aspose.slides.IPresentationComponent
    public IPresentation getPresentation() {
        IChart iChart = this.f5118x1;
        if (iChart != null) {
            return iChart.getPresentation();
        }
        return null;
    }

    @Override // com.aspose.slides.ILayoutable
    public float getRight() {
        return this.f5117k4.m7048du();
    }

    @Override // com.aspose.slides.ISlideComponent
    public IBaseSlide getSlide() {
        IChart iChart = this.f5118x1;
        if (iChart != null) {
            return iChart.getSlide();
        }
        return null;
    }

    @Override // com.aspose.slides.ILayoutable
    public float getWidth() {
        return this.f5117k4.m7057kk();
    }

    @Override // com.aspose.slides.ILayoutable
    public float getX() {
        return this.f5117k4.m7053k4();
    }

    @Override // com.aspose.slides.ILayoutable
    public float getY() {
        return this.f5117k4.m7064x1();
    }

    /* JADX INFO: renamed from: h4 */
    public C7534e4 m6286h4() {
        return this.f5117k4.m7060m9();
    }

    /* JADX INFO: renamed from: jd */
    public AbstractC7414ck m6287jd() {
        return this.f5117k4.m7047ck();
    }

    /* JADX INFO: renamed from: k4 */
    public void m6288k4(C7534e4 c7534e4) {
        this.f5117k4.m7056k4(c7534e4);
    }

    /* JADX INFO: renamed from: kk */
    public void m6289kk(AbstractC7414ck abstractC7414ck) {
        this.f5117k4.m7066x1(abstractC7414ck);
    }

    /* JADX INFO: renamed from: m9 */
    public C7534e4 m6291m9() {
        return this.f5117k4.m7049dy();
    }

    @Override // com.aspose.slides.ILayoutable
    public void setHeight(float f) {
        this.f5117k4.m7062to(f);
    }

    @Override // com.aspose.slides.ILayoutable
    public void setWidth(float f) {
        this.f5117k4.m7058kk(f);
    }

    @Override // com.aspose.slides.ILayoutable
    public void setX(float f) {
        this.f5117k4.m7054k4(f);
    }

    @Override // com.aspose.slides.ILayoutable
    public void setY(float f) {
        this.f5117k4.m7065x1(f);
    }

    /* JADX INFO: renamed from: to */
    public void m6292to(C7534e4 c7534e4) {
        this.f5117k4.m7063to(c7534e4);
    }

    /* JADX INFO: renamed from: x1 */
    public void m6293x1(AbstractC7414ck abstractC7414ck) {
        this.f5117k4.m7055k4(abstractC7414ck);
    }

    /* JADX INFO: renamed from: kk */
    public void m6290kk(C7534e4 c7534e4) {
        this.f5117k4.m7059kk(c7534e4);
    }

    /* JADX INFO: renamed from: x1 */
    public void m6294x1(C7534e4 c7534e4) {
        this.f5117k4.m7067x1(c7534e4);
    }
}
