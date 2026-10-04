package com.aspose.slides;

import com.aspose.slides.internal.p151gj.C4321k4;
import com.aspose.slides.internal.p172hu.AbstractC4687to;
import com.aspose.slides.internal.p269m8.C6328k4;

/* JADX INFO: renamed from: com.aspose.slides.yy */
/* JADX INFO: loaded from: classes3.dex */
final class C14865yy extends AbstractC13778li implements InterfaceC14169n6, InterfaceC14751wu {

    /* JADX INFO: renamed from: du */
    private float f50423du;

    /* JADX INFO: renamed from: to */
    private final InterfaceC0862co f50424to;

    private C14865yy(boolean z, AbstractC14278pe abstractC14278pe, InterfaceC0862co interfaceC0862co) {
        super(abstractC14278pe, z);
        this.f50423du = 0.0f;
        this.f50424to = interfaceC0862co;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public int m74142k4(int i) {
        C4321k4 c4321k4Clone = C4321k4.m17379k4(i).Clone();
        c4321k4Clone.f11802x1 = C22202OooO0oo.OooO00o(this.f50423du, c4321k4Clone.f11802x1 & 255, 13);
        return c4321k4Clone.m17384x1();
    }

    /* JADX INFO: renamed from: k4 */
    public static C14865yy m74144k4(Paragraph paragraph, Shape shape, C14571tq c14571tq, boolean z) {
        return new C14865yy(z, new qic(paragraph, shape), new rxa(paragraph, c14571tq));
    }

    /* JADX INFO: renamed from: k4 */
    public static C14865yy m74145k4(Shape shape, C14571tq c14571tq, boolean z) {
        return new C14865yy(z, c14571tq.m71278k4(shape), new oi5(shape, c14571tq));
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2023k4() {
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2024k4(float f) {
        if (!this.f46002kk) {
            f = 1.0f - f;
        }
        this.f50423du = f;
        this.f50424to.mo4695k4(this);
    }

    @Override // com.aspose.slides.InterfaceC14169n6
    /* JADX INFO: renamed from: k4 */
    public final void mo67868k4(omq omqVar) {
        C6328k4.m25905k4(omqVar.m74625qq(), this.f46003x1.Clone(), new AbstractC4687to<Integer, Integer>() { // from class: com.aspose.slides.yy.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Export.FramesStream.AnimationPlaying.Players.FadePlayer.GetFadePixel(int)";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4687to
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public Integer invoke(Integer num) {
                return Integer.valueOf(C14865yy.this.m74142k4(num.intValue()));
            }
        });
    }
}
