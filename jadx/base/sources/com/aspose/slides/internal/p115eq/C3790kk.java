package com.aspose.slides.internal.p115eq;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p040bg.OooO00o;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.eq.kk */
/* JADX INFO: loaded from: classes.dex */
public class C3790kk {
    /* JADX INFO: renamed from: k4 */
    private static float m15142k4(float f, float f2) {
        float f3 = f2 * f2;
        float f4 = (f + f3) / 2.0f;
        if (f4 >= 0.0f) {
            float f5 = f3 - f4;
            if (f5 > 0.0f) {
                float fM67496rv = (float) C14116yg.m67496rv(f5);
                float fM67496rv2 = (f2 - ((float) C14116yg.m67496rv(f4))) * 4.0f;
                if (fM67496rv2 / 3.0f <= 1.0E-6f * fM67496rv) {
                    return 0.0f;
                }
                return (fM67496rv2 / fM67496rv) / 3.0f;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public static List<C12025x6> m15143k4(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, int[] iArr) {
        float f8;
        boolean z3;
        float f9;
        float f10;
        boolean z4;
        char c;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z5 = true;
        iArr[0] = -1;
        float f16 = (f6 - f) / 2.0f;
        float f17 = (f7 - f2) / 2.0f;
        float f18 = (f17 * f17) + (f16 * f16);
        if (f18 < 1.0E-12f) {
            return null;
        }
        float[] fArr = {f3};
        float[] fArr2 = {f4};
        boolean z6 = (m15145k4(f18, 1.0E-12f, fArr) && m15145k4(f18, 1.0E-12f, fArr2)) ? false : true;
        float f19 = fArr[0];
        float f20 = fArr2[0];
        if (z6) {
            iArr[0] = 0;
            return null;
        }
        if (f19 == 0.0f || f20 == 0.0f) {
            iArr[0] = 0;
            return null;
        }
        double d = (-f5) * 0.017453292f;
        float fM67470dy = (float) C14116yg.m67470dy(d);
        float fM67495m9 = (float) C14116yg.m67495m9(d);
        float f21 = ((f16 * fM67470dy) - (f17 * fM67495m9)) / f19;
        float f22 = ((f17 * fM67470dy) + (f16 * fM67495m9)) / f20;
        float f23 = (f22 * f22) + (f21 * f21);
        if (f23 > 1.0f) {
            f8 = 2.0f;
            float fM67496rv = (float) C14116yg.m67496rv(f23);
            float f24 = f19 * fM67496rv;
            float f25 = f20 * fM67496rv;
            float f26 = f21 / fM67496rv;
            float f27 = f22 / fM67496rv;
            f10 = 0.0f;
            f11 = 0.0f;
            z4 = true;
            c = 0;
            f12 = f26;
            f13 = f25;
            f14 = f24;
            f15 = f27;
            z3 = z;
        } else {
            f8 = 2.0f;
            float fM67496rv2 = (float) C14116yg.m67496rv((1.0f - f23) / f23);
            z3 = z;
            if (z3 != z2) {
                f9 = (-fM67496rv2) * f22;
            } else {
                f9 = fM67496rv2 * f22;
                fM67496rv2 = -fM67496rv2;
            }
            f10 = fM67496rv2 * f21;
            z4 = false;
            c = 0;
            f11 = f9;
            f12 = f21;
            f13 = f20;
            f14 = f19;
            f15 = f22;
        }
        float f28 = f8;
        C12025x6 c12025x6 = new C12025x6((-f12) - f11, (-f15) - f10);
        C12025x6 c12025x62 = new C12025x6(f12 - f11, f15 - f10);
        C4317dy c4317dy = new C4317dy(fM67470dy * f14, (-fM67495m9) * f14, fM67495m9 * f13, fM67470dy * f13, (f6 + f) / f28, (f7 + f2) / f28);
        if (!z4) {
            c4317dy.m17349x1((c4317dy.m17331h4() * f10) + (c4317dy.m17347to() * f11), (c4317dy.m17346m9() * f10) + (c4317dy.m17329du() * f11), 1);
        }
        float[] fArr3 = new float[1];
        fArr3[c] = 0.0f;
        float[] fArr4 = new float[1];
        fArr4[c] = 0.0f;
        m15144k4(c12025x6.Clone(), c12025x62.Clone(), z3, z2, fArr3, fArr4, iArr);
        float f29 = fArr3[c];
        float f30 = fArr4[c];
        float fM15142k4 = m15142k4(f29, 1.0f);
        if (!z2) {
            fM15142k4 = -fM15142k4;
        }
        float f31 = -fM15142k4;
        float fM56895kk = c12025x6.m56895kk() * f31;
        float fM56897x1 = c12025x6.m56897x1() * fM15142k4;
        List<C12025x6> list = new List<>();
        int i = 1;
        while (i < iArr[c]) {
            boolean z7 = z5;
            C12025x6 c12025x63 = new C12025x6((c12025x6.m56897x1() * f29) - (c12025x6.m56895kk() * f30), OooO00o.OooO00o(c12025x6, f29, c12025x6.m56897x1() * f30));
            float fM56895kk2 = c12025x63.m56895kk() * f31;
            float fM56897x12 = c12025x63.m56897x1() * fM15142k4;
            list.addItem(c4317dy.m17333k4(new C12025x6(c12025x6.m56897x1() + fM56895kk, c12025x6.m56895kk() + fM56897x1)).Clone());
            list.addItem(c4317dy.m17333k4(new C12025x6(c12025x63.m56897x1() - fM56895kk2, c12025x63.m56895kk() - fM56897x12)).Clone());
            list.addItem(c4317dy.m17333k4(c12025x63.Clone()).Clone());
            c12025x63.CloneTo(c12025x6);
            i++;
            f29 = f29;
            fM56895kk = fM56895kk2;
            fM56897x1 = fM56897x12;
            z5 = z7;
        }
        float fM56895kk3 = c12025x62.m56895kk() * f31;
        float fM56897x13 = c12025x62.m56897x1() * fM15142k4;
        list.addItem(c4317dy.m17333k4(new C12025x6(c12025x6.m56897x1() + fM56895kk, c12025x6.m56895kk() + fM56897x1)).Clone());
        list.addItem(c4317dy.m17333k4(new C12025x6(c12025x62.m56897x1() - fM56895kk3, c12025x62.m56895kk() - fM56897x13)).Clone());
        list.addItem(new C12025x6(f6, f7));
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m15144k4(C12025x6 c12025x6, C12025x6 c12025x62, boolean z, boolean z2, float[] fArr, float[] fArr2, int[] iArr) {
        fArr[0] = OooO00o.OooO00o(c12025x62, c12025x6.m56895kk(), c12025x62.m56897x1() * c12025x6.m56897x1());
        float fM56895kk = (c12025x62.m56895kk() * c12025x6.m56897x1()) - (c12025x62.m56897x1() * c12025x6.m56895kk());
        fArr2[0] = fM56895kk;
        float f = fArr[0];
        if (f < 0.0f) {
            iArr[0] = z ? 3 : 2;
        } else {
            if (!z) {
                iArr[0] = 1;
                return;
            }
            iArr[0] = 4;
        }
        float fM67498to = (float) C14116yg.m67498to(fM56895kk, f);
        if (z2) {
            if (fM67498to < 0.0f) {
                fM67498to += 6.2831855f;
            }
        } else if (fM67498to > 0.0f) {
            fM67498to -= 6.2831855f;
        }
        double d = fM67498to / iArr[0];
        fArr[0] = (float) C14116yg.m67470dy(d);
        fArr2[0] = (float) C14116yg.m67495m9(d);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m15145k4(float f, float f2, float[] fArr) {
        float f3 = fArr[0];
        boolean z = f3 * f3 > f * f2;
        if (z && f3 < 0.0f) {
            fArr[0] = 0.0f;
        }
        return z;
    }
}
