package com.aspose.slides;

import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: loaded from: classes3.dex */
class nfo implements wdc {

    /* JADX INFO: renamed from: du */
    private float f47527du;

    /* JADX INFO: renamed from: h4 */
    private XamlOptions f47528h4;

    /* JADX INFO: renamed from: k4 */
    private float f47529k4;

    /* JADX INFO: renamed from: kk */
    private float f47530kk;

    /* JADX INFO: renamed from: m9 */
    private String f47531m9;

    /* JADX INFO: renamed from: to */
    private float f47532to;

    /* JADX INFO: renamed from: x1 */
    private float f47533x1;

    public nfo(IShape iShape, XamlOptions xamlOptions, String str) {
        if (iShape == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "XamarinBlockOpenTag", "shape"));
        }
        if (xamlOptions == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "XamarinBlockOpenTag", "options"));
        }
        if (C14113y2.m67411k4(str)) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "XamarinBlockOpenTag", "blockOpenTag"));
        }
        m68005k4(0.0f);
        m68010x1(0.0f);
        m68007kk(0.0f);
        m68009to(0.0f);
        m68002du(0.0f);
        this.f47528h4 = xamlOptions;
        this.f47531m9 = str;
        m68006k4(iShape);
    }

    /* JADX INFO: renamed from: dy */
    private String m68003dy() {
        return m68011du() != 0.0f ? C14113y2.m67402k4(" Rotation=\"{0}\"", C14064he.m66711k4(m68011du(), (InterfaceC14073kp) C11697x1.m55250kk())) : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: h4 */
    private String m68004h4() {
        return C14113y2.m67402k4(this.f47531m9, C14113y2.m67402k4("{0}{1}", m68008m9(), m68003dy()));
    }

    /* JADX INFO: renamed from: m9 */
    private String m68008m9() {
        return C14113y2.m67402k4(" Margin=\"{0}, {1}\"", C14064he.m66711k4(m68012k4(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m68015x1(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: du */
    public final float m68011du() {
        return this.f47527du;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m68012k4() {
        return this.f47529k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m68013kk() {
        return this.f47530kk;
    }

    /* JADX INFO: renamed from: to */
    public final float m68014to() {
        return this.f47532to;
    }

    public String toString() {
        return m68004h4();
    }

    /* JADX INFO: renamed from: x1 */
    public final float m68015x1() {
        return this.f47533x1;
    }

    /* JADX INFO: renamed from: du */
    private void m68002du(float f) {
        this.f47527du = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m68005k4(float f) {
        this.f47529k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    private void m68007kk(float f) {
        this.f47530kk = f;
    }

    /* JADX INFO: renamed from: to */
    private void m68009to(float f) {
        this.f47532to = f;
    }

    /* JADX INFO: renamed from: x1 */
    private void m68010x1(float f) {
        this.f47533x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m68006k4(IShape iShape) {
        XamlOptions xamlOptions = this.f47528h4;
        m68005k4(sza.m70913k4(xamlOptions, xamlOptions.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getX()));
        m68005k4((float) C14116yg.m67477k4(m68012k4(), 2));
        XamlOptions xamlOptions2 = this.f47528h4;
        m68010x1(sza.m70913k4(xamlOptions2, xamlOptions2.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getY()));
        m68010x1((float) C14116yg.m67477k4(m68015x1(), 2));
        XamlOptions xamlOptions3 = this.f47528h4;
        m68009to(sza.m70913k4(xamlOptions3, xamlOptions3.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getHeight()));
        m68009to((float) C14116yg.m67477k4(m68014to(), 2));
        XamlOptions xamlOptions4 = this.f47528h4;
        m68007kk(sza.m70913k4(xamlOptions4, xamlOptions4.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getWidth()));
        m68007kk((float) C14116yg.m67477k4(m68013kk(), 2));
        m68002du(iShape.getRotation());
    }
}
