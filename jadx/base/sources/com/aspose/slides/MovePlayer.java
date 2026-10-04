package com.aspose.slides;

import com.aspose.slides.internal.p395sa.AbstractC10169x1;
import com.aspose.slides.internal.p395sa.C10167k4;
import com.aspose.slides.p559ms.System.AbstractC14078m9;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.InterfaceC14083qm;

/* JADX INFO: loaded from: classes3.dex */
final class MovePlayer extends AbstractC14206nx implements InterfaceC14751wu {

    /* JADX INFO: renamed from: kk */
    public final GetPointHandler f2827kk;

    /* JADX INFO: renamed from: x1 */
    public final C14571tq f2828x1;

    public static abstract class GetPointHandler extends AbstractC14085qw {
        public final InterfaceC14083qm beginInvoke(final float f, AbstractC14078m9 abstractC14078m9, Object obj) {
            return C10167k4.m50006k4(new AbstractC10169x1(this, abstractC14078m9, obj) { // from class: com.aspose.slides.MovePlayer.GetPointHandler.1
                @Override // com.aspose.slides.internal.p395sa.AbstractC10169x1
                public void beginInvoke() {
                    GetPointHandler getPointHandler = GetPointHandler.this;
                    getPointHandler.pushResult(getPointHandler.invoke(f));
                }
            });
        }

        public final oju endInvoke(InterfaceC14083qm interfaceC14083qm) {
            C10167k4.m50008k4(this, interfaceC14083qm);
            return (oju) peekResult();
        }

        public abstract oju invoke(float f);
    }

    public MovePlayer(C14571tq c14571tq, IShape iShape, GetPointHandler getPointHandler) {
        super(iShape);
        this.f2828x1 = c14571tq;
        this.f2827kk = getPointHandler;
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2023k4() {
        mo2024k4(1.0f);
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2024k4(float f) {
        this.f2828x1.m71288x1(this.f47636k4, this.f2827kk.invoke(f).Clone().Clone());
    }
}
