package com.aspose.slides.internal.p544zb;

/* JADX INFO: renamed from: com.aspose.slides.internal.zb.x1 */
/* JADX INFO: loaded from: classes5.dex */
public class C13521x1 extends C13510k4 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC13511kk f45118k4;

    /* JADX INFO: renamed from: x1 */
    private float f45119x1;

    private C13521x1(AbstractC13511kk abstractC13511kk, float f) {
        super(0, f);
        this.f45118k4 = abstractC13511kk;
        this.f45119x1 = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005 A[PHI: r0
      0x0005: PHI (r0v5 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C13510k4 m62697k4(AbstractC13511kk abstractC13511kk, float f) {
        float f2 = 0.0f;
        if (f < 0.0f) {
            f = f2;
        } else {
            f2 = 255.0f;
            if (f > 255.0f) {
            }
        }
        return abstractC13511kk == AbstractC13511kk.f45107k4 ? new C13510k4(0, f) : new C13521x1(abstractC13511kk, f);
    }
}
