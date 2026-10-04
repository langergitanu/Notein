package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.qn */
/* JADX INFO: loaded from: classes3.dex */
public class C2264qn implements InterfaceC2196mi {

    /* JADX INFO: renamed from: du */
    private double f7780du;

    /* JADX INFO: renamed from: h4 */
    private double f7781h4;

    /* JADX INFO: renamed from: k4 */
    private double f7782k4;

    /* JADX INFO: renamed from: kk */
    private double f7783kk;

    /* JADX INFO: renamed from: m9 */
    private C2069ek f7784m9;

    /* JADX INFO: renamed from: to */
    private double f7785to;

    /* JADX INFO: renamed from: x1 */
    private double f7786x1;

    public C2264qn(double d, double d2, double d3, double d4, double d5, double d6) {
        this.f7782k4 = d;
        this.f7785to = d2;
        this.f7786x1 = d3;
        this.f7780du = d4;
        this.f7783kk = d5;
        this.f7781h4 = d6;
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public final Object deepClone() {
        return new C2264qn(this.f7782k4, this.f7785to, this.f7786x1, this.f7780du, this.f7783kk, this.f7781h4);
    }

    /* JADX INFO: renamed from: du */
    public final double m11293du() {
        return this.f7780du;
    }

    /* JADX INFO: renamed from: h4 */
    public final double m11295h4() {
        return this.f7783kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m11297k4() {
        return this.f7782k4;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2196mi
    /* JADX INFO: renamed from: kk */
    public final InterfaceC2196mi mo10538kk() {
        return new C2264qn(this.f7782k4, this.f7785to, this.f7786x1, this.f7780du, this.f7783kk, this.f7781h4);
    }

    /* JADX INFO: renamed from: m9 */
    public final double m11301m9() {
        return this.f7781h4;
    }

    /* JADX INFO: renamed from: to */
    public final double m11302to() {
        return this.f7786x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m11304x1() {
        return this.f7785to;
    }

    /* JADX INFO: renamed from: du */
    public final void m11294du(double d) {
        this.f7783kk = d;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m11296h4(double d) {
        this.f7781h4 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11298k4(double d) {
        this.f7782k4 = d;
    }

    /* JADX INFO: renamed from: kk */
    public final void m11300kk(double d) {
        this.f7786x1 = d;
    }

    /* JADX INFO: renamed from: to */
    public final void m11303to(double d) {
        this.f7780du = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m11305x1(double d) {
        this.f7785to = d;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2196mi
    /* JADX INFO: renamed from: k4 */
    public final void mo10536k4(double d, double d2) {
        this.f7782k4 += d;
        this.f7785to += d2;
        this.f7786x1 += d;
        this.f7780du += d2;
        this.f7783kk += d;
        this.f7781h4 += d2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11299k4(C2069ek c2069ek) {
        this.f7784m9 = c2069ek;
    }
}
