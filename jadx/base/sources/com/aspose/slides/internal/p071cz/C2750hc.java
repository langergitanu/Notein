package com.aspose.slides.internal.p071cz;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.hc */
/* JADX INFO: loaded from: classes3.dex */
final class C2750hc extends AbstractC2836nm {

    /* JADX INFO: renamed from: k4 */
    private C2865q1 f8611k4;

    public C2750hc(double d, double d2) {
        this.f8611k4 = new C2865q1();
        this.f8611k4 = new C2865q1(d, d2);
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2836nm, com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: k4 */
    public AbstractC2836nm cloneT() {
        return new C2750hc(this.f8611k4.Clone());
    }

    public C2750hc(C2865q1 c2865q1) {
        C2865q1 c2865q12 = new C2865q1();
        this.f8611k4 = c2865q12;
        c2865q1.CloneTo(c2865q12);
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2836nm
    /* JADX INFO: renamed from: k4 */
    public C2865q1 mo12231k4(C2674bu c2674bu, C2865q1 c2865q1) {
        c2674bu.m12153k4(c2865q1.m12479kk().Clone(), this.f8611k4.m12479kk().Clone());
        return this.f8611k4;
    }
}
