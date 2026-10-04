package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class AdjustValue implements IAdjustValue {

    /* JADX INFO: renamed from: k4 */
    private C13791lr f187k4;

    public AdjustValue(C13791lr c13791lr) {
        this.f187k4 = c13791lr;
    }

    @Override // com.aspose.slides.IAdjustValue
    public final float getAngleValue() {
        return this.f187k4.m64511x1();
    }

    @Override // com.aspose.slides.IAdjustValue
    public final String getName() {
        return this.f187k4.m64509kk();
    }

    @Override // com.aspose.slides.IAdjustValue
    public final long getRawValue() {
        return this.f187k4.m64504k4();
    }

    @Override // com.aspose.slides.IAdjustValue
    public final void setAngleValue(float f) {
        this.f187k4.m64505k4(f);
    }

    @Override // com.aspose.slides.IAdjustValue
    public final void setRawValue(long j) {
        this.f187k4.m64506k4(j);
    }
}
