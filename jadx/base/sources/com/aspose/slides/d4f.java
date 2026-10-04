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
class d4f implements wdc {

    /* JADX INFO: renamed from: du */
    private float f4527du;

    /* JADX INFO: renamed from: dy */
    private XamlOptions f4528dy;

    /* JADX INFO: renamed from: k4 */
    private float f4530k4;

    /* JADX INFO: renamed from: kk */
    private float f4531kk;

    /* JADX INFO: renamed from: to */
    private float f4533to;

    /* JADX INFO: renamed from: x1 */
    private float f4534x1;

    /* JADX INFO: renamed from: h4 */
    private C12003du f4529h4 = new C12003du();

    /* JADX INFO: renamed from: m9 */
    private C12003du f4532m9 = new C12003du();

    public d4f(IShape iShape, XamlOptions xamlOptions) {
        if (iShape == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "WpfRectangleObject", "shape"));
        }
        if (xamlOptions == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "WpfRectangleObject", "options"));
        }
        m4925k4(0.0f);
        m4930x1(0.0f);
        m4928kk(0.0f);
        m4929to(0.0f);
        m4927k4(C12003du.f40505to.Clone());
        m4931x1(C12003du.f40505to.Clone());
        this.f4528dy = xamlOptions;
        m4926k4(iShape);
    }

    /* JADX INFO: renamed from: c5 */
    private String m4919c5() {
        return C14113y2.m67402k4(" Margin=\"{0}, {1}\"", C14064he.m66711k4(m4934k4(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m4938x1(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: ck */
    private String m4920ck() {
        return (C14064he.m66715kk(m4932du()) || m4932du() == 0.0f) ? C14113y2.f47374k4 : C14113y2.m67402k4(" StrokeThickness=\"{0}\"", C14064he.m66711k4(m4932du(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: dy */
    private String m4922dy() {
        return C14113y2.m67402k4("<Rectangle{0}{1}{2}{3}{4}/>", m4919c5(), m4924k4(m4933h4().Clone(), "Fill"), m4924k4(m4936m9().Clone(), "Stroke"), m4923jd(), m4920ck());
    }

    /* JADX INFO: renamed from: jd */
    private String m4923jd() {
        return C14113y2.m67402k4(" Width=\"{0}\" Height=\"{1}\"", C14064he.m66711k4(m4935kk(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m4937to(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: du */
    public final float m4932du() {
        return this.f4527du;
    }

    /* JADX INFO: renamed from: h4 */
    public final C12003du m4933h4() {
        return this.f4529h4.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final float m4934k4() {
        return this.f4530k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m4935kk() {
        return this.f4531kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C12003du m4936m9() {
        return this.f4532m9.Clone();
    }

    /* JADX INFO: renamed from: to */
    public final float m4937to() {
        return this.f4533to;
    }

    public String toString() {
        return m4922dy();
    }

    /* JADX INFO: renamed from: x1 */
    public final float m4938x1() {
        return this.f4534x1;
    }

    /* JADX INFO: renamed from: du */
    private void m4921du(float f) {
        this.f4527du = f;
    }

    /* JADX INFO: renamed from: k4 */
    private String m4924k4(C12003du c12003du, String str) {
        return (c12003du == null || C12003du.m56403k4(c12003du, C12003du.f40505to)) ? C14113y2.f47374k4 : C14113y2.m67402k4(" {0}=\"#{1}{2}{3}{4}\"", str, C14098up.m67320k4(c12003du.m56501c5(), "X2"), C14098up.m67320k4(c12003du.m56507jd(), "X2"), C14098up.m67320k4(c12003du.m56502ck(), "X2"), C14098up.m67320k4(c12003du.m56505fa(), "X2"));
    }

    /* JADX INFO: renamed from: kk */
    private void m4928kk(float f) {
        this.f4531kk = f;
    }

    /* JADX INFO: renamed from: to */
    private void m4929to(float f) {
        this.f4533to = f;
    }

    /* JADX INFO: renamed from: x1 */
    private void m4930x1(float f) {
        this.f4534x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m4925k4(float f) {
        this.f4530k4 = f;
    }

    /* JADX INFO: renamed from: x1 */
    private void m4931x1(C12003du c12003du) {
        this.f4532m9 = c12003du.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    private void m4926k4(IShape iShape) {
        XamlOptions xamlOptions = this.f4528dy;
        m4925k4(sza.m70913k4(xamlOptions, xamlOptions.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getX()));
        m4925k4((float) C14116yg.m67477k4(m4934k4(), 2));
        XamlOptions xamlOptions2 = this.f4528dy;
        m4930x1(sza.m70913k4(xamlOptions2, xamlOptions2.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getY()));
        m4930x1((float) C14116yg.m67477k4(m4938x1(), 2));
        XamlOptions xamlOptions3 = this.f4528dy;
        m4928kk(sza.m70913k4(xamlOptions3, xamlOptions3.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getWidth()));
        m4928kk((float) C14116yg.m67477k4(m4935kk(), 2));
        XamlOptions xamlOptions4 = this.f4528dy;
        m4929to(sza.m70913k4(xamlOptions4, xamlOptions4.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getHeight()));
        m4929to((float) C14116yg.m67477k4(m4937to(), 2));
        IFillFormatEffectiveData effective = iShape.getFillFormat().getEffective();
        ILineFormatEffectiveData effective2 = iShape.getLineFormat().getEffective();
        if (effective.getFillType() == 1) {
            m4927k4(((C14176nc) effective).m67938m9().Clone());
        }
        if (effective2.getStyle() == -1 || effective2.getFillFormat().getFillType() != 1) {
            return;
        }
        m4931x1(((erk) effective2.getFillFormat()).m5654x1().Clone());
        float fM66857ck = C14080ne.m66857ck(Double.valueOf(effective2.getWidth()));
        XamlOptions xamlOptions5 = this.f4528dy;
        m4921du(sza.m70913k4(xamlOptions5, xamlOptions5.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), fM66857ck));
        m4921du((float) C14116yg.m67477k4(m4932du(), 2));
    }

    /* JADX INFO: renamed from: k4 */
    private void m4927k4(C12003du c12003du) {
        this.f4529h4 = c12003du.Clone();
    }
}
