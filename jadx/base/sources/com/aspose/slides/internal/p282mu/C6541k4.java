package com.aspose.slides.internal.p282mu;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p031aw.InterfaceC1565x1;
import com.aspose.slides.internal.p156gw.C4417x6;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.mu.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6541k4 {
    /* JADX INFO: renamed from: k4 */
    public static InterfaceC1565x1 m26346k4(C11913yj c11913yj, InterfaceC1565x1 interfaceC1565x1) {
        if (interfaceC1565x1 == null) {
            return null;
        }
        return new C4417x6(interfaceC1565x1, c11913yj);
    }

    /* JADX INFO: renamed from: kk */
    public static C6540du m26353kk(C11913yj c11913yj) {
        float[] fArrM55776k4 = c11913yj.m55776k4();
        return new C6540du(new double[][]{new double[]{fArrM55776k4[0], fArrM55776k4[1], 0.0d}, new double[]{fArrM55776k4[2], fArrM55776k4[3], 0.0d}, new double[]{fArrM55776k4[4], fArrM55776k4[5], 1.0d}});
    }

    /* JADX INFO: renamed from: to */
    public static boolean m26354to(C11913yj c11913yj) {
        if (c11913yj == null) {
            return true;
        }
        float[] fArrM55776k4 = c11913yj.m55776k4();
        return m26356x1((double) fArrM55776k4[0]) && m26348k4((double) fArrM55776k4[1]) && m26348k4((double) fArrM55776k4[2]) && m26356x1((double) fArrM55776k4[3]) && m26348k4((double) fArrM55776k4[4]) && m26348k4((double) fArrM55776k4[5]);
    }

    /* JADX INFO: renamed from: x1 */
    public static float m26355x1(C11913yj c11913yj) {
        float[] fArrM55776k4 = c11913yj.m55776k4();
        return (float) new C6543to(m26353kk(new C11913yj(fArrM55776k4[0], fArrM55776k4[1], fArrM55776k4[2], fArrM55776k4[3], 0.0f, 0.0f))).m26365k4()[2];
    }

    /* JADX INFO: renamed from: k4 */
    public static void m26347k4(C11913yj c11913yj, C12025x6[] c12025x6Arr) {
        if (c12025x6Arr == null) {
            throw new ArgumentNullException("Value of 'pts' cannot be null");
        }
        if (c12025x6Arr.length < 1) {
            throw new ArgumentException("Argument 'pts' is invalid");
        }
        C12025x6 c12025x6 = new C12025x6();
        C12025x6[] c12025x6Arr2 = {c12025x6};
        for (C12025x6 c12025x62 : c12025x6Arr) {
            c12025x6.m56892k4(c12025x62.m56897x1(), c12025x62.m56895kk());
            c11913yj.m55775k4(c12025x6Arr2);
            c12025x62.m56892k4(c12025x6.m56897x1(), c12025x6.m56895kk());
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m26356x1(double d) {
        return d >= 0.9998999834060669d && d <= 1.000100016593933d;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m26348k4(double d) {
        return d >= -9.999999747378752E-5d && d <= 9.999999747378752E-5d;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m26349k4(float f, float f2, float f3) {
        return f >= f2 - f3 && f <= f2 + f3;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m26350k4(float f, float f2, float[] fArr) {
        float f3 = fArr[3];
        if (f3 == 0.0f) {
            f3 = 0.0f;
        }
        float f4 = f3 / f2;
        float f5 = fArr[2];
        if (f5 == 0.0f) {
            f5 = 0.0f;
        }
        float f6 = f5 / f2;
        float f7 = fArr[0];
        if (f7 == 0.0f) {
            f7 = 0.0f;
        }
        float f8 = f7 / f;
        float f9 = fArr[1];
        if (f9 == 0.0f) {
            f9 = 0.0f;
        }
        float f10 = f9 / f;
        return m26349k4(f4, f8, 1.0E-4f) && m26349k4(f6, -f10, 1.0E-4f) && Math.signum(f6) - Math.signum(f10) != 0.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public static float[] m26351k4(C11913yj c11913yj) {
        float[] fArrM55776k4 = c11913yj.m55776k4();
        float[] fArrM26352k4 = m26352k4(new float[]{fArrM55776k4[0], fArrM55776k4[1], fArrM55776k4[2], fArrM55776k4[3]});
        return fArrM26352k4.length == 2 ? fArrM26352k4 : m26352k4(new float[]{fArrM55776k4[0], fArrM55776k4[2], fArrM55776k4[1], fArrM55776k4[3]});
    }

    /* JADX INFO: renamed from: k4 */
    private static float[] m26352k4(float[] fArr) {
        if (fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return new float[]{fArr[0], fArr[3]};
        }
        float f = fArr[2];
        float f2 = fArr[3];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr[0];
        float f4 = fArr[1];
        float fSqrt2 = (float) Math.sqrt((f4 * f4) + (f3 * f3));
        float fSignum = Math.signum(fArr[0]);
        float fSignum2 = Math.signum(fArr[3]);
        if (fSignum != 0.0f && fSignum2 != 0.0f) {
            float f5 = fSignum * fSqrt2;
            float f6 = fSignum2 * fSqrt;
            if (m26350k4(f5, f6, fArr)) {
                return new float[]{f5, f6};
            }
        }
        if (!m26350k4(fSqrt2, fSqrt, fArr)) {
            float f7 = -fSqrt2;
            if (m26350k4(f7, fSqrt, fArr)) {
                fSqrt2 = f7;
            } else {
                fSqrt = -fSqrt;
                if (!m26350k4(fSqrt2, fSqrt, fArr)) {
                    if (!m26350k4(f7, fSqrt, fArr)) {
                        return new float[]{fArr[0], fArr[3], 0.0f};
                    }
                    fSqrt2 = f7;
                }
            }
        }
        return new float[]{fSqrt2, fSqrt};
    }
}
