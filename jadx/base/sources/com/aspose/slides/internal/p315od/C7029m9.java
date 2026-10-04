package com.aspose.slides.internal.p315od;

/* JADX INFO: renamed from: com.aspose.slides.internal.od.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C7029m9 {
    /* JADX INFO: renamed from: k4 */
    public float[] m27482k4(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        if (f5 == 0.0f && f6 == 0.0f) {
            f5 = 1.0f;
        }
        return new float[]{f5, f6, f5, f6};
    }

    /* JADX INFO: renamed from: k4 */
    public float[] m27483k4(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f3 - f;
        float f8 = f4 - f2;
        float f9 = f5 - f3;
        float f10 = f6 - f4;
        if ((f7 == 0.0f && f8 == 0.0f) || (f9 == 0.0f && f10 == 0.0f)) {
            f7 = f5 - f;
            f8 = f6 - f2;
            f9 = f7;
            f10 = f8;
        }
        return (f7 == 0.0f && f8 == 0.0f) ? m27482k4(f, f2, f, f2) : new float[]{f7, f8, f9, f10};
    }

    /* JADX INFO: renamed from: k4 */
    public float[] m27484k4(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = f3 - f;
        float f10 = f4 - f2;
        float f11 = f7 - f5;
        float f12 = f8 - f6;
        boolean z = f9 == 0.0f && f10 == 0.0f;
        boolean z2 = f11 == 0.0f && f12 == 0.0f;
        if (z) {
            f9 = f5 - f;
            f10 = f6 - f2;
            if (f9 == 0.0f && f10 == 0.0f) {
                f9 = f7 - f;
                f10 = f8 - f2;
            }
        }
        if (z2) {
            f11 = f7 - f3;
            f12 = f8 - f4;
            if (f11 == 0.0f && f12 == 0.0f) {
                f11 = f7 - f;
                f12 = f8 - f2;
            }
        }
        return (f9 == 0.0f && f10 == 0.0f) ? m27482k4(f, f2, f, f2) : new float[]{f9, f10, f11, f12};
    }
}
