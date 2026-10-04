package com.aspose.slides.internal.p417td;

import OooOO0.OooO0O0;
import com.aspose.slides.internal.p180ib.InterfaceC4809to;
import com.aspose.slides.internal.p472w8.C11913yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.td.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10924x1 implements InterfaceC4809to {

    /* JADX INFO: renamed from: du */
    private final float f38000du;

    /* JADX INFO: renamed from: h4 */
    private final float f38001h4;

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC4809to f38002k4;

    /* JADX INFO: renamed from: kk */
    private final float f38003kk;

    /* JADX INFO: renamed from: m9 */
    private final float f38004m9;

    /* JADX INFO: renamed from: to */
    private final float f38005to;

    /* JADX INFO: renamed from: x1 */
    private final float f38006x1;

    public C10924x1(InterfaceC4809to interfaceC4809to, C11913yj c11913yj) {
        this.f38002k4 = interfaceC4809to;
        this.f38006x1 = (float) c11913yj.m55761jd();
        this.f38003kk = (float) c11913yj.m55759fa();
        this.f38005to = (float) c11913yj.m55756ck();
        this.f38000du = (float) c11913yj.m55784up();
        this.f38001h4 = (float) c11913yj.m55791yj();
        this.f38004m9 = (float) c11913yj.m55779ks();
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9584k4() {
        this.f38002k4.mo9584k4();
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: x1 */
    public void mo9602x1() {
        this.f38002k4.mo9602x1();
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9585k4(float f, float f2) {
        this.f38002k4.mo9585k4((this.f38003kk * f2) + (this.f38006x1 * f) + this.f38001h4, (f2 * this.f38000du) + (f * this.f38005to) + this.f38004m9);
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: x1 */
    public void mo9603x1(float f, float f2) {
        this.f38002k4.mo9603x1((this.f38003kk * f2) + (this.f38006x1 * f) + this.f38001h4, (f2 * this.f38000du) + (f * this.f38005to) + this.f38004m9);
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9586k4(float f, float f2, float f3, float f4) {
        InterfaceC4809to interfaceC4809to = this.f38002k4;
        float f5 = this.f38006x1;
        float f6 = this.f38003kk;
        float f7 = (f2 * f6) + (f * f5);
        float f8 = this.f38001h4;
        float f9 = this.f38005to;
        float f10 = this.f38000du;
        float f11 = (f2 * f10) + (f * f9);
        float f12 = this.f38004m9;
        interfaceC4809to.mo9586k4(f7 + f8, f11 + f12, OooO0O0.OooO00o(f4, f6, f5 * f3, f8), OooO0O0.OooO00o(f4, f10, f3 * f9, f12));
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9587k4(float f, float f2, float f3, float f4, float f5, float f6) {
        InterfaceC4809to interfaceC4809to = this.f38002k4;
        float f7 = this.f38006x1;
        float f8 = this.f38003kk;
        float f9 = (f2 * f8) + (f * f7);
        float f10 = this.f38001h4;
        float f11 = this.f38005to;
        float f12 = this.f38000du;
        float f13 = (f2 * f12) + (f * f11);
        float f14 = this.f38004m9;
        interfaceC4809to.mo9587k4(f9 + f10, f13 + f14, OooO0O0.OooO00o(f4, f8, f3 * f7, f10), OooO0O0.OooO00o(f4, f12, f3 * f11, f14), OooO0O0.OooO00o(f6, f8, f7 * f5, f10), OooO0O0.OooO00o(f6, f12, f5 * f11, f14));
    }
}
