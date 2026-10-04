package com.aspose.slides.internal.p071cz;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.v6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2935v6 extends AbstractC2718ew {

    /* JADX INFO: renamed from: du */
    private C2654ae f8785du;

    /* JADX INFO: renamed from: k4 */
    private final C2671bp f8786k4 = new C2671bp();

    /* JADX INFO: renamed from: kk */
    private boolean f8787kk = true;

    /* JADX INFO: renamed from: to */
    private int f8788to = 0;

    /* JADX INFO: renamed from: x1 */
    private final int f8789x1;

    public AbstractC2935v6(int i) {
        this.f8789x1 = i;
    }

    /* JADX INFO: renamed from: du */
    public C2654ae m12573du() {
        return this.f8785du;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12574k4(int i) {
        this.f8788to = i;
    }

    /* JADX INFO: renamed from: kk */
    public boolean m12578kk() {
        return this.f8787kk;
    }

    /* JADX INFO: renamed from: to */
    public int m12579to() {
        return this.f8788to;
    }

    /* JADX INFO: renamed from: x1 */
    public C2671bp m12580x1() {
        return this.f8786k4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12575k4(C2654ae c2654ae) {
        this.f8785du = c2654ae;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12576k4(AbstractC2935v6 abstractC2935v6) {
        abstractC2935v6.m12580x1().m12137x1();
        for (int i = 0; i < m12580x1().m12134k4(); i++) {
            abstractC2935v6.m12580x1().m12136k4(m12580x1().m12135k4(i).cloneT());
        }
        abstractC2935v6.m12577k4(m12578kk());
        abstractC2935v6.m12574k4(m12579to());
        abstractC2935v6.m12575k4(m12573du() != null ? m12573du().cloneT() : null);
    }

    /* JADX INFO: renamed from: k4 */
    public void m12577k4(boolean z) {
        this.f8787kk = z;
    }
}
