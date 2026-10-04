package com.aspose.slides.internal.p044bq;

import OooOoO.C20504OooO0O0;
import OooooOo.C21392OooOo00;

/* JADX INFO: renamed from: com.aspose.slides.internal.bq.k4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1836k4 {

    /* JADX INFO: renamed from: up */
    static final /* synthetic */ boolean f6644up = true;

    /* JADX INFO: renamed from: c5 */
    float f6645c5;

    /* JADX INFO: renamed from: ck */
    float f6646ck;

    /* JADX INFO: renamed from: du */
    float f6647du;

    /* JADX INFO: renamed from: dy */
    float f6648dy;

    /* JADX INFO: renamed from: fa */
    float f6649fa;

    /* JADX INFO: renamed from: h4 */
    float f6650h4;

    /* JADX INFO: renamed from: jd */
    float f6651jd;

    /* JADX INFO: renamed from: k4 */
    float f6652k4;

    /* JADX INFO: renamed from: kk */
    float f6653kk;

    /* JADX INFO: renamed from: m9 */
    float f6654m9;

    /* JADX INFO: renamed from: to */
    float f6655to;

    /* JADX INFO: renamed from: x1 */
    float f6656x1;

    /* JADX INFO: renamed from: yj */
    private final k4 f6657yj = new k4();

    /* JADX INFO: renamed from: com.aspose.slides.internal.bq.k4$k4 */
    public static final class k4 {

        /* JADX INFO: renamed from: du */
        private int f6658du;

        /* JADX INFO: renamed from: h4 */
        private float[] f6659h4;

        /* JADX INFO: renamed from: k4 */
        private int f6660k4;

        /* JADX INFO: renamed from: kk */
        private float f6661kk;

        /* JADX INFO: renamed from: m9 */
        private int f6662m9;

        /* JADX INFO: renamed from: to */
        private float[] f6663to;

        /* JADX INFO: renamed from: x1 */
        private int f6664x1;

        /* JADX INFO: renamed from: k4 */
        public void m9572k4(float[] fArr, int i, float[] fArr2, int i2) {
            this.f6663to = fArr;
            this.f6658du = i;
            this.f6659h4 = fArr2;
            this.f6662m9 = i2;
            this.f6660k4 = 0;
            this.f6664x1 = 0;
            this.f6661kk = 0.0f;
        }

        /* JADX INFO: renamed from: x1 */
        public int m9574x1() {
            int i;
            int i2 = this.f6660k4;
            if (i2 < this.f6662m9) {
                float f = this.f6659h4[i2];
                float f2 = this.f6661kk;
                float[] fArr = this.f6663to;
                int i3 = this.f6664x1;
                int i4 = this.f6658du;
                C1839x1.m9615k4((f - f2) / (1.0f - f2), fArr, i3, fArr, 0, fArr, i4, i4);
                this.f6661kk = f;
                this.f6664x1 = this.f6658du;
                i = 0;
            } else {
                i = this.f6664x1;
            }
            this.f6660k4++;
            return i;
        }

        /* JADX INFO: renamed from: k4 */
        public boolean m9573k4() {
            return this.f6660k4 <= this.f6662m9;
        }
    }

    /* JADX INFO: renamed from: du */
    private int m9559du(float[] fArr, int i) {
        if (!f6644up && fArr.length < i + 4) {
            throw new AssertionError();
        }
        float f = this.f6645c5;
        float f2 = this.f6651jd;
        float fOooO0O0 = C20504OooO0O0.OooO0O0(f2, f2, f * f, 2.0f);
        float f3 = this.f6646ck;
        float f4 = this.f6649fa;
        float fOooO0O02 = C20504OooO0O0.OooO0O0(f2, f4, f * f3, 3.0f);
        float f5 = this.f6647du;
        float f6 = this.f6650h4;
        return C1839x1.m9610k4(fOooO0O0, fOooO0O02, (f4 * f4) + (f3 * f3) + C20504OooO0O0.OooO0O0(f2, f6, f * f5, 2.0f), (f4 * f6) + (f3 * f5), fArr, i, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: k4 */
    private static float m9560k4(float f) {
        if (f == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (f == Float.NEGATIVE_INFINITY) {
            return Float.MIN_VALUE;
        }
        return f;
    }

    /* JADX INFO: renamed from: x1 */
    private float m9563x1(float f) {
        float f2 = this.f6645c5;
        float f3 = this.f6646ck;
        float f4 = (((f * f2) + f3) * f) + this.f6647du;
        float f5 = this.f6651jd;
        float f6 = this.f6649fa;
        float f7 = (((f * f5) + f6) * f) + this.f6650h4;
        float f8 = (f2 * 2.0f * f) + f3;
        float f9 = (f5 * 2.0f * f) + f6;
        float f10 = (f7 * f7) + (f4 * f4);
        float f11 = (f9 * f9) + (f8 * f8);
        float f12 = (f9 * f7) + (f8 * f4);
        return ((f10 * f10) / ((f11 * f10) - (f12 * f12))) * f10;
    }

    /* JADX INFO: renamed from: kk */
    public int m9569kk(float[] fArr, int i) {
        return C1839x1.m9611k4(this.f6651jd, this.f6649fa, this.f6650h4, fArr, i);
    }

    /* JADX INFO: renamed from: to */
    public int m9570to(float[] fArr, int i) {
        float f = this.f6645c5;
        float f2 = this.f6649fa;
        float f3 = this.f6646ck;
        float f4 = this.f6651jd;
        float f5 = (f * f2) - (f3 * f4);
        float f6 = this.f6650h4;
        float f7 = this.f6647du;
        return C1839x1.m9611k4(f5, C21392OooOo00.OooO00o(f4, f7, f * f6, 2.0f), (f6 * f3) - (f7 * f2), fArr, i);
    }

    /* JADX INFO: renamed from: k4 */
    private float m9561k4(float f, float f2, float f3, float f4) {
        float fM9560k4 = m9560k4(m9563x1(f2) - f3);
        int i = 0;
        float fM9560k42 = m9560k4(m9563x1(f) - f3);
        float f5 = fM9560k4;
        float f6 = f2;
        float f7 = f;
        for (int i2 = 0; i2 < 100 && Math.abs(f6 - f) > Math.abs(f6 + f) * f4; i2++) {
            f7 = ((fM9560k42 * f6) - (f5 * f)) / (fM9560k42 - f5);
            float fM9563x1 = m9563x1(f7) - f3;
            if (!m9562k4(fM9563x1, f5)) {
                if (fM9560k42 * fM9563x1 <= 0.0f) {
                    break;
                }
                if (i > 0) {
                    f5 /= 1 << i;
                    i++;
                    f = f7;
                    fM9560k42 = fM9563x1;
                } else {
                    f = f7;
                    fM9560k42 = fM9563x1;
                    i = 1;
                }
            } else if (i < 0) {
                fM9560k42 /= 1 << (-i);
                i--;
                f6 = f7;
                f5 = fM9563x1;
            } else {
                i = -1;
                f5 = fM9563x1;
                f6 = f7;
            }
        }
        return f7;
    }

    /* JADX INFO: renamed from: x1 */
    public int m9571x1(float[] fArr, int i) {
        return C1839x1.m9611k4(this.f6645c5, this.f6646ck, this.f6647du, fArr, i);
    }

    /* JADX INFO: renamed from: k4 */
    public int m9564k4(float[] fArr, int i, float f, float f2) {
        int i2;
        if (!f6644up && (i > 6 || fArr.length < 10)) {
            throw new AssertionError();
        }
        int iM9559du = m9559du(fArr, i);
        float f3 = f * f;
        float fM9563x1 = m9563x1(0.0f) - f3;
        fArr[i + iM9559du] = 1.0f;
        int i3 = iM9559du + 1;
        int i4 = i;
        int i5 = i4;
        float f4 = 0.0f;
        while (i4 < i + i3) {
            float f5 = fArr[i4];
            float fM9563x12 = m9563x1(f5) - f3;
            if (fM9563x1 == 0.0f) {
                i2 = i5 + 1;
                fArr[i5] = f4;
            } else if (fM9563x1 * fM9563x12 < 0.0f) {
                i2 = i5 + 1;
                fArr[i5] = m9561k4(f4, f5, f3, f2);
            } else {
                i4++;
                f4 = f5;
                fM9563x1 = fM9563x12;
            }
            i5 = i2;
            i4++;
            f4 = f5;
            fM9563x1 = fM9563x12;
        }
        return i5 - i;
    }

    /* JADX INFO: renamed from: k4 */
    public k4 m9565k4(float[] fArr, int i, float[] fArr2, int i2) {
        if (!f6644up && (fArr.length < i * 2 || i2 > fArr2.length)) {
            throw new AssertionError();
        }
        this.f6657yj.m9572k4(fArr, i, fArr2, i2);
        return this.f6657yj;
    }

    /* JADX INFO: renamed from: k4 */
    public void m9566k4(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f6652k4 = 0.0f;
        this.f6656x1 = 0.0f;
        float f7 = (f - (f3 * 2.0f)) + f5;
        this.f6653kk = f7;
        float f8 = (f2 - (f4 * 2.0f)) + f6;
        this.f6655to = f8;
        this.f6647du = (f3 - f) * 2.0f;
        this.f6650h4 = (f4 - f2) * 2.0f;
        this.f6654m9 = f;
        this.f6648dy = f2;
        this.f6645c5 = 0.0f;
        this.f6651jd = 0.0f;
        this.f6646ck = f7 * 2.0f;
        this.f6649fa = f8 * 2.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public void m9567k4(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = (((f3 - f5) * 3.0f) + f7) - f;
        this.f6652k4 = f9;
        float f10 = (((f4 - f6) * 3.0f) + f8) - f2;
        this.f6656x1 = f10;
        float f11 = ((f - (f3 * 2.0f)) + f5) * 3.0f;
        this.f6653kk = f11;
        float f12 = ((f2 - (f4 * 2.0f)) + f6) * 3.0f;
        this.f6655to = f12;
        this.f6647du = (f3 - f) * 3.0f;
        this.f6650h4 = (f4 - f2) * 3.0f;
        this.f6654m9 = f;
        this.f6648dy = f2;
        this.f6645c5 = f9 * 3.0f;
        this.f6651jd = f10 * 3.0f;
        this.f6646ck = f11 * 2.0f;
        this.f6649fa = f12 * 2.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public void m9568k4(float[] fArr, int i) {
        if (i == 6) {
            m9566k4(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
        } else {
            if (i != 8) {
                throw new InternalError("Curves can only be cubic or quadratic");
            }
            m9567k4(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7]);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m9562k4(float f, float f2) {
        if (f >= 0.0f || f2 >= 0.0f) {
            return f > 0.0f && f2 > 0.0f;
        }
        return true;
    }
}
