package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class CornerDirectionTransition extends TransitionValueBase implements ICornerDirectionTransition {

    /* JADX INFO: renamed from: x1 */
    private int f2071x1;

    public CornerDirectionTransition(int i) {
        super(i);
    }

    @Override // com.aspose.slides.ICornerDirectionTransition
    public final int getDirection() {
        return this.f2071x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m1274k4(ICornerDirectionTransition iCornerDirectionTransition) {
        if (iCornerDirectionTransition == null) {
            return false;
        }
        CornerDirectionTransition cornerDirectionTransition = (CornerDirectionTransition) iCornerDirectionTransition;
        return this.f3608k4 == cornerDirectionTransition.f3608k4 && this.f2071x1 == cornerDirectionTransition.f2071x1;
    }

    @Override // com.aspose.slides.ICornerDirectionTransition
    public final void setDirection(int i) {
        this.f2071x1 = i;
    }

    @Override // com.aspose.slides.TransitionValueBase
    /* JADX INFO: renamed from: k4 */
    public boolean mo1275k4(ITransitionValueBase iTransitionValueBase) {
        if (C7019kk.m27469x1(iTransitionValueBase, CornerDirectionTransition.class)) {
            return m1274k4((ICornerDirectionTransition) iTransitionValueBase);
        }
        return false;
    }
}
