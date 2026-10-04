package com.aspose.slides.internal.p266m5;

import com.aspose.slides.internal.p154gr.C4375kk;
import com.aspose.slides.internal.p472w8.C11902kk;
import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: renamed from: com.aspose.slides.internal.m5.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C6319x1 {

    /* JADX INFO: renamed from: k4 */
    private final C12003du[] f17968k4;

    /* JADX INFO: renamed from: x1 */
    private final boolean f17969x1;

    public C6319x1(double d, C11902kk c11902kk, boolean z) {
        C12003du[] c12003duArrM55668k4 = c11902kk.m55668k4();
        int length = c12003duArrM55668k4.length - 1;
        if (length == 1) {
            this.f17968k4 = new C6318kk(256).m25871k4(c12003duArrM55668k4[0], c12003duArrM55668k4[1]);
        } else {
            this.f17968k4 = m25877k4(c11902kk.m55668k4(), c11902kk.m55669x1(), m25872k4(length, d));
        }
        this.f17969x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    private int m25872k4(int i, double d) {
        if (i == 2) {
            return 16;
        }
        if (i == 3) {
            return d < 128.0d ? 16 : 64;
        }
        if (d < 128.0d) {
            return 48;
        }
        return d < 512.0d ? 64 : 256;
    }

    /* JADX INFO: renamed from: k4 */
    public C12003du m25876k4(double d) {
        double dMax = Math.max(Math.min(d, 1.0d), 0.0d);
        C12003du c12003du = this.f17968k4[(int) Math.round(dMax * ((double) (r0.length - 1)))];
        return this.f17969x1 ? C12003du.m56396k4(C4375kk.m17621k4(c12003du.m56506h4(), 0.45454545454545453d)) : c12003du;
    }

    /* JADX INFO: renamed from: k4 */
    private void m25873k4(float[] fArr) {
        int i = 0;
        while (i < fArr.length - 1) {
            float f = fArr[i];
            i++;
            if (fArr[i] < f) {
                fArr[i] = f;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C12003du[] m25874k4(int i, C12003du[] c12003duArr, double d) {
        double d2;
        C12003du[] c12003duArr2 = new C12003du[i];
        int i2 = 0;
        C12003du c12003du = c12003duArr[0];
        double d3 = 0.0d;
        C12003du c12003du2 = c12003duArr[1];
        C12003du c12003du3 = c12003du;
        int i3 = 0;
        while (i2 < i) {
            int i4 = i3 + 1;
            double d4 = ((double) i4) * d;
            double d5 = i2;
            if (d4 < d5) {
                c12003du3 = c12003duArr[i4];
                c12003du2 = c12003duArr[i3 + 2];
                i3 = i4;
                d2 = d4;
            } else {
                d2 = d3;
            }
            double d6 = (d5 - d2) / d;
            c12003duArr2[i2] = C6317k4.m25866k4(c12003du3, c12003du2, 1.0d - d6, d6);
            i2++;
            d3 = d2;
        }
        return c12003duArr2;
    }

    /* JADX INFO: renamed from: k4 */
    private C12003du[] m25875k4(int i, C12003du[] c12003duArr, float[] fArr) {
        int i2;
        float f;
        C12003du[] c12003duArr2 = new C12003du[i];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            double d = ((double) i4) / ((double) (i - 1));
            while (true) {
                i2 = i3 + 1;
                f = fArr[i2];
                if (f < d) {
                    i3 = i2;
                }
            }
            C12003du c12003du = c12003duArr[i3];
            C12003du c12003du2 = c12003duArr[i2];
            double d2 = fArr[i3];
            double d3 = (d - d2) / (((double) f) - d2);
            c12003duArr2[i4] = C6317k4.m25866k4(c12003du, c12003du2, 1.0d - d3, d3);
        }
        return c12003duArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public C12003du[] m25877k4(C12003du[] c12003duArr, float[] fArr, int i) {
        m25873k4(fArr);
        int iMin = Math.min(4096, i * 256);
        return m25874k4(iMin, m25875k4(i + 1, c12003duArr, fArr), ((double) iMin) / ((double) i));
    }
}
