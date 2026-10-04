package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class RotationEffect extends Behavior implements IRotationEffect {

    /* JADX INFO: renamed from: du */
    float f3240du = Float.NaN;

    /* JADX INFO: renamed from: h4 */
    float f3241h4 = Float.NaN;

    /* JADX INFO: renamed from: m9 */
    float f3242m9 = Float.NaN;

    @Override // com.aspose.slides.IRotationEffect
    public final float getBy() {
        return this.f3242m9;
    }

    @Override // com.aspose.slides.IRotationEffect
    public final float getFrom() {
        return this.f3240du;
    }

    @Override // com.aspose.slides.IRotationEffect
    public final float getTo() {
        return this.f3241h4;
    }

    @Override // com.aspose.slides.IRotationEffect
    public final void setBy(float f) {
        this.f3242m9 = f;
    }

    @Override // com.aspose.slides.IRotationEffect
    public final void setFrom(float f) {
        this.f3240du = f;
    }

    @Override // com.aspose.slides.IRotationEffect
    public final void setTo(float f) {
        this.f3241h4 = f;
    }
}
