package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class SplitTransition extends TransitionValueBase implements ISplitTransition {

    /* JADX INFO: renamed from: kk */
    private byte f3456kk;

    /* JADX INFO: renamed from: x1 */
    private int f3457x1;

    public SplitTransition(int i) {
        super(i);
    }

    @Override // com.aspose.slides.ISplitTransition
    public final int getDirection() {
        return this.f3457x1;
    }

    @Override // com.aspose.slides.ISplitTransition
    public final byte getOrientation() {
        return this.f3456kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m2831k4(ISplitTransition iSplitTransition) {
        if (iSplitTransition == null) {
            return false;
        }
        SplitTransition splitTransition = (SplitTransition) iSplitTransition;
        return this.f3608k4 == splitTransition.f3608k4 && this.f3457x1 == splitTransition.f3457x1 && this.f3456kk == splitTransition.f3456kk;
    }

    @Override // com.aspose.slides.ISplitTransition
    public final void setDirection(int i) {
        this.f3457x1 = i;
    }

    @Override // com.aspose.slides.ISplitTransition
    public final void setOrientation(byte b) {
        this.f3456kk = b;
    }

    @Override // com.aspose.slides.TransitionValueBase
    /* JADX INFO: renamed from: k4 */
    public boolean mo1275k4(ITransitionValueBase iTransitionValueBase) {
        if (C7019kk.m27469x1(iTransitionValueBase, SplitTransition.class)) {
            return m2831k4((ISplitTransition) iTransitionValueBase);
        }
        return false;
    }
}
