package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class ShredTransition extends TransitionValueBase implements IShredTransition {

    /* JADX INFO: renamed from: kk */
    private int f3372kk;

    /* JADX INFO: renamed from: x1 */
    private int f3373x1;

    public ShredTransition(int i) {
        super(i);
    }

    @Override // com.aspose.slides.IShredTransition
    public final int getDirection() {
        return this.f3373x1;
    }

    @Override // com.aspose.slides.IShredTransition
    public final int getPattern() {
        return this.f3372kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m2667k4(IShredTransition iShredTransition) {
        if (iShredTransition == null) {
            return false;
        }
        ShredTransition shredTransition = (ShredTransition) iShredTransition;
        return this.f3608k4 == shredTransition.f3608k4 && this.f3373x1 == shredTransition.f3373x1 && this.f3372kk == shredTransition.f3372kk;
    }

    @Override // com.aspose.slides.IShredTransition
    public final void setDirection(int i) {
        this.f3373x1 = i;
    }

    @Override // com.aspose.slides.IShredTransition
    public final void setPattern(int i) {
        this.f3372kk = i;
    }

    @Override // com.aspose.slides.TransitionValueBase
    /* JADX INFO: renamed from: k4 */
    public boolean mo1275k4(ITransitionValueBase iTransitionValueBase) {
        if (C7019kk.m27469x1(iTransitionValueBase, ShredTransition.class)) {
            return m2667k4((IShredTransition) iTransitionValueBase);
        }
        return false;
    }
}
