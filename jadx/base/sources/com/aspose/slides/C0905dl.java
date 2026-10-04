package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3067kp;

/* JADX INFO: renamed from: com.aspose.slides.dl */
/* JADX INFO: loaded from: classes3.dex */
final class C0905dl {

    /* JADX INFO: renamed from: to */
    private long f4605to;

    /* JADX INFO: renamed from: k4 */
    private C3067kp f4603k4 = new C3067kp(0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: x1 */
    private C3067kp f4606x1 = new C3067kp(0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: kk */
    private C3067kp f4604kk = new C3067kp(0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: du */
    private void m5128du() {
        this.f4605to++;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5129k4(Backdrop3DScene backdrop3DScene) {
        this.f4606x1 = new C3067kp(backdrop3DScene.getAnchorPoint()[0], backdrop3DScene.getAnchorPoint()[1], backdrop3DScene.getAnchorPoint()[2]);
        this.f4603k4 = new C3067kp(backdrop3DScene.getNormalVector()[0], backdrop3DScene.getNormalVector()[1], backdrop3DScene.getNormalVector()[2]);
        this.f4604kk = new C3067kp(backdrop3DScene.getUpVector()[0], backdrop3DScene.getUpVector()[1], backdrop3DScene.getUpVector()[2]);
        m5128du();
    }

    /* JADX INFO: renamed from: kk */
    public final void m5132kk(float[] fArr) {
        C3067kp c3067kp = new C3067kp(fArr[0], fArr[1], fArr[2]);
        this.f4604kk = c3067kp;
        c3067kp.m12961x1();
        m5128du();
    }

    /* JADX INFO: renamed from: to */
    public final long m5134to() {
        return this.f4605to;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m5135x1(float[] fArr) {
        this.f4606x1 = new C3067kp(fArr[0], fArr[1], fArr[2]);
        m5128du();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5130k4(float[] fArr) {
        C3067kp c3067kp = new C3067kp(fArr[0], fArr[1], fArr[2]);
        this.f4603k4 = c3067kp;
        c3067kp.m12961x1();
        m5128du();
    }

    /* JADX INFO: renamed from: kk */
    public final float[] m5133kk() {
        C3067kp c3067kp = this.f4604kk;
        return new float[]{c3067kp.f9107k4, c3067kp.f9109x1, c3067kp.f9108kk};
    }

    /* JADX INFO: renamed from: x1 */
    public final float[] m5136x1() {
        C3067kp c3067kp = this.f4606x1;
        return new float[]{c3067kp.f9107k4, c3067kp.f9109x1, c3067kp.f9108kk};
    }

    /* JADX INFO: renamed from: k4 */
    public final float[] m5131k4() {
        C3067kp c3067kp = this.f4603k4;
        return new float[]{c3067kp.f9107k4, c3067kp.f9109x1, c3067kp.f9108kk};
    }
}
