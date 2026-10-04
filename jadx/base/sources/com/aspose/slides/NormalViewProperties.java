package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class NormalViewProperties implements INormalViewProperties {

    /* JADX INFO: renamed from: du */
    private boolean f2831du;

    /* JADX INFO: renamed from: k4 */
    private boolean f2833k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f2837x1;

    /* JADX INFO: renamed from: kk */
    private int f2834kk = 1;

    /* JADX INFO: renamed from: to */
    private int f2836to = 2;

    /* JADX INFO: renamed from: h4 */
    private INormalViewRestoredProperties f2832h4 = new NormalViewRestoredProperties();

    /* JADX INFO: renamed from: m9 */
    private INormalViewRestoredProperties f2835m9 = new NormalViewRestoredProperties();

    public NormalViewProperties() {
        this.f2832h4.setDimensionSize(16.0f);
    }

    @Override // com.aspose.slides.INormalViewProperties
    public final int getHorizontalBarState() {
        return this.f2836to;
    }

    @Override // com.aspose.slides.INormalViewProperties
    public final boolean getPreferSingleView() {
        return this.f2831du;
    }

    @Override // com.aspose.slides.INormalViewProperties
    public final INormalViewRestoredProperties getRestoredLeft() {
        return this.f2832h4;
    }

    @Override // com.aspose.slides.INormalViewProperties
    public final INormalViewRestoredProperties getRestoredTop() {
        return this.f2835m9;
    }

    @Override // com.aspose.slides.INormalViewProperties
    public final boolean getShowOutlineIcons() {
        return this.f2833k4;
    }

    @Override // com.aspose.slides.INormalViewProperties
    public final boolean getSnapVerticalSplitter() {
        return this.f2837x1;
    }

    @Override // com.aspose.slides.INormalViewProperties
    public final int getVerticalBarState() {
        return this.f2834kk;
    }

    @Override // com.aspose.slides.INormalViewProperties
    public final void setHorizontalBarState(int i) {
        this.f2836to = i;
    }

    @Override // com.aspose.slides.INormalViewProperties
    public final void setPreferSingleView(boolean z) {
        this.f2831du = z;
    }

    @Override // com.aspose.slides.INormalViewProperties
    public final void setShowOutlineIcons(boolean z) {
        this.f2833k4 = z;
    }

    @Override // com.aspose.slides.INormalViewProperties
    public final void setSnapVerticalSplitter(boolean z) {
        this.f2837x1 = z;
    }

    @Override // com.aspose.slides.INormalViewProperties
    public final void setVerticalBarState(int i) {
        this.f2834kk = i;
    }
}
