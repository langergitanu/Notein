package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseHandoutNotesSlideHeaderFooterManager extends BaseSlideHeaderFooterManager implements IBaseHandoutNotesSlideHeaderFooterManag {
    public BaseHandoutNotesSlideHeaderFooterManager(BaseSlide baseSlide) {
        super(baseSlide);
    }

    @Override // com.aspose.slides.IBaseHandoutNotesSlideHeaderFooterManag
    public final boolean isHeaderVisible() {
        return m422x1((byte) 7);
    }

    @Override // com.aspose.slides.IBaseHandoutNotesSlideHeaderFooterManag
    public final void setHeaderText(String str) {
        m413k4((byte) 7, str, false);
    }

    @Override // com.aspose.slides.IBaseHandoutNotesSlideHeaderFooterManag
    public final void setHeaderVisibility(boolean z) {
        m414k4((byte) 7, z);
    }
}
