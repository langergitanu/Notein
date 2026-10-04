package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12015qq;

/* JADX INFO: loaded from: classes3.dex */
class kdz {

    /* JADX INFO: renamed from: k4 */
    public final IShape f45667k4;

    /* JADX INFO: renamed from: x1 */
    public float f45670x1;

    /* JADX INFO: renamed from: kk */
    private oju f45668kk = new oju();

    /* JADX INFO: renamed from: to */
    private oju f45669to = new oju();

    /* JADX INFO: renamed from: du */
    private boolean f45666du = true;

    public kdz(IShape iShape) {
        this.f45667k4 = iShape;
    }

    /* JADX INFO: renamed from: dy */
    private oju m63768dy() {
        m63769h4();
        C12015qq c12015qqClone = ((SlideSize) this.f45667k4.getPresentation().getSlideSize()).m2755k4().Clone();
        return new oju(this.f45669to.f47836k4 / c12015qqClone.m56699x1(), this.f45669to.f47837x1 / c12015qqClone.m56697kk());
    }

    /* JADX INFO: renamed from: h4 */
    private void m63769h4() {
        if (this.f45666du) {
            this.f45666du = false;
            IShapeFrame frame = this.f45667k4.getFrame();
            this.f45668kk = new oju(frame.getCenterX(), frame.getCenterY());
            this.f45669to = new oju(frame.getWidth(), frame.getHeight());
        }
    }

    /* JADX INFO: renamed from: m9 */
    private oju m63770m9() {
        m63769h4();
        C12015qq c12015qqClone = ((SlideSize) this.f45667k4.getPresentation().getSlideSize()).m2755k4().Clone();
        return new oju(this.f45668kk.f47836k4 / c12015qqClone.m56699x1(), this.f45668kk.f47837x1 / c12015qqClone.m56697kk());
    }

    /* JADX INFO: renamed from: du */
    public final float m63771du() {
        return this.f45670x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m63772k4() {
        return m63770m9().f47836k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m63773kk() {
        return m63768dy().f47836k4;
    }

    /* JADX INFO: renamed from: to */
    public final float m63774to() {
        return m63768dy().f47837x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m63775x1() {
        return m63770m9().f47837x1;
    }
}
