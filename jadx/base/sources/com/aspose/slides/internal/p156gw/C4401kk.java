package com.aspose.slides.internal.p156gw;

import com.aspose.slides.internal.p156gw.InterfaceC4413v4;
import com.aspose.slides.internal.p472w8.C11913yj;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.kk */
/* JADX INFO: loaded from: classes.dex */
class C4401kk implements InterfaceC4413v4 {

    /* JADX INFO: renamed from: c5 */
    int f12031c5;

    /* JADX INFO: renamed from: ck */
    int f12032ck;

    /* JADX INFO: renamed from: du */
    double f12033du;

    /* JADX INFO: renamed from: dy */
    C11913yj f12034dy;

    /* JADX INFO: renamed from: h4 */
    double f12035h4;

    /* JADX INFO: renamed from: jd */
    int f12036jd;

    /* JADX INFO: renamed from: k4 */
    double f12037k4;

    /* JADX INFO: renamed from: kk */
    double f12038kk;

    /* JADX INFO: renamed from: m9 */
    double f12039m9;

    /* JADX INFO: renamed from: to */
    double f12040to;

    /* JADX INFO: renamed from: x1 */
    double f12041x1;

    /* JADX WARN: Removed duplicated region for block: B:20:0x009b A[PHI: r11
      0x009b: PHI (r11v5 int) = (r11v4 int), (r11v6 int) binds: [B:16:0x0095, B:18:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4401kk(AbstractC4416x1 abstractC4416x1, C11913yj c11913yj) {
        this.f12038kk = abstractC4416x1.mo17781c5() / 2.0d;
        this.f12040to = abstractC4416x1.mo17785jd() / 2.0d;
        this.f12037k4 = abstractC4416x1.mo17784h4() + this.f12038kk;
        this.f12041x1 = abstractC4416x1.mo17787m9() + this.f12040to;
        this.f12033du = -Math.toRadians(abstractC4416x1.mo18017k4());
        this.f12034dy = c11913yj;
        double d = -abstractC4416x1.mo18021x1();
        if (d >= 360.0d || d <= -360.0d) {
            this.f12036jd = 4;
            this.f12035h4 = 1.5707963267948966d;
            this.f12039m9 = 0.5522847498307933d;
            if (d < 0.0d) {
                this.f12035h4 = -1.5707963267948966d;
                this.f12039m9 = -0.5522847498307933d;
            }
        } else {
            int iCeil = (int) Math.ceil(Math.abs(d) / 90.0d);
            this.f12036jd = iCeil;
            double radians = Math.toRadians(d / ((double) iCeil));
            this.f12035h4 = radians;
            double dM17948k4 = m17948k4(radians);
            this.f12039m9 = dM17948k4;
            if (dM17948k4 == 0.0d) {
                this.f12036jd = 0;
            }
        }
        int iM18019kk = abstractC4416x1.m18019kk();
        if (iM18019kk != 0) {
            int i = 1;
            if (iM18019kk != 1) {
                i = 2;
                if (iM18019kk == 2) {
                    this.f12032ck = i;
                }
            }
        } else {
            this.f12032ck = 0;
        }
        if (this.f12038kk < 0.0d || this.f12040to < 0.0d) {
            this.f12032ck = -1;
            this.f12036jd = -1;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static double m17948k4(double d) {
        double d2 = d / 2.0d;
        return (Math.sin(d2) * 1.3333333333333333d) / (Math.cos(d2) + 1.0d);
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: kk */
    public void mo17820kk() {
        this.f12031c5++;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: x1 */
    public boolean mo17821x1() {
        return this.f12031c5 > this.f12036jd + this.f12032ck;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public int mo17817k4(double[] dArr) {
        if (mo17821x1()) {
            throw new NoSuchElementException("arc iterator out of bounds");
        }
        double d = this.f12033du;
        int i = this.f12031c5;
        if (i == 0) {
            dArr[0] = (Math.cos(d) * this.f12038kk) + this.f12037k4;
            dArr[1] = (Math.sin(d) * this.f12040to) + this.f12041x1;
            C11913yj c11913yj = this.f12034dy;
            if (c11913yj != null) {
                c11913yj.m55770k4(dArr, 0, dArr, 0, 1);
            }
            return 0;
        }
        int i2 = this.f12036jd;
        if (i > i2) {
            if (i == i2 + this.f12032ck) {
                return 4;
            }
            dArr[0] = this.f12037k4;
            dArr[1] = this.f12041x1;
            C11913yj c11913yj2 = this.f12034dy;
            if (c11913yj2 != null) {
                c11913yj2.m55770k4(dArr, 0, dArr, 0, 1);
            }
            return 1;
        }
        double d2 = (this.f12035h4 * ((double) (i - 1))) + d;
        double dCos = Math.cos(d2);
        double dSin = Math.sin(d2);
        double d3 = this.f12037k4;
        double d4 = this.f12039m9;
        dArr[0] = ((dCos - (d4 * dSin)) * this.f12038kk) + d3;
        dArr[1] = (((d4 * dCos) + dSin) * this.f12040to) + this.f12041x1;
        double d5 = d2 + this.f12035h4;
        double dCos2 = Math.cos(d5);
        double dSin2 = Math.sin(d5);
        double d6 = this.f12037k4;
        double d7 = this.f12039m9;
        double d8 = this.f12038kk;
        dArr[2] = (((d7 * dSin2) + dCos2) * d8) + d6;
        double d9 = this.f12041x1;
        double d10 = this.f12040to;
        dArr[3] = ((dSin2 - (d7 * dCos2)) * d10) + d9;
        dArr[4] = (dCos2 * d8) + d6;
        dArr[5] = (dSin2 * d10) + d9;
        C11913yj c11913yj3 = this.f12034dy;
        if (c11913yj3 != null) {
            c11913yj3.m55770k4(dArr, 0, dArr, 0, 3);
        }
        return 3;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public int mo17818k4(float[] fArr) {
        if (mo17821x1()) {
            throw new NoSuchElementException("arc iterator out of bounds");
        }
        double d = this.f12033du;
        int i = this.f12031c5;
        if (i == 0) {
            fArr[0] = (float) ((Math.cos(d) * this.f12038kk) + this.f12037k4);
            fArr[1] = (float) ((Math.sin(d) * this.f12040to) + this.f12041x1);
            C11913yj c11913yj = this.f12034dy;
            if (c11913yj != null) {
                c11913yj.m55773k4(fArr, 0, fArr, 0, 1);
            }
            return 0;
        }
        int i2 = this.f12036jd;
        if (i > i2) {
            if (i == i2 + this.f12032ck) {
                return 4;
            }
            fArr[0] = (float) this.f12037k4;
            fArr[1] = (float) this.f12041x1;
            C11913yj c11913yj2 = this.f12034dy;
            if (c11913yj2 != null) {
                c11913yj2.m55773k4(fArr, 0, fArr, 0, 1);
            }
            return 1;
        }
        double d2 = (this.f12035h4 * ((double) (i - 1))) + d;
        double dCos = Math.cos(d2);
        double dSin = Math.sin(d2);
        double d3 = this.f12037k4;
        double d4 = this.f12039m9;
        fArr[0] = (float) (((dCos - (d4 * dSin)) * this.f12038kk) + d3);
        fArr[1] = (float) ((((d4 * dCos) + dSin) * this.f12040to) + this.f12041x1);
        double d5 = d2 + this.f12035h4;
        double dCos2 = Math.cos(d5);
        double dSin2 = Math.sin(d5);
        double d6 = this.f12037k4;
        double d7 = this.f12039m9;
        double d8 = this.f12038kk;
        fArr[2] = (float) ((((d7 * dSin2) + dCos2) * d8) + d6);
        double d9 = this.f12041x1;
        double d10 = this.f12040to;
        fArr[3] = (float) (((dSin2 - (d7 * dCos2)) * d10) + d9);
        fArr[4] = (float) ((dCos2 * d8) + d6);
        fArr[5] = (float) ((dSin2 * d10) + d9);
        C11913yj c11913yj3 = this.f12034dy;
        if (c11913yj3 != null) {
            c11913yj3.m55773k4(fArr, 0, fArr, 0, 3);
        }
        return 3;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public InterfaceC4413v4.k4 mo17819k4() {
        return InterfaceC4413v4.k4.WIND_NON_ZERO;
    }
}
