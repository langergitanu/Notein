package com.aspose.slides.internal.p340pm;

import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.pm.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C9466kk {

    /* JADX INFO: renamed from: k4 */
    private C12025x6 f34460k4;

    /* JADX INFO: renamed from: x1 */
    private C12025x6 f34461x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.pm.kk$k4 */
    public enum k4 {
        LEFT,
        RIGHT,
        BEHIND,
        BEYOND,
        BETWEEN
    }

    public C9466kk(float f, float f2, float f3, float f4) {
        this.f34460k4 = new C12025x6(f, f2);
        this.f34461x1 = new C12025x6(f3, f4);
    }

    /* JADX INFO: renamed from: k4 */
    public k4 m46517k4(C12025x6 c12025x6, float f) {
        return m46516k4(this.f34460k4, this.f34461x1, c12025x6, f);
    }

    /* JADX INFO: renamed from: x1 */
    public C12025x6 m46519x1() {
        return this.f34461x1;
    }

    public C9466kk(C12025x6 c12025x6, C12025x6 c12025x62) {
        this.f34460k4 = c12025x6;
        this.f34461x1 = c12025x62;
    }

    /* JADX INFO: renamed from: k4 */
    public static k4 m46515k4(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63) {
        return m46516k4(c12025x6, c12025x62, c12025x63, 0.0d);
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m46520x1(C12025x6 c12025x6, float f) {
        return m46517k4(c12025x6, f) == k4.BETWEEN;
    }

    /* JADX INFO: renamed from: k4 */
    public static k4 m46516k4(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, double d) {
        float fM56897x1 = c12025x62.m56897x1() - c12025x6.m56897x1();
        float fM56895kk = c12025x62.m56895kk() - c12025x6.m56895kk();
        float fM56897x12 = c12025x63.m56897x1() - c12025x6.m56897x1();
        float fM56895kk2 = c12025x63.m56895kk() - c12025x6.m56895kk();
        double d2 = (fM56897x1 * fM56895kk2) - (fM56897x12 * fM56895kk);
        return Math.abs(d2) <= d ? (((double) (fM56897x1 * fM56897x12)) < 0.0d || ((double) (fM56895kk * fM56895kk2)) < 0.0d) ? k4.BEHIND : C9467to.m46522k4(fM56897x1, fM56895kk) < C9467to.m46522k4(fM56897x12, fM56895kk2) ? k4.BEYOND : k4.BETWEEN : d2 > 0.0d ? k4.LEFT : k4.RIGHT;
    }

    /* JADX INFO: renamed from: k4 */
    public C12025x6 m46518k4() {
        return this.f34460k4;
    }
}
