package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class SummaryZoomFrame extends GraphicalObject implements ISummaryZoomFrame {

    /* JADX INFO: renamed from: k4 */
    private int f3466k4;

    /* JADX INFO: renamed from: kk */
    private PictureFillFormat f3467kk;

    /* JADX INFO: renamed from: x1 */
    private ISummaryZoomSectionCollection f3468x1;

    public SummaryZoomFrame(ShapeCollection shapeCollection) {
        super(shapeCollection);
        this.f3468x1 = new SummaryZoomSectionCollection(this);
        m2839k4(new PictureFillFormat(this));
        m2840k4().setPictureFillMode(1);
        this.f3300c5 = new LineFormat(this);
        m2560k4(new kwp(this));
    }

    @Override // com.aspose.slides.ISummaryZoomFrame
    public final int getLayout() {
        return this.f3466k4;
    }

    @Override // com.aspose.slides.ISummaryZoomFrame
    public final ISummaryZoomSectionCollection getSummaryZoomCollection() {
        return this.f3468x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final PictureFillFormat m2840k4() {
        return this.f3467kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2841k4(int i) {
        this.f3466k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    private void m2839k4(PictureFillFormat pictureFillFormat) {
        this.f3467kk = pictureFillFormat;
    }
}
