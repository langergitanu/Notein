package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
final class oi5 implements InterfaceC0862co {

    /* JADX INFO: renamed from: k4 */
    private final IShape f47810k4;

    /* JADX INFO: renamed from: x1 */
    private final C14571tq f47811x1;

    public oi5(IShape iShape, C14571tq c14571tq) {
        this.f47810k4 = iShape;
        this.f47811x1 = c14571tq;
    }

    /* JADX INFO: renamed from: k4 */
    public final ohe m68578k4() {
        IShapeFrame frame = this.f47810k4.getFrame();
        return new ohe(frame.getX(), frame.getY(), frame.getWidth(), frame.getHeight());
    }

    @Override // com.aspose.slides.InterfaceC0862co
    /* JADX INFO: renamed from: k4 */
    public final void mo4695k4(InterfaceC14169n6 interfaceC14169n6) {
        this.f47811x1.m71280k4(this.f47810k4, interfaceC14169n6);
    }
}
