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
class ni1 implements wdc {

    /* JADX INFO: renamed from: du */
    private float f47539du;

    /* JADX INFO: renamed from: dy */
    private final XamlOptions f47540dy;

    /* JADX INFO: renamed from: k4 */
    private float f47542k4;

    /* JADX INFO: renamed from: kk */
    private float f47543kk;

    /* JADX INFO: renamed from: to */
    private float f47545to;

    /* JADX INFO: renamed from: x1 */
    private float f47546x1;

    /* JADX INFO: renamed from: h4 */
    private C12003du f47541h4 = new C12003du();

    /* JADX INFO: renamed from: m9 */
    private C12003du f47544m9 = new C12003du();

    public ni1(IShape iShape, XamlOptions xamlOptions) {
        if (iShape == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "XamarinRectangleObject", "shape"));
        }
        if (xamlOptions == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "XamarinRectangleObject", "options"));
        }
        m68043k4(0.0f);
        m68048x1(0.0f);
        m68046kk(0.0f);
        m68047to(0.0f);
        m68045k4(C12003du.f40505to.Clone());
        m68049x1(C12003du.f40505to.Clone());
        this.f47540dy = xamlOptions;
        m68044k4(iShape);
    }

    /* JADX INFO: renamed from: c5 */
    private String m68037c5() {
        return (C14064he.m66715kk(m68052k4()) || C14064he.m66715kk(m68056x1()) || C14064he.m66715kk(m68053kk()) || C14064he.m66715kk(m68055to())) ? C14113y2.f47374k4 : C14113y2.m67402k4(" AbsoluteLayout.LayoutBounds=\"{0}, {1}\"", C14064he.m66711k4(m68052k4(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m68056x1(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: ck */
    private String m68038ck() {
        return C14064he.m66715kk(m68050du()) ? C14113y2.f47374k4 : C14113y2.m67402k4(" StrokeThickness=\"{0}\"", C14064he.m66711k4(m68050du(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: dy */
    private String m68040dy() {
        return C14113y2.m67402k4("<Rectangle{0}{1}{2}{3}{4}/>", m68037c5(), m68042k4(m68051h4().Clone(), "Fill"), m68042k4(m68054m9().Clone(), "Stroke"), m68041jd(), m68038ck());
    }

    /* JADX INFO: renamed from: jd */
    private String m68041jd() {
        return (C14064he.m66715kk(m68052k4()) || C14064he.m66715kk(m68056x1()) || C14064he.m66715kk(m68053kk()) || C14064he.m66715kk(m68055to())) ? C14113y2.f47374k4 : C14113y2.m67402k4(" WidthRequest=\"{0}\" HeightRequest=\"{1}\"", C14064he.m66711k4(m68053kk(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m68055to(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: du */
    public final float m68050du() {
        return this.f47539du;
    }

    /* JADX INFO: renamed from: h4 */
    public final C12003du m68051h4() {
        return this.f47541h4.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final float m68052k4() {
        return this.f47542k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m68053kk() {
        return this.f47543kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C12003du m68054m9() {
        return this.f47544m9.Clone();
    }

    /* JADX INFO: renamed from: to */
    public final float m68055to() {
        return this.f47545to;
    }

    public String toString() {
        return m68040dy();
    }

    /* JADX INFO: renamed from: x1 */
    public final float m68056x1() {
        return this.f47546x1;
    }

    /* JADX INFO: renamed from: du */
    private void m68039du(float f) {
        this.f47539du = f;
    }

    /* JADX INFO: renamed from: k4 */
    private String m68042k4(C12003du c12003du, String str) {
        return (c12003du == null || C12003du.m56403k4(c12003du, C12003du.f40505to)) ? C14113y2.f47374k4 : C14113y2.m67402k4(" {0}=\"#{1}{2}{3}{4}\"", str, C14098up.m67320k4(c12003du.m56501c5(), "X2"), C14098up.m67320k4(c12003du.m56507jd(), "X2"), C14098up.m67320k4(c12003du.m56502ck(), "X2"), C14098up.m67320k4(c12003du.m56505fa(), "X2"));
    }

    /* JADX INFO: renamed from: kk */
    private void m68046kk(float f) {
        this.f47543kk = f;
    }

    /* JADX INFO: renamed from: to */
    private void m68047to(float f) {
        this.f47545to = f;
    }

    /* JADX INFO: renamed from: x1 */
    private void m68048x1(float f) {
        this.f47546x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m68043k4(float f) {
        this.f47542k4 = f;
    }

    /* JADX INFO: renamed from: x1 */
    private void m68049x1(C12003du c12003du) {
        this.f47544m9 = c12003du.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    private void m68044k4(IShape iShape) {
        XamlOptions xamlOptions = this.f47540dy;
        m68043k4(sza.m70913k4(xamlOptions, xamlOptions.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getX()));
        m68043k4((float) C14116yg.m67477k4(m68052k4(), 2));
        XamlOptions xamlOptions2 = this.f47540dy;
        m68048x1(sza.m70913k4(xamlOptions2, xamlOptions2.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getY()));
        m68048x1((float) C14116yg.m67477k4(m68056x1(), 2));
        XamlOptions xamlOptions3 = this.f47540dy;
        m68046kk(sza.m70913k4(xamlOptions3, xamlOptions3.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getWidth()));
        m68046kk((float) C14116yg.m67477k4(m68053kk(), 2));
        XamlOptions xamlOptions4 = this.f47540dy;
        m68047to(sza.m70913k4(xamlOptions4, xamlOptions4.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getHeight()));
        m68047to((float) C14116yg.m67477k4(m68055to(), 2));
        IFillFormatEffectiveData effective = iShape.getFillFormat().getEffective();
        ILineFormatEffectiveData effective2 = iShape.getLineFormat().getEffective();
        if (effective.getFillType() == 1) {
            m68045k4(((C14176nc) effective).m67938m9().Clone());
        }
        if (effective2.getStyle() == -1 || effective2.getFillFormat().getFillType() != 1) {
            return;
        }
        m68049x1(((erk) effective2.getFillFormat()).m5654x1().Clone());
        float fM66857ck = C14080ne.m66857ck(Double.valueOf(effective2.getWidth()));
        XamlOptions xamlOptions5 = this.f47540dy;
        m68039du(sza.m70913k4(xamlOptions5, xamlOptions5.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), fM66857ck));
        m68039du((float) C14116yg.m67477k4(m68050du(), 2));
    }

    /* JADX INFO: renamed from: k4 */
    private void m68045k4(C12003du c12003du) {
        this.f47541h4 = c12003du.Clone();
    }
}
