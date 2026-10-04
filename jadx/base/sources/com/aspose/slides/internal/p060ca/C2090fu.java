package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.fu */
/* JADX INFO: loaded from: classes3.dex */
public class C2090fu implements InterfaceC2196mi {

    /* JADX INFO: renamed from: k4 */
    private double f7213k4;

    /* JADX INFO: renamed from: kk */
    private C2069ek f7214kk;

    /* JADX INFO: renamed from: x1 */
    private double f7215x1;

    public C2090fu(double d, double d2) {
        this.f7213k4 = d;
        this.f7215x1 = d2;
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public final Object deepClone() {
        return new C2090fu(this.f7213k4, this.f7215x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final double m10534k4() {
        return this.f7213k4;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2196mi
    /* JADX INFO: renamed from: kk */
    public final InterfaceC2196mi mo10538kk() {
        return new C2090fu(this.f7213k4, this.f7215x1);
    }

    /* JADX INFO: renamed from: x1 */
    public final double m10539x1() {
        return this.f7215x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10535k4(double d) {
        this.f7213k4 = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10540x1(double d) {
        this.f7215x1 = d;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2196mi
    /* JADX INFO: renamed from: k4 */
    public final void mo10536k4(double d, double d2) {
        this.f7213k4 += d;
        this.f7215x1 += d2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10537k4(C2069ek c2069ek) {
        this.f7214kk = c2069ek;
    }
}
