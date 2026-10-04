package com.aspose.slides.internal.p156gw;

import com.aspose.slides.internal.p031aw.InterfaceC1565x1;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12007ix;
import java.io.Serializable;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.c5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4392c5 implements InterfaceC1565x1, Cloneable {

    /* JADX INFO: renamed from: com.aspose.slides.internal.gw.c5$k4 */
    public static class k4 extends AbstractC4392c5 implements Serializable {

        /* JADX INFO: renamed from: du */
        public float f11984du;

        /* JADX INFO: renamed from: dy */
        public float f11985dy;

        /* JADX INFO: renamed from: h4 */
        public float f11986h4;

        /* JADX INFO: renamed from: k4 */
        public float f11987k4;

        /* JADX INFO: renamed from: kk */
        public float f11988kk;

        /* JADX INFO: renamed from: m9 */
        public float f11989m9;

        /* JADX INFO: renamed from: to */
        public float f11990to;

        /* JADX INFO: renamed from: x1 */
        public float f11991x1;

        public k4() {
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4392c5
        /* JADX INFO: renamed from: c5 */
        public double mo17850c5() {
            return this.f11985dy;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4392c5
        /* JADX INFO: renamed from: du */
        public double mo17851du() {
            return this.f11984du;
        }

        @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
        /* JADX INFO: renamed from: dy */
        public C12007ix mo8355dy() {
            float fMin = Math.min(Math.min(this.f11987k4, this.f11989m9), Math.min(this.f11988kk, this.f11984du));
            float fMin2 = Math.min(Math.min(this.f11991x1, this.f11985dy), Math.min(this.f11990to, this.f11986h4));
            return new C12007ix(fMin, fMin2, Math.max(Math.max(this.f11987k4, this.f11989m9), Math.max(this.f11988kk, this.f11984du)) - fMin, Math.max(Math.max(this.f11991x1, this.f11985dy), Math.max(this.f11990to, this.f11986h4)) - fMin2);
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4392c5
        /* JADX INFO: renamed from: h4 */
        public double mo17852h4() {
            return this.f11986h4;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4392c5
        /* JADX INFO: renamed from: k4 */
        public double mo17853k4() {
            return this.f11987k4;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4392c5
        /* JADX INFO: renamed from: kk */
        public double mo17854kk() {
            return this.f11988kk;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4392c5
        /* JADX INFO: renamed from: m9 */
        public double mo17855m9() {
            return this.f11989m9;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4392c5
        /* JADX INFO: renamed from: to */
        public double mo17856to() {
            return this.f11990to;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4392c5
        /* JADX INFO: renamed from: x1 */
        public double mo17857x1() {
            return this.f11991x1;
        }

        public k4(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            m17858k4(f, f2, f3, f4, f5, f6, f7, f8);
        }

        /* JADX INFO: renamed from: k4 */
        public void m17858k4(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            this.f11987k4 = f;
            this.f11991x1 = f2;
            this.f11988kk = f3;
            this.f11990to = f4;
            this.f11984du = f5;
            this.f11986h4 = f6;
            this.f11989m9 = f7;
            this.f11985dy = f8;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static double m17846k4(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return Math.max(AbstractC4409u4.m17985x1(d, d2, d7, d8, d3, d4), AbstractC4409u4.m17985x1(d, d2, d7, d8, d5, d6));
    }

    /* JADX INFO: renamed from: x1 */
    private int m17849x1(double d, double d2, double d3, double d4) {
        int iM17864k4 = 0;
        return (!(mo17853k4() == mo17855m9() && mo17857x1() == mo17850c5()) && (iM17864k4 = AbstractC4393ck.m17864k4(0, d, d2, d + d3, d2 + d4, mo17853k4(), mo17857x1(), mo17855m9(), mo17850c5())) == Integer.MIN_VALUE) ? iM17864k4 : AbstractC4393ck.m17865k4(iM17864k4, d, d2, d + d3, d2 + d4, mo17855m9(), mo17850c5(), mo17851du(), mo17852h4(), mo17854kk(), mo17856to(), mo17853k4(), mo17857x1(), 0);
    }

    /* JADX INFO: renamed from: c5 */
    public abstract double mo17850c5();

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: du */
    public abstract double mo17851du();

    /* JADX INFO: renamed from: h4 */
    public abstract double mo17852h4();

    /* JADX INFO: renamed from: k4 */
    public abstract double mo17853k4();

    /* JADX INFO: renamed from: kk */
    public abstract double mo17854kk();

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: kk */
    public InterfaceC4413v4 mo8359kk(C11913yj c11913yj) {
        return new C4399jd(this, c11913yj);
    }

    /* JADX INFO: renamed from: m9 */
    public abstract double mo17855m9();

    /* JADX INFO: renamed from: to */
    public abstract double mo17856to();

    /* JADX INFO: renamed from: x1 */
    public abstract double mo17857x1();

    /* JADX INFO: renamed from: k4 */
    public static double m17847k4(double[] dArr, int i) {
        return m17846k4(dArr[i], dArr[i + 1], dArr[i + 2], dArr[i + 3], dArr[i + 4], dArr[i + 5], dArr[i + 6], dArr[i + 7]);
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: k4 */
    public InterfaceC4413v4 mo8356k4(C11913yj c11913yj, double d) {
        return new C4407rv(mo8359kk(c11913yj), d);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m17848k4(double[] dArr, int i, double[] dArr2, int i2, double[] dArr3, int i3) {
        double d = dArr[i];
        double d2 = dArr[i + 1];
        double d3 = dArr[i + 2];
        double d4 = dArr[i + 3];
        double d5 = dArr[i + 4];
        double d6 = dArr[i + 5];
        double d7 = dArr[i + 6];
        double d8 = dArr[i + 7];
        if (dArr2 != null) {
            dArr2[i2] = d;
            dArr2[i2 + 1] = d2;
        }
        if (dArr3 != null) {
            dArr3[i3 + 6] = d7;
            dArr3[i3 + 7] = d8;
        }
        double d9 = (d + d3) / 2.0d;
        double d10 = (d2 + d4) / 2.0d;
        double d11 = (d7 + d5) / 2.0d;
        double d12 = (d8 + d6) / 2.0d;
        double d13 = (d3 + d5) / 2.0d;
        double d14 = (d4 + d6) / 2.0d;
        double d15 = (d9 + d13) / 2.0d;
        double d16 = (d10 + d14) / 2.0d;
        double d17 = (d13 + d11) / 2.0d;
        double d18 = (d14 + d12) / 2.0d;
        double d19 = (d15 + d17) / 2.0d;
        double d20 = (d16 + d18) / 2.0d;
        if (dArr2 != null) {
            dArr2[i2 + 2] = d9;
            dArr2[i2 + 3] = d10;
            dArr2[i2 + 4] = d15;
            dArr2[i2 + 5] = d16;
            dArr2[i2 + 6] = d19;
            dArr2[i2 + 7] = d20;
        }
        if (dArr3 != null) {
            dArr3[i3] = d19;
            dArr3[i3 + 1] = d20;
            dArr3[i3 + 2] = d17;
            dArr3[i3 + 3] = d18;
            dArr3[i3 + 4] = d11;
            dArr3[i3 + 5] = d12;
        }
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: k4 */
    public boolean mo8357k4(double d, double d2) {
        if ((d2 * 0.0d) + (d * 0.0d) != 0.0d) {
            return false;
        }
        double dMo17853k4 = mo17853k4();
        double dMo17857x1 = mo17857x1();
        double dMo17855m9 = mo17855m9();
        double dMo17850c5 = mo17850c5();
        return ((AbstractC4393ck.m17861k4(d, d2, dMo17853k4, dMo17857x1, dMo17855m9, dMo17850c5) + AbstractC4393ck.m17862k4(d, d2, dMo17853k4, dMo17857x1, mo17854kk(), mo17856to(), mo17851du(), mo17852h4(), dMo17855m9, dMo17850c5, 0)) & 1) == 1;
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: k4 */
    public boolean mo8358k4(double d, double d2, double d3, double d4) {
        return d3 > 0.0d && d4 > 0.0d && m17849x1(d, d2, d3, d4) != 0;
    }
}
