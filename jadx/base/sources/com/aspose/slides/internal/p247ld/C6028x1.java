package com.aspose.slides.internal.p247ld;

import com.aspose.slides.internal.p084dj.C3166k4;
import com.aspose.slides.internal.p180ib.C4803du;
import com.aspose.slides.internal.p180ib.C4804dy;
import com.aspose.slides.internal.p180ib.InterfaceC4809to;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11898h4;
import com.aspose.slides.internal.p472w8.C11913yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.ld.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C6028x1 extends AbstractC6026k4 {

    /* JADX INFO: renamed from: x1 */
    private final C3166k4 f17073x1;

    public C6028x1(C11913yj c11913yj, C4804dy c4804dy) {
        super(c4804dy);
        this.f17073x1 = new C3166k4(c11913yj, c4804dy);
    }

    @Override // com.aspose.slides.internal.p247ld.AbstractC6026k4
    /* JADX INFO: renamed from: k4 */
    public void mo24331k4(InterfaceC4809to interfaceC4809to, C11898h4 c11898h4, float f, float f2, float f3, float f4) {
        float fM13534k4 = this.f17073x1.m13534k4(c11898h4);
        m24335k4(c11898h4.m55600fa(), interfaceC4809to, f, f2, fM13534k4 * f3, fM13534k4 * f4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m24335k4(C11896dy c11896dy, final InterfaceC4809to interfaceC4809to, final float f, final float f2, final float f3, final float f4) {
        C4803du.m19876k4(c11896dy, new InterfaceC4809to() { // from class: com.aspose.slides.internal.ld.x1.1
            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: k4 */
            public void mo9584k4() {
                interfaceC4809to.mo9584k4();
            }

            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: x1 */
            public void mo9602x1() {
            }

            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: k4 */
            public void mo9585k4(float f5, float f6) {
                interfaceC4809to.mo9585k4(C6028x1.this.m24330k4(f, f3, f4, f5, f6), C6028x1.this.m24332x1(f2, f3, f4, f5, f6));
            }

            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: x1 */
            public void mo9603x1(float f5, float f6) {
                interfaceC4809to.mo9603x1(C6028x1.this.m24330k4(f, f3, f4, f5, f6), C6028x1.this.m24332x1(f2, f3, f4, f5, f6));
            }

            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: k4 */
            public void mo9586k4(float f5, float f6, float f7, float f8) {
                interfaceC4809to.mo9586k4(C6028x1.this.m24330k4(f, f3, f4, f5, f6), C6028x1.this.m24332x1(f2, f3, f4, f5, f6), C6028x1.this.m24330k4(f, f3, f4, f7, f8), C6028x1.this.m24332x1(f2, f3, f4, f7, f8));
            }

            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: k4 */
            public void mo9587k4(float f5, float f6, float f7, float f8, float f9, float f10) {
                interfaceC4809to.mo9587k4(C6028x1.this.m24330k4(f, f3, f4, f5, f6), C6028x1.this.m24332x1(f2, f3, f4, f5, f6), C6028x1.this.m24330k4(f, f3, f4, f7, f8), C6028x1.this.m24332x1(f2, f3, f4, f7, f8), C6028x1.this.m24330k4(f, f3, f4, f9, f10), C6028x1.this.m24332x1(f2, f3, f4, f9, f10));
            }
        });
    }
}
