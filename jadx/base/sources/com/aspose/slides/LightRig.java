package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7018k4;

/* JADX INFO: loaded from: classes3.dex */
public final class LightRig extends PVIObject implements ILightRig {

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<mrw> f2603k4;

    /* JADX INFO: renamed from: x1 */
    private mrw f2604x1;

    public LightRig(ThreeDFormat threeDFormat) {
        super(threeDFormat);
        this.f2603k4 = new AbstractC7018k4<mrw>() { // from class: com.aspose.slides.LightRig.1
            {
                LightRig.this.f2604x1 = new mrw() { // from class: com.aspose.slides.LightRig.1.1
                    @Override // com.aspose.slides.mrw
                    /* JADX INFO: renamed from: k4 */
                    public void mo1873k4() {
                        for (mrw mrwVar : ((AbstractC7018k4) C04791.this).f19081x1) {
                            if (mrwVar != null) {
                                mrwVar.mo1873k4();
                            }
                        }
                    }
                };
            }
        };
    }

    /* JADX INFO: renamed from: m9 */
    private void m1864m9() {
        mrw mrwVar = this.f2604x1;
        if (mrwVar == null || this.f2603k4.m27430k4()) {
            return;
        }
        mrwVar.mo1873k4();
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new t8i();
    }

    /* JADX INFO: renamed from: du */
    public final float[] m1865du() {
        if (m2138ix()) {
            return m1871x1().m71006to();
        }
        return null;
    }

    @Override // com.aspose.slides.ILightRig
    public final int getDirection() {
        if (m2138ix()) {
            return m1871x1().m70998k4();
        }
        return -1;
    }

    @Override // com.aspose.slides.ILightRig
    public final int getLightType() {
        if (m2138ix()) {
            return m1871x1().m71007x1();
        }
        return -1;
    }

    @Override // com.aspose.slides.ILightRig
    public final float[] getRotation() {
        if (m2138ix()) {
            return m1871x1().m71004kk();
        }
        return null;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m1871x1().m71005m9();
        }
        return 1L;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m1866h4() {
        if (m2138ix()) {
            m2145uz();
            m1871x1().m70996du();
            m1864m9();
        }
    }

    @Override // com.aspose.slides.ILightRig
    public final void setDirection(int i) {
        m2141k4((Integer) (-1), Integer.valueOf(i));
        if (m2138ix()) {
            m1871x1().m71000k4(i);
            m1864m9();
        }
    }

    @Override // com.aspose.slides.ILightRig
    public final void setLightType(int i) {
        m2141k4((Integer) (-1), Integer.valueOf(i));
        if (m2138ix()) {
            m1871x1().m71008x1(i);
            m1864m9();
        }
    }

    @Override // com.aspose.slides.ILightRig
    public final void setRotation(float f, float f2, float f3) {
        if (!m2138ix() && f == 0.0f && f2 == 0.0f && f3 == 0.0f) {
            return;
        }
        m2145uz();
        m1871x1().m70999k4(f, f2, f3);
        m1864m9();
    }

    /* JADX INFO: renamed from: to */
    public final boolean m1870to() {
        if (m2138ix()) {
            return m1871x1().m70997h4();
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public final t8i m1871x1() {
        return (t8i) m2144u4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1867k4(ILightRigEffectiveData iLightRigEffectiveData) {
        m2145uz();
        m1871x1().m71002k4(iLightRigEffectiveData);
        m1864m9();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1868k4(LightRig lightRig) {
        if (m2138ix() || lightRig.m2138ix()) {
            m2145uz();
            m1871x1().m71001k4(lightRig);
            m1864m9();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1869k4(boolean z) {
        m2141k4(Boolean.FALSE, Boolean.valueOf(z));
        if (m2138ix()) {
            m1871x1().m71003k4(z);
            m1864m9();
        }
    }
}
