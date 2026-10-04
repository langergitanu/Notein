package com.aspose.slides;

/* JADX INFO: renamed from: com.aspose.slides.bv */
/* JADX INFO: loaded from: classes3.dex */
class C0832bv {
    /* JADX INFO: renamed from: k4 */
    public static float m4322k4(float f, float f2) {
        return m4323k4(f, 0.27f, 48.0f, f < 24.0f ? 1.7f : ((f < 24.0f || f > 48.0f) && f > 48.0f && f <= 96.0f) ? 1.55f : 1.6f) * f2;
    }

    /* JADX INFO: renamed from: k4 */
    public static float m4323k4(float f, float f2, float f3, float f4) {
        if (f < f3) {
            while (true) {
                float f5 = f2 / f4;
                f3 /= 2.0f;
                if (f3 <= f) {
                    return (((f2 - f5) / f3) * (f - f3)) + f5;
                }
                f2 = f5;
            }
        } else {
            if (f <= f3) {
                return f2;
            }
            while (true) {
                float f6 = f2 * f4;
                float f7 = f3 * 2.0f;
                if (f7 >= f) {
                    return (((f6 - f2) / (f7 - f3)) * (f - f3)) + f2;
                }
                f2 = f6;
                f3 = f7;
            }
        }
    }
}
