package com.aspose.slides.internal.p205ji;

/* JADX INFO: renamed from: com.aspose.slides.internal.ji.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C5472x1 extends AbstractC5470v4 {
    public C5472x1(boolean z, int i) {
        this.f15048kk = z;
        this.f15049to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m22563k4() {
        synchronized (this.f15050x1) {
            this.f15048kk = false;
        }
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean mo22555x1() {
        synchronized (this.f15050x1) {
            this.f15048kk = true;
            this.f15050x1.notifyAll();
            m22561kk().countDown();
        }
        return true;
    }
}
