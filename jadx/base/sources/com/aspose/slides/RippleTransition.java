package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class RippleTransition extends TransitionValueBase implements IRippleTransition {

    /* JADX INFO: renamed from: x1 */
    private int f3231x1;

    public RippleTransition(int i) {
        super(i);
    }

    @Override // com.aspose.slides.IRippleTransition
    public final int getDirection() {
        return this.f3231x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m2476k4(IRippleTransition iRippleTransition) {
        if (iRippleTransition == null) {
            return false;
        }
        RippleTransition rippleTransition = (RippleTransition) iRippleTransition;
        return this.f3608k4 == rippleTransition.f3608k4 && this.f3231x1 == rippleTransition.f3231x1;
    }

    @Override // com.aspose.slides.IRippleTransition
    public final void setDirection(int i) {
        this.f3231x1 = i;
    }

    @Override // com.aspose.slides.TransitionValueBase
    /* JADX INFO: renamed from: k4 */
    public boolean mo1275k4(ITransitionValueBase iTransitionValueBase) {
        if (C7019kk.m27469x1(iTransitionValueBase, RippleTransition.class)) {
            return m2476k4((IRippleTransition) iTransitionValueBase);
        }
        return false;
    }
}
