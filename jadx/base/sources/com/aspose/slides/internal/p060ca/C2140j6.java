package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.j6 */
/* JADX INFO: loaded from: classes3.dex */
public class C2140j6 implements InterfaceC2196mi {

    /* JADX INFO: renamed from: k4 */
    private double f7408k4;

    /* JADX INFO: renamed from: kk */
    private C2069ek f7409kk;

    /* JADX INFO: renamed from: x1 */
    private double f7410x1;

    public C2140j6(double d, double d2) {
        this.f7408k4 = d;
        this.f7410x1 = d2;
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public final Object deepClone() {
        return new C2140j6(this.f7408k4, this.f7410x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final double m10807k4() {
        return this.f7408k4;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2196mi
    /* JADX INFO: renamed from: kk */
    public final InterfaceC2196mi mo10538kk() {
        return new C2140j6(this.f7408k4, this.f7410x1);
    }

    /* JADX INFO: renamed from: x1 */
    public final double m10810x1() {
        return this.f7410x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10808k4(double d) {
        this.f7408k4 = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10811x1(double d) {
        this.f7410x1 = d;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2196mi
    /* JADX INFO: renamed from: k4 */
    public final void mo10536k4(double d, double d2) {
        this.f7408k4 += d;
        this.f7410x1 += d2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10809k4(C2069ek c2069ek) {
        this.f7409kk = c2069ek;
    }
}
