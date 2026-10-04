package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class FontSubstRule implements IFontSubstRule {

    /* JADX INFO: renamed from: k4 */
    private final IFontData f2324k4;

    /* JADX INFO: renamed from: kk */
    private final int f2325kk;

    /* JADX INFO: renamed from: x1 */
    private final IFontData f2326x1;

    public FontSubstRule(IFontData iFontData, IFontData iFontData2) {
        this.f2324k4 = iFontData;
        this.f2326x1 = iFontData2;
        this.f2325kk = 1;
    }

    @Override // com.aspose.slides.IFontSubstRule
    public final IFontData getDestFont() {
        return this.f2326x1;
    }

    @Override // com.aspose.slides.IFontSubstRule
    public final int getReplaceFontCondition() {
        return this.f2325kk;
    }

    @Override // com.aspose.slides.IFontSubstRule
    public final IFontData getSourceFont() {
        return this.f2324k4;
    }

    public FontSubstRule(IFontData iFontData, IFontData iFontData2, int i) {
        this.f2324k4 = iFontData;
        this.f2326x1 = iFontData2;
        this.f2325kk = i;
    }
}
