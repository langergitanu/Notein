package com.aspose.slides;

import com.aspose.slides.exceptions.OperationCanceledException;

/* JADX INFO: loaded from: classes3.dex */
public class InterruptionToken implements IInterruptionToken {

    /* JADX INFO: renamed from: k4 */
    private static final InterruptionToken f2571k4 = new InterruptionToken(null);

    /* JADX INFO: renamed from: x1 */
    private final InterruptionTokenSource f2572x1;

    public InterruptionToken(InterruptionTokenSource interruptionTokenSource) {
        this.f2572x1 = interruptionTokenSource;
    }

    public static InterruptionToken getNone() {
        return f2571k4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m1843k4() {
        throw new OperationCanceledException();
    }

    @Override // com.aspose.slides.IInterruptionToken
    public final boolean isInterruptionRequested() {
        InterruptionTokenSource interruptionTokenSource = this.f2572x1;
        return interruptionTokenSource != null && interruptionTokenSource.isInterruptionRequested();
    }

    @Override // com.aspose.slides.IInterruptionToken
    public final void throwIfInterruptionRequested() {
        if (isInterruptionRequested()) {
            m1843k4();
        }
    }
}
