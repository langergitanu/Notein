package com.aspose.slides.internal.p472w8;

/* JADX INFO: renamed from: com.aspose.slides.internal.w8.x1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11911x1 {

    /* JADX INFO: renamed from: k4 */
    boolean f40118k4;

    /* JADX INFO: renamed from: kk */
    private float[] f40119kk;

    /* JADX INFO: renamed from: x1 */
    private float[] f40120x1;

    public C11911x1() {
        this.f40118k4 = false;
        this.f40120x1 = new float[1];
        this.f40119kk = new float[1];
    }

    /* JADX INFO: renamed from: k4 */
    public void m55741k4() {
        this.f40118k4 = true;
    }

    /* JADX INFO: renamed from: kk */
    public void m55743kk(float[] fArr) {
        this.f40119kk = fArr;
    }

    /* JADX INFO: renamed from: to */
    public void m55745to(float[] fArr) {
        this.f40120x1 = fArr;
    }

    /* JADX INFO: renamed from: x1 */
    public void m55746x1(float[] fArr) {
        if (this.f40118k4) {
            return;
        }
        this.f40120x1 = fArr;
    }

    public C11911x1(int i) {
        this.f40118k4 = false;
        this.f40120x1 = new float[i];
        this.f40119kk = new float[i];
    }

    /* JADX INFO: renamed from: k4 */
    public void m55742k4(float[] fArr) {
        if (this.f40118k4) {
            return;
        }
        this.f40119kk = fArr;
    }

    /* JADX INFO: renamed from: kk */
    public float[] m55744kk() {
        return this.f40120x1;
    }

    /* JADX INFO: renamed from: x1 */
    public float[] m55747x1() {
        return this.f40119kk;
    }
}
