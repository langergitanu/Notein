package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.c3 */
/* JADX INFO: loaded from: classes3.dex */
public class C2025c3 extends C2236ov {

    /* JADX INFO: renamed from: k4 */
    private C2395yu f7037k4;

    public C2025c3(C2377xv c2377xv, long j, long j2, long j3) {
        super(c2377xv, j, j2, j3);
    }

    /* JADX INFO: renamed from: k4 */
    public final C2395yu m10298k4() {
        m11218dq();
        return this.f7037k4;
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: x1 */
    public void mo10300x1(C2212n9 c2212n9) {
        super.mo10300x1(c2212n9);
        this.f7037k4 = new C2395yu(m11223yd().m11705x1());
        c2212n9.m11159k4(m11222wy() & 4294967295L);
        c2212n9.m11151fa();
        int iM11151fa = c2212n9.m11151fa();
        for (int i = 0; i < (iM11151fa & 65535); i++) {
            c2212n9.m11151fa();
            c2212n9.m11151fa();
            if (((c2212n9.m11151fa() & 65280) >> 8) == 0) {
                int iM11151fa2 = c2212n9.m11151fa();
                c2212n9.m11151fa();
                c2212n9.m11151fa();
                c2212n9.m11151fa();
                for (int i2 = 0; i2 < (iM11151fa2 & 65535); i2++) {
                    this.f7037k4.m11815k4(new C2334v6(c2212n9.m11151fa() & 65535), new C2334v6(c2212n9.m11151fa() & 65535), c2212n9.m11152h4());
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: k4 */
    public void mo10299k4(C2212n9 c2212n9) {
        super.mo10299k4(c2212n9);
    }
}
