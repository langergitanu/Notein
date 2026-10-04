package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class EmptyTransition extends TransitionValueBase implements IEmptyTransition {
    public EmptyTransition(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m1418k4(IEmptyTransition iEmptyTransition) {
        return iEmptyTransition != null && this.f3608k4 == ((EmptyTransition) iEmptyTransition).f3608k4;
    }

    @Override // com.aspose.slides.TransitionValueBase
    /* JADX INFO: renamed from: k4 */
    public boolean mo1275k4(ITransitionValueBase iTransitionValueBase) {
        if (C7019kk.m27469x1(iTransitionValueBase, EmptyTransition.class)) {
            return m1418k4((IEmptyTransition) iTransitionValueBase);
        }
        return false;
    }
}
