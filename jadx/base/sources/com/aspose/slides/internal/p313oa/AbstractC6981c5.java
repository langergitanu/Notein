package com.aspose.slides.internal.p313oa;

import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.c5 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC6981c5 extends AbstractC7002u4 {

    /* JADX INFO: renamed from: k4 */
    protected float[] f18986k4 = null;

    /* JADX INFO: renamed from: k4 */
    private float m27314k4(float f, float f2, float f3, float f4, float f5) {
        float f6;
        float f7;
        if (f > f3) {
            if (f < f5) {
                if (f4 - f2 > 1.0E-5d) {
                    float f8 = (f2 + f4) / 2.0f;
                    float fMo27315k4 = mo27315k4(f8);
                    if (f <= fMo27315k4) {
                        f6 = f8;
                        f7 = fMo27315k4;
                        f8 = f2;
                        fMo27315k4 = f3;
                    } else {
                        f6 = f4;
                        f7 = f5;
                    }
                    return m27314k4(f, f8, fMo27315k4, f6, f7);
                }
                if (C14116yg.m67480k4(f - f3) < C14116yg.m67480k4(f5 - f)) {
                }
            }
            return f4;
        }
        return f2;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract float mo27315k4(float f);

    /* JADX INFO: renamed from: kk */
    public float[] m27318kk() {
        return this.f18986k4;
    }

    /* JADX INFO: renamed from: x1 */
    public float m27319x1(float f) {
        return m27314k4(f, 0.0f, mo27315k4(0.0f), 1.0f, mo27315k4(1.0f));
    }

    /* JADX INFO: renamed from: x1 */
    public abstract boolean mo27320x1();

    /* JADX INFO: renamed from: k4 */
    public void m27316k4() {
    }

    /* JADX INFO: renamed from: k4 */
    public void m27317k4(float[] fArr) {
        this.f18986k4 = fArr;
    }
}
