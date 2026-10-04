package com.aspose.slides.internal.p077d8;

import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.kp */
/* JADX INFO: loaded from: classes3.dex */
public final class C3067kp {

    /* JADX INFO: renamed from: k4 */
    public float f9107k4;

    /* JADX INFO: renamed from: kk */
    public float f9108kk;

    /* JADX INFO: renamed from: x1 */
    public float f9109x1;

    public C3067kp(float f, float f2, float f3) {
        this.f9107k4 = f;
        this.f9109x1 = f2;
        this.f9108kk = f3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3067kp.class == obj.getClass()) {
            C3067kp c3067kp = (C3067kp) obj;
            if (Float.compare(c3067kp.f9107k4, this.f9107k4) == 0 && Float.compare(c3067kp.f9109x1, this.f9109x1) == 0 && Float.compare(c3067kp.f9108kk, this.f9108kk) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Float.valueOf(this.f9107k4), Float.valueOf(this.f9109x1), Float.valueOf(this.f9108kk));
    }

    /* JADX INFO: renamed from: k4 */
    public float m12960k4() {
        float f = this.f9107k4;
        float f2 = this.f9109x1;
        float f3 = (f2 * f2) + (f * f);
        float f4 = this.f9108kk;
        return (float) C14116yg.m67496rv((f4 * f4) + f3);
    }

    /* JADX INFO: renamed from: x1 */
    public void m12961x1() {
        float fM12960k4 = m12960k4();
        if (fM12960k4 != 0.0f) {
            this.f9107k4 /= fM12960k4;
            this.f9109x1 /= fM12960k4;
            this.f9108kk /= fM12960k4;
        }
    }
}
