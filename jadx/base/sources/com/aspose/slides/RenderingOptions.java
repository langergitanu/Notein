package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class RenderingOptions extends SaveOptions implements IRenderingOptions {

    /* JADX INFO: renamed from: k4 */
    private NotesCommentsLayoutingOptions f3225k4 = new NotesCommentsLayoutingOptions();

    /* JADX INFO: renamed from: kk */
    private InkOptions f3226kk = new InkOptions();

    /* JADX INFO: renamed from: x1 */
    private ISlidesLayoutOptions f3227x1;

    @Override // com.aspose.slides.IRenderingOptions
    public final IInkOptions getInkOptions() {
        return this.f3226kk;
    }

    @Override // com.aspose.slides.IRenderingOptions
    @Deprecated
    public final INotesCommentsLayoutingOptions getNotesCommentsLayouting() {
        return this.f3225k4;
    }

    @Override // com.aspose.slides.IRenderingOptions
    public final ISlidesLayoutOptions getSlidesLayoutOptions() {
        return this.f3227x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final NotesCommentsLayoutingOptions m2474k4() {
        return this.f3225k4;
    }

    @Override // com.aspose.slides.IRenderingOptions
    public final void setSlidesLayoutOptions(ISlidesLayoutOptions iSlidesLayoutOptions) {
        if (C7019kk.m27469x1(iSlidesLayoutOptions, NotesCommentsLayoutingOptions.class)) {
            this.f3225k4 = (NotesCommentsLayoutingOptions) iSlidesLayoutOptions;
        }
        this.f3227x1 = iSlidesLayoutOptions;
    }
}
