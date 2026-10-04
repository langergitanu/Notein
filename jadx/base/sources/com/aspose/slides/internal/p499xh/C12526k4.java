package com.aspose.slides.internal.p499xh;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.internal.p266m5.C6319x1;
import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p472w8.C11902kk;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.xh.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12526k4 {

    /* JADX INFO: renamed from: du */
    private final double f41952du;

    /* JADX INFO: renamed from: k4 */
    private final C6319x1 f41953k4;

    /* JADX INFO: renamed from: kk */
    private final double f41954kk;

    /* JADX INFO: renamed from: to */
    private final double f41955to;

    /* JADX INFO: renamed from: x1 */
    private final int f41956x1;

    public C12526k4(C11913yj c11913yj, C12527kk c12527kk) {
        C11902kk c11902kk = new C11902kk();
        c11902kk.m55666k4(c12527kk.m58306kk());
        c11902kk.m55667k4(c12527kk.m58307to());
        C12025x6[] c12025x6Arr = {c12527kk.m58305k4().Clone(), c12527kk.m58308x1().Clone()};
        c11913yj.m55775k4(c12025x6Arr);
        this.f41953k4 = new C6319x1(C9467to.m46521k4(c12025x6Arr[0], c12025x6Arr[1]), c11902kk, c12527kk.m58304h4());
        this.f41956x1 = c12527kk.m58303du();
        C11913yj c11913yjM55760h4 = c11913yj.m55760h4();
        if (c11913yjM55760h4.m55778kk()) {
            c11913yjM55760h4.m55780m9();
        }
        float[] fArrM55776k4 = c11913yjM55760h4.m55776k4();
        double d = fArrM55776k4[0];
        double d2 = fArrM55776k4[1];
        double d3 = fArrM55776k4[2];
        double d4 = fArrM55776k4[3];
        double d5 = fArrM55776k4[4];
        double d6 = fArrM55776k4[5];
        double dM56897x1 = c12527kk.m58305k4().m56897x1();
        double dM56895kk = c12527kk.m58305k4().m56895kk();
        double dM56897x12 = ((double) c12527kk.m58308x1().m56897x1()) - dM56897x1;
        double dM56895kk2 = ((double) c12527kk.m58308x1().m56895kk()) - dM56895kk;
        double d7 = (dM56895kk2 * dM56895kk2) + (dM56897x12 * dM56897x12);
        double d8 = dM56897x12 / d7;
        double d9 = dM56895kk2 / d7;
        this.f41954kk = (d2 * d9) + (d * d8);
        this.f41955to = (d4 * d9) + (d3 * d8);
        this.f41952du = C21532OooOOo.OooO0O0(d6, dM56895kk, d9, (d5 - dM56897x1) * d8);
    }

    /* JADX INFO: renamed from: k4 */
    private int m58299k4(double d) {
        return this.f41953k4.m25876k4(m58301x1(d)).m56506h4();
    }

    /* JADX INFO: renamed from: x1 */
    private double m58301x1(double d) {
        int i = this.f41956x1;
        if (i == 4) {
            if (d > 1.0d) {
                return 1.0d;
            }
            if (d < 0.0d) {
                return 0.0d;
            }
            return d;
        }
        if (i == 0 || i == 2) {
            if (Math.abs(d - Math.round(d)) <= 1.0E-5d) {
                return 0.0d;
            }
            return d < 0.0d ? (d - ((double) ((int) d))) + 1.0d : d > 1.0d ? d - ((double) ((int) d)) : d;
        }
        if (d < 0.0d) {
            d = -d;
        }
        int i2 = (int) d;
        double d2 = d - ((double) i2);
        return (i2 & 1) == 1 ? 1.0d - d2 : d2;
    }

    /* JADX INFO: renamed from: k4 */
    private void m58300k4(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i + i5;
        double d = (this.f41954kk * ((double) i3)) + this.f41952du;
        for (int i8 = 0; i8 < i6; i8++) {
            double d2 = (this.f41955to * ((double) (i4 + i8))) + d;
            while (i < i7) {
                iArr[i] = m58299k4(d2);
                d2 += this.f41954kk;
                i++;
            }
            i += i2;
            i7 = i + i5;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public int[] m58302k4(int i, int i2, int i3, int i4) {
        int[] iArr = new int[i3 * i4];
        m58300k4(iArr, 0, 0, i, i2, i3, i4);
        return iArr;
    }
}
