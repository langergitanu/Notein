package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class TextHighlightingOptions implements ITextHighlightingOptions {

    /* JADX INFO: renamed from: k4 */
    private boolean f3540k4 = false;

    /* JADX INFO: renamed from: x1 */
    private boolean f3541x1 = false;

    @Override // com.aspose.slides.ITextHighlightingOptions
    public final boolean getCaseSensitive() {
        return this.f3540k4;
    }

    @Override // com.aspose.slides.ITextHighlightingOptions
    public final boolean getWholeWordsOnly() {
        return this.f3541x1;
    }

    @Override // com.aspose.slides.ITextHighlightingOptions
    public final void setCaseSensitive(boolean z) {
        this.f3540k4 = z;
    }

    @Override // com.aspose.slides.ITextHighlightingOptions
    public final void setWholeWordsOnly(boolean z) {
        this.f3541x1 = z;
    }
}
