package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7414ck;

/* JADX INFO: renamed from: com.aspose.slides.b8 */
/* JADX INFO: loaded from: classes3.dex */
class C0808b8 extends AbstractC14463so {

    /* JADX INFO: renamed from: k4 */
    private AbstractC7414ck f4140k4;

    /* JADX INFO: renamed from: x1 */
    private IFormat f4141x1;

    public C0808b8(IFormat iFormat) {
        this.f4141x1 = iFormat;
    }

    /* JADX INFO: renamed from: x1 */
    private void m4043x1() {
        if (C7019kk.m27469x1(this.f4141x1, PVIObject.class)) {
            ((PVIObject) this.f4141x1).m2145uz();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC7414ck m4044k4() {
        return this.f4140k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4045k4(AbstractC7414ck abstractC7414ck) {
        this.f4140k4 = abstractC7414ck;
        m4043x1();
    }
}
