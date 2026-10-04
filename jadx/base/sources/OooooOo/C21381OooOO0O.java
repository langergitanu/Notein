package OooooOo;

import OooOo.C20496Oooo0o0;

/* JADX INFO: renamed from: OooooOo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21381OooOO0O extends AbstractC21374OooO0OO {
    @Override // OooooOo.AbstractC21374OooO0OO
    public final float[] OooO00o(float[] fArr) {
        float f = fArr[0];
        float[] fArr2 = C21380OooOO0.f61865OooO0o0;
        float f2 = f / fArr2[0];
        float f3 = fArr[1] / fArr2[1];
        float f4 = fArr[2] / fArr2[2];
        float fPow = f2 > 0.008856452f ? (float) Math.pow(f2, 0.33333334f) : (f2 * 7.787037f) + 0.13793103f;
        float fPow2 = f3 > 0.008856452f ? (float) Math.pow(f3, 0.33333334f) : (f3 * 7.787037f) + 0.13793103f;
        float fPow3 = f4 > 0.008856452f ? (float) Math.pow(f4, 0.33333334f) : (f4 * 7.787037f) + 0.13793103f;
        fArr[0] = oO0O00oo.OooOO0.OooO0o0((116.0f * fPow2) - 16.0f, 0.0f, 100.0f);
        fArr[1] = oO0O00oo.OooOO0.OooO0o0((fPow - fPow2) * 500.0f, -128.0f, 128.0f);
        fArr[2] = oO0O00oo.OooOO0.OooO0o0((fPow2 - fPow3) * 200.0f, -128.0f, 128.0f);
        return fArr;
    }

    @Override // OooooOo.AbstractC21374OooO0OO
    public final float OooO0O0(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    @Override // OooooOo.AbstractC21374OooO0OO
    public final float OooO0OO(int i) {
        return i == 0 ? 0.0f : -128.0f;
    }

    @Override // OooooOo.AbstractC21374OooO0OO
    public final float[] OooO0o(float[] fArr) {
        fArr[0] = oO0O00oo.OooOO0.OooO0o0(fArr[0], 0.0f, 100.0f);
        fArr[1] = oO0O00oo.OooOO0.OooO0o0(fArr[1], -128.0f, 128.0f);
        float fOooO0o0 = oO0O00oo.OooOO0.OooO0o0(fArr[2], -128.0f, 128.0f);
        fArr[2] = fOooO0o0;
        float f = (fArr[0] + 16.0f) / 116.0f;
        float f2 = (fArr[1] * 0.002f) + f;
        float f3 = f - (fOooO0o0 * 0.005f);
        float f4 = f2 > 0.20689656f ? f2 * f2 * f2 : (f2 - 0.13793103f) * 0.12841855f;
        float f5 = f > 0.20689656f ? f * f * f : (f - 0.13793103f) * 0.12841855f;
        float f6 = f3 > 0.20689656f ? f3 * f3 * f3 : (f3 - 0.13793103f) * 0.12841855f;
        float[] fArr2 = C21380OooOO0.f61865OooO0o0;
        fArr[0] = f4 * fArr2[0];
        fArr[1] = f5 * fArr2[1];
        fArr[2] = f6 * fArr2[2];
        return fArr;
    }

    @Override // OooooOo.AbstractC21374OooO0OO
    public final long OooO0o0(float f, float f2, float f3) {
        float fOooO0o0 = (oO0O00oo.OooOO0.OooO0o0(f, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float fOooO0o02 = (oO0O00oo.OooOO0.OooO0o0(f, -128.0f, 128.0f) * 0.002f) + fOooO0o0;
        float f4 = fOooO0o02 > 0.20689656f ? fOooO0o02 * fOooO0o02 * fOooO0o02 : (fOooO0o02 - 0.13793103f) * 0.12841855f;
        float f5 = fOooO0o0 > 0.20689656f ? fOooO0o0 * fOooO0o0 * fOooO0o0 : (fOooO0o0 - 0.13793103f) * 0.12841855f;
        float[] fArr = C21380OooOO0.f61865OooO0o0;
        return (((long) Float.floatToIntBits(f4 * fArr[0])) << 32) | (((long) Float.floatToIntBits(f5 * fArr[1])) & 4294967295L);
    }

    @Override // OooooOo.AbstractC21374OooO0OO
    public final float OooO0oO(float f, float f2, float f3) {
        float fOooO0o0 = ((oO0O00oo.OooOO0.OooO0o0(f, 0.0f, 100.0f) + 16.0f) / 116.0f) - (oO0O00oo.OooOO0.OooO0o0(f3, -128.0f, 128.0f) * 0.005f);
        return (fOooO0o0 > 0.20689656f ? fOooO0o0 * fOooO0o0 * fOooO0o0 : 0.12841855f * (fOooO0o0 - 0.13793103f)) * C21380OooOO0.f61865OooO0o0[2];
    }

    @Override // OooooOo.AbstractC21374OooO0OO
    public final long OooO0oo(float f, float f2, float f3, float f4, AbstractC21374OooO0OO colorSpace) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(colorSpace, "colorSpace");
        float[] fArr = C21380OooOO0.f61865OooO0o0;
        float f5 = f / fArr[0];
        float f6 = f2 / fArr[1];
        float f7 = f3 / fArr[2];
        float fPow = f5 > 0.008856452f ? (float) Math.pow(f5, 0.33333334f) : (f5 * 7.787037f) + 0.13793103f;
        float fPow2 = f6 > 0.008856452f ? (float) Math.pow(f6, 0.33333334f) : (f6 * 7.787037f) + 0.13793103f;
        return C20496Oooo0o0.OooO00o(oO0O00oo.OooOO0.OooO0o0((116.0f * fPow2) - 16.0f, 0.0f, 100.0f), oO0O00oo.OooOO0.OooO0o0((fPow - fPow2) * 500.0f, -128.0f, 128.0f), oO0O00oo.OooOO0.OooO0o0((fPow2 - (f7 > 0.008856452f ? (float) Math.pow(f7, 0.33333334f) : (f7 * 7.787037f) + 0.13793103f)) * 200.0f, -128.0f, 128.0f), f4, colorSpace);
    }
}
