package com.aspose.slides.internal.p071cz;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.yo */
/* JADX INFO: loaded from: classes3.dex */
final class C2983yo extends AbstractC2836nm {

    /* JADX INFO: renamed from: k4 */
    private C2865q1 f8818k4 = new C2865q1();

    /* JADX INFO: renamed from: x1 */
    private C2865q1 f8820x1 = new C2865q1();

    /* JADX INFO: renamed from: kk */
    private C2865q1 f8819kk = new C2865q1();

    public C2983yo(C2865q1 c2865q1, C2865q1 c2865q12, C2865q1 c2865q13) {
        m12633k4(c2865q1.Clone());
        m12635x1(c2865q12.Clone());
        m12634kk(c2865q13.Clone());
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2836nm, com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: k4 */
    public AbstractC2836nm cloneT() {
        return new C2983yo(this.f8818k4.Clone(), this.f8820x1.Clone(), this.f8819kk.Clone());
    }

    /* JADX INFO: renamed from: kk */
    public final void m12634kk(C2865q1 c2865q1) {
        c2865q1.CloneTo(this.f8819kk);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m12635x1(C2865q1 c2865q1) {
        c2865q1.CloneTo(this.f8820x1);
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2836nm
    /* JADX INFO: renamed from: k4 */
    public C2865q1 mo12231k4(C2674bu c2674bu, C2865q1 c2865q1) {
        c2674bu.m12154k4(c2865q1.m12479kk().Clone(), this.f8818k4.m12479kk().Clone(), this.f8820x1.m12479kk().Clone(), this.f8819kk.m12479kk().Clone());
        return this.f8819kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12633k4(C2865q1 c2865q1) {
        c2865q1.CloneTo(this.f8818k4);
    }
}
