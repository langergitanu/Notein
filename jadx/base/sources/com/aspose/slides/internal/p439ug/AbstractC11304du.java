package com.aspose.slides.internal.p439ug;

/* JADX INFO: renamed from: com.aspose.slides.internal.ug.du */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC11304du {

    /* JADX INFO: renamed from: k4 */
    protected int f38878k4;

    /* JADX INFO: renamed from: kk */
    protected long f38879kk;

    /* JADX INFO: renamed from: x1 */
    protected int f38880x1;

    /* JADX INFO: renamed from: k4 */
    public int mo54293k4() {
        return this.f38878k4;
    }

    /* JADX INFO: renamed from: kk */
    public void m54295kk() {
        this.f38878k4 = 0;
        this.f38880x1 = 0;
        this.f38879kk = 0L;
    }

    /* JADX INFO: renamed from: x1 */
    public int mo54296x1(int i) {
        return (int) (this.f38879kk & ((long) ((1 << i) - 1)));
    }

    /* JADX INFO: renamed from: k4 */
    public void mo54294k4(int i) {
        this.f38879kk >>= i;
        this.f38878k4 -= i;
    }

    /* JADX INFO: renamed from: x1 */
    public void mo54297x1() {
        int i = this.f38878k4;
        mo54294k4(i - (i & (-8)));
    }
}
