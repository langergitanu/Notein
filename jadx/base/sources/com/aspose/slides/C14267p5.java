package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: renamed from: com.aspose.slides.p5 */
/* JADX INFO: loaded from: classes3.dex */
final class C14267p5 {

    /* JADX INFO: renamed from: du */
    private final C1123fw f47991du;

    /* JADX INFO: renamed from: h4 */
    private long f47992h4;

    /* JADX INFO: renamed from: k4 */
    private float f47993k4 = Float.NaN;

    /* JADX INFO: renamed from: x1 */
    private float f47996x1 = Float.NaN;

    /* JADX INFO: renamed from: kk */
    private int f47994kk = -1;

    /* JADX INFO: renamed from: to */
    private float[] f47995to = null;

    public C14267p5(C1123fw c1123fw) {
        this.f47991du = c1123fw;
    }

    /* JADX INFO: renamed from: c5 */
    private void m68934c5() {
        this.f47992h4++;
    }

    /* JADX INFO: renamed from: du */
    public final C1123fw m68935du() {
        return this.f47991du;
    }

    /* JADX INFO: renamed from: dy */
    public final long m68936dy() {
        return this.f47992h4;
    }

    public boolean equals(Object obj) {
        Camera camera = (Camera) C7019kk.m27452k4(obj, Camera.class);
        if (camera == null) {
            return super.equals(obj);
        }
        float[] fArrM449du = camera.m449du();
        float[] fArr = this.f47995to;
        if ((fArr == null && fArrM449du != null) || (fArr != null && fArrM449du == null)) {
            return false;
        }
        if (fArr != null && fArrM449du != null) {
            if (fArr.length == fArrM449du.length) {
                int i = 0;
                while (true) {
                    float[] fArr2 = this.f47995to;
                    if (i >= fArr2.length) {
                        break;
                    }
                    if (fArr2[i] != fArrM449du[i]) {
                        return false;
                    }
                    i++;
                }
            } else {
                return false;
            }
        }
        return this.f47993k4 == camera.getFieldOfViewAngle() && this.f47996x1 == camera.getZoom() && this.f47994kk == camera.getCameraType();
    }

    /* JADX INFO: renamed from: h4 */
    public final float[] m68937h4() {
        return this.f47995to;
    }

    public int hashCode() {
        return 23456;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m68938k4() {
        return this.f47994kk;
    }

    /* JADX INFO: renamed from: kk */
    public final float m68944kk() {
        return this.f47996x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m68945m9() {
        this.f47995to = null;
        m68941k4(-1);
        this.f47993k4 = Float.NaN;
        this.f47996x1 = Float.NaN;
        m68934c5();
    }

    /* JADX INFO: renamed from: to */
    public final float[] m68946to() {
        float[] fArr = this.f47995to;
        if (fArr != null) {
            return (float[]) fArr.clone();
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m68947x1() {
        return this.f47993k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68939k4(float f) {
        this.f47993k4 = f;
        m68934c5();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m68948x1(float f) {
        this.f47996x1 = f;
        m68934c5();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68940k4(float f, float f2, float f3) {
        if (C14064he.m66715kk(f + f2 + f3)) {
            this.f47995to = null;
        } else {
            if (this.f47995to == null) {
                this.f47995to = new float[3];
            }
            float[] fArr = this.f47995to;
            fArr[0] = f;
            fArr[1] = f2;
            fArr[2] = f3;
        }
        m68934c5();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68941k4(int i) {
        this.f47994kk = i;
        m68935du().m6339x1(true);
        m68934c5();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68942k4(Camera camera) {
        this.f47995to = camera.getRotation();
        m68941k4(camera.getCameraType());
        this.f47993k4 = camera.getFieldOfViewAngle();
        this.f47996x1 = camera.getZoom();
        m68934c5();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68943k4(ICameraEffectiveData iCameraEffectiveData) {
        this.f47995to = iCameraEffectiveData.getRotation();
        m68941k4(iCameraEffectiveData.getCameraType());
        this.f47993k4 = iCameraEffectiveData.getFieldOfViewAngle();
        this.f47996x1 = iCameraEffectiveData.getZoom();
        m68934c5();
    }
}
