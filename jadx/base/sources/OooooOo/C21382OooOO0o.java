package OooooOo;

import OooOo.C20496Oooo0o0;

/* JADX INFO: renamed from: OooooOo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21382OooOO0o extends AbstractC21374OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final float[] f61866OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final float[] f61867OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final float[] f61868OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final float[] f61869OooO0oO;

    static {
        float[] fArrOooO0o0 = C21375OooO0Oo.OooO0o0(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, C21375OooO0Oo.OooO0O0(AbstractC21372OooO00o.f61820OooO0O0.f61821OooO00o, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f61866OooO0Oo = fArrOooO0o0;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f61868OooO0o0 = fArr;
        f61867OooO0o = C21375OooO0Oo.OooO0Oo(fArrOooO0o0);
        f61869OooO0oO = C21375OooO0Oo.OooO0Oo(fArr);
    }

    @Override // OooooOo.AbstractC21374OooO0OO
    public final float[] OooO00o(float[] fArr) {
        C21375OooO0Oo.OooO0o(f61866OooO0Oo, fArr);
        double d = 0.33333334f;
        fArr[0] = Math.signum(fArr[0]) * ((float) Math.pow(Math.abs(fArr[0]), d));
        fArr[1] = Math.signum(fArr[1]) * ((float) Math.pow(Math.abs(fArr[1]), d));
        fArr[2] = Math.signum(fArr[2]) * ((float) Math.pow(Math.abs(fArr[2]), d));
        C21375OooO0Oo.OooO0o(f61868OooO0o0, fArr);
        return fArr;
    }

    @Override // OooooOo.AbstractC21374OooO0OO
    public final float OooO0O0(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // OooooOo.AbstractC21374OooO0OO
    public final float OooO0OO(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // OooooOo.AbstractC21374OooO0OO
    public final float[] OooO0o(float[] fArr) {
        fArr[0] = oO0O00oo.OooOO0.OooO0o0(fArr[0], 0.0f, 1.0f);
        fArr[1] = oO0O00oo.OooOO0.OooO0o0(fArr[1], -0.5f, 0.5f);
        fArr[2] = oO0O00oo.OooOO0.OooO0o0(fArr[2], -0.5f, 0.5f);
        C21375OooO0Oo.OooO0o(f61869OooO0oO, fArr);
        float f = fArr[0];
        fArr[0] = f * f * f;
        float f2 = fArr[1];
        fArr[1] = f2 * f2 * f2;
        float f3 = fArr[2];
        fArr[2] = f3 * f3 * f3;
        C21375OooO0Oo.OooO0o(f61867OooO0o, fArr);
        return fArr;
    }

    @Override // OooooOo.AbstractC21374OooO0OO
    public final long OooO0o0(float f, float f2, float f3) {
        float fOooO0o0 = oO0O00oo.OooOO0.OooO0o0(f, 0.0f, 1.0f);
        float fOooO0o02 = oO0O00oo.OooOO0.OooO0o0(f2, -0.5f, 0.5f);
        float fOooO0o03 = oO0O00oo.OooOO0.OooO0o0(f3, -0.5f, 0.5f);
        float[] fArr = f61869OooO0oO;
        float fOooO0oO = C21375OooO0Oo.OooO0oO(fOooO0o0, fOooO0o02, fOooO0o03, fArr);
        float fOooO0oo = C21375OooO0Oo.OooO0oo(fOooO0o0, fOooO0o02, fOooO0o03, fArr);
        float fOooO = C21375OooO0Oo.OooO(fOooO0o0, fOooO0o02, fOooO0o03, fArr);
        float f4 = fOooO0oO * fOooO0oO * fOooO0oO;
        float f5 = fOooO0oo * fOooO0oo * fOooO0oo;
        float f6 = fOooO * fOooO * fOooO;
        float[] fArr2 = f61867OooO0o;
        float fOooO0oO2 = C21375OooO0Oo.OooO0oO(f4, f5, f6, fArr2);
        float fOooO0oo2 = C21375OooO0Oo.OooO0oo(f4, f5, f6, fArr2);
        return (((long) Float.floatToIntBits(fOooO0oO2)) << 32) | (((long) Float.floatToIntBits(fOooO0oo2)) & 4294967295L);
    }

    @Override // OooooOo.AbstractC21374OooO0OO
    public final float OooO0oO(float f, float f2, float f3) {
        float fOooO0o0 = oO0O00oo.OooOO0.OooO0o0(f, 0.0f, 1.0f);
        float fOooO0o02 = oO0O00oo.OooOO0.OooO0o0(f2, -0.5f, 0.5f);
        float fOooO0o03 = oO0O00oo.OooOO0.OooO0o0(f3, -0.5f, 0.5f);
        float[] fArr = f61869OooO0oO;
        float fOooO0oO = C21375OooO0Oo.OooO0oO(fOooO0o0, fOooO0o02, fOooO0o03, fArr);
        float fOooO0oo = C21375OooO0Oo.OooO0oo(fOooO0o0, fOooO0o02, fOooO0o03, fArr);
        float fOooO = C21375OooO0Oo.OooO(fOooO0o0, fOooO0o02, fOooO0o03, fArr);
        return C21375OooO0Oo.OooO(fOooO0oO * fOooO0oO * fOooO0oO, fOooO0oo * fOooO0oo * fOooO0oo, fOooO * fOooO * fOooO, f61867OooO0o);
    }

    @Override // OooooOo.AbstractC21374OooO0OO
    public final long OooO0oo(float f, float f2, float f3, float f4, AbstractC21374OooO0OO colorSpace) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(colorSpace, "colorSpace");
        float[] fArr = f61866OooO0Oo;
        float fOooO0oO = C21375OooO0Oo.OooO0oO(f, f2, f3, fArr);
        float fOooO0oo = C21375OooO0Oo.OooO0oo(f, f2, f3, fArr);
        float fOooO = C21375OooO0Oo.OooO(f, f2, f3, fArr);
        double d = 0.33333334f;
        float fSignum = Math.signum(fOooO0oO) * ((float) Math.pow(Math.abs(fOooO0oO), d));
        float fSignum2 = Math.signum(fOooO0oo) * ((float) Math.pow(Math.abs(fOooO0oo), d));
        float fSignum3 = Math.signum(fOooO) * ((float) Math.pow(Math.abs(fOooO), d));
        float[] fArr2 = f61868OooO0o0;
        return C20496Oooo0o0.OooO00o(C21375OooO0Oo.OooO0oO(fSignum, fSignum2, fSignum3, fArr2), C21375OooO0Oo.OooO0oo(fSignum, fSignum2, fSignum3, fArr2), C21375OooO0Oo.OooO(fSignum, fSignum2, fSignum3, fArr2), f4, colorSpace);
    }
}
