package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class TransitionValueBase implements ITransitionValueBase {

    /* JADX INFO: renamed from: k4 */
    int f3608k4;

    public TransitionValueBase(int i) {
        this.f3608k4 = i;
    }

    public boolean equals(Object obj) {
        if (C7019kk.m27469x1(obj, TransitionValueBase.class)) {
            return mo1275k4((ITransitionValueBase) obj);
        }
        return false;
    }

    public int hashCode() {
        return 23454;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo1275k4(ITransitionValueBase iTransitionValueBase) {
        return iTransitionValueBase != null && this.f3608k4 == ((TransitionValueBase) iTransitionValueBase).f3608k4;
    }
}
