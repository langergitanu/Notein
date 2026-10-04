package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IHtmlFormattingController {
    void writeDocumentEnd(IHtmlGenerator iHtmlGenerator, IPresentation iPresentation);

    void writeDocumentStart(IHtmlGenerator iHtmlGenerator, IPresentation iPresentation);

    void writeShapeEnd(IHtmlGenerator iHtmlGenerator, IShape iShape);

    void writeShapeStart(IHtmlGenerator iHtmlGenerator, IShape iShape);

    void writeSlideEnd(IHtmlGenerator iHtmlGenerator, ISlide iSlide);

    void writeSlideStart(IHtmlGenerator iHtmlGenerator, ISlide iSlide);
}
