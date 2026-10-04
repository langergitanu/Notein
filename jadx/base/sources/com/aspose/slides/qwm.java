package com.aspose.slides;

import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14050ca;

/* JADX INFO: loaded from: classes3.dex */
final class qwm {

    /* JADX INFO: renamed from: k4 */
    private final float[] f48411k4;

    /* JADX INFO: renamed from: kk */
    private float f48412kk;

    /* JADX INFO: renamed from: to */
    private float f48413to;

    /* JADX INFO: renamed from: x1 */
    private final float[] f48414x1;

    public qwm(int i, C14050ca c14050ca) {
        this.f48411k4 = new float[i];
        this.f48414x1 = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f48411k4[i2] = (float) c14050ca.m66551x1();
        }
        float[] fArr = new float[i];
        int i3 = i / 30;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (i6 < i) {
                    float[] fArr2 = this.f48411k4;
                    fArr[i5] = (fArr2[i5] + fArr2[i6]) / 2.0f;
                    i5 = i6;
                }
            }
            int i7 = i - 1;
            float[] fArr3 = this.f48411k4;
            fArr[i7] = (fArr3[i - 2] + fArr3[i7]) / 2.0f;
            AbstractC14092to.m67220k4(AbstractC14092to.m67208k4(fArr), AbstractC14092to.m67208k4(this.f48411k4), i);
        }
        for (int i8 = 0; i8 < i; i8++) {
            float[] fArr4 = this.f48411k4;
            float f = fArr4[i8];
            float f2 = f * f;
            fArr4[i8] = f2;
            fArr4[i8] = f2 * f2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69781k4(float f) {
        float f2;
        if (f <= 0.5f) {
            this.f48412kk = f * 2.0f;
            f2 = 0.0f;
        } else {
            this.f48412kk = 1.0f;
            float f3 = (f * 2.0f) - 1.0f;
            f2 = f3 * f3;
        }
        this.f48413to = f2;
        int i = 0;
        while (true) {
            float[] fArr = this.f48414x1;
            if (i >= fArr.length) {
                return;
            }
            float f4 = this.f48413to;
            fArr[i] = ((this.f48412kk - f4) * this.f48411k4[i]) + f4;
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final float[] m69782k4() {
        return this.f48414x1;
    }
}
