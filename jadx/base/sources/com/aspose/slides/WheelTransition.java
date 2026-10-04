package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class WheelTransition extends TransitionValueBase implements IWheelTransition {

    /* JADX INFO: renamed from: x1 */
    private long f3707x1;

    public WheelTransition(int i) {
        super(i);
    }

    @Override // com.aspose.slides.IWheelTransition
    public final long getSpokes() {
        return this.f3707x1;
    }

    @Override // com.aspose.slides.TransitionValueBase
    /* JADX INFO: renamed from: k4 */
    public boolean mo1275k4(ITransitionValueBase iTransitionValueBase) {
        if (C7019kk.m27469x1(iTransitionValueBase, WheelTransition.class)) {
            return m3091k4((IWheelTransition) iTransitionValueBase);
        }
        return false;
    }

    @Override // com.aspose.slides.IWheelTransition
    public final void setSpokes(long j) {
        this.f3707x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m3091k4(IWheelTransition iWheelTransition) {
        if (iWheelTransition == null) {
            return false;
        }
        WheelTransition wheelTransition = (WheelTransition) iWheelTransition;
        return this.f3608k4 == wheelTransition.f3608k4 && this.f3707x1 == wheelTransition.f3707x1;
    }
}
