package com.aspose.slides;

import com.aspose.slides.internal.p472w8.C11896dy;

/* JADX INFO: renamed from: com.aspose.slides.p7 */
/* JADX INFO: loaded from: classes3.dex */
class C14269p7 extends otz {

    /* JADX INFO: renamed from: k4 */
    private ChartDataPointLevel f48005k4;

    /* JADX INFO: renamed from: x1 */
    private C14365qy f48006x1;

    public C14269p7(ChartDataPointLevel chartDataPointLevel, C14365qy c14365qy) {
        this.f48005k4 = chartDataPointLevel;
        this.f48006x1 = c14365qy;
    }

    @Override // com.aspose.slides.otz
    /* JADX INFO: renamed from: dy */
    public boolean mo6841dy() {
        return false;
    }

    @Override // com.aspose.slides.otz
    /* JADX INFO: renamed from: k4 */
    public void mo6842k4(C11896dy c11896dy) {
        c11896dy.m55578x1(m68826c5().Clone());
        this.f48005k4.m650k4(false);
        FillFormat fillFormatM651kk = this.f48005k4.m651kk();
        im9.m7703k4(((ColorFormat) fillFormatM651kk.getSolidFillColor()).m1084to().Clone(), this.f48006x1, c11896dy, fillFormatM651kk, 1.0f, (IEffectFormat) null);
        this.f48005k4.m650k4(true);
    }

    @Override // com.aspose.slides.otz
    /* JADX INFO: renamed from: m9 */
    public LineFormat mo6843m9() {
        return (LineFormat) this.f48005k4.getFormat().getLine();
    }

    @Override // com.aspose.slides.otz
    /* JADX INFO: renamed from: to */
    public int mo6844to() {
        return 0;
    }
}
