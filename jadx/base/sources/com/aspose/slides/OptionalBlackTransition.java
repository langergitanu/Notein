package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class OptionalBlackTransition extends TransitionValueBase implements IOptionalBlackTransition {

    /* JADX INFO: renamed from: x1 */
    private boolean f2888x1;

    public OptionalBlackTransition(int i) {
        super(i);
        this.f2888x1 = false;
    }

    @Override // com.aspose.slides.IOptionalBlackTransition
    public final boolean getFromBlack() {
        return this.f2888x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m2091k4(IOptionalBlackTransition iOptionalBlackTransition) {
        if (iOptionalBlackTransition == null) {
            return false;
        }
        OptionalBlackTransition optionalBlackTransition = (OptionalBlackTransition) iOptionalBlackTransition;
        return this.f3608k4 == optionalBlackTransition.f3608k4 && this.f2888x1 == optionalBlackTransition.f2888x1;
    }

    @Override // com.aspose.slides.IOptionalBlackTransition
    public final void setFromBlack(boolean z) {
        this.f2888x1 = z;
    }

    @Override // com.aspose.slides.TransitionValueBase
    /* JADX INFO: renamed from: k4 */
    public boolean mo1275k4(ITransitionValueBase iTransitionValueBase) {
        if (C7019kk.m27469x1(iTransitionValueBase, OptionalBlackTransition.class)) {
            return m2091k4((IOptionalBlackTransition) iTransitionValueBase);
        }
        return false;
    }
}
