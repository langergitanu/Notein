package com.aspose.slides.internal.p016a8;

/* JADX INFO: renamed from: com.aspose.slides.internal.a8.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1308x1 {

    /* JADX INFO: renamed from: du */
    private C1307to f5764du;

    /* JADX INFO: renamed from: k4 */
    private int f5765k4;

    /* JADX INFO: renamed from: kk */
    private int f5766kk;

    /* JADX INFO: renamed from: to */
    private int f5767to;

    /* JADX INFO: renamed from: x1 */
    private int f5768x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.a8.x1$k4 */
    public interface k4 {
        /* JADX INFO: renamed from: k4 */
        void mo7794k4(int i, int i2, int i3, int i4, C1307to c1307to);
    }

    public C1308x1(int i, int i2, int i3, int i4, C1307to c1307to) {
        this.f5765k4 = i;
        this.f5768x1 = i2;
        this.f5766kk = i3;
        this.f5767to = i4;
        this.f5764du = c1307to;
    }

    /* JADX INFO: renamed from: k4 */
    public void m7793k4(k4 k4Var) {
        int i = 0;
        while (i < this.f5767to) {
            for (int i2 = 0; i2 < this.f5766kk; i2++) {
                k4Var.mo7794k4(i2, i, i2 + this.f5765k4, i + this.f5768x1, this.f5764du);
            }
            this.f5764du.mo7785x1();
            i++;
            k4Var = k4Var;
        }
    }
}
