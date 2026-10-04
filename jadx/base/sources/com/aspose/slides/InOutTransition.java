package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class InOutTransition extends TransitionValueBase implements IInOutTransition {

    /* JADX INFO: renamed from: x1 */
    private int f2519x1;

    public InOutTransition(int i) {
        super(i);
    }

    @Override // com.aspose.slides.IInOutTransition
    public final int getDirection() {
        return this.f2519x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m1768k4(IInOutTransition iInOutTransition) {
        if (iInOutTransition == null) {
            return false;
        }
        InOutTransition inOutTransition = (InOutTransition) iInOutTransition;
        return this.f3608k4 == inOutTransition.f3608k4 && this.f2519x1 == inOutTransition.f2519x1;
    }

    @Override // com.aspose.slides.IInOutTransition
    public final void setDirection(int i) {
        this.f2519x1 = i;
    }

    @Override // com.aspose.slides.TransitionValueBase
    /* JADX INFO: renamed from: k4 */
    public boolean mo1275k4(ITransitionValueBase iTransitionValueBase) {
        if (C7019kk.m27469x1(iTransitionValueBase, InOutTransition.class)) {
            return m1768k4((IInOutTransition) iTransitionValueBase);
        }
        return false;
    }
}
