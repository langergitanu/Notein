package com.aspose.slides.internal.p438ub;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.ub.x1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11303x1 implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private AbstractC3150x6 f38877k4;

    public AbstractC11303x1(AbstractC3150x6 abstractC3150x6) {
        this.f38877k4 = abstractC3150x6;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        AbstractC3150x6 abstractC3150x6 = this.f38877k4;
        if (abstractC3150x6 != null) {
            abstractC3150x6.dispose();
        }
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC3150x6 m54292kk() {
        return this.f38877k4;
    }
}
