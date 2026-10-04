package com.aspose.slides.internal.p071cz;

import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.uz */
/* JADX INFO: loaded from: classes3.dex */
final class C2932uz extends AbstractC2836nm {

    /* JADX INFO: renamed from: k4 */
    private double f8778k4;

    /* JADX INFO: renamed from: kk */
    private double f8779kk;

    /* JADX INFO: renamed from: to */
    private double f8780to;

    /* JADX INFO: renamed from: x1 */
    private double f8781x1;

    public C2932uz(double d, double d2, double d3, double d4) {
        m12569kk(d3);
        m12571x1(d2);
        m12568k4(d);
        m12570to(d4);
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2836nm, com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: k4 */
    public AbstractC2836nm cloneT() {
        return new C2932uz(this.f8781x1, this.f8778k4, this.f8779kk, this.f8780to);
    }

    /* JADX INFO: renamed from: kk */
    public final void m12569kk(double d) {
        this.f8779kk = d;
    }

    /* JADX INFO: renamed from: to */
    public final void m12570to(double d) {
        this.f8780to = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m12571x1(double d) {
        this.f8778k4 = d;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2836nm
    /* JADX INFO: renamed from: k4 */
    public C2865q1 mo12231k4(C2674bu c2674bu, C2865q1 c2865q1) {
        if (this.f8781x1 == 0.0d && this.f8778k4 == 0.0d) {
            return new C2865q1(c2865q1.m12477k4(), c2865q1.m12481x1());
        }
        C12025x6 c12025x6Clone = c2674bu.m12148k4(c2865q1.m12477k4(), c2865q1.m12481x1(), this.f8781x1, this.f8778k4, this.f8779kk / 60000.0d, this.f8780to / 60000.0d).Clone();
        return new C2865q1(c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12568k4(double d) {
        this.f8781x1 = d;
    }
}
