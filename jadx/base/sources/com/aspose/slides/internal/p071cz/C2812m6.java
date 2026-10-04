package com.aspose.slides.internal.p071cz;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.m6 */
/* JADX INFO: loaded from: classes3.dex */
public class C2812m6 implements IGenericCloneable<C2812m6> {

    /* JADX INFO: renamed from: k4 */
    private final double f8682k4;

    public C2812m6(double d) {
        if (-5.12064E7d > d || 5.12064E7d < d) {
            throw new ArgumentOutOfRangeException("value", "Value should be between -51206400 and 51206400.");
        }
        this.f8682k4 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public double m12405k4() {
        return this.f8682k4;
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public C2812m6 cloneT() {
        return new C2812m6(this.f8682k4);
    }
}
