package com.aspose.slides.internal.p156gw;

import com.aspose.slides.internal.p031aw.InterfaceC1565x1;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.u4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4409u4 implements InterfaceC1565x1 {

    /* JADX INFO: renamed from: com.aspose.slides.internal.gw.u4$k4 */
    public static class k4 extends AbstractC4409u4 {

        /* JADX INFO: renamed from: k4 */
        public float f12076k4;

        /* JADX INFO: renamed from: kk */
        public float f12077kk;

        /* JADX INFO: renamed from: to */
        public float f12078to;

        /* JADX INFO: renamed from: x1 */
        public float f12079x1;

        public k4() {
        }

        @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
        /* JADX INFO: renamed from: dy */
        public C12007ix mo8355dy() {
            float f;
            float f2;
            float f3 = this.f12076k4;
            float f4 = this.f12077kk;
            if (f3 < f4) {
                f = f4 - f3;
            } else {
                f = f3 - f4;
                f3 = f4;
            }
            float f5 = this.f12079x1;
            float f6 = this.f12078to;
            if (f5 < f6) {
                f2 = f6 - f5;
            } else {
                f2 = f5 - f6;
                f5 = f6;
            }
            return new C12007ix(f3, f5, f, f2);
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4409u4
        /* JADX INFO: renamed from: k4 */
        public double mo17986k4() {
            return this.f12076k4;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4409u4
        /* JADX INFO: renamed from: kk */
        public double mo17988kk() {
            return this.f12077kk;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4409u4
        /* JADX INFO: renamed from: to */
        public double mo17989to() {
            return this.f12078to;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4409u4
        /* JADX INFO: renamed from: x1 */
        public double mo17990x1() {
            return this.f12079x1;
        }

        public k4(float f, float f2, float f3, float f4) {
            m17991k4(f, f2, f3, f4);
        }

        /* JADX INFO: renamed from: k4 */
        public void m17991k4(float f, float f2, float f3, float f4) {
            this.f12076k4 = f;
            this.f12079x1 = f2;
            this.f12077kk = f3;
            this.f12078to = f4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static int m17984k4(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d3 - d;
        double d8 = d4 - d2;
        double d9 = d5 - d;
        double d10 = d6 - d2;
        double d11 = (d9 * d8) - (d10 * d7);
        if (d11 == 0.0d) {
            d11 = (d9 * d7) + (d10 * d8);
            if (d11 > 0.0d) {
                d11 = ((d10 - d8) * d8) + ((d9 - d7) * d7);
                if (d11 < 0.0d) {
                    d11 = 0.0d;
                }
            }
        }
        if (d11 < 0.0d) {
            return -1;
        }
        return d11 > 0.0d ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000f A[PHI: r10 r12
      0x000f: PHI (r10v5 double) = (r10v1 double), (r10v2 double) binds: [B:3:0x000d, B:6:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x000f: PHI (r12v7 double) = (r12v1 double), (r12v2 double) binds: [B:3:0x000d, B:6:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static double m17985x1(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7;
        double d8 = d3 - d;
        double d9 = d4 - d2;
        double d10 = d5 - d;
        double d11 = d6 - d2;
        if ((d11 * d9) + (d10 * d8) <= 0.0d) {
            d7 = 0.0d;
        } else {
            d10 = d8 - d10;
            d11 = d9 - d11;
            double d12 = (d11 * d9) + (d10 * d8);
            if (d12 > 0.0d) {
                d7 = (d12 * d12) / ((d9 * d9) + (d8 * d8));
            }
        }
        double d13 = ((d11 * d11) + (d10 * d10)) - d7;
        if (d13 < 0.0d) {
            return 0.0d;
        }
        return d13;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract double mo17986k4();

    /* JADX INFO: renamed from: kk */
    public abstract double mo17988kk();

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: kk */
    public InterfaceC4413v4 mo8359kk(C11913yj c11913yj) {
        return new C4412uz(this, c11913yj);
    }

    /* JADX INFO: renamed from: to */
    public abstract double mo17989to();

    /* JADX INFO: renamed from: x1 */
    public abstract double mo17990x1();

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: k4 */
    public InterfaceC4413v4 mo8356k4(C11913yj c11913yj, double d) {
        return new C4412uz(this, c11913yj);
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: k4 */
    public boolean mo8357k4(double d, double d2) {
        return false;
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: k4 */
    public boolean mo8358k4(double d, double d2, double d3, double d4) {
        return m17987k4(new C12007ix((float) d, (float) d2, (float) d3, (float) d4));
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m17987k4(C12007ix c12007ix) {
        return C4405ne.m17968k4(c12007ix, mo17986k4(), mo17990x1(), mo17988kk(), mo17989to());
    }
}
