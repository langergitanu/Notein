package com.aspose.slides.internal.p159h0;

import com.aspose.slides.Collections.Generic.Queue;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.kp */
/* JADX INFO: loaded from: classes.dex */
final class C4454kp {

    /* JADX INFO: renamed from: k4 */
    private Queue<C4481wp> f12245k4;

    public C4454kp() {
        this.f12245k4 = new Queue<>();
        this.f12245k4 = new Queue<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final C4481wp m18242k4() {
        return this.f12245k4.dequeue();
    }

    public C4454kp(int i) {
        this.f12245k4 = new Queue<>();
        this.f12245k4 = new Queue<>(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18243k4(C4481wp c4481wp) {
        this.f12245k4.enqueue(c4481wp);
    }
}
