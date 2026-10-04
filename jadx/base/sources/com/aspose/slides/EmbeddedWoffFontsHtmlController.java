package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class EmbeddedWoffFontsHtmlController implements IEmbeddedWoffFontsHtmlController {

    /* JADX INFO: renamed from: x1 */
    private static final AbstractC14653ux f2204x1 = new ih0();

    /* JADX INFO: renamed from: k4 */
    private final C14852ym f2205k4;

    public EmbeddedWoffFontsHtmlController() {
        this.f2205k4 = new C14852ym(f2204x1, C14852ym.f50370k4);
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeDocumentEnd(IHtmlGenerator iHtmlGenerator, IPresentation iPresentation) {
        this.f2205k4.m73938to(iHtmlGenerator, iPresentation);
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeDocumentStart(IHtmlGenerator iHtmlGenerator, IPresentation iPresentation) {
        this.f2205k4.m73933k4(iHtmlGenerator, iPresentation);
        this.f2205k4.m73939x1(iHtmlGenerator, iPresentation);
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeShapeEnd(IHtmlGenerator iHtmlGenerator, IShape iShape) {
        this.f2205k4.m73940x1(iHtmlGenerator, iShape);
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeShapeStart(IHtmlGenerator iHtmlGenerator, IShape iShape) {
        this.f2205k4.m73934k4(iHtmlGenerator, iShape);
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeSlideEnd(IHtmlGenerator iHtmlGenerator, ISlide iSlide) {
        this.f2205k4.m73941x1(iHtmlGenerator, iSlide);
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeSlideStart(IHtmlGenerator iHtmlGenerator, ISlide iSlide) {
        this.f2205k4.m73935k4(iHtmlGenerator, iSlide);
    }

    public EmbeddedWoffFontsHtmlController(IHtmlFormattingController iHtmlFormattingController) {
        this.f2205k4 = new C14852ym(iHtmlFormattingController, C14852ym.f50370k4, f2204x1);
    }
}
