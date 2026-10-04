package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class GlitterTransition extends TransitionValueBase implements IGlitterTransition {

    /* JADX INFO: renamed from: kk */
    private int f2395kk;

    /* JADX INFO: renamed from: x1 */
    private int f2396x1;

    public GlitterTransition(int i) {
        super(i);
    }

    @Override // com.aspose.slides.IGlitterTransition
    public final int getDirection() {
        return this.f2396x1;
    }

    @Override // com.aspose.slides.IGlitterTransition
    public final int getPattern() {
        return this.f2395kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m1594k4(IGlitterTransition iGlitterTransition) {
        if (iGlitterTransition == null) {
            return false;
        }
        GlitterTransition glitterTransition = (GlitterTransition) iGlitterTransition;
        return this.f3608k4 == glitterTransition.f3608k4 && this.f2396x1 == glitterTransition.f2396x1 && this.f2395kk == glitterTransition.f2395kk;
    }

    @Override // com.aspose.slides.IGlitterTransition
    public final void setDirection(int i) {
        this.f2396x1 = i;
    }

    @Override // com.aspose.slides.IGlitterTransition
    public final void setPattern(int i) {
        this.f2395kk = i;
    }

    @Override // com.aspose.slides.TransitionValueBase
    /* JADX INFO: renamed from: k4 */
    public boolean mo1275k4(ITransitionValueBase iTransitionValueBase) {
        if (C7019kk.m27469x1(iTransitionValueBase, GlitterTransition.class)) {
            return m1594k4((IGlitterTransition) iTransitionValueBase);
        }
        return false;
    }
}
