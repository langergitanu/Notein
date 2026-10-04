package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SaveOptions implements ISaveOptions {

    /* JADX INFO: renamed from: k4 */
    private int f3274k4 = 0;

    /* JADX INFO: renamed from: kk */
    private IProgressCallback f3275kk;

    /* JADX INFO: renamed from: to */
    private String f3276to;

    /* JADX INFO: renamed from: x1 */
    private IWarningCallback f3277x1;

    @Override // com.aspose.slides.ISaveOptions
    public final String getDefaultRegularFont() {
        return this.f3276to;
    }

    @Override // com.aspose.slides.ISaveOptions
    public final int getGradientStyle() {
        return this.f3274k4;
    }

    @Override // com.aspose.slides.ISaveOptions
    public final IProgressCallback getProgressCallback() {
        return this.f3275kk;
    }

    @Override // com.aspose.slides.ISaveOptions
    public final IWarningCallback getWarningCallback() {
        return this.f3277x1;
    }

    @Override // com.aspose.slides.ISaveOptions
    public final void setDefaultRegularFont(String str) {
        this.f3276to = str;
    }

    @Override // com.aspose.slides.ISaveOptions
    public final void setGradientStyle(int i) {
        this.f3274k4 = i;
    }

    @Override // com.aspose.slides.ISaveOptions
    public final void setProgressCallback(IProgressCallback iProgressCallback) {
        this.f3275kk = iProgressCallback;
    }

    @Override // com.aspose.slides.ISaveOptions
    public final void setWarningCallback(IWarningCallback iWarningCallback) {
        this.f3277x1 = iWarningCallback;
    }
}
