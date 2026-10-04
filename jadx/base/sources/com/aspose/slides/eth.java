package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class eth extends AbstractC14463so {

    /* JADX INFO: renamed from: k4 */
    private long f4872k4 = 4294967295L;

    /* JADX INFO: renamed from: x1 */
    private final PVIObject f4873x1;

    public eth(PVIObject pVIObject) {
        this.f4873x1 = pVIObject;
    }

    /* JADX INFO: renamed from: x1 */
    private void m5688x1() {
        PVIObject pVIObject = this.f4873x1;
        if (pVIObject != null) {
            pVIObject.m2145uz();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final long m5689k4() {
        return this.f4872k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5690k4(long j) {
        if ((this.f4872k4 & 4294967295L) != (4294967295L & j)) {
            this.f4872k4 = j;
            m5688x1();
        }
    }
}
