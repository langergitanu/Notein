package com.aspose.slides.internal.p071cz;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.gv */
/* JADX INFO: loaded from: classes3.dex */
public final class C2743gv extends AbstractC2718ew {

    /* JADX INFO: renamed from: k4 */
    private C2808m2 f8600k4;

    public C2743gv() {
        m12289k4(m12288x1());
    }

    /* JADX INFO: renamed from: x1 */
    private static C2808m2 m12288x1() {
        return C2808m2.m12403k4(79, 129, 189);
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2718ew, com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: k4 */
    public AbstractC2718ew cloneT() {
        return new C2743gv(this.f8600k4);
    }

    public C2743gv(C2808m2 c2808m2) {
        m12289k4(c2808m2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12289k4(C2808m2 c2808m2) {
        if (this.f8600k4 != c2808m2) {
            if (c2808m2 == null) {
                throw new ArgumentNullException("value");
            }
            this.f8600k4 = c2808m2.cloneT();
        }
    }
}
