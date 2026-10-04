package com.aspose.slides.internal.p067cu;

import com.aspose.slides.internal.p180ib.C4803du;
import com.aspose.slides.internal.p180ib.InterfaceC4809to;
import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.cu.to */
/* JADX INFO: loaded from: classes3.dex */
public class C2632to implements InterfaceC4809to {

    /* JADX INFO: renamed from: x1 */
    private final C2631kk f8445x1 = new C2631kk();

    /* JADX INFO: renamed from: k4 */
    public final C12025x6 f8444k4 = new C12025x6();

    /* JADX INFO: renamed from: k4 */
    public static C2631kk m12026k4(C11896dy c11896dy) {
        C2632to c2632to = new C2632to();
        C4803du.m19876k4(c11896dy, c2632to);
        return c2632to.m12027kk();
    }

    /* JADX INFO: renamed from: kk */
    public C2631kk m12027kk() {
        return this.f8445x1;
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: x1 */
    public void mo9602x1() {
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9584k4() {
        this.f8445x1.m12025x1(C2633x1.m12028k4());
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: x1 */
    public void mo9603x1(float f, float f2) {
        if (C9467to.m46529k4(this.f8444k4, new C12025x6(f, f2), 0.001f)) {
            return;
        }
        this.f8445x1.m12025x1(C2633x1.m12032x1(f, f2));
        this.f8444k4.m56891k4(f);
        this.f8444k4.m56898x1(f2);
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9585k4(float f, float f2) {
        this.f8445x1.m12025x1(C2633x1.m12029k4(f, f2));
        this.f8444k4.m56891k4(f);
        this.f8444k4.m56898x1(f2);
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9586k4(float f, float f2, float f3, float f4) {
        this.f8445x1.m12025x1(C2633x1.m12030k4(f, f2, f3, f4));
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9587k4(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f8445x1.m12025x1(C2633x1.m12031k4(f, f2, f3, f4, f5, f6));
    }
}
