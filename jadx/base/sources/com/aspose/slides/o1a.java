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
class o1a implements wdc {

    /* JADX INFO: renamed from: du */
    private float f47659du;

    /* JADX INFO: renamed from: h4 */
    private C12003du f47660h4 = new C12003du();

    /* JADX INFO: renamed from: k4 */
    private float f47661k4;

    /* JADX INFO: renamed from: kk */
    private float f47662kk;

    /* JADX INFO: renamed from: m9 */
    private XamlOptions f47663m9;

    /* JADX INFO: renamed from: to */
    private float f47664to;

    /* JADX INFO: renamed from: x1 */
    private float f47665x1;

    public o1a(IShape iShape, XamlOptions xamlOptions) {
        if (iShape == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "XamarinLineObject", "shape"));
        }
        if (xamlOptions == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "XamarinLineObject", "options"));
        }
        m68305k4(0.0f);
        m68311x1(0.0f);
        m68308kk(0.0f);
        m68310to(0.0f);
        m68307k4(C12003du.f40505to.Clone());
        this.f47663m9 = xamlOptions;
        m68306k4(iShape);
    }

    /* JADX INFO: renamed from: c5 */
    private String m68301c5() {
        return C14064he.m66715kk(m68312du()) ? C14113y2.f47374k4 : C14113y2.m67402k4(" StrokeThickness=\"{0}\"", C14064he.m66711k4(m68312du(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: dy */
    private String m68303dy() {
        if (C14064he.m66715kk(m68314k4()) || C14064he.m66715kk(m68317x1()) || C14064he.m66715kk(m68315kk()) || C14064he.m66715kk(m68316to())) {
            return C14113y2.f47374k4;
        }
        return C14113y2.m67402k4(" X1=\"{0}\" Y1=\"{1}\" X2=\"{2}\" Y2=\"{3}\"", C14064he.m66711k4(m68314k4(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m68317x1(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m68315kk() != 0.0f ? m68315kk() : m68314k4(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m68316to() != 0.0f ? m68316to() : m68317x1(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: m9 */
    private String m68309m9() {
        return C14113y2.m67402k4("<Line{0}{1}{2}/>", m68303dy(), m68304k4(m68313h4().Clone(), "Stroke"), m68301c5());
    }

    /* JADX INFO: renamed from: du */
    public final float m68312du() {
        return this.f47659du;
    }

    /* JADX INFO: renamed from: h4 */
    public final C12003du m68313h4() {
        return this.f47660h4.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final float m68314k4() {
        return this.f47661k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m68315kk() {
        return this.f47662kk;
    }

    /* JADX INFO: renamed from: to */
    public final float m68316to() {
        return this.f47664to;
    }

    public String toString() {
        return m68309m9();
    }

    /* JADX INFO: renamed from: x1 */
    public final float m68317x1() {
        return this.f47665x1;
    }

    /* JADX INFO: renamed from: du */
    private void m68302du(float f) {
        this.f47659du = f;
    }

    /* JADX INFO: renamed from: k4 */
    private String m68304k4(C12003du c12003du, String str) {
        return (c12003du == null || C12003du.m56403k4(c12003du, C12003du.f40505to)) ? C14113y2.f47374k4 : C14113y2.m67402k4(" {0}=\"#{1}{2}{3}{4}\"", str, C14098up.m67320k4(c12003du.m56501c5(), "X2"), C14098up.m67320k4(c12003du.m56507jd(), "X2"), C14098up.m67320k4(c12003du.m56502ck(), "X2"), C14098up.m67320k4(c12003du.m56505fa(), "X2"));
    }

    /* JADX INFO: renamed from: kk */
    private void m68308kk(float f) {
        this.f47662kk = f;
    }

    /* JADX INFO: renamed from: to */
    private void m68310to(float f) {
        this.f47664to = f;
    }

    /* JADX INFO: renamed from: x1 */
    private void m68311x1(float f) {
        this.f47665x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m68305k4(float f) {
        this.f47661k4 = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m68306k4(IShape iShape) {
        XamlOptions xamlOptions = this.f47663m9;
        m68305k4(sza.m70913k4(xamlOptions, xamlOptions.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getX()));
        m68305k4((float) C14116yg.m67477k4(m68314k4(), 2));
        XamlOptions xamlOptions2 = this.f47663m9;
        m68311x1(sza.m70913k4(xamlOptions2, xamlOptions2.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getY()));
        m68311x1((float) C14116yg.m67477k4(m68317x1(), 2));
        XamlOptions xamlOptions3 = this.f47663m9;
        m68310to(sza.m70913k4(xamlOptions3, xamlOptions3.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getHeight()));
        m68310to((float) C14116yg.m67477k4(m68316to(), 2));
        XamlOptions xamlOptions4 = this.f47663m9;
        m68308kk(sza.m70913k4(xamlOptions4, xamlOptions4.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getWidth()));
        m68308kk((float) C14116yg.m67477k4(m68315kk(), 2));
        ILineFormatEffectiveData effective = iShape.getLineFormat().getEffective();
        float fM66857ck = C14080ne.m66857ck(Double.valueOf(effective.getWidth()));
        XamlOptions xamlOptions5 = this.f47663m9;
        m68302du(sza.m70913k4(xamlOptions5, xamlOptions5.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), fM66857ck));
        m68302du((float) C14116yg.m67477k4(m68312du(), 2));
        if (effective.getFillFormat().getFillType() == 1) {
            m68307k4(((erk) effective.getFillFormat()).m5654x1().Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m68307k4(C12003du c12003du) {
        this.f47660h4 = c12003du.Clone();
    }
}
