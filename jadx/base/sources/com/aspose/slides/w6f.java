package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class w6f implements InterfaceC14190no {

    /* JADX INFO: renamed from: du */
    private float f49759du;

    /* JADX INFO: renamed from: h4 */
    private float f49760h4;

    /* JADX INFO: renamed from: k4 */
    private final C0950eh f49761k4;

    /* JADX INFO: renamed from: kk */
    private float f49762kk;

    /* JADX INFO: renamed from: to */
    private float f49763to;

    /* JADX INFO: renamed from: x1 */
    private final IShape f49764x1;

    public w6f(IShape iShape, C0950eh c0950eh) {
        this.f49764x1 = iShape;
        this.f49761k4 = c0950eh;
        m72642to(iShape.getY());
        m72643x1(iShape.getX());
        m72640k4(iShape.getHeight() + iShape.getY());
        m72641kk(iShape.getWidth() + iShape.getX());
    }

    @Override // com.aspose.slides.InterfaceC14190no
    /* JADX INFO: renamed from: k4 */
    public final float mo4870k4() {
        return this.f49763to;
    }

    /* JADX INFO: renamed from: kk */
    public final void m72641kk(float f) {
        this.f49759du = f;
    }

    /* JADX INFO: renamed from: to */
    public final void m72642to(float f) {
        this.f49760h4 = f;
    }

    @Override // com.aspose.slides.InterfaceC14190no
    /* JADX INFO: renamed from: x1 */
    public final float mo4878x1() {
        return this.f49760h4;
    }

    @Override // com.aspose.slides.InterfaceC14190no
    /* JADX INFO: renamed from: k4 */
    public final String mo4871k4(InterfaceC1140gd interfaceC1140gd) {
        String strM72782k4 = wl8.m72782k4(this.f49764x1, this.f49761k4);
        interfaceC1140gd.mo6493k4(strM72782k4);
        return strM72782k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m72643x1(float f) {
        this.f49763to = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72640k4(float f) {
        this.f49762kk = f;
    }
}
