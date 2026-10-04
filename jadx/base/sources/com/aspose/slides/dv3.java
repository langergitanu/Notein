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
class dv3 implements InterfaceC14264p2 {

    /* JADX INFO: renamed from: c5 */
    private byte[] f4658c5;

    /* JADX INFO: renamed from: ck */
    private XamlOptions f4659ck;

    /* JADX INFO: renamed from: du */
    private int f4660du;

    /* JADX INFO: renamed from: dy */
    private boolean f4661dy;

    /* JADX INFO: renamed from: h4 */
    private float f4662h4;

    /* JADX INFO: renamed from: jd */
    private String f4663jd;

    /* JADX INFO: renamed from: k4 */
    private float f4664k4;

    /* JADX INFO: renamed from: kk */
    private float f4665kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f4666m9;

    /* JADX INFO: renamed from: to */
    private float f4667to;

    /* JADX INFO: renamed from: x1 */
    private float f4668x1;

    public dv3(IPictureFrame iPictureFrame, XamlOptions xamlOptions) {
        if (iPictureFrame == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "XamarinImageObject", "pictureFrame"));
        }
        if (xamlOptions == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "XamarinImageObject", "options"));
        }
        m5264k4(0.0f);
        m5275x1(0.0f);
        m5270kk(0.0f);
        m5273to(0.0f);
        m5261du(0.0f);
        m5268k4(false);
        m5277x1(false);
        this.f4659ck = xamlOptions;
        m5267k4(C14113y2.f47374k4);
        m5266k4(iPictureFrame);
    }

    /* JADX INFO: renamed from: ck */
    private String m5260ck() {
        return C14113y2.m67411k4(mo5287x1()) ? C14113y2.f47374k4 : C14113y2.m67402k4(" Source=\"{0}\"", mo5287x1());
    }

    /* JADX INFO: renamed from: fa */
    private String m5262fa() {
        return (C14064he.m66715kk(m5284kk()) || C14064he.m66715kk(m5286to()) || C14064he.m66715kk(m5280du()) || C14064he.m66715kk(m5282h4())) ? C14113y2.f47374k4 : C14113y2.m67402k4(" AbsoluteLayout.LayoutBounds=\"{0}, {1}\"", C14064he.m66711k4(m5284kk(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m5286to(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: jd */
    private String m5263jd() {
        return C14113y2.m67402k4("<Image{0}{1}{2}{3}{4}{5}/>", m5260ck(), m5262fa(), m5274up(), m5278yj(), m5271ks(), m5272rv());
    }

    /* JADX INFO: renamed from: k4 */
    private void m5264k4(float f) {
        this.f4664k4 = f;
    }

    /* JADX INFO: renamed from: ks */
    private String m5271ks() {
        return m5279c5() ? " RotationY=\"180\"" : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: rv */
    private String m5272rv() {
        return m5285m9() != 0.0f ? C14113y2.m67402k4(" Rotation=\"{0}\"", C14064he.m66711k4(m5285m9() * 2.0f, (InterfaceC14073kp) C11697x1.m55250kk())) : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: up */
    private String m5274up() {
        return (C14064he.m66715kk(m5284kk()) || C14064he.m66715kk(m5286to()) || C14064he.m66715kk(m5280du()) || C14064he.m66715kk(m5282h4())) ? C14113y2.f47374k4 : C14113y2.m67402k4(" WidthRequest=\"{0}\" HeightRequest=\"{1}\"", C14064he.m66711k4(m5280du(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m5282h4(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: yj */
    private String m5278yj() {
        return m5281dy() ? " RotationX=\"180\"" : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m5279c5() {
        return this.f4661dy;
    }

    /* JADX INFO: renamed from: du */
    public final float m5280du() {
        return this.f4665kk;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m5281dy() {
        return this.f4666m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final float m5282h4() {
        return this.f4667to;
    }

    /* JADX INFO: renamed from: kk */
    public final float m5284kk() {
        return this.f4664k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final float m5285m9() {
        return this.f4662h4;
    }

    /* JADX INFO: renamed from: to */
    public final float m5286to() {
        return this.f4668x1;
    }

    public String toString() {
        return m5263jd();
    }

    @Override // com.aspose.slides.InterfaceC14264p2
    /* JADX INFO: renamed from: x1 */
    public final String mo5287x1() {
        return this.f4663jd;
    }

    /* JADX INFO: renamed from: du */
    private void m5261du(float f) {
        this.f4662h4 = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m5265k4(int i) {
        this.f4660du = i;
    }

    /* JADX INFO: renamed from: kk */
    private void m5270kk(float f) {
        this.f4665kk = f;
    }

    /* JADX INFO: renamed from: to */
    private void m5273to(float f) {
        this.f4667to = f;
    }

    /* JADX INFO: renamed from: x1 */
    private void m5275x1(float f) {
        this.f4668x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m5266k4(IPictureFrame iPictureFrame) {
        XamlOptions xamlOptions = this.f4659ck;
        m5264k4(sza.m70913k4(xamlOptions, xamlOptions.m3114x1().Clone(), ((SlideSize) iPictureFrame.getPresentation().getSlideSize()).m2755k4().Clone(), iPictureFrame.getX()));
        m5264k4((float) C14116yg.m67477k4(m5284kk(), 2));
        XamlOptions xamlOptions2 = this.f4659ck;
        m5275x1(sza.m70913k4(xamlOptions2, xamlOptions2.m3114x1().Clone(), ((SlideSize) iPictureFrame.getPresentation().getSlideSize()).m2755k4().Clone(), iPictureFrame.getY()));
        m5275x1((float) C14116yg.m67477k4(m5286to(), 2));
        XamlOptions xamlOptions3 = this.f4659ck;
        m5270kk(sza.m70913k4(xamlOptions3, xamlOptions3.m3114x1().Clone(), ((SlideSize) iPictureFrame.getPresentation().getSlideSize()).m2755k4().Clone(), iPictureFrame.getWidth()));
        m5270kk((float) C14116yg.m67477k4(m5280du(), 2));
        XamlOptions xamlOptions4 = this.f4659ck;
        m5273to(sza.m70913k4(xamlOptions4, xamlOptions4.m3114x1().Clone(), ((SlideSize) iPictureFrame.getPresentation().getSlideSize()).m2755k4().Clone(), iPictureFrame.getHeight()));
        m5273to((float) C14116yg.m67477k4(m5282h4(), 2));
        m5265k4(iPictureFrame.getPictureFormat().getPictureFillMode());
        m5261du(iPictureFrame.getRotation());
        m5268k4(iPictureFrame.getFrame().getFlipH() == 1);
        m5277x1(iPictureFrame.getFrame().getFlipV() == 1);
        m5276x1(iPictureFrame);
    }

    /* JADX INFO: renamed from: x1 */
    private void m5276x1(IPictureFrame iPictureFrame) {
        if (C14113y2.m67411k4(iPictureFrame.getPictureFormat().getPicture().getImage().getContentType())) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "XamarinImageObject", "pictureFrame.PictureFormat.Picture.Image.ContentType"));
        }
        IPPImage image = iPictureFrame.getPictureFormat().getPicture().getImage();
        m5267k4(C14113y2.m67402k4("{0}.png", C14113y2.m67401k4(C14113y2.m67401k4("Slide{SlideID}{PictureName}", "{SlideID}", C14114y9.m67465x1(iPictureFrame.getSlide().getSlideId())), "{PictureName}", C14113y2.m67401k4(iPictureFrame.getName(), " ", ""))));
        C3152yj c3152yj = new C3152yj();
        try {
            ((PPImage) image).m2131k4().m56333k4(c3152yj, C3977ck.m15681jd());
            m5269k4(c3152yj.toArray());
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m5267k4(String str) {
        this.f4663jd = str;
    }

    /* JADX INFO: renamed from: x1 */
    private void m5277x1(boolean z) {
        this.f4661dy = z;
    }

    /* JADX INFO: renamed from: k4 */
    private void m5268k4(boolean z) {
        this.f4666m9 = z;
    }

    /* JADX INFO: renamed from: k4 */
    private void m5269k4(byte[] bArr) {
        this.f4658c5 = bArr;
    }

    @Override // com.aspose.slides.InterfaceC14264p2
    /* JADX INFO: renamed from: k4 */
    public final byte[] mo5283k4() {
        return this.f4658c5;
    }
}
