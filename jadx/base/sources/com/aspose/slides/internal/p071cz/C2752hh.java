package com.aspose.slides.internal.p071cz;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.hh */
/* JADX INFO: loaded from: classes3.dex */
public class C2752hh implements IGenericCloneable<C2752hh> {

    /* JADX INFO: renamed from: k4 */
    private final double f8612k4;

    public C2752hh(double d) {
        if (0.0d > d || 5.12064E7d < d) {
            throw new ArgumentOutOfRangeException("value", "Value should be between 0 and 51206400.");
        }
        this.f8612k4 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public double m12305k4() {
        return this.f8612k4;
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public C2752hh cloneT() {
        return new C2752hh(this.f8612k4);
    }
}
