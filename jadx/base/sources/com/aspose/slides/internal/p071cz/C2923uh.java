package com.aspose.slides.internal.p071cz;

import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.uh */
/* JADX INFO: loaded from: classes3.dex */
class C2923uh extends AbstractC2904sx {

    /* JADX INFO: renamed from: kk */
    private double f8768kk;

    /* JADX INFO: renamed from: k4 */
    private C2865q1 f8767k4 = new C2865q1();

    /* JADX INFO: renamed from: x1 */
    private C2865q1 f8769x1 = new C2865q1();

    public C2923uh(C2865q1 c2865q1, C2865q1 c2865q12) {
        c2865q1.CloneTo(this.f8767k4);
        c2865q12.CloneTo(this.f8769x1);
        this.f8768kk = m12550k4(this.f8767k4.Clone(), this.f8769x1.Clone());
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2904sx
    /* JADX INFO: renamed from: k4 */
    public double mo12528k4() {
        return this.f8768kk;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2904sx
    /* JADX INFO: renamed from: x1 */
    public C2865q1 mo12531x1(double d) {
        return new C2865q1(((this.f8769x1.m12477k4() - this.f8767k4.m12477k4()) * d) + this.f8767k4.m12477k4(), ((this.f8769x1.m12481x1() - this.f8767k4.m12481x1()) * d) + this.f8767k4.m12481x1());
    }

    /* JADX INFO: renamed from: k4 */
    private double m12550k4(C2865q1 c2865q1, C2865q1 c2865q12) {
        double dM12477k4 = c2865q1.m12477k4() - c2865q12.m12477k4();
        double dM12481x1 = c2865q1.m12481x1() - c2865q12.m12481x1();
        return C14116yg.m67496rv((dM12481x1 * dM12481x1) + (dM12477k4 * dM12477k4));
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2904sx, com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: x1 */
    public AbstractC2904sx cloneT() {
        return new C2923uh(this.f8767k4.Clone(), this.f8769x1.Clone());
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2904sx
    /* JADX INFO: renamed from: k4 */
    public AbstractC2904sx mo12529k4(double d) {
        C2968xo c2968xoClone = C2968xo.m12599k4(C2865q1.m12475k4(this.f8767k4, this.f8769x1).m12604du(), d).Clone();
        return new C2923uh(C2968xo.m12598k4(this.f8767k4, c2968xoClone).Clone(), C2968xo.m12598k4(this.f8769x1, c2968xoClone).Clone());
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2904sx
    /* JADX INFO: renamed from: k4 */
    public C2968xo mo12530k4(double d, double d2, boolean z) {
        C2968xo c2968xoClone = C2865q1.m12475k4(this.f8767k4, this.f8769x1).Clone();
        c2968xoClone.m12610to().CloneTo(c2968xoClone);
        double dM12611x1 = c2968xoClone.m12611x1();
        return z ? new C2968xo((-dM12611x1) * d2, c2968xoClone.m12606k4() * d2) : new C2968xo(dM12611x1 * d2, (-c2968xoClone.m12606k4()) * d2);
    }
}
