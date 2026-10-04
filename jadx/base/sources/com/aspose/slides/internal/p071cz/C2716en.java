package com.aspose.slides.internal.p071cz;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.en */
/* JADX INFO: loaded from: classes3.dex */
final class C2716en extends AbstractC2836nm {

    /* JADX INFO: renamed from: k4 */
    private C2865q1 f8574k4 = new C2865q1();

    /* JADX INFO: renamed from: x1 */
    private C2865q1 f8575x1 = new C2865q1();

    public C2716en(C2865q1 c2865q1, C2865q1 c2865q12) {
        m12232k4(c2865q1.Clone());
        m12233x1(c2865q12.Clone());
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2836nm, com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: k4 */
    public AbstractC2836nm cloneT() {
        return new C2716en(this.f8574k4.Clone(), this.f8575x1.Clone());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m12233x1(C2865q1 c2865q1) {
        c2865q1.CloneTo(this.f8575x1);
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2836nm
    /* JADX INFO: renamed from: k4 */
    public C2865q1 mo12231k4(C2674bu c2674bu, C2865q1 c2865q1) {
        double dM12477k4 = this.f8574k4.m12477k4() - c2865q1.m12477k4();
        double dM12481x1 = this.f8574k4.m12481x1() - c2865q1.m12481x1();
        double d = (dM12477k4 * 2.0d) / 3.0d;
        double d2 = (dM12481x1 * 2.0d) / 3.0d;
        double dM12477k42 = ((this.f8575x1.m12477k4() - c2865q1.m12477k4()) / 3.0d) + d;
        double dM12481x12 = ((this.f8575x1.m12481x1() - c2865q1.m12481x1()) / 3.0d) + d2;
        c2674bu.m12154k4(c2865q1.m12479kk().Clone(), new C2865q1(c2865q1.m12477k4() + d, c2865q1.m12481x1() + d2).m12479kk().Clone(), new C2865q1(c2865q1.m12477k4() + dM12477k42, c2865q1.m12481x1() + dM12481x12).m12479kk().Clone(), this.f8575x1.m12479kk().Clone());
        return this.f8575x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12232k4(C2865q1 c2865q1) {
        c2865q1.CloneTo(this.f8574k4);
    }
}
