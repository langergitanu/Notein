package com.aspose.slides.internal.p114ep;

import com.aspose.slides.internal.p067cu.C2631kk;
import com.aspose.slides.internal.p067cu.C2633x1;
import com.aspose.slides.internal.p156gw.InterfaceC4413v4;
import com.aspose.slides.internal.p180ib.C4803du;
import com.aspose.slides.internal.p180ib.InterfaceC4809to;
import com.aspose.slides.internal.p340pm.C9465k4;
import com.aspose.slides.internal.p340pm.C9467to;

/* JADX INFO: renamed from: com.aspose.slides.internal.ep.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C3780k4 {

    /* JADX INFO: renamed from: k4 */
    private C2631kk f10291k4;

    /* JADX INFO: renamed from: x1 */
    private final boolean f10292x1;

    public C3780k4(C3781x1 c3781x1, float f, float f2, float f3, float f4, boolean z) {
        double d;
        double d2;
        double[] dArrM15106k4 = m15106k4(c3781x1, f, f2, f3, f4, z);
        double d3 = dArrM15106k4[0];
        double d4 = dArrM15106k4[1];
        boolean z2 = d3 > d4;
        this.f10292x1 = z2;
        if (z2) {
            d2 = d3;
            d = d4;
        } else {
            d = d3;
            d2 = d4;
        }
        this.f10291k4 = m15104k4(new C9465k4(0.0d, 0.0d, c3781x1.f10297x1, c3781x1.f10296kk, c3781x1.f10295k4, d, d2, false));
    }

    /* JADX INFO: renamed from: k4 */
    public C2631kk m15105k4() {
        return this.f10291k4;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m15107x1() {
        return this.f10292x1;
    }

    /* JADX INFO: renamed from: k4 */
    private C2631kk m15104k4(C9465k4 c9465k4) {
        InterfaceC4413v4 interfaceC4413v4Mo8359kk = c9465k4.mo8359kk(null);
        final C2631kk c2631kk = new C2631kk();
        C4803du.m19875k4(interfaceC4413v4Mo8359kk, new InterfaceC4809to() { // from class: com.aspose.slides.internal.ep.k4.1
            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: k4 */
            public void mo9584k4() {
            }

            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: x1 */
            public void mo9602x1() {
            }

            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: k4 */
            public void mo9585k4(float f, float f2) {
                c2631kk.m12025x1(C2633x1.m12029k4(f, f2));
            }

            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: x1 */
            public void mo9603x1(float f, float f2) {
                c2631kk.m12025x1(C2633x1.m12029k4(f, f2));
            }

            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: k4 */
            public void mo9586k4(float f, float f2, float f3, float f4) {
                c2631kk.m12025x1(C2633x1.m12030k4(f, f2, f3, f4));
            }

            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: k4 */
            public void mo9587k4(float f, float f2, float f3, float f4, float f5, float f6) {
                c2631kk.m12025x1(C2633x1.m12031k4(f, f2, f3, f4, f5, f6));
            }
        });
        return c2631kk;
    }

    /* JADX INFO: renamed from: k4 */
    public double[] m15106k4(C3781x1 c3781x1, float f, float f2, float f3, float f4, boolean z) {
        double dM15109k4 = c3781x1.m15109k4(C9467to.m46533x1(f, f2, 1.0f, 0.0f));
        double dM15109k42 = c3781x1.m15109k4(C9467to.m46533x1(f3, f4, 1.0f, 0.0f));
        double d = c3781x1.f10295k4;
        double d2 = dM15109k4 - d;
        double d3 = dM15109k42 - d;
        if (z) {
            if (d3 >= d2) {
                d3 -= 6.283185307179586d;
            }
        } else if (d2 >= d3) {
            d2 -= 6.283185307179586d;
        }
        return new double[]{d2, d3};
    }
}
