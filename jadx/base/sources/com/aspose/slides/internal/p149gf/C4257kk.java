package com.aspose.slides.internal.p149gf;

import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p263m2.InterfaceC6308kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.gf.kk */
/* JADX INFO: loaded from: classes.dex */
public class C4257kk implements InterfaceC6308kk {

    /* JADX INFO: renamed from: k4 */
    private AbstractC3124b3 f11586k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC3150x6 f11587x1;

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f11587x1 = null;
        AbstractC3124b3 abstractC3124b3 = this.f11586k4;
        if (abstractC3124b3 != null) {
            abstractC3124b3.dispose();
            this.f11586k4 = null;
        }
    }

    @Override // com.aspose.slides.internal.p263m2.InterfaceC6308kk
    /* JADX INFO: renamed from: k4 */
    public final AbstractC3124b3 mo17107k4() {
        return this.f11586k4;
    }

    @Override // com.aspose.slides.internal.p263m2.InterfaceC6308kk
    /* JADX INFO: renamed from: k4 */
    public final void mo17108k4(AbstractC3124b3 abstractC3124b3) {
        this.f11586k4 = abstractC3124b3;
    }
}
