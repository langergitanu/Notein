package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class PresentationText implements IPresentationText {

    /* JADX INFO: renamed from: k4 */
    private final ISlideText[] f3164k4;

    public PresentationText(ISlideText[] iSlideTextArr) {
        this.f3164k4 = iSlideTextArr;
    }

    @Override // com.aspose.slides.IPresentationText
    public final ISlideText[] getSlidesText() {
        return this.f3164k4;
    }
}
