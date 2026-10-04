package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;

/* JADX INFO: loaded from: classes3.dex */
public final class Backdrop3DScene extends PVIObject implements IBackdrop3DScene {

    /* JADX INFO: renamed from: k4 */
    private final float[] f1038k4;

    public Backdrop3DScene(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f1038k4 = new float[]{0.0f, 0.0f, 0.0f};
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new C0905dl();
    }

    @Override // com.aspose.slides.IBackdrop3DScene
    public final float[] getAnchorPoint() {
        return m2138ix() ? m333x1().m5136x1() : (float[]) this.f1038k4.clone();
    }

    @Override // com.aspose.slides.IBackdrop3DScene
    public final float[] getNormalVector() {
        return m2138ix() ? m333x1().m5131k4() : this.f1038k4;
    }

    @Override // com.aspose.slides.IBackdrop3DScene
    public final float[] getUpVector() {
        return m2138ix() ? m333x1().m5133kk() : (float[]) this.f1038k4.clone();
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m333x1().m5134to();
        }
        return 1L;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m332k4(Backdrop3DScene backdrop3DScene) {
        if (m2138ix() || backdrop3DScene.m2138ix()) {
            m2145uz();
            if (backdrop3DScene.m2138ix()) {
                m333x1().m5129k4(backdrop3DScene);
            } else {
                m2140k4((Object) null);
            }
        }
    }

    @Override // com.aspose.slides.IBackdrop3DScene
    public final void setAnchorPoint(float[] fArr) {
        if (fArr == null || fArr.length < 3) {
            throw new ArgumentException();
        }
        if (!m2138ix() && (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f)) {
            m2145uz();
        }
        if (m2138ix()) {
            m333x1().m5135x1(fArr);
        }
    }

    @Override // com.aspose.slides.IBackdrop3DScene
    public final void setNormalVector(float[] fArr) {
        if (fArr == null || fArr.length < 3) {
            throw new ArgumentException();
        }
        if (!m2138ix() && (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f)) {
            m2145uz();
        }
        if (m2138ix()) {
            m333x1().m5130k4(fArr);
        }
    }

    @Override // com.aspose.slides.IBackdrop3DScene
    public final void setUpVector(float[] fArr) {
        if (fArr == null || fArr.length < 3) {
            throw new ArgumentException();
        }
        if (!m2138ix() && (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f)) {
            m2145uz();
        }
        if (m2138ix()) {
            m333x1().m5132kk(fArr);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C0905dl m333x1() {
        return (C0905dl) m2144u4();
    }
}
