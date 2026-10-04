package OooooOo;

import OooOo.C20496Oooo0o0;

/* JADX INFO: renamed from: OooooOo.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21390OooOo extends AbstractC21374OooO0OO {
    public static float OooO(float f) {
        return oO0O00oo.OooOO0.OooO0o0(f, -2.0f, 2.0f);
    }

    @Override // OooooOo.AbstractC21374OooO0OO
    public final float[] OooO00o(float[] fArr) {
        fArr[0] = OooO(fArr[0]);
        fArr[1] = OooO(fArr[1]);
        fArr[2] = OooO(fArr[2]);
        return fArr;
    }

    @Override // OooooOo.AbstractC21374OooO0OO
    public final float OooO0O0(int i) {
        return 2.0f;
    }

    @Override // OooooOo.AbstractC21374OooO0OO
    public final float OooO0OO(int i) {
        return -2.0f;
    }

    @Override // OooooOo.AbstractC21374OooO0OO
    public final float[] OooO0o(float[] fArr) {
        fArr[0] = OooO(fArr[0]);
        fArr[1] = OooO(fArr[1]);
        fArr[2] = OooO(fArr[2]);
        return fArr;
    }

    @Override // OooooOo.AbstractC21374OooO0OO
    public final long OooO0o0(float f, float f2, float f3) {
        float fOooO = OooO(f);
        return (((long) Float.floatToIntBits(OooO(f2))) & 4294967295L) | (Float.floatToIntBits(fOooO) << 32);
    }

    @Override // OooooOo.AbstractC21374OooO0OO
    public final float OooO0oO(float f, float f2, float f3) {
        return OooO(f3);
    }

    @Override // OooooOo.AbstractC21374OooO0OO
    public final long OooO0oo(float f, float f2, float f3, float f4, AbstractC21374OooO0OO colorSpace) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(colorSpace, "colorSpace");
        return C20496Oooo0o0.OooO00o(OooO(f), OooO(f2), OooO(f3), f4, colorSpace);
    }
}
