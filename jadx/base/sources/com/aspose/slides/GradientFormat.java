package com.aspose.slides;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: loaded from: classes3.dex */
public final class GradientFormat extends PVIObject implements IGradientFormat {

    /* JADX INFO: renamed from: k4 */
    static final ohe f2410k4 = new ohe(oju.f47834kk.Clone(), oju.f47835to.Clone());

    /* JADX INFO: renamed from: du */
    private bia f2411du;

    /* JADX INFO: renamed from: kk */
    private AbstractC0923e1 f2412kk;

    /* JADX INFO: renamed from: to */
    private GradientStopCollection f2413to;

    /* JADX INFO: renamed from: x1 */
    final AbstractC7018k4<AbstractC0923e1> f2414x1;

    public GradientFormat(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f2414x1 = new AbstractC7018k4<AbstractC0923e1>() { // from class: com.aspose.slides.GradientFormat.1
            {
                GradientFormat.this.f2412kk = new AbstractC0923e1() { // from class: com.aspose.slides.GradientFormat.1.1
                    @Override // com.aspose.slides.AbstractC0923e1
                    /* JADX INFO: renamed from: k4 */
                    public void mo1464k4() {
                        for (AbstractC0923e1 abstractC0923e1 : ((AbstractC7018k4) C04361.this).f19081x1) {
                            if (abstractC0923e1 != null) {
                                abstractC0923e1.mo1464k4();
                            }
                        }
                    }
                };
            }
        };
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new C0929e7(this.f2413to, this.f2411du);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: N_ */
    public void mo334N_() {
        this.f2413to = new GradientStopCollection(this);
        this.f2411du = new bia();
        this.f2413to.f2419k4.mo27432x1(new AbstractC1155go() { // from class: com.aspose.slides.GradientFormat.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.GradientFormat.OnGradientFormatChanged()";
            }

            @Override // com.aspose.slides.AbstractC1155go
            /* JADX INFO: renamed from: k4 */
            public void mo1617k4() {
                GradientFormat.this.m1612m9();
            }
        });
    }

    /* JADX INFO: renamed from: du */
    public final void m1604du() {
        m1611k4(true);
    }

    @Override // com.aspose.slides.IGradientFormat
    public final int getGradientDirection() {
        if (m2138ix()) {
            return m1614x1().m5371kk();
        }
        return -1;
    }

    @Override // com.aspose.slides.IGradientFormat
    public final byte getGradientShape() {
        if (m2138ix()) {
            return m1614x1().m5361h4();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.IGradientFormat
    public final IGradientStopCollection getGradientStops() {
        m2146wl();
        return this.f2413to;
    }

    @Override // com.aspose.slides.IGradientFormat
    public final float getLinearGradientAngle() {
        if (m2138ix()) {
            return m1614x1().m5373to();
        }
        return Float.NaN;
    }

    @Override // com.aspose.slides.IGradientFormat
    public final byte getLinearGradientScaled() {
        if (m2138ix()) {
            return m1614x1().m5360du();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.IGradientFormat
    public final int getTileFlip() {
        if (m2138ix()) {
            return m1614x1().m5374x1();
        }
        return -1;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m1614x1().m5372m9();
        }
        return 1L;
    }

    /* JADX INFO: renamed from: h4 */
    public final ohe m1605h4() {
        return m2138ix() ? m1614x1().m5363k4() : f2410k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final SortedList<Float, C12003du> m1606k4(IBaseSlide iBaseSlide) {
        if (m2138ix()) {
            return m1614x1().m5362k4(iBaseSlide);
        }
        return null;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m1612m9() {
        AbstractC0923e1 abstractC0923e1 = this.f2412kk;
        if (abstractC0923e1 != null) {
            abstractC0923e1.mo1464k4();
        }
    }

    @Override // com.aspose.slides.IGradientFormat
    public final void setGradientDirection(int i) {
        m2141k4((Integer) (-1), Integer.valueOf(i));
        if (m2138ix()) {
            m1614x1().m5376x1(i);
        }
    }

    @Override // com.aspose.slides.IGradientFormat
    public final void setGradientShape(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m1614x1().m5375x1(b);
        }
    }

    @Override // com.aspose.slides.IGradientFormat
    public final void setLinearGradientAngle(float f) {
        m2141k4(Float.valueOf(Float.NaN), Float.valueOf(f));
        if (m2138ix()) {
            m1614x1().m5365k4(f);
        }
    }

    @Override // com.aspose.slides.IGradientFormat
    public final void setLinearGradientScaled(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m1614x1().m5364k4(b);
        }
    }

    @Override // com.aspose.slides.IGradientFormat
    public final void setTileFlip(int i) {
        m2141k4((Integer) (-1), Integer.valueOf(i));
        if (m2138ix()) {
            m1614x1().m5366k4(i);
        }
    }

    /* JADX INFO: renamed from: to */
    public final bia m1613to() {
        m2146wl();
        return this.f2411du;
    }

    /* JADX INFO: renamed from: x1 */
    public final C0929e7 m1614x1() {
        return (C0929e7) m2144u4();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1615x1(GradientFormat gradientFormat) {
        if (m2138ix() || gradientFormat.m2138ix()) {
            m2145uz();
            if (gradientFormat.m2138ix()) {
                m1614x1().m5367k4(gradientFormat);
            } else {
                m2140k4((Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1607k4(float f, float f2, float f3, float f4) {
        if (!m2138ix() && f == 0.0f && f2 == 0.0f && f3 == 1.0f && f4 == 1.0f) {
            return;
        }
        m2145uz();
        m1614x1().m5370k4(new ohe(f, f2, f3, f4));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1608k4(GradientFormat gradientFormat) {
        if (m2138ix() || gradientFormat.m2138ix()) {
            m2145uz();
            if (gradientFormat.m2138ix()) {
                m1614x1().m5367k4(gradientFormat);
            } else {
                m2140k4((Object) null);
            }
            m1612m9();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1609k4(IGradientFormatEffectiveData iGradientFormatEffectiveData) {
        m2145uz();
        m1614x1().m5368k4(iGradientFormatEffectiveData);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1610k4(IGradientStopCollection iGradientStopCollection) {
        this.f2413to = (GradientStopCollection) iGradientStopCollection;
        if (m2138ix()) {
            m1614x1().m5369k4(iGradientStopCollection);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1611k4(boolean z) {
        if (m2138ix()) {
            m2145uz();
            m2140k4((Object) null);
            if (z) {
                m1612m9();
            }
        }
    }
}
