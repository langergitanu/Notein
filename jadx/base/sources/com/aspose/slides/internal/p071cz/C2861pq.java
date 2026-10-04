package com.aspose.slides.internal.p071cz;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.pq */
/* JADX INFO: loaded from: classes3.dex */
public final class C2861pq extends AbstractC2725fb {

    /* JADX INFO: renamed from: k4 */
    private C2808m2 f8713k4;

    public C2861pq(C2808m2 c2808m2) {
        m12464k4(c2808m2);
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2725fb, com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: k4 */
    public AbstractC2725fb cloneT() {
        return new C2861pq(this.f8713k4);
    }

    /* JADX INFO: renamed from: x1 */
    public final C2808m2 m12465x1() {
        return this.f8713k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12464k4(C2808m2 c2808m2) {
        if (c2808m2 == this.f8713k4) {
            return;
        }
        if (c2808m2 == null) {
            throw new ArgumentNullException("value");
        }
        this.f8713k4 = c2808m2.cloneT();
    }
}
