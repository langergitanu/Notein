package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class TextToHtmlConversionOptions implements ITextToHtmlConversionOptions {

    /* JADX INFO: renamed from: k4 */
    private boolean f3552k4 = false;

    /* JADX INFO: renamed from: x1 */
    private int f3555x1 = 0;

    /* JADX INFO: renamed from: kk */
    private ILinkEmbedController f3553kk = null;

    /* JADX INFO: renamed from: to */
    private String f3554to = "utf-8";

    @Override // com.aspose.slides.ITextToHtmlConversionOptions
    public final boolean getAddClipboardFragmentHeader() {
        return this.f3552k4;
    }

    @Override // com.aspose.slides.ITextToHtmlConversionOptions
    public final String getEncodingName() {
        return this.f3554to;
    }

    @Override // com.aspose.slides.ITextToHtmlConversionOptions
    public final ILinkEmbedController getLinkEmbedController() {
        return this.f3553kk;
    }

    @Override // com.aspose.slides.ITextToHtmlConversionOptions
    public final int getTextInheritanceLimit() {
        return this.f3555x1;
    }

    @Override // com.aspose.slides.ITextToHtmlConversionOptions
    public final void setAddClipboardFragmentHeader(boolean z) {
        this.f3552k4 = z;
    }

    @Override // com.aspose.slides.ITextToHtmlConversionOptions
    public final void setEncodingName(String str) {
        this.f3554to = str;
    }

    @Override // com.aspose.slides.ITextToHtmlConversionOptions
    public final void setLinkEmbedController(ILinkEmbedController iLinkEmbedController) {
        this.f3553kk = iLinkEmbedController;
    }

    @Override // com.aspose.slides.ITextToHtmlConversionOptions
    public final void setTextInheritanceLimit(int i) {
        this.f3555x1 = i;
    }
}
