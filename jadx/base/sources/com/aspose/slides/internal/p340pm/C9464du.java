package com.aspose.slides.internal.p340pm;

import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.pm.du */
/* JADX INFO: loaded from: classes4.dex */
public class C9464du {

    /* JADX INFO: renamed from: k4 */
    public float f34422k4;

    /* JADX INFO: renamed from: kk */
    public float f34423kk;

    /* JADX INFO: renamed from: to */
    public float f34424to;

    /* JADX INFO: renamed from: x1 */
    public float f34425x1;

    /* JADX INFO: renamed from: k4 */
    public static C9464du m46499k4(float f, float f2, float f3, float f4, float f5) {
        float f6 = (f3 * f3) + (f2 * f2);
        float f7 = (f3 * f5) + (f2 * f4);
        float f8 = (f5 * f5) + (f4 * f4);
        C9464du c9464du = new C9464du();
        c9464du.f34422k4 = f8;
        c9464du.f34425x1 = (-f7) - f7;
        c9464du.f34423kk = f6;
        c9464du.f34424to = f * f * ((f6 * f8) - (f7 * f7));
        return c9464du;
    }

    /* JADX INFO: renamed from: kk */
    private C12025x6[] m46501kk(C9468x1 c9468x1) {
        float f = (-c9468x1.f34472kk) / c9468x1.f34471k4;
        float f2 = this.f34423kk;
        float f3 = this.f34425x1 * f;
        float f4 = (f3 * f3) - ((4.0f * f2) * (((f * f) * this.f34422k4) - this.f34424to));
        if (f4 < 0.0f) {
            return null;
        }
        float fSqrt = (float) Math.sqrt(f4);
        float f5 = -f3;
        float f6 = f2 * 2.0f;
        return new C12025x6[]{new C12025x6(f, (f5 + fSqrt) / f6), new C12025x6(f, (f5 - fSqrt) / f6)};
    }

    /* JADX INFO: renamed from: x1 */
    private C12025x6[] m46502x1(C9468x1 c9468x1) {
        float f = (-c9468x1.f34472kk) / c9468x1.f34475x1;
        float f2 = this.f34422k4;
        float f3 = this.f34425x1 * f;
        float f4 = (f3 * f3) - ((4.0f * f2) * (((f * f) * this.f34423kk) - this.f34424to));
        if (f4 < 0.0f) {
            return null;
        }
        float fSqrt = (float) Math.sqrt(f4);
        float f5 = -f3;
        float f6 = f2 * 2.0f;
        return new C12025x6[]{new C12025x6((f5 + fSqrt) / f6, f), new C12025x6((f5 - fSqrt) / f6, f)};
    }

    /* JADX INFO: renamed from: k4 */
    public static C9464du m46500k4(float f, C11913yj c11913yj) {
        if (c11913yj == null) {
            c11913yj = new C11913yj();
        }
        return m46499k4(f, (float) c11913yj.m55761jd(), (float) c11913yj.m55759fa(), (float) c11913yj.m55756ck(), (float) c11913yj.m55784up());
    }

    /* JADX INFO: renamed from: k4 */
    public float[] m46503k4(float f, float f2) {
        if (f == 0.0f) {
            float f3 = this.f34425x1;
            float f4 = this.f34424to;
            float f5 = this.f34422k4 * 4.0f;
            float f6 = this.f34423kk;
            float fSqrt = f3 * ((float) Math.sqrt(f4 / (((f5 * f6) * f6) - ((f3 * f3) * f6))));
            float f7 = ((this.f34423kk * (-2.0f)) * fSqrt) / this.f34425x1;
            return new float[]{f7, fSqrt, -f7, -fSqrt};
        }
        float f8 = f2 / f;
        float f9 = this.f34423kk;
        float f10 = this.f34425x1;
        float f11 = (-(((f9 * 2.0f) * f8) + f10)) / ((f8 * f10) + (2.0f * this.f34422k4));
        float fSqrt2 = (float) Math.sqrt(this.f34424to / (((f10 * f11) + ((r8 * f11) * f11)) + f9));
        float f12 = f11 * fSqrt2;
        return new float[]{f12, fSqrt2, -f12, -fSqrt2};
    }

    /* JADX INFO: renamed from: k4 */
    public C12025x6[] m46504k4(C9468x1 c9468x1) {
        if (c9468x1.m46543x1()) {
            return m46502x1(c9468x1);
        }
        if (c9468x1.m46542k4()) {
            return m46501kk(c9468x1);
        }
        float f = this.f34422k4;
        float f2 = c9468x1.f34475x1;
        float f3 = this.f34425x1;
        float f4 = c9468x1.f34471k4;
        float f5 = (this.f34423kk * f4 * f4) + (((f * f2) * f2) - ((f3 * f4) * f2));
        float f6 = f * 2.0f * f2;
        float f7 = c9468x1.f34472kk;
        float f8 = (f6 * f7) - ((f3 * f4) * f7);
        float f9 = (f8 * f8) - ((4.0f * f5) * (((f * f7) * f7) - ((this.f34424to * f4) * f4)));
        if (f9 < 0.0f) {
            return null;
        }
        float fSqrt = (float) Math.sqrt(f9);
        float f10 = -f8;
        float f11 = f5 * 2.0f;
        float f12 = (f10 + fSqrt) / f11;
        float f13 = c9468x1.f34475x1;
        float f14 = c9468x1.f34472kk;
        float f15 = c9468x1.f34471k4;
        float f16 = (f10 - fSqrt) / f11;
        return new C12025x6[]{new C12025x6((((-f13) * f12) - f14) / f15, f12), new C12025x6((((-f13) * f16) - f14) / f15, f16)};
    }
}
