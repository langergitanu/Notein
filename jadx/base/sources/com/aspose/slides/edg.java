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
class edg implements wdc {

    /* JADX INFO: renamed from: du */
    private float f4758du;

    /* JADX INFO: renamed from: dy */
    private XamlOptions f4759dy;

    /* JADX INFO: renamed from: k4 */
    private float f4761k4;

    /* JADX INFO: renamed from: kk */
    private float f4762kk;

    /* JADX INFO: renamed from: to */
    private float f4764to;

    /* JADX INFO: renamed from: x1 */
    private float f4765x1;

    /* JADX INFO: renamed from: h4 */
    private C12003du f4760h4 = new C12003du();

    /* JADX INFO: renamed from: m9 */
    private C12003du f4763m9 = new C12003du();

    public edg(IShape iShape, XamlOptions xamlOptions) {
        if (iShape == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "WpfEllipseObject", "shape"));
        }
        if (xamlOptions == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "WpfEllipseObject", "options"));
        }
        m5447k4(0.0f);
        m5452x1(0.0f);
        m5450kk(0.0f);
        m5451to(0.0f);
        m5449k4(C12003du.f40505to.Clone());
        m5453x1(C12003du.f40505to.Clone());
        this.f4759dy = xamlOptions;
        m5448k4(iShape);
    }

    /* JADX INFO: renamed from: c5 */
    private String m5441c5() {
        return C14113y2.m67402k4(" Margin=\"{0}, {1}\"", C14064he.m66711k4(m5456k4(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m5460x1(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: ck */
    private String m5442ck() {
        return (C14064he.m66715kk(m5454du()) || m5454du() == 0.0f) ? C14113y2.f47374k4 : C14113y2.m67402k4(" StrokeThickness=\"{0}\"", C14064he.m66711k4(m5454du(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: dy */
    private String m5444dy() {
        return C14113y2.m67402k4("<Ellipse{0}{1}{2}{3}{4}/>", m5441c5(), m5446k4(m5455h4().Clone(), "Fill"), m5446k4(m5458m9().Clone(), "Stroke"), m5445jd(), m5442ck());
    }

    /* JADX INFO: renamed from: jd */
    private String m5445jd() {
        return C14113y2.m67402k4(" Width=\"{0}\" Height=\"{1}\"", C14064he.m66711k4(m5457kk(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m5459to(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: du */
    public final float m5454du() {
        return this.f4758du;
    }

    /* JADX INFO: renamed from: h4 */
    public final C12003du m5455h4() {
        return this.f4760h4.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final float m5456k4() {
        return this.f4761k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m5457kk() {
        return this.f4762kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C12003du m5458m9() {
        return this.f4763m9.Clone();
    }

    /* JADX INFO: renamed from: to */
    public final float m5459to() {
        return this.f4764to;
    }

    public String toString() {
        return m5444dy();
    }

    /* JADX INFO: renamed from: x1 */
    public final float m5460x1() {
        return this.f4765x1;
    }

    /* JADX INFO: renamed from: du */
    private void m5443du(float f) {
        this.f4758du = f;
    }

    /* JADX INFO: renamed from: k4 */
    private String m5446k4(C12003du c12003du, String str) {
        return (c12003du == null || C12003du.m56403k4(c12003du, C12003du.f40505to)) ? C14113y2.f47374k4 : C14113y2.m67402k4(" {0}=\"#{1}{2}{3}{4}\"", str, C14098up.m67320k4(c12003du.m56501c5(), "X2"), C14098up.m67320k4(c12003du.m56507jd(), "X2"), C14098up.m67320k4(c12003du.m56502ck(), "X2"), C14098up.m67320k4(c12003du.m56505fa(), "X2"));
    }

    /* JADX INFO: renamed from: kk */
    private void m5450kk(float f) {
        this.f4762kk = f;
    }

    /* JADX INFO: renamed from: to */
    private void m5451to(float f) {
        this.f4764to = f;
    }

    /* JADX INFO: renamed from: x1 */
    private void m5452x1(float f) {
        this.f4765x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m5447k4(float f) {
        this.f4761k4 = f;
    }

    /* JADX INFO: renamed from: x1 */
    private void m5453x1(C12003du c12003du) {
        this.f4763m9 = c12003du.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    private void m5448k4(IShape iShape) {
        XamlOptions xamlOptions = this.f4759dy;
        m5447k4(sza.m70913k4(xamlOptions, xamlOptions.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getX()));
        m5447k4((float) C14116yg.m67477k4(m5456k4(), 2));
        XamlOptions xamlOptions2 = this.f4759dy;
        m5452x1(sza.m70913k4(xamlOptions2, xamlOptions2.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getY()));
        m5452x1((float) C14116yg.m67477k4(m5460x1(), 2));
        XamlOptions xamlOptions3 = this.f4759dy;
        m5450kk(sza.m70913k4(xamlOptions3, xamlOptions3.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getWidth()));
        m5450kk((float) C14116yg.m67477k4(m5457kk(), 2));
        XamlOptions xamlOptions4 = this.f4759dy;
        m5451to(sza.m70913k4(xamlOptions4, xamlOptions4.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getHeight()));
        m5451to((float) C14116yg.m67477k4(m5459to(), 2));
        IFillFormatEffectiveData effective = iShape.getFillFormat().getEffective();
        ILineFormatEffectiveData effective2 = iShape.getLineFormat().getEffective();
        if (effective.getFillType() == 1) {
            m5449k4(((C14176nc) effective).m67938m9().Clone());
        }
        if (effective2.getStyle() == -1 || effective2.getFillFormat().getFillType() != 1) {
            return;
        }
        m5453x1(((erk) effective2.getFillFormat()).m5654x1().Clone());
        float fM66857ck = C14080ne.m66857ck(Double.valueOf(effective2.getWidth()));
        XamlOptions xamlOptions5 = this.f4759dy;
        m5443du(sza.m70913k4(xamlOptions5, xamlOptions5.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), fM66857ck));
        m5443du((float) C14116yg.m67477k4(m5454du(), 2));
    }

    /* JADX INFO: renamed from: k4 */
    private void m5449k4(C12003du c12003du) {
        this.f4760h4 = c12003du.Clone();
    }
}
