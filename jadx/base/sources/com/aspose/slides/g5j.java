package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
final class g5j extends AbstractC14206nx implements InterfaceC14751wu {

    /* JADX INFO: renamed from: kk */
    public float f5175kk;

    /* JADX INFO: renamed from: x1 */
    public float f5176x1;

    public g5j(IShape iShape) {
        super(iShape);
        this.f5176x1 = 0.0f;
        this.f5175kk = 360.0f;
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2023k4() {
        this.f47636k4.setRotation(this.f5175kk);
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2024k4(float f) {
        IShape iShape = this.f47636k4;
        float f2 = this.f5176x1;
        iShape.setRotation(((this.f5175kk - f2) * f) + f2);
    }
}
