package com.aspose.slides;

import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;

/* JADX INFO: loaded from: classes3.dex */
class o5p extends AbstractC14482t1 implements IPresentationAnimationPlayer {

    /* JADX INFO: renamed from: kk */
    private final AbstractC12008jd f47674kk;

    /* JADX INFO: renamed from: to */
    private final fsr f47675to;

    /* JADX INFO: renamed from: x1 */
    private final double f47676x1;

    public o5p(AbstractC12008jd abstractC12008jd, C12009k4 c12009k4, fsr fsrVar, double d) {
        super(d, c12009k4);
        this.f47676x1 = 1.0d / d;
        this.f47674kk = abstractC12008jd;
        this.f47675to = fsrVar;
    }

    @Override // com.aspose.slides.IPresentationAnimationPlayer
    public final void setTimePosition(double d) {
        this.f47675to.mo3090k4((float) (this.f47676x1 * d), this.f47674kk);
    }
}
