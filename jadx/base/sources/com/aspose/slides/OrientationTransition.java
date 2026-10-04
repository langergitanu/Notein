package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class OrientationTransition extends TransitionValueBase implements IOrientationTransition {

    /* JADX INFO: renamed from: x1 */
    private byte f2889x1;

    public OrientationTransition(int i) {
        super(i);
    }

    @Override // com.aspose.slides.IOrientationTransition
    public final byte getDirection() {
        return this.f2889x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m2092k4(IOrientationTransition iOrientationTransition) {
        if (iOrientationTransition == null) {
            return false;
        }
        OrientationTransition orientationTransition = (OrientationTransition) iOrientationTransition;
        return this.f3608k4 == orientationTransition.f3608k4 && this.f2889x1 == orientationTransition.f2889x1;
    }

    @Override // com.aspose.slides.IOrientationTransition
    public final void setDirection(byte b) {
        this.f2889x1 = b;
    }

    @Override // com.aspose.slides.TransitionValueBase
    /* JADX INFO: renamed from: k4 */
    public boolean mo1275k4(ITransitionValueBase iTransitionValueBase) {
        if (C7019kk.m27469x1(iTransitionValueBase, OrientationTransition.class)) {
            return m2092k4((IOrientationTransition) iTransitionValueBase);
        }
        return false;
    }
}
