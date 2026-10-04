package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class LeftRightDirectionTransition extends TransitionValueBase implements ILeftRightDirectionTransition {

    /* JADX INFO: renamed from: x1 */
    private int f2587x1;

    public LeftRightDirectionTransition(int i) {
        super(i);
    }

    @Override // com.aspose.slides.ILeftRightDirectionTransition
    public final int getDirection() {
        return this.f2587x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m1856k4(ILeftRightDirectionTransition iLeftRightDirectionTransition) {
        if (iLeftRightDirectionTransition == null) {
            return false;
        }
        LeftRightDirectionTransition leftRightDirectionTransition = (LeftRightDirectionTransition) iLeftRightDirectionTransition;
        return this.f3608k4 == leftRightDirectionTransition.f3608k4 && this.f2587x1 == leftRightDirectionTransition.f2587x1;
    }

    @Override // com.aspose.slides.ILeftRightDirectionTransition
    public final void setDirection(int i) {
        this.f2587x1 = i;
    }

    @Override // com.aspose.slides.TransitionValueBase
    /* JADX INFO: renamed from: k4 */
    public boolean mo1275k4(ITransitionValueBase iTransitionValueBase) {
        if (C7019kk.m27469x1(iTransitionValueBase, LeftRightDirectionTransition.class)) {
            return m1856k4((ILeftRightDirectionTransition) iTransitionValueBase);
        }
        return false;
    }
}
