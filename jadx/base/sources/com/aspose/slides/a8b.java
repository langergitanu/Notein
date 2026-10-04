package com.aspose.slides;

import com.aspose.slides.internal.p151gj.C4329x6;
import com.aspose.slides.internal.p172hu.AbstractC4683h4;
import com.aspose.slides.internal.p269m8.C6328k4;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.C14050ca;

/* JADX INFO: loaded from: classes3.dex */
class a8b implements fsr {

    /* JADX INFO: renamed from: k4 */
    private final C12009k4 f3849k4;

    /* JADX INFO: renamed from: kk */
    private final boolean f3850kk;

    /* JADX INFO: renamed from: to */
    private final qwm f3851to;

    /* JADX INFO: renamed from: x1 */
    private final C12009k4 f3852x1;

    public a8b(C12009k4 c12009k4, C12009k4 c12009k42, boolean z, C14050ca c14050ca) {
        this.f3849k4 = c12009k4;
        this.f3852x1 = c12009k42;
        this.f3850kk = z;
        this.f3851to = new qwm(z ? c12009k4.mo15757m9() : c12009k4.mo15760yj(), c14050ca);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public int m3414k4(C4329x6 c4329x6, int i, int i2) {
        float[] fArrM69782k4 = this.f3851to.m69782k4();
        return C1221hr.m7283k4(i, i2, this.f3850kk ? fArrM69782k4[c4329x6.f11828to] : fArrM69782k4[c4329x6.f11827kk]);
    }

    @Override // com.aspose.slides.fsr
    /* JADX INFO: renamed from: k4 */
    public final void mo3090k4(float f, AbstractC12008jd abstractC12008jd) {
        this.f3851to.m69781k4(f);
        C12009k4 c12009k4 = this.f3849k4;
        C12009k4 c12009k42 = this.f3852x1;
        C4329x6 c4329x6 = C4329x6.f11825k4;
        C6328k4.m25902k4(c12009k4, c12009k42, c4329x6.Clone(), c4329x6.Clone(), new C4329x6(this.f3849k4.mo15760yj(), this.f3849k4.mo15757m9()), new AbstractC4683h4<C4329x6, Integer, Integer, Integer>() { // from class: com.aspose.slides.a8b.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Export.FramesStream.TransitionEffects.RandomBarTransition.GetPixel(Aspose.Foundation.Drawing.Vector2dInt32,int,int)";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4683h4
            /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public Integer mo3415k4(C4329x6 c4329x62, Integer num, Integer num2) {
                return Integer.valueOf(a8b.this.m3414k4(c4329x62, num.intValue(), num2.intValue()));
            }
        });
        abstractC12008jd.mo17589x1(this.f3849k4, 0, 0);
    }
}
