package com.aspose.slides.internal.p071cz;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2771j0 extends AbstractC2759hz {

    /* JADX INFO: renamed from: k4 */
    private double f8630k4;

    public C2771j0(double d) {
        m12335k4(d);
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2759hz, com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: k4 */
    public AbstractC2759hz cloneT() {
        return new C2771j0(this.f8630k4);
    }

    /* JADX INFO: renamed from: x1 */
    public final double m12336x1() {
        return this.f8630k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12335k4(double d) {
        if (d <= 0.0d) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f8630k4 = d;
    }
}
