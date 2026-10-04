package o000OOO;

import OooooO0.C21292OooO0oo;

/* JADX INFO: renamed from: o000OOO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24501OooOO0o extends OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final float[] f82851OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final float[] f82852OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final float[] f82853OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final float[] f82854OooO0oO;

    static {
        float[] fArrOooO0o = C24497OooO0Oo.OooO0o(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, C24497OooO0Oo.OooO0O0(OooO00o.f82818OooO0O0.f82819OooO00o, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f82851OooO0Oo = fArrOooO0o;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f82853OooO0o0 = fArr;
        f82852OooO0o = C24497OooO0Oo.OooO0o0(fArrOooO0o);
        f82854OooO0oO = C24497OooO0Oo.OooO0o0(fArr);
    }

    @Override // o000OOO.OooO0OO
    public final float[] OooO00o(float[] fArr) {
        C24497OooO0Oo.OooO0oO(f82851OooO0Oo, fArr);
        float f = fArr[0];
        long j = 3;
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / j)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        fArr[0] = f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
        float f3 = fArr[1];
        float fIntBitsToFloat2 = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f3)) & 8589934591L) / j)) + 709952852);
        float f4 = fIntBitsToFloat2 - ((fIntBitsToFloat2 - (f3 / (fIntBitsToFloat2 * fIntBitsToFloat2))) * 0.33333334f);
        fArr[1] = f4 - ((f4 - (f3 / (f4 * f4))) * 0.33333334f);
        float f5 = fArr[2];
        float fIntBitsToFloat3 = Float.intBitsToFloat(((int) ((8589934591L & ((long) Float.floatToRawIntBits(f5))) / j)) + 709952852);
        float f6 = fIntBitsToFloat3 - ((fIntBitsToFloat3 - (f5 / (fIntBitsToFloat3 * fIntBitsToFloat3))) * 0.33333334f);
        fArr[2] = f6 - ((f6 - (f5 / (f6 * f6))) * 0.33333334f);
        C24497OooO0Oo.OooO0oO(f82853OooO0o0, fArr);
        return fArr;
    }

    @Override // o000OOO.OooO0OO
    public final float OooO0O0(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // o000OOO.OooO0OO
    public final float OooO0OO(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // o000OOO.OooO0OO
    public final float[] OooO0o(float[] fArr) {
        float f = fArr[0];
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        fArr[0] = f;
        float f2 = fArr[1];
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        fArr[1] = f2;
        float f3 = fArr[2];
        float f4 = f3 >= -0.5f ? f3 : -0.5f;
        fArr[2] = f4 <= 0.5f ? f4 : 0.5f;
        C24497OooO0Oo.OooO0oO(f82854OooO0oO, fArr);
        float f5 = fArr[0];
        fArr[0] = f5 * f5 * f5;
        float f6 = fArr[1];
        fArr[1] = f6 * f6 * f6;
        float f7 = fArr[2];
        fArr[2] = f7 * f7 * f7;
        C24497OooO0Oo.OooO0oO(f82852OooO0o, fArr);
        return fArr;
    }

    @Override // o000OOO.OooO0OO
    public final long OooO0o0(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = f82854OooO0oO;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = f82852OooO0o;
        return (((long) Float.floatToRawIntBits((fArr2[7] * f10) + (fArr2[4] * f9) + (fArr2[1] * f8))) & 4294967295L) | (((long) Float.floatToRawIntBits((fArr2[6] * f10) + ((fArr2[3] * f9) + (fArr2[0] * f8)))) << 32);
    }

    @Override // o000OOO.OooO0OO
    public final float OooO0oO(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = f82854OooO0oO;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = f82852OooO0o;
        return (fArr2[8] * f10) + (fArr2[5] * f9) + (fArr2[2] * f8);
    }

    @Override // o000OOO.OooO0OO
    public final long OooO0oo(float f, float f2, float f3, float f4, OooO0OO colorSpace) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(colorSpace, "colorSpace");
        float[] fArr = f82851OooO0Oo;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        long j = 3;
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f5)) & 8589934591L) / j)) + 709952852);
        float f8 = fIntBitsToFloat - ((fIntBitsToFloat - (f5 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        float f9 = f8 - ((f8 - (f5 / (f8 * f8))) * 0.33333334f);
        float fIntBitsToFloat2 = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f6)) & 8589934591L) / j)) + 709952852);
        float f10 = fIntBitsToFloat2 - ((fIntBitsToFloat2 - (f6 / (fIntBitsToFloat2 * fIntBitsToFloat2))) * 0.33333334f);
        float f11 = f10 - ((f10 - (f6 / (f10 * f10))) * 0.33333334f);
        float fIntBitsToFloat3 = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f7)) & 8589934591L) / j)) + 709952852);
        float f12 = fIntBitsToFloat3 - ((fIntBitsToFloat3 - (f7 / (fIntBitsToFloat3 * fIntBitsToFloat3))) * 0.33333334f);
        float f13 = f12 - ((f12 - (f7 / (f12 * f12))) * 0.33333334f);
        float[] fArr2 = f82853OooO0o0;
        return C21292OooO0oo.OooO00o((fArr2[6] * f13) + (fArr2[3] * f11) + (fArr2[0] * f9), (fArr2[7] * f13) + (fArr2[4] * f11) + (fArr2[1] * f9), (fArr2[8] * f13) + (fArr2[5] * f11) + (fArr2[2] * f9), f4, colorSpace);
    }
}
