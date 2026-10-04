package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class EightDirectionTransition extends TransitionValueBase implements IEightDirectionTransition {

    /* JADX INFO: renamed from: x1 */
    private int f2199x1;

    public EightDirectionTransition(int i) {
        super(i);
    }

    @Override // com.aspose.slides.IEightDirectionTransition
    public final int getDirection() {
        return this.f2199x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m1416k4(IEightDirectionTransition iEightDirectionTransition) {
        if (iEightDirectionTransition == null) {
            return false;
        }
        EightDirectionTransition eightDirectionTransition = (EightDirectionTransition) iEightDirectionTransition;
        return this.f3608k4 == eightDirectionTransition.f3608k4 && this.f2199x1 == eightDirectionTransition.f2199x1;
    }

    @Override // com.aspose.slides.IEightDirectionTransition
    public final void setDirection(int i) {
        this.f2199x1 = i;
    }

    @Override // com.aspose.slides.TransitionValueBase
    /* JADX INFO: renamed from: k4 */
    public boolean mo1275k4(ITransitionValueBase iTransitionValueBase) {
        if (C7019kk.m27469x1(iTransitionValueBase, EightDirectionTransition.class)) {
            return m1416k4((IEightDirectionTransition) iTransitionValueBase);
        }
        return false;
    }
}
