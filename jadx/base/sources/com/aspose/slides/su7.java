package com.aspose.slides;

import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: loaded from: classes3.dex */
class su7 implements wdc {

    /* JADX INFO: renamed from: du */
    private float f48922du;

    /* JADX INFO: renamed from: dy */
    private XamlOptions f48923dy;

    /* JADX INFO: renamed from: k4 */
    private float f48925k4;

    /* JADX INFO: renamed from: kk */
    private float f48926kk;

    /* JADX INFO: renamed from: to */
    private float f48928to;

    /* JADX INFO: renamed from: x1 */
    private float f48929x1;

    /* JADX INFO: renamed from: h4 */
    private C12003du f48924h4 = new C12003du();

    /* JADX INFO: renamed from: m9 */
    private C12003du f48927m9 = new C12003du();

    public su7(IShape iShape, XamlOptions xamlOptions) {
        if (iShape == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "XamarinEllipseObject", "shape"));
        }
        if (xamlOptions == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "XamarinEllipseObject", "options"));
        }
        m70782k4(0.0f);
        m70787x1(0.0f);
        m70785kk(0.0f);
        m70786to(0.0f);
        m70784k4(C12003du.f40505to.Clone());
        m70788x1(C12003du.f40505to.Clone());
        this.f48923dy = xamlOptions;
        m70783k4(iShape);
    }

    /* JADX INFO: renamed from: c5 */
    private String m70776c5() {
        return (C14064he.m66715kk(m70791k4()) || C14064he.m66715kk(m70795x1()) || C14064he.m66715kk(m70792kk()) || C14064he.m66715kk(m70794to())) ? C14113y2.f47374k4 : C14113y2.m67402k4(" AbsoluteLayout.LayoutBounds=\"{0}, {1}\"", C14064he.m66711k4(m70791k4(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m70795x1(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: ck */
    private String m70777ck() {
        return C14064he.m66715kk(m70789du()) ? C14113y2.f47374k4 : C14113y2.m67402k4(" StrokeThickness=\"{0}\"", C14064he.m66711k4(m70789du(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: dy */
    private String m70779dy() {
        return C14113y2.m67402k4("<Ellipse{0}{1}{2}{3}{4}/>", m70776c5(), m70781k4(m70790h4().Clone(), "Fill"), m70781k4(m70793m9().Clone(), "Stroke"), m70780jd(), m70777ck());
    }

    /* JADX INFO: renamed from: jd */
    private String m70780jd() {
        return (C14064he.m66715kk(m70791k4()) || C14064he.m66715kk(m70795x1()) || C14064he.m66715kk(m70792kk()) || C14064he.m66715kk(m70794to())) ? C14113y2.f47374k4 : C14113y2.m67402k4(" WidthRequest=\"{0}\" HeightRequest=\"{1}\"", C14064he.m66711k4(m70792kk(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m70794to(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: du */
    public final float m70789du() {
        return this.f48922du;
    }

    /* JADX INFO: renamed from: h4 */
    public final C12003du m70790h4() {
        return this.f48924h4.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final float m70791k4() {
        return this.f48925k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m70792kk() {
        return this.f48926kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C12003du m70793m9() {
        return this.f48927m9.Clone();
    }

    /* JADX INFO: renamed from: to */
    public final float m70794to() {
        return this.f48928to;
    }

    public String toString() {
        return m70779dy();
    }

    /* JADX INFO: renamed from: x1 */
    public final float m70795x1() {
        return this.f48929x1;
    }

    /* JADX INFO: renamed from: du */
    private void m70778du(float f) {
        this.f48922du = f;
    }

    /* JADX INFO: renamed from: k4 */
    private String m70781k4(C12003du c12003du, String str) {
        return (c12003du == null || C12003du.m56403k4(c12003du, C12003du.f40505to)) ? C14113y2.f47374k4 : C14113y2.m67402k4(" {0}=\"#{1}{2}{3}{4}\"", str, C14098up.m67320k4(c12003du.m56501c5(), "X2"), C14098up.m67320k4(c12003du.m56507jd(), "X2"), C14098up.m67320k4(c12003du.m56502ck(), "X2"), C14098up.m67320k4(c12003du.m56505fa(), "X2"));
    }

    /* JADX INFO: renamed from: kk */
    private void m70785kk(float f) {
        this.f48926kk = f;
    }

    /* JADX INFO: renamed from: to */
    private void m70786to(float f) {
        this.f48928to = f;
    }

    /* JADX INFO: renamed from: x1 */
    private void m70787x1(float f) {
        this.f48929x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m70782k4(float f) {
        this.f48925k4 = f;
    }

    /* JADX INFO: renamed from: x1 */
    private void m70788x1(C12003du c12003du) {
        this.f48927m9 = c12003du.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    private void m70783k4(IShape iShape) {
        XamlOptions xamlOptions = this.f48923dy;
        m70782k4(sza.m70913k4(xamlOptions, xamlOptions.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getX()));
        m70782k4((float) C14116yg.m67477k4(m70791k4(), 2));
        XamlOptions xamlOptions2 = this.f48923dy;
        m70787x1(sza.m70913k4(xamlOptions2, xamlOptions2.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getY()));
        m70787x1((float) C14116yg.m67477k4(m70795x1(), 2));
        XamlOptions xamlOptions3 = this.f48923dy;
        m70785kk(sza.m70913k4(xamlOptions3, xamlOptions3.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getWidth()));
        m70785kk((float) C14116yg.m67477k4(m70792kk(), 2));
        XamlOptions xamlOptions4 = this.f48923dy;
        m70786to(sza.m70913k4(xamlOptions4, xamlOptions4.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getHeight()));
        m70786to((float) C14116yg.m67477k4(m70794to(), 2));
        IFillFormatEffectiveData effective = iShape.getFillFormat().getEffective();
        ILineFormatEffectiveData effective2 = iShape.getLineFormat().getEffective();
        if (effective.getFillType() == 1) {
            m70784k4(((C14176nc) effective).m67938m9().Clone());
        }
        if (effective2.getStyle() == -1 || effective2.getFillFormat().getFillType() != 1) {
            return;
        }
        m70788x1(((erk) effective2.getFillFormat()).m5654x1().Clone());
        float fM66857ck = C14080ne.m66857ck(Double.valueOf(effective2.getWidth()));
        XamlOptions xamlOptions5 = this.f48923dy;
        m70778du(sza.m70913k4(xamlOptions5, xamlOptions5.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), fM66857ck));
        m70778du((float) C14116yg.m67477k4(m70789du(), 2));
    }

    /* JADX INFO: renamed from: k4 */
    private void m70784k4(C12003du c12003du) {
        this.f48924h4 = c12003du.Clone();
    }
}
