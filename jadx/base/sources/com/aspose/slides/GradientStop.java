package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: loaded from: classes3.dex */
public final class GradientStop extends PVIObject implements IGradientStop {

    /* JADX INFO: renamed from: k4 */
    private ColorFormat f2418k4;

    public GradientStop(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new C1218ho(0.0f, this.f2418k4);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: N_ */
    public void mo334N_() {
        this.f2418k4 = new ColorFormat(this);
    }

    @Override // com.aspose.slides.IGradientStop
    public final IColorFormat getColor() {
        m2146wl();
        return this.f2418k4;
    }

    @Override // com.aspose.slides.IGradientStop
    public final float getPosition() {
        if (m2138ix()) {
            return m1620x1().m7251k4();
        }
        return 0.0f;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m1620x1().m7255kk();
        }
        return 1L;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1618k4(GradientStop gradientStop) {
        if (m2138ix() || gradientStop.m2138ix()) {
            m2145uz();
            if (gradientStop.m2138ix()) {
                m1620x1().m7254k4(gradientStop.m1620x1());
            } else {
                m2140k4((Object) null);
            }
        }
    }

    @Override // com.aspose.slides.IGradientStop
    public final void setPosition(float f) {
        m2141k4(Float.valueOf(0.0f), Float.valueOf(f));
        if (m2138ix()) {
            m1620x1().m7252k4(f);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C1218ho m1620x1() {
        return (C1218ho) m2144u4();
    }

    public GradientStop(InterfaceC14397rj interfaceC14397rj, float f, int i) {
        super(interfaceC14397rj);
        m2146wl();
        ColorFormat colorFormat = new ColorFormat(this, i);
        this.f2418k4 = colorFormat;
        m2140k4(new C1218ho(f, colorFormat));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1619k4(IGradientStopEffectiveData iGradientStopEffectiveData) {
        m2145uz();
        m1620x1().m7253k4(iGradientStopEffectiveData);
    }

    public GradientStop(InterfaceC14397rj interfaceC14397rj, float f, int i, boolean z) {
        super(interfaceC14397rj);
        m2146wl();
        ColorFormat colorFormat = new ColorFormat(this, i, z);
        this.f2418k4 = colorFormat;
        m2140k4(new C1218ho(f, colorFormat));
    }

    public GradientStop(InterfaceC14397rj interfaceC14397rj, float f, C12003du c12003du) {
        super(interfaceC14397rj);
        m2146wl();
        ColorFormat colorFormat = new ColorFormat(this, c12003du.Clone());
        this.f2418k4 = colorFormat;
        m2140k4(new C1218ho(f, colorFormat));
    }
}
