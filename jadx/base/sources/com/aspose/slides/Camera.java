package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: loaded from: classes3.dex */
public final class Camera extends PVIObject implements ICamera {

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC0902di> f1245k4;

    /* JADX INFO: renamed from: kk */
    private C1123fw f1246kk;

    /* JADX INFO: renamed from: x1 */
    private AbstractC0902di f1247x1;

    public Camera(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f1245k4 = new AbstractC7018k4<AbstractC0902di>() { // from class: com.aspose.slides.Camera.1
            {
                Camera.this.f1247x1 = new AbstractC0902di() { // from class: com.aspose.slides.Camera.1.1
                    @Override // com.aspose.slides.AbstractC0902di
                    /* JADX INFO: renamed from: k4 */
                    public void mo456k4() {
                        for (AbstractC0902di abstractC0902di : ((AbstractC7018k4) C02251.this).f19081x1) {
                            if (abstractC0902di != null) {
                                abstractC0902di.mo456k4();
                            }
                        }
                    }
                };
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m9 */
    public void m448m9() {
        AbstractC0902di abstractC0902di = this.f1247x1;
        if (abstractC0902di == null || this.f1245k4.m27430k4()) {
            return;
        }
        abstractC0902di.mo456k4();
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new C14267p5(this.f1246kk);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: N_ */
    public void mo334N_() {
        C1123fw c1123fw = new C1123fw(this);
        this.f1246kk = c1123fw;
        c1123fw.f5142k4.mo27432x1(new AbstractC0902di() { // from class: com.aspose.slides.Camera.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Camera.OnCameraChanged()";
            }

            @Override // com.aspose.slides.AbstractC0902di
            /* JADX INFO: renamed from: k4 */
            public void mo456k4() {
                Camera.this.m448m9();
            }
        });
    }

    /* JADX INFO: renamed from: du */
    public final float[] m449du() {
        if (m2138ix()) {
            return m454x1().m68937h4();
        }
        return null;
    }

    @Override // com.aspose.slides.ICamera
    public final int getCameraType() {
        if (m2138ix()) {
            return m454x1().m68938k4();
        }
        return -1;
    }

    @Override // com.aspose.slides.ICamera
    public final float getFieldOfViewAngle() {
        if (m2138ix()) {
            return m454x1().m68947x1();
        }
        return Float.NaN;
    }

    @Override // com.aspose.slides.ICamera
    public final float[] getRotation() {
        if (m2138ix()) {
            return m454x1().m68946to();
        }
        return null;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m454x1().m68936dy();
        }
        return 1L;
    }

    @Override // com.aspose.slides.ICamera
    public final float getZoom() {
        if (m2138ix()) {
            return m454x1().m68944kk();
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m450h4() {
        if (m2138ix()) {
            m2145uz();
            m454x1().m68945m9();
        }
    }

    @Override // com.aspose.slides.ICamera
    public final void setCameraType(int i) {
        m2141k4((Integer) (-1), Integer.valueOf(i));
        if (m2138ix()) {
            m454x1().m68941k4(i);
            m448m9();
        }
    }

    @Override // com.aspose.slides.ICamera
    public final void setFieldOfViewAngle(float f) {
        m2141k4(Float.valueOf(Float.NaN), Float.valueOf(f));
        if (m2138ix()) {
            m454x1().m68939k4(f);
            m448m9();
        }
    }

    @Override // com.aspose.slides.ICamera
    public final void setRotation(float f, float f2, float f3) {
        if (m2138ix() || !C14064he.m66715kk(f + f2 + f3)) {
            m2145uz();
            m454x1().m68940k4(f, f2, f3);
            m448m9();
        }
    }

    @Override // com.aspose.slides.ICamera
    public final void setZoom(float f) {
        m2141k4(Float.valueOf(Float.NaN), Float.valueOf(f));
        if (m2138ix()) {
            m454x1().m68948x1(f);
            m448m9();
        }
    }

    /* JADX INFO: renamed from: to */
    public final C1123fw m453to() {
        m2146wl();
        return this.f1246kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C14267p5 m454x1() {
        return (C14267p5) m2144u4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m451k4(ICamera iCamera) {
        if (m2138ix() || ((PVIObject) iCamera).m2138ix()) {
            m2145uz();
            m454x1().m68942k4((Camera) iCamera);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m452k4(ICameraEffectiveData iCameraEffectiveData) {
        m2145uz();
        m454x1().m68943k4(iCameraEffectiveData);
    }
}
