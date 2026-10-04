package com.aspose.slides;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class igr {
    /* JADX INFO: renamed from: k4 */
    private static double m7626k4(int i) {
        double d = ((double) i) / 255.0d;
        if (d < 0.0d) {
            return 0.0d;
        }
        if (d <= 0.04045d) {
            return d / 12.92d;
        }
        if (d <= 1.0d) {
            return C14116yg.m67469du((d + 0.055d) / 1.055d, 2.4d);
        }
        return 1.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002e A[PHI: r7
      0x002e: PHI (r7v2 double) = (r7v0 double), (r7v1 double) binds: [B:5:0x002c, B:8:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C12003du m7634x1(C12003du c12003du, double d) {
        int[] iArr = new int[3];
        iArr[0] = c12003du.m56507jd() & 255;
        iArr[1] = c12003du.m56502ck() & 255;
        iArr[2] = c12003du.m56505fa() & 255;
        for (int i = 0; i < 3; i++) {
            double dM7626k4 = m7626k4(iArr[i]) * d;
            double d2 = 0.0d;
            if (dM7626k4 < 0.0d) {
                dM7626k4 = d2;
            } else {
                d2 = 1.0d;
                if (dM7626k4 > 1.0d) {
                }
            }
            iArr[i] = m7627k4(dM7626k4);
        }
        return C12003du.m56397k4(iArr[0], iArr[1], iArr[2]);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m7627k4(double d) {
        double dM67469du = 0.0d;
        if (d >= 0.0d) {
            if (d <= 0.0031308d) {
                dM67469du = 12.92d * d;
            } else {
                dM67469du = 1.0d;
                if (d < 1.0d) {
                    dM67469du = (C14116yg.m67469du(d, 0.4166666666666667d) * 1.055d) - 0.055d;
                }
            }
        }
        return C7019kk.m27462to(Double.valueOf(C14116yg.m67478k4(dM67469du * 255.0d, 0, (short) 1)), 14);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m7628k4(Chart chart) {
        IGenericEnumerator<IChartSeries> it = chart.getChartData().getSeries().iterator();
        int iM64750k4 = 0;
        while (it.hasNext()) {
            try {
                ChartSeries chartSeries = (ChartSeries) it.next();
                if ((chartSeries.m726k4().m64750k4() & 4294967295L) > iM64750k4) {
                    iM64750k4 = (int) chartSeries.m726k4().m64750k4();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return iM64750k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12003du m7629k4(C12003du c12003du, double d) {
        int[] iArr = new int[3];
        iArr[0] = c12003du.m56507jd() & 255;
        iArr[1] = c12003du.m56502ck() & 255;
        iArr[2] = c12003du.m56505fa() & 255;
        for (int i = 0; i < 3; i++) {
            double dM7626k4 = m7626k4(iArr[i]);
            double d2 = 1.0d - d;
            double dOooO0O0 = (d2 + 1.0d) * dM7626k4;
            if (d > 0.0d) {
                dOooO0O0 = C21532OooOOo.OooO0O0(1.0d, d2, dM7626k4, d2);
            }
            iArr[i] = m7627k4(dOooO0O0);
        }
        return C12003du.m56397k4(iArr[0], iArr[1], iArr[2]);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7630k4(C12003du[] c12003duArr) {
        if (c12003duArr == null) {
            return;
        }
        for (int i = 0; i < c12003duArr.length; i++) {
            C12003du.m56400k4(255, c12003duArr[i].Clone().Clone()).CloneTo(c12003duArr[i]);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C12003du[] m7631k4(Chart chart, int i) {
        return m7632k4(chart, i, m7628k4(chart) + 1);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12003du[] m7632k4(Chart chart, int i, int i2) {
        C12003du[] c12003duArrM7633k4;
        if (i2 <= 0) {
            return null;
        }
        C12003du[] c12003duArr = (C12003du[]) C22200OooO0o0.OooO00o(C12003du.class, 6);
        int i3 = 0;
        chart.m506k4((byte) 4).CloneTo(c12003duArr[0]);
        chart.m506k4((byte) 5).CloneTo(c12003duArr[1]);
        chart.m506k4((byte) 6).CloneTo(c12003duArr[2]);
        chart.m506k4((byte) 7).CloneTo(c12003duArr[3]);
        chart.m506k4((byte) 8).CloneTo(c12003duArr[4]);
        chart.m506k4((byte) 9).CloneTo(c12003duArr[5]);
        int i4 = i % 8;
        switch (i4) {
            case 0:
                c12003duArrM7633k4 = m7633k4(new C12003du[]{c12003duArr[5]}, i4, i2);
                m7630k4(c12003duArrM7633k4);
                return c12003duArrM7633k4;
            case 1:
                C12003du c12003duClone = chart.m506k4((byte) 0).Clone();
                if (i != 41) {
                    double[] dArr = {0.88d, 0.55d, 0.78d, 0.92d, 0.7d, 0.3d};
                    while (i3 < 6) {
                        m7629k4(c12003duClone.Clone(), dArr[i3]).CloneTo(c12003duArr[i3]);
                        i3++;
                    }
                    break;
                } else {
                    double[] dArr2 = {0.05d, 0.55d, 0.78d, 0.15d, 0.7d, 0.3d};
                    while (i3 < 6) {
                        m7629k4(c12003duClone.Clone(), dArr2[i3]).CloneTo(c12003duArr[i3]);
                        i3++;
                    }
                    return m7633k4(c12003duArr, i4, i2);
                }
            case 2:
            default:
                c12003duArrM7633k4 = m7633k4(c12003duArr, i4, i2);
                m7630k4(c12003duArrM7633k4);
                return c12003duArrM7633k4;
            case 3:
                c12003duArrM7633k4 = m7633k4(new C12003du[]{c12003duArr[0]}, i4, i2);
                m7630k4(c12003duArrM7633k4);
                return c12003duArrM7633k4;
            case 4:
                c12003duArrM7633k4 = m7633k4(new C12003du[]{c12003duArr[1]}, i4, i2);
                m7630k4(c12003duArrM7633k4);
                return c12003duArrM7633k4;
            case 5:
                c12003duArrM7633k4 = m7633k4(new C12003du[]{c12003duArr[2]}, i4, i2);
                m7630k4(c12003duArrM7633k4);
                return c12003duArrM7633k4;
            case 6:
                c12003duArrM7633k4 = m7633k4(new C12003du[]{c12003duArr[3]}, i4, i2);
                m7630k4(c12003duArrM7633k4);
                return c12003duArrM7633k4;
            case 7:
                c12003duArrM7633k4 = m7633k4(new C12003du[]{c12003duArr[4]}, i4, i2);
                m7630k4(c12003duArrM7633k4);
                return c12003duArrM7633k4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C12003du[] m7633k4(C12003du[] c12003duArr, int i, int i2) {
        C12003du[] c12003duArr2 = (C12003du[]) C22200OooO0o0.OooO00o(C12003du.class, i2);
        int i3 = 6;
        if (((i != 1 && i != 2) || c12003duArr.length != 6) && ((i != 0 && i <= 2) || c12003duArr.length != 1)) {
            return null;
        }
        int i4 = 0;
        if (c12003duArr.length == 6) {
            if (i2 < c12003duArr.length) {
                while (i4 < i2) {
                    c12003duArr[i4].CloneTo(c12003duArr2[i4]);
                    i4++;
                }
            }
            return c12003duArr2;
        }
        if (i > 2 && i2 == 1) {
            c12003duArr[0].CloneTo(c12003duArr2[0]);
            return c12003duArr2;
        }
        int i5 = c12003duArr.length == 6 ? (i2 / 6) + 1 : i2;
        double d = i5;
        int iOooO00o = C22201OooO0oO.OooO00o(d / 2.0d, 0.5d, 14);
        int i6 = 1;
        int i7 = 0;
        while (i6 < iOooO00o + 1 && i7 < i2) {
            int i8 = i4;
            double d2 = d;
            double dM67490kk = C14116yg.m67490kk(((((double) i6) * 140.0d) / (d2 + 1.0d)) + 30.0d) / 100.0d;
            if (c12003duArr.length == 6) {
                for (int i9 = i8; i9 < 6 && i7 < i2; i9++) {
                    m7634x1(c12003duArr[i9].Clone(), dM67490kk).Clone().CloneTo(c12003duArr2[i7]);
                    i7++;
                }
            } else {
                m7634x1(c12003duArr[i8].Clone(), dM67490kk).Clone().CloneTo(c12003duArr2[i7]);
                i7++;
            }
            i6++;
            i4 = i8;
            d = d2;
        }
        int i10 = i4;
        double d3 = d;
        while (i6 < i5 + 1 && i7 < i2) {
            double dM67501x1 = C14116yg.m67501x1(170.0d - ((((double) i6) * 140.0d) / (d3 + 1.0d))) / 100.0d;
            if (c12003duArr.length == i3) {
                int i11 = i10;
                while (i11 < i3 && i7 < i2) {
                    m7629k4(c12003duArr[i11].Clone(), dM67501x1).Clone().CloneTo(c12003duArr2[i7]);
                    i7++;
                    i11++;
                    i3 = 6;
                }
            } else {
                m7629k4(c12003duArr[i10].Clone(), dM67501x1).Clone().CloneTo(c12003duArr2[i7]);
                i7++;
            }
            i6++;
            i3 = 6;
        }
        return c12003duArr2;
    }
}
