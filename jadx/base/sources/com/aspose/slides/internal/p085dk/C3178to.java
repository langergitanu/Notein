package com.aspose.slides.internal.p085dk;

/* JADX INFO: renamed from: com.aspose.slides.internal.dk.to */
/* JADX INFO: loaded from: classes3.dex */
public class C3178to {

    /* JADX INFO: renamed from: k4 */
    private int f9447k4;

    /* JADX INFO: renamed from: kk */
    private int f9448kk;

    /* JADX INFO: renamed from: to */
    private byte[] f9449to;

    /* JADX INFO: renamed from: x1 */
    private int f9450x1;

    public C3178to(byte[] bArr) {
        this.f9449to = bArr;
        m13600du();
    }

    /* JADX INFO: renamed from: du */
    private void m13600du() {
        this.f9447k4 = 128;
        this.f9448kk = 0;
    }

    /* JADX INFO: renamed from: h4 */
    private void m13601h4() {
        this.f9449to[m13606to()] = (byte) this.f9448kk;
    }

    /* JADX INFO: renamed from: m9 */
    private boolean m13602m9() {
        return this.f9447k4 == 1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13603k4() {
        this.f9448kk += ((byte) this.f9447k4) & 255;
    }

    /* JADX INFO: renamed from: kk */
    public final void m13605kk() {
        if (this.f9447k4 == 128 || this.f9450x1 >= this.f9449to.length) {
            return;
        }
        m13601h4();
    }

    /* JADX INFO: renamed from: to */
    public final int m13606to() {
        return this.f9450x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m13607x1() {
        if (!m13602m9()) {
            this.f9447k4 >>= 1;
        } else {
            m13601h4();
            m13604k4(m13606to() + 1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13604k4(int i) {
        m13605kk();
        m13600du();
        this.f9450x1 = i;
    }
}
