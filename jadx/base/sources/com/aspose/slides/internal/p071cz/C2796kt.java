package com.aspose.slides.internal.p071cz;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C2796kt extends AbstractC2759hz {

    /* JADX INFO: renamed from: k4 */
    private double f8672k4;

    public C2796kt(double d) {
        m12392k4(d);
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2759hz, com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: k4 */
    public AbstractC2759hz cloneT() {
        return new C2796kt(this.f8672k4);
    }

    /* JADX INFO: renamed from: x1 */
    public final double m12393x1() {
        return this.f8672k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12392k4(double d) {
        if (d < 25000.0d || d > 400000.0d) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f8672k4 = d;
    }
}
