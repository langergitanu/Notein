package com.aspose.slides;

import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: loaded from: classes3.dex */
class myp implements wdc {

    /* JADX INFO: renamed from: du */
    private float f47458du;

    /* JADX INFO: renamed from: h4 */
    private XamlOptions f47459h4;

    /* JADX INFO: renamed from: k4 */
    private float f47460k4;

    /* JADX INFO: renamed from: kk */
    private float f47461kk;

    /* JADX INFO: renamed from: m9 */
    private String f47462m9;

    /* JADX INFO: renamed from: to */
    private float f47463to;

    /* JADX INFO: renamed from: x1 */
    private float f47464x1;

    public myp(IShape iShape, XamlOptions xamlOptions, String str) {
        if (iShape == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "WpfBlockOpenTag", "shape"));
        }
        if (xamlOptions == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "WpfBlockOpenTag", "options"));
        }
        if (C14113y2.m67411k4(str)) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "WpfBlockOpenTag", "blockOpenTag"));
        }
        m67827k4(0.0f);
        m67832x1(0.0f);
        m67829kk(0.0f);
        m67831to(0.0f);
        m67824du(0.0f);
        this.f47459h4 = xamlOptions;
        this.f47462m9 = str;
        m67828k4(iShape);
    }

    /* JADX INFO: renamed from: dy */
    private String m67825dy() {
        return C14113y2.m67402k4("\n    <Canvas.RenderTransform>\n        <RotateTransform Angle=\"{0}\"/>\n    </Canvas.RenderTransform>", C14064he.m66711k4(m67833du(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: h4 */
    private String m67826h4() {
        String strM67402k4 = C14113y2.m67402k4(this.f47462m9, m67830m9());
        return m67833du() != 0.0f ? C14113y2.m67400k4(strM67402k4, m67825dy()) : strM67402k4;
    }

    /* JADX INFO: renamed from: m9 */
    private String m67830m9() {
        return C14113y2.m67402k4(" Margin=\"{0}, {1}\"", C14064he.m66711k4(m67834k4(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m67837x1(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: du */
    public final float m67833du() {
        return this.f47458du;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m67834k4() {
        return this.f47460k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m67835kk() {
        return this.f47461kk;
    }

    /* JADX INFO: renamed from: to */
    public final float m67836to() {
        return this.f47463to;
    }

    public String toString() {
        return m67826h4();
    }

    /* JADX INFO: renamed from: x1 */
    public final float m67837x1() {
        return this.f47464x1;
    }

    /* JADX INFO: renamed from: du */
    private void m67824du(float f) {
        this.f47458du = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m67827k4(float f) {
        this.f47460k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    private void m67829kk(float f) {
        this.f47461kk = f;
    }

    /* JADX INFO: renamed from: to */
    private void m67831to(float f) {
        this.f47463to = f;
    }

    /* JADX INFO: renamed from: x1 */
    private void m67832x1(float f) {
        this.f47464x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m67828k4(IShape iShape) {
        XamlOptions xamlOptions = this.f47459h4;
        m67827k4(sza.m70913k4(xamlOptions, xamlOptions.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getX()));
        m67827k4((float) C14116yg.m67477k4(m67834k4(), 2));
        XamlOptions xamlOptions2 = this.f47459h4;
        m67832x1(sza.m70913k4(xamlOptions2, xamlOptions2.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getY()));
        m67832x1((float) C14116yg.m67477k4(m67837x1(), 2));
        XamlOptions xamlOptions3 = this.f47459h4;
        m67831to(sza.m70913k4(xamlOptions3, xamlOptions3.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getHeight()));
        m67831to((float) C14116yg.m67477k4(m67836to(), 2));
        XamlOptions xamlOptions4 = this.f47459h4;
        m67829kk(sza.m70913k4(xamlOptions4, xamlOptions4.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getWidth()));
        m67829kk((float) C14116yg.m67477k4(m67835kk(), 2));
        m67824du(iShape.getRotation());
        m67824du((float) C14116yg.m67477k4(m67833du(), 2));
    }
}
