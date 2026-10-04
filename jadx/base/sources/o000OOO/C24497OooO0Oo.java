package o000OOO;

import OooOoO.C20509OooO0oo;
import o000OOO.C24499OooO0oO;
import o000OOO.OooO00o;

/* JADX INFO: renamed from: o000OOO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24497OooO0Oo {
    public static OooO0OO OooO00o(OooO0OO oooO0OO) {
        C24505OooOOoo c24505OooOOoo = OooOO0.f82847OooO0O0;
        OooO00o.C19619OooO00o c19619OooO00o = OooO00o.f82818OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooO0OO, "<this>");
        if (OooO0O0.OooO00o(oooO0OO.f82826OooO0O0, OooO0O0.f82820OooO00o)) {
            C24504OooOOo0 c24504OooOOo0 = (C24504OooOOo0) oooO0OO;
            C24505OooOOoo c24505OooOOoo2 = c24504OooOOo0.f82868OooO0Oo;
            if (!OooO0OO(c24505OooOOoo2, c24505OooOOoo)) {
                float[] fArrOooO00o = c24505OooOOoo.OooO00o();
                float[] fArrOooO0o = OooO0o(OooO0O0(c19619OooO00o.f82819OooO00o, c24505OooOOoo2.OooO00o(), fArrOooO00o), c24504OooOOo0.f82867OooO);
                return new C24504OooOOo0(c24504OooOOo0.f82825OooO00o, c24504OooOOo0.f82872OooO0oo, c24505OooOOoo, fArrOooO0o, c24504OooOOo0.f82874OooOO0O, c24504OooOOo0.f82877OooOOO0, c24504OooOOo0.f82870OooO0o0, c24504OooOOo0.f82869OooO0o, c24504OooOOo0.f82871OooO0oO, -1);
            }
        }
        return oooO0OO;
    }

    public static final float[] OooO0O0(float[] rhs, float[] fArr, float[] fArr2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(rhs, "matrix");
        OooO0oO(rhs, fArr);
        OooO0oO(rhs, fArr2);
        float[] fArr3 = {fArr2[0] / fArr[0], fArr2[1] / fArr[1], fArr2[2] / fArr[2]};
        float[] fArrOooO0o0 = OooO0o0(rhs);
        kotlin.jvm.internal.OooOOO0.OooO0oO(rhs, "rhs");
        float f = fArr3[0];
        float f2 = rhs[0] * f;
        float f3 = fArr3[1];
        float f4 = rhs[1] * f3;
        float f5 = fArr3[2];
        return OooO0o(fArrOooO0o0, new float[]{f2, f4, rhs[2] * f5, rhs[3] * f, rhs[4] * f3, rhs[5] * f5, f * rhs[6], f3 * rhs[7], f5 * rhs[8]});
    }

    public static final boolean OooO0OO(C24505OooOOoo a, C24505OooOOoo b) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(a, "a");
        kotlin.jvm.internal.OooOOO0.OooO0oO(b, "b");
        if (a == b) {
            return true;
        }
        return Math.abs(a.f82879OooO00o - b.f82879OooO00o) < 0.001f && Math.abs(a.f82880OooO0O0 - b.f82880OooO0O0) < 0.001f;
    }

    public static final C24499OooO0oO OooO0Oo(OooO0OO oooO0OO, OooO0OO oooO0OO2) {
        if (oooO0OO == oooO0OO2) {
            return new OooO0o(oooO0OO, oooO0OO, 1);
        }
        long j = OooO0O0.f82820OooO00o;
        return (OooO0O0.OooO00o(oooO0OO.f82826OooO0O0, j) && OooO0O0.OooO00o(oooO0OO2.f82826OooO0O0, j)) ? new C24499OooO0oO.OooO00o((C24504OooOOo0) oooO0OO, (C24504OooOOo0) oooO0OO2) : new C24499OooO0oO(oooO0OO, oooO0OO2, 0);
    }

    public static final float[] OooO0o(float[] lhs, float[] rhs) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(lhs, "lhs");
        kotlin.jvm.internal.OooOOO0.OooO0oO(rhs, "rhs");
        float[] fArr = new float[9];
        if (lhs.length < 9 || rhs.length < 9) {
            return fArr;
        }
        float f = lhs[0] * rhs[0];
        float f2 = lhs[3];
        float f3 = rhs[1];
        float f4 = lhs[6];
        float f5 = rhs[2];
        fArr[0] = (f4 * f5) + (f2 * f3) + f;
        float f6 = lhs[1];
        float f7 = rhs[0];
        float f8 = lhs[4];
        float f9 = lhs[7];
        float f10 = f9 * f5;
        fArr[1] = f10 + (f3 * f8) + (f6 * f7);
        float f11 = lhs[2] * f7;
        float f12 = lhs[5];
        float f13 = (rhs[1] * f12) + f11;
        float f14 = lhs[8];
        fArr[2] = (f5 * f14) + f13;
        float f15 = lhs[0];
        float f16 = rhs[3] * f15;
        float f17 = rhs[4];
        float f18 = (f2 * f17) + f16;
        float f19 = rhs[5];
        fArr[3] = (f4 * f19) + f18;
        float f20 = lhs[1];
        float f21 = rhs[3];
        float f22 = f8 * f17;
        fArr[4] = (f9 * f19) + f22 + (f20 * f21);
        float f23 = lhs[2];
        float f24 = f19 * f14;
        fArr[5] = f24 + (f12 * rhs[4]) + (f21 * f23);
        float f25 = f15 * rhs[6];
        float f26 = lhs[3];
        float f27 = rhs[7];
        float f28 = (f26 * f27) + f25;
        float f29 = rhs[8];
        fArr[6] = (f4 * f29) + f28;
        float f30 = rhs[6];
        float f31 = f9 * f29;
        fArr[7] = f31 + (lhs[4] * f27) + (f20 * f30);
        float f32 = f14 * f29;
        fArr[8] = f32 + (lhs[5] * rhs[7]) + (f23 * f30);
        return fArr;
    }

    public static final float[] OooO0o0(float[] m) {
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

    public static final void OooO0oO(float[] lhs, float[] fArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(lhs, "lhs");
        if (lhs.length >= 9 && fArr.length >= 3) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            fArr[0] = (lhs[6] * f3) + (lhs[3] * f2) + (lhs[0] * f);
            fArr[1] = (lhs[7] * f3) + (lhs[4] * f2) + (lhs[1] * f);
            fArr[2] = (lhs[8] * f3) + (lhs[5] * f2) + (lhs[2] * f);
        }
    }
}
