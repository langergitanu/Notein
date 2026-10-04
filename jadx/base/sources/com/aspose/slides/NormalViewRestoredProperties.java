package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: loaded from: classes3.dex */
public class NormalViewRestoredProperties implements INormalViewRestoredProperties {

    /* JADX INFO: renamed from: k4 */
    private float f2838k4 = 0.0f;

    /* JADX INFO: renamed from: x1 */
    private boolean f2839x1 = true;

    @Override // com.aspose.slides.INormalViewRestoredProperties
    public final boolean getAutoAdjust() {
        return this.f2839x1;
    }

    @Override // com.aspose.slides.INormalViewRestoredProperties
    public final float getDimensionSize() {
        return this.f2838k4;
    }

    @Override // com.aspose.slides.INormalViewRestoredProperties
    public final void setAutoAdjust(boolean z) {
        this.f2839x1 = z;
    }

    @Override // com.aspose.slides.INormalViewRestoredProperties
    public final void setDimensionSize(float f) {
        if (f < 0.0f || f > 100.0f) {
            throw new ArgumentOutOfRangeException("Scaling ratio can't be less than zero.");
        }
        this.f2838k4 = f;
    }
}
