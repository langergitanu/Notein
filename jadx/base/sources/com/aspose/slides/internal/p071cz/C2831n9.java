package com.aspose.slides.internal.p071cz;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.n9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2831n9 extends AbstractC2720f3 {

    /* JADX INFO: renamed from: k4 */
    private C2798kx f8688k4;

    public C2831n9(C2798kx c2798kx) {
        m12419k4(c2798kx);
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2720f3, com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: k4 */
    public AbstractC2720f3 cloneT() {
        return new C2831n9(this.f8688k4);
    }

    /* JADX INFO: renamed from: x1 */
    public final C2798kx m12420x1() {
        return this.f8688k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12419k4(C2798kx c2798kx) {
        if (c2798kx == this.f8688k4) {
            return;
        }
        if (c2798kx == null) {
            throw new ArgumentNullException("value");
        }
        this.f8688k4 = c2798kx.cloneT();
    }
}
