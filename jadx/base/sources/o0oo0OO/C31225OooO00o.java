package o0oo0OO;

/* JADX INFO: renamed from: o0oo0OO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31225OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static float f111349OooO00o = 1.2f;

    public static void OooO00o(float[] fArr, float[] fArr2, int i, int i2, float f, boolean[] zArr) {
        double dHypot;
        int i3 = i + 1;
        if (i2 <= i3) {
            return;
        }
        float f2 = fArr[i];
        float f3 = fArr2[i];
        float f4 = fArr[i2];
        float f5 = fArr2[i2];
        float f6 = -1.0f;
        int i4 = -1;
        while (i3 < i2) {
            float f7 = fArr[i3];
            float f8 = fArr2[i3];
            float f9 = f4 - f2;
            float f10 = f5 - f3;
            if (f9 == 0.0f && f10 == 0.0f) {
                dHypot = Math.hypot(f7 - f2, f8 - f3);
            } else {
                float f11 = f7 - f2;
                float f12 = f8 - f3;
                float f13 = ((f12 * f10) + (f11 * f9)) / ((f10 * f10) + (f9 * f9));
                if (f13 < 0.0f) {
                    dHypot = Math.hypot(f11, f12);
                } else if (f13 > 1.0f) {
                    dHypot = Math.hypot(f7 - f4, f8 - f5);
                } else {
                    dHypot = Math.hypot(f7 - ((f9 * f13) + f2), f8 - ((f13 * f10) + f3));
                }
            }
            float f14 = (float) dHypot;
            if (f14 > f6) {
                i4 = i3;
                f6 = f14;
            }
            i3++;
        }
        if (f6 <= f || i4 == -1) {
            return;
        }
        zArr[i4] = true;
        OooO00o(fArr, fArr2, i, i4, f, zArr);
        OooO00o(fArr, fArr2, i4, i2, f, zArr);
    }
}
