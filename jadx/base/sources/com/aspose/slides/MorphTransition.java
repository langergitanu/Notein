package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class MorphTransition extends TransitionValueBase implements IMorphTransition {

    /* JADX INFO: renamed from: x1 */
    private int f2813x1;

    public MorphTransition(int i) {
        super(i);
    }

    @Override // com.aspose.slides.IMorphTransition
    public final int getMorphType() {
        return this.f2813x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m2011k4(IMorphTransition iMorphTransition) {
        if (iMorphTransition == null) {
            return false;
        }
        MorphTransition morphTransition = (MorphTransition) iMorphTransition;
        return this.f3608k4 == morphTransition.f3608k4 && this.f2813x1 == morphTransition.f2813x1;
    }

    @Override // com.aspose.slides.IMorphTransition
    public final void setMorphType(int i) {
        this.f2813x1 = i;
    }

    @Override // com.aspose.slides.TransitionValueBase
    /* JADX INFO: renamed from: k4 */
    public boolean mo1275k4(ITransitionValueBase iTransitionValueBase) {
        if (C7019kk.m27469x1(iTransitionValueBase, MorphTransition.class)) {
            return m2011k4((IMorphTransition) iTransitionValueBase);
        }
        return false;
    }
}
