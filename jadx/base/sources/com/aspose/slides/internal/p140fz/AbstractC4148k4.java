package com.aspose.slides.internal.p140fz;

import OooOoO.C20504OooO0O0;
import OooooOo.C21392OooOo00;
import com.aspose.slides.internal.p044bq.C1839x1;
import com.aspose.slides.internal.p315od.C7023c5;
import com.aspose.slides.internal.p315od.C7024du;
import com.aspose.slides.internal.p315od.C7031x1;
import com.aspose.slides.internal.p315od.EnumC7025dy;
import java.util.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.fz.k4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4148k4 implements InterfaceC4146h4 {

    /* JADX INFO: renamed from: k4 */
    static final /* synthetic */ boolean f11331k4 = true;

    @Override // com.aspose.slides.internal.p140fz.InterfaceC4146h4
    /* JADX INFO: renamed from: k4 */
    public C7023c5 mo16591k4(float[] fArr, int i) {
        float f = fArr[i];
        float f2 = fArr[i + 1];
        float f3 = fArr[i + 2];
        float f4 = fArr[i + 3];
        float f5 = fArr[i + 4];
        float f6 = fArr[i + 5];
        float f7 = f5 - f3;
        float f8 = f6 - f4;
        float f9 = f3 - f;
        float f10 = f4 - f2;
        C7024du c7024duMo16588x1 = mo16588x1(f9, f10);
        C7024du c7024duMo16588x12 = mo16588x1(f7, f8);
        float[] fArr2 = new float[6];
        float[] fArr3 = new float[6];
        fArr2[0] = c7024duMo16588x1.f19088k4 + f;
        fArr2[1] = c7024duMo16588x1.f19091x1 + f2;
        fArr2[4] = c7024duMo16588x12.f19088k4 + f5;
        fArr2[5] = c7024duMo16588x12.f19091x1 + f6;
        fArr3[0] = c7024duMo16588x1.f19089kk + f;
        fArr3[1] = c7024duMo16588x1.f19090to + f2;
        fArr3[4] = c7024duMo16588x12.f19089kk + f5;
        fArr3[5] = c7024duMo16588x12.f19090to + f6;
        float f11 = fArr2[0];
        float f12 = fArr2[1];
        float f13 = fArr2[4];
        float f14 = fArr2[5];
        C1839x1.m9613k4(f11, f12, f11 + f9, f12 + f10, f13, f14, f13 - f7, f14 - f8, fArr2, 2);
        float f15 = fArr2[2];
        float f16 = fArr2[3];
        if (m16596k4(f15) && m16596k4(f16)) {
            fArr3[2] = (f3 * 2.0f) - f15;
            fArr3[3] = (f4 * 2.0f) - f16;
            return new C7023c5(EnumC7025dy.QUAD, fArr2, fArr3);
        }
        float f17 = fArr3[0];
        float f18 = fArr3[1];
        float f19 = fArr3[4];
        float f20 = fArr3[5];
        C1839x1.m9613k4(f17, f18, f17 + f9, f18 + f10, f19, f20, f19 - f7, f20 - f8, fArr3, 2);
        float f21 = fArr3[2];
        float f22 = fArr3[3];
        if (!m16596k4(f21) || !m16596k4(f22)) {
            m16595k4(f, f2, f5, f6, fArr2, fArr3);
            return new C7023c5(EnumC7025dy.LINE, fArr2, fArr3);
        }
        fArr2[2] = (f3 * 2.0f) - f21;
        fArr2[3] = (f4 * 2.0f) - f22;
        return new C7023c5(EnumC7025dy.QUAD, fArr2, fArr3);
    }

    @Override // com.aspose.slides.internal.p140fz.InterfaceC4146h4
    /* JADX INFO: renamed from: kk */
    public boolean mo16589kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p140fz.InterfaceC4146h4
    /* JADX INFO: renamed from: x1 */
    public C7031x1 mo16593x1(float[] fArr, int i) {
        float f = fArr[i];
        float f2 = fArr[i + 1];
        float f3 = fArr[i + 2];
        float f4 = fArr[i + 3];
        float f5 = fArr[i + 4];
        float f6 = fArr[i + 5];
        float f7 = fArr[i + 6];
        float f8 = fArr[i + 7];
        float f9 = f7 - f5;
        float f10 = f8 - f6;
        float f11 = f3 - f;
        float f12 = f4 - f2;
        float[] fArr2 = new float[8];
        float[] fArr3 = new float[8];
        boolean zM16597k4 = m16597k4(f, f2, f3, f4, Math.ulp(f4) * 6.0f);
        boolean zM16597k42 = m16597k4(f5, f6, f7, f8, Math.ulp(f8) * 6.0f);
        if (zM16597k4 && zM16597k42) {
            m16595k4(f, f2, f7, f8, fArr2, fArr3);
            return new C7031x1(EnumC7025dy.LINE, fArr2, fArr3);
        }
        if (zM16597k4) {
            f11 = f5 - f;
            f12 = f6 - f2;
        } else if (zM16597k42) {
            f9 = f7 - f3;
            f10 = f8 - f4;
        }
        float f13 = (f12 * f10) + (f11 * f9);
        float f14 = f13 * f13;
        if (C1839x1.m9620k4(f14, C20504OooO0O0.OooO0O0(f10, f10, f9 * f9, (f12 * f12) + (f11 * f11)), Math.ulp(f14) * 4.0f)) {
            m16595k4(f, f2, f7, f8, fArr2, fArr3);
            return new C7031x1(EnumC7025dy.LINE, fArr2, fArr3);
        }
        float f15 = ((((f3 + f5) * 3.0f) + f) + f7) / 8.0f;
        float f16 = ((((f4 + f6) * 3.0f) + f2) + f8) / 8.0f;
        C7024du c7024duMo16588x1 = mo16588x1(f11, f12);
        C7024du c7024duMo16588x12 = mo16588x1(((f5 + f7) - f) - f3, ((f6 + f8) - f2) - f4);
        C7024du c7024duMo16588x13 = mo16588x1(f9, f10);
        float f17 = c7024duMo16588x1.f19088k4 + f;
        float f18 = c7024duMo16588x1.f19091x1 + f2;
        float f19 = c7024duMo16588x12.f19088k4 + f15;
        float f20 = f16 + c7024duMo16588x12.f19091x1;
        float f21 = c7024duMo16588x13.f19088k4 + f7;
        float f22 = c7024duMo16588x13.f19091x1 + f8;
        float f23 = 4.0f / (((f11 * f10) - (f12 * f9)) * 3.0f);
        float f24 = ((f19 * 2.0f) - f17) - f21;
        float f25 = ((f20 * 2.0f) - f18) - f22;
        float fOooO00o = C21392OooOo00.OooO00o(f9, f25, f10 * f24, f23);
        float fOooO00o2 = C21392OooOo00.OooO00o(f12, f24, f25 * f11, f23);
        fArr2[0] = f17;
        fArr2[1] = f18;
        fArr2[2] = (fOooO00o * f11) + f17;
        fArr2[3] = (fOooO00o * f12) + f18;
        fArr2[4] = (fOooO00o2 * f9) + f21;
        fArr2[5] = (fOooO00o2 * f10) + f22;
        fArr2[6] = f21;
        fArr2[7] = f22;
        float f26 = f + c7024duMo16588x1.f19089kk;
        float f27 = f2 + c7024duMo16588x1.f19090to;
        float f28 = f15 + c7024duMo16588x12.f19089kk;
        float f29 = f16 + c7024duMo16588x12.f19090to;
        float f30 = f7 + c7024duMo16588x13.f19089kk;
        float f31 = f8 + c7024duMo16588x13.f19090to;
        float f32 = ((f28 * 2.0f) - f26) - f30;
        float f33 = ((f29 * 2.0f) - f27) - f31;
        float fOooO00o3 = C21392OooOo00.OooO00o(f9, f33, f10 * f32, f23);
        float fOooO00o4 = C21392OooOo00.OooO00o(f12, f32, f33 * f11, f23);
        fArr3[0] = f26;
        fArr3[1] = f27;
        fArr3[2] = (f11 * fOooO00o3) + f26;
        fArr3[3] = (fOooO00o3 * f12) + f27;
        fArr3[4] = (f9 * fOooO00o4) + f30;
        fArr3[5] = (fOooO00o4 * f10) + f31;
        fArr3[6] = f30;
        fArr3[7] = f31;
        return new C7031x1(EnumC7025dy.CURVE, fArr2, fArr3);
    }

    @Override // com.aspose.slides.internal.p140fz.InterfaceC4146h4
    /* JADX INFO: renamed from: k4 */
    public C7024du mo16587k4(float f, float f2) {
        C7024du c7024duMo16588x1 = mo16588x1(f, f2);
        c7024duMo16588x1.m27475x1();
        return c7024duMo16588x1;
    }

    @Override // com.aspose.slides.internal.p140fz.InterfaceC4146h4
    /* JADX INFO: renamed from: x1 */
    public List<InterfaceC4146h4> mo16594x1() {
        throw new UnsupportedOperationException("Not composite PathAlignment does not support CompoundAlignments");
    }

    /* JADX INFO: renamed from: k4 */
    private void m16595k4(float f, float f2, float f3, float f4, float[] fArr, float[] fArr2) {
        C7024du c7024duMo16588x1 = mo16588x1(f3 - f, f4 - f2);
        float f5 = c7024duMo16588x1.f19088k4;
        fArr[0] = f + f5;
        float f6 = c7024duMo16588x1.f19091x1;
        fArr[1] = f2 + f6;
        fArr[2] = f5 + f3;
        fArr[3] = f6 + f4;
        float f7 = c7024duMo16588x1.f19089kk;
        fArr2[0] = f + f7;
        float f8 = c7024duMo16588x1.f19090to;
        fArr2[1] = f2 + f8;
        fArr2[2] = f3 + f7;
        fArr2[3] = f4 + f8;
    }

    @Override // com.aspose.slides.internal.p140fz.InterfaceC4146h4
    /* JADX INFO: renamed from: k4 */
    public boolean mo16592k4() {
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m16596k4(float f) {
        return Float.NEGATIVE_INFINITY < f && f < Float.POSITIVE_INFINITY;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m16597k4(float f, float f2, float f3, float f4, float f5) {
        if (f11331k4 || f5 > 0.0f) {
            return C1839x1.m9620k4(f, f3, f5) && C1839x1.m9620k4(f2, f4, f5);
        }
        throw new AssertionError("");
    }
}
