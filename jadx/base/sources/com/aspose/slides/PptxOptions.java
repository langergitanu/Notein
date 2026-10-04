package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class PptxOptions extends SaveOptions implements IPptxOptions, Cloneable {

    /* JADX INFO: renamed from: k4 */
    private int f3059k4;

    /* JADX INFO: renamed from: x1 */
    private int f3060x1;

    public PptxOptions() {
        setConformance(0);
        setZip64Mode(1);
    }

    @Override // com.aspose.slides.IPptxOptions
    public final int getConformance() {
        return this.f3059k4;
    }

    @Override // com.aspose.slides.IPptxOptions
    public final int getZip64Mode() {
        return this.f3060x1;
    }

    public Object memberwiseClone() {
        try {
            return (PptxOptions) clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.slides.IPptxOptions
    public final void setConformance(int i) {
        this.f3059k4 = i;
    }

    @Override // com.aspose.slides.IPptxOptions
    public final void setZip64Mode(int i) {
        this.f3060x1 = i;
    }
}
