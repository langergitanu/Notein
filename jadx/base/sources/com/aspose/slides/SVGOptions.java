package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p407st.C10434f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public final class SVGOptions extends SaveOptions implements ISVGOptions, Cloneable {

    /* JADX INFO: renamed from: ck */
    private boolean f3259ck;

    /* JADX INFO: renamed from: du */
    private int f3260du;

    /* JADX INFO: renamed from: dy */
    private C14919zy f3261dy;

    /* JADX INFO: renamed from: fa */
    private ISvgShapeFormattingController f3262fa;

    /* JADX INFO: renamed from: jd */
    private boolean f3264jd;

    /* JADX INFO: renamed from: k4 */
    private boolean f3265k4;

    /* JADX INFO: renamed from: kk */
    private boolean f3266kk;

    /* JADX INFO: renamed from: ks */
    private InkOptions f3267ks;

    /* JADX INFO: renamed from: m9 */
    private ILinkEmbedController f3268m9;

    /* JADX INFO: renamed from: to */
    private boolean f3269to;

    /* JADX INFO: renamed from: x1 */
    private boolean f3271x1;

    /* JADX INFO: renamed from: h4 */
    private ILinkEmbedController f3263h4 = C10434f9.f36986k4;

    /* JADX INFO: renamed from: c5 */
    private int f3258c5 = 85;

    /* JADX INFO: renamed from: up */
    private int f3270up = 0;

    /* JADX INFO: renamed from: yj */
    private final qwr f3272yj = qwr.m69783to();

    public SVGOptions() {
        m2505du();
    }

    /* JADX INFO: renamed from: du */
    private void m2505du() {
        C14919zy c14919zy = new C14919zy();
        this.f3261dy = c14919zy;
        c14919zy.m74884k4("Webdings", 2);
        this.f3261dy.m74886x1("\\AWingdings\\s?[23]?\\z", 2);
        this.f3261dy.m74884k4("Symbol", 2);
        this.f3265k4 = false;
        this.f3271x1 = false;
        this.f3266kk = false;
        this.f3269to = false;
        this.f3260du = 72;
        this.f3264jd = false;
        this.f3259ck = true;
        this.f3267ks = new InkOptions();
    }

    public static SVGOptions getDefault() {
        return new SVGOptions();
    }

    public static SVGOptions getSimple() {
        SVGOptions sVGOptions = new SVGOptions();
        sVGOptions.setDisable3DText(true);
        sVGOptions.setVectorizeText(false);
        sVGOptions.setDisableGradientSplit(true);
        sVGOptions.setDisableLineEndCropping(true);
        sVGOptions.m2506k4().m74885x1();
        return sVGOptions;
    }

    public static SVGOptions getWYSIWYG() {
        SVGOptions sVGOptions = new SVGOptions();
        sVGOptions.setVectorizeText(true);
        sVGOptions.setMetafileRasterizationDpi(300);
        return sVGOptions;
    }

    @Override // com.aspose.slides.ISVGOptions
    public final boolean getDeletePicturesCroppedAreas() {
        return this.f3272yj.m69788x1();
    }

    @Override // com.aspose.slides.ISVGOptions
    public final boolean getDisable3DText() {
        return this.f3271x1;
    }

    @Override // com.aspose.slides.ISVGOptions
    public final boolean getDisableGradientSplit() {
        return this.f3266kk;
    }

    @Override // com.aspose.slides.ISVGOptions
    public final boolean getDisableLineEndCropping() {
        return this.f3269to;
    }

    @Override // com.aspose.slides.ISVGOptions
    public final int getExternalFontsHandling() {
        return this.f3270up;
    }

    @Override // com.aspose.slides.ISVGOptions
    public final IInkOptions getInkOptions() {
        return this.f3267ks;
    }

    @Override // com.aspose.slides.ISVGOptions
    public final int getJpegQuality() {
        return this.f3258c5;
    }

    @Override // com.aspose.slides.ISVGOptions
    public final int getMetafileRasterizationDpi() {
        return this.f3260du;
    }

    @Override // com.aspose.slides.ISVGOptions
    public final int getPicturesCompression() {
        return this.f3272yj.m69784k4();
    }

    @Override // com.aspose.slides.ISVGOptions
    public final ISvgShapeFormattingController getShapeFormattingController() {
        return this.f3262fa;
    }

    @Override // com.aspose.slides.ISVGOptions
    public final boolean getUseFrameRotation() {
        return this.f3259ck;
    }

    @Override // com.aspose.slides.ISVGOptions
    public final boolean getUseFrameSize() {
        return this.f3264jd;
    }

    @Override // com.aspose.slides.ISVGOptions
    public final boolean getVectorizeText() {
        return this.f3265k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14919zy m2506k4() {
        return this.f3261dy;
    }

    /* JADX INFO: renamed from: kk */
    public final qwr m2508kk() {
        return this.f3272yj;
    }

    public Object memberwiseClone() {
        try {
            return (SVGOptions) clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.slides.ISVGOptions
    public final void setDeletePicturesCroppedAreas(boolean z) {
        this.f3272yj.m69786k4(z);
    }

    @Override // com.aspose.slides.ISVGOptions
    public final void setDisable3DText(boolean z) {
        this.f3271x1 = z;
    }

    @Override // com.aspose.slides.ISVGOptions
    public final void setDisableGradientSplit(boolean z) {
        this.f3266kk = z;
    }

    @Override // com.aspose.slides.ISVGOptions
    public final void setDisableLineEndCropping(boolean z) {
        this.f3269to = z;
    }

    @Override // com.aspose.slides.ISVGOptions
    public final void setExternalFontsHandling(int i) {
        this.f3270up = i;
    }

    @Override // com.aspose.slides.ISVGOptions
    public final void setJpegQuality(int i) {
        if (i < 1 || i > 100) {
            throw new ArgumentOutOfRangeException(C14113y2.m67402k4("Value for JpegQuality ({0}) is out of range 1..100", Integer.valueOf(i)));
        }
        this.f3258c5 = i;
    }

    @Override // com.aspose.slides.ISVGOptions
    public final void setMetafileRasterizationDpi(int i) {
        if (i < 1) {
            throw new ArgumentException("MetafileRasterizationDpi can't be less than 1");
        }
        this.f3260du = i;
    }

    @Override // com.aspose.slides.ISVGOptions
    public final void setPicturesCompression(int i) {
        this.f3272yj.m69785k4(i);
    }

    @Override // com.aspose.slides.ISVGOptions
    public final void setShapeFormattingController(ISvgShapeFormattingController iSvgShapeFormattingController) {
        this.f3262fa = iSvgShapeFormattingController;
    }

    @Override // com.aspose.slides.ISVGOptions
    public final void setUseFrameRotation(boolean z) {
        this.f3259ck = z;
    }

    @Override // com.aspose.slides.ISVGOptions
    public final void setUseFrameSize(boolean z) {
        this.f3264jd = z;
    }

    @Override // com.aspose.slides.ISVGOptions
    public final void setVectorizeText(boolean z) {
        this.f3265k4 = z;
    }

    /* JADX INFO: renamed from: to */
    public final ISVGOptions m2509to() {
        SVGOptions sVGOptions = (SVGOptions) memberwiseClone();
        sVGOptions.f3261dy = new C14919zy(this.f3261dy);
        return sVGOptions;
    }

    /* JADX INFO: renamed from: x1 */
    public final ILinkEmbedController m2510x1() {
        return this.f3263h4;
    }

    public SVGOptions(ILinkEmbedController iLinkEmbedController) {
        m2505du();
        m2507k4(iLinkEmbedController);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2507k4(ILinkEmbedController iLinkEmbedController) {
        this.f3268m9 = iLinkEmbedController;
        if (iLinkEmbedController == null) {
            iLinkEmbedController = C10434f9.f36986k4;
        }
        this.f3263h4 = iLinkEmbedController;
    }
}
