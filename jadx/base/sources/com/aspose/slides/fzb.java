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
class fzb implements InterfaceC13773le {

    /* JADX INFO: renamed from: c5 */
    private String f5154c5;

    /* JADX INFO: renamed from: ck */
    private boolean f5155ck;

    /* JADX INFO: renamed from: du */
    private float f5156du;

    /* JADX INFO: renamed from: dy */
    private byte[] f5157dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f5158h4;

    /* JADX INFO: renamed from: jd */
    private XamlOptions f5159jd;

    /* JADX INFO: renamed from: k4 */
    private float f5160k4;

    /* JADX INFO: renamed from: kk */
    private float f5161kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f5162m9;

    /* JADX INFO: renamed from: to */
    private float f5163to;

    /* JADX INFO: renamed from: x1 */
    private float f5164x1;

    /* JADX INFO: renamed from: ck */
    private String m6368ck() {
        return C14113y2.m67411k4(mo6396x1()) ? C14113y2.f47374k4 : C14113y2.m67402k4(" Source=\"{0}\"", mo6396x1());
    }

    /* JADX INFO: renamed from: fa */
    private String m6370fa() {
        return C14113y2.m67402k4(" Margin=\"{0}, {1}\"", C14064he.m66711k4(m6393kk(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m6395to(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: jd */
    private String m6371jd() {
        String strM6368ck = m6368ck();
        String strM6370fa = m6370fa();
        String strM6381up = m6381up();
        String str = C14113y2.f47374k4;
        return !this.f5155ck ? C14113y2.m67402k4("<Image{0}{1}{2}/>", strM6368ck, strM6370fa, strM6381up) : C14113y2.m67402k4("<Image{0}{1}{2}{3}>{4}\r\n</Image>", strM6368ck, strM6370fa, strM6381up, m6386yj(), m6378ks());
    }

    /* JADX INFO: renamed from: ks */
    private String m6378ks() {
        return C14113y2.m67402k4("\r\n<Image.RenderTransform>\r\n    <TransformGroup>\r\n        {0}\r\n        <SkewTransform/>  \r\n        {1}\r\n        <TranslateTransform/>   \r\n    </TransformGroup>   \r\n</Image.RenderTransform>", m6379rv(), m6385x6());
    }

    /* JADX INFO: renamed from: rv */
    private String m6379rv() {
        return C14113y2.m67402k4("<ScaleTransform{0}{1}/>", m6389dy() ? " ScaleX=\"-1\"" : C14113y2.f47374k4, m6387c5() ? " ScaleY=\"-1\"" : C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: up */
    private String m6381up() {
        return C14113y2.m67402k4(" Width=\"{0}\" Height=\"{1}\"", C14064he.m66711k4(m6388du(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m6390h4(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: x6 */
    private String m6385x6() {
        return C14113y2.m67402k4("<RotateTransform{0}/>", m6394m9() != 0.0f ? C14113y2.m67402k4(" Angle=\"{0}\"", C14064he.m66711k4(m6394m9(), (InterfaceC14073kp) C11697x1.m55250kk())) : C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: yj */
    private String m6386yj() {
        return this.f5155ck ? " RenderTransformOrigin=\"0.5, 0.5\"" : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m6387c5() {
        return this.f5162m9;
    }

    /* JADX INFO: renamed from: du */
    public final float m6388du() {
        return this.f5161kk;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m6389dy() {
        return this.f5158h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final float m6390h4() {
        return this.f5163to;
    }

    @Override // com.aspose.slides.InterfaceC13773le
    /* JADX INFO: renamed from: k4 */
    public final String mo6391k4(IShape iShape, XamlOptions xamlOptions) {
        if (iShape == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "WpfCustomObject", "shape"));
        }
        if (xamlOptions == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "WpfCustomObject", "options"));
        }
        m6372k4(0.0f);
        m6382x1(0.0f);
        m6377kk(0.0f);
        m6380to(0.0f);
        m6369du(0.0f);
        m6375k4(false);
        m6384x1(false);
        this.f5159jd = xamlOptions;
        m6374k4(C14113y2.f47374k4);
        m6373k4(iShape);
        return m6371jd();
    }

    /* JADX INFO: renamed from: kk */
    public final float m6393kk() {
        return this.f5160k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final float m6394m9() {
        return this.f5156du;
    }

    /* JADX INFO: renamed from: to */
    public final float m6395to() {
        return this.f5164x1;
    }

    @Override // com.aspose.slides.InterfaceC13773le
    /* JADX INFO: renamed from: x1 */
    public final String mo6396x1() {
        return this.f5154c5;
    }

    /* JADX INFO: renamed from: du */
    private void m6369du(float f) {
        this.f5156du = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m6372k4(float f) {
        this.f5160k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    private void m6377kk(float f) {
        this.f5161kk = f;
    }

    /* JADX INFO: renamed from: to */
    private void m6380to(float f) {
        this.f5163to = f;
    }

    /* JADX INFO: renamed from: x1 */
    private void m6382x1(float f) {
        this.f5164x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m6373k4(IShape iShape) {
        XamlOptions xamlOptions = this.f5159jd;
        m6372k4(sza.m70913k4(xamlOptions, xamlOptions.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getX()));
        m6372k4((float) C14116yg.m67477k4(m6393kk(), 2));
        XamlOptions xamlOptions2 = this.f5159jd;
        m6382x1(sza.m70913k4(xamlOptions2, xamlOptions2.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getY()));
        m6382x1((float) C14116yg.m67477k4(m6395to(), 2));
        XamlOptions xamlOptions3 = this.f5159jd;
        m6377kk(sza.m70913k4(xamlOptions3, xamlOptions3.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getWidth()));
        m6377kk((float) C14116yg.m67477k4(m6388du(), 2));
        XamlOptions xamlOptions4 = this.f5159jd;
        m6380to(sza.m70913k4(xamlOptions4, xamlOptions4.m3114x1().Clone(), ((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone(), iShape.getHeight()));
        m6380to((float) C14116yg.m67477k4(m6390h4(), 2));
        m6369du(iShape.getRotation());
        m6369du((float) C14116yg.m67477k4(m6394m9(), 2));
        m6375k4(iShape.getFrame().getFlipH() == 1);
        m6384x1(iShape.getFrame().getFlipV() == 1);
        if (m6394m9() != 0.0f || m6389dy() || m6387c5()) {
            this.f5155ck = true;
        }
        m6383x1(iShape);
    }

    /* JADX INFO: renamed from: x1 */
    private void m6383x1(IShape iShape) {
        m6374k4(C14113y2.m67402k4("{0}_{1}.png", C14113y2.m67401k4(C14113y2.m67401k4("Slide{SlideID}{PictureName}", "{SlideID}", C14114y9.m67465x1(iShape.getSlide().getSlideId())), "{PictureName}", C14113y2.m67401k4(iShape.getName(), " ", "")), C14114y9.m67465x1(iShape.getUniqueId())));
        C3152yj c3152yj = new C3152yj();
        try {
            ((Shape) iShape).m2549e0().m56333k4(c3152yj, C3977ck.m15681jd());
            m6376k4(c3152yj.toArray());
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m6374k4(String str) {
        this.f5154c5 = str;
    }

    /* JADX INFO: renamed from: x1 */
    private void m6384x1(boolean z) {
        this.f5162m9 = z;
    }

    /* JADX INFO: renamed from: k4 */
    private void m6375k4(boolean z) {
        this.f5158h4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    private void m6376k4(byte[] bArr) {
        this.f5157dy = bArr;
    }

    @Override // com.aspose.slides.InterfaceC13773le
    /* JADX INFO: renamed from: k4 */
    public final byte[] mo6392k4() {
        return this.f5157dy;
    }
}
