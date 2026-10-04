package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class FormatFactory implements IFormatFactory {

    /* JADX INFO: renamed from: k4 */
    private static final FormatFactory f2365k4 = new FormatFactory();

    public static FormatFactory getInstance() {
        return f2365k4;
    }

    @Override // com.aspose.slides.IFormatFactory
    public final IParagraphFormat createParagraphFormat() {
        return new ParagraphFormat();
    }

    @Override // com.aspose.slides.IFormatFactory
    public final IPortionFormat createPortionFormat() {
        return new PortionFormat();
    }

    @Override // com.aspose.slides.IFormatFactory
    public final ITextFrameFormat createTextFrameFormat() {
        return new TextFrameFormat();
    }
}
