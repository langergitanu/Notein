package com.aspose.slides.internal.p060ca;

import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.i1 */
/* JADX INFO: loaded from: classes3.dex */
public class C2122i1 extends AbstractC2108h5 {

    /* JADX INFO: renamed from: k4 */
    private C2131ip f7329k4;

    /* JADX INFO: renamed from: x1 */
    private double f7330x1;

    public C2122i1(C2131ip c2131ip) {
        this.f7329k4 = c2131ip;
        this.f7330x1 = C14116yg.m67496rv((this.f7329k4.m10727x1() * this.f7329k4.m10727x1()) + (this.f7329k4.m10725k4() * c2131ip.m10725k4()));
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2108h5
    /* JADX INFO: renamed from: k4 */
    public double mo10664k4(double d, double d2) {
        return ((this.f7329k4.m10727x1() * d2) + (this.f7329k4.m10725k4() * d)) / this.f7330x1;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2108h5
    /* JADX INFO: renamed from: k4 */
    public void mo10665k4(C2216ni c2216ni, int i, double d) {
        double dM10725k4 = this.f7329k4.m10725k4() * d;
        double dM10727x1 = this.f7329k4.m10727x1() * d;
        double[] dArr = c2216ni.f7666du;
        dArr[i] = dArr[i] + dM10725k4;
        double[] dArr2 = c2216ni.f7668h4;
        dArr2[i] = dArr2[i] + dM10727x1;
        c2216ni.f7667dy[i] = true;
        c2216ni.f7671m9[i] = true;
    }
}
