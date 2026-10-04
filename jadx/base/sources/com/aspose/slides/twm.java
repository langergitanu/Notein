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
class twm implements InterfaceC14264p2 {

    /* JADX INFO: renamed from: c5 */
    private byte[] f49199c5;

    /* JADX INFO: renamed from: ck */
    private XamlOptions f49200ck;

    /* JADX INFO: renamed from: du */
    private int f49201du;

    /* JADX INFO: renamed from: dy */
    private boolean f49202dy;

    /* JADX INFO: renamed from: fa */
    private boolean f49203fa;

    /* JADX INFO: renamed from: h4 */
    private float f49204h4;

    /* JADX INFO: renamed from: jd */
    private String f49205jd;

    /* JADX INFO: renamed from: k4 */
    private float f49206k4;

    /* JADX INFO: renamed from: kk */
    private float f49207kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f49208m9;

    /* JADX INFO: renamed from: to */
    private float f49209to;

    /* JADX INFO: renamed from: x1 */
    private float f49210x1;

    public twm(IPictureFrame iPictureFrame, XamlOptions xamlOptions) {
        if (iPictureFrame == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "WpfImageObject", "pictureFrame"));
        }
        if (xamlOptions == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "WpfImageObject", "options"));
        }
        m71346k4(0.0f);
        m71357x1(0.0f);
        m71352kk(0.0f);
        m71355to(0.0f);
        m71343du(0.0f);
        m71350k4(false);
        m71359x1(false);
        this.f49200ck = xamlOptions;
        m71349k4(C14113y2.f47374k4);
        m71348k4(iPictureFrame);
    }

    /* JADX INFO: renamed from: ck */
    private String m71342ck() {
        return C14113y2.m67411k4(mo5287x1()) ? C14113y2.f47374k4 : C14113y2.m67402k4(" Source=\"{0}\"", mo5287x1());
    }

    /* JADX INFO: renamed from: fa */
    private String m71344fa() {
        return C14113y2.m67402k4(" Margin=\"{0}, {1}\"", C14064he.m66711k4(m71366kk(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m71368to(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: jd */
    private String m71345jd() {
        String strM71342ck = m71342ck();
        String strM71344fa = m71344fa();
        String strM71356up = m71356up();
        String str = C14113y2.f47374k4;
        return !this.f49203fa ? C14113y2.m67402k4("<Image{0}{1}{2}/>", strM71342ck, strM71344fa, strM71356up) : C14113y2.m67402k4("<Image{0}{1}{2}{3}>{4}\r\n</Image>", strM71342ck, strM71344fa, strM71356up, m71361yj(), m71353ks());
    }

    /* JADX INFO: renamed from: k4 */
    private void m71346k4(float f) {
        this.f49206k4 = f;
    }

    /* JADX INFO: renamed from: ks */
    private String m71353ks() {
        return C14113y2.m67402k4("\r\n<Image.RenderTransform>\r\n    <TransformGroup>\r\n        {0}\r\n        <SkewTransform/>  \r\n        {1}\r\n        <TranslateTransform/>   \r\n    </TransformGroup>   \r\n</Image.RenderTransform>", m71354rv(), m71360x6());
    }

    /* JADX INFO: renamed from: rv */
    private String m71354rv() {
        return C14113y2.m67402k4("<ScaleTransform{0}{1}/>", m71364dy() ? " ScaleX=\"-1\"" : C14113y2.f47374k4, m71362c5() ? " ScaleY=\"-1\"" : C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: up */
    private String m71356up() {
        return C14113y2.m67402k4(" Width=\"{0}\" Height=\"{1}\"", C14064he.m66711k4(m71363du(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m71365h4(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: x6 */
    private String m71360x6() {
        return C14113y2.m67402k4("<RotateTransform{0}/>", m71367m9() != 0.0f ? C14113y2.m67402k4(" Angle=\"{0}\"", C14064he.m66711k4(m71367m9(), (InterfaceC14073kp) C11697x1.m55250kk())) : C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: yj */
    private String m71361yj() {
        return this.f49203fa ? " RenderTransformOrigin=\"0.5, 0.5\"" : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m71362c5() {
        return this.f49202dy;
    }

    /* JADX INFO: renamed from: du */
    public final float m71363du() {
        return this.f49207kk;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m71364dy() {
        return this.f49208m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final float m71365h4() {
        return this.f49209to;
    }

    /* JADX INFO: renamed from: kk */
    public final float m71366kk() {
        return this.f49206k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final float m71367m9() {
        return this.f49204h4;
    }

    /* JADX INFO: renamed from: to */
    public final float m71368to() {
        return this.f49210x1;
    }

    public String toString() {
        return m71345jd();
    }

    @Override // com.aspose.slides.InterfaceC14264p2
    /* JADX INFO: renamed from: x1 */
    public final String mo5287x1() {
        return this.f49205jd;
    }

    /* JADX INFO: renamed from: du */
    private void m71343du(float f) {
        this.f49204h4 = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m71347k4(int i) {
        this.f49201du = i;
    }

    /* JADX INFO: renamed from: kk */
    private void m71352kk(float f) {
        this.f49207kk = f;
    }

    /* JADX INFO: renamed from: to */
    private void m71355to(float f) {
        this.f49209to = f;
    }

    /* JADX INFO: renamed from: x1 */
    private void m71357x1(float f) {
        this.f49210x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m71348k4(IPictureFrame iPictureFrame) {
        XamlOptions xamlOptions = this.f49200ck;
        m71346k4(sza.m70913k4(xamlOptions, xamlOptions.m3114x1().Clone(), ((SlideSize) iPictureFrame.getPresentation().getSlideSize()).m2755k4().Clone(), iPictureFrame.getX()));
        m71346k4((float) C14116yg.m67477k4(m71366kk(), 2));
        XamlOptions xamlOptions2 = this.f49200ck;
        m71357x1(sza.m70913k4(xamlOptions2, xamlOptions2.m3114x1().Clone(), ((SlideSize) iPictureFrame.getPresentation().getSlideSize()).m2755k4().Clone(), iPictureFrame.getY()));
        m71357x1((float) C14116yg.m67477k4(m71368to(), 2));
        XamlOptions xamlOptions3 = this.f49200ck;
        m71352kk(sza.m70913k4(xamlOptions3, xamlOptions3.m3114x1().Clone(), ((SlideSize) iPictureFrame.getPresentation().getSlideSize()).m2755k4().Clone(), iPictureFrame.getWidth()));
        m71352kk((float) C14116yg.m67477k4(m71363du(), 2));
        XamlOptions xamlOptions4 = this.f49200ck;
        m71355to(sza.m70913k4(xamlOptions4, xamlOptions4.m3114x1().Clone(), ((SlideSize) iPictureFrame.getPresentation().getSlideSize()).m2755k4().Clone(), iPictureFrame.getHeight()));
        m71355to((float) C14116yg.m67477k4(m71365h4(), 2));
        m71347k4(iPictureFrame.getPictureFormat().getPictureFillMode());
        m71343du(iPictureFrame.getRotation());
        m71343du((float) C14116yg.m67477k4(m71367m9(), 2));
        m71350k4(iPictureFrame.getFrame().getFlipH() == 1);
        m71359x1(iPictureFrame.getFrame().getFlipV() == 1);
        if (m71367m9() != 0.0f || m71364dy() || m71362c5()) {
            this.f49203fa = true;
        }
        m71358x1(iPictureFrame);
    }

    /* JADX INFO: renamed from: x1 */
    private void m71358x1(IPictureFrame iPictureFrame) {
        if (C14113y2.m67411k4(iPictureFrame.getPictureFormat().getPicture().getImage().getContentType())) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "WpfImageObject", "pictureFrame.PictureFormat.Picture.Image.ContentType"));
        }
        IPPImage image = iPictureFrame.getPictureFormat().getPicture().getImage();
        m71349k4(C14113y2.m67402k4("{0}.png", C14113y2.m67401k4(C14113y2.m67401k4("Slide{SlideID}{PictureName}", "{SlideID}", C14114y9.m67465x1(iPictureFrame.getSlide().getSlideId())), "{PictureName}", C14113y2.m67401k4(iPictureFrame.getName(), " ", ""))));
        C3152yj c3152yj = new C3152yj();
        try {
            ((PPImage) image).m2131k4().m56333k4(c3152yj, C3977ck.m15681jd());
            m71351k4(c3152yj.toArray());
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m71349k4(String str) {
        this.f49205jd = str;
    }

    /* JADX INFO: renamed from: x1 */
    private void m71359x1(boolean z) {
        this.f49202dy = z;
    }

    /* JADX INFO: renamed from: k4 */
    private void m71350k4(boolean z) {
        this.f49208m9 = z;
    }

    /* JADX INFO: renamed from: k4 */
    private void m71351k4(byte[] bArr) {
        this.f49199c5 = bArr;
    }

    @Override // com.aspose.slides.InterfaceC14264p2
    /* JADX INFO: renamed from: k4 */
    public final byte[] mo5283k4() {
        return this.f49199c5;
    }
}
