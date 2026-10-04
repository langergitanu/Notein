package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: renamed from: com.aspose.slides.ov */
/* JADX INFO: loaded from: classes3.dex */
class C14256ov extends AbstractC14463so {

    /* JADX INFO: renamed from: k4 */
    private C12003du f47964k4 = new C12003du();

    /* JADX INFO: renamed from: x1 */
    private PVIObject f47965x1;

    public C14256ov(PVIObject pVIObject) {
        this.f47965x1 = pVIObject;
    }

    /* JADX INFO: renamed from: x1 */
    private void m68877x1() {
        PVIObject pVIObject = this.f47965x1;
        if (pVIObject != null) {
            pVIObject.m2145uz();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C12003du m68878k4() {
        return this.f47964k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68879k4(C12003du c12003du) {
        if (C12003du.m56476x1(this.f47964k4, c12003du)) {
            c12003du.CloneTo(this.f47964k4);
            m68877x1();
        }
    }
}
