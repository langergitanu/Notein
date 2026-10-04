package com.aspose.slides;

import com.aspose.slides.internal.p151gj.C4321k4;
import com.aspose.slides.internal.p172hu.AbstractC4682du;
import com.aspose.slides.internal.p269m8.C6328k4;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;

/* JADX INFO: renamed from: com.aspose.slides.hr */
/* JADX INFO: loaded from: classes3.dex */
class C1221hr implements fsr {

    /* JADX INFO: renamed from: k4 */
    private final C12009k4 f5567k4;

    /* JADX INFO: renamed from: kk */
    private float f5568kk;

    /* JADX INFO: renamed from: x1 */
    private final C12009k4 f5569x1;

    public C1221hr(C12009k4 c12009k4, C12009k4 c12009k42) {
        this.f5567k4 = c12009k4;
        this.f5569x1 = c12009k42;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public int m7282k4(int i, int i2) {
        return m7283k4(i, i2, this.f5568kk);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m7283k4(int i, int i2, float f) {
        C4321k4 c4321k4Clone = C4321k4.m17379k4(i).Clone();
        C4321k4 c4321k4Clone2 = C4321k4.m17379k4(i2).Clone();
        C4321k4 c4321k4 = new C4321k4();
        float f2 = 1.0f - f;
        c4321k4.f11802x1 = OooO0o.OooO00o(c4321k4Clone2.f11802x1 & 255, f, (c4321k4Clone.f11802x1 & 255) * f2, 13);
        c4321k4.f11800kk = OooO0o.OooO00o(c4321k4Clone2.f11800kk & 255, f, (c4321k4Clone.f11800kk & 255) * f2, 13);
        c4321k4.f11801to = OooO0o.OooO00o(c4321k4Clone2.f11801to & 255, f, (c4321k4Clone.f11801to & 255) * f2, 13);
        c4321k4.f11799du = OooO0o.OooO00o(c4321k4Clone2.f11799du & 255, f, (c4321k4Clone.f11799du & 255) * f2, 13);
        return c4321k4.m17384x1();
    }

    @Override // com.aspose.slides.fsr
    /* JADX INFO: renamed from: k4 */
    public final void mo3090k4(float f, AbstractC12008jd abstractC12008jd) {
        this.f5568kk = f;
        C6328k4.m25903k4(this.f5567k4, this.f5569x1, new AbstractC4682du<Integer, Integer, Integer>() { // from class: com.aspose.slides.hr.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Export.FramesStream.TransitionEffects.FadeWithAlphaEffect.GetPixel(int,int)";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4682du
            /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public Integer mo445k4(Integer num, Integer num2) {
                return Integer.valueOf(C1221hr.this.m7282k4(num.intValue(), num2.intValue()));
            }
        });
        abstractC12008jd.mo17589x1(this.f5567k4, 0, 0);
    }
}
