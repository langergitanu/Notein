package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p151gj.C4329x6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.p559ms.System.AbstractC14071k4;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.qb */
/* JADX INFO: loaded from: classes3.dex */
final class C14336qb implements IDisposable, InterfaceC14169n6, InterfaceC14751wu {

    /* JADX INFO: renamed from: du */
    private final AbstractC14278pe f48292du;

    /* JADX INFO: renamed from: k4 */
    private final C0834bx f48293k4;

    /* JADX INFO: renamed from: kk */
    private C4329x6 f48294kk = new C4329x6();

    /* JADX INFO: renamed from: to */
    private boolean f48295to;

    /* JADX INFO: renamed from: x1 */
    private final InterfaceC0862co f48296x1;

    private C14336qb(AbstractC14278pe abstractC14278pe, FilterEffect filterEffect, InterfaceC0862co interfaceC0862co) {
        InterfaceC1225hv wheelEffect;
        this.f48295to = true;
        this.f48296x1 = interfaceC0862co;
        this.f48292du = abstractC14278pe;
        abstractC14278pe.f48035x1.mo27432x1(new AbstractC14071k4<AbstractC14278pe>() { // from class: com.aspose.slides.qb.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Export.FramesStream.AnimationPlaying.Players.BlendEffectPlayer.OnShapePositionChanged(Aspose.Slides.Export.FramesStream.AnimationPlaying.IRectNotifiable)";
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14071k4
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public void invoke(AbstractC14278pe abstractC14278pe2) {
                C14336qb.this.m69509k4(abstractC14278pe2);
            }
        });
        m69508k4(abstractC14278pe.mo69028k4().Clone());
        C12023wl c12023wl = new C12023wl(C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(abstractC14278pe.mo69029x1().f47836k4)), 14) + 2, C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(abstractC14278pe.mo69029x1().f47837x1)), 14) + 2);
        if (filterEffect.getType() == 1) {
            boolean z = filterEffect.getReveal() == 1;
            int subtype = filterEffect.getSubtype();
            if (subtype == 11 || subtype == 12) {
                wheelEffect = new lev(c12023wl.Clone(), true, filterEffect.getSubtype() != 12 ? 1 : 0, z);
            } else {
                if (subtype != 15 && subtype != 16) {
                    throw new NotImplementedException();
                }
                wheelEffect = new lev(c12023wl.Clone(), false, filterEffect.getSubtype() == 16 ? 0 : 1, z);
            }
        } else if (filterEffect.getType() == 18) {
            int subtype2 = filterEffect.getSubtype();
            wheelEffect = new x6o(c12023wl.Clone(), subtype2 != 2 ? subtype2 != 17 ? subtype2 != 23 ? 0.0d : 1.5707963267948966d : 3.141592653589793d : -1.5707963267948966d, filterEffect.getReveal() == 1);
        } else {
            if (filterEffect.getType() != 17) {
                throw new NotImplementedException();
            }
            wheelEffect = new WheelEffect(c12023wl.Clone(), 0);
            this.f48295to = false;
        }
        this.f48293k4 = new C0834bx(c12023wl.Clone(), wheelEffect);
    }

    /* JADX INFO: renamed from: k4 */
    public static C14336qb m69506k4(Paragraph paragraph, Shape shape, C14571tq c14571tq, FilterEffect filterEffect) {
        return new C14336qb(new qic(paragraph, shape), filterEffect, new rxa(paragraph, c14571tq));
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f48292du.f48035x1.mo27429k4(new AbstractC14071k4<AbstractC14278pe>() { // from class: com.aspose.slides.qb.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Export.FramesStream.AnimationPlaying.Players.BlendEffectPlayer.OnShapePositionChanged(Aspose.Slides.Export.FramesStream.AnimationPlaying.IRectNotifiable)";
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14071k4
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public void invoke(AbstractC14278pe abstractC14278pe) {
                C14336qb.this.m69509k4(abstractC14278pe);
            }
        });
        if (C7019kk.m27469x1(this.f48292du, vjj.class)) {
            ((vjj) this.f48292du).m72334to();
        }
        this.f48293k4.m4346k4();
    }

    /* JADX INFO: renamed from: k4 */
    public static C14336qb m69507k4(Shape shape, C14571tq c14571tq, FilterEffect filterEffect) {
        return new C14336qb(c14571tq.m71278k4(shape), filterEffect, new oi5(shape, c14571tq));
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2023k4() {
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2024k4(float f) {
        C0834bx c0834bx = this.f48293k4;
        if (this.f48295to) {
            f = 1.0f - f;
        }
        c0834bx.m4347k4(f);
        this.f48296x1.mo4695k4(this);
    }

    /* JADX INFO: renamed from: k4 */
    private void m69508k4(oju ojuVar) {
        this.f48294kk = new C4329x6(C7019kk.m27462to(Float.valueOf(ojuVar.f47836k4), 13), C7019kk.m27462to(Float.valueOf(ojuVar.f47837x1), 13));
        r0.f11827kk--;
        r0.f11828to--;
    }

    @Override // com.aspose.slides.InterfaceC14169n6
    /* JADX INFO: renamed from: k4 */
    public final void mo67868k4(omq omqVar) {
        this.f48293k4.m4348k4(this.f48294kk.Clone(), omqVar.m74625qq());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m69509k4(AbstractC14278pe abstractC14278pe) {
        m69508k4(abstractC14278pe.mo69028k4().Clone());
    }
}
