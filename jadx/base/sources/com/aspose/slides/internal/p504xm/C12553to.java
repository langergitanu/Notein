package com.aspose.slides.internal.p504xm;

import com.aspose.slides.internal.p505xn.C12566m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.xm.to */
/* JADX INFO: loaded from: classes5.dex */
public class C12553to {

    /* JADX INFO: renamed from: du */
    private double f42048du;

    /* JADX INFO: renamed from: h4 */
    private double f42049h4;

    /* JADX INFO: renamed from: k4 */
    private final int f42050k4;

    /* JADX INFO: renamed from: kk */
    private final int f42051kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f42052m9;

    /* JADX INFO: renamed from: to */
    private final int f42053to;

    /* JADX INFO: renamed from: x1 */
    private final int f42054x1;

    private C12553to(int i, int i2, int i3, int i4, double d, double d2) {
        this.f42050k4 = i;
        this.f42054x1 = i2;
        this.f42051kk = i3;
        this.f42053to = i4;
        this.f42048du = d;
        this.f42049h4 = d2;
        if (d == 0.0d || d2 == 0.0d) {
            this.f42052m9 = true;
            this.f42048du = 96.0d;
            this.f42049h4 = 96.0d;
        }
    }

    /* JADX INFO: renamed from: du */
    public final double m58542du() {
        return C12566m9.m58654x1(this.f42051kk, this.f42048du);
    }

    /* JADX INFO: renamed from: h4 */
    public final double m58543h4() {
        return C12566m9.m58654x1(this.f42053to, this.f42049h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m58544k4() {
        return this.f42051kk;
    }

    /* JADX INFO: renamed from: kk */
    public final double m58545kk() {
        return this.f42049h4;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m58546to() {
        return this.f42052m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m58547x1() {
        return this.f42053to;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12553to m58540k4(int i, int i2, double d, double d2) {
        return new C12553to(0, 0, i, i2, d, d2);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12553to m58541k4(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i3 - i;
        int i8 = i4 - i2;
        return new C12553to(i, i2, i7, i8, i5 != 0 ? ((double) i7) / C12566m9.m58646k4(i5) : 0.0d, i6 != 0 ? ((double) i8) / C12566m9.m58646k4(i6) : 0.0d);
    }
}
