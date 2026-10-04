package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class RevealTransition extends TransitionValueBase implements IRevealTransition {

    /* JADX INFO: renamed from: kk */
    private boolean f3229kk;

    /* JADX INFO: renamed from: x1 */
    private int f3230x1;

    public RevealTransition(int i) {
        super(i);
    }

    @Override // com.aspose.slides.IRevealTransition
    public final int getDirection() {
        return this.f3230x1;
    }

    @Override // com.aspose.slides.IRevealTransition
    public final boolean getThroughBlack() {
        return this.f3229kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m2475k4(IRevealTransition iRevealTransition) {
        if (iRevealTransition == null) {
            return false;
        }
        RevealTransition revealTransition = (RevealTransition) iRevealTransition;
        return this.f3608k4 == revealTransition.f3608k4 && this.f3230x1 == revealTransition.f3230x1 && this.f3229kk == revealTransition.f3229kk;
    }

    @Override // com.aspose.slides.IRevealTransition
    public final void setDirection(int i) {
        this.f3230x1 = i;
    }

    @Override // com.aspose.slides.IRevealTransition
    public final void setThroughBlack(boolean z) {
        this.f3229kk = z;
    }

    @Override // com.aspose.slides.TransitionValueBase
    /* JADX INFO: renamed from: k4 */
    public boolean mo1275k4(ITransitionValueBase iTransitionValueBase) {
        if (C7019kk.m27469x1(iTransitionValueBase, RevealTransition.class)) {
            return m2475k4((IRevealTransition) iTransitionValueBase);
        }
        return false;
    }
}
