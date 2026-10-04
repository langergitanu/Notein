package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class Html5Options extends SaveOptions implements IHtml5Options {

    /* JADX INFO: renamed from: du */
    private INotesCommentsLayoutingOptions f2441du = new NotesCommentsLayoutingOptions();

    /* JADX INFO: renamed from: k4 */
    private boolean f2442k4;

    /* JADX INFO: renamed from: kk */
    private boolean f2443kk;

    /* JADX INFO: renamed from: to */
    private boolean f2444to;

    /* JADX INFO: renamed from: x1 */
    private String f2445x1;

    public Html5Options() {
        setEmbedImages(true);
    }

    @Override // com.aspose.slides.IHtml5Options
    public final boolean getAnimateShapes() {
        return this.f2444to;
    }

    @Override // com.aspose.slides.IHtml5Options
    public final boolean getAnimateTransitions() {
        return this.f2443kk;
    }

    @Override // com.aspose.slides.IHtml5Options
    public final boolean getEmbedImages() {
        return this.f2442k4;
    }

    @Override // com.aspose.slides.IHtml5Options
    public final INotesCommentsLayoutingOptions getNotesCommentsLayouting() {
        return this.f2441du;
    }

    @Override // com.aspose.slides.IHtml5Options
    public final String getOutputPath() {
        return this.f2445x1;
    }

    @Override // com.aspose.slides.IHtml5Options
    public final void setAnimateShapes(boolean z) {
        this.f2444to = z;
    }

    @Override // com.aspose.slides.IHtml5Options
    public final void setAnimateTransitions(boolean z) {
        this.f2443kk = z;
    }

    @Override // com.aspose.slides.IHtml5Options
    public final void setEmbedImages(boolean z) {
        this.f2442k4 = z;
    }

    @Override // com.aspose.slides.IHtml5Options
    public final void setNotesCommentsLayouting(INotesCommentsLayoutingOptions iNotesCommentsLayoutingOptions) {
        this.f2441du = iNotesCommentsLayoutingOptions;
    }

    @Override // com.aspose.slides.IHtml5Options
    public final void setOutputPath(String str) {
        this.f2445x1 = str;
    }
}
