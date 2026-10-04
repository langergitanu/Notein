package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class xnd implements b8i {

    /* JADX INFO: renamed from: k4 */
    private static final jf2 f50162k4 = new jf2();

    /* JADX INFO: renamed from: x1 */
    private final idf<ILineFormat, LineFormat> f50163x1 = new c0w(csi.f4436k4);

    /* JADX INFO: renamed from: k4 */
    public static b8i m73516k4(IPresentationComponent iPresentationComponent) {
        return (iPresentationComponent == null || iPresentationComponent.getPresentation() == null) ? f50162k4 : ((Presentation) iPresentationComponent.getPresentation()).m2346bv();
    }

    @Override // com.aspose.slides.b8i
    /* JADX INFO: renamed from: k4 */
    public final idf<ILineFormat, LineFormat> mo4046k4() {
        return this.f50163x1;
    }
}
