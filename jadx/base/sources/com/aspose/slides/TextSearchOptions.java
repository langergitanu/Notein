package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class TextSearchOptions implements ITextSearchOptions {

    /* JADX INFO: renamed from: k4 */
    private boolean f3542k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f3543x1;

    public TextSearchOptions() {
        setCaseSensitive(false);
        setWholeWordsOnly(false);
    }

    @Override // com.aspose.slides.ITextSearchOptions
    public final boolean getCaseSensitive() {
        return this.f3542k4;
    }

    @Override // com.aspose.slides.ITextSearchOptions
    public final boolean getWholeWordsOnly() {
        return this.f3543x1;
    }

    @Override // com.aspose.slides.ITextSearchOptions
    public final void setCaseSensitive(boolean z) {
        this.f3542k4 = z;
    }

    @Override // com.aspose.slides.ITextSearchOptions
    public final void setWholeWordsOnly(boolean z) {
        this.f3543x1 = z;
    }
}
