package OooooOo;

import OooOoO.C20509OooO0oo;
import OooooOo.AbstractC21372OooO00o;

/* JADX INFO: renamed from: OooooOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21375OooO0Oo {
    public static final float OooO(float f, float f2, float f3, float[] lhs) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(lhs, "lhs");
        return (lhs[8] * f3) + (lhs[5] * f2) + (lhs[2] * f);
    }

    public static AbstractC21374OooO0OO OooO00o(AbstractC21374OooO0OO abstractC21374OooO0OO) {
        C21394OooOo0o c21394OooOo0o = C21380OooOO0.f61862OooO0O0;
        AbstractC21372OooO00o.C18986OooO00o c18986OooO00o = AbstractC21372OooO00o.f61820OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC21374OooO0OO, "<this>");
        if (C21373OooO0O0.OooO00o(abstractC21374OooO0OO.f61828OooO0O0, C21373OooO0O0.f61822OooO00o)) {
            C21391OooOo0 c21391OooOo0 = (C21391OooOo0) abstractC21374OooO0OO;
            C21394OooOo0o c21394OooOo0o2 = c21391OooOo0.f61878OooO0Oo;
            if (!OooO0OO(c21394OooOo0o2, c21394OooOo0o)) {
                float[] fArrOooO00o = c21394OooOo0o.OooO00o();
                float[] fArrOooO0o0 = OooO0o0(OooO0O0(c18986OooO00o.f61821OooO00o, c21394OooOo0o2.OooO00o(), fArrOooO00o), c21391OooOo0.f61877OooO);
                return new C21391OooOo0(c21391OooOo0.f61827OooO00o, c21391OooOo0.f61882OooO0oo, c21394OooOo0o, fArrOooO0o0, c21391OooOo0.f61884OooOO0O, c21391OooOo0.f61887OooOOO0, c21391OooOo0.f61880OooO0o0, c21391OooOo0.f61879OooO0o, c21391OooOo0.f61881OooO0oO, -1);
            }
        }
        return abstractC21374OooO0OO;
    }

    public static final float[] OooO0O0(float[] rhs, float[] fArr, float[] fArr2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(rhs, "matrix");
        OooO0o(rhs, fArr);
        OooO0o(rhs, fArr2);
        float[] fArr3 = {fArr2[0] / fArr[0], fArr2[1] / fArr[1], fArr2[2] / fArr[2]};
        float[] fArrOooO0Oo = OooO0Oo(rhs);
        kotlin.jvm.internal.OooOOO0.OooO0oO(rhs, "rhs");
        float f = fArr3[0];
        float f2 = rhs[0] * f;
        float f3 = fArr3[1];
        float f4 = rhs[1] * f3;
        float f5 = fArr3[2];
        return OooO0o0(fArrOooO0Oo, new float[]{f2, f4, rhs[2] * f5, rhs[3] * f, rhs[4] * f3, rhs[5] * f5, f * rhs[6], f3 * rhs[7], f5 * rhs[8]});
    }

    public static final boolean OooO0OO(C21394OooOo0o a, C21394OooOo0o b) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(a, "a");
        kotlin.jvm.internal.OooOOO0.OooO0oO(b, "b");
        if (a == b) {
            return true;
        }
        return Math.abs(a.f61896OooO00o - b.f61896OooO00o) < 0.001f && Math.abs(a.f61897OooO0O0 - b.f61897OooO0O0) < 0.001f;
    }

    public static final float[] OooO0Oo(float[] m) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(m, "m");
        float f = m[0];
        float f2 = m[3];
        float f3 = m[6];
        float f4 = m[1];
        float f5 = m[4];
        float f6 = m[7];
        float f7 = m[2];
        float f8 = m[5];
        float f9 = m[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr = new float[m.length];
        fArr[0] = f10 / f13;
        fArr[1] = f11 / f13;
        fArr[2] = f12 / f13;
        fArr[3] = C20509OooO0oo.OooO0O0(f2, f9, f3 * f8, f13);
        fArr[4] = C20509OooO0oo.OooO0O0(f3, f7, f9 * f, f13);
        fArr[5] = C20509OooO0oo.OooO0O0(f, f8, f7 * f2, f13);
        fArr[6] = C20509OooO0oo.OooO0O0(f3, f5, f2 * f6, f13);
        fArr[7] = C20509OooO0oo.OooO0O0(f, f6, f3 * f4, f13);
        fArr[8] = C20509OooO0oo.OooO0O0(f2, f4, f * f5, f13);
        return fArr;
    }

    public static final void OooO0o(float[] lhs, float[] fArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(lhs, "lhs");
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        fArr[0] = (lhs[6] * f3) + (lhs[3] * f2) + (lhs[0] * f);
        fArr[1] = (lhs[7] * f3) + (lhs[4] * f2) + (lhs[1] * f);
        fArr[2] = (lhs[8] * f3) + (lhs[5] * f2) + (lhs[2] * f);
    }

    public static final float[] OooO0o0(float[] lhs, float[] rhs) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(lhs, "lhs");
        kotlin.jvm.internal.OooOOO0.OooO0oO(rhs, "rhs");
        float f = lhs[0];
        float f2 = rhs[0];
        float f3 = lhs[3];
        float f4 = rhs[1];
        float f5 = lhs[6];
        float f6 = rhs[2];
        float f7 = (f5 * f6) + (f3 * f4) + (f * f2);
        float f8 = lhs[1];
        float f9 = lhs[4];
        float f10 = lhs[7];
        float f11 = (f10 * f6) + (f9 * f4) + (f8 * f2);
        float f12 = lhs[2];
        float f13 = lhs[5];
        float f14 = lhs[8];
        float f15 = (f6 * f14) + (f4 * f13) + (f2 * f12);
        float f16 = rhs[3];
        float f17 = rhs[4];
        float f18 = rhs[5];
        float f19 = (f5 * f18) + (f3 * f17) + (f * f16);
        float f20 = (f10 * f18) + (f9 * f17) + (f8 * f16);
        float f21 = (f18 * f14) + (f17 * f13) + (f16 * f12);
        float f22 = rhs[6];
        float f23 = rhs[7];
        float f24 = rhs[8];
        return new float[]{f7, f11, f15, f19, f20, f21, (f5 * f24) + (f3 * f23) + (f * f22), (f10 * f24) + (f9 * f23) + (f8 * f22), (f14 * f24) + (f13 * f23) + (f12 * f22)};
    }

    public static final float OooO0oO(float f, float f2, float f3, float[] lhs) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(lhs, "lhs");
        return (lhs[6] * f3) + (lhs[3] * f2) + (lhs[0] * f);
    }

    public static final float OooO0oo(float f, float f2, float f3, float[] lhs) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(lhs, "lhs");
        return (lhs[7] * f3) + (lhs[4] * f2) + (lhs[1] * f);
    }
}
