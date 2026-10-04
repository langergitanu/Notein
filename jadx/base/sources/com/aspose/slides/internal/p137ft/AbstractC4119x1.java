package com.aspose.slides.internal.p137ft;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.ft.x1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4119x1 implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private AbstractC3150x6 f11286k4;

    public AbstractC4119x1(AbstractC3150x6 abstractC3150x6) {
        this.f11286k4 = abstractC3150x6;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        AbstractC3150x6 abstractC3150x6 = this.f11286k4;
        if (abstractC3150x6 != null) {
            abstractC3150x6.dispose();
        }
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC3150x6 m16483kk() {
        return this.f11286k4;
    }
}
