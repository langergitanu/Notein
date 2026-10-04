package com.aspose.slides;

import com.aspose.slides.internal.p151gj.C4321k4;
import com.aspose.slides.internal.p151gj.C4329x6;
import com.aspose.slides.internal.p172hu.AbstractC4682du;
import com.aspose.slides.internal.p269m8.C6328k4;
import com.aspose.slides.internal.p475wh.C12014ne;

/* JADX INFO: loaded from: classes3.dex */
final class q6c extends AbstractC13778li implements InterfaceC14169n6, InterfaceC14751wu {

    /* JADX INFO: renamed from: du */
    private final qwm f48260du;

    /* JADX INFO: renamed from: h4 */
    private final boolean f48261h4;

    /* JADX INFO: renamed from: to */
    private final InterfaceC0862co f48262to;

    private q6c(AbstractC14278pe abstractC14278pe, boolean z, InterfaceC0862co interfaceC0862co, boolean z2, C14571tq c14571tq) {
        super(abstractC14278pe, z2);
        this.f48262to = interfaceC0862co;
        this.f48261h4 = z;
        C12014ne c12014ne = this.f46003x1;
        this.f48260du = new qwm(z ? c12014ne.m56683x1() : c12014ne.m56663c5(), c14571tq.m71287x1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public int m69430k4(C4329x6 c4329x6, int i) {
        float[] fArrM69782k4 = this.f48260du.m69782k4();
        float f = this.f48261h4 ? fArrM69782k4[c4329x6.f11828to] : fArrM69782k4[c4329x6.f11827kk];
        C4321k4 c4321k4Clone = C4321k4.m17379k4(i).Clone();
        c4321k4Clone.f11802x1 = C22202OooO0oo.OooO00o(f, c4321k4Clone.f11802x1 & 255, 13);
        return c4321k4Clone.m17384x1();
    }

    /* JADX INFO: renamed from: k4 */
    public static q6c m69432k4(Paragraph paragraph, Shape shape, C14571tq c14571tq, boolean z, boolean z2) {
        return new q6c(new qic(paragraph, shape), z, new rxa(paragraph, c14571tq), z2, c14571tq);
    }

    /* JADX INFO: renamed from: k4 */
    public static q6c m69433k4(Shape shape, C14571tq c14571tq, boolean z, boolean z2) {
        return new q6c(c14571tq.m71278k4(shape), z, new oi5(shape, c14571tq), z2, c14571tq);
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2023k4() {
        mo2024k4(1.0f);
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2024k4(float f) {
        qwm qwmVar = this.f48260du;
        if (!this.f46002kk) {
            f = 1.0f - f;
        }
        qwmVar.m69781k4(f);
        this.f48262to.mo4695k4(this);
    }

    @Override // com.aspose.slides.InterfaceC14169n6
    /* JADX INFO: renamed from: k4 */
    public final void mo67868k4(omq omqVar) {
        C6328k4.m25904k4(omqVar.m74625qq(), this.f46003x1.Clone(), new AbstractC4682du<C4329x6, Integer, Integer>() { // from class: com.aspose.slides.q6c.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Export.FramesStream.AnimationPlaying.Players.RandomBarPlayer.GetFadePixel(Aspose.Foundation.Drawing.Vector2dInt32,int)";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4682du
            /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public Integer mo445k4(C4329x6 c4329x6, Integer num) {
                return Integer.valueOf(q6c.this.m69430k4(c4329x6, num.intValue()));
            }
        });
    }
}
