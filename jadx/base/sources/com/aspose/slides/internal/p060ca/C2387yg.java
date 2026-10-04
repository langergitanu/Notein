package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.yg */
/* JADX INFO: loaded from: classes3.dex */
public class C2387yg implements InterfaceC2196mi {

    /* JADX INFO: renamed from: k4 */
    private double f8258k4;

    /* JADX INFO: renamed from: kk */
    private C2069ek f8259kk;

    /* JADX INFO: renamed from: x1 */
    private double f8260x1;

    public C2387yg(double d, double d2) {
        this.f8258k4 = d;
        this.f8260x1 = d2;
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public final Object deepClone() {
        return new C2387yg(this.f8258k4, this.f8260x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final double m11743k4() {
        return this.f8258k4;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2196mi
    /* JADX INFO: renamed from: kk */
    public final InterfaceC2196mi mo10538kk() {
        return new C2387yg(this.f8258k4, this.f8260x1);
    }

    /* JADX INFO: renamed from: x1 */
    public final double m11746x1() {
        return this.f8260x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11744k4(double d) {
        this.f8258k4 = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m11747x1(double d) {
        this.f8260x1 = d;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2196mi
    /* JADX INFO: renamed from: k4 */
    public final void mo10536k4(double d, double d2) {
        this.f8258k4 += d;
        this.f8260x1 += d2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11745k4(C2069ek c2069ek) {
        this.f8259kk = c2069ek;
    }
}
