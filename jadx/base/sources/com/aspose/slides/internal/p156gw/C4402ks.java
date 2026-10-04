package com.aspose.slides.internal.p156gw;

import com.aspose.slides.internal.p156gw.InterfaceC4413v4;
import com.aspose.slides.internal.p472w8.C11913yj;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.ks */
/* JADX INFO: loaded from: classes.dex */
class C4402ks implements InterfaceC4413v4 {

    /* JADX INFO: renamed from: m9 */
    private static double[][] f12042m9 = {new double[]{1.0d, 0.7761423749153966d, 0.7761423749153966d, 1.0d, 0.5d, 1.0d}, new double[]{0.22385762508460333d, 1.0d, 0.0d, 0.7761423749153966d, 0.0d, 0.5d}, new double[]{0.0d, 0.22385762508460333d, 0.22385762508460333d, 0.0d, 0.5d, 0.0d}, new double[]{0.7761423749153966d, 0.0d, 1.0d, 0.22385762508460333d, 1.0d, 0.5d}};

    /* JADX INFO: renamed from: du */
    C11913yj f12043du;

    /* JADX INFO: renamed from: h4 */
    int f12044h4;

    /* JADX INFO: renamed from: k4 */
    double f12045k4;

    /* JADX INFO: renamed from: kk */
    double f12046kk;

    /* JADX INFO: renamed from: to */
    double f12047to;

    /* JADX INFO: renamed from: x1 */
    double f12048x1;

    public C4402ks(AbstractC4419yj abstractC4419yj, C11913yj c11913yj) {
        this.f12045k4 = abstractC4419yj.mo17784h4();
        this.f12048x1 = abstractC4419yj.mo17787m9();
        this.f12046kk = abstractC4419yj.mo17781c5();
        double dMo17785jd = abstractC4419yj.mo17785jd();
        this.f12047to = dMo17785jd;
        this.f12043du = c11913yj;
        if (this.f12046kk < 0.0d || dMo17785jd < 0.0d) {
            this.f12044h4 = 6;
        }
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public int mo17817k4(double[] dArr) {
        if (mo17821x1()) {
            throw new NoSuchElementException("ellipse iterator out of bounds");
        }
        int i = this.f12044h4;
        if (i == 5) {
            return 4;
        }
        if (i == 0) {
            double[] dArr2 = f12042m9[3];
            dArr[0] = (dArr2[4] * this.f12046kk) + this.f12045k4;
            dArr[1] = (dArr2[5] * this.f12047to) + this.f12048x1;
            C11913yj c11913yj = this.f12043du;
            if (c11913yj != null) {
                c11913yj.m55770k4(dArr, 0, dArr, 0, 1);
            }
            return 0;
        }
        double[] dArr3 = f12042m9[i - 1];
        double d = this.f12045k4;
        double d2 = dArr3[0];
        double d3 = this.f12046kk;
        dArr[0] = (d2 * d3) + d;
        double d4 = this.f12048x1;
        double d5 = dArr3[1];
        double d6 = this.f12047to;
        dArr[1] = (d5 * d6) + d4;
        dArr[2] = (dArr3[2] * d3) + d;
        dArr[3] = (dArr3[3] * d6) + d4;
        dArr[4] = (dArr3[4] * d3) + d;
        dArr[5] = (dArr3[5] * d6) + d4;
        C11913yj c11913yj2 = this.f12043du;
        if (c11913yj2 != null) {
            c11913yj2.m55770k4(dArr, 0, dArr, 0, 3);
        }
        return 3;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: kk */
    public void mo17820kk() {
        this.f12044h4++;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: x1 */
    public boolean mo17821x1() {
        return this.f12044h4 > 5;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public int mo17818k4(float[] fArr) {
        if (mo17821x1()) {
            throw new NoSuchElementException("ellipse iterator out of bounds");
        }
        int i = this.f12044h4;
        if (i == 5) {
            return 4;
        }
        if (i == 0) {
            double[] dArr = f12042m9[3];
            fArr[0] = (float) ((dArr[4] * this.f12046kk) + this.f12045k4);
            fArr[1] = (float) ((dArr[5] * this.f12047to) + this.f12048x1);
            C11913yj c11913yj = this.f12043du;
            if (c11913yj != null) {
                c11913yj.m55773k4(fArr, 0, fArr, 0, 1);
            }
            return 0;
        }
        double[] dArr2 = f12042m9[i - 1];
        double d = this.f12045k4;
        double d2 = dArr2[0];
        double d3 = this.f12046kk;
        fArr[0] = (float) ((d2 * d3) + d);
        double d4 = this.f12048x1;
        double d5 = dArr2[1];
        double d6 = this.f12047to;
        fArr[1] = (float) ((d5 * d6) + d4);
        fArr[2] = (float) ((dArr2[2] * d3) + d);
        fArr[3] = (float) ((dArr2[3] * d6) + d4);
        fArr[4] = (float) ((dArr2[4] * d3) + d);
        fArr[5] = (float) ((dArr2[5] * d6) + d4);
        C11913yj c11913yj2 = this.f12043du;
        if (c11913yj2 != null) {
            c11913yj2.m55773k4(fArr, 0, fArr, 0, 3);
        }
        return 3;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public InterfaceC4413v4.k4 mo17819k4() {
        return InterfaceC4413v4.k4.WIND_NON_ZERO;
    }
}
