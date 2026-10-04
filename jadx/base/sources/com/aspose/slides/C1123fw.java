package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.fw */
/* JADX INFO: loaded from: classes3.dex */
class C1123fw extends AbstractC14413rs {

    /* JADX INFO: renamed from: du */
    private long f5140du;

    /* JADX INFO: renamed from: h4 */
    private ICamera f5141h4;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC0902di> f5142k4 = new AbstractC7018k4<AbstractC0902di>() { // from class: com.aspose.slides.fw.1
        {
            C1123fw.this.f5145x1 = new AbstractC0902di() { // from class: com.aspose.slides.fw.1.1
                @Override // com.aspose.slides.AbstractC0902di
                /* JADX INFO: renamed from: k4 */
                public void mo456k4() {
                    for (AbstractC0902di abstractC0902di : ((AbstractC7018k4) AnonymousClass1.this).f19081x1) {
                        if (abstractC0902di != null) {
                            abstractC0902di.mo456k4();
                        }
                    }
                }
            };
        }
    };

    /* JADX INFO: renamed from: kk */
    private boolean f5143kk;

    /* JADX INFO: renamed from: to */
    private boolean f5144to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC0902di f5145x1;

    public C1123fw(ICamera iCamera) {
        this.f5141h4 = iCamera;
    }

    /* JADX INFO: renamed from: kk */
    private void m6336kk() {
        this.f5140du++;
        if (C7019kk.m27469x1(this.f5141h4, PVIObject.class)) {
            ((PVIObject) this.f5141h4).m2145uz();
        }
        AbstractC0902di abstractC0902di = this.f5145x1;
        if (abstractC0902di == null || this.f5142k4.m27430k4()) {
            return;
        }
        abstractC0902di.mo456k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m6339x1(boolean z) {
        this.f5144to = z;
        m6336kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6337k4(boolean z) {
        this.f5143kk = z;
        m6336kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m6340x1() {
        return this.f5144to;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m6338k4() {
        return this.f5143kk;
    }
}
