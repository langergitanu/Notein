package com.aspose.slides;

import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: loaded from: classes3.dex */
class izn implements InterfaceC13773le {

    /* JADX INFO: renamed from: c5 */
    private String f45395c5;

    /* JADX INFO: renamed from: du */
    private float f45396du;

    /* JADX INFO: renamed from: dy */
    private byte[] f45397dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f45398h4;

    /* JADX INFO: renamed from: jd */
    private XamlOptions f45399jd;

    /* JADX INFO: renamed from: k4 */
    private float f45400k4;

    /* JADX INFO: renamed from: kk */
    private float f45401kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f45402m9;

    /* JADX INFO: renamed from: to */
    private float f45403to;

    /* JADX INFO: renamed from: x1 */
    private float f45404x1;

    /* JADX INFO: renamed from: ck */
    private String m63157ck() {
        return C14113y2.m67411k4(mo6396x1()) ? C14113y2.f47374k4 : C14113y2.m67402k4(" Source=\"{0}\"", mo6396x1());
    }

    /* JADX INFO: renamed from: fa */
    private String m63159fa() {
        return (C14064he.m66715kk(m63179kk()) || C14064he.m66715kk(m63181to()) || C14064he.m66715kk(m63176du()) || C14064he.m66715kk(m63178h4())) ? C14113y2.f47374k4 : C14113y2.m67402k4(" AbsoluteLayout.LayoutBounds=\"{0}, {1}\"", C14064he.m66711k4(m63179kk(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m63181to(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: jd */
    private String m63160jd() {
        return C14113y2.m67402k4("<Image{0}{1}{2}{3}{4}{5}/>", m63157ck(), m63159fa(), m63170up(), m63174yj(), m63167ks(), m63168rv());
    }

    /* JADX INFO: renamed from: ks */
    private String m63167ks() {
        return m63175c5() ? " RotationY=\"180\"" : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: rv */
    private String m63168rv() {
        return m63180m9() != 0.0f ? C14113y2.m67402k4(" Rotation=\"{0}\"", C14064he.m66711k4(m63180m9() * 2.0f, (InterfaceC14073kp) C11697x1.m55250kk())) : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: up */
    private String m63170up() {
        return (C14064he.m66715kk(m63179kk()) || C14064he.m66715kk(m63181to()) || C14064he.m66715kk(m63176du()) || C14064he.m66715kk(m63178h4())) ? C14113y2.f47374k4 : C14113y2.m67402k4(" WidthRequest=\"{0}\" HeightRequest=\"{1}\"", C14064he.m66711k4(m63176du(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m63178h4(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: yj */
    private String m63174yj() {
        return m63177dy() ? " RotationX=\"180\"" : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m63175c5() {
        return this.f45402m9;
    }

    /* JADX INFO: renamed from: du */
    public final float m63176du() {
        return this.f45401kk;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m63177dy() {
        return this.f45398h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final float m63178h4() {
        return this.f45403to;
    }

    @Override // com.aspose.slides.InterfaceC13773le
    /* JADX INFO: renamed from: k4 */
    public final String mo6391k4(IShape iShape, XamlOptions xamlOptions) {
        if (iShape == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "XamarinCustomObject", "shape"));
        }
        if (xamlOptions == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "XamarinCustomObject", "options"));
        }
        m63161k4(0.0f);
        m63171x1(0.0f);
        m63166kk(0.0f);
        m63169to(0.0f);
        m63158du(0.0f);
        m63164k4(false);
        m63173x1(false);
        this.f45399jd = xamlOptions;
        m63163k4(C14113y2.f47374k4);
        m63162k4(iShape);
        return m63160jd();
    }

    /* JADX INFO: renamed from: kk */
    public final float m63179kk() {
        return this.f45400k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final float m63180m9() {
        return this.f45396du;
    }

    /* JADX INFO: renamed from: to */
    public final float m63181to() {
        return this.f45404x1;
    }

    @Override // com.aspose.slides.InterfaceC13773le
    /* JADX INFO: renamed from: x1 */
    public final String mo6396x1() {
        return this.f45395c5;
    }

    /* JADX INFO: renamed from: du */
    private void m63158du(float f) {
        this.f45396du = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m63161k4(float f) {
        this.f45400k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    private void m63166kk(float f) {
        this.f45401kk = f;
    }

    /* JADX INFO: renamed from: to */
    private void m63169to(float f) {
        this.f45403to = f;
    }

    /* JADX INFO: renamed from: x1 */
    private void m63171x1(float f) {
        this.f45404x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m63162k4(IShape iShape) {
        XamlOptions xamlOptions = this.f45399jd;
        m63161k4(sza.m70913k4(xamlOptions, xamlOptions.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getX()));
        m63161k4((float) C14116yg.m67477k4(m63179kk(), 2));
        XamlOptions xamlOptions2 = this.f45399jd;
        m63171x1(sza.m70913k4(xamlOptions2, xamlOptions2.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getY()));
        m63171x1((float) C14116yg.m67477k4(m63181to(), 2));
        XamlOptions xamlOptions3 = this.f45399jd;
        m63166kk(sza.m70913k4(xamlOptions3, xamlOptions3.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getWidth()));
        m63166kk((float) C14116yg.m67477k4(m63176du(), 2));
        XamlOptions xamlOptions4 = this.f45399jd;
        m63169to(sza.m70913k4(xamlOptions4, xamlOptions4.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getHeight()));
        m63169to((float) C14116yg.m67477k4(m63178h4(), 2));
        m63158du(iShape.getRotation());
        m63164k4(iShape.getFrame().getFlipH() == 1);
        m63173x1(iShape.getFrame().getFlipV() == 1);
        m63172x1(iShape);
    }

    /* JADX INFO: renamed from: x1 */
    private void m63172x1(IShape iShape) {
        m63163k4(C14113y2.m67402k4("{0}_{1}.png", C14113y2.m67401k4(C14113y2.m67401k4("Slide{SlideID}{PictureName}", "{SlideID}", C14114y9.m67465x1(iShape.getSlide().getSlideId())), "{PictureName}", C14113y2.m67401k4(iShape.getName(), " ", "")), C14114y9.m67465x1(iShape.getUniqueId())));
        C3152yj c3152yj = new C3152yj();
        try {
            ((Shape) iShape).m2549e0().m56333k4(c3152yj, C3977ck.m15681jd());
            m63165k4(c3152yj.toArray());
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m63163k4(String str) {
        this.f45395c5 = str;
    }

    /* JADX INFO: renamed from: x1 */
    private void m63173x1(boolean z) {
        this.f45402m9 = z;
    }

    /* JADX INFO: renamed from: k4 */
    private void m63164k4(boolean z) {
        this.f45398h4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    private void m63165k4(byte[] bArr) {
        this.f45397dy = bArr;
    }

    @Override // com.aspose.slides.InterfaceC13773le
    /* JADX INFO: renamed from: k4 */
    public final byte[] mo6392k4() {
        return this.f45397dy;
    }
}
