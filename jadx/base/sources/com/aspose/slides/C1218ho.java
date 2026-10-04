package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.ho */
/* JADX INFO: loaded from: classes3.dex */
final class C1218ho {

    /* JADX INFO: renamed from: k4 */
    private float f5551k4;

    /* JADX INFO: renamed from: kk */
    private long f5552kk;

    /* JADX INFO: renamed from: x1 */
    private final ColorFormat f5553x1;

    public C1218ho(float f, ColorFormat colorFormat) {
        this.f5553x1 = colorFormat;
        m7252k4(f);
    }

    /* JADX INFO: renamed from: to */
    private void m7250to() {
        this.f5552kk++;
    }

    public boolean equals(Object obj) {
        IGradientStop iGradientStop = (IGradientStop) C7019kk.m27452k4(obj, IGradientStop.class);
        if (iGradientStop == null) {
            return super.equals(obj);
        }
        if (this.f5551k4 != iGradientStop.getPosition()) {
            return false;
        }
        return this.f5553x1.equals(iGradientStop.getColor());
    }

    public int hashCode() {
        return 23456;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m7251k4() {
        return this.f5551k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m7255kk() {
        return ((this.f5552kk & 4294967295L) + (this.f5553x1.getVersion() & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: x1 */
    public final IColorFormat m7256x1() {
        return this.f5553x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7252k4(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.f5551k4 = f;
        m7250to();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m7257x1(C1218ho c1218ho) {
        this.f5551k4 = c1218ho.m7251k4();
        this.f5553x1.m1079k4((ColorFormat) c1218ho.m7256x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7253k4(IGradientStopEffectiveData iGradientStopEffectiveData) {
        this.f5551k4 = iGradientStopEffectiveData.getPosition();
        this.f5553x1.m1089x1(((GradientStopEffectiveData) iGradientStopEffectiveData).m1634k4().Clone());
        m7250to();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7254k4(C1218ho c1218ho) {
        m7257x1(c1218ho);
        m7250to();
    }
}
