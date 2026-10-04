package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class gt8 implements ISlideText {

    /* JADX INFO: renamed from: k4 */
    private final String f5337k4;

    /* JADX INFO: renamed from: kk */
    private final String f5338kk;

    /* JADX INFO: renamed from: to */
    private final String f5339to;

    /* JADX INFO: renamed from: x1 */
    private final String f5340x1;

    public gt8(String str, String str2, String str3, String str4) {
        this.f5337k4 = str;
        this.f5340x1 = str2;
        this.f5338kk = str3;
        this.f5339to = str4;
    }

    @Override // com.aspose.slides.ISlideText
    public final String getLayoutText() {
        return this.f5338kk;
    }

    @Override // com.aspose.slides.ISlideText
    public final String getMasterText() {
        return this.f5340x1;
    }

    @Override // com.aspose.slides.ISlideText
    public final String getNotesText() {
        return this.f5339to;
    }

    @Override // com.aspose.slides.ISlideText
    public final String getText() {
        return this.f5337k4;
    }
}
