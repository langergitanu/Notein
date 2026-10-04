package com.aspose.slides.internal.p420th;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.th.du */
/* JADX INFO: loaded from: classes4.dex */
public class C10955du extends AbstractC10973uz implements InterfaceC10952c6, InterfaceC10979xk {

    /* JADX INFO: renamed from: k4 */
    private C10969to f38171k4;

    /* JADX INFO: renamed from: x1 */
    private C5656k4 f38172x1;

    public C10955du() {
        this.f38171k4 = new C10969to();
        this.f38172x1 = C5656k4.f15518dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10969to m52919k4() {
        return this.f38171k4;
    }

    @Override // com.aspose.slides.internal.p420th.InterfaceC10979xk
    /* JADX INFO: renamed from: x1 */
    public final AbstractC10973uz mo52921x1() {
        C10969to c10969to = new C10969to();
        c10969to.m53052k4(new C12025x6(this.f38171k4.m53050k4().m56897x1(), this.f38171k4.m53050k4().m56895kk()));
        c10969to.m53056to(new C12025x6(this.f38171k4.m53055to().m56897x1(), this.f38171k4.m53055to().m56895kk()));
        c10969to.m53058x1(new C12025x6(this.f38171k4.m53057x1().m56897x1(), this.f38171k4.m53057x1().m56895kk()));
        c10969to.m53054kk(new C12025x6(this.f38171k4.m53053kk().m56897x1(), this.f38171k4.m53053kk().m56895kk()));
        C10955du c10955du = new C10955du(c10969to.Clone(), this.f38172x1);
        c10969to.CloneTo(c10955du.f38171k4);
        return c10955du;
    }

    public C10955du(C10969to c10969to) {
        C10969to c10969to2 = new C10969to();
        this.f38171k4 = c10969to2;
        this.f38172x1 = C5656k4.f15518dy;
        c10969to.CloneTo(c10969to2);
    }

    @Override // com.aspose.slides.internal.p420th.InterfaceC10952c6
    /* JADX INFO: renamed from: k4 */
    public final void mo52910k4(C4317dy c4317dy) {
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 4);
        this.f38171k4.m53050k4().CloneTo(c12025x6Arr[0]);
        this.f38171k4.m53057x1().CloneTo(c12025x6Arr[1]);
        this.f38171k4.m53053kk().CloneTo(c12025x6Arr[2]);
        this.f38171k4.m53055to().CloneTo(c12025x6Arr[3]);
        c4317dy.m17342k4(c12025x6Arr);
        this.f38171k4.m53052k4(c12025x6Arr[0].Clone());
        this.f38171k4.m53058x1(c12025x6Arr[1].Clone());
        this.f38171k4.m53054kk(c12025x6Arr[2].Clone());
        this.f38171k4.m53056to(c12025x6Arr[3].Clone());
    }

    public C10955du(C10969to c10969to, C5656k4 c5656k4) {
        this(c10969to.Clone());
        this.f38172x1 = c5656k4;
    }

    public C10955du(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63) {
        this.f38171k4 = new C10969to();
        this.f38172x1 = C5656k4.f15518dy;
        this.f38171k4 = new C10969to(c12025x6.Clone(), c12025x62.Clone(), c12025x63.Clone());
    }

    public C10955du(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, C12025x6 c12025x64) {
        this.f38171k4 = new C10969to();
        this.f38172x1 = C5656k4.f15518dy;
        C10969to c10969to = new C10969to();
        this.f38171k4 = c10969to;
        c10969to.m53052k4(c12025x6.Clone());
        this.f38171k4.m53058x1(c12025x62.Clone());
        this.f38171k4.m53054kk(c12025x63.Clone());
        this.f38171k4.m53056to(c12025x64.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52920k4(C10969to c10969to) {
        c10969to.CloneTo(this.f38171k4);
    }
}
