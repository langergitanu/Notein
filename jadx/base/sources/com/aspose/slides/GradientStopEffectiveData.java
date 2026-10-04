package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
public class GradientStopEffectiveData implements IGradientStopEffectiveData, InterfaceC14672vc {

    /* JADX INFO: renamed from: k4 */
    C14811xp f2425k4;

    /* JADX INFO: renamed from: x1 */
    private float f2426x1;

    public GradientStopEffectiveData(float f, ColorFormat colorFormat) {
        this.f2426x1 = f;
        this.f2425k4 = new C14811xp(colorFormat);
    }

    public boolean equals(Object obj) {
        GradientStopEffectiveData gradientStopEffectiveData = (GradientStopEffectiveData) C7019kk.m27452k4(obj, GradientStopEffectiveData.class);
        if (gradientStopEffectiveData == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C3085sv.m13089k4(this.f2426x1, gradientStopEffectiveData.f2426x1) && C3085sv.m13090k4(this.f2425k4, gradientStopEffectiveData.f2425k4);
    }

    @Override // com.aspose.slides.IGradientStopEffectiveData
    public final Integer getColor() {
        return (Integer) C12003du.m56473x1(m1634k4());
    }

    @Override // com.aspose.slides.IGradientStopEffectiveData
    public final float getPosition() {
        return this.f2426x1;
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public C12003du m1634k4() {
        return this.f2425k4.m73522k4();
    }

    public GradientStopEffectiveData(GradientStopEffectiveData gradientStopEffectiveData) {
        this.f2426x1 = gradientStopEffectiveData.f2426x1;
        this.f2425k4 = new C14811xp(gradientStopEffectiveData.f2425k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1635k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        this.f2425k4.m73524k4(iBaseSlide, dm6Var);
    }
}
