package com.aspose.slides.internal.p077d8;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.gi */
/* JADX INFO: loaded from: classes3.dex */
public class C3054gi {
    /* JADX INFO: renamed from: du */
    public static double[][] m12922du(double[] dArr) {
        int iM12924k4 = m12924k4(dArr);
        if (iM12924k4 < dArr.length) {
            double[] dArr2 = new double[iM12924k4];
            System.arraycopy(dArr, 0, dArr2, 0, iM12924k4);
            dArr = dArr2;
        }
        double[][] dArr3 = new double[iM12924k4][];
        dArr3[0] = dArr;
        if (iM12924k4 > 1) {
            dArr3[1] = m12929to(dArr);
        }
        int i = 1;
        while (i < iM12924k4 - 1) {
            double[] dArr4 = dArr3[i];
            if (dArr4.length <= 1) {
                break;
            }
            int i2 = i + 1;
            double[][] dArr5 = {dArr3[i2]};
            m12927k4(dArr3[i - 1], dArr4, dArr5);
            dArr3[i2] = dArr5[0];
            int i3 = 0;
            while (true) {
                double[] dArr6 = dArr3[i2];
                if (i3 < dArr6.length) {
                    dArr6[i3] = -dArr6[i3];
                    i3++;
                }
            }
            i = i2;
        }
        if (i < iM12924k4 && dArr3[i].length > 0) {
            i++;
        }
        if (i >= iM12924k4) {
            return dArr3;
        }
        double[][] dArr7 = new double[i][];
        System.arraycopy(dArr3, 0, dArr7, 0, i);
        return dArr7;
    }

    /* JADX INFO: renamed from: k4 */
    public static double m12923k4(double[] dArr, double d) {
        double d2 = 0.0d;
        double d3 = 1.0d;
        int i = 0;
        while (i < dArr.length) {
            d2 += dArr[i] * d3;
            i++;
            d3 *= d;
        }
        return d2;
    }

    /* JADX INFO: renamed from: kk */
    public static double[] m12928kk(double[] dArr) {
        int iM12924k4 = m12924k4(dArr);
        if (iM12924k4 == dArr.length) {
            return (double[]) dArr.clone();
        }
        double[] dArr2 = new double[iM12924k4];
        System.arraycopy(dArr, 0, dArr2, 0, iM12924k4);
        return dArr2;
    }

    /* JADX INFO: renamed from: to */
    public static double[] m12929to(double[] dArr) {
        int iM12924k4 = m12924k4(dArr);
        double[] dArr2 = new double[iM12924k4 - 1];
        for (int i = 1; i < iM12924k4; i++) {
            dArr2[i - 1] = dArr[i] * ((double) i);
        }
        return dArr2;
    }

