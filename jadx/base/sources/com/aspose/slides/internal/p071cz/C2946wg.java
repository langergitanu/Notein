package com.aspose.slides.internal.p071cz;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.wg */
/* JADX INFO: loaded from: classes3.dex */
public final class C2946wg extends AbstractC2679c1 {

    /* JADX INFO: renamed from: k4 */
    private C2709e0 f8792k4;

    public C2946wg(C2709e0 c2709e0) {
        m12586k4(c2709e0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12586k4(C2709e0 c2709e0) {
        if (c2709e0 == null) {
            throw new ArgumentNullException("value");
        }
        if (c2709e0 == this.f8792k4) {
            return;
        }
        this.f8792k4 = c2709e0.cloneT();
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2679c1, com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: kk */
    public AbstractC2679c1 cloneT() {
        return new C2946wg(this.f8792k4);
    }
}
