package com.aspose.slides;

import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: loaded from: classes3.dex */
class x2o implements wdc {

    /* JADX INFO: renamed from: du */
    private float f49892du;

    /* JADX INFO: renamed from: h4 */
    private C12003du f49893h4 = new C12003du();

    /* JADX INFO: renamed from: k4 */
    private float f49894k4;

    /* JADX INFO: renamed from: kk */
    private float f49895kk;

    /* JADX INFO: renamed from: m9 */
    private XamlOptions f49896m9;

    /* JADX INFO: renamed from: to */
    private float f49897to;

    /* JADX INFO: renamed from: x1 */
    private float f49898x1;

    public x2o(IShape iShape, XamlOptions xamlOptions) {
        if (iShape == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "WpfLineObject", "shape"));
        }
        if (xamlOptions == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "WpfLineObject", "options"));
        }
        m73004k4(0.0f);
        m73010x1(0.0f);
        m73007kk(0.0f);
        m73009to(0.0f);
        m73006k4(C12003du.f40505to.Clone());
        this.f49896m9 = xamlOptions;
        m73005k4(iShape);
    }

    /* JADX INFO: renamed from: c5 */
    private String m73000c5() {
        return (C14064he.m66715kk(m73011du()) || m73011du() == 0.0f) ? C14113y2.f47374k4 : C14113y2.m67402k4(" StrokeThickness=\"{0}\"", C14064he.m66711k4(m73011du(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: dy */
    private String m73002dy() {
        if (C14064he.m66715kk(m73013k4()) || C14064he.m66715kk(m73016x1()) || C14064he.m66715kk(m73014kk()) || C14064he.m66715kk(m73015to())) {
            return C14113y2.f47374k4;
        }
        return C14113y2.m67402k4(" X1=\"{0}\" Y1=\"{1}\" X2=\"{2}\" Y2=\"{3}\"", C14064he.m66711k4(m73013k4(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m73016x1(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m73014kk() != 0.0f ? m73014kk() : m73013k4(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m73015to() != 0.0f ? m73015to() : m73016x1(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: m9 */
    private String m73008m9() {
        return C14113y2.m67402k4("<Line{0}{1}{2}/>", m73002dy(), m73003k4(m73012h4().Clone(), "Stroke"), m73000c5());
    }

    /* JADX INFO: renamed from: du */
    public final float m73011du() {
        return this.f49892du;
    }

    /* JADX INFO: renamed from: h4 */
    public final C12003du m73012h4() {
        return this.f49893h4.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final float m73013k4() {
        return this.f49894k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m73014kk() {
        return this.f49895kk;
    }

    /* JADX INFO: renamed from: to */
    public final float m73015to() {
        return this.f49897to;
    }

    public String toString() {
        return m73008m9();
    }

    /* JADX INFO: renamed from: x1 */
    public final float m73016x1() {
        return this.f49898x1;
    }

    /* JADX INFO: renamed from: du */
    private void m73001du(float f) {
        this.f49892du = f;
    }

    /* JADX INFO: renamed from: k4 */
    private String m73003k4(C12003du c12003du, String str) {
        return (c12003du == null || C12003du.m56403k4(c12003du, C12003du.f40505to)) ? C14113y2.f47374k4 : C14113y2.m67402k4(" {0}=\"#{1}{2}{3}{4}\"", str, C14098up.m67320k4(c12003du.m56501c5(), "X2"), C14098up.m67320k4(c12003du.m56507jd(), "X2"), C14098up.m67320k4(c12003du.m56502ck(), "X2"), C14098up.m67320k4(c12003du.m56505fa(), "X2"));
    }

    /* JADX INFO: renamed from: kk */
    private void m73007kk(float f) {
        this.f49895kk = f;
    }

    /* JADX INFO: renamed from: to */
    private void m73009to(float f) {
        this.f49897to = f;
    }

    /* JADX INFO: renamed from: x1 */
    private void m73010x1(float f) {
        this.f49898x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m73004k4(float f) {
        this.f49894k4 = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m73005k4(IShape iShape) {
        XamlOptions xamlOptions = this.f49896m9;
        m73004k4(sza.m70913k4(xamlOptions, xamlOptions.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getX()));
        m73004k4((float) C14116yg.m67477k4(m73013k4(), 2));
        XamlOptions xamlOptions2 = this.f49896m9;
        m73010x1(sza.m70913k4(xamlOptions2, xamlOptions2.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getY()));
        m73010x1((float) C14116yg.m67477k4(m73016x1(), 2));
        XamlOptions xamlOptions3 = this.f49896m9;
        m73009to(sza.m70913k4(xamlOptions3, xamlOptions3.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getHeight()));
        m73009to((float) C14116yg.m67477k4(m73015to(), 2));
        XamlOptions xamlOptions4 = this.f49896m9;
        m73007kk(sza.m70913k4(xamlOptions4, xamlOptions4.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getWidth()));
        m73007kk((float) C14116yg.m67477k4(m73014kk(), 2));
        ILineFormatEffectiveData effective = iShape.getLineFormat().getEffective();
        float fM66857ck = !C14044b3.m66437kk(effective.getWidth()) ? C14080ne.m66857ck(Double.valueOf(effective.getWidth())) : 0.0f;
        XamlOptions xamlOptions5 = this.f49896m9;
        m73001du(sza.m70913k4(xamlOptions5, xamlOptions5.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), fM66857ck));
        m73001du((float) C14116yg.m67477k4(m73011du(), 2));
        if (effective.getFillFormat().getFillType() == 1) {
            m73006k4(((erk) effective.getFillFormat()).m5654x1().Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m73006k4(C12003du c12003du) {
        this.f49893h4 = c12003du.Clone();
    }
}
