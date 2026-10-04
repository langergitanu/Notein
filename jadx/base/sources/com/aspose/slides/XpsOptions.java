package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class XpsOptions extends SaveOptions implements IXpsOptions {

    /* JADX INFO: renamed from: k4 */
    private boolean f3726k4 = true;

    /* JADX INFO: renamed from: kk */
    private boolean f3727kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f3728x1;

    @Override // com.aspose.slides.IXpsOptions
    public final boolean getDrawSlidesFrame() {
        return this.f3728x1;
    }

    @Override // com.aspose.slides.IXpsOptions
    public final boolean getSaveMetafilesAsPng() {
        return this.f3726k4;
    }

    @Override // com.aspose.slides.IXpsOptions
    public final boolean getShowHiddenSlides() {
        return this.f3727kk;
    }

    @Override // com.aspose.slides.IXpsOptions
    public final void setDrawSlidesFrame(boolean z) {
        this.f3728x1 = z;
    }

    @Override // com.aspose.slides.IXpsOptions
    public final void setSaveMetafilesAsPng(boolean z) {
        this.f3726k4 = z;
    }

    @Override // com.aspose.slides.IXpsOptions
    public final void setShowHiddenSlides(boolean z) {
        this.f3727kk = z;
    }
}