    /* JADX INFO: renamed from: x1 */
    public static double[] m12930x1(double[] dArr) {
        int iM12924k4 = m12924k4(dArr);
        if (iM12924k4 == dArr.length) {
            return dArr;
        }
        double[] dArr2 = new double[iM12924k4];
        System.arraycopy(dArr, 0, dArr2, 0, iM12924k4);
        return dArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m12924k4(double[] dArr) {
        int length = dArr.length - 1;
        while (length >= 0 && C14116yg.m67475k4(dArr[length]) <= 0.0d) {
            length--;
        }
        return length + 1;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m12925k4(double[][] dArr, double d, double d2) {
        int i = 0;
        double d3 = 0.0d;
        for (double[] dArr2 : dArr) {
            double dM12923k4 = m12923k4(dArr2, d);
            if (dM12923k4 * d3 < -1.0E-5d) {
                i++;
                d3 = dM12923k4;
            }
            if (d3 == 0.0d) {
                d3 = dM12923k4;
            }
        }
        int i2 = 0;
        double d4 = 0.0d;
        for (double[] dArr3 : dArr) {
            double dM12923k42 = m12923k4(dArr3, d2);
            if (dM12923k42 * d4 < -1.0E-5d) {
                i2++;
                d4 = dM12923k42;
            }
            if (d4 == 0.0d) {
                d4 = dM12923k42;
            }
        }
        return i - i2;
    }

    /* JADX INFO: renamed from: k4 */
    public static double[] m12926k4(double[] dArr, double d, double d2) {
        double d3;
        double dM12923k4;
        char c = 1;
        ArrayList arrayList = new ArrayList();
        double[] dArr2 = null;
        double[] dArrM12927k4 = dArr;
        while (true) {
            d3 = 1.0d;
            if (m12923k4(dArrM12927k4, d) != 0.0d) {
                break;
            }
            double[][] dArr3 = {dArr2};
            dArrM12927k4 = m12927k4(dArrM12927k4, new double[]{-d, 1.0d}, dArr3);
            dArr2 = dArr3[0];
            arrayList.addItem(Double.valueOf(d));
        }
        while (m12923k4(dArrM12927k4, d2) == 0.0d) {
            double[][] dArr4 = {dArr2};
            char c2 = c;
            double[] dArr5 = new double[2];
            dArr5[0] = -d2;
            dArr5[c2] = 1.0d;
            dArrM12927k4 = m12927k4(dArrM12927k4, dArr5, dArr4);
            dArr2 = dArr4[0];
            arrayList.addItem(Double.valueOf(d2));
            c = c2;
        }
        char c3 = c;
        double[][] dArrM12922du = m12922du(dArrM12927k4);
        int iM12925k4 = m12925k4(dArrM12922du, d, d2);
        while (iM12925k4 > 0) {
            double[] dArr6 = dArrM12922du[c3];
            double d4 = (d + d2) / 2.0d;
            double d5 = 1.0E300d;
            double d6 = d3;
            while (true) {
                dM12923k4 = (-m12923k4(dArrM12927k4, d4)) / m12923k4(dArr6, d4);
                d4 += dM12923k4;
                if (C14116yg.m67475k4(d5) < C14116yg.m67475k4(dM12923k4) || C14116yg.m67475k4(dM12923k4) < 1.0E-8d) {
                    break;
                }
                d5 = dM12923k4;
            }
            if (C14116yg.m67475k4(dM12923k4) >= 1.0E-8d || C14116yg.m67475k4(m12923k4(dArrM12927k4, d4)) >= 0.001d) {
                break;
            }
            do {
                double[][] dArr7 = {dArr2};
                double[] dArr8 = new double[2];
                dArr8[0] = -d4;
                dArr8[c3] = d6;
                dArrM12927k4 = m12927k4(dArrM12927k4, dArr8, dArr7);
                dArr2 = dArr7[0];
                if (d <= d4 && d4 <= d2) {
                    arrayList.addItem(Double.valueOf(d4));
                }
            } while (C14116yg.m67475k4(m12923k4(dArrM12927k4, d4)) < 0.001d);
            dArrM12922du = m12922du(dArrM12927k4);
            iM12925k4 = m12925k4(dArrM12922du, d, d2);
            d3 = d6;
        }
        arrayList.sort();
        return (double[]) AbstractC14092to.m67212k4(arrayList.toArray(C7019kk.m27443k4((Class<?>) Double.TYPE)));
    }

    /* JADX INFO: renamed from: k4 */
    public static double[] m12927k4(double[] dArr, double[] dArr2, double[][] dArr3) {
        double[] dArrM12928kk = m12928kk(dArr);
        double[] dArrM12930x1 = m12930x1(dArr2);
        int length = dArrM12928kk.length - dArrM12930x1.length;
        int i = length + 1;
        if (i <= 0) {
            dArr3[0] = dArrM12928kk;
            return new double[0];
        }
        double[] dArr4 = new double[i];
        while (length >= 0) {
            dArr4[length] = dArrM12928kk[(dArrM12930x1.length + length) - 1] / dArrM12930x1[dArrM12930x1.length - 1];
            for (int i2 = 0; i2 < dArrM12930x1.length; i2++) {
                int i3 = length + i2;
                dArrM12928kk[i3] = dArrM12928kk[i3] - (dArrM12930x1[i2] * dArr4[length]);
            }
            dArrM12928kk[(dArrM12930x1.length + length) - 1] = 0.0d;
            length--;
        }
        dArr3[0] = m12930x1(dArrM12928kk);
        return dArr4;
    }
}
