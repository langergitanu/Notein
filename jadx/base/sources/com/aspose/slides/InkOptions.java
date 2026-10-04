package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class InkOptions implements IInkOptions {

    /* JADX INFO: renamed from: k4 */
    private boolean f2542k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f2543x1;

    public InkOptions() {
        setInterpretMaskOpAsOpacity(true);
    }

    @Override // com.aspose.slides.IInkOptions
    public final boolean getHideInk() {
        return this.f2542k4;
    }

    @Override // com.aspose.slides.IInkOptions
    public final boolean getInterpretMaskOpAsOpacity() {
        return this.f2543x1;
    }

    @Override // com.aspose.slides.IInkOptions
    public final void setHideInk(boolean z) {
        this.f2542k4 = z;
    }

    @Override // com.aspose.slides.IInkOptions
    public final void setInterpretMaskOpAsOpacity(boolean z) {
        this.f2543x1 = z;
    }
}
