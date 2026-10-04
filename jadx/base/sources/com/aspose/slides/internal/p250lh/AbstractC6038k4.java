package com.aspose.slides.internal.p250lh;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.lh.k4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6038k4 {
    /* JADX INFO: renamed from: k4 */
    public static List<float[]> m24375k4(float f, float f2, float f3) {
        List<float[]> list = new List<>();
        float f4 = f2 + f;
        float f5 = (-0.41421357f) * f;
        float f6 = f5 + f3;
        float f7 = 0.70710677f * f;
        float f8 = f7 + f2;
        float f9 = (-0.70710677f) * f;
        float f10 = f9 + f3;
        list.addItem(m24377k4(new float[]{f4, f3, f4, f6, f8, f10}));
        float f11 = 0.41421357f * f;
        float f12 = f11 + f2;
        float f13 = -f;
        float f14 = f13 + f3;
        list.addItem(m24377k4(new float[]{f8, f10, f12, f14, f2, f14}));
        float f15 = f5 + f2;
        float f16 = f9 + f2;
        list.addItem(m24377k4(new float[]{f2, f14, f15, f14, f16, f10}));
        float f17 = f13 + f2;
        list.addItem(m24377k4(new float[]{f16, f10, f17, f6, f17, f3}));
        float f18 = f11 + f3;
        float f19 = f7 + f3;
        list.addItem(m24377k4(new float[]{f17, f3, f17, f18, f16, f19}));
        float f20 = f + f3;
        list.addItem(m24377k4(new float[]{f16, f19, f15, f20, f2, f20}));
        list.addItem(m24377k4(new float[]{f2, f20, f12, f20, f8, f19}));
        list.addItem(m24377k4(new float[]{f8, f19, f4, f18, f4, f3}));
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    public static List<float[]> m24376k4(float f, float f2, float f3, float f4) {
        float f5 = f3 / 2.0f;
        float f6 = f + f5;
        float f7 = f4 / 2.0f;
        float f8 = f2 + f7;
        float f9 = f5 * 0.5522848f;
        float f10 = 0.5522848f * f7;
        float f11 = f6 + f5;
        float f12 = f8 + f7;
        List<float[]> list = new List<>();
        float f13 = f6 - f5;
        float f14 = f8 - f10;
        float f15 = f6 - f9;
        float f16 = f8 - f7;
        list.addItem(new float[]{f13, f8, f13, f14, f15, f16, f6, f16});
        float f17 = f9 + f6;
        list.addItem(new float[]{f6, f16, f17, f16, f11, f14, f11, f8});
        float f18 = f10 + f8;
        list.addItem(new float[]{f11, f8, f11, f18, f17, f12, f6, f12});
        list.addItem(new float[]{f6, f12, f15, f12, f13, f18, f13, f8});
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    public static float[] m24377k4(float[] fArr) {
        if (fArr.length != 6) {
            return new float[0];
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        return new float[]{f, f2, (f3 * 0.6666667f) + (f * 0.33333334f), (f4 * 0.6666667f) + (f2 * 0.33333334f), (f5 * 0.33333334f) + (f3 * 0.6666667f), (0.33333334f * f6) + (f4 * 0.6666667f), f5, f6};
    }
}
