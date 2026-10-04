package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: renamed from: com.aspose.slides.n4 */
/* JADX INFO: loaded from: classes3.dex */
final class C14166n4 implements InterfaceC14169n6, InterfaceC14751wu {

    /* JADX INFO: renamed from: du */
    private boolean f47469du;

    /* JADX INFO: renamed from: h4 */
    private float f47470h4 = 0.0f;

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC0862co f47471k4;

    /* JADX INFO: renamed from: kk */
    private final C14819xv f47472kk;

    /* JADX INFO: renamed from: to */
    private final boolean f47473to;

    /* JADX INFO: renamed from: x1 */
    private final AbstractC4685kk<ohe> f47474x1;

    private C14166n4(FilterEffect filterEffect, InterfaceC0862co interfaceC0862co, AbstractC4685kk<ohe> abstractC4685kk) {
        this.f47471k4 = interfaceC0862co;
        this.f47474x1 = abstractC4685kk;
        this.f47473to = filterEffect.getSubtype() == 14;
        int type = filterEffect.getType();
        int i = 3;
        if (type == 3) {
            i = 2;
        } else if (type == 6) {
            i = 1;
        } else if (type != 11) {
            i = 0;
        }
        this.f47472kk = new C14819xv(i);
        this.f47469du = filterEffect.getSubtype() == 14;
        if (filterEffect.getReveal() == 2) {
            this.f47469du = !this.f47469du;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C14166n4 m67866k4(IShape iShape, C14571tq c14571tq, FilterEffect filterEffect) {
        final oi5 oi5Var = new oi5(iShape, c14571tq);
        return new C14166n4(filterEffect, oi5Var, new AbstractC4685kk<ohe>() { // from class: com.aspose.slides.n4.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(oi5Var) + "Aspose.Slides.Export.FramesStream.AnimationPlaying.Players.ShapePlayContext.GetRect()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public ohe invoke() {
                return oi5Var.m68578k4();
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public static C14166n4 m67867k4(Paragraph paragraph, Shape shape, C14571tq c14571tq, FilterEffect filterEffect) {
        rxa rxaVar = new rxa(paragraph, c14571tq);
        final qic qicVar = new qic(paragraph, shape);
        return new C14166n4(filterEffect, rxaVar, new AbstractC4685kk<ohe>() { // from class: com.aspose.slides.n4.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(qicVar) + "Aspose.Slides.Export.FramesStream.AnimationPlaying.ParagraphRectNotifiable.GetRect()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public ohe invoke() {
                return qicVar.m69665kk();
            }
        });
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2023k4() {
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2024k4(float f) {
        if (!this.f47473to) {
            f = 1.0f - f;
        }
        this.f47470h4 = f;
        this.f47471k4.mo4695k4(this);
    }

    @Override // com.aspose.slides.InterfaceC14169n6
    /* JADX INFO: renamed from: k4 */
    public final void mo67868k4(omq omqVar) {
        ohe oheVarClone = this.f47474x1.invoke().Clone();
        this.f47472kk.m73609k4(oju.m68619k4(oheVarClone.f47808k4, oju.m68618k4(oheVarClone.f47809x1, 2)).Clone(), oheVarClone.f47809x1.Clone());
        this.f47472kk.m73608k4(this.f47470h4);
        AbstractC12008jd abstractC12008jdM74608ar = omqVar.m74608ar();
        abstractC12008jdM74608ar.mo17497k4(this.f47472kk.f50208k4, this.f47469du ? 4 : 0);
        abstractC12008jdM74608ar.mo17517k4(C12003du.m56458up().Clone());
        abstractC12008jdM74608ar.mo17573to();
    }
}
