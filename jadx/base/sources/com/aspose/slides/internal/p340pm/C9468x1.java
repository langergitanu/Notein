package com.aspose.slides.internal.p340pm;

import com.aspose.slides.internal.p040bg.OooO00o;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.pm.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C9468x1 {

    /* JADX INFO: renamed from: du */
    public float f34468du;

    /* JADX INFO: renamed from: dy */
    public double f34469dy;

    /* JADX INFO: renamed from: h4 */
    public float f34470h4;

    /* JADX INFO: renamed from: k4 */
    public float f34471k4;

    /* JADX INFO: renamed from: kk */
    public float f34472kk;

    /* JADX INFO: renamed from: m9 */
    public float f34473m9;

    /* JADX INFO: renamed from: to */
    public float f34474to;

    /* JADX INFO: renamed from: x1 */
    public float f34475x1;

    public C9468x1(float f, float f2, float f3) {
        this.f34471k4 = f;
        this.f34475x1 = f2;
        this.f34472kk = f3;
    }

    /* JADX INFO: renamed from: k4 */
    public float m46537k4(float f) {
        if (m46542k4()) {
            return 0.0f;
        }
        float f2 = -this.f34471k4;
        float f3 = this.f34475x1;
        return ((-this.f34472kk) / f3) + ((f2 / f3) * f);
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m46543x1() {
        return this.f34471k4 == 0.0f;
    }

    public C9468x1(C12025x6 c12025x6, C12025x6 c12025x62) {
        this.f34471k4 = c12025x6.m56895kk() - c12025x62.m56895kk();
        this.f34475x1 = c12025x62.m56897x1() - c12025x6.m56897x1();
        this.f34472kk = (c12025x62.m56895kk() * c12025x6.m56897x1()) - (c12025x6.m56895kk() * c12025x62.m56897x1());
        this.f34469dy = C9467to.m46521k4(c12025x6, c12025x62) / 1000.0d;
        this.f34474to = Math.min(c12025x6.m56897x1(), c12025x62.m56897x1());
        this.f34470h4 = Math.min(c12025x6.m56895kk(), c12025x62.m56895kk());
        this.f34468du = Math.max(c12025x6.m56897x1(), c12025x62.m56897x1());
        this.f34473m9 = Math.max(c12025x6.m56895kk(), c12025x62.m56895kk());
    }

    /* JADX INFO: renamed from: k4 */
    public float m46538k4(float f, float f2) {
        double dAbs = Math.abs((this.f34475x1 * f2) + (this.f34471k4 * f) + this.f34472kk);
        float f3 = this.f34471k4;
        float f4 = this.f34475x1;
        return (float) (dAbs / Math.sqrt((f4 * f4) + (f3 * f3)));
    }

    /* JADX INFO: renamed from: k4 */
    public float m46539k4(C12025x6 c12025x6) {
        double dAbs = Math.abs(OooO00o.OooO00o(c12025x6, this.f34475x1, c12025x6.m56897x1() * this.f34471k4) + this.f34472kk);
        float f = this.f34471k4;
        float f2 = this.f34475x1;
        return (float) (dAbs / Math.sqrt((f2 * f2) + (f * f)));
    }

    /* JADX INFO: renamed from: k4 */
    public static C9468x1 m46536k4(C9468x1 c9468x1, C12025x6 c12025x6) {
        float f = c9468x1.f34471k4;
        float f2 = c9468x1.f34475x1;
        return new C9468x1(f, f2, ((-c12025x6.m56895kk()) * f2) + ((-c12025x6.m56897x1()) * f));
    }

    /* JADX INFO: renamed from: k4 */
    public C12025x6 m46540k4(C9468x1 c9468x1) {
        return m46541k4(c9468x1, 0.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public C12025x6 m46541k4(C9468x1 c9468x1, float f) {
        float f2 = (this.f34471k4 * c9468x1.f34475x1) - (c9468x1.f34471k4 * this.f34475x1);
        if (Math.abs(f2) <= f) {
            return null;
        }
        float f3 = this.f34472kk;
        float f4 = c9468x1.f34475x1 * f3;
        float f5 = c9468x1.f34472kk;
        return new C12025x6((-(f4 - (this.f34475x1 * f5))) / f2, (-((this.f34471k4 * f5) - (c9468x1.f34471k4 * f3))) / f2);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m46542k4() {
        return this.f34475x1 == 0.0f;
    }
}
