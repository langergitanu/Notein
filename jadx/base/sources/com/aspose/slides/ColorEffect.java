package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class ColorEffect extends Behavior implements IColorEffect {

    /* JADX INFO: renamed from: dy */
    int f1933dy;

    /* JADX INFO: renamed from: m9 */
    int f1935m9;

    /* JADX INFO: renamed from: c5 */
    ColorOffset f1931c5 = new ColorOffset();

    /* JADX INFO: renamed from: du */
    ColorFormat f1932du = new ColorFormat(this);

    /* JADX INFO: renamed from: h4 */
    ColorFormat f1934h4 = new ColorFormat(this);

    @Override // com.aspose.slides.IColorEffect
    public final IColorOffset getBy() {
        return this.f1931c5;
    }

    @Override // com.aspose.slides.IColorEffect
    public final int getColorSpace() {
        return this.f1933dy;
    }

    @Override // com.aspose.slides.IColorEffect
    public final int getDirection() {
        return this.f1935m9;
    }

    @Override // com.aspose.slides.IColorEffect
    public final IColorFormat getFrom() {
        return this.f1932du;
    }

    @Override // com.aspose.slides.IColorEffect
    public final IColorFormat getTo() {
        return this.f1934h4;
    }

    @Override // com.aspose.slides.IColorEffect
    public final void setBy(IColorOffset iColorOffset) {
        this.f1931c5 = (ColorOffset) iColorOffset;
    }

    @Override // com.aspose.slides.IColorEffect
    public final void setColorSpace(int i) {
        this.f1933dy = i;
    }

    @Override // com.aspose.slides.IColorEffect
    public final void setDirection(int i) {
        this.f1935m9 = i;
    }

    @Override // com.aspose.slides.IColorEffect
    public final void setFrom(IColorFormat iColorFormat) {
        this.f1932du = (ColorFormat) iColorFormat;
    }

    @Override // com.aspose.slides.IColorEffect
    public final void setTo(IColorFormat iColorFormat) {
        this.f1934h4 = (ColorFormat) iColorFormat;
    }
}
