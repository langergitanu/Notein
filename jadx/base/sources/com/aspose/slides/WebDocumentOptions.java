package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class WebDocumentOptions {

    /* JADX INFO: renamed from: du */
    private boolean f3698du;

    /* JADX INFO: renamed from: k4 */
    private ITemplateEngine f3699k4;

    /* JADX INFO: renamed from: kk */
    private boolean f3700kk;

    /* JADX INFO: renamed from: to */
    private boolean f3701to;

    /* JADX INFO: renamed from: x1 */
    private IOutputSaver f3702x1;

    public final boolean getAnimateShapes() {
        return this.f3698du;
    }

    public final boolean getAnimateTransitions() {
        return this.f3701to;
    }

    public final boolean getEmbedImages() {
        return this.f3700kk;
    }

    public final IOutputSaver getOutputSaver() {
        return this.f3702x1;
    }

    public final ITemplateEngine getTemplateEngine() {
        return this.f3699k4;
    }

    public final void setAnimateShapes(boolean z) {
        this.f3698du = z;
    }

    public final void setAnimateTransitions(boolean z) {
        this.f3701to = z;
    }

    public final void setEmbedImages(boolean z) {
        this.f3700kk = z;
    }

    public final void setOutputSaver(IOutputSaver iOutputSaver) {
        this.f3702x1 = iOutputSaver;
    }

    public final void setTemplateEngine(ITemplateEngine iTemplateEngine) {
        this.f3699k4 = iTemplateEngine;
    }
}
