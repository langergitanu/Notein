package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10434f9;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class HtmlOptions extends SaveOptions implements IHtmlOptions {

    /* JADX INFO: renamed from: fa */
    private static final SlideImageFormat f2458fa = SlideImageFormat.svg(new SVGOptions());

    /* JADX INFO: renamed from: h4 */
    private static HtmlFormatter f2459h4;

    /* JADX INFO: renamed from: c5 */
    private NotesCommentsLayoutingOptions f2460c5;

    /* JADX INFO: renamed from: ck */
    private InkOptions f2461ck;

    /* JADX INFO: renamed from: du */
    private final ILinkEmbedController f2462du;

    /* JADX INFO: renamed from: dy */
    private boolean f2463dy;

    /* JADX INFO: renamed from: jd */
    private ISlidesLayoutOptions f2464jd;

    /* JADX INFO: renamed from: k4 */
    private int f2465k4;

    /* JADX INFO: renamed from: kk */
    private HtmlFormatter f2466kk;

    /* JADX INFO: renamed from: m9 */
    private final qwr f2467m9;

    /* JADX INFO: renamed from: to */
    private SlideImageFormat f2468to;

    /* JADX INFO: renamed from: x1 */
    private boolean f2469x1;

    public HtmlOptions() {
        this.f2465k4 = 85;
        this.f2466kk = null;
        this.f2468to = null;
        this.f2467m9 = qwr.m69783to();
        this.f2460c5 = new NotesCommentsLayoutingOptions();
        this.f2461ck = new InkOptions();
        this.f2462du = C10434f9.f36986k4;
    }

    @Override // com.aspose.slides.IHtmlOptions
    public final boolean getDeletePicturesCroppedAreas() {
        return this.f2467m9.m69788x1();
    }

    @Override // com.aspose.slides.IHtmlOptions
    public final IHtmlFormatter getHtmlFormatter() {
        return this.f2466kk;
    }

    @Override // com.aspose.slides.IHtmlOptions
    public final IInkOptions getInkOptions() {
        return this.f2461ck;
    }

    @Override // com.aspose.slides.IHtmlOptions
    public final byte getJpegQuality() {
        return (byte) this.f2465k4;
    }

    @Override // com.aspose.slides.IHtmlOptions
    @Deprecated
    public final INotesCommentsLayoutingOptions getNotesCommentsLayouting() {
        return this.f2460c5;
    }

    @Override // com.aspose.slides.IHtmlOptions
    public final int getPicturesCompression() {
        return this.f2467m9.m69784k4();
    }

    @Override // com.aspose.slides.IHtmlOptions
    public final boolean getShowHiddenSlides() {
        return this.f2469x1;
    }

    @Override // com.aspose.slides.IHtmlOptions
    public final ISlideImageFormat getSlideImageFormat() {
        return this.f2468to;
    }

    @Override // com.aspose.slides.IHtmlOptions
    public final ISlidesLayoutOptions getSlidesLayoutOptions() {
        return this.f2464jd;
    }

    @Override // com.aspose.slides.IHtmlOptions
    public final boolean getSvgResponsiveLayout() {
        return this.f2463dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final HtmlFormatter m1680k4(int i) {
        HtmlFormatter htmlFormatter = this.f2466kk;
        if (htmlFormatter != null) {
            return htmlFormatter;
        }
        if (f2459h4 == null) {
            f2459h4 = HtmlFormatter.createDocumentFormatter(getSvgResponsiveLayout() ? C14113y2.m67408k4("svg { position: absolute; top: 0; left: 0; } .slide { position: relative; overflow: hidden; padding-top: ", C14057f9.m66591x1(i), "%; }") : null, true);
        }
        return f2459h4;
    }

    /* JADX INFO: renamed from: kk */
    public final qwr m1682kk() {
        return this.f2467m9;
    }

    @Override // com.aspose.slides.IHtmlOptions
    public final void setDeletePicturesCroppedAreas(boolean z) {
        this.f2467m9.m69786k4(z);
    }

    @Override // com.aspose.slides.IHtmlOptions
    public final void setHtmlFormatter(IHtmlFormatter iHtmlFormatter) {
        this.f2466kk = (HtmlFormatter) iHtmlFormatter;
    }

    @Override // com.aspose.slides.IHtmlOptions
    public final void setJpegQuality(byte b) {
        int i = b & 255;
        if (i < 0 || i > 100) {
            throw new ArgumentOutOfRangeException("value", "JpegQuality value must be between 0 and 100.");
        }
        this.f2465k4 = i;
    }

    @Override // com.aspose.slides.IHtmlOptions
    public final void setPicturesCompression(int i) {
        this.f2467m9.m69785k4(i);
    }

    @Override // com.aspose.slides.IHtmlOptions
    public final void setShowHiddenSlides(boolean z) {
        this.f2469x1 = z;
    }

    @Override // com.aspose.slides.IHtmlOptions
    public final void setSlideImageFormat(ISlideImageFormat iSlideImageFormat) {
        this.f2468to = (SlideImageFormat) iSlideImageFormat;
    }

    @Override // com.aspose.slides.IHtmlOptions
    public final void setSlidesLayoutOptions(ISlidesLayoutOptions iSlidesLayoutOptions) {
        if (C7019kk.m27469x1(iSlidesLayoutOptions, NotesCommentsLayoutingOptions.class)) {
            this.f2460c5 = (NotesCommentsLayoutingOptions) iSlidesLayoutOptions;
        }
        this.f2464jd = iSlidesLayoutOptions;
    }

    @Override // com.aspose.slides.IHtmlOptions
    public final void setSvgResponsiveLayout(boolean z) {
        this.f2463dy = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final ILinkEmbedController m1683x1() {
        return this.f2462du;
    }

    public HtmlOptions(ILinkEmbedController iLinkEmbedController) {
        this.f2465k4 = 85;
        this.f2466kk = null;
        this.f2468to = null;
        this.f2467m9 = qwr.m69783to();
        this.f2460c5 = new NotesCommentsLayoutingOptions();
        this.f2461ck = new InkOptions();
        this.f2462du = iLinkEmbedController == null ? C10434f9.f36986k4 : iLinkEmbedController;
        this.f2469x1 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final SlideImageFormat m1681k4() {
        SlideImageFormat slideImageFormat = this.f2468to;
        return slideImageFormat != null ? slideImageFormat : f2458fa;
    }
}
