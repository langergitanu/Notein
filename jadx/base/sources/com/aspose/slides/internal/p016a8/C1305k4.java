package com.aspose.slides.internal.p016a8;

/* JADX INFO: renamed from: com.aspose.slides.internal.a8.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1305k4 {

    /* JADX INFO: renamed from: du */
    private C1306kk f5745du;

    /* JADX INFO: renamed from: h4 */
    private C1307to f5746h4;

    /* JADX INFO: renamed from: k4 */
    private int f5747k4;

    /* JADX INFO: renamed from: kk */
    private int f5748kk;

    /* JADX INFO: renamed from: to */
    private int f5749to;

    /* JADX INFO: renamed from: x1 */
    private int f5750x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.a8.k4$k4 */
    public interface k4 {
        /* JADX INFO: renamed from: k4 */
        void mo7787k4(C1306kk c1306kk, C1307to c1307to);
    }

    public C1305k4(int i, int i2, int i3, int i4, C1306kk c1306kk, C1307to c1307to) {
        this.f5747k4 = i;
        this.f5750x1 = i2;
        this.f5748kk = i3;
        this.f5749to = i4;
        this.f5745du = c1306kk;
        this.f5746h4 = c1307to;
    }

    /* JADX INFO: renamed from: k4 */
    public void m7786k4(k4 k4Var) {
        for (int i = 0; i < this.f5749to; i++) {
            for (int i2 = 0; i2 < this.f5748kk; i2++) {
                k4Var.mo7787k4(this.f5745du, this.f5746h4);
            }
            this.f5745du.m7792x1();
            this.f5746h4.mo7785x1();
        }
    }
}
