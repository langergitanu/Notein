package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class FlyThroughTransition extends TransitionValueBase implements IFlyThroughTransition {

    /* JADX INFO: renamed from: kk */
    private boolean f2293kk;

    /* JADX INFO: renamed from: x1 */
    private int f2294x1;

    public FlyThroughTransition(int i) {
        super(i);
    }

    @Override // com.aspose.slides.IFlyThroughTransition
    public final int getDirection() {
        return this.f2294x1;
    }

    @Override // com.aspose.slides.IFlyThroughTransition
    public final boolean hasBounce() {
        return this.f2293kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m1483k4(IFlyThroughTransition iFlyThroughTransition) {
        if (iFlyThroughTransition == null) {
            return false;
        }
        FlyThroughTransition flyThroughTransition = (FlyThroughTransition) iFlyThroughTransition;
        return this.f3608k4 == flyThroughTransition.f3608k4 && this.f2294x1 == flyThroughTransition.f2294x1 && this.f2293kk == flyThroughTransition.f2293kk;
    }

    @Override // com.aspose.slides.IFlyThroughTransition
    public final void setBounce(boolean z) {
        this.f2293kk = z;
    }

    @Override // com.aspose.slides.IFlyThroughTransition
    public final void setDirection(int i) {
        this.f2294x1 = i;
    }

    @Override // com.aspose.slides.TransitionValueBase
    /* JADX INFO: renamed from: k4 */
    public boolean mo1275k4(ITransitionValueBase iTransitionValueBase) {
        if (C7019kk.m27469x1(iTransitionValueBase, FlyThroughTransition.class)) {
            return m1483k4((IFlyThroughTransition) iTransitionValueBase);
        }
        return false;
    }
}
