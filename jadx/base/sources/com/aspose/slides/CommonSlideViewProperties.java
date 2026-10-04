package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: loaded from: classes3.dex */
public class CommonSlideViewProperties implements ICommonSlideViewProperties {

    /* JADX INFO: renamed from: k4 */
    private int f2029k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f2030x1;

    @Override // com.aspose.slides.ICommonSlideViewProperties
    public final int getScale() {
        return this.f2029k4;
    }

    @Override // com.aspose.slides.ICommonSlideViewProperties
    public final boolean getVariableScale() {
        return this.f2030x1;
    }

    @Override // com.aspose.slides.ICommonSlideViewProperties
    public final void setScale(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("Scaling ratio can't be less than zero.");
        }
        this.f2029k4 = i;
    }

    @Override // com.aspose.slides.ICommonSlideViewProperties
    public final void setVariableScale(boolean z) {
        this.f2030x1 = z;
    }
}
