package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12023wl;

/* JADX INFO: loaded from: classes3.dex */
class ot0 extends AbstractC13710k2 implements IPresentationAnimationPlayer {

    /* JADX INFO: renamed from: k4 */
    private final C12023wl f47928k4;

    /* JADX INFO: renamed from: kk */
    private final C14571tq f47929kk;

    /* JADX INFO: renamed from: x1 */
    private final vbl f47930x1;

    public ot0(C12023wl c12023wl, C14571tq c14571tq, vbl vblVar) {
        super(vblVar.mo4315kk());
        C12023wl c12023wl2 = new C12023wl();
        this.f47928k4 = c12023wl2;
        c12023wl.CloneTo(c12023wl2);
        this.f47929kk = c14571tq;
        this.f47930x1 = vblVar;
    }

    @Override // com.aspose.slides.IPresentationAnimationPlayer
    public final IImage getFrame() {
        return new yyn(((Slide) m68820k4()).m2721x6().m69372k4(this.f47928k4.Clone(), this.f47929kk));
    }

    /* JADX INFO: renamed from: k4 */
    public final ISlide m68820k4() {
        return (ISlide) this.f47929kk.m63845kk();
    }

    @Override // com.aspose.slides.IPresentationAnimationPlayer
    public final void setTimePosition(double d) {
        this.f47929kk.m71279k4();
        this.f47930x1.mo4312k4(d);
    }
}
