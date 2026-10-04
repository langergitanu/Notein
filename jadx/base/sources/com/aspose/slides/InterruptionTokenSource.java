package com.aspose.slides;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class InterruptionTokenSource {

    /* JADX INFO: renamed from: k4 */
    private AtomicReference<Integer> f2573k4 = new AtomicReference<>(0);

    public final InterruptionToken getToken() {
        return new InterruptionToken(this);
    }

    public final void interrupt() {
        if (isInterruptionRequested()) {
            return;
        }
        int iIntValue = this.f2573k4.get().intValue();
        AtomicReference<Integer> atomicReference = this.f2573k4;
        while (!atomicReference.compareAndSet(0, 1) && atomicReference.get() == 0) {
        }
        if (iIntValue == 0) {
            this.f2573k4.getAndSet(2);
        }
    }

    public final boolean isInterruptionRequested() {
        return this.f2573k4.get().intValue() >= 1;
    }
}
