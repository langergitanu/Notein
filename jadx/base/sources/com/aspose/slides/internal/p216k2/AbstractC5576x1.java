package com.aspose.slides.internal.p216k2;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.k2.x1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5576x1 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC3150x6 f15347k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f15348x1 = false;

    public AbstractC5576x1(AbstractC3150x6 abstractC3150x6) {
        this.f15347k4 = abstractC3150x6;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC3150x6 m22906k4() {
        return this.f15347k4;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo22905k4(AbstractC12536x1 abstractC12536x1);

    /* JADX INFO: renamed from: x1 */
    public final void m22907x1(AbstractC12536x1 abstractC12536x1) {
        AbstractC3150x6 abstractC3150x6;
        mo22905k4(abstractC12536x1);
        if (!this.f15348x1 || (abstractC3150x6 = this.f15347k4) == null) {
            return;
        }
        abstractC3150x6.close();
    }
}
